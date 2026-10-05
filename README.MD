# 🏧 Cajero Electrónico por Consola

Aplicación de consola desarrollada en **JavaScript** que simula el comportamiento básico de un cajero electrónico.

## 📋 Descripción

El objetivo del proyecto es practicar la lógica de programación, el manejo de datos y la interacción con el usuario por consola, implementando las operaciones más comunes de un cajero automático.

## ✨ Funcionalidades

- **Inicio de sesión:** el usuario ingresa con sus credenciales para acceder al cajero.
- **Validación de intentos:** se permiten un máximo de **3 intentos** de inicio de sesión; al superarlos, el acceso se bloquea.
- **Consultar saldo:** muestra el saldo disponible de la cuenta.
- **Retirar dinero:** descuenta del saldo el monto solicitado, siempre que haya fondos suficientes.
- **Transferir dinero:** envía dinero desde la cuenta actual hacia otra cuenta existente.
- **Consignar:** permite depositar dinero en la misma cuenta con la sesión iniciada.

## 📏 Reglas de negocio

| Operación | Regla |
|-----------|-------|
| Inicio de sesión | Máximo 3 intentos fallidos consecutivos |
| Retiro | El monto debe ser mayor a 0 y no puede superar el saldo |
| Transferencia | La cuenta destino debe existir; el monto debe ser mayor a 0 y no puede superar el saldo |
| Consignación | El monto debe ser mayor a 0 |


## 🚀 Instalación y ejecución

```bash
# Clonar el repositorio
git clone <url-del-repositorio>

# Entrar a la carpeta del proyecto
cd cajero-electronico

# Ejecutar la aplicación
node index.js
```

## 🖥️ Ejemplo de uso

```text
=== CAJERO ELECTRÓNICO ===
Usuario: juan
Contraseña: ****

Bienvenido, juan

1. Consultar saldo
2. Retirar dinero
3. Transferir dinero
4. Consignar
5. Salir

Seleccione una opción:
```

## 📁 Estructura sugerida

```text
cajero-electronico/
├── index.html      # Punto de entrada y menú principal
├── script.js       # Datos de las cuentas y operaciones
└── README.md
```

## 🧪 Casos a probar

- Iniciar sesión con credenciales correctas.
- Fallar el inicio de sesión 3 veces y verificar el bloqueo.
- Retirar un monto mayor al saldo disponible.
- Transferir a una cuenta que no existe.
- Consignar y comprobar que el saldo se actualiza.

## 📄 Licencia

Proyecto con fines educativos.