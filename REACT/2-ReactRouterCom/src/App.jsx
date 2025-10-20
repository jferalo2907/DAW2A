import "./styles/stylesGlobales.css";
import "./styles/stylesReusables.css";
import Home from "./pages/Home";
import Pagina2 from "./pages/Pagina2";
import Login from "./pages/Login";
import Contacto from "./pages/Contacto";
import Registro from "./pages/Registro";
import { Link } from "react-router-dom";
import BigLayout from "./pages/BigLayout";

import { Routes, Route } from 'react-router-dom'

function App() {

  return (
   
      <div>
       <Routes>
         <Route path="/" element={<BigLayout/>}/>
        <Route path="/" element={<Home/>}/>
        <Route path="/pagina2" element={<Pagina2/>}/>
        <Route path="/login" element={<Login/>}/>
        <Route path="/contacto" element={<Contacto/>}/>
        <Route path="/registro" element={<Registro/>}/>



       </Routes>
    </div>
  )
}

export default App
