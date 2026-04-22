const scrollableContainer = document.getElementById('scrollableContainer');
const loadIndicator = document.getElementById('loadIndicator');
const totalBoxesElement = document.getElementById('totalBoxes');
const imageBoxesElement = document.getElementById('imageBoxes');
const createBox = () => {
    const box = document.createElement('div');
    box.classList.add('box');
    
    const shouldContainImage = Math.random() < 0.3;
    if (shouldContainImage) {
        const img = document.createElement('img');
        img.src = 'https://i.pinimg.com/1200x/6a/ba/8b/6aba8b5c288c728568945c53625eba87.jpg';
        img.alt = 'Image in box';
        img.style.width = '50px';
        img.style.height = '50px';
        box.appendChild(img);
    } else {
        box.textContent = `Box ${scrollableContainer.children.length + 1}`;
    }

    return box;
};

const updateStats = () => {
    const totalBoxes = scrollableContainer.children.length - 1;
    let imageBoxesCount = 0;
    
    for (let box of scrollableContainer.children) {
        if (box.querySelector('img')) {
            imageBoxesCount++;
        }
    }

    totalBoxesElement.textContent = totalBoxes;
    imageBoxesElement.textContent = imageBoxesCount;
};

const addNewBoxes = () => {
    for (let i = 0; i < 3; i++) {
        const newBox = createBox();
        scrollableContainer.insertBefore(newBox, loadIndicator);
    }
    updateStats();
};

const observer = new IntersectionObserver(entries => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            addNewBoxes();
        }
    });
}, { threshold: 1.0 });

observer.observe(loadIndicator);

const mutationObserver = new MutationObserver(() => {
    updateStats();
});

mutationObserver.observe(scrollableContainer, {
    childList: true 
});

updateStats();
