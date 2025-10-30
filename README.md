# 🏦 BankApp – Proyecto Final de Programación Orientada a Objetos

## 📖 Descripción general
BankApp es una aplicación bancaria desarrollada con **Spring Boot**, diseñada para simular las operaciones básicas de un banco, tales como la **creación de cuentas**, **registro de clientes**, **consulta de información** y **manejo de saldos**.  
El proyecto está completamente documentado e integrado con **Swagger (OpenAPI)**, lo que permite visualizar y probar todos los endpoints desde el navegador.

---

## 🧩 Estructura del proyecto

```
bank-app/
├── src/
│   ├── main/java/com/logsoluprobl/appbank/
│   │   ├── app/           # Clase principal (BankAppApplication.java)
│   │   ├── model/         # Modelos (Account, Customer)
│   │   ├── service/       # Lógica de negocio
│   │   ├── repository/    # Persistencia con JSON
│   │   ├── controller/    # Controladores REST
│   │   ├── exception/     # Excepciones personalizadas
│   │   ├── util/          # Lectura y escritura de JSON
│   │   └── config/        # Configuración de Swagger
│   └── resources/
│       ├── application.properties
│       ├── data/
│       │   ├── customers.json
│       │   └── accounts.json
│       └── static/
└── pom.xml
```
---

## 📁 Archivos importantes
- `/src/main/resources/data/customers.json` → Contiene los clientes.
- `/src/main/resources/data/accounts.json` → Contiene las cuentas.
- `/src/main/java/com/logsoluprobl/appbank/config/OpenApiConfig.java` → Configuración Swagger.
- `/src/main/java/com/logsoluprobl/appbank/controller/BankController.java` → Endpoints REST.
- `/src/main/java/com/logsoluprobl/appbank/service/BankService.java` → Lógica del negocio.
---

## ⚙️ Tecnologías utilizadas
- ☕ **Java 17**
- 🧱 **Spring Boot**
- 📘 **Swagger (OpenAPI 3)**
- 💾 **JSON** (para persistencia de datos)
- ⚡ **Thunder Client (VSCode)** / **Postman**
- 🖥️ **Maven**

---

## 🚀 Ejecución del proyecto
1. Clona el repositorio:
   ```bash
   https://github.com/joseperezqu-alt/Bank.git
   ```
2. Abre el proyecto en Visual Studio Code.
3. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```
4. Abre Swagger en tu navegador:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

## 🧠 Ejecuciones de los Endpoints (Thunder)

### 🟣 `POST /api/bank/customers`
**Crear Cliente**
<img width="1480" height="992" alt="Thuncreateclient" src="https://github.com/user-attachments/assets/ee99208b-45f0-4e81-ae62-9f3a14614565" />

---
### ⚫ `GET /api/bank/customers`
**Pedir Todos Los Clientes**. En caso de querer filtrar por ID solo hay que agregar para este caso (/C001 o /C002) depende de como lo desees registrar
<img width="1480" height="991" alt="ThunpedirClient" src="https://github.com/user-attachments/assets/5892b524-2949-48b0-8d63-df8c38736b69" />

---
### ⚪ `POST /api/bank/customers/001/accounts`
**Crear Cuenta Bancaria**. (para la cuenta bancaria solo se aceptan numeros ya que esta declarada como Long)
<img width="1472" height="988" alt="ThunrarcuentaBank" src="https://github.com/user-attachments/assets/833fb752-b2a9-43f4-b72f-f3643a47846b" />

---
### 🔴 `GET api/bank/customers/002/accounts
**Muestra Todas Las Cuentas De Un Usuario**. En caso de que desees filtrar por ID /api/bank/accounts/001
<img width="1472" height="992" alt="ThuntodasLasCuentasCliente" src="https://github.com/user-attachments/assets/fc2f203e-5404-411d-976f-125bcad6b099" />

---
### 🟠 POST `/api/bank/accounts/001/deposit?amount=200000`
**Depositar**. En este caso se deposito a la cuenta 001 un monto de 200.000 US 
<img width="1470" height="988" alt="ThunDeposito" src="https://github.com/user-attachments/assets/0632a2d3-15e8-41e2-8938-c61fd184a192" />

---
### 🟡 `POST /api/bank/accounts/001/withdraw?amount=50000`
**Retirar Dinero**
<img width="1468" height="985" alt="Thunretirar" src="https://github.com/user-attachments/assets/bc4556f0-9a24-4247-99ba-63dba1cd24eb" />

---
### 🔵 `POST /api/bank/accounts/001/transfer`
**Trasferir Entre Cuentas**. En este caso se le tranfirio a la cuenta 002 30.000
<img width="1467" height="990" alt="ThunTransfer" src="https://github.com/user-attachments/assets/a8ee1031-d904-427f-b19b-0f1f4f7afd70" />

