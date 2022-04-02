function sorter(arr) {
    let result = [];

    arr.sort(function(a, b){return a-b});


    while (arr.length > 0) {
        result.push(arr.shift());
        result.push(arr.pop());

    }

    return result;


}

console.log(sorter([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));