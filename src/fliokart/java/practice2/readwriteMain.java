package fliokart.java.practice2;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import fliokart.java.practice.ReadWriteXls;
import fliokart.java.practice.ReadingXML;
import fliokart.java.practice.Readingxml2;


public class readwriteMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	static Node LastName;
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		ReadWriteXls rw = new ReadWriteXls();
		ReadingXML xml = new ReadingXML();
		Readingxml2 xml2 = new Readingxml2();
		//rw.Readingxls();
		//rw.writexls();
		xml.readingxml();
		//System.out.println("writing done");
		//xml2.getNodeValue(LastName);
	
	}

}
