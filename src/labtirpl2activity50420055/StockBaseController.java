package labtirpl2activity50420055;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Afdhalul Ichsan Yourdan - 50420055
 * Activity Software Engineering 2
 */

public class StockBaseController {
    ArrayList<NewStockData> ArrayStock;
    DefaultTableModel tableStock;
    
    public StockBaseController() {
        ArrayStock = new ArrayList<NewStockData>();
    }
    
    public void InsertStock(String code, String name, int price, int quantity) {
        NewStockData item = new NewStockData(code, name, price, quantity);
        ArrayStock.add(item);
    }
    
    public DefaultTableModel showStock() {
        String[] col = {"Code", "Name", "Price", "Quantity", "Created at", "Updated at"};
        Object[][] objDt = new Object[ArrayStock.size()][6];
        int i = 0;
        
        for(NewStockData dt : ArrayStock) {
            String[] arrDt = { dt.getCode(), dt.getName(), String.valueOf(dt.getPrice()), String.valueOf(dt.getQuantity()), dt.getCreated(), dt.getUpdated() };
            objDt[i] = arrDt;
            i++;
        }
        
        tableStock = new DefaultTableModel(objDt, col) {
            public boolean inCellEditTable(int rowIndex, int colIndex) {
                return false;
            }
        };
                
        return tableStock;
    }
}
