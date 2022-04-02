function sorter(arr) {
    arr.sort((a, b) => a.localeCompare(b));


    let i = 1;

    for (let e of arr) {
        console.log(i + '.' + e)
        i++;
    }

}

sorter(["John", "Bob", "Christina", "Ema"]);