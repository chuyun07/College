const containers = document.querySelectorAll('.container');
let draggedItem = null;

// Update the counter display above a container
function updateCounter(container) {
    const counter = container.previousElementSibling;
    const count = container.children.length;
    container.setAttribute('data-count', count);
    counter.textContent = `Counter: ${count}`;
    
    if (count >= 10) {
        container.classList.add('full');
    } else {
        container.classList.remove('full');
    }
}

// Add drag-and-drop functionality to items
containers.forEach(container => {
    container.addEventListener('dragstart', (e) => {
        if (e.target.classList.contains('item')) {
            draggedItem = e.target;
        }
    });

    container.addEventListener('dragover', (e) => {
        e.preventDefault();
        if (container.children.length < 10) {
            container.style.borderColor = '#00ff00';
        } else {
            container.style.borderColor = 'red';
        }
    });

    container.addEventListener('dragleave', () => {
        container.style.borderColor = '#007BFF';
    });

    container.addEventListener('drop', (e) => {
        e.preventDefault();
        container.style.borderColor = '#007BFF';

        if (draggedItem && container.children.length < 10) {
            const oldContainer = draggedItem.parentElement;
            container.appendChild(draggedItem);

            // Update counters for both the old and new containers
            updateCounter(oldContainer);
            updateCounter(container);

            draggedItem = null;
        } else if (container.children.length >= 10) {
            alert('This container cannot hold more than 10 elements.');
        }
    });
});
