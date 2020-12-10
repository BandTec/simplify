import React, { FormEvent, useEffect, useState } from 'react';
import './styles.css'

import Input from '../../components/input';
import { useHistory } from 'react-router-dom';
import api from '../../Service/api';
import PageHeader from '../../components/page-header';

import warningIcon from '../../assets/icons/warning.svg'



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
            if (res.status === 200) {
                localStorage.setItem('idUser', res.data)
                history.push('/profile')
            }
        }).catch(e => {
            console.log(e)
            alert("Email ou senha invalidos")
        })
    }

    useEffect(() => {
        api.get("/verificar").then(res => {
            if (!res.data) {
                return history.push("/profile")
            } else {
                return;
            }
        })
    }
    )

    return (
        <div id="page-teacher-form" className="container">
            <PageHeader title="Que Incrivel ver você novamente !!!"

            />
            <main>
                <form onSubmit={loginConect}>
                    <fieldset>
                        <legend>Seus dados</legend>
                        <Input name="email" onChange={(e => { setEmail(e.target.value) })} label="Email" />
                        <Input name="senha" onChange={(e => { setSenha(e.target.value) })} type="password" label="Senha" />
                    </fieldset>
                    <footer>
                        <p >
                            <img src={warningIcon} alt="Aviso Importante" />
                    Importante ! Preencha todos os campos
                    </p>
                        <button type="submit">
                            Efetuar Login
                   </button>
                    </footer>
                </form>
            </main>
        </div>
    )
}

export default Login;