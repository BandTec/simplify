import axios from 'axios'

const apiPDF = axios.create({
    baseURL: 'http://localhost:8080/pdf',
})

export default apiPDF