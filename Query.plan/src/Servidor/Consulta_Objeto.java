package Servidor;

public class Consulta_Objeto {

    int ID;
    String NMed, NPac, Data, Hora;

    public Consulta_Objeto() {
    }

    public Consulta_Objeto(int ID, String NMed, String NPac, String Data, String Hora) {
        this.ID = ID;
        this.NMed = NMed;
        this.NPac = NPac;
        this.Data = Data;
        this.Hora = Hora;
    }
    
    public int getID() {
        return ID;
    }

    public String getNMed() {
        return NMed;
    }

    public String getNPac() {
        return NPac;
    }

    public String getData() {
        return Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNMed(String NMed) {
        this.NMed = NMed;
    }

    public void setNPac(String NPac) {
        this.NPac = NPac;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

}
