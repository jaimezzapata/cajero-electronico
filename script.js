let user = prompt("Ingrese su usuario: ")
if (user == "admin") {
    let pin = prompt("Ingrese su pin o clave: ")
    if (pin == 1234) {
        console.log("****** Bievenido, " + user + " ******")
    } else {
        alert("Pin/Clave incorrecta")
    }
} else {
    alert("Usuario no existe, primero se debe registrar")
}