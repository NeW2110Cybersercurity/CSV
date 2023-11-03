/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.CSVProgram;
import java.util.ArrayList;
import model.CSV;
import view.Menu;

/**
 *
 * @author Thao Chi
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<CSV> ls = new ArrayList<>();
        ls.add(new CSV(1, "Pham PhU DO      NG", "PHUDONG@gmail.com", "'0968038714", "khaNh Cong   - yEN  KhanH -    Ninh binh"));
        ls.add(new CSV(2, "NGUyen hai         nAM   ", "namhai@gmail.com", "'0984481345", "ThaCH  HOA - thach that   -   Ha noI"));
        ls.add(new CSV(3, "Tran lUONG tHAO CHi  ", "enthao@gmail.com", "'0986246814", "Cau Giay     - Ha    Noi    - Viet Nam    "));
        String title = "FILE CSV Management ";
        String[] s = new String[]{"Import CSV", "Format Address",
            "Format Name", "Export CSV", "Exit"};
        Menu<String> menu = new CSVProgram(title, s);
        menu.run();
        //D:\PRO192\CSV\...
        
    }
}