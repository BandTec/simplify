import React, { useEffect, useState } from 'react';
import './styles.css';

import image from '../../assets/Ilustracao/image-1.svg'
import api from '../../Service/api';

export interface dataResponse {
    id: number;
    nome: string;
    sobrenome: string;
    dataNascimento: string;
    email: string;
    password: string
}
export interface content {


}

function Profile() {

    const [response, setResponse] = useState<dataResponse>();
    let userLogado = localStorage.getItem('idUser');

    useEffect(() => {
        api.get(`${userLogado}`).then(res => setResponse(res.data))
    })

    return (
        <div className="perfil-conteiner col-12">
            <div className="card-let col-6">
                <div className="banner">
                    <div className="img-profile">
                        <img src={image} alt="imgPerfil" />
                    </div>
                </div>
                <div className="infos">
                    <div className="user-infos">
                        {/* destruturação das infos do user */}
                        <h2>{response?.nome}</h2>
                        <p>{response?.dataNascimento}</p>
                    </div>
                </div>
                <h2>Ultimas solicitações:</h2>
                {/* possivcel codigo 
                    {resposne.content.map(res=>{
                     <div className="solicitacoes">
                    <div className="solicitacao">
                        <div className="card-solicita">
                            <h2>{res.nome}</h2>
                        </div>
                    </div>
                </div>
                    }}
                */}
                <div className="solicitacoes">
                    <div className="solicitacao">
                        <div className="card-solicita">
                            <h2>Certidão de nascimento </h2>
                        </div>
                    </div>
                </div>

                <div className="solicitacoes">
                    <div className="solicitacao">
                        <div className="card-solicita">
                            <h2>Gerar Assinatura </h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default Profile;
