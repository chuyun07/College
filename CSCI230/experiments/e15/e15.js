// Create a Worker instance
const worker = new Worker('dedicated.js');

// Create a SharedArrayBuffer (4 bytes for an Int32)
const sharedArray = new SharedArrayBuffer(4);
const view = new Int32Array(sharedArray); // Can store larger values

document.getElementById('calculateBtn').addEventListener('click', () => {
    const num = parseInt(document.getElementById('factorialInput').value);

    if (!Number.isInteger(num) || num < 0) {
        alert('Please enter a valid positive integer');
        return;
    }

    // Reset shared memory
    Atomics.store(view, 0, 0);
    console.log(`Sending ${num} to worker...`);

    worker.postMessage({ sharedArray, num });

    document.getElementById('factorialResult').innerText = `Calculating...`;
});

// Handle worker response
worker.addEventListener('message', () => {
    const factorialValue = Atomics.load(view, 0);
    console.log(`Factorial result received: ${factorialValue}`);

    document.getElementById('factorialResult').innerText = `Factorial Result: ${factorialValue}`;
    document.getElementById('sharedBufferResult').innerText = `Shared Array Buffer Value: ${factorialValue}`;
});
