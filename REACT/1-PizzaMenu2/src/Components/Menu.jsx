import Pizza from "./Pizza.jsx";
import data from "../data/data.js";
import pizzaData from "../data/data.js";


const Menu = () => {
   

    return (
        <div className="menu">

            <h2>Menu Pizza</h2>
            <div className="pizzas">


            
                {pizzaData.map((itemPizza) => (
                <Pizza pizza={itemPizza} loquesea="asd" />  
                )  )  }

            </div>

        </div>
    );

};

export default Menu;