function displayInput() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    document.getElementById('displayName').textContent = `Name: ${firstName} ${lastName}`;
    document.getElementById('displayEmail').textContent = `Email: ${email}`;
    document.getElementById('displayPassword').textContent = `Password: ${password}`;

    document.getElementById('output').style.display = 'block';
}
