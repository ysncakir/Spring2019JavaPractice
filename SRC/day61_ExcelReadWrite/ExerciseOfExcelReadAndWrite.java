package day61_ExcelReadWrite;

public class ExerciseOfExcelReadAndWrite {

	public static void main(String[] args) {
        String path = "/Users/ysncakir/Desktop/warmUp.xlsx";
        String sheetName = "Sheet1";
        
        ExcelReadAndWrite obj = new ExcelReadAndWrite(path, sheetName);
        
        String data1 = obj.readData(1, 0);
        System.out.println(data1);
        
        obj.WriteData(1, 0, "Mehmet");
        
        String data2 =  obj.readData(1, 0);
        System.out.println( data2 );  //
        
            
    }

	
}
