function addItem() {
    const input = document.getElementById('newItemText');
    const inputValue = document.getElementById('newItemValue');

    const menu = document.getElementById('menu');
    let option = document.createElement('option');
    option.text = input.value
    option.value = inputValue.value
    menu.appendChild(option);

    input.value = '';
    inputValue.value = '';

}