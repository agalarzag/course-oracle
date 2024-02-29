--Realizar una base de datos
 
--1. Listar todos los customer que inicien su id con la letra "A". 
--Guardas el archivo como "ejercicio01.sql" y lo subes a tu repositorio

select * from Customers where customerid like 'A%'

--2. Listar a todos los customers que sean de los paises: france, germany,  sweden.
-- Guardar el archi como  "ejercicio0.sql" u subes a tu respositorio

select * from Customers where Country in ('france','germany','sweden')
