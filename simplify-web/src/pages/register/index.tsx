import React, { FormEvent, useState } from 'react';
import './styles.css';
import { Link, useHistory } from 'react-router-dom';

import Input from '../../components/input';
import Button from '../../components/button';
import api from '../../Service/api';

function Cadastro() {

    const history = useHistory();

    const [nome, setNome] = useState('');
    const [CPF, setCPF] = useState('');
    const [RG, setRg] = useState('');
    const [UF, setUF] = useState('');
    const [dataNas, setDataNas] = useState('');
    const [senha, setSenha] = useState('');

    function cadastro(e: FormEvent) {
        e.preventDefault();

        //adcionar endereço de post de novos usuarios 
        api.post("", {
            nome,
            CPF,
            RG,
            UF,
            dataNas,
            senha
        }).then(res => {
            if (res.status === 201) {
                alert(`Sejá bem vindo ${nome}, seu cadastro foi efetuado com sucesso`)
                history.push("/home");
            }
        }).catch(() => {
            alert(`Erro ao cadastrar`)
        })

    }

    return (
        <div className="cadastro-conteiner">
            <div className="conteiner-img cadastro-con">
                <div className="div-img cadastro-img"></div>
            </div>

            <div className="form-container cadastro-form">
                <div className="title-cad">
                    <h3> Estamos felizes em ter você <br /> como usuario </h3>
                    <h1>O primeiro passo é preencher este formulario</h1>
                </div>
                <div>
                    <form onSubmit={cadastro}>
                        <Input labelStyle="label-inp-white cad" onChange={e => setNome(e.target.value)} classe="inp-form nome-cad" name="nome" label="Nome" placehold=""></Input>
                        <Input labelStyle="label-inp-white cad" onChange={e => setCPF(e.target.value)} classe="inp-form cadastro-inp" name="CPF" label="CPF" placehold="000.000.000-00"></Input>
                        <div className="input-rg">
                            <Input labelStyle="label-inp-white cad" onChange={e => setRg(e.target.value)} classe="inp-form cadastro-inp" name="RG" label="RG" placehold="00-000-000-0"></Input>
                            <Input labelStyle="label-inp-white cad" onChange={e => setUF(e.target.value)} classe="inp-form uf-inp" name="Uf" label="UF" placehold="SP"></Input>
                        </div>

                        <Input labelStyle="label-inp-white cad" onChange={e => setDataNas(e.target.value)} classe="inp-form cadastro-inp" name="dataNas" label="Data De Nascimento" placehold="--/--/----"></Input>
                        <Input labelStyle="label-inp-white cad" onChange={e => setSenha(e.target.value)} classe="inp-form cadastro-inp" name="Senha" label="Senha" placehold="Digite uma senha"></Input>
                        <Input labelStyle="label-inp-white cad" classe="inp-form cadastro-inp" name="ConfirmaSenha" label="Confirmar Senha" placehold="Digite sua senha novamente"></Input>
                        <Button title="Proximo passo" type="submit" classe=" btn btn-passo" />
                    </form>

                </div>

            </div>

        </div>
    )
}
export default Cadastro;


