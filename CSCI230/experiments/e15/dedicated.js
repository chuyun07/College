self.addEventListener('message', (event) => {
    const { sharedArray, num } = event.data;
    const view = new Int32Array(sharedArray);

    console.log(`Worker received number: ${num}`);

    function factorial(n) {
        let result = 1;
        for (let i = 2; i <= n; i++) {
            result *= i;
            if (result > Number.MAX_SAFE_INTEGER) return -1; // Overflow check
        }
        return result;
    }

    // Compute factorial
    const factResult = factorial(num);
    console.log(`Worker computed factorial: ${factResult}`);

    // Store result in shared memory safely
    Atomics.store(view, 0, factResult);

    // Notify main thread that the result is ready
    self.postMessage('done');
});
