import React from 'react';
import Button from '../../components/button';
import Card from '../../components/card-service';
import Input from '../../components/input';

import './styles.css'

function Servicos() {
    return (
        <div className="container-service">
            <div className="inp-container">
                <Input classe="inp" labelStyle="label-inp" label="Documento" name="doc" placehold="Qual documento você procura" />
                <Input classe="inp" labelStyle="label-inp" label="Estado" name="doc" placehold="Qual seu estado" />
                <Input classe="inp" labelStyle="label-inp" label="Cidade" name="doc" placehold="Qual sua cidade" />
            </div>
            <div className="btn-container">
                <Button title="Pesquisar" classe="btn" />
            </div>
            <div className="card-container">
                <Card title="Documento" />
            </div>
        </div>
    )
}

export default Servicos;