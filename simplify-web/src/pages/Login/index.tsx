import React, { FormEvent, useState } from 'react';
import './styles.css'

import Input from '../../components/input';
import { useHistory } from 'react-router-dom';
import api from '../../Service/api';


function Login() {


    const history = useHistory();

    const [email, setEmail] = useState('');
    const [senha, setSenha] = useState('');


    function loginConect(e: FormEvent) {
        e.preventDefault();


        api.post("/login", {
            email,
            senha
        }).then(res => {
            history.push('/services')
        }).catch(() => {
            alert("Email ou senha invalidos")
        })
    }

    return (
        <div className="login-conteiner">
            <div className="signupSection">
                <div className="info">
                    <h2>Seja bem vindo a Simplify</h2>
                    <i className="icon ion-ios-ionic-outline" aria-hidden="true"></i>
                    <p>O fim da alta burocratização está aqui</p>
                </div>
                <form onSubmit={loginConect} className="signupForm" name="signupform">
                    <h2>Login simplify</h2>
                    <ul className="noBullet">
                        <li>
                            <Input name="email" onChange={e => setEmail(e.target.value)} placehold="" type="email" label="Email cadastrado" />
                        </li>
                        <li>
                            <Input name="senha" onChange={e => setSenha(e.target.value)} placehold="****" type="password" label="Senha" />
                        </li>
                        <li id="center-btn">
                            <input type="submit" id="join-btn" name="join" alt="Join" />
                        </li>
                    </ul>
                </form>
            </div>
        </div>

    )
}

export default Login;