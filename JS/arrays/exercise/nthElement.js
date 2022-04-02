function nth(arr, n) {
    let i = 0;
    let result = [];


    while (i < arr.length){
        result.push(arr[i]);

        i = i + n;
    }

    return result;
}

console.log(nth(['dsa',
        'asd',
        'test',
        'tset'],
    2

));