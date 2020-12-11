import React from 'react';
import Button from '../button';
import '../../mocks/services/mock-horarios'

import './styles.css'
import { title } from 'process';

export interface modalProps {
    titulo: string,
    conteudo: string,
    id: string,
    botao: string,
    visibilidadeBotao: boolean
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
                            <Button classe="btn-horarios" title="13:30" data-toggle="modal" data-target={`#${props.id}`}/>
                            <Button classe="btn-horarios" title="14:30" data-toggle="modal" data-target={`#${props.id}`}/>
                            <Button classe="btn-horarios" title="15:30" data-toggle="modal" data-target={`#${props.id}`}/>
                            <Button classe="btn-horarios" title="16:30" data-toggle="modal" data-target={`#${props.id}`}/>
                            <Button classe="btn-horarios" title="18:30" data-toggle="modal" data-target={`#${props.id}`}/>                        
                        </div>
                    </div>
                    <div className="modal-footer">
                        <button type="button" className="btn-modal" data-target="">{props.botao}</button>
                    </div>
                    </div>
                </div>
            </div>
            <Modal 
                id={props.id}
                titulo="Download"
                conteudo=""
                botao="Baixar PDF"
                visibilidadeBotao={false}
            />
        </div>
    )
}

export default Modal;