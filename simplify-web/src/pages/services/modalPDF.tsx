import React, { FormEvent, useEffect, useState, MouseEvent } from 'react';
import Button from '../../components/button';
import '../../mocks/services/mock-horarios'
import api from '../../Service/api-pdf'
import Modal from '../../components/modal/'

import './styles.css'

function Download() {

    function dismiss() {
        return;
    }
    
    function baixarPDF(e:MouseEvent) {
        e.preventDefault();
        
        api.get("/")
        .then(res => {
            if (res.status === 200) {
                console.log(res.status);
            }
        }).catch(e => {
            console.log(e)
        })
    }

    return(

        <Modal
        id="pdf"
        titulo="Agendamento realizado com sucesso"
        conteudo="Seu agendamento foi concluído com sucesso! Clique no botão abaixo para acessar as informações da sua solicitação."
        botao="Baixar PDF"
        visibilidadeBotao={false}
        target=""
        click={baixarPDF}
        submit={dismiss}
        dismiss={false}
        dataAgendamento=""
        hora=""
    />
    )
    
}

export default Download;