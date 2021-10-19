var newsList;
(function getNew(){
    var xhttp = new XMLHttpRequest();
    var obj = this;
    xhttp.onreadystatechange = function(){
        if(xhttp.readyState === 4 && xhttp.status === 200){
            newsList=JSON.parse(xhttp.response);
            obj.displayNews();  
        }
    };
    xhttp.open('GET','http://localhost:3000');
    xhttp.send();
})();
function displayNews(){
    let newsDispCont = newsList.map((articles)=>`
    <br>
    <div class="card">
        <img src=${articles.urlToImage}><br>
        <h4>${articles.title}</h4>
        - ${articles.author}<br>
        <div class="card-body">
            <p>${articles.description}<br>${articles.content}</p>
        </div>
    </div>`);
    console.log(newsDispCont);
   let element = document.getElementById('newsList');
   let innerHTML = "";
   for(let index = 0; index<newsDispCont.length; index++){
       innerHTML = innerHTML.concat(newsDispCont[index]);
   }
   element.innerHTML=innerHTML;
}