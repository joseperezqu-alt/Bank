# Bank
## fecha de ejecucion 23/Sep/2025
### Segumiento de proyecto final_banco
##Profe primero me disculpo por la entrega tarde ya que habia actualizado el proyecto y el readme pero no sabia que habia que darle al commit change, pense que se guardaba automaticamente◑﹏◐

<center><img width="275" height="700" alt="pakage" src="https://github.com/user-attachments/assets/eef16c27-bccb-4de0-8ed9-aa979cd12d45" /></center>

##📦 com.logsoluprobl.appbank
Contiene la clase principal del proyecto (AppbankApplication), que sirve como punto de entrada para ejecutar la aplicación bancaria.

##📦 com.logsoluprobl.appbank.controller
BankController: Gestiona las operaciones entre el usuario y el sistema bancario. Se comunica con los servicios (service) para realizar operaciones como crear cuentas, consultar saldos o registrar transacciones.

##📦 com.logsoluprobl.appbank.exception
DomainException: Define excepciones personalizadas que se lanzan cuando ocurre un error relacionado con la lógica del dominio bancario (por ejemplo, fondos insuficientes o cuentas inexistentes).

##📦 com.logsoluprobl.appbank.model
Contiene las clases que representan las entidades principales del sistema.
Account: Clase base para diferentes tipos de cuentas. Incluye atributos como número de cuenta, saldo y propietario.
CheckingAccount: Representa una cuenta corriente con operaciones específicas (por ejemplo, sobregiros).
Customer: Modela la información del cliente, como nombre, identificación y cuentas asociadas.
Money: Maneja la lógica relacionada con valores monetarios, conversiones o cálculos precisos.
SavingsAccount: Representa una cuenta de ahorros con intereses.
Transaction: Registra cada operación bancaria (depósito, retiro, transferencia).

##📦 com.logsoluprobl.appbank.repository
Define cómo se almacenan o recuperan los datos.
FileManager: Gestiona la lectura y escritura de datos en archivos locales.
JsonRepository: Implementa la persistencia usando archivos JSON para simular una base de datos.

##📦 com.logsoluprobl.appbank.service
Contiene la lógica de negocio del banco.
BankService: Interfaz que define las operaciones principales del servicio bancario
BankServiceImpl: Implementa la interfaz, aplicando las reglas de negocio (validaciones, cálculos de intereses, etc.).
InterestStrategy: Define el comportamiento general para el cálculo de intereses mediante el patrón Strategy.

##📦 com.logsoluprobl.appbank.service.strategy
SimpleRateStraegy: Calcula los intereses usando una tasa fija.
TieredRateStrategy: Calcula intereses por tramos o niveles, según el saldo de la cuenta.

##📦 com.logsoluprobl.appbank.util
JsonUtil: Proporciona métodos utilitarios para serializar y deserializar objetos en formato JSON.


