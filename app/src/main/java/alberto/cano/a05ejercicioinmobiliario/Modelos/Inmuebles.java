package alberto.cano.a05ejercicioinmobiliario.Modelos;

import java.io.Serializable;

public class Inmuebles implements Serializable {
    private  String direccion;
    private String numero;
    private String ciudad;
    private String provincia;
    private int cp;

    public Inmuebles() {
    }

    public Inmuebles(String direccion, String numero, String ciudad, String provincia, int cp) {
        this.direccion = direccion;
        this.numero = numero;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "inmuebles{" +
                "direccion='" + direccion + '\'' +
                ", numero='" + numero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", cp=" + cp +
                '}';
    }
}
