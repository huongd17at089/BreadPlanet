
package view.Phieu;

import java.awt.Desktop;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
 
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author MeoMeo
 * @author DinhGi
 */
public class Report {
    
 
    public static void openExcelFile(DefaultTableModel data1, DefaultTableModel data2) throws IOException {
 
        HSSFWorkbook workbook = new HSSFWorkbook();
        String filename = "C:/demo/report-nhap/xuat-" + 
                            new SimpleDateFormat("dd/MM/yyyy").format(new Date())+ "-" +
                            new Date().getTime() +".xls";
        addSheet(workbook, data1);
        addSheet(workbook, data2);
        File file = new File(filename);
        file.getParentFile().mkdirs();
 
        FileOutputStream outFile = new FileOutputStream(filename);
        workbook.write(outFile);
        outFile.close();
        try {
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void addSheet(HSSFWorkbook workbook,DefaultTableModel data ){
        HSSFSheet sheet = workbook.createSheet(data.getColumnName(3));
 
      
        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
       
 
        row = sheet.createRow(rownum);
 
        //ma phieu
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue(data.getColumnName(0));
        cell.setCellStyle(style);
        // ma banh
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue(data.getColumnName(1));
        cell.setCellStyle(style);
        // so luong
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue(data.getColumnName(2));
        cell.setCellStyle(style);
        // ngay
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue(data.getColumnName(3));
        cell.setCellStyle(style);

        int numrowcount = data.getRowCount();
        for (int i =0; i < numrowcount ; i++) {
            rownum++;
            row = sheet.createRow(rownum);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(data.getValueAt(i, 0).toString());
            
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(data.getValueAt(i, 1).toString());
            
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(Integer.parseInt(data.getValueAt(i, 2).toString()));
            
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(data.getValueAt(i, 3).toString());

        }
        
        
    }
 
}
