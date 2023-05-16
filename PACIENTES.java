public class PACIENTES {
    public PACIENTES(int dni, String nombre, String obraSocial) {

    }

    public PACIENTES() {

    }

    public class Paciente {
        private int dni;
        private String nombre;
        private String obraSocial;

        public Paciente(int dni, String nombre, String obraSocial) {
            this.dni = dni;
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setEdad(int Dni) {
        this.dni = Integer.parseInt(String.valueOf(Dni));
    }
}

}
