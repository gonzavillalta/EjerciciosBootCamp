public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad("45");
    persona.setNombre("Gonzalo");
    persona.setTelefono("123456789");

    System.out.println(persona.getEdad());
    System.out.println(persona.getNombre());
    System.out.println(persona.getTelefono());
    }

}

class Persona {
    private String edad;
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return this.edad;
    }

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private String telefono;

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}


