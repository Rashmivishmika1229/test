let liked = false;
let likes = 0;

const button = document.getElementById("likeBtn");
const counter = document.getElementById("likeCount");

button.addEventListener("click", function(){

    if(!liked){
        liked = true;
        likes++;
        button.textContent = "Liked";
    }else{
        liked = false;
        likes--;
        button.textContent = "Like";
    }

    counter.textContent = likes + (likes === 1 ? " Like" : " Likes");
});