package br.com.dfsweb.importarExcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

public class LerExcel {

	public static void main(String[] args) throws IOException, BiffException {
		WorkbookSettings wbSettings = new WorkbookSettings();
		wbSettings.setEncoding("ISO-8859-1");
		
		Workbook workbook = Workbook.getWorkbook(new File("Resultado.xls"), wbSettings);
		
		Sheet sheet = workbook.getSheet(0);
		
		int linhas = sheet.getRows();
		
		System.out.println("Iniciando a leitura da planilha XLS com " + linhas + " linhas:");
		
		for(int i = 0; i < linhas; i++){
			System.out.println(">>>>>>>>>>>> LINHA " + i + ">>>>>>>>>>>>");
			Cell a1 = sheet.getCell(0, i);

			Cell a2 = sheet.getCell(1, i);

			Cell a3 = sheet.getCell(2, i);
			
			Cell a4 = sheet.getCell(3, i);
			Cell a5 = sheet.getCell(4, i);
			Cell a6 = sheet.getCell(5, i);
			Cell a7 = sheet.getCell(6, i);
			Cell a8 = sheet.getCell(7, i);
			Cell a9 = sheet.getCell(8, i);
			Cell a10 = sheet.getCell(9, i);
			Cell a11 = sheet.getCell(10, i);
			
			String as1 = a1.getContents();

			String as2 = a2.getContents();
			String as3 = a3.getContents();
			String as4 = a4.getContents();
			String as5 = a5.getContents();
			String as6 = a6.getContents();
			String as7 = a7.getContents();
			String as8 = a8.getContents();
			String as9 = a9.getContents();
			String as10 = a10.getContents();
			String as11 = a11.getContents();
			
			System.out.println("Coluna 1: " + as1);

			System.out.println("Coluna 2: " + as2);

			System.out.println("Coluna 3: " + as3);
			System.out.println("Coluna 4: " + as4);
			System.out.println("Coluna 5: " + as5);
			System.out.println("Coluna 6: " + as6);
			System.out.println("Coluna 7: " + as7);
			System.out.println("Coluna 8: " + as8);
			System.out.println("Coluna 9: " + as9);
			System.out.println("Coluna 10: " + as10);
			System.out.println("Coluna 11: " + as11);
			
		}
		
		workbook.close();

	}

}
