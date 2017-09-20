import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This is a word counting code.
 */

public class Lab3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
    }

    /**
    * Counting the number of words in a URL.
    * @param args []
    */

    public static void main(final String[] args) {
    String space = " ";
    String contents = urlToString("http://erdani.com/tdpl/hamlet.txt");
    StringTokenizer spaceTaken = new StringTokenizer(contents, space);
    int wordsCount = spaceTaken.countTokens();
    System.out.println(wordsCount);
    }
}
