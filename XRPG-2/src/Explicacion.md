# 📁 Estructura del Proyecto - Práctica 08: Iteradores y BBDD

## 📦 `src/RPG/`
Paquete raíz de toda la aplicación. Contiene el punto de entrada `Main.java`, que arranca el menú principal e inicia la conexión con la base de datos.

---

## 🗄️ `DAO/` — Data Access Object
Contiene todas las clases responsables de comunicarse con la base de datos PostgreSQL mediante JDBC.

**Qué va aquí:**
- `PersonajeDAO.java` → INSERT, SELECT, UPDATE de personajes
- `ItemDAO.java` → SELECT de items de la tienda, gestión de inventario
- `HabilidadDAO.java` → Consultas de habilidades por clase, equipar/desequipar
- `CiudadDAO.java` → SELECT de ciudades y su nivel mínimo de acceso
- `RazaDAO.java` / `ClaseDAO.java` → Listados para mostrar al crear personaje

**Regla:** Ninguna lógica de negocio aquí. Solo SQL y mapeo de resultados a objetos.

---

## ⚙️ `Logic/` — Lógica de Negocio
Contiene el motor de la aplicación: cálculos, combate e iteradores.


> EJEMPLO DE LOGICA, LA LOGICA LA PIENSAS TÚ, PUEDE SER DE MUCHAS MANERAS

**Qué va aquí:**
- `MotorCombate.java` → Bucle de combate por turnos, cálculo de daño, recompensas de oro
- `GestorImpuestos.java` → Cobro de impuestos usando obligatoriamente `Iterator` y `iterator.remove()`
- `CalculadorEstadisticas.java` → Cálculo de Ataque Total y Defensa Total iterando el inventario

**Regla:** Esta capa usa los DAOs para leer/escribir datos, pero no interactúa directamente con el usuario.

---

## 🧩 `Model/` — Modelos (POJOs)
Contiene las clases que representan las entidades de la base de datos como objetos Java simples.

**Qué va aquí:**
- `Personaje.java` → id, nombre, nivel, oro, vidaActual, idRaza, idClase, idCiudadActual
- `Item.java` → id, nombre, tipo, precioOro, bonificadorAtaque, bonificadorDefensa
- `Habilidad.java` → id, nombre, dañoBase, usosMaximos, idClase
- `Raza.java` → id, nombre, bonificadorVida, bonificadorFuerza
- `Ciudad.java` → id, nombre, nivelMinimoAcceso
- `ClaseRPG.java` → id, nombre

**Regla:** Solo atributos, constructor, getters y setters. Sin lógica ni SQL.

---

## 🖥️ `Ui/` — Interfaz de Usuario
Contiene todos los menús y la interacción por consola con el usuario.

**Qué va aquí:**
- `MenuPrincipal.java` → Menú principal con todas las opciones del juego
- `MenuPersonaje.java` → Submenú para crear personaje, viajar, ver inventario
- `MenuTienda.java` → Submenú de compra de items
- `MenuCombate.java` → Selección de personajes y muestra del combate turno a turno
- `MenuEstadisticas.java` → Top 3 más ricos y censo de clases

**Regla:** Aquí se capturan las excepciones personalizadas y se muestran mensajes al usuario. No hay SQL directo.

---

## 🛠️ `Utils/` — Utilidades
Contiene herramientas transversales reutilizables en toda la aplicación.

**Qué va aquí:**
- `Log.java` → Escribe eventos con fecha y hora en el archivo `info.log`
    - Creación de personajes
    - Compras exitosas
    - Inicio y resultado de combates
    - Excepciones capturadas (ej: `FondosInsuficientesException`)
- `ConexionBD.java`  → Gestión centralizada de la conexión JDBC

**Regla:** Clases genéricas sin dependencia de lógica de negocio concreta.

---

## ⚠️ `Exception/` *(dentro de src/RPG)*
Contiene las excepciones personalizadas del juego.

**Qué va aquí:**
- `NivelInsuficienteException.java` → Se lanza al intentar viajar a una ciudad con nivel mínimo mayor al del personaje
- `FondosInsuficientesException.java` → Se lanza al intentar comprar sin oro suficiente
- `LimiteHabilidadesException.java` → Se lanza al intentar equipar una 4ª habilidad (máximo 3)

---

## ☕ `Main.java`
Punto de entrada de la aplicación. Instancia el menú principal y arranca el programa.

---

## 📋 Resumen de Capas

```
UI  →  Logic  →  DAO  →  Base de Datos
         ↕               ↕
       Model  ←────────────
         ↕
       Utils (Log)
```