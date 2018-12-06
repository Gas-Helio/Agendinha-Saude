package Servidor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Paciente_ConfigTabel extends AbstractTableModel {

    private ArrayList<Paciente_Objeto> produtos;
    private int COL_ID = 0, COL_CPF = 1, COL_NOME = 2, COL_IDADE = 3, COL_PESO = 4, COL_ALTURA = 5;

    public Paciente_ConfigTabel() {
        produtos = new ArrayList();
    }

    public Paciente_ConfigTabel(List lista) {
        this();
        produtos.addAll(lista);
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_ID) {
            return "ID";
        } else if (column == COL_CPF) {
            return "CPF";
        } else if (column == COL_NOME) {
            return "NOME";
        } else if (column == COL_IDADE) {
            return "IDADE";
        } else if (column == COL_PESO) {
            return "PESO";
        } else if (column == COL_ALTURA) {
            return "ALTURA";
        }
        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_CPF) {
            return String.class;
        } else if (columnIndex == COL_NOME) {
            return String.class;
        } else if (columnIndex == COL_IDADE) {
            return String.class;
        } else if (columnIndex == COL_PESO) {
            return String.class;
        } else if (columnIndex == COL_ALTURA) {
            return String.class;
        }
        return String.class;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente_Objeto p = produtos.get(rowIndex);

        if (columnIndex == COL_ID) {
            return p.getID();
        } else if (columnIndex == COL_CPF) {
            return p.getCPF();
        } else if (columnIndex == COL_NOME) {
            return p.getNome();
        } else if (columnIndex == COL_IDADE) {
            return p.getIdade();
        } else if (columnIndex == COL_PESO) {
            return p.getPeso();
        } else if (columnIndex == COL_ALTURA) {
            return p.getAltura();
        }

        return "";
    }

    public int getCod(int rowIndex) {
        Paciente_Objeto p = produtos.get(rowIndex);

        return p.getID();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void inserir(Paciente_Objeto p) {
        produtos.add(p);

        fireTableDataChanged();
    }

    public ArrayList excluir(int pos) {
        System.out.println(produtos.get(pos).getID());
        produtos.remove(pos);

        fireTableDataChanged();

        return produtos;
    }

    public ArrayList excluir(Paciente_Objeto p) {
        produtos.remove(p);

        fireTableDataChanged();

        return produtos;
    }

    public Paciente_Objeto getComponentes(int pos) {
        if (pos < 0 || pos >= produtos.size()) {
            return null;
        }

        return produtos.get(pos);
    }
}
