public class Persona {
        //atributos de la clase persona:nombre y edad
        private String nombre;
        private int edad;
        //constructor de la clase persona : se ejecuta al crear el objeto de esta clase


        public Persona(String nombre, int edad)
        {
            //asignacion de los parametros a los atributos de la clase
            this.nombre= nombre;
            this.edad= edad;
        }

        //metodo para mostrar la informacion de la persona
        public void mostrarInformacion()
        {
            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad: "+ edad);

            //if (edad>=18) {
              //  System.out.println(nombre+" Es mayor de edad.");
            //} else {
              //  System.out.println(nombre+" Es menor de edad.");

            //}
            System.out.println("Es mayor de edad: "+ esMayorDeEdad());
        }

        public void cambiarNombre(String nuevoNombre)
        {

            nombre= nuevoNombre; //asignar el valor del nuevo nombre al atributo nombre

        }
        //Metodo para que la persona cumpla años

        public void cumplirAnios()
        {
            edad++;//incrementar en
            System.out.println(nombre+ " ha cumplido "+edad+ " años");
        }
        //metodo para verificar si es mayor de edad

    public boolean esMayorDeEdad() {
         return edad >= 18; // return true si la edad cumple con la validacion
//        if (edad >= 18) { // validamos si la edad es mayor o igual a 18
//            System.out.println(nombre + " Es mayor de edad.");
//            return true;
//        } else { // en caso contrario
//            System.out.println(nombre + " Es menor de edad.");
//            return false;
//        }
    }

//    metodo getter: permiten obtener los valores de los atributos de forma controlada


    public String getNombre()
    {
        return nombre;// retornar nombre
    }

    public int getEdad()
    {
            return edad;
    }



}






