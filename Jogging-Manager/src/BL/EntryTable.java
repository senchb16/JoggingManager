/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Christoph
 */
public class EntryTable extends AbstractTableModel {
    ArrayList<Entry> entries = new ArrayList<>();
    private static String[] colNames = {"User","Distance [km]","Date","burned Calories"};
    
    /**
     * 
     * @param i int
     * @return colNames - String[]
     */
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    /**
     * 
     * @return entries.size() - int
     */
    @Override
    public int getRowCount() {
        return entries.size();
    }
    
    /**
     * 
     * @return colnames.length - int
     */
    @Override
    public int getColumnCount() {
        return colNames.length;
    }
    
    /**
     * 
     * @param row
     * @param col
     * @return Object
     */
    @Override
    public Object getValueAt(int row, int col) {
        Entry entry = entries.get(row);
        switch(col){
            case 0: return entry.getUsername();
            case 1: return entry.getDistance();
            case 2: return entry.getDate().toString();
            case 3: return entry.getCalories();
            default: return "????";
        }
    }
    
    /**
     * 
     * @param entries ArrayList
     * @throws Exception 
     */
    public void show( ArrayList<Entry> entries) throws Exception{
        if(entries.isEmpty()){
            throw new Exception("There are not entries to show yet!");
        }
        this.entries = entries;
        fireTableDataChanged();
    }
    
}
