import axios from 'axios'

const apiPDF = axios.create({
    baseURL: 'http://localhost:8888/solicitar',
})

export default apiPDF