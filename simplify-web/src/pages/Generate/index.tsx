import React from 'react'
import Button from '../../components/button';
import Input from '../../components/input';
import Upload from '../../components/upload';

import './styles.css'

function Generate() {
    return (
        <div className="generate-container">
            <div className="text-container">
                <h3>Estamos felizes por utilizar nosso sistema</h3>
                <p>O primeiro passo para gerar sua assinatura é preencher este formulario</p>
            </div>
            <div className="form-container">
                <div className="input-container">
                    <Input labelStyle="label-inp-black" classe="inp-form" name="Nome" label="Seu nome" placehold="Nome" />
                    <Input labelStyle="label-inp-black" classe="inp-form" name="Nome" label="Seu email" placehold="example@example.com" />
                    <Input labelStyle="label-inp-black" classe="inp-form" name="Nome" label="Seu CPF" placehold="xxx.xxx.xxx-xx" />

                    <Upload />

                </div>
                <Button classe="btn" title="Gerar" />
            </div>
        </div>
    )
}

export default Generate;