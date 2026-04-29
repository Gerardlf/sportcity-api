INSERT INTO pistas (nombre, deporte, precio_hora, descripcion)
SELECT 'Pista Central', 'Tenis', 15.0, 'Pista rapida de tenis'
    WHERE NOT EXISTS (
    SELECT 1 FROM pistas WHERE nombre = 'Pista Central'
);

INSERT INTO pistas (nombre, deporte, precio_hora, descripcion)
SELECT 'Campo F7 Norte', 'Futbol 7', 30.0, 'Cesped artificial de ultima generacion'
    WHERE NOT EXISTS (
    SELECT 1 FROM pistas WHERE nombre = 'Campo F7 Norte'
);

INSERT INTO pistas (nombre, deporte, precio_hora, descripcion)
SELECT 'Pista Padel 1', 'Padel', 18.0, 'Pista de cristal'
    WHERE NOT EXISTS (
    SELECT 1 FROM pistas WHERE nombre = 'Pista Padel 1'
);

INSERT INTO pistas (nombre, deporte, precio_hora, descripcion)
SELECT 'Pista Basket', 'Basket', 20.0, 'Pista cubierta'
    WHERE NOT EXISTS (
    SELECT 1 FROM pistas WHERE nombre = 'Pista Basket'
);