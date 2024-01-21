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

    - Dentro del archivo creado, veremos una pestaña llamada "design", la abriremos e iremos creando los fragments desde el icono del smartphone con el simbolo del +. Deberá quedar algo parecido a la siguiente imagen: (los fragments dos y tres, estarán enlazados al fragments uno).
      
       ![fragments](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/d4c546c7-5209-4348-bd21-e11e997f90a0)

  - Parte 3:
    - Creacion del BottonNavitagionView. Pasos: res -> New -> Android Resource Directory -> Resource type -> menu -> aceptar.
      - Este archivo contiene los botones por los que cambiaremos de fragments a fragments.
        ![BottonNAvigationMenu](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/128438ef-fcd9-4126-8f54-0262132d625a)
      - En el BottonNavigation deberás hacer referencia a este menú. (siguiente código).        
        ![menu](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/e7c97c31-8b4d-49ce-87b7-7a07de1e4bab)

  - Parte 4:
    - En la Activity principal, deberás obtener la referencia al BottonNavigationView y configurar un OnNavigationItemSelectedListener para manejar los eventos de selección de los elementos: (siguiente código).
      ![logicaCambioFragments](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/39f870e8-3dda-4450-8a12-5dc12a0a006b)

  - EXTRA: (Personalizar los iconos por defecto).
    - Paso 1: Click izquierdo en el icono por defecto que aparece en el la ventana de code el (BottonNavigation).
      - Aparecerá una ventana igual que la de la imagen siguiente.
 
    - Paso 2: Click en "browse".
      
      ![icono1](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/13a13f81-5441-403e-9308-a66f153d47ca)

    - Paso 3: Click en el simbolo +.
      ![icono2](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/5d2ba726-471d-46bc-94e4-e6573b9f2b2f)

    - Paso 4: Click en la opción "Clip art".
      ![icono3](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/dc4aa566-c84b-4c95-b8c4-c96747abed53)

    - Paso 5: Elegir nuevo icono.
      
      ![icono4](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/1a0d0cf8-c1f3-454d-9d7c-78c722d84a06)


### EJERCICIO - 04
- Enunciado:
Añade un Fragment mas que se llame API y sigue el tutorial (para la parte del consumo de la API) proporcionado para consumir un API con android(en esta entrega no tendrás que reflejar los resultado en la interfaz gráfica, solo en el log). Por otro lado crea un microservicio con una sola entidad.

#### PARTE 1:

- Pasos para añadir un nuevo fragment:
  - Paso 1:
    - Añadimos el elemento en el botton_navigation_menu:
      
      ![fragment2](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/4316506d-dab4-424e-93e7-5b0965523e72)

  - Paso 2:
    - Lo añadimos en el archivo llamado "nav_graph":
      
      ![fragment3](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/22b416fb-3ab1-470b-b9f5-19d477af2894)

  - Paso 3:
    - Editamos el código, para que podamos movernos entre los diferentes fragments:
      
      ![fragment7](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/822c1061-25c9-43cf-83a5-c064b48519a5)

  
#### PARTE 2:

- Pasos para consumir la API y verla en consola:
  - Paso 1:
    - Creación de los packages y clases:
      
      ![fragment5](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/d8fba4f3-12d6-4015-9f7b-41beeb4c8f94)

  - Paso 2:
    - Lógica del fragment de la API:
      
      ![fragment6](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/47e8add0-4bb1-4c9b-89ec-b161490bd38f)

  - Paso 3:
    - Edicion del Manifest:
      
      ![fragment4](https://github.com/ChemaDvp/MartinezPalaciosM01/assets/115820368/ad5c79c2-1703-4872-a54b-06b1bdafdb42)
















