abstract public class ClaseAbstracta {

    protected String valor;
    protected String nombre;

    public ClaseAbstracta() {
    }

    public ClaseAbstracta(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String metodoAbstracto();
}
