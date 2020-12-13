import React from 'react'

import './styles.css'

interface propsCard {
    titulo: string
}

export const CardProfile = (props: propsCard) => {
    return (
        <div className="solicitacoes">
            <div className="solicitacao">
                <div className="card-solicita">
                    <h2>{props.titulo} </h2>
                </div>
            </div>
        </div>
    )
} 