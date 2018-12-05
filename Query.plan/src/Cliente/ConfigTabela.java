package Cliente;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;

public class ConfigTabela extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ConfigTabela(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        colunas = nomes;
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public int getRowCount() {
        return linhas.size();
    }

    public String getColumnName(int numCol) {
        return colunas[numCol];
    }
    
    public void ordenarPorCod() {
        Collections.sort(linhas, (ConfigTabela o1, ConfigTabela o2) -> o1.getColumnName(0).compareTo(o2.getColumnName(0)));

        fireTableDataChanged();
    }
    
    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];
    }
}