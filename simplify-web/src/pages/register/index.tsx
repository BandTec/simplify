import React from 'react';
import './styles.css';
import { Link } from 'react-router-dom';

import Input from '../../components/input';
import Button from '../../components/button';

function cadastro() {
    return (
        <div className="cadastro-conteiner">
            <div className="conteiner-img cadastro-con">
                <div className="div-img cadastro-img"></div>
            </div>

            <div className="form-container cadastro-form">
                <div className="title-login">
                    <h3> Estamos felizes em ter você <br /> como usuario </h3>
                    <h1>O primeiro passo é preencher este formulario</h1>
                </div>
                <div>
                    <Input labelStyle="label-inp-white" classe="inp-form nome-cad" name="nome" label="Nome" placehold=""></Input>
                    <Input labelStyle="label-inp-white" classe="inp-form cadastro-inp" name="CPF" label="CPF" placehold="000.000.000-00"></Input>
                    <div className="input-rg">
                        <Input labelStyle="label-inp-white" classe="inp-form cadastro-inp" name="RG" label="RG" placehold="00-000-000-0"></Input>
                        <Input labelStyle="label-inp-white" classe="inp-form uf-inp" name="Uf" label="UF" placehold="SP"></Input>
                    </div>

                    <Input labelStyle="label-inp-white" classe="inp-form cadastro-inp" name="dataNas" label="Data De Nascimento" placehold="--/--/----"></Input>
                    <Button title="Proximo passo" classe=" btn btn-passo" />
                   
                   
                </div>

            </div>

        </div>
    )
}
export default cadastro;


