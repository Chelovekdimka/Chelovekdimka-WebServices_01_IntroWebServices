package SAX;

import mypackage.Flower;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class FlowerXMLParser {

    public static void main(String[] args) {

        try {
            // создание SAX парсера
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // указание пути к XML-файлу
            File inputFile = new File("src/main/java/SAX/flowers.xml");

            // создание обработчика XML-документа
            FlowerHandler flowerHandler = new FlowerHandler();

            // запуск SAX парсера на чтение XML-файла и обработку событий
            saxParser.parse(inputFile, flowerHandler);

            // получение списка объектов цветов
            List<Flower> flowers = flowerHandler.getFlowers();

            // сортировка списка цветов по имени
//            Collections.sort(flowers, new Comparator<Flower>() {
//                @Override
//                public int compare(Flower f1, Flower f2) {
//                    return f1.getPlant().compareTo(f2.getPlant());
//                }
//            });

            // вывод списка цветов
            for (Flower flower : flowers) {
                System.out.println(flower);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}