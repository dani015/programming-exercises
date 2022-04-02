function increase(arr) {
    let result = [];
    let n = 0;

    result.push(arr[0]);
    for (let i = 0; i < arr.length; i++) {
        if(result[n] <= arr[i + 1]) {
            result.push(arr[i + 1]);
            n++;
        }
    }

    return result;

}

console.log(increase([1,
    3,
    8,
    4,
    10,
    12,
    3,
    2,
    24]



));