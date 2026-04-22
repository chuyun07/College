document.getElementById("login-form").addEventListener("submit", function(event) {
    event.preventDefault();

    // Retrieve input values
    const username = document.getElementById("login-username").value.trim();
    const password = document.getElementById("login-password").value.trim();

    // Check if any fields are empty
    if (!username || !password) {
        document.getElementById("error-message").textContent = "Both fields are required.";
    } else {
        // Store username in localStorage and redirect
        localStorage.setItem("username", username);
        window.location.href = "home.html";
    }
});
