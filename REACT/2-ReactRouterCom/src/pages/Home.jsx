import Footer from "../components/Footer.jsx";
import Header from "../components/Header.jsx";
import stylesHome from "./Home.module.css";

function Home() {
  return (
    // 👉 1. Aplica la clase .container al div que envuelve todo.
    //    Esto activará el layout de Grid.
    <div className={stylesHome.container}>
      <Header />

      {/* 👉 2. Aplica la clase para centrar el contenido al <main>. */}
      <main className={stylesHome["main-content"]}>
        Pues por aqui por ejemplo el catalogo de productos
      </main>

      <Footer />
    </div>
  );
}

export default Home;