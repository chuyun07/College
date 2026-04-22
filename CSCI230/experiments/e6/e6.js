class Vehicle {
    constructor(brand, year) {
        this.brand = brand;
        this.year = year;
    }

    info() {
        return `${this.brand} vehicle manufactured in ${this.year}`;
    }
}

class Car extends Vehicle {
    constructor(brand, year, model) {
        super(brand, year);
        this.model = model;
    }

    carInfo() {
        return `${this.model} car made by ${this.brand} in ${this.year}`;
    }
}

const myCar = new Car("Toyota", 2020, "Corolla");
document.getElementById('output').innerText = myCar.carInfo();
