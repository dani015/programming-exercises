function heroicInventory(input) {
    let result = [];

    for (let i of input) {

        let [name, level, items] = i.split(' / ');
        level = Number(level);
        items = items ? items.split(', ') : [];
        result.push({name,level,items});
    }

    return JSON.stringify(result);
}

console.log(heroicInventory(['Jake / 1000 / Gauss, HolidayGrenade']));