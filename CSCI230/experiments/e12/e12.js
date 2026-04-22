let db;
const request = indexedDB.open('userFormDB', 1);

request.onupgradeneeded = (event) => {
    db = event.target.result;
    const objectStore = db.createObjectStore('formEntries', { keyPath: 'id', autoIncrement: true });
    objectStore.createIndex('name', 'name', { unique: false });
    objectStore.createIndex('gender', 'gender', { unique: false });
    objectStore.createIndex('acceptTerms', 'acceptTerms', { unique: false });
};

request.onerror = (event) => {
    console.error('Error opening IndexedDB:', event.target.errorCode);
};

const saveFormData = () => {
    const name = document.getElementById('name').value;
    const acceptTerms = document.getElementById('acceptTerms').checked;
    const gender = document.querySelector('input[name="gender"]:checked')?.value;

    if (!name || !gender) {
        alert('Please fill out all fields.');
        return;
    }

    const newData = { name, acceptTerms, gender };

    const transaction = db.transaction(['formEntries'], 'readwrite');
    const objectStore = transaction.objectStore('formEntries');
    const request = objectStore.add(newData);

    request.onsuccess = () => {
        console.log('Data saved:', newData);
        updateDataList();
    };

    request.onerror = (event) => {
        console.error('Error saving data:', event.target.errorCode);
    };
};

const updateDataList = () => {
    const dataList = document.getElementById('dataList');
    dataList.innerHTML = ''; 

    const transaction = db.transaction(['formEntries'], 'readonly');
    const objectStore = transaction.objectStore('formEntries');
    const request = objectStore.getAll();

    request.onsuccess = (event) => {
        const entries = event.target.result;
        entries.forEach(entry => {
            const listItem = document.createElement('li');
            listItem.textContent = `Name: ${entry.name}, Gender: ${entry.gender}, Accept Terms: ${entry.acceptTerms ? 'Yes' : 'No'}`;
            dataList.appendChild(listItem);
        });
    };
};

document.getElementById('saveButton').addEventListener('click', () => {
    if (db) {
        saveFormData();
    } else {
        alert('Database not initialized yet.');
    }
});

request.onsuccess = () => {
    db = request.result;
    updateDataList();
};
