import React, { useEffect, useState } from 'react';
import './styles.css';

import image from '../../assets/Ilustracao/image-1.svg'
import api from '../../Service/api';
import PageHeader from '../../components/page-header';
import { CardProfile } from '../../components/card-profile';

import apiImage from '../../Service/api-image';
import { useHistory } from 'react-router-dom';

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


    const history = useHistory();

    const [response, setResponse] = useState<dataResponse>();
    let userLogado = localStorage.getItem('idUser');

    const [imagemUpload, setImagemUpload] = useState("");

    const handleUploadFile = (e: any) => { setImagemUpload(e.target.files[0]) }

    useEffect(() => {
        api.get(`${userLogado}`).then(res => setResponse(res.data))
    });

    const uploadImage = async () => {
        const dataImage = new FormData();
        dataImage.append('file', imagemUpload)
        apiImage.post("1", dataImage, {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        }).then(res => {
            console.log(res)
        }, e => {
            console.log(e)
        })
    }

    function logout() {
        api.post(`/logout/${userLogado}`).then(res => {
            history.push("/")
        })
    }

    return (

        <div className="container-fluid">
            <PageHeader title="Acompanhe aqui as suas solicitações" />
            <main>
                <fieldset>
                    <legend>Dados Pessoais</legend>
                    <div className="banner">
                        <div className="img-profile">
                            <img src={image} alt="" />
                        </div>
                    </div>
                </fieldset>
                <fieldset>
                    <h2>Nome: {response?.nome} {response?.sobrenome}</h2>
                    <h2>Data de nascimento: {response?.dataNascimento}</h2>
                    <h2>Email: {response?.email}</h2>
                </fieldset>
                <fieldset>
                    <legend>
                        Ultimas Solicitações
                    </legend>
                    <CardProfile titulo="Certidão de nascimento" />
                    <CardProfile titulo="Segunda via RG(Registro Geral)" />
                </fieldset>
                <fieldset>
                    <legend>
                        Documentos Armazenados
                    </legend>
                    <div className="row">
                        <div className="col-12">
                            <div className="col-12">
                                <CardProfile titulo="RG" />
                            </div>
                            <div className="col-12">
                                <CardProfile titulo="Comprovante de endereço" />
                            </div>

                        </div>
                    </div>
                </fieldset>
                <fieldset>
                    <legend>
                        Envie aqui seus documentos
                    </legend>
                    <form onSubmit={uploadImage}>
                        <label htmlFor="upload" id="form"></label>
                        <input
                            type="file"
                            onChange={handleUploadFile}
                            id="upload"
                            accept="image/"
                        />
                        <h2>Arraste ou clique para fazer upload do seu documento.</h2>
                        <button type="submit">Upload</button>
                    </form>
                </fieldset>
                <fieldset>
                    <legend>Isto é um até logo ?</legend>
                    <form onSubmit={logout}>
                        <button type="submit">Logout</button>
                    </form>
                </fieldset>
            </main >
        </div >

    )
}
export default Profile;
