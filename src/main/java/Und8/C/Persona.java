package Und8.C;

class Persona {
        private String nombre;
        private String apellido;
        private int edad;
        private String dni;

        public String getNombre() {
                return nombre;
        }
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }
        public String getApellido() {
                return apellido;
        }
        public void setApellido(String apellido) {
                this.apellido = apellido;
        }
        public int getEdad() {
                return edad;
        }
        public void setEdad(int edad) {
                this.edad = edad;
        }
        public String getDni() {
                return dni;
        }
        public void setDni(String dni) {
                this.dni = dni;
        }

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




