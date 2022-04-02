function validate() {
    // select input field and change event listener
    document.getElementById('email').addEventListener('change', onChange);

    function onChange(ev) {
        // onChange -> validate input
        const email = ev.target.value;
        if (/^[a-z]+@[a-z]+\.[a-z]+$/.test(email)) {
            // if valid -> remove class error
            ev.target.className = '';
        } else {
            // else -> add class error
            ev.target.className = 'error';
        }
    }
}