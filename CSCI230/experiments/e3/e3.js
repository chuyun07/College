let keySequence = [];
const correctSequence = ['t' , 'o', 'n'];
document.addEventListener('keydown', function (event) {
    const key = event.key.toLowerCase();
    keySequence.push(key);

    if(keySequence.length > 3){
        keySequence.shift();
    }

    if(keySequence.join('') === correctSequence.join('')){
        createForm();
    }
});

function createForm() {
    const formContainer = document.getElementById('formContainer');

    if (!document.getElementById('loginForm')) {
        const form = `
            <form id="loginForm">
                <input type="text" id="username" placeholder="Username" required />
                <input type="password" id="password" placeholder="Password" required />
                <button type="button" onclick="validateLogin()">Login</button>
            </form>
        `;
        formContainer.innerHTML = form;
    }
}

function validateLogin() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    if (username === 'agentX' && password === 'secret') {
        document.getElementById('loginForm').remove(); // Remove form on success
        document.getElementById('imageContainer').style.display = 'block'; // Show image
    } else {
        alert('Incorrect username or password!');
    }
}
