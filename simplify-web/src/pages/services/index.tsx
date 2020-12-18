import React, { FormEvent, useEffect, useState } from 'react';
import Card from '../../components/card-service';
import Modal from '../../components/modal'
import { useHistory } from 'react-router-dom';
import apiServicos from '../../Service/apiServicos'
import apiPDF from '../../Service/api-pdf'
import ModalPDF from '../../pages/services/modalPDF'

import './styles.css'
import PageHeader from '../../components/page-header';
import servicos from '../../mocks/services/mock-service';

function Servicos() {

    const history = useHistory();

    const [id, setId] = useState('');
    const [nome, setNome] = useState('');
    const [descricao, setDescricao] = useState('');
    const [documentos, setDocumentos] = useState('');
    const [isPresencial, setIsPresencial] = useState(Boolean);
    const [data, setData] = useState('');
    const [hora, setHora] = useState('');

    // useEffect(() => {
    //     apiServicos.get("").then(res => { setData(res.data) })
    // })


    // const [data, setData] = useState([]);

    function dismiss() {
        return;
    }

    function enviarInfo(e: FormEvent) {
        e.preventDefault();

        // let idUser = localStorage.getItem('idUser')

        apiPDF.post("/cadastrar", {
            data,
            hora

        }).then(res => {
            if (res.status === 200) {
                console.log(data);
                console.log(hora);
                alert(`Agendamento realizado`)
                history.push('/service')
            }
        }).catch(e => {
            console.log(data);
            console.log(hora);
            console.log(e)
        })
    }

    return (
        <div className="container-service">
            <ModalPDF />
            <div className="container-content">
                {/* Componente do modal aplicado */}
                {servicos.map((item: { id: string, title: string; descricao: string; documentos: string; isPresencial: boolean; horario: string}) => {
                    return (
                        <Modal
                            id={`${item.id}`}
                            key={item.id}
                            titulo="Escolha seu horário"
                            conteudo="Horários disponíveis"
                            botao="Continuar"
                            visibilidadeBotao={true}
                            visibilidade={false}
                            target="#pdf"
                            dataAgendamento=""
                            hora="12:00"
                            click={enviarInfo}
                            submit={enviarInfo}
                            dismiss={true}
                        />
                    )
                })}
                <PageHeader endereco="/user/home" title="Acompanhe aqui uma listinha com todos os nossos serviços" />
                <div className="container-content">
                    {/* Componente do modal aplicado */}
                    <div className="card-container">
                        {servicos.map((item: { id: string, title: string; descricao: string; documentos: string; isPresencial: boolean; horario: string }) => {
                            return (
                                <Card
                                    id={item.id}
                                    key={item.id}
                                    title={item.title}
                                    descricao={item.descricao}
                                    documento={item.documentos}
                                    isPresencial={item.isPresencial}
                                    horario={item.horario}
                                    submit={() => {
                                        setId(item.id);
                                        setNome(item.title);
                                        setDescricao(item.descricao);
                                        setDocumentos(item.documentos);
                                        setIsPresencial(item.isPresencial);
                                    }}
                                    click={() => {
                                        setId(item.id);
                                        setNome(item.title);
                                        setDescricao(item.descricao);
                                        setDocumentos(item.documentos);
                                        setIsPresencial(item.isPresencial);
                                    }}
                                />
                            )
                        })}
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Servicos;