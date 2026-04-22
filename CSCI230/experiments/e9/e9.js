// List of shapes and their IDs
const shapeOrder = ['circle', 'square', 'triangle', 'rectangle', 'oval'];

// Shape handlers
const handlers = {
    circle: function () {
        const circle = document.getElementById('circle');
        circle.style.backgroundColor = circle.style.backgroundColor === 'red' ? 'pink' : 'red';
    },
    square: function () {
        const square = document.getElementById('square');
        square.style.backgroundColor = square.style.backgroundColor === 'blue' ? 'cyan' : 'blue';
    },
    triangle: function () {
        const triangle = document.getElementById('triangle');
        triangle.style.borderBottomColor = triangle.style.borderBottomColor === 'green' ? 'lime' : 'green';
    },
    rectangle: function () {
        const rectangle = document.getElementById('rectangle');
        rectangle.style.backgroundColor = rectangle.style.backgroundColor === 'yellow' ? 'orange' : 'yellow';
    },
    oval: function () {
        const oval = document.getElementById('oval');
        oval.style.backgroundColor = oval.style.backgroundColor === 'purple' ? 'violet' : 'purple';
    }
};

// Register event handlers
shapeOrder.forEach((shapeId, index) => {
    const shape = document.getElementById(shapeId);
    shape.addEventListener('click', () => {
        // Invoke the handler for the current shape
        handlers[shapeId]();

        // Dispatch event to the next shape after 1 second
        setTimeout(() => {
            const nextShapeId = shapeOrder[(index + 1) % shapeOrder.length];
            document.getElementById(nextShapeId).dispatchEvent(new Event('click'));
        }, 1000);
    });
});
