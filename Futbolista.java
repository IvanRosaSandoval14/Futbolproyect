public class Futbolista extends Persona {

    private Integer dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(Integer id, String nombre, String apellido, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void Concentrarse() {
        System.out.println("Concentrarse: El futbolista se concentra antes del partido.");
    }

    @Override
    public void Viajar() {
        System.out.println("Viajar: El futbolista viaja con el equipo.");
    }
    
      public void jugarPartido() {
        System.out.println("El futbolista juega el partido.");
    }

    public void entrenar() {
        System.out.println("El futbolista entrena.");
    }

}
