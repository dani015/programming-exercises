class ChristmasDinner {
    constructor(budget) {
        if(budget < 0) throw new Error("The budget cannot be a negative number")
        this.budget = budget
        this.dishes = []
        this.products = []
        this.guests = {}
    }

    shopping(product) {
        this.budget -= product[1];
        this.products.push(product[0]);
        if(this.budget < 0) throw new Error("Not enough money to buy this product")
        else console.log("You have successfully bought " + product[0])
    }

    recipes(recipe) {
        //console.log(recipe.productsList, this.products)
        let recipeName = recipe.recipeName
        let productList = recipe.productsList

        for (let p of productList) {
            if(!this.products.includes(p)) throw new Error("We do not have this product")
        }



        this.dishes.push({recipeName, productList})
        console.log(`${recipe.recipeName} has been successfully cooked!`)
    }

    inviteGuests(name, dish) {

        for (let x of this.dishes) {
            if(name in x) throw new Error("We do not have this dish")

        }

        if (name in this.guests) throw new Error("This guest has already been invited");

        this.guests[name] = dish



    }

    showAttendance() {
            let finalString = "";

            for (const [key, value] of Object.entries(this.guests)) {

                for (let i of this.dishes) {
                    if (i.recipeName === value) {
                        finalString += `${key} will eat ${value}, which consists of ${i.productList.join(", ")}\n`

                    }
                }

            }

            return finalString
    }
}

let dinner = new ChristmasDinner(-1);

dinner.shopping(['Salt', 1]);
dinner.shopping(['Beans', 3]);
dinner.shopping(['Cabbage', 4]);
dinner.shopping(['Rice', 2]);
dinner.shopping(['Savory', 1]);
dinner.shopping(['Peppers', 1]);
dinner.shopping(['Fruits', 40]);
dinner.shopping(['Honey', 10]);

dinner.recipes({
    recipeName: 'Oshav',
    productsList: ['Fruits', 'Honey']
});
dinner.recipes({
    recipeName: 'Folded cabbage leaves filled with rice',
    productsList: ['Cabbage', 'Rice', 'Salt', 'Savory']
});
dinner.recipes({
    recipeName: 'Peppers filled with beans',
    productsList: ['Beans', 'Peppers', 'Salt']
});

dinner.inviteGuests('Ivan', 'Oshav');
dinner.inviteGuests('Petar', 'Folded cabbage leaves filled with rice');
dinner.inviteGuests('Georgi', 'Peppers filled with beans');

console.log(dinner.showAttendance())