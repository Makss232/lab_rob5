import java.util.ArrayList;
import java.util.List;
class Category {
    private String name;
    private List<Super> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Super product) {
        products.add(product);
    }

    public List<Super> getProducts() {
        return products;
    }

    public void printCategoryInfo() {
        System.out.println("Категорія: " + name);
    }
}