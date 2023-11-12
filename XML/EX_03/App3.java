import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class App3 {
    public static void main(String[] args) {
        String xatakaSitemapUrl = "https://www.xataka.com/sitemap.xml";

        try {
            processSitemap(xatakaSitemapUrl, "XMLs");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processSitemap(String sitemapUrl, String outputFolder) throws IOException, Exception {
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
                processSitemap(currentUrl, outputFolder);
            } else if (currentUrl.endsWith(".xml")) {
                processNewsSitemap(currentUrl, outputFolder);
            }
        }
    }

    private static void processNewsSitemap(String newsSitemapUrl, String outputFolder) throws IOException, Exception {
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

        if (urlElements.getLength() > 0) {
            String filename = url.getFile().replaceAll("/", "_").replaceAll("\\.", "_") + ".xml";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFolder + "/" + filename))) {
                for (int i = 0; i < urlElements.getLength(); i++) {
                    writer.write(urlElements.item(i).getTextContent());
                    writer.newLine();
                }
            }
        }
    }
}
