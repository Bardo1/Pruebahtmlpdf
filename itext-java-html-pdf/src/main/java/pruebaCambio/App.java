package pruebaCambio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class App 
{
    public static void main( String[] args ) throws DocumentException, IOException
    {
    	Document document = new Document();    
    	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("pdf8.pdf"));  
        document.open();
        XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("index.html"));	   
        document.close();

        System.out.println( "PDF Creado" );
    }
}
