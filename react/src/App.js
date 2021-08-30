import { useState } from 'react';
import './App.css';
import service from './service';

function App() {
  const [mail, setMail] = useState("")
  const [title, setTitle] = useState("")
  const [text, setText] = useState("")

  const send = () => {
    let sendMail = { mail: mail, title: title, text: text }
    service.sendMail(sendMail).then().catch()
  }
  return (
    <div>
      <form>
        <label>Gönderilecek Mail Adresi</label>
        <input type="text"
          onChange={e => setMail(e.target.value)}
          id="fname"
          name="firstname"
          placeholder="Gönderilecek Mail Adresi"
        />
        <label for="lname">Mail Başlığı</label>
        <input type="text"
          onChange={e => setTitle(e.target.value)}
          id="lname"
          name="lastname"
          placeholder="Mail Başlığı"
        />
        <label for="lname">Mail İçeriği</label>
        <input type="text"
          onChange={e => setText(e.target.value)}
          id="lname" name="lastname"
          placeholder="Mail İçeriği"
        />
        <button onClick={() => send()} class="button button1">Maili Gönder</button>
      </form>
    </div>
  );
}

export default App;
