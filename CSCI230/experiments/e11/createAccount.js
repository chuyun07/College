document.getElementById("create-account-form").addEventListener("submit", function(event) {
    event.preventDefault();

    // Retrieve input values
    const firstName = document.getElementById("first-name").value.trim();
    const lastName = document.getElementById("last-name").value.trim();
    const username = document.getElementById("username").value.trim();
    const password = document.getElementById("password").value.trim();

    // Check if any fields are empty
    if (!firstName || !lastName || !username || !password) {
        document.getElementById("error-message").textContent = "All fields are required.";
    } else {
        // Store the username in localStorage
        localStorage.setItem("username", username);
        // Redirect to home.html after account creation
        window.location.href = "home.html";
    }
});
