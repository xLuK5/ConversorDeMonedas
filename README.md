# ConversorDeMonedas
##Este conversor fue hecho con Java implementando la orientacion a objetos

El programa fue hecho utilizando la API
[Exchange Rate APi](https://www.exchangerate-api.com/)

Se utilizo la libreria Gson para apoyaron a interactuar con los datos de la API y usarlos en nuestro programa.

Se crearon 3 Clases
Clase Principal
Clase Record Moneda
Clase ConsultaAPI


En la clase principal se le pide al usuario ingresar los datos de la moneda base y la moneda objetivo de su eleccion. Despues de esto se le pide ingresar el monto a convertir.
Finalmente despliega el mensaje de conversion de moneda base a moneda objetivo y el valor total de la conversion.


En la clase Record Moneda se le asignan valores que son los que en este caso queremos obtener de la API, que es el conversion_rates a los cuales queremos acceder a sus valores.


En la clase ConsultaAPI se crea toda la conexion basada en el HttpClient, HttpRequest y HttpResponse. Convirtiendo los valores de la API usando Gson a JSON.


De esta manera finaliza la creacion del programa Conversion de monedas exitosamente.

