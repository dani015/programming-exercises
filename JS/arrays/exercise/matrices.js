function checker(arr) {
    let rowSum = [];


    let rtrn  = 'true';



    for (let r of arr) {
        let result = 0;

        for (let i = 0; i < r.length; i++) {
            result += r[i];


        }
        rowSum.push(result);
    }

    for (let r of rowSum) {
        for (let i = 0; i < rowSum.length; i++) {
            rowSum.sort(function (a, b){return a - b})
            let min = rowSum[0];
            let max = rowSum.slice(-1);

            if(min != max) {
                rtrn = 'false';
            }
        }
    }

    return rtrn;

}

console.log(checker([[4, 5, 6],
    [6, 5, 4],
    [5, 5, 5]]

));

console.log(checker([[11, 32, 45],
    [21, 0, 1],
    [21, 1, 1]]


));
console.log(checker([[1, 0, 0],
    [0, 0, 1],
    [0, 1, 0]]

));
