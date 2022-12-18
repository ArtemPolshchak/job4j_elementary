package ru.job4j.parsing;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Polshchak on 25.12.2021.
 * @project xml parsing
 */
public class Main {
    public static void main(String[] args) {
        Root root = new Root();

        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Open parsing error " + e.toString());
            return;
        }

        Node rootNode = doc.getFirstChild();
        /*System.out.println("AAA " + rootNode.getNodeName());*/

        NodeList rootChild = rootNode.getChildNodes();

        String mainName = null;
        Node peopleNode = null;

        for (int i = 0; i < rootChild.getLength(); i++) {
            if (rootChild.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            System.out.println(rootChild.item(i).getNodeName());

            switch (rootChild.item(i).getNodeName()) {
                case "name" -> {
                    mainName = rootChild.item(i).getTextContent();
                    System.out.println("Main name = " + mainName);
                }
                case "people" -> {
                    peopleNode = rootChild.item(i);
                }
                default -> {
                }
            }
        }

        if (peopleNode == null) {
            return;
        }
        List<People> list = new ArrayList<>();
        NodeList peopleChild = peopleNode.getChildNodes();
        for (int i = 0; i < rootChild.getLength(); i++) {
            if (peopleChild.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            if (!peopleChild.item(i).getNodeName().equals("element")) {
                continue;
            }

            String name = "";
            int age = 0;

            NodeList elementChilds = peopleChild.item(i).getChildNodes();
            for (int j = 0; j < elementChilds.getLength(); j++) {

                if (elementChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                switch (elementChilds.item(j).getNodeName()) {
                    case "name" :
                        name = elementChilds.item(j).getTextContent();
                        break;

                    case "age" :
                        age = Integer.parseInt(elementChilds.item(j).getTextContent());
                        break;

                    default:

                }
            }

            People people = new People(name, age);
            list.add(people);
        }
        root.setName(mainName);
        root.setPeople(list);

        System.out.println("Root = " + root.toString());
    }

    private static Document buildDocument() throws Exception {
        File file = new File("test.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }
}
