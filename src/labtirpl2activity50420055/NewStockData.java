package labtirpl2activity50420055;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Afdhalul Ichsan Yourdan - 50420055
 * Activity Software Engineering 2
 */

public class NewStockData {
    private final String code, name, created_at, updated_at;
    private final int price, quantity;
    
    public NewStockData(String code, String name, int price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.created_at = this.getDateNow();
        this.updated_at = this.getDateNow();
    }
    
    private String getDateNow() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return currentDateTime.format(formatter);
    }
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String getCreated() {
        return created_at;
    }
    
    public String getUpdated() {
        return updated_at;
    }
    
    @Override
    public String toString() {
        return String.format("Item Code: %s\nItem Name: %s\nItem Price: %d\nItem Amount: %d\nCreated at: %s\nUpdated at: %s", code, name, price, quantity, created_at, updated_at);
    }
}
