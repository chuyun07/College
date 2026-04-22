import pizzas from './data.js'; // Import the pizza data

class PizzaList extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({ mode: 'open' });
        this.render();
    }

    render() {
        const pizzaItems = pizzas.map(pizza => `
            <div class="pizza" id="pizza-${pizza.id}">
                <img src="${pizza.image}" alt="${pizza.name} Image">
                <h2>${pizza.name}</h2>
                <p>Ingredients: ${pizza.ingredients}</p>
                <p>Size: ${pizza.size}</p>
                <p>Price: ${pizza.price}</p>
                <p>Rating: ${pizza.rating} ⭐</p>
            </div>
        `).join('');

        this.shadowRoot.innerHTML = `
            <style>
                .pizza {
                    border: 1px solid #ccc;
                    border-radius: 8px;
                    margin: 10px;
                    padding: 10px;
                    text-align: center;
                }
                .pizza img {
                    width: 100%;
                    border-radius: 4px;
                }
            </style>
            <div class="pizza-list">${pizzaItems}</div>
        `;
    }
}

customElements.define('pizza-list', PizzaList);
