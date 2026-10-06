let intentos = 3
let saldo = 3000000

function consultarSaldo(saldo) {
    console.log("El saldo es: " + saldo)
}

let user = prompt("Ingrese su usuario: ")
while (intentos > 0) {
    if (user == "admin") {
        let pin = prompt("Ingrese su pin o clave: ")
        if (pin == 1234) {
            console.log("****** Bievenido, " + user + " ******")
            let repetir = true
            while (repetir) {
                let opcion = prompt("Seleccione: \n1 - Consultar Saldo\n2 - Retirar Dinero\n3 - Transferir Dinero\n4 - Consignar Dinero\n5 - Cerrar Sesión")
                if (opcion == 1) {
                    consultarSaldo(saldo)
                } else if(opcion == 5) {
                    repetir = false
                }
            }
            intentos = 0
        } else {
            alert("Pin/Clave incorrecta" + "Tiene " + (intentos - 1) + " Intentos")
            intentos--
        }
    } else {
        alert("Usuario no existe, primero se debe registrar")
        intentos = 0
    }
}
