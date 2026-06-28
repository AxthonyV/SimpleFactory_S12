## Descripción

Se implementan tres tipos de laptop (básica, gamer y profesional) aplicando
el esquema de **Simple Factory**. La fábrica encapsula la lógica de creación
de objetos entonces el cliente solo trabaja con el tipo abstracto `Laptop`.

## Diagrama de Clases

<img width="803" height="437" alt="S12Factory" src="https://github.com/user-attachments/assets/76b1913e-3c1c-4f40-a0bc-cd8a2f30e1d1" />

---

## Salida esperada

```
BIENVENIDOS A LA FABRICA DE LAPTOPS

Corriendo programas en una Laptop para Gamer
Laptop para Gamer
Marca y Modelo: HP Victus
Año de Fabricacion: 2017
Procesador: Ryzen 7
Tamaño de la Pantalla: 13

Corriendo programas en una Laptop Basica
Laptop Basica
Marca y Modelo: Thinkpad
Año de Fabricacion: 2020
Procesador: intel core i5
Tamaño de la Pantalla: 14

Corriendo programas en una Laptop Profesional
Laptop para Profesional
Marca y Modelo: Macbook Pro
Año de Fabricacion: 2022
Procesador: Apple Silicon M2
Tamaño de la Pantalla: 16
```

---

## Estructura del proyecto

```
practica012-simple-factory/
├── src/
│               ├── Laptop.java                  ← producto abstracto
│               ├── LaptopGamer.java             ← producto concreto
│               ├── LaptopBasica.java            ← producto concreto
│               ├── LaptopProfesional.java       ← producto concreto
│               ├── SimpleLaptopFactory.java     ← la fábrica
│               └── FabricaLaptopsApp.java       ← cliente / main
└── README.md
```

---
