package ar.edu.davinci.Services;

public interface EmailSender {
    void enviarMail(String destinatario, String origen, String asunto, String mensaje);
}
