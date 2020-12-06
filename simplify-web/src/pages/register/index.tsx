import React, { FormEvent, useState } from 'react';
import './styles.css';
import { Link, useHistory } from 'react-router-dom';

import Input from '../../components/input';
import api from '../../Service/api';

function Cadastro() {

    const history = useHistory();

    const [nome, setNome] = useState('');
    const [sobrenome, setSobrenome] = useState('');

    const [dataNascimento, setDataNascimento] = useState('');

    const [email, setEmail] = useState('');

    const [password, setPassword] = useState('');


    function cadastro(e: FormEvent) {
        e.preventDefault();

        //adcionar endereço de post de novos usuarios 
        api.post('/cadastro', {
            nome,
            sobrenome,
            dataNascimento,
            email,
            password
        }).then(res => {
            if (res.status === 201) {
                alert(`Sejá bem vindo ${nome}, seu cadastro foi efetuado com sucesso`)
                history.push("/home");
            }
        }).catch(e => {
            console.log(e)
            alert(`Erro ao cadastrar`)
        })

    }

    return (
        <div className="login-conteiner">
            <div className="signupSection">
                <form onSubmit={cadastro} className="signupForm" name="signupform">
                    <h2>Cadastro simplify</h2>
                    <ul className="noBullet">
                        <li>
                            <Input name="Nome" maxLength={15} onChange={e => setNome(e.target.value)} placehold="NOME" label="Seu nome" />
                            <Input name="Sobrenome" maxLength={15} onChange={e => setSobrenome(e.target.value)} placehold="SOBRENOME" label="Seu sobrenome" />
                        </li>
                        <li>
                            <Input name="data" 
                                maxLength={10}
                                onChange={e => setDataNascimento(e.target.value)}
                                placehold="dd/mm/yyyy"
                                label="Data nascimento" />
                        </li>
                        <li>
                            <Input name="email" maxLength={60} onChange={e => setEmail(e.target.value)} type="email" label="Email" placehold="" />
                            <Input name="senha" maxLength={10} onChange={e => setPassword(e.target.value)} placehold="****" type="password" label="Senha" />
                        </li>
                        <li id="center-btn">
                            <input type="submit" id="join-btn" name="join" alt="Join" />
                        </li>
                    </ul>
                </form>
                <div className="info">
                    <h2>Seja bem vindo a Simplify</h2>
                    <i className="icon ion-ios-ionic-outline" aria-hidden="true"></i>
                    <p>O fim da alta burocratização está aqui, o primeiro passo é preencher este pequeno formulario </p>

                    <Link to="login">Já possuo cadastro</Link>
                </div>
            </div>
        </div>
    )
}
export default Cadastro;


