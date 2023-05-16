public class PacientePediatrico extends PACIENTES implements Departamento_Administracion, Departamento_Noticia {


    private double peso;
        private String celular;
        private String tutor;


    public PacientePediatrico(int dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    public PacientePediatrico() {
        super();
    }


    @Override
        public void CobertutaOS() {
            System.out.println("La cobertura OS Pacientes de Peadiatrico es de 50%");

        }

        @Override
        public void Descuento() {
            System.out.println("el descuento es de 50%");

        }

        @Override
        public void Vademecum() {
            System.out.println("El Vademecum de Personas pediatricas ");

        }

        @Override
        public void Cobertura() {
            System.out.println("La cobertura de perosnas Pediatricas ");
        }


        @Override
        public void TipoDeDienta() {
            System.out.println("ES el tipo de dieta de personas Pediatricas ");

        }
    }

