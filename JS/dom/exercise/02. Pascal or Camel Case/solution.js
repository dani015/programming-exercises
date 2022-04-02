function solve() {
  let input = document.getElementById('text').value;
  let type = document.getElementById('naming-convention').value;
  let arr = input.split(' ');

  let final = '';
  switch (type) {
      case 'Pascal Case':
          for (let a of arr) {
              final += a.charAt(0).toUpperCase() + a.toLowerCase().slice(1);
          }
          break;

      case 'Camel Case':
          for (let i = 0; i < arr.length; i++) {
              if(i != 0) {
                  final += arr[i].charAt(0).toUpperCase() + arr[i].toLowerCase().slice(1);
              } else {
                  final += arr[0].toLowerCase();
              }
          }
          break;


      default:
          final = 'Error!';
  }


    document.getElementById("result").textContent = final;
    final = '';

}