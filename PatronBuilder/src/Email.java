import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Email {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;
    private List<String> archivosAdjuntos;

    // Constructor que recibe un EmailBuilder
    public Email(EmailBuilder builder) {
        this.destinatarios = builder.destinatarios != null ? new ArrayList<>(builder.destinatarios) : Collections.emptyList();
        this.asunto = builder.asunto;
        this.cuerpo = builder.cuerpo;
        this.archivosAdjuntos = builder.archivosAdjuntos != null ? new ArrayList<>(builder.archivosAdjuntos) : Collections.emptyList();
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public List<String> getArchivosAdjuntos() {
        return archivosAdjuntos;
    }

    @Override
    public String toString() {
        return "Email{" +
                "destinatarios=" + destinatarios +
                ", asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", archivosAdjuntos=" + archivosAdjuntos +
                '}';
    }

    // Método estático para obtener un EmailBuilder
    public static EmailBuilder builder() {
        return new EmailBuilder();
    }
}
