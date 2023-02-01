package Basic;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class FetchingDataFromPdf {
	public static void main(String[] args) throws IOException, SAXException, TikaException {
		BodyContentHandler contenthandler =new BodyContentHandler();
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/ADULT STEM CELLS AND THEIR NICHES.pdf");
		
		Metadata metadata=new Metadata();
		
		ParseContext parsecontext=new ParseContext();
		
		PDFParser parser=new PDFParser();
		parser.parse(fis, contenthandler, metadata, parsecontext);
		System.out.println(contenthandler.toString());
	}

}
