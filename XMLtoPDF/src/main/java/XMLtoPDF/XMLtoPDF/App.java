package XMLtoPDF.XMLtoPDF;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.fop.apps.FOPException;

public class App {
	
	
	public static void main( String[] args )
    {
        try {
        	PdfGenerationDemo pdf = new PdfGenerationDemo();
            pdf.convertToPDF();
        } catch (FOPException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }

	
	
}
