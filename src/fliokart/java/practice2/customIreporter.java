package fliokart.java.practice2;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class customIreporter implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlsuite, List<ISuite> suites,
			String outputDir) {
		for(XmlSuite xmlS :xmlsuite){
			String xmlsuitename = xmlS.getName();
		for(ISuite suite :suites){
			String suitename = suite.getName();
		}
			
		}
	
		
	}

}
