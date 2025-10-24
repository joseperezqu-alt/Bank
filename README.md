# 🏦 Bank Project  
### 📅 Fecha de ejecución: 23/Sep/2025  
### 📋 Seguimiento de proyecto final — Banco

> **Nota para el profesor:**  
> Primero, me disculpo por la entrega tarde. Había actualizado el proyecto y el README, pero no sabía que era necesario darle a **“Commit changes”**; pensé que se guardaba automáticamente. ◑﹏◐

---

<center>
  <img width="275" height="700" alt="Estructura de paquetes" src="https://github.com/user-attachments/assets/eef16c27-bccb-4de0-8ed9-aa979cd12d45" />
</center>

---

## 📦 Estructura del Proyecto

### 🏁 `com.logsoluprobl.appbank`
Contiene la **clase principal** del proyecto (`AppbankApplication`), que sirve como **punto de entrada** para ejecutar la aplicación bancaria.

---

### 🧭 `com.logsoluprobl.appbank.controller`
- **`BankController`**: Gestiona las operaciones entre el usuario y el sistema bancario.  
  Se comunica con los servicios (`service`) para realizar tareas como:
  - Crear cuentas  
  - Consultar saldos  
  - Registrar transacciones

---

### ⚠️ `com.logsoluprobl.appbank.exception`
- **`DomainException`**: Define excepciones personalizadas lanzadas ante errores de lógica del dominio bancario, como:
  - Fondos insuficientes  
  - Cuentas inexistentes  

---

### 🧩 `com.logsoluprobl.appbank.model`
Contiene las **entidades principales del sistema**:

- **`Account`** → Clase base para diferentes tipos de cuentas.  
  Atributos: número de cuenta, saldo y propietario.
- **`CheckingAccount`** → Representa una cuenta corriente con operaciones específicas (como sobregiros).
- **`Customer`** → Modela la información del cliente (nombre, identificación y cuentas asociadas).
- **`Money`** → Maneja la lógica de valores monetarios, conversiones o cálculos precisos.
- **`SavingsAccount`** → Representa una cuenta de ahorros con intereses.
- **`Transaction`** → Registra cada operación bancaria (depósitos, retiros, transferencias).

---

### 💾 `com.logsoluprobl.appbank.repository`
Define cómo se almacenan o recuperan los datos:

- **`FileManager`** → Gestiona la lectura y escritura de datos en archivos locales.  
- **`JsonRepository`** → Implementa la persistencia usando **archivos JSON**, simulando una base de datos.

---

### ⚙️ `com.logsoluprobl.appbank.service`
Contiene la **lógica de negocio del banco**:

- **`BankService`** → Interfaz que define las operaciones principales del servicio bancario.  
- **`BankServiceImpl`** → Implementa la interfaz, aplicando las reglas de negocio (validaciones, cálculos de intereses, etc.).  
- **`InterestStrategy`** → Define el comportamiento general para el cálculo de intereses usando el **patrón Strategy**.

---

### 📊 `com.logsoluprobl.appbank.service.strategy`
- **`SimpleRateStrategy`** → Calcula los intereses usando una tasa fija.  
- **`TieredRateStrategy`** → Calcula los intereses por **tramos o niveles**, según el saldo de la cuenta.

---

### 🧰 `com.logsoluprobl.appbank.util`
- **`JsonUtil`** → Proporciona métodos utilitarios para **serializar y deserializar objetos en formato JSON**.

---

### ✅ Resumen
Este proyecto implementa un sistema bancario modular con una arquitectura limpia y orientada a objetos.  
Cada paquete cumple una función específica dentro del flujo:
> **Controller → Service → Repository → Model**

---

**Al ingresar al Bank habran más readme:** [Donde explico las cosas que me parecen más curiosas]  
**Proyecto Aula:** Lógica y Solución de Problemas  
**Profesor:** [DANIEL FELIPE AGUDELO]

---


##📦 com.logsoluprobl.appbank.util
JsonUtil: Proporciona métodos utilitarios para serializar y deserializar objetos en formato JSON.


