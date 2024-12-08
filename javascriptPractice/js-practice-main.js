console.log("Hello World");
const btn = document.getElementById("btn");
const hiDiv =document.getElementById("hi-div");

const paragraph  = document.createElement("p");
paragraph.style.fontSize = "2rem";
hiDiv.append(paragraph);

btn.addEventListener("click",(event)=>{
    event.preventDefault();

    let result = confirm("Hi, do you feel good today?");
    if(result){
        paragraph.textContent = `Yes, that's great day for me :)`;
    }else{
        paragraph.textContent = `No, it's bad day for me :(`;
    }   
})

const paragraph2 = document.getElementById("name");
const btn2 = document.getElementById("btn2");

let p2 = () => {
    console.log("Hello");
    let result = prompt("Please enter your name");

    if (result === null || result.trim() === "") {
        alert("You did not enter a name!");
    } else {
        paragraph2.textContent = `My name is ${result}`;
        paragraph2.style.display = "block";
        paragraph2.style.fontSize = "3rem";
        paragraph2.style.color = "purple"
    }
};

// Butona tıklama olayını bağlayın
btn2.onclick = p2;