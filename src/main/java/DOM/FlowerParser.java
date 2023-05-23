package DOM;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import mypackage.Flower;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class FlowerParser {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("flowers.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("Plant");
            ArrayList<Flower> flowers = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Flower flower = new Flower();
                    NodeList plantInfo = node.getChildNodes();
                    for (int j = 0; j < plantInfo.getLength(); j++) {
                        Node infoNode = plantInfo.item(j);
                        if (infoNode.getNodeType() == Node.ELEMENT_NODE) {
                            String nodeName = infoNode.getNodeName();
                            String nodeValue = infoNode.getTextContent();
                            switch (nodeName) {
                                case "Name":
                                    flower.setName(nodeValue);
                                    break;
                                case "Soil":
                                    flower.setSoil(nodeValue);
                                    break;
                                case "Origin":
                                    flower.setOrigin(nodeValue);
                                    break;
                                case "StemColor":
                                    flower.setStemColor(nodeValue);
                                    break;
                                case "LeafColor":
                                    flower.setLeafColor(nodeValue);
                                    break;
                                case "Size":
                                    flower.setSize(nodeValue);
                                    break;
                                case "Temperature":
                                    flower.setTemperature(Integer.parseInt(nodeValue));
                                    break;
                                case "Lighting":
                                    flower.setLighting(Boolean.parseBoolean(nodeValue));
                                    break;
                                case "Watering":
                                    flower.setWatering(Integer.parseInt(nodeValue));
                                    break;
                                case "Multiplying":
                                    flower.setMultiplying(nodeValue);
                                    break;
                            }
                        }
                    }
                    flowers.add(flower);
                }
            }

            for (Flower flower : flowers) {
                System.out.println(flower.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}