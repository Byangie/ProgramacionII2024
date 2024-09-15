import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> destinatarios = Arrays.asList("juan@example.com", "maria@example.com");
        List<String> archivosAdjuntos = Arrays.asList("file1.pdf", "file2.jpg");

        Email email = Email.builder()
                .destinatarios(destinatarios)
                .asunto("Prueba uno")
                .cuerpo("Esta es una prueba de funcionalidad")
                .archivosAdjuntos(archivosAdjuntos)
                .build();

        System.out.println(email);

        Email email1 = Email.builder()
                .destinatarios(Collections.singletonList("un destinario"))
                .asunto("Prueba dos")
                .cuerpo("Esta es una prueba de funcionalidad 2")
                .archivosAdjuntos(Collections.singletonList("documento.pdf"))
                .build();

        System.out.println(email1);
    }
}
