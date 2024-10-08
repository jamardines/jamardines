class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getProductName() + " with quantity " + product.getQuantity());
    }

    public void removeProduct(String productId) {
        boolean productRemoved = false;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getProductId().equals(productId)) {
                products.remove(i);
                System.out.println("Product removed: " + productId + " successfully.");
                productRemoved = true;
                break; // Exit the loop after removing the product
            }
        }
        if (!productRemoved) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
}
