function factory(o) {
    let power = o.power;
    let w = o.wheelsize;
    const engine = {};
    function checkEngine(power) {
        if(power <= 90) {
            engine['power'] = 90;
            engine['volume'] = 1800;
        } else if(power <= 120) {
            engine['power'] = 120;
            engine['volume'] = 2400;
        } else if(power <= 200) {
            engine['power'] = 200;
            engine['volume'] = 3500;
        }
    }

    function checkWheels(wheel) {
        if(wheel % 2 == 0) {
            w = w - 1;
        }
    }
    let model = o.model;
    checkEngine(power);

    const carriage = {
        type: o.carriage,
        color: o.color
    };
    checkWheels(w);
    let wheels = [w, w, w, w];

    const car = {
      model: model,
      engine: engine,
      carriage: carriage,
      wheels: wheels
    };

    return car;

}

console.log(factory({ model: 'Opel Vectra',
    power: 110,
    color: 'grey',
    carriage: 'coupe',
    wheelsize: 17 }

));