//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // crear un objeto de la clase Persona con nombre Juan edad 17
        Persona persona1=new Persona("Juan", 17);
        //Mostrar la información inicial de la persona
        persona1.mostrarInformacion();
        //cambiar el nombre Juan a Carlos
        persona1.cambiarNombre("Carlos");
        System.out.println("\n Después de cambiar el nombre:  ");
        persona1.mostrarInformacion();//Muestra la actualización
        // hacer que la persina cumpla un año más
        persona1.cumplirAnios();
        //Mostrar la información después de haber cumplido años
        System.out.println("\n Después de cumplir años: ");
        persona1.mostrarInformacion();
        //Crear otro objeto de la clase persona con nombre Ana y edad 20
        Persona persona2= new Persona("Ana", 20);
        //Mostrar la información de la nueva persona
        System.out.println("\n Nueva persona: ");
        persona2.mostrarInformacion();
    }
}
