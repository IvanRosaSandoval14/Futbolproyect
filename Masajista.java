public class Masajista extends Persona {

    private Integer aniosExperiencia;
    private String titulacion;

    public Masajista() {
        super();
    }

    public Masajista(Integer id, String nombre, String apellido, Integer edad, Integer aniosExperiencia, String titulacion) {
        super(id, nombre, apellido, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public void Concentrarse() {
        System.out.println("Concentrarse: El masajista se concentra antes del partido.");
    }

    @Override
    public void Viajar() {
        System.out.println("Viajar: El masajista viaja con el equipo.");
    }

    public void darMasaje() {
        System.out.println("El masajista da un masaje a los jugadores.");
    }

}
