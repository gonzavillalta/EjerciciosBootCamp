public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 34;
        cliente.nombre = "Salvador";
        cliente.telefono = "123456789";

        Trabajador trabajador = new Trabajador();

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito());
        System.out.println(trabajador.salario());


    }
}

class Persona {

    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona{
    public String credito(){
        return "credito de vivienda";
    }
}

class Trabajador extends Persona{
    public String salario(){
        return "salario que gano";
    }
}