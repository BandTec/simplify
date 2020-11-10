import React from 'react';
import './styles.css'

import Input from '../../components/input';
import Button from '../../components/button';


function login() {
    return (
        <div className="login-conteiner">
            <div className="form-container">
                <div className="title-login">
                    <h3> Seja bem-vindo!</h3>
                    <h1>Para começar a utilizar nossos serviços precisamos que <br></br> faça login no nosso sistema</h1>
                </div>

                <Input labelStyle="label-inp-white login " classe="inp-form login-inp" name="CPF" label="CPF" placehold="000.000.000-00"></Input>
                <Input labelStyle="label-inp-white  login" classe="inp-form login-inp" name="Senha" label="Senha" placehold="******"></Input>
                <a href="">Esqueci minha senha</a>
                <Button title="Fazer login" classe=" btn btn-recaregar"/>
            </div>
            <div className="conteiner-img">
                <div className="div-img"></div>
            </div>
        </div>

    )
}

export default login;