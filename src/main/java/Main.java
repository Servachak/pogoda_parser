import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by adavi on 05.04.2018.
 */
public class Main {

//    private static Document

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://meteopost.com/pogoda/kharkov/").get();

        Elements elements = document.select("img");

        for (Element element : elements) {
            System.out.println(element.attr("src"));
        }


    }
}
