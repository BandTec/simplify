import React from 'react';
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
            <footer>
                <div>
                    <h4>
                        Horarios disponiveis
                    </h4>
                    <p>
                        Horarios disponiveis <strong>{props.horario}</strong>
                    </p>
                </div>
                <button className="btn-1" data-toggle="modal" data-target={`#${props.id}`}>Agendar</button>
            </footer>
        </article>
    )
}

export default Card;