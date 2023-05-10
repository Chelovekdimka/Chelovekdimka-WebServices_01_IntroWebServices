package SAX;

import mypackage.Flower;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlowerHandler extends DefaultHandler {

    private List<Flower> flowers;
    private Flower currentFlower;
    private StringBuilder currentText;

    public List<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        flowers = new ArrayList<>();
        currentText = new StringBuilder();
        System.out.println("Start document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if ("Plant".equals(qName)) {
            currentFlower = new Flower();
        }
        System.out.println("Start element: " + qName);
        if (attributes.getLength()>0) {
            System.out.println("First attribute: " + attributes.getQName(0) + attributes.getValue(0) );
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        currentText.append(ch, start, length);
        System.out.println("Characters: " + new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (currentFlower != null) {
            switch (qName) {
                case "Name":
                    currentFlower.setName(currentText.toString().trim());
                    break;
                case "Soil":
                    currentFlower.setSoil(currentText.toString().trim());
                    break;
                case "Origin":
                    currentFlower.setOrigin(currentText.toString().trim());
                    break;
                case "StemColor":
                    currentFlower.setStemColor(currentText.toString().trim());
                    break;
                case "LeafColor":
                    currentFlower.setLeafColor(currentText.toString().trim());
                    break;
                case "Size":
                    currentFlower.setSize(currentText.toString().trim());
                    break;
                case "Temperature":
                    currentFlower.setTemperature(Integer.parseInt(currentText.toString().trim()));
                    break;
                case "Lighting":
                    currentFlower.setLighting(Boolean.parseBoolean(currentText.toString().trim()));
                    break;
                case "Watering":
                    currentFlower.setWatering(Integer.parseInt(currentText.toString().trim()));
                    break;
                case "Multiplying":
                    currentFlower.setMultiplying(currentText.toString().trim());
                    break;
                case "Plant":
                    flowers.add(currentFlower);
                    currentFlower = null;
                    break;
            }
            currentText.setLength(0);
        }
    }

    public void sortFlowersByTemperature() {
        Collections.sort(flowers, Comparator.comparingInt(Flower:: getTemperature));
    }

}