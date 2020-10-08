import React from 'react';

import './styles.css'

const Upload = () => {

    //Função para validar documento
    // const validTypes = ['png', 'PNG', 'jpg', 'JPG', 'jpeg', 'JPEG', 'pdf', 'PDF']

    // const id = document.getElementById('File');

    // const valid = validTypes.filter(e => { if (id[0].name.includes(e)) return e })

    // if (!files[0].name.includes(valid[0])) {
    //     alert('Por favor insira o imagens nos formatos JPG, PNG e PDF')
    //     return
    // }

    return (
        <input id="File" type="file" name="arquivos" className="upload" accept="image/png, image/jpeg" multiple />
    )
}

export default Upload;