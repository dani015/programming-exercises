function solve() {
  let input = document.getElementById('input').value;
  let arr = [];
  let sentences = input.split('.');


  if(sentences.length >= 3) {
      for (let i = 0; i < 3; i++) {

              arr.push(sentences[i]);
              arr.slice(i);


      }
      let output = "<p> ";
      for (let a of arr) {
          if(a != '') {
              output += a;
          }
      }
      output += " </p>"
      console.log(output);
  }


}