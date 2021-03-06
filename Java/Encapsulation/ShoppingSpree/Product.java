package ShoppingSpree;

class Product {

    private String product;
    private double price;

    public Product(String product, int price) {
        this.setProduct(product);
        this.setPrice(price);
    }

    public String getProduct() {
        return this.product;
    }

    public double getPrice() {
        return this.price;
    }

    private void setProduct(String product) {
        if (product.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.product = product;
    }

    private void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = price;
    }


}
