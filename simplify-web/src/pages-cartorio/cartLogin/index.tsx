import React, { FormEvent, useState } from 'react'
import { useHistory } from 'react-router-dom';


import Input from '../../components/input'
import PageHeader from '../../components/page-header'



import warningIcon from '../../assets/icons/warning.svg'
import api from '../../Service/api'


export function CartLogin() {

    const history = useHistory()

    const [cnpj, setCnpj] = useState("");
    const [senha, setSenha] = useState("");


    function loginConecta(e: FormEvent) {
        e.preventDefault()

        api.post("/cartorio/login", {
            cnpj,
            senha
        }).then(
            res => {
                if (res.status === 200) {
                    console.log(res)
                    history.push("/cart/home")
                } else {
                    alert(`Login ou senha invalidos, tente novamente`)
                }
            }
        )
    }

    return (
        <div id="page-teacher-form" className="container">
            <PageHeader endereco="/" title="Sejá bem vindo!!!"

            />
            <main>
                <form onSubmit={loginConecta}>
                    <fieldset>
                        <legend>Seus dados</legend>
                        <Input type="text" name="cnpj" placeholder="xxx" onChange={(e => { setCnpj(e.target.value) })} label="CNPJ" />
                        <Input name="senha" onChange={(e => { setSenha(e.target.value) })} type="password" label="Senha" />
                    </fieldset>
                    <footer>
                        <p >
                            <img src={warningIcon} alt="Aviso Importante" />Importante ! Preencha todos os campos
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