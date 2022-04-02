function addProduct(arr) {
    let product = '';
    let c = 0;
    let j = 1;
    const calorie = {

    };

    for (let i = 0; i < arr.length; i += 2) {
        product = arr[i];
        c = arr[j];
        j+= 2;
        calorie[product] = Number(c);
    }

    return calorie;
}

addProduct(['Yoghurt', '48', 'Rise', '138', 'Apple', '52']);
addProduct(['Potato', '93', 'Skyr', '63', 'Cucumber', '18', 'Milk', '42']);
