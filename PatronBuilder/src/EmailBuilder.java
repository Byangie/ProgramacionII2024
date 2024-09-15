import java.util.ArrayList;
import java.util.List;

public class EmailBuilder {
    List<String> destinatarios = new ArrayList<>();
    String asunto;
    String cuerpo;
    List<String> archivosAdjuntos = new ArrayList<>();

    public EmailBuilder destinatarios(List<String> destinatarios) {
        if (destinatarios != null) {
            this.destinatarios.addAll(destinatarios);
        }
        return this;
    }

    public EmailBuilder asunto(String asunto) {
        this.asunto = asunto;
        return this;
    }

    public EmailBuilder cuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    public EmailBuilder archivosAdjuntos(List<String> archivosAdjuntos) {
        if (archivosAdjuntos != null) {
            this.archivosAdjuntos.addAll(archivosAdjuntos);
        }
        return this;
    }

    public Email build() {
        if (destinatarios == null || destinatarios.isEmpty()) {
            throw new IllegalArgumentException("Debe haber al menos un destinatario.");
        }
        if (asunto == null || asunto.trim().isEmpty()) {
            throw new IllegalArgumentException("El asunto es obligatorio.");
        }
        if (cuerpo == null || cuerpo.trim().isEmpty()) {
            throw new IllegalArgumentException("El cuerpo del mensaje es obligatorio.");
        }
        return new Email(this);
    }
}
