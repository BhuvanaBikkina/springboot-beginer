function getAndDisplayNextRandomUser() {
    fetch('/api/users')
        .then(function (res) {
            return res.json();
        })
        .then(function (data) {
            var userData = data[0];
            displayUser(userData);
        })
        .catch(function (err) {
            console.log(err);
        });
}

function displayUser(user) {
    // Update the DOM
    document.getElementById("userImage").src = user.image;
    document.getElementById("userName").innerHTML = user.name;
    document.getElementById("userGender").innerHTML = user.gender;
}