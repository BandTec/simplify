import React from 'react';
import Card from '../../components/card-service';
import servicos from '../../mocks/services/mock-service';

import './styles.css'
import PageHeader from '../../components/page-header';

function Servicos() {
    return (
        <div className="container-service">
            <PageHeader title="Acompanhe aqui uma listinha com todos os nossos serviços" />
            <div className="container-content">
                {/* Componente do modal aplicado */}
                <div className="card-container">
                    {servicos.map((item: { title: string; descricao: string; documentos: string; isPresencial: boolean; horario: string }) => {
                        return (
                            <Card
                                title={item.title}
                                descricao={item.descricao}
                                documento={item.documentos}
                                isPresencial={item.isPresencial}
                                horario={item.horario}
                            />
                        )
                    })}
                </div>
            </div>
            {/* <div className="inp-container">
                <Input classe="inp" labelStyle="label-inp" label="Documento" name="doc" placehold="Qual documento você procura" />
                <Input classe="inp" labelStyle="label-inp" label="Estado" name="doc" placehold="Qual seu estado" />
                <Input classe="inp" labelStyle="label-inp" label="Cidade" name="doc" placehold="Qual sua cidade" />
            </div>
            <div className="btn-container">
                <Button title="Pesquisar" classe="btn" />
            </div> */}
        </div>
    )
}

export default Servicos;