/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storefront;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chris
 */
class CsvReader {

    
    //private static final int ID_IDX = 0;

    private static final int CATEGORY = 0;
    private static final int NAME = 1;
    private static final int PRICE = 2;
    private static final int STOCK = 3;
    ArrayList<InventoryItem> inventory = new ArrayList<InventoryItem>();
    
    
    public ArrayList<InventoryItem> csvReader(String filename){
        inventory = populateInventory(filename);
        return inventory;
    }
    
    
    
    
    public ArrayList<InventoryItem> populateInventory(String fileName) {

        BufferedReader fileReader = null;

        try {

            String line = null;
            fileReader = new BufferedReader(new FileReader(fileName));

            fileReader.readLine();

            while ((line = fileReader.readLine()) != null) {

                String[] tokens;

                tokens = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                if (tokens.length > 0) {

                    String regex = "(?<=\\d),(?=\\d)";

                    if (tokens[PRICE].contains(",")) {
                        String comma = tokens[PRICE].replaceAll(regex, "");
                        tokens[PRICE] = comma;
                    }

                    if (tokens[PRICE].contains("\"")) {
                        //System.out.println(true);
                        String quote = tokens[PRICE].replaceAll("\"", "");
                        tokens[PRICE] = quote;
                    }
                    if (tokens[PRICE].startsWith("$")) {
                        //System.out.println(tokens[PRICE]);
                        String dollar = tokens[PRICE].substring(1);
                        //System.out.println(true + " " + dollar);
                        tokens[PRICE] = dollar;
                        //System.out.println(tokens[PRICE]);
                    }
                    
                    

                    InventoryItem item = new InventoryItem(tokens[CATEGORY], tokens[NAME],
                            Double.parseDouble(tokens[PRICE]), Integer.parseInt(tokens[STOCK]));

                    inventory.add(item);
                }
            }

        } catch (Exception e) {
            System.out.println("CSV READER ERROR");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing");
                e.printStackTrace();
            }
        }

        return inventory;
    }
    
     
        

}
