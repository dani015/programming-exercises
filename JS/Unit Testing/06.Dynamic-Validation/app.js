function validate() {
    let pattern = /[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+/;
    const input = document.getElementById('email');
    input.addEventListener('change', () => {
        if(!pattern.test(input.value)) {
           input.classList.add('error');
        } else {
            input.classList.remove('error')
        }
    })
}