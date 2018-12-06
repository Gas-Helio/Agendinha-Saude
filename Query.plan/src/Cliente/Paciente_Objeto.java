package Cliente;

import java.util.ArrayList;

/**
 *
 * @author raahp
 */
public class Paciente_Objeto {
    int ID;
    String CPF, Nome, Idade, Peso, Altura, Login, Senha;
    ArrayList<Paciente_Objeto> pac;

    public Paciente_Objeto(int id, String CPF, String Nome, String Idade, String Peso, String Altura, String Login, String Senha) {
        this.ID = id;
        this.CPF = CPF;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Login = Login;
        this.Senha = Senha;
    }
    
    public Paciente_Objeto() {
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

    public String getIdade() {
        return Idade;
    }

    public String getPeso() {
        return Peso;
    }

    public String getAltura() {
        return Altura;
    }

    public String getLogin() {
        return Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
