function search() {
    let input = document.getElementById('searchText').value;
    let arr = [...document.querySelectorAll('#towns li')];

    let counter = 0;


    for (let a of arr) {
        if(a.textContent.includes(input)) {
            a.style.textDecorationLine = 'underline';
            a.style.fontWeight = 'bold';
            counter++;
        }
    }
    document.getElementById('result').textContent = counter + ' matches found';
}
