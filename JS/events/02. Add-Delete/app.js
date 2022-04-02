document.getElementById('items').addEventListener('click', (ev) => {
    if(ev.target.tagName === 'A') {
        ev.target.parentNode.remove();

    }
});

function addItem() {
    // create <li>
    const input = document.getElementById('newItemText');
    const liElement = createElement('li', input.value)

    // add delete button
    const deleteBtn = createElement('a', '[Delete]');
    deleteBtn.href = '#';

    liElement.appendChild(deleteBtn);

    // add new <li> to document
    document.getElementById('items').appendChild(liElement);
    input.value = '';

    function createElement(type, content) {
        const element  = document.createElement(type);
        element.textContent = content;
        return element;
    }
}

