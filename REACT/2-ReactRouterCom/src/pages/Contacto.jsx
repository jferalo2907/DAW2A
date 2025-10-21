import Header from "../components/Header"
import Footer from "../components/Footer"
import stylesHome from "./Home.module.css"


function Contacto() {
    return <div className={stylesHome.container}>
        <Header />
        <main className={stylesHome["main-content"]}>
            Esto es el Contacto
        </main>

        <Footer />
    </div>
}

export default Contacto