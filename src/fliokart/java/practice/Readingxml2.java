package fliokart.java.practice;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Readingxml2 {
	//http://www.drdobbs.com/jvm/easy-dom-parsing-in-java/231002580
	public Node getNode(String tagname , NodeList nodes){
		for(int n=0;n<nodes.getLength();n++){
			Node node = nodes.item(n);
			if(node.getNodeName().equals(tagname))
				return node;
		}
		return null;
	}
	
	public String getNodeValue(Node node){
		NodeList nodelist = node.getChildNodes();
		for(int n=0;n<nodelist.getLength();n++){
			Node nodedata = nodelist.item(n);
			if(nodedata.getNodeType()== Node.TEXT_NODE)
				return node.getNodeValue();
		}
		return null;
	}
	
	public String getNodeValue(NodeList list , String tagname){
			for(int n=0;n<list.getLength();n++){
			Node childnode = list.item(n);
			if(childnode.getNodeName().equals(tagname)){
				NodeList childnodes = childnode.getChildNodes();
				for (int y = 0; y < childnodes.getLength(); y++ ) {
	                Node data = childnodes.item(y);
	                if ( data.getNodeType() == Node.TEXT_NODE )
	                    return data.getNodeValue();
			}
		}
		
	}
	return null;
}
}
