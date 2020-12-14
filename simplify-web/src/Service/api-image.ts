import axios from 'axios'

const apiImage = axios.create({
    baseURL: 'http://localhost:8080/documentos',
})

export default apiImage