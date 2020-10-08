import React from 'react';
import Button from '../../components/button';
import Input from '../../components/input';

import './styles.css'

function Servicos() {
    return (
        <div className="container-service">
            <div className="inp-container">
                <Input label="Documento" name="doc" placehold="Qual documento você procura" />
                <Input label="Estado" name="doc" placehold="Qual seu estado" />
                <Input label="Cidade" name="doc" placehold="Qual sua cidade" />
            </div>
            <div className="btn-container">
                <Button title="Pesquisar" classe="btn" />
            </div>
        </div>
    )
}

export default Servicos;