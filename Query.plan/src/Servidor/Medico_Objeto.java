package Servidor;

public class Medico_Objeto {

    int ID;
    String CPF, Nome, CRM, Esp, Desc, Valor;

    public Medico_Objeto(int ID, String CPF, String Nome, String CRM, String Esp, String Desc, String Valor) {
        this.ID = ID;
        this.CPF = CPF;
        this.Nome = Nome;
        this.CRM = CRM;
        this.Esp = Esp;
        this.Desc = Desc;
        this.Valor = Valor;
    }

    public Medico_Objeto(int ID, String CPF, String Nome, String Esp) {
        this.ID = ID;
        this.CPF = CPF;
        this.Nome = Nome;
        this.Esp = Esp;
    }

    public Medico_Objeto() {
    }

    public int getID() {
        return ID;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getEsp() {
        return Esp;
    }

    public String getCRM() {
        return CRM;
    }

    public String getDesc() {
        return Desc;
    }

    public String getValor() {
        return Valor;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEsp(String Esp) {
        this.Esp = Esp;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    

}
