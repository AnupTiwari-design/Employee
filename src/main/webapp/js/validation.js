/**
 * 
 */

function validate() {
    let u = document.getElementById("u").value;
    let p = document.getElementById("p").value;

    if (u === "" || p === "") {
        alert("Fill all fields");
        return false;
    }
    return true;
}