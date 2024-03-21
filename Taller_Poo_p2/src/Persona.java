import java.util.Random;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H'; 
        this.peso = 0;
        this.altura = 0;
        this.cedula = generaCedula();
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : 'H'; 
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCedula: " + cedula + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    private String generaCedula() {
        Random rnd = new Random();
        StringBuilder cedulaBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            cedulaBuilder.append(rnd.nextInt(10));
        }
        return cedulaBuilder.toString();
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
