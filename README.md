# prueba_java
Prueba técnica en spring boot.

Se realizaron los 2 objetivos de la prueba técnica en un mismo proyecto con las siguientes características:
Construcción y carga de dependencias: Maven
Java versión 17
Spring boot versión 3.3.4

 
Para realizar la prueba del proyecto, se requiere clonar el repositorio, correr el proyecto y realizar las peticiones http:
Se iniciará dependiendo qué puerto se tenga disponible (en mi caso fue en el 8080).

Prueba técnica 1: 
Se puede entrar directamente desde el navegador y pegar el enlace o consultarlo en postman haciendo una solicitud get
http://localhost:8080/api-externa/listar

Prueba técnica 2:
Se recomienda utilizar postman y hacer una solicitud de tipo post a la siguiente ruta:
http://localhost:8080/api-interna/palindromo
La configuración que se utiliza es enviarle el json en un body de tipo raw
{
    "palindromo":"anita lava la tina" 
}

La respuesta que retorna es un json con la siguiente estructura:
[
    {
        "lengthCadena": 18,
        "isPalindromo": 1,
        "lengthCaracteresEspeciales": 0
    }
]
