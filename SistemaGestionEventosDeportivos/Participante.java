package SistemaGestionEventosDeportivos;

public class Participante {
    private String nombre;
    private String apellido;
    private int edad;
    private int tiempo;

    public Participante(String nombre, String apellido, int edad, int tiempo) {
        if (nombre == null || apellido == null || edad < 14) {
            throw new ParticipanteNoValidoException("Datos del participante no válidos");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
    	return nombre;
    }
    public String getApellido() {
    	return apellido;
    }
    public int getEdad() {
    	return edad;
    }
    public int getTiempo() {
    	return tiempo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", " + edad + " años.";
    }
}

