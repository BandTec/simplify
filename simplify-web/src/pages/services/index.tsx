import React from 'react';
import Button from '../../components/button';
import Card from '../../components/card-service';
import Input from '../../components/input';
import servicos from '../../mocks/services/mock-service';

import './styles.css'

function Servicos() {
    return (
        <div className="container-service">
            <div className="container-content">
                <h1>Serviços</h1>
                <div className="card-container">
                {servicos.map( (item: { title: string; descricao: string; documentos: string; isPresencial: boolean; }) => {
            return (
                <Card
                    title={item.title}
                    descricao={item.descricao}
                    documento={item.documentos}
                    isPresencial={item.isPresencial}
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