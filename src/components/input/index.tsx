import React from 'react';

import './styles.css'

export interface InpPros {
    name: string
    placehold: string
    label: string
    classe?: string
    labelStyle?: string
}

const Input: React.FC<InpPros> = (props) => {
    return (
        <div className={props.labelStyle}>
            <label htmlFor={props.label}>{props.label}:</label>

            <input className={props.classe} type="text" id={props.label} name={props.name} placeholder={props.placehold} />
        </div>
    )
}


export default Input;