---
### 🟢 `GET /api/bank/accounts/001/transactions`
**Consultar Trasferencias De Una Cuenta**
<img width="1473" height="988" alt="ThunConsultarTransfer" src="https://github.com/user-attachments/assets/49611b7c-8968-45a3-a85f-421458d2275a" />

---
### ⚪ `GET /api/bank/accounts/002/transactions`
**Aplicar Interes A Una Cuenta**
<img width="1476" height="990" alt="AplicarINterst" src="https://github.com/user-attachments/assets/0735e55b-8b38-4148-a701-47e9ad8ad0ae" />

---
## 🧠 Ejecuciones de los Endpoints principales (Swagger)
Cabe recalcar que el proyecto se fue ejecutando en el mismo orden en que se pusieron las fotografias, Asi que no te sorprendas por no ver la cuenta C003 todavia
Ademas este se ejecuto con otros parametros (clientes, cuentas, etc) distintos al thunder.

---
### 🟢 `GET /api/bank/accounts`
Obtiene todas las cuentas registradas en el sistema que hasta ese momento eran 2.

*<img width="1835" height="928" alt="swaAccounts" src="https://github.com/user-attachments/assets/1192f625-d22d-4707-8808-734e904db7e2" />* 
  En el pantallaso no se alcanza ver todo pero muestra ambas cuentas creadas. Para el ejemplo en ese momento Juan Perez y Sofia.
---

### 🟢 `GET /api/bank/accounts/{id}`
Devuelve la información de una cuenta específica.

*<img width="1837" height="920" alt="swaAcoountID" src="https://github.com/user-attachments/assets/04cdcd14-279d-4a3c-8958-756b8e48e366" />*

---

### 🟠 `POST /api/bank/accounts`
Crea una nueva cuenta bancaria en el sistema. 

*<img width="1838" height="921" alt="swaAccountC002" src="https://github.com/user-attachments/assets/8662278b-bb9f-4227-a1ad-f41dda3dde23" />*
Se hizo para un mismo cliente una segunda cuenta en este caso SAVINGS, ya que el mismo cliente solo contaba con una, (CHEKING)
*<img width="1837" height="930" alt="swaAccountC0022" src="https://github.com/user-attachments/assets/219841c1-4d8e-44c8-b698-d3b70b8172a8" />*

---

### 🟠 `POST /api/bank/customers`
Registra un nuevo cliente. 

*<img width="1837" height="873" alt="swacustomerC003" src="https://github.com/user-attachments/assets/8abdef5e-46fd-4597-899e-f7a7b02202b2" />*

---

### 🟡 `GET /api/bank/customers`
Obtiene la lista de clientes registrados.

*<img width="1836" height="931" alt="clientesRegistrados" src="https://github.com/user-attachments/assets/d38534d5-ff98-4e65-a180-6afe68149d19" />*

---

### 🔵 `PUT /api/bank/accounts/{id}/deposit`
Actualiza el saldo de una cuenta al realizar un depósito o transferencia.

*<img width="1835" height="926" alt="trnsaccion" src="https://github.com/user-attachments/assets/521395db-2e4a-4cb5-ba1c-ac153decc22a" />
<img width="1837" height="932" alt="transValidacion" src="https://github.com/user-attachments/assets/ecb07a84-c7b0-486d-9ded-92b9918991f4" />

aqui se visualiza el saldo depositado o transferido
<img width="1837" height="927" alt="Actualizacionsaldo" src="https://github.com/user-attachments/assets/254b07dd-f4be-4326-b864-5ee74b8ef35e" />

---

## 📸 Evidencia General
<table>
  <tr>
    <td align="center"><img width="900" height="450" alt="generalswagger" src="https://github.com/user-attachments/assets/c6b97cfb-de1f-4784-9a90-537e5ec41bd0" /></td>
    <td align="center"><img width="900" height="450" alt="generalThunder" src="https://github.com/user-attachments/assets/26cda6d1-c8db-41b1-923e-2be832dba926" /></td>
  </tr>
  <tr>
    <td align="center"><b>Swagger UI</b></td>
    <td align="center"><b>Thunder</b></td>
  </tr>
</table>

---
NOTA:
Revise el controller porque deseaba usar String (y no Long), ya que mis IDs como "A001" no son números. este fue un "Error" que encontre en ("/customers/{customerId}/accounts") ya que tenia @PathVariable Long en lugar de String y yo queria utilizar IDs como A008 etc

---

## 👨‍💻   
**Curso:** Logica Para Solucion De Problemas  
**Profesor:** [Daniel Felipe]   

---

## 🏁 Conclusión
Este proyecto demuestra la aplicación práctica de los principios de **Programación Orientada a Objetos (POO)** junto con el uso de **Spring Boot** y **Swagger**, facilitando la creación, prueba y documentación de servicios REST en un entorno real de desarrollo.
