import React from 'react';

import './styles.css'

export interface modalProps {
    titulo: string,
    conteudo: string
}

const Modal: React.FC<modalProps> = (props) => {
    return (
        <div>
            {/* Clique no botão que aciona o modal */}
            <button type="button" className="btn btn-primary" data-toggle="modal" data-target="#abrirModal">
            Clicar Modal
            </button>

            {/* Modal */}
            <div className="modal fade" id="abrirModal" tabIndex={-1} role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div className="modal-dialog modal-dialog-centered" role="document">
                <div className="modal-content">
                <div className="modal-header">
                    <h5 className="modal-title" id="exampleModalLongTitle">{props.titulo}</h5>
                    <button type="button" className="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div className="modal-body">
                    {props.conteudo}
                </div>
                <div className="modal-footer">
                    <button type="button" className="btn btn-primary">Fechar</button>
                </div>
                </div>
            </div>
            </div>
        </div>
    )
}

export default Modal;