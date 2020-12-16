import React, { FormEvent, useEffect, useState, MouseEvent, Component } from 'react';
import Button from '../button';
import horarios from '../../mocks/services/mock-horarios'
import Select from '../../components/input/select'
import Input from '../../components/input'
import api from '../../Service/apiServicos'

import './styles.css'


export interface modalProps {
    titulo: string,
    conteudo: string,
    id: string,
    botao?: string,
    botao2?: string,
    visibilidadeBotao: boolean,
    visibilidade: boolean,
    target: string
    dismiss: boolean,
    dataAgendamento: string,
    hora: string,
    click(event: React.MouseEvent<HTMLButtonElement>): void;
    submit(event: React.FormEvent<HTMLDivElement>): void;

}

const Modal: React.FC<modalProps> = (props) => {

    return (
        <div>
            {/* Modal */}
            <div className="modal fade" id={props.id} tabIndex={-1} role="dialog" aria-hidden="true">
                <div className="modal-dialog modal-dialog-centered modal-container" role="document">
                    <div className="modal-content">
                        <div className="modal-header">
                            <p className="modal-title">{props.titulo}</p>
                            <button type="button" className="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                    <div className="modal-body">
                        <p>
                            {props.conteudo}
                        </p>
                        <div className={props.visibilidadeBotao ? "horarios-container": "btn-none"}>
                        <Input name="data" label="" required type="date"/>
                        <Select name="hora"/>          
                        </div>
                    </div>
                    <div className="modal-footer" onSubmit={props.submit}>
                    <a href="http://localhost:8888/pdf/certidao"
                    className="a-modal" 
                    >  
                    <button 
                            type="submit" 
                            className={props.visibilidade?'btn-modal':'btn-none'} 
                            >
                                {props.botao2}
                        </button>
                    </a>
                        <button 
                            
                            type="submit" 
                            className={!props.visibilidade?'btn-modal':'btn-none'} 
                            data-dismiss={props.dismiss ? "modal": ""} 
                            data-toggle="modal" 
                            data-target={props.target} 
                            onClick={props.click}>
                                {props.botao}
                        </button>
                    </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Modal;