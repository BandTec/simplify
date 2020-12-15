import React, { Component, FormEvent, useState } from 'react';
import Button from '../button';
import apiServicos from '../../Service/apiServicos';

import './styles.css'

export interface User {
    nome: string;
    sobrenome: string;
    dataNascimento: string;
    email: string;
    telefone: string;
    senha: string;
    rg: string;
    cep: string;
    cidade: string;
    estado: string;
    logradouro: string;
}

export interface service {
    nome: string;
    descricao: string;
    endereco: string;
    presencial: boolean;
}

export interface cardProps {
    id: string,
    title: string;
    descricao: string;
    documento: string;
    horario: string;
    isPresencial: boolean;
    submit(event: React.FormEvent<HTMLDivElement>): void;
    click(event: React.FormEvent<HTMLButtonElement>): void;
}



const Card: React.FC<cardProps> = (props) => {

    return (
        <article className="card">
            <header>
                <div>
                    <strong className="card-title">{props.title}</strong>
                    <span>Documentos necessários: {props.documento}</span>
                    <span>{props.isPresencial === true ? "Presencial" : "Online"}</span>
                </div>
            </header>
            <hr />
            <p>Descrição: </p>
            <p>{props.descricao}</p>
            <hr />
            <footer onSubmit={props.submit}>
                <div>
                    <h4>
                        Horarios disponiveis
                    </h4>
                    <p>
                        <strong>{props.horario}</strong>
                    </p>
                </div>
                <button type="submit" className="btn-modal" data-toggle="modal" data-target={`#${props.id}`} onClick={props.click}>Agendar</button>
            </footer>
        </article>
    )
}

export default Card;