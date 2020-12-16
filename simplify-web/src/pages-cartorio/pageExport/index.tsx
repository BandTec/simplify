import React from 'react'
import PageHeader from '../../components/page-header'

import profile from '../../assets/profileCart.png'
import './styles.css'
import { CardProfile } from '../../components/card-profile'

export function ExportCart() {
    return (
        <div className="container">
            <PageHeader title="Exporte documentos aqui sobre seus clientes" />
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
                    <h2>Nome: {"response?.nome"} {"response?.sobrenome"}</h2>
                    <h2>Endereço: {"response?.endereco"}</h2>
                    <h2>Email: {"response?.email"}</h2>
                    <h2>Telefone: {"response.telefone"}</h2>
                    <h2>Horario Funcionamento: {"response.horario"}</h2>
                </fieldset>
                <fieldset>
                    <legend>Exportar Dados Usuarios</legend>
                    <div className="row">
                        <div className="col-12">
                            <div className="col-6">
                                <CardProfile
                                    classIcon="fas fa-doc"
                                    endereco="http://localhost:8080/pdf/rg"
                                    titulo="Exportar Dados usuarios TXT"
                                />
                            </div>
                            <CardProfile
                                classIcon="fas fa-doc"
                                endereco="http://localhost:8080/pdf/rg"
                                titulo="Exportar Dados usuarios CSV"
                            />
                        </div>
                    </div>
                </fieldset>
            </main>
        </div>
    )
}