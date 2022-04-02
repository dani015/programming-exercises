function create(words) {
   const content = document.getElementById('content');

   for (let i = 0; i < words.length; i++) {
      const div = document.createElement('div');
      const paragraph = document.createElement('p');
      paragraph.textContent = words[i];
      paragraph.style.display = 'none';
      div.appendChild(paragraph);
      content.appendChild(div);


   }

   content.addEventListener('click', function(e) {
         if(e.target.tagName == 'DIV') {
            const div = e.target.children[0];
            div.style.display = 'block';

         }
   });
}