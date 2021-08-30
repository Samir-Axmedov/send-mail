import axios from 'axios'
const sendMail = "http://localhost:8080/api/mail/"

class mail {
    sendMail(mail){
        return axios.post(sendMail, mail)
    }
}

export default new mail()