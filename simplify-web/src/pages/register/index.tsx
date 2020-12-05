import React, { FormEvent, useState } from 'react';
import './styles.css';
import { Link, useHistory } from 'react-router-dom';

import Input from '../../components/input';
import Button from '../../components/button';
import api from '../../Service/api';
import { endpoints } from '../../Service/endpoints';

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
        api.post(endpoints.register, {
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
        <div className="cadastro-conteiner">
            <div className="form-container">
                <div className="row">
                    <div className="col-12 form-title">
                        <h3>Estamos muito felizes por ter você como cliente</h3>
                        <i className="fas fa-circle"></i>
                        {/* Ou image */}
                        <h4>O primeiro passo para escapar da alta burocratização é preenchendo este pequeno formulario</h4>
                    </div>
                </div>
                <form onSubmit={cadastro}>
                    <Input classe="inp" name="nome" label="Seu nome" onChange={e => setNome(e.target.value)} placehold="Example: Matheus"></Input>
                    <Input classe="inp" name="Sobrenome" label="Seu Sobrenome" onChange={e => setSobrenome(e.target.value)} placehold="Example: Candido"></Input>
                    <Input classe="inp" name="nome" label="Sua data de nascimento: (dd/mm/yyyy)" onChange={e => setDataNascimento(e.target.value)} placehold="28/07/2001"></Input>
                    <Input classe="inp" name="nome" label="Seu email" onChange={e => setEmail(e.target.value)} placehold="Example: matheus@simplify.com"></Input>
                    <Input classe="inp" name="password" label="Sua password" type="password" onChange={e => setPassword(e.target.value)} placehold="********"></Input>
                    <div className="btn-container">
                        <Button title="Concluir Registro" type="submit" classe=" btn " />
                    </div>
                </form>
            </div>
        </div>
    )
}
export default Cadastro;


