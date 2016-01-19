package Controller;

public class Product {
    int id;
    String name;
    int count;
    String url;
    public Product() {
    }
    
    public Product(Product p) {
        this.id = p.id;
        this.name = p.name;
        this.count = p.count;
        this.url = p.url;
    }
    public Product(int id, String name, int count, String url) {
        super();
        this.id = id;
        this.name = name;
        this.count = count;
        this.url = url;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void plusCount() {
       count++;
    }
    public void plusCount(int plus) {
        count+=plus;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}
