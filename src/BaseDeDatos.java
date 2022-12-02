public class BaseDeDatos {
    public String usuario;
    public String token;

    // Metodos
    private static BaseDeDatos instance = null;

    private BaseDeDatos () {

    }

    public static BaseDeDatos getConstructor () {
        if (instance == null) { // null para que entre en el condicional
            instance = new BaseDeDatos(); // creando el objeto
        }
        return instance;
    }
}
