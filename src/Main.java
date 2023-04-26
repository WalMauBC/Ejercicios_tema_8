public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad("Edad");
        String edad = persona.getEdad();
        System.out.println(edad);

        persona.setNombre("Nombre");
        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setTelefono("Telefono");
        String telefono = persona.getTelefono();
        System.out.println(telefono);
    }
}

class Persona {
    private String edad; //EDAD
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getEdad() {
        return this.edad;
    }

    private String nombre; // NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    private String telefono; //TELEFONO
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }


}