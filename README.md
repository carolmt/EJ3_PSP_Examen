Random Number API
Este proyecto es una API desarrollada en Java utilizando Spring Boot para generar y trabajar con números aleatorios.

Endpoints
Obtener una lista de números aleatorios : GET /random/numbers
Devuelve un listado de 100 números aleatorios.

Obtener un número aleatorio con d dígitos: GET /random/number/{d}
Devuelve un número aleatorio que tendrá d dígitos.

Generar un número aleatorio basado en un número recibido: PUT /random/number
Recibe un número aleatorio (en formato JSON en el cuerpo de la solicitud) y devuelve un número aleatorio (en formato JSON en el cuerpo de la respuesta) 
con el mismo número de dígitos que el número recibido.
