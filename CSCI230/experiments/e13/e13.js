const locationOutput = document.getElementById('locationOutput');
const locationButton = document.getElementById('getLocationBtn');
const notificationButton = document.getElementById('allowNotificationBtn');
const observeElement = document.getElementById('observeElement');
const resizeElement = document.getElementById('resizeElement');
const mutationElement = document.getElementById('mutationElement');
const performanceLog = document.getElementById('performanceLog');

locationButton.addEventListener('click', () => {
    if ('geolocation' in navigator) {
        navigator.geolocation.getCurrentPosition(
            (position) => {
                const { latitude, longitude } = position.coords;
                locationOutput.textContent = `Latitude: ${latitude}, Longitude: ${longitude}`;
            },
            (error) => {
                switch (error.code) {
                    case error.PERMISSION_DENIED:
                        locationOutput.textContent = "User denied the request for Geolocation.";
                        break;
                    case error.POSITION_UNAVAILABLE:
                        locationOutput.textContent = "Location information is unavailable.";
                        break;
                    case error.TIMEOUT:
                        locationOutput.textContent = "The request to get user location timed out.";
                        break;
                    default:
                        locationOutput.textContent = "An unknown error occurred.";
                        break;
                }
            }
        );
    } else {
        locationOutput.textContent = "Geolocation is not supported by your browser.";
    }
});

notificationButton.addEventListener('click', () => {
    if ('Notification' in window) {
        if (Notification.permission === 'granted') {
            alert('Notifications are already enabled.');
        } else if (Notification.permission === 'denied') {
            alert('You have blocked notifications. Please enable them in your browser settings.');
        } else {
            Notification.requestPermission().then((permission) => {
                if (permission === 'granted') {
                    new Notification('Thank you for enabling notifications!');
                } else {
                    alert('Notifications permission denied.');
                }
            });
        }
    } else {
        alert('Notifications are not supported by your browser.');
    }
});

const intersectionObserver = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            console.log('Element is in the viewport!');
        } else {
            console.log('Element is out of the viewport!');
        }
    });
}, { threshold: 0.5 });

intersectionObserver.observe(observeElement);

const mutationObserver = new MutationObserver((mutations) => {
    mutations.forEach(mutation => {
        console.log('Mutation observed:', mutation);
        if (mutation.type === 'childList') {
            console.log('Child elements changed:', mutation.target);
        }
    });
});

mutationObserver.observe(mutationElement, { childList: true, subtree: true });

const mutationChangeBtn = document.getElementById('mutationChangeBtn');
mutationChangeBtn.addEventListener('click', () => {
    const p = mutationElement.querySelector('p');
    console.log('Changing content...');
    p.textContent = 'Content changed by Mutation Observer!';
});

const resizeObserver = new ResizeObserver((entries) => {
    entries.forEach(entry => {
        console.log('Element resized:', entry.target);
        performanceLog.innerHTML = `Element resized! New dimensions: ${entry.contentRect.width} x ${entry.contentRect.height}`;
    });
});

resizeObserver.observe(resizeElement);

const performanceObserver = new PerformanceObserver((list) => {
    list.getEntries().forEach(entry => {
        console.log('Performance Entry:', entry);
        performanceLog.innerHTML += `<p>Performance Entry: ${entry.name} - ${entry.duration}ms</p>`;
    });
});

performanceObserver.observe({ entryTypes: ['measure', 'navigation', 'resource'] });

performance.mark('start');
setTimeout(() => {
    performance.mark('end');
    performance.measure('My Custom Measure', 'start', 'end');
}, 1000);
