import React from 'react';
import { Link } from 'react-router-dom'
import './styles.css'

// import logoImg from '../../assets/images/logo.svg';
import backIcon from '../../assets/icons//back.svg'


interface pageHeaderProps {
    title: string;
    description?: string;
    endereco: string;
}

const PageHeader: React.FC<pageHeaderProps> = (props) => {
    return (
        <header className="page-header" >
            <div className="top-bar-container">
                <Link to={props.endereco}>
                    <img src={backIcon} alt="Voltar" />
                </Link>
                <img src="" alt="" />
            </div>
            <div className="header-content">
                <strong>{props.title}</strong>

                {props.description && <p>props.description</p>}
                {props.children}
            </div>

        </header >
    );
}

export default PageHeader;