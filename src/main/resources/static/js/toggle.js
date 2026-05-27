var currentUserIndex = 1;
var users = [
    { "name": "John Doe", "gender": "Male", "img": "johndoe.png" },
    { "name": "Jane Doe", "gender": "Female", "img": "janedoe.png" }
];

function toggleCard() {
    currentUserIndex = 1 - currentUserIndex;
    var nextUser = users[currentUserIndex];
    displayUser(nextUser);
}
function displayUser(user) {
    document.getElementById("userImage").src = user.img;
    document.getElementById("userGender").innerHTML = user.gender;
    document.getElementById("userName").innerHTML = user.name;
}