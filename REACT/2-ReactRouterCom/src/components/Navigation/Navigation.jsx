import Login from "../../pages/Login";

import stylesHeader from "./Navigation.module.css";
import { Link } from "react-router-dom"





function Navigation() {
    return (

        <div className={stylesHeader["container-nav"]}>
            <ul className={stylesHeader.lista}>
                <li> <Link to="login"> Login </Link></li>
                <li> <Link to="registro"> Registro </Link></li>
                <li> <Link to="contacto" > Contacto </Link></li>
            </ul>
        </div>

    );
}

export default Navigation;