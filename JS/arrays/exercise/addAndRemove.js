function solve(arr) {
    let result = [];
    let n = 1;

    for (let i = 0; i < arr.length; i++) {
        if(arr[i] == 'add') {
            result.push(n);
            n = n + 1;

        } else if(arr[i] == 'remove') {
            result.toString();
            result.splice(-1);
            n = n + 1;
        }
    }

    if(result.length == 0) {
        return 'Empty';
    } else {
        return result.join('\n');
    }
}

solve(['add',
    'add',
    'remove',
    'add',
    'add']



);