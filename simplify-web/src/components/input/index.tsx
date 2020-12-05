import React, { InputHTMLAttributes } from 'react';

import './styles.css'

interface InpPros extends InputHTMLAttributes<HTMLInputElement> {
    name: string
    placehold: string
    label: string
    classe?: string
    labelStyle?: string
}

const Input: React.FC<InpPros> = ({ placehold, classe, label, labelStyle, ...rest }) => {
    return (
        <div className="label-inp">
            <label htmlFor={label}>{label}:</label>
            <input className={classe} placeholder={placehold} {...rest} />
        </div>
    )
}


export default Input;