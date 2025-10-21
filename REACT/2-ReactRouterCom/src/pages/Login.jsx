
import Header from "../components/Header"
import Footer from "../components/Footer"

import stylesHeader from "../components/Header.module.css"
import stylesFooter from "../components/Footer.module.css"
import stylesHome from "./Home.module.css"


function Login( ) {
    return  <div className={stylesHome.container}>
      <Header />
      <main className={stylesHome["main-content"]}>
      Esto es el login
      </main>

      <Footer />
    </div>
}

export default Login