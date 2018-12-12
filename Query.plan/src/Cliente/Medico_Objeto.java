package Cliente;

public class Medico_Objeto {

    String CPF, Nome, Espec;

    public Medico_Objeto(String CPF, String Nome, String Espec) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Espec = Espec;
    }

    public Medico_Objeto() {
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getEspec() {
        return Espec;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEspec(String Espec) {
        this.Espec = Espec;
    }

}
