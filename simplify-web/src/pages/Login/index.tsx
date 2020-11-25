import React, { FormEvent, useState } from 'react';
import './styles.css'

import Input from '../../components/input';
import Button from '../../components/button';
import { Link, useHistory } from 'react-router-dom';
import api from '../../Service/api';


function Login() {

    const history = useHistory();

    const [email, setEmail] = useState('');
    const [senha, setSenha] = useState('');

    function loginConect(e: FormEvent) {
        e.preventDefault();

        api.post("/user/login", {
            email,
            senha
        }).then(res => {
            if (res.data) {
                alert(`Login Efetuado seja bem vindo(a)`)
                history.push('/services')
            }
        }).catch(() => {
            alert("Email ou senha invalidos")
        })
    }

    console.log(email, senha)

    return (
        <div className="login-conteiner">
            <div className="form-container">
                <div className="title-login">
                    <h3> Seja bem-vindo!</h3>
                    <h1>Para começar a utilizar nossos serviços precisamos que <br></br> faça login no nosso sistema</h1>
                </div>
                <form onSubmit={loginConect}>
                    <Input labelStyle="label-inp-white login " onChange={e => setEmail(e.target.value)} classe="inp-form login-inp" name="email" label="Email" placehold="simplify@example.com"></Input>
                    <Input labelStyle="label-inp-white  login" type="password" onChange={e => setSenha(e.target.value)} classe="inp-form login-inp" name="enha" label="Senha" placehold="******"></Input>
                    <Link to="">Esqueci minha senha</Link>
                    <Button title="Fazer login" type="submit" classe=" btn btn-recaregar" />
                </form>
            </div>
            <div className="conteiner-img">
                <div className="div-img"></div>
            </div>
        </div>

    )
}

export default Login;