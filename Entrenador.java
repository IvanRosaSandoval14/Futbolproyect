public class Entrenador  extends Persona {

    private Integer aniosExperiencia;
    private String estrategia;

    public Entrenador() {
        super();
    }

    public Entrenador(Integer id, String nombre, String apellido, Integer edad, Integer aniosExperiencia, String estrategia) {
        super(id, nombre, apellido, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.estrategia = estrategia;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void Concentrarse() {
        System.out.println("Concentrarse: El entrenador se concentra antes del partido.");
    }

    @Override
    public void Viajar() {
        System.out.println("Viajar: El entrenador viaja con el equipo.");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador dirige el partido.");
    }

   public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirige el entrenamiento.");
   }

}
