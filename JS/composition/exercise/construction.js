function solve(o) {
    if(o.dizziness == true) {
        let h = o.levelOfHydrated;
        o.levelOfHydrated = o.weight * 0.1 * o.experience + h;
        o.dizziness = false;
    }


    return o;
}

console.log(solve({ weight: 95,
    experience: 3,
    levelOfHydrated: 0,
    dizziness: false }


));