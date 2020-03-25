import java.io.*;
import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.util.*;

public class ListReader {

	public static void main(String[] args) {
		List<ToDoItem> theList = new ArrayList<ToDoItem>();
		
		File xmlFile = new File("todo.xml");
		try {
			DocumentBuilder xmlDocBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = xmlDocBuilder.parse(xmlFile);

			NodeList nodelist = doc.getElementsByTagName("item");
			for(int i=0; i<nodelist.getLength(); i++) {
				theList.add(new ToDoItem((Element) nodelist.item(i)));
			}
		} catch (ParserConfigurationException e) {
			System.out.println("Couldn't get DocumentBuilder.");
			e.printStackTrace();
		} catch (SAXException e) {
			System.out.println("SAXException trying to parse DocumentBuilder.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException trying to parse DocumentBuilder.");
			e.printStackTrace();
		}
		
		System.out.println(theList);
	}
}