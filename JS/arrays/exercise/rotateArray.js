function rotate(arr, s) {
    for (let i = 0; i < s; i++) {
        arr.unshift(arr.pop());
    }

    console.log(arr.join(' '));
}

rotate(['1',
    '2',
    '3',
    '4'], 2
);