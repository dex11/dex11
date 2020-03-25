import org.w3c.dom.*;

public class ToDoItem {
	String name;
	String dueDate = "none";
	String location = "none";
	String priority;
	
	public ToDoItem(Element element) {
		if (!element.hasAttributes()) {
			priority = "medium";
		} else {
			priority = element.getAttribute("priority");
		}
		
		Node node;
		NodeList nodelist;
		
		node = element.getElementsByTagName("name").item(0);
			// here I assume that the document follows the DTD and must have a single name node
		this.name = node.getTextContent();
		
		nodelist = element.getElementsByTagName("due");
		if (nodelist.getLength() >= 1) {
			node = nodelist.item(0);
			dueDate = node.getTextContent();
		}
		
		nodelist = element.getElementsByTagName("location");
		if (nodelist.getLength() >= 1) {
			node = nodelist.item(0);
			location = node.getTextContent();
		}
				
	}

	@Override
	public String toString() {
		return "ToDoItem [dueDate=" + dueDate + ", location=" + location
				+ ", name=" + name + ", priority=" + priority + "]";
	}
	

}
