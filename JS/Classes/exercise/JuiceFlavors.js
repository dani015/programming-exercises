function solve(juices) {
    let j = {};

    for (let i = 0; i < juices.length; i++) {
        const type = juices[i].split(' => ')[0];
        const quantity = juices[i].split(' => ')[1];

            if(type in j) {

                let last = j[type];
                if(last < 1) {
                    delete j[type]
                    j[type] = (last + Number((quantity / 1000)));
                }
                j[type] = (last + Number((quantity / 1000)));
            } else {
                j[type] = Number((quantity / 1000));
            }
    }

    let final = {};

    for (let e in j) {
        if(j[e] >= 1) {
            final[e] = Math.trunc(j[e]);
            console.log(e + ' => ' + final[e])
        }

    }
}

solve(['Kiwi => 234',
    'Pear => 2345',
    'Watermelon => 3456',
    'Kiwi => 4567',
    'Pear => 5678',
    'Watermelon => 6789']

);