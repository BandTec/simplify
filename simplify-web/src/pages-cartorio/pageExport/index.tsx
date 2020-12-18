import React, { useEffect, useState } from 'react'
import PageHeader from '../../components/page-header'

import profile from '../../assets/profileCart.png'
import './styles.css'
import { CardProfile } from '../../components/card-profile'
import api from '../../Service/api'

interface cart {
    nome: string
    endereco: string
    email: string
    telefone: string
    horario: string
}

export function ExportCart() {

    const [response, setResponse] = useState<cart>();

    useEffect(() => {
        api.get("/cartorio/1").then(res => { setResponse(res.data) })
    })

    return (
        <div className="container">
            <PageHeader endereco="/cart/home" title="Exporte documentos aqui sobre seus clientes" />
            <main>
                <fieldset>
                    <legend>Dados da Instituição</legend>
                    <div className="banner-cartorio">
                        <div className="img-profile">
                            <img src={profile} alt="" />
                        </div>
                    </div>
                </fieldset>
                <fieldset>
                    <h2>Nome: {response?.nome}</h2>
                    <h2>Endereço: {response?.endereco}</h2>
                    <h2>Email: {response?.email}</h2>
                    <h2>Telefone: {response?.telefone}</h2>
                    <h2>Horario Funcionamento: {response?.horario}</h2>
                </fieldset>
                <fieldset>
                    <legend>Exportar Dados Usuarios</legend>
                    <div className="row">
                        <div className="col-12 card-content">
                            <CardProfile
                                classIcon="fas fa-doc"
                                endereco="http://localhost:8080/layout/download"
                                titulo="Exportar Dados usuarios TXT"
                            />
                            <CardProfile
                                classIcon="fas fa-doc"
                                endereco="http://localhost:8080/layout/txt"
                                titulo="Coming Soon..."
                            />
                        </div>
                    </div>
                </fieldset>
            </main>
        </div>
    )
}