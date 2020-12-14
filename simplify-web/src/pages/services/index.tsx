import React from 'react';
import Card from '../../components/card-service';
import servicos from '../../mocks/services/mock-service';

import './styles.css'
import PageHeader from '../../components/page-header';
import Modal from '../../components/modal';

function Servicos() {
    return (
        <div className="container-service">
            <PageHeader title="Acompanhe aqui uma listinha com todos os nossos serviços" />
            <div className="container-content">
                {/* Componente do modal aplicado */}
                {servicos.map((item: { id: string, title: string; descricao: string; documentos: string; isPresencial: boolean; }) => {
                    return (
                        <Modal
                            id={`${item.id}`}
                            key={item.id}
                            titulo="Escolha seu horário"
                            conteudo="Horários disponíveis"
                            botao="Continuar"
                            visibilidadeBotao={true}
                        />
                    )
                })}
                <h1>Serviços</h1>
                <div className="card-container">
                    {servicos.map((item: { id: string, title: string; descricao: string; documentos: string; isPresencial: boolean; horario: string }) => {
                        return (
                            <Card
                                id={item.id}
                                key={item.id}
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
        </div>
    )
}

export default Servicos;