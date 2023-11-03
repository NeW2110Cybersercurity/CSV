/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import model.CSV;
import model.CSVManager;
import view.Menu;

/**
 *
 * @author Thao Chi
 */
public class CSVProgram extends Menu<String> {

    private CSVManager list = new CSVManager();
    ArrayList<CSV> ls = new ArrayList<>();

    public CSVProgram(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        
        switch (n) {
            case 1:
                list.importFile(ls);
                list.print(ls);
                break;
            case 2:
                list.formatAddress(ls);
                list.print(ls);
                break;
            case 3:
                list.formatName(ls);
                list.print(ls);
                break;
            case 4:
                list.exportFile(ls);
                list.print(ls);
                break;
            case 5:
                System.exit(0);
        }
    }
}
