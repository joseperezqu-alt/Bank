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
   [git clone https://github.com/tuusuario/bankapp.git](https://github.com/joseperezqu-alt/Bank.git)
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

---
## Cabe recalcar que el proyecto se fue ejecutando en el mismo orden que puese las fotografias, Asi que no te sorprendas por no ver la cuenta C003 todavia
---

## 🧠 Descripción de los Endpoints principales (Swagger)

### 🟢 `GET /api/bank/accounts`
Obtiene todas las cuentas registradas en el sistema que hasta ese momento eran 2.
- **Uso:** Consultar todas las cuentas.
  GET http://localhost:8080/api/bank/accounts
  ```
*<img width="1835" height="928" alt="swaAccounts" src="https://github.com/user-attachments/assets/1192f625-d22d-4707-8808-734e904db7e2" />* 
  En el pantallaso no se alcanza ver todo pero muestra ambas cuentas creadas para el ejemplo Juan Perez y Sofia.
---

### 🟢 `GET /api/bank/accounts/{id}`
Devuelve la información de una cuenta específica.
  GET http://localhost:8080/api/bank/accounts/C001
*<img width="1837" height="920" alt="swaAcoountID" src="https://github.com/user-attachments/assets/04cdcd14-279d-4a3c-8958-756b8e48e366" />*

---

### 🟠 `POST /api/bank/accounts`
Crea una nueva cuenta en el sistema. 
*<img width="1838" height="921" alt="swaAccountC002" src="https://github.com/user-attachments/assets/8662278b-bb9f-4227-a1ad-f41dda3dde23" />*
En este caso cree para un mismo cliente una segunda cuenta de ahorros ya que tenia una corriente
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

🖼️ **Captura del depósito o tranferencia:**  
*<img width="1835" height="926" alt="trnsaccion" src="https://github.com/user-attachments/assets/521395db-2e4a-4cb5-ba1c-ac153decc22a" />
<img width="1837" height="932" alt="transValidacion" src="https://github.com/user-attachments/assets/ecb07a84-c7b0-486d-9ded-92b9918991f4" />
aqui se visualiza en saldo actualizado
<img width="1837" height="927" alt="Actualizacionsaldo" src="https://github.com/user-attachments/assets/254b07dd-f4be-4326-b864-5ee74b8ef35e" />

---

## 📁 Archivos importantes
- `/src/main/resources/data/customers.json` → Contiene los clientes.
- `/src/main/resources/data/accounts.json` → Contiene las cuentas.
- `/src/main/java/com/logsoluprobl/appbank/config/OpenApiConfig.java` → Configuración Swagger.
- `/src/main/java/com/logsoluprobl/appbank/controller/BankController.java` → Endpoints REST.
- `/src/main/java/com/logsoluprobl/appbank/service/BankService.java` → Lógica del negocio.

---

## 📸 Evidencia General Thunder
   *<img width="1855" height="1033" alt="thunther" src="https://github.com/user-attachments/assets/7d433a85-220a-485a-9131-1323be3f4b89" />*
---
NOTA:
Revise el controller porque use String (y no Long), ya que mis IDs como "A001" no son números. este fue un error que encontre en ("/customers/{customerId}/accounts") ya que tenia @PathVariable Long en lugar de String

---

## 👨‍💻   
**Curso:** Programación Orientada a Objetos  
**Profesor:** [Daniel Felipe]   

---

## 🏁 Conclusión
Este proyecto demuestra la aplicación práctica de los principios de **Programación Orientada a Objetos (POO)** junto con el uso de **Spring Boot** y **Swagger**, facilitando la creación, prueba y documentación de servicios REST en un entorno real de desarrollo.
