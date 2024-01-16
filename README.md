# 2º Trimestre
## Multimedia / Android
###### Profesor: José Carlos Moreno
###### Alumno: José Manuel Martínez Palacios
### MartinezPalaciosM01


### EJERCICIO - 01
- Enunciado:
Deberás recrear en android la aplicación del contador que se os proporciona. El diseño se os pasará por figma (abajo teneis el enlace).
En este primer ejercicio solo debes hacer la parte visual, nada de lógica. Asegurate de que el resultado final sea identico al proporcionado,
en tu criterio queda elegir el o los tipos de layouts que utilizarás. Mediante figma obtén el tipo de fuente, colores etc que debes utilizar en tu aplicación.

- Aplicacion:
  - Se ha desarrollado una aplicacion en Android Studio, utilizando como plantilla visual para imitar, un proyecto en Figma.
  - La primera versión de la app cuenta con un texto inicial informativo de la app, un numero centrado, 3 botones de función (mas adelante contendran las funciones correspondientes) y la firma del desarrollador al final de la pantalla.

- Imagenes:

![contador](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/49e8ee70-8357-4cb6-b62a-cf8875fa35a1)

### EJERCICIO - 02
- Enunciado:
Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean admin en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura en el AndroidManifest.xml. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).

- Aplicación:
La ventana de login contiene:
  - Parte 1:
    - Texto informativo encabezando la ventana.
  - Parte 2:
    - Apartados (nombre y contraseña) usando un tipo de elemento llamado (Multiline Text).
  - Parte 3:
    - Un elemento (button).
  - Parte 4:
    -  Mensaje de login correcto/ incorrecto, que por defecto estará vacío.

- Imagenes:

  ![login](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/6b091f23-969b-4518-89f5-5b95e6323507)


### EJERCICIO - 03
- Enunciado:
Cambia el proyecto para que el segundo activity en vez de ser el contador sea un activity con un FrameLayout en el que se verán los diferentes fragments (mínimo home, contador, salir) y por otra parte una barra de navegación con la que podamos viajar entre los diferentes fragments.
En este ejercicio aprenderemos a movernos por diferentes fragments. Usaremos un (BottonNavigationView), que almacenará dos elementos (bottonNavigation y FrameLayout), en el FrameLayout es donde almacenaremos los diferentes fragmetns que posteriormente rellenaremos.
  - #### Los fragments son elementos "parecidos" a los activitys de los primeros ejercicios, pero almacenados todos (2 o más fragments) en una especie de "cajón" llamado FrameLayout, con un menú de navegación para poder desplazarnos entre ellos.


- Aplicación:
  - Parte 1:
    - Creacion del FrameLayout.
  - Parte 2:
    - Creacion de los Fragments en el BottonNavitagionView. Pasos: res -> New -> Android Resource Directory -> Resource type -> Navigation -> Aceptar
      - Click derecho en la carpeta Navigation -> New -> Navigation Resource File. (el nombre del archivo debe ser el que pongamos en el FrameLayout, en la siguiente linea -> app:'nombreArchivo'="@navigation/'nombreARchivo'").
        ![navGraph](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/f02dc667-fd84-4bec-9c59-190fa41e9349)
        ![navGraph2](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/a88a7047-2cc7-481c-9203-bd5bc3ce0034)

    - Dentro del archivo creado, veremos una pestaña llamada "design", la abriremos e iremos creando los fragments desde el icono del smartphone con el simbolo del +.
   
  - Parte 3:
    - Creacion del BottonNavitagionView. Pasos: res -> New -> Android Resource Directory -> Resource type -> menu -> aceptar.
      - Este archivo contiene los botones por los que cambiaremos de fragments a fragments. En el BottonNavigation deberás hacer referencia a este menú. (siguiente código).
        ![BottonNAvigationMenu](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/128438ef-fcd9-4126-8f54-0262132d625a)

  - Parte 4:
    - En la Activity principal, deberás obtener la referencia al BottonNavigationView y configurar un OnNavigationItemSelectedListener para manejar los eventos de selección de los elementos: (siguiente código).
      ![logicaCambioFragments](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/39f870e8-3dda-4450-8a12-5dc12a0a006b)

  - Parte 5:

















