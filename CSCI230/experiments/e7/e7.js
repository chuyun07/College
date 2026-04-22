class Entity {
    #id;
    #name;
    #attr1;
    #attr2;
    #attr3;
    #attr4;
    #attr5;
    #attr6;

    constructor(id, name, attr1, attr2, attr3, attr4, attr5, attr6) {
        this.#id = id;
        this.#name = name;
        this.#attr1 = attr1;
        this.#attr2 = attr2;
        this.#attr3 = attr3;
        this.#attr4 = attr4;
        this.#attr5 = attr5;
        this.#attr6 = attr6;
    }

    get name() {
        return this.#name;
    }

    get attributes() {
        return [this.#attr1, this.#attr2, this.#attr3, this.#attr4, this.#attr5, this.#attr6];
    }
}

document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('entity-container');
    entityData.forEach(data => {
        const entity = new Entity(data.id, data.name, data.attr1, data.attr2, data.attr3, data.attr4, data.attr5, data.attr6);
        const entityDiv = document.createElement('div');
        entityDiv.classList.add('entity');

        const entityName = document.createElement('h3');
        entityName.textContent = entity.name;

        const entityAttributes = document.createElement('ul');
        entity.attributes.forEach(attr => {
            const li = document.createElement('li');
            li.textContent = attr;
            entityAttributes.appendChild(li);
        });

        entityDiv.appendChild(entityName);
        entityDiv.appendChild(entityAttributes);
        container.appendChild(entityDiv);
    });
});