public class App {
    public static void main(String[] args) throws Exception {
        
        /* Cliente */

        Cliente cliente = new Cliente();

        cliente.nombre = ("Nicolas Andres");
        cliente.Telefono = ("31242121");
        cliente.edad = 21;
        cliente.credito = 52;

        System.out.println("cliente: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.Telefono);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Credito: " + (cliente.credito));

        /* Trabajador */

        Trabajador trabajador = new Trabajador();

        trabajador.nombre = ("Clara Ines");
        trabajador.Telefono = ("31821323");
        trabajador.edad = 42;
        trabajador.salario = 10000;

        System.out.println("Trabajador: " + trabajador.nombre );
        System.out.println("Telefono: " + trabajador.Telefono);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Salario: " + (trabajador.salario));

    }
}

class Persona {
    int edad;
    String nombre;
    String Telefono;
}

final class Cliente extends Persona {

    int credito;

}

final class Trabajador extends Persona {
    
    int salario;
}