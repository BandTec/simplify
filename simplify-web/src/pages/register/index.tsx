import React, { FormEvent, useState } from 'react';
import './styles.css';
import { Link, useHistory } from 'react-router-dom';

import warningIcon from '../../assets/icons/warning.svg'

import Input from '../../components/input';
import api from '../../Service/api';
import PageHeader from '../../components/page-header';

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
        <div id="page-teacher-form" className="container">
            <PageHeader title="Que Incrivel que você está escapando da alta burocratização !!!"

            />

            <main>
                <fieldset>
                    <legend>Seus dados</legend>
                    <Input name="name" label="Seu primeiro nome" onChange={(e => { setNome(e.target.value) })} />
                    <Input name="sobrenome" label="Seu sobrenome " onChange={(e => { setSobrenome(e.target.value) })} />
                    <Input name="data" label="Sua Data de nascimento" type="date" onChange={(e => { setDataNascimento(e.target.value) })} />
                </fieldset>
                <fieldset>
                    <legend>Seus dados para acesso</legend>
                    <Input name="name" label="Seu email " type="email" onChange={(e => { setEmail(e.target.value) })} />
                    <Input name="whatsapp" label="Sua senha" type="password" onChange={(e => { setPassword(e.target.value) })} />
                </fieldset>
                <form onSubmit={cadastro}>
                    <footer>
                        <p >
                            <img src={warningIcon} alt="Aviso Importante" />
                Importante !
                Preencha todos os dados
            </p>
                        <button type="submit">
                            finalizar cadastro
            </button>
                    </footer>
                </form>
            </main>
        </div>
    )
}
export default Cadastro;


