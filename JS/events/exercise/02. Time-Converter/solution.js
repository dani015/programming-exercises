function attachEventsListeners() {
    const days = document.getElementById('daysBtn');
    const daysInput = document.getElementById('days');

    const hours = document.getElementById('hoursBtn');
    const hoursInput = document.getElementById('hours');

    const minutes = document.getElementById('minutesBtn');
    const minInput = document.getElementById('minutes');

    const seconds = document.getElementById('secondsBtn');
    const secondsInput = document.getElementById('seconds');

    days.addEventListener('click', function (e){

        hoursInput.value = daysInput.value * 24;
        minInput.value = hoursInput.value * 60;
        secondsInput.value = minInput.value * 60;
    });
    hours.addEventListener('click', function (e){

        daysInput.value = hoursInput.value / 24;
        minInput.value = hoursInput.value * 60;
        secondsInput.value = minInput.value * 60;
    });
    minutes.addEventListener('click', function (e){

        hoursInput.value = minInput.value / 60;
        secondsInput.value = minInput.value * 60;
        daysInput.value = hoursInput.value / 24;
    });
    seconds.addEventListener('click', function (e){
        minInput.value = secondsInput.value / 60;
        hoursInput.value = minInput.value / 60;
        daysInput.value = hoursInput.value / 24;



    });

}