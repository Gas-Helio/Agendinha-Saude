package Cliente;

public class Consulta_Objeto {

    int ID;
    String Med, Pac, data, hora;

    public Consulta_Objeto(int ID, String Med, String Pac, String data, String hora) {
        this.ID = ID;
        this.Med = Med;
        this.Pac = Pac;
        this.data = data;
        this.hora = hora;
    }

    public Consulta_Objeto(String Med, String Pac, String data, String hora) {
        this.Med = Med;
        this.Pac = Pac;
        this.data = data;
        this.hora = hora;
    }

    public Consulta_Objeto(String Med, String data, String hora) {
        this.Med = Med;
        this.data = data;
        this.hora = hora;
    }

    public Consulta_Objeto() {
    }

    public int getID() {
        return ID;
    }

    public String getMed() {
        return Med;
    }

    public String getPac() {
        return Pac;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMed(String Med) {
        this.Med = Med;
    }

    public void setPac(String Pac) {
        this.Pac = Pac;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
