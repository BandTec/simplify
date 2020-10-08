import React from 'react';
import { Link } from 'react-router-dom';

import './styles.css'

export interface cardProps {
    title: string
}

const Card: React.FC<cardProps> = (props) => {
    return (
        <div className="card">
            <div className="imgBox">

            </div>
            <div className="contentBox">
                <h2>{props.title}</h2>
                <div className="size">
                    <h3>Precisa agendamento :</h3>
                    <div className="true"></div>
                </div>
                <div className="color">
                    <h3>Docs nescessarios :</h3>
                    <span>RG</span>
                    <span>CPF</span>
                </div>
                <div className="btn-card-container">
                    <Link to="services">
                        <div className="btn">Saber mais</div>
                    </Link>
                </div>
            </div>
        </div>
    )
}

export default Card;