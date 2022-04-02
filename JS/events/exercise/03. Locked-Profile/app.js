function lockedProfile() {
    document.getElementById('main').addEventListener('click', function (e) {
        if(e.target.tagName === 'BUTTON') {
            const profile = e.target.parentNode;
            const isInvisible = profile
                .querySelector('input[type=radio]:checked').value === 'lock';

            if(isInvisible) {
                return;
            }

            let div = profile.querySelector('div');
            let isVisible = div.style.display === 'block';
            div.style.display = isVisible ? 'none' : 'block';

            e.target.textContent = !isVisible ? 'Hide it' : 'Show more';
        }
    });
}