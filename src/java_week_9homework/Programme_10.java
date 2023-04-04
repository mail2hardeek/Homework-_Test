package java_week_9homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme_10 {

    public static void main(String[] args) { //MAin method
        Map<String, String> stations = new HashMap<>();
        stations.put("Aldgate", "Metropolitan");
        stations.put("Aldagate East", "District");
        stations.put("Angel", "Northern");
        stations.put("Baker Street", "Bakerloo");
        stations.put("Bank", "Central");
        stations.put("Barbican", "Metropolitian");
        stations.put("Bayswater", "District");
        stations.put("Blackfriars", "District");
        stations.put("Bond Street", "Central");
        stations.put("Borough", "Northern");
        stations.put("Cannon Street", "District");
        stations.put("Chancery Lane", "Central");
        stations.put("Charing Cross", "Bakerloo");
        stations.put("City Thameslink", "Thameslink");
        stations.put("Covent Garden", "Piccadilly");
        stations.put("Earl's Court", "District");
        stations.put("Edgware Road (Bakerloo)", "Bakerloo");
        stations.put("Edgware Road (Circle/District/Hammersmith & City)", "Circle/District/Hammersmith & City");
        stations.put("Elephant & Castle", "Bakerloo/Northern");
        stations.put("Embankment", "Bakerloo/Northern");
        stations.put("Euston", "Northern/Victoria");
        stations.put("Euston Square", "Circle/Hammersmith & City");
        stations.put("Elephant & Castle", "Bakerloo/Northern");
        stations.put("Embankment", "Bakerloo/Northern");
        stations.put("Euston", "Northern/Victoria");
        stations.put("Euston Square", "Circle/Hammersmith & City/Metropolitan");
        stations.put("Farringdon", "Circle/Hammersmith & City/Metropolitan");
        stations.put("Gloucester Road", "Circle/District/Piccadilly");
        stations.put("Goodge Street", "Northern");
        stations.put("Great Portland Street", "Circle/Hammersmith & City/Metropolitan");
        stations.put("Green Park", "Jubilee/Piccadilly/Victoria");
        Scanner scanner = new Scanner(System.in); //Scanner declared
        System.out.println("\nEnter station name");
        String station = scanner.nextLine();

        if (stations.containsKey(station)) {
            System.out.println("\n" + station + " is on the" + stations.get(station) + "line.");
            System.out.println("\n Thank you for using this program !");
            scanner.close(); //Scanner close
            return;
        } else {
            System.out.println("\nSorry, this station is not in Zone1");
            System.out.println("\nThank you for using this program!");
            scanner.close();
            return;
        }
    }

}

