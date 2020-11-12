import React from 'react';
import { Link } from 'react-router-dom';

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
    title: string
}

const Card: React.FC<cardProps> = (props) => {
    return (
        <article className="card">
            <header>
                <img src="" alt="" />
                <div>
                    <strong>Titulo</strong>
                    <span>Tipo documento</span>
                </div>
            </header>
            <p>
                Descrição
            </p>
            <footer>
                <p>
                    Horarios disponiveis <strong>10:00 - 22:00</strong>
                </p>
                <a target="blank">
                    Fazer agendamento
                </a>
            </footer>
        </article>
    )
}

export default Card;