function solve(input) {

        let arr = [];



    while (input.length) {
        let [name, la, lo] = input.shift().split(' | ');


        arr.push({name, la, lo});

    }

    let result = [];

    for (let a of arr) {
        let Town = a.name;
        let Latitude = a.la;
        let Longitude = a.lo;

        Town = Town.replace('| ', '');
        Longitude = Longitude.replace(' |', '')

        if(Town == 'Town') {
            continue;
        } else {
            result.push({Town, Latitude: parseFloat(Number(Latitude).toFixed(2)), Longitude: parseFloat(Number(Longitude).toFixed(2))});
        }

    }

    return JSON.stringify(result);


}

console.log(solve(['| Town | Latitude | Longitude |',
    '| Sofia | 42.696552 | 23.32601 |',
    '| Beijing | 39.913818 | 116.363625 |']
));