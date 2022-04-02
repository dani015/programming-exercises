function deleteByEmail() {
    // read input field value
    const email = document.querySelector('input[name="email"]').value;
    const resultElement = document.getElementById('result');

    // select all table cells from the last column
    const rows = Array.from(document.querySelectorAll('tbody tr'));


    // iterate over cells
    const matches = rows.filter(r => r.children[1].textContent == email);
    console.log(matches);
    if(matches.length > 0) {
        matches.forEach(r => r.remove())
        resultElement.textContent = 'Deleted.';
    } else {
        resultElement.textContent = 'Not found.';
    }
}