

package fliokart.java.practice;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class ReadingXML {
	@Test
	public void readingxml() throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//ccreatig a doc from a filr
		Document doc = db.parse("D://readxml.xml");
		//getting root element 
		Element root = doc.getDocumentElement();
		System.out.println("root Elemnt is :" + root);
		//examin the attributes
		NodeList list =  root.getElementsByTagName("employee");
		System.out.println(list.getLength()+" -- Length");
		System.out.println("--------------");
		for(int c=0;c<list.getLength();c++){
			Node n = list.item(c);
			if(n.getNodeType()== Node.ELEMENT_NODE){
				Element e = (Element) n;
				System.out.println(e.getAttribute("id"));
				System.out.println(e.getElementsByTagName("firstName").item(0).getTextContent());
				System.out.println(e.getElementsByTagName("lastName").item(0).getTextContent());
				System.out.println(e.getElementsByTagName("location").item(0).getTextContent());
				//System.out.println(e.getElementsByTagName("phone").item(0).getTextContent());
				NodeList list1 = root.getElementsByTagName("phone");
				for(int d=0;d<list1.getLength();d++){
					Node l = list1.item(d);
					if(l.getNodeType()==Node.ELEMENT_NODE){
					Element e1 = (Element) l;
					System.out.println(e1.getAttribute("no"));
					}
				}
				
			//http://howtodoinjava.com/xml/java-xml-dom-parser-example-tutorial/
			
			}
		}
		
		
		
		
		
		
		/*
		
		//System.out.println(doc.getDocumentElement().getNodeName());
		String rootnode = doc.getDocumentElement().getNodeName();
		System.out.println("root element "+rootnode);
		NodeList nodelist = doc.getElementsByTagName("student");
		int nodelistsize = nodelist.getLength();
		System.out.println(nodelistsize);
		for(int n=0;n<nodelistsize;n++){
			Node node = nodelist.item(n);
			System.out.println(node.getNodeName());
			
				
					
					/*System.out.println(node.getNodeName()+" id is "+studentnode.getAttribute("id"));
				System.out.println(studentnode.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println(studentnode.getElementsByTagName("lastname").item(0).getTextContent());
					*/
				}
		}
		
		
	


