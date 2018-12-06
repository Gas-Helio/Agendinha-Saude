package Servidor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Consulta_ConfigTabel1 extends AbstractTableModel {

    private ArrayList<Consulta_Objeto> produtos;
    private int COL_ID = 0, COL_NMED = 1, COL_NPAC = 2, COL_DATA = 3, COL_HORA = 4;

    public Consulta_ConfigTabel1() {
        produtos = new ArrayList();
    }

    public Consulta_ConfigTabel1(List lista) {
        this();
        produtos.addAll(lista);
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_ID) {
            return "ID";
        } else if (column == COL_NMED) {
            return "MÉDICO";
        } else if (column == COL_NPAC) {
            return "PACIENTE";
        } else if (column == COL_DATA) {
            return "DATA";
        } else if (column == COL_HORA) {
            return "HORA";
        }
        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_NMED) {
            return String.class;
        } else if (columnIndex == COL_NPAC) {
            return String.class;
        } else if (columnIndex == COL_DATA) {
            return String.class;
        } else if (columnIndex == COL_HORA) {
            return String.class;
        }
        return String.class;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consulta_Objeto p = produtos.get(rowIndex);

        if (columnIndex == COL_ID) {
            return p.getID();
        } else if (columnIndex == COL_NMED) {
            return p.getNMed();
        } else if (columnIndex == COL_NPAC) {
            return p.getNPac();
        } else if (columnIndex == COL_DATA) {
            return p.getData();
        } else if (columnIndex == COL_HORA) {
            return p.getHora();
        }
        return "";
    }

    public int getCod(int rowIndex) {
        Consulta_Objeto p = produtos.get(rowIndex);

        return p.getID();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void inserir(Consulta_Objeto p) {
        produtos.add(p);

        fireTableDataChanged();
    }

    public ArrayList excluir(int pos) {
        System.out.println(produtos.get(pos).getID());
        produtos.remove(pos);

        fireTableDataChanged();

        return produtos;
    }

    public ArrayList excluir(Consulta_Objeto p) {
        produtos.remove(p);

        fireTableDataChanged();

        return produtos;
    }

    public Consulta_Objeto getComponentes(int pos) {
        if (pos < 0 || pos >= produtos.size()) {
            return null;
        }

        return produtos.get(pos);
    }
}
