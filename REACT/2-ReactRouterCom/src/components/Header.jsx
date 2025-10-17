import stylesHeader from "./Header.module.css";

function Header() {
    return (
        <div className={stylesHeader.header}>
            <span>logo</span>

            <div className={stylesHeader["container-nav"]}>
                <ul className={stylesHeader.lista}>
                    <li>Login</li>
                    <li>Registro</li>
                    <li>Contacto</li>
                </ul>
            </div>
        </div>
    );
}

export default Header;