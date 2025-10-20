import stylesHeader from "./Header.module.css";
import Navigation from "./Navigation/Navigation";


function Header() {
    return (
        <div className={stylesHeader.header}>
            <span>logo</span>

            <Navigation/>
        </div>
    );
}

export default Header;