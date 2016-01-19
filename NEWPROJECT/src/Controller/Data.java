package Controller;

import java.util.ArrayList;

public class Data {
    static ArrayList<Product> list= new ArrayList<Product>();
    static {
        list.add(new Product(1, "SP1", 1, "http://localhost:8080/Test/index_files/giay-nam-han-quoc-tl55-1-150x150.jpg"));
        list.add(new Product(2, "SP2", 1, "http://localhost:8080/Test/index_files/giay-da-nam-cao-cap-mau-den-150x150.jpg"));
        list.add(new Product(3, "SP3", 1, "http://localhost:8080/Test/index_files/giay-da-nam-cao-cap-mau-nau-3-150x150.jpg"));
        list.add(new Product(4, "SP4", 1, "http://localhost:8080/Test/index_files/giay-nam-han-quoc-mau-nau-vang-2-150x150.jpg"));
        list.add(new Product(5, "SP5", 1, "http://localhost:8080/Test/index_files/giay-nam-han-quoc-mau-nau-vang-2-150x150.jpg"));
        
    }
    public static Product getProduct(int id) {
        for (Product i : list) {
            if(i.getId()==id)return new Product(i);
        }
        return null;
    }
}
