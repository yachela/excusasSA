public class Empleado {
    private String nombre;
    private String email;
    private String legado;

    public Empleado(String nombre, String email, String legado) {
        this.nombre = nombre;
        this.email = email;
        this.legado = legado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getLegado() {
        return legado;
    }
}
