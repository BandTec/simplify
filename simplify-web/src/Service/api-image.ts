import axios from 'axios'

const apiImage = axios.create({
    baseURL: 'http://localhost:8888/documentos',
})

export default apiImage