public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Juan", 25, 'H');
        Persona persona3 = new Persona("María", 30, "1234567890", 'M', 65.0, 1.75);

    
        System.out.println("Información de la persona 1:");
        System.out.println(persona1.toString());
        System.out.println("IMC: " + persona1.calcularIMC());
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println();

        System.out.println("Información de la persona 2:");
        System.out.println(persona2.toString());
        System.out.println("IMC: " + persona2.calcularIMC());
        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println();

        System.out.println("Información de la persona 3:");
        System.out.println(persona3.toString());
        System.out.println("IMC: " + persona3.calcularIMC());
        System.out.println("Es mayor de edad: " + persona3.esMayorDeEdad());
    }
}
