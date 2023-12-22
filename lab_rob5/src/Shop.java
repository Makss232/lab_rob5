import java.util.ArrayList;
import java.util.List;

class Shop {
    private List<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void printAllProducts(List<Category> categories) {
        for (Category category : categories) {
            for (Super product : category.getProducts()) {
                System.out.println(product.toString()); // using overridden toString()
            }
            if (!category.getProducts().isEmpty()) {
                System.out.println();
            }
        }
    }
}