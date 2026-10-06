let intentos = 3

let user = prompt("Ingrese su usuario: ")
while (intentos > 0) {
    if (user == "admin") {
        let pin = prompt("Ingrese su pin o clave: ")
        if (pin == 1234) {
            console.log("****** Bievenido, " + user + " ******")
        } else {
            alert("Pin/Clave incorrecta" + "Tiene " + (intentos - 1) + " Intentos")
            intentos--
        }
    } else {
        alert("Usuario no existe, primero se debe registrar")
        intentos = 0
    }
}
