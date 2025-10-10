public interface EmailSender {
    void EnviarMail(String destinatario, String origen, String asunto, String mensaje);
}
