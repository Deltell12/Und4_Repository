package Und8.B;

class Persona {
        String nombre;
        String apellido;
        int edad;
        String dni;

        public enum EstadoCivil{
                CASADO, SOLTERO, VIUDO;
        }

        public Persona(String nombre, String apellido, int edad, String dni, EstadoCivil estadoCivil) {
                this.nombre = nombre;
                this.apellido = apellido;
                if (verificarEdad(edad)) {
                        this.edad = edad;
                }
                if (verificarDNI(dni)) {
                        this.dni = dni;
                }
        }

        public Persona(String nombre, String apellido, int edad) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
        }

        public static boolean verificarDNI(String dni) {
                String regex = "^\\d{8}[A-Z]$";
                boolean dniValido = false;

                if (dni.matches(regex)) {
                        dniValido = true;
                }
                else {
                        throw new IllegalArgumentException("El DNI debe de ser válido");
                }
                return dniValido;
        }

        public static boolean verificarEdad(int edad) {
                boolean edadValido = false;
                if (edad < 0) {
                        throw new IllegalArgumentException("La edad no puede ser negativa");
                }
                else {
                        edadValido = true;
                }
                return edadValido;
        }
}




