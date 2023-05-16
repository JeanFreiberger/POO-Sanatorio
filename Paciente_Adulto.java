public class Paciente_Adulto {
    public static class PacienteAdulto extends PACIENTES implements Departamento_Administracion, Departamento_Clinica {


        private int pa;
        private double altura;
        private double peso;

        public PacienteAdulto() {
            super();

        }


        @Override
        public void CobertutaOS() {
            System.out.println("La cobertura de pacientes Adultos es de 60% ");

        }

        @Override
        public void Descuento() {
            System.out.println("Es el descuento de pacientes Adultos ");
        }

        @Override
        public void Vademecum() {
            System.out.println("El vademecum de pacientes Adultos ");
        }

        @Override
        public void Cobertura() {
            System.out.println("La cobertura de pacientes Adultos ");
        }

        @Override
        public void EstudiosRx() {
            System.out.println("La EstudiosRX de pacientes Adultos ");
        }

        @Override
        public void EstudiosSangre() {
            System.out.println("El estudio de Sangre de pacientes Adultos ");
        }
    }


    }


