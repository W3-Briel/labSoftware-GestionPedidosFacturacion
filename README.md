# 🛒 E-Commerce Backend: Motor de Ventas y Facturación

Un sistema backend robusto desarrollado en Java para gestionar el flujo de ventas de una tienda de componentes de PC. Este proyecto se centra en resolver la complejidad de las reglas de negocio comerciales (como la aplicación dinámica de descuentos) y el procesamiento de comprobantes, garantizando que el código sea escalable, mantenible y esté preparado para adaptarse a los cambios del mercado.

## 🚀 ¿Qué aporta este sistema?

En el ecosistema del comercio electrónico, las estrategias de venta cambian constantemente. Este proyecto aporta una solución arquitectónica que permite que el negocio escale sin que el código se vuelva frágil:

*   **Flexibilidad Comercial:** Gracias a la abstracción de las lógicas de descuento, el equipo de ventas puede implementar nuevas promociones (ej. combos específicos de hardware, descuentos por métodos de pago) sin riesgo de romper el sistema de cobros existente.
*   **Aislamiento del Dominio:** Las reglas de negocio están 100% blindadas. Las matemáticas detrás de los precios y el control de stock operan de forma independiente a la infraestructura, lo que significa que el "corazón" del e-commerce puede migrarse a distintos frameworks o bases de datos sin modificar su esencia.
*   **Facturación Extensible:** El flujo de emisión de comprobantes está estandarizado. Agregar un nuevo formato de salida (como la generación de un PDF en el futuro) requiere añadir una sola clase, sin alterar la lógica de las ventas ya procesadas.

## 🛠️ Tecnologías y Arquitectura Utilizada

Este proyecto fue construido priorizando las buenas prácticas de la Programación Orientada a Objetos y una estructura estrictamente modular para garantizar la separación de responsabilidades.

*   **Lenguaje:** Java.
*   **Arquitectura Modular:** Separación estricta en capas (`Domain`, `Service`, `Repository`) para aislar la lógica de negocio de los detalles técnicos de entrada/salida.
*   **Principios de Diseño:**
    *   **SOLID:** Aplicación fuerte del principio Abierto/Cerrado (OCP) y Responsabilidad Única (SRP).
    *   **Tell, Don't Ask:** Evitamos el modelo de dominio anémico. Las entidades son responsables de gestionar su propio estado y comportamiento (ej. validaciones de stock).
    *   **Manejo de Excepciones por Capa:** Excepciones de negocio aisladas en el dominio, separadas de los errores de infraestructura.
*   **Patrones de Diseño:**
    *   **Strategy:** Utilizado en la capa de `Domain` para resolver la aplicación de descuentos dinámicos (ej. transferencias bancarias, promociones por componentes).
    *   **Template Method:** Implementado en la capa de `Service` para definir el algoritmo inalterable de facturación, permitiendo la salida de datos en múltiples formatos (Consola, exportación a `.csv`).
