package vh;
import java.util.ArrayList;
import java.util.Collections;

public class Sensor {
    public static Sensor[] sensores = new Sensor[8];
    public static int tamanoS = 8;
    public static int posAnadirS = 0;
    private String tipo;
    private double valor;

    public Sensor(){}
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
        sensores[posAnadirS] = this;
        posAnadirS++;
    }

    public Sensor[] getSensores() {
        return sensores;
    }

    public void setSensores(Sensor[] sensores) {
        this.sensores = sensores;
    }

    public int getTamano() {
        return tamanoS;
    }

    public void setTamano(int tamano) {
        this.tamanoS = tamano;
    }

    public int getPosAnadir() {
        return posAnadirS;
    }

    public void setPosAnadir(int posAnadir) {
        this.posAnadirS = posAnadir;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        String res = "El tipo es: " + this.tipo + " El valor es: " + this.valor;
        return res;
    }

    public static String toStringSensores() {
        ArrayList<String> concat = new ArrayList<String>();
        for (int i = 0; i < posAnadirS; i++) {
            concat.add(sensores[i].toString());
        }
        String res = String.join("\n", concat);
        return res;
    }

    public static int cantidadSensores(){
        return posAnadirS;
    }

    public static String showType(){
        ArrayList<String> concatType = new ArrayList<String>();
        for(int i = 0; i < posAnadirS; i++){
            String type = sensores[i].getTipo();
            if(type.equalsIgnoreCase("temperatura")){
                concatType.add(sensores[i].toString());
            }
        }
        String res = String.join("\n", concatType);
        return res;
    }

    public static ArrayList<Sensor> showTemp(){
        ArrayList<Sensor> concatType = new ArrayList<Sensor>();
        for(int i = 0; i < posAnadirS; i++){
            String type = sensores[i].getTipo();
            if(type.equalsIgnoreCase("temperatura")){
                concatType.add(sensores[i]);
            }
        }

        Sensor temporal;
        for (int i = 0; i < concatType.size(); i++) {
            for (int j = 1; j < (concatType.size() - i); j++) {
                if ((concatType.get(j-1).getValor()) > (concatType.get(j).getValor())) {
                    temporal = concatType.get(j - 1);
                    concatType.set(j - 1, concatType.get(j));
                    concatType.set(j,  temporal);

                }
            }
        }
        return concatType;
    }
}

