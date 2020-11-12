import React from 'react';
import './styles.css';

function profile() {
    return (
        <div className="perfil-conteiner">
            <div className="form-container perfil-form">
                <div className="dados-tela" >
                    <div className="title-perfil">
                        <h3> Perfil</h3>
                    </div>
                    <div className="avatar">
                    </div>
                    <strong> Nome:</strong>
                    <strong>CPF</strong>
                    <strong>Email:</strong>
                    <strong>Idade:</strong>
                </div>

            </div>

        </div>
    )
}
export default profile;
