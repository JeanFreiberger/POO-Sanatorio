import java.util.List;

public class Paciente_Internado {
    public class PacienteInternado extends PACIENTES implements Departamento_Administracion, Departamento_Noticia,Departamento_Clinica  {
        private int habitacion;
        private int pa;
        private String rh;

        public PacienteInternado(int dni, String nombre, String obraSocial, int habitacion, int pa, String rh) {
            super(dni, nombre, obraSocial);
            this.habitacion = habitacion;
            this.pa = pa;
            this.rh = rh;
        }


        @Override
        public void CobertutaOS() {

        }

        @Override
        public void Descuento() {

        }

        @Override
        public void Vademecum() {

        }

        @Override
        public void Cobertura() {

        }


        @Override
        public void EstudiosRx() {

        }

        @Override
        public void EstudiosSangre() {

        }

        @Override
        public void TipoDeDienta() {

        }
    }
}
