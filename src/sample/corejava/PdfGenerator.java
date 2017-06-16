package sample.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {

	private static final String FILE_NAME = "C:/Users/revathi.a/Desktop/itext.pdf";

	public static void main(String[] args) {
		writeUsingIText();
	}

	private static void writeUsingIText() {

		Document document = new Document();

		try {

			PdfWriter.getInstance(document, new FileOutputStream(new File(
					FILE_NAME)));

			// open
			document.open();

			Paragraph p = new Paragraph();
			p.add("This is my paragraph 1");
			p.setAlignment(Element.ALIGN_CENTER);

			document.add(p);

			Paragraph p2 = new Paragraph();
			p2.add("This is my paragraph 2"); // no alignment

			document.add(p2);

			Font f = new Font();
			f.setStyle(Font.BOLD);
			f.setSize(8);

			document.add(new Paragraph("This is my paragraph 3", f));

			// close
			document.close();

			System.out.println("Done");

		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}