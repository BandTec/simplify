import React, { useState } from 'react'
import Input from '../../components/input'
import Select from '../../components/Select'
import PageHeader from '../../components/page-header'
import Textarea from '../../components/TextArea'

import warningIcon from '../../assets/icons/warning.svg'
import api from '../../Service/api'
import apiServicos from '../../Service/apiServicos'


export interface Service {
    name: string;
    descricao: string;
    documento: string;
    isPresencial: boolean;
    horario: string
}

export function CadServices() {

    const [nome, setNome] = useState("")
    const [descricao, setDescricao] = useState("")
    const [documentos, setDocumentos] = useState("")
    const [presencial, setPresencial] = useState("")
    const [horario, setHorario] = useState("")

    function cadastrarService() {
        console.log({
            nome,
            descricao,
            documentos,
            presencial,
            horario
        })
        apiServicos.post("", { nome, descricao, documentos, presencial, horario }).then(res => {
            if (res.status == 201) {
                alert("Serviço cadastrado com sucesso")
            } else {
                alert("Erro ao cadastrar")
            }
        })

    }

    return (
        <div>
            <PageHeader endereco="/cart/home" title="Cadastre novos serviços para os usuarios" />
            <main className="container">
                <fieldset>
                    <legend>Dados sobre o serviço</legend>
                    <Input name="nome" label="Nome do serviço" required onChange={e => { setNome(e.target.value) }} />
                    <Textarea name="descricao" label="Informe uma descrição para este serviçoo" required onChange={e => { setDescricao(e.target.value) }} />
                </fieldset>
                <fieldset>
                    <legend>Informe os documentos necessários</legend>
                    <Select name="documento" label="Selecione o documento" value={documentos} onChange={e => { setDocumentos(e.target.value) }} options={[
                        { value: "RG", label: "Registro Geral(RG)" },
                        { value: "CPF", label: "CPF" },
                        { value: "Certidão nascimento", label: "Certidão nascimento" },
                        { value: "Comprovante endereço", label: "Comprovante de endereço" }
                    ]} />
                    <Select name="documento" label="Selecione o documento" value={presencial} onChange={e => { setPresencial(e.target.value) }} options={[
                        { value: "true", label: "Presencial" },
                        { value: "false", label: "Remoto permitido" }
                    ]} />
                    <Input name="horario" value={horario} onChange={e => setHorario(e.target.value)} type="time" label="Hora" />
                </fieldset>
                <form onClick={cadastrarService}>
                    <footer>
                        <p >
                            <img src={warningIcon} alt="Aviso Importante" />
                         Importante !
                         Preencha todos os dados
                         </p>
                        <button onClick={cadastrarService} data-toggle="modal" data-target="#modalSucesso">
                            Finalizar cadastro
                        </button>
                    </footer>
                </form>
            </main>
        </div>
    )
}