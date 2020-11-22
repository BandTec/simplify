import React from 'react'
import './styles.css'

export interface btnProps {
    title: string;
    classe?: string;
    type?: any;
}

const Button: React.FC<btnProps> = (props) => {
    return (
        <button type={props.type} className={props.classe}>
            {props.title}
            {/* Atenção PROPS nescessario */}
        </button>
    )
}

export default Button;