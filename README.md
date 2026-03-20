# POM 
Manuel Herrera

Este proyecto es una suite de pruebas automatizadas para la aplicación web [SauceDemo](https://www.saucedemo.com/) utilizando **Java**, **Selenium WebDriver**, **TestNG** y sigue el patrón de diseño **Page Object Model (POM)** con **Page Factory**.

## Tecnologías Utilizadas
* **Lenguaje:** Java 11
* **Framework de Pruebas:** TestNG
* **Automatización Web:** Selenium WebDriver (v4.18.1)
* **Gestión de Drivers:** WebDriverManager (Manejo automático de ChromeDriver)
* **Gestión de Dependencias:** Maven

## Arquitectura del Proyecto
El proyecto sigue el patrón **Page Object Model**, separando la lógica de los elementos de la página de la lógica de las pruebas:

* **`src/main/java/pages`**: Contiene las clases de página.
    * `BasePage`: Inicializa Page Factory y maneja esperas explícitas (`WebDriverWait`).
    * `LoginPage`, `InventoryPage`, `CartPage`, `CheckoutPage`: Representan las páginas del sitio y sus interacciones.
* **`src/test/java/tests`**: Contiene los scripts de prueba.
    * `BaseTest`: Configura las precondiciones (`@BeforeMethod`) como el modo incógnito y las postcondiciones (`@AfterMethod`).
    * `PurchaseTest`, `CartTest`, `LogoutTest`: Escenarios de prueba específicos.

## Escenarios Automatizados
1.  **Purchase a Product**: Flujo completo de compra desde el login hasta la pantalla de "Thank you for your order", seleccionando un producto al azar.
2.  **Removing Elements**: Agrega 3 productos al carrito y verifica que se eliminen correctamente dejando el carrito vacío.
3.  **Logout**: Cierra la sesión y valida la redirección a la página de inicio de sesión.


### Ejecución
Para ejecutar todas las pruebas en conjunto, utiliza el archivo de suite:
1. Haz clic derecho sobre el archivo `testng.xml` en la raíz del proyecto.
2. Selecciona **Run '...testng.xml'**.
