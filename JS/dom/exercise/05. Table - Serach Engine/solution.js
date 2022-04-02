function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);
   let arr = [...document.querySelectorAll('tbody tr')];

   function onClick() {
      let input = document.getElementById("searchField").value;
      for (let row of arr) {
         if(row.textContent.includes(input)) {
            row.setAttribute('class', 'select');
         } else {
            row.removeAttribute('class');
         }
      }

   }
}