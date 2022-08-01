public class Program {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Juan Perez");
        persona1.setEdad(40);
        persona1.setTelefono("956478254");

        System.out.println("El sr(a). "+persona1.getNombre()+" tiene "+persona1.getEdad()+" años de edad y su telefono es "+persona1.getTelefono());
    }
}

class Persona{
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
