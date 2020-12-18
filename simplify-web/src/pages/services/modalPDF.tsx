import React, { FormEvent, useEffect, useState, MouseEvent } from 'react';
import Button from '../../components/button';
import '../../mocks/services/mock-horarios'
import apiPDF from '../../Service/api-pdf'
import Modal from '../../components/modal/'

import './styles.css'
import { useHistory } from 'react-router-dom';

function Download() {

    const history = useHistory();

    function dismiss() {
        return;
    }

    function baixarPDF(e: MouseEvent) {
        e.preventDefault();

    }
    // , {
    //     headers: {
    //           'Content-Type': 'attachment; filename=users.pdf',
    //         'Content-Disposition': 'application/pdf',
    //     }

    // .then(res => {
    //     if (res.status === 200) {
    //         history.push("/profile")
    //         console.log(res)
    //     }
    // }).catch(e => {
    //     console.log(e)
    // })


    return (

        <Modal
            id="pdf"
            titulo="Agendamento realizado com sucesso"
            conteudo="Seu agendamento foi concluído com sucesso! Clique no botão abaixo para efetuar o pagamento e evitar filas."
            botao2="Baixar PDF"
            visibilidadeBotao={false}
            visibilidade={true}
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