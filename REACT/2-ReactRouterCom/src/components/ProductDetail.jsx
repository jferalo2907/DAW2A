import { useParams } from "react-router-dom";
import Header from "./Header";
import Footer from "./Footer";
import stylesHome from "../pages/Home.module.css"


function ProductDetail() {
const {productId} = useParams();
return (
  <div className={stylesHome.container}>
      <Header />
      <main className={stylesHome["main-content"]}>
      <h1>ESTE ES EL PRODUCTO {productId}</h1>
      </main>

      <Footer />
    </div>



)

}

export default ProductDetail