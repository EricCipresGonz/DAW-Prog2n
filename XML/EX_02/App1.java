import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class App1 {
    public static void main(String[] args) {
        String xatakaSitemapUrl = "https://www.xataka.com/sitemap.xml";

        try {
            processSitemap(xatakaSitemapUrl);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processSitemap(String sitemapUrl) throws IOException, Exception {
        URL url = new URL(sitemapUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(url.openStream());

        NodeList urlElements = document.getElementsByTagName("loc");
        for (int i = 0; i < urlElements.getLength(); i++) {
            String currentUrl = urlElements.item(i).getTextContent();
            System.out.println(currentUrl);

            if (currentUrl.endsWith("/sitemap.xml")) {
                processSitemap(currentUrl);
            } else if (currentUrl.endsWith(".xml")) {
                processNewsSitemap(currentUrl);
            }
        }
    }

    private static void processNewsSitemap(String newsSitemapUrl) throws IOException, Exception {
        URL url = new URL(newsSitemapUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(url.openStream());

        NodeList urlElements = document.getElementsByTagName("loc");
        for (int i = 0; i < urlElements.getLength(); i++) {
            System.out.println(urlElements.item(i).getTextContent());
        }
    }
}
