import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://meteopost.com/pogoda/kharkov/").get();

        Element tableWeather = document.select("table").get(2);


        Elements firstRow = tableWeather.select("td");

        int count = 0;
        for (Element element : firstRow) {
            if(count == 21){
                System.out.println();
                count = 0;
            }
            String date = element.select("center").text();
            System.out.print(date + "     ");
            count++;
        }
//        String date = firstRow.select("center").text();




    }
}
