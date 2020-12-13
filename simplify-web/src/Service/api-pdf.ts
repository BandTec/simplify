import axios from 'axios'

const apiPDF = axios.create({
    baseURL: 'http://localhost:8855/',
})

export default apiPDF