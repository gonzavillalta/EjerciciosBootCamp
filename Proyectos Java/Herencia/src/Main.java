public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        edadPersona(cliente);
        nombrePersona(cliente);
        telefonoPersona(cliente);

        Trabajador trabajador = new Trabajador();

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito());
        System.out.println(trabajador.salario());


    }
    public static void edadPersona (Cliente cliente) {
        cliente.edad = 34;
    }
    public static void nombrePersona (Cliente cliente) {
        cliente.nombre = "Salvador";
    }
    public static void telefonoPersona (Cliente cliente) {
        cliente.telefono = "123456789";
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