

window.onload = function () {
    getProfile();
    document.getElementById("updateButton").addEventListener('click', updateForm)
}




function updateForm(theEvent) {
    //we want the page to access the getProfile() function again to reload itself with updated fields
    newUser();
}


async function getProfile() {

   //Ajax logic to get profile items upon load window load

    

}



async function updateProfile() {

   //Ajax logic to get input from user and send to server via JSON (All info sends in one JSON upon button click)

    

}