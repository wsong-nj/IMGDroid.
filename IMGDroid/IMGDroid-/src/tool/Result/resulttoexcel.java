package tool.Result;

import java.io.File;

//import com.test.xmldata.ProcessManifest;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//import tool.Analy.Antipattern.AndroidAnalysis;
import tool.testForApks.TestAnalysis;


	public class resulttoexcel {
		public static WritableWorkbook book; //book
	    public static WritableSheet sheet; //sheet
	    public static String SheetName="AnalysisResults"; //sheet name
	    
		public void initExcel(String ExcelFileLocation){
		   try {
			    book= Workbook.createWorkbook(new File(ExcelFileLocation));
			    sheet=book.createSheet(SheetName,0); 
		        Label HeadAppName=new Label(0,0,"App name"); 
		        sheet.addCell(HeadAppName); 
		        Label HeadEnableService= new Label(1,0,"withoutResizing"); 
		        sheet.addCell(HeadEnableService); 
		        Label HeadFirstPattern=new Label(2,0,"intent analysis");
		        sheet.addCell(HeadFirstPattern);
		        Label HeadSecondPattern1=new Label(3,0,"LoopDecoding");
		        sheet.addCell(HeadSecondPattern1);
		        Label HeadSecondPattern2=new Label(4,0,"Decoding in ui");
		        sheet.addCell(HeadSecondPattern2);
		        Label HeadSecondPattern3=new Label(5,0,"withoutpermission");
		        sheet.addCell(HeadSecondPattern3);
		        //Label HeadThirdPattern=new Label(6,0,"Total");
		       // sheet.addCell(HeadThirdPattern);
		        
//		        Label Head1=new Label(7,0,"startService");
//		        sheet.addCell(Head1);
//		        Label Head2=new Label(8,0,"bindService");
//		        sheet.addCell(Head2);
//		        Label Head3=new Label(9,0,"hybridService");
//		        sheet.addCell(Head3);

		       } catch (Exception e) {
			       // TODO Auto-generated catch block
			       e.printStackTrace();
		       }    
		}

	public void addOneLine2Excel(String appName,TestAnalysis myInstrumentor,int i){
			
			System.out.println("-----------------add one record into the excel--------------------------------");
			try{
	            Label LineAppName=new Label(0,i,appName);
	            sheet.addCell(LineAppName);
//	    	    Label LineEnableService;
//	            if(myInstrumentor.flagEnableService==true)
//	            {
//	            	LineEnableService=new Label(1,i,"Yes");
//	             }
//	            else
//	            {
//	            	LineEnableService=new Label(1,i,"No");
//	            }
	           // sheet.addCell(LineEnableService);
	            Label LineFirstPattern=new Label(1,i,String.valueOf(myInstrumentor.w));
	            sheet.addCell(LineFirstPattern);
	            Label LineSecondPattern=new Label(2,i,String.valueOf(myInstrumentor.a));
	            sheet.addCell(LineSecondPattern);
	            Label LineThridPattern=new Label(3,i,String.valueOf(myInstrumentor.r));
	            sheet.addCell(LineThridPattern);
	            Label LineForthPattern=new Label(4,i,String.valueOf(myInstrumentor.u));
	            sheet.addCell(LineForthPattern);
//	            Label LineTotal=new Label(6,i,String.valueOf(myInstrumentor.total));
//	            sheet.addCell(LineTotal);
//	            Label Line1=new Label(7,i,String.valueOf(myInstrumentor.startServiceCount));
//	            sheet.addCell(Line1);
//	            Label Line2=new Label(8,i,String.valueOf(myInstrumentor.bindServiceCount));
//	            sheet.addCell(Line2);
//	            Label Line3=new Label(9,i,String.valueOf(myInstrumentor.hybridServiceCount));
//	            sheet.addCell(Line3);
	         } 
			 catch(Exception e){ 
	        	 System.out.println(e);
	         } 
		 } 
		public void WriteAll(){
			try {
	    		book.write();
				book.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



