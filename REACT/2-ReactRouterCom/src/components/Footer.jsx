import clasesFooter from "./Footer.module.css";
import SocialLinks from "../components/socialLinks/SocialLinks";
function Footer() {
    return (
        <div className={`${clasesFooter.footer} ${clasesFooter["color-fondo"]}`}>
            <span>logo</span>
            <span>Movidas</span>
            <span>redes sociales</span>
        </div>
    );
}

export default Footer;