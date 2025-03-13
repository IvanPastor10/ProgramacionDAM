package SistemaGestionEventosDeportivos;

public class ParticipanteNoValidoException extends RuntimeException {
    public ParticipanteNoValidoException(String mensaje) {
        super(mensaje);
    }
}

