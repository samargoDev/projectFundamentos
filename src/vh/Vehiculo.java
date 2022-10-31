package vh;
import java.util.ArrayList;
public class Vehiculo {
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    //public static Vehiculo vehicle;

    public Vehiculo(){

    }
    public Vehiculo(int mo, String ma, double va){
        this(0, "", 0.0, "verde");
    }
    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        vehiculos[posAnadir] = this;
        posAnadir++;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getPosAnadir() {
        return posAnadir;
    }

    public void setPosAnadir(int posAnadir) {
        this.posAnadir = posAnadir;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        String res = "El modelo del vehiculo es: " + this.modelo + " La marca es: " + this.marca + " El valor comercial es: " + this.valorComercial + " El color es: " + this.color;
        return res;
    }

    public static String toStringVehiculos() {
        ArrayList<String> concat = new ArrayList<String>();
        for (int i = 0; i < posAnadir; i++) {
            concat.add(vehiculos[i].toString());
        }
        String res = String.join("\n", concat);
        return res;
    }

    public static int cantidadVehiculos(){
        return posAnadir;
    }

    public static String showColor(){
        ArrayList<String> concatGreen = new ArrayList<String>();
        for(int i = 0; i < posAnadir; i++){
            String color = vehiculos[i].getColor();
            if(color.equalsIgnoreCase("verde")){
                concatGreen.add(vehiculos[i].toString());
            }
        }
        String res = String.join("\n", concatGreen);
        return res;
    }

    public static String showModel(){
        ArrayList<String> concatModel = new ArrayList<String>();
        for(int i = 0; i < posAnadir; i++){
            int model = vehiculos[i].getModelo();
            if(model >= 2000 && model <= 2021){
                concatModel.add(vehiculos[i].toString());
            }
        }
        String res = String.join("\n", concatModel);
        return res;
    }
}
