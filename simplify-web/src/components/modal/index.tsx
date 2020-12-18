import React, { FormEvent, useEffect, useState, MouseEvent, Component } from 'react';
import Button from '../button';
import horarios from '../../mocks/services/mock-horarios'
import Input from '../../components/input'
import api from '../../Service/apiServicos'

import './styles.css'
import Select from '../Select';
import apiPDF from '../../Service/api-pdf';


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

    const [data, setData] = useState("");
    const [hora, setHora] = useState("");

    function enviarInfo(e: FormEvent) {
        
        e.preventDefault();
        console.log(data);
        console.log(hora);
        // let idUser = localStorage.getItem('idUser')
    
        apiPDF.post("/cadastrar", {
            data,
            hora
    
        }).then(res => {
            if (res.status === 200) {
                console.log(data);
                console.log(hora);
                alert(`Agendamento realizado`)
                // history.push('/service')
            }
        }).catch(e => {
            console.log(data);
            console.log(hora);
            console.log(e)
        })
    }
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
                        <Input name="data" label="" required type="date" onChange={e => { setData(e.target.value) }}/>
                        <Select name="documento" label="Selecione o documento" value={hora} onChange={e => { setHora(e.target.value) }} options={[
                        { value: "12:00", label: "12:00" },
                        { value: "13:00", label: "13:00" },
                        { value: "14:00", label: "14:00" },
                        { value: "15:00", label: "15:00" }
                    ]} />     
                        </div>
                    </div>
                    <div className="modal-footer" onSubmit={enviarInfo}>
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
                            onSubmit={enviarInfo}>
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