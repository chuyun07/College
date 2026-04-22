window.onload = function() {
    // Retrieve the stored username from localStorage
    const username = localStorage.getItem("username");

    // Check if the user is logged in
    if (username) {
        document.getElementById("username").textContent = username;
    } else {
        // If no username is found, redirect to login.html
        window.location.href = "login.html";
    }
};

function logOut() {
    // Remove the username from localStorage and redirect to login page
    localStorage.removeItem("username");
    window.location.href = "login.html"; // Redirect to login page after logout
}
