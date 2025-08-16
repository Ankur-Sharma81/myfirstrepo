let str = ""
let l1 =  document.getElementById("input")
let l2 = document.getElementById("b1")
let u1 = document.getElementById("list")
l1.addEventListener("input", function(event) {
    console.log(event.target.value)
    str = event.target.value
})
b1.addEventListener("click", function() {
    let listitem = document.createElement("li")
    listitem.innerText = str;
    u1.appendChild(listitem)
})
fetch("https://dummy/json.com/todos")
    .then(function(response) {
        return response.json();
    })
    .then(function(data) {
        console.log(data);
    for(let i = 0; i< data.todos.length; i++) {
        let listitem = document.createElement("li")
        listitem.innerText = data.todos[i].todo;
        u1.appendChild(listitem)
    } 
    })