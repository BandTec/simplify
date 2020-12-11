import React from 'react';
import Card from '../../components/card-service';
import servicos from '../../mocks/services/mock-service';
import Modal from '../../components/modal'

import './styles.css'

function Servicos() {
    return (
        <div className="container-service">
            <div className="container-content">
                {/* Componente do modal aplicado */}
                {servicos.map((item: {id: string, title: string; descricao: string; documentos: string; isPresencial: boolean;}) => {
                    return (
                        <Modal
                            id={`${item.id}`}
                            key={item.id}
                            titulo="Escolha seu horário"
                            conteudo="Horários disponíveis"
                            botao="Continuar"
                            visibilidadeBotao={true}
                        />
                    )
                })}
                <h1>Serviços</h1>
                <div className="card-container">
                {servicos.map( (item: {id: string, title: string; descricao: string; documentos: string; isPresencial: boolean;}) => {
                    return (
                        <Card
                            id={item.id}
                            key={item.id}
                            title={item.title}
                            descricao={item.descricao}
                            documento={item.documentos}
                            isPresencial={item.isPresencial}
                        />
                    )
                })}
                </div>
            </div>
        </div>
    )
}

export default Servicos;