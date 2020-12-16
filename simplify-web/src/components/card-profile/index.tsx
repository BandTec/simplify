import React from 'react'

import './styles.css'

interface propsCard {
    titulo: string
    classIcon: string
    endereco: string
}

export const CardProfile = (props: propsCard) => {
    return (
        <div id="card-export">
            <div className="face face1">
                <div className="content">
                    <div className="icon">
                        <i aria-hidden="true">{props.titulo}</i>
                    </div>
                </div>
            </div>
            <div className="face face2">
                <div className="content">
                    <h3>
                        <a href={props.endereco} >{props.titulo}</a>
                    </h3>
                </div>
            </div>
        </div>
    )
} 