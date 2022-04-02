function TicketHandler(arr, sortingMethod) {

    function print() {
        let final = [];

        for (let i = 0; i < arr.length; i++) {
            let split = arr[i].split('|');
            class Ticket {
                constructor() {
                    this.destination = split[0];
                    this.price = Number(split[1]);
                    this.status = split[2];
                }

                get _destination() {
                    return this.destination;
                }

                get _price() {
                    return this.price;
                }

                get _status() {
                    return this.status;
                }
            }

            final.push(new Ticket());
        }

        function sort() {
            if(sortingMethod == 'destination') {
                final.sort((a, b) => a._destination.localeCompare(b._destination));
            } else if(sortingMethod == 'price') {
                final.sort((a, b) => a._price - b._price);
            } else if(sortingMethod == 'status') {
                final.sort((a, b) => a._status.localeCompare(b._status));
            }
        }
        sort();

        return final
     }
    return print();
}

let myTicket = new TicketHandler(['Philadelphia|94.20|available',
    'New York City|95.99|available',
    'New York City|95.99|sold',
    'Boston|126.20|departed'], 'status'
);

console.log(myTicket)
