function sorter(arr) {
    arr.sort((a, b) => (a.charCodeAt(0) - 97) - (b.charCodeAt(0) - 97));
    arr.sort((a,b) => a.length - b.length);


    for (let arrElement of arr) {
        console.log(arrElement);
    }
}

sorter(['test',
    'Deny',
    'omen',
    'Default']


);