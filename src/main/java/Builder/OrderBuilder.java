package Builder;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public Order build(){
        if (order.getCount() <= 0){
            throw new RuntimeException("Кол-во позиций товара указано некорректно.");
        }

        if (order.getPrice() <= 100){
            throw new RuntimeException("Цена товара указана некорректно.");
        }

        return order;
    }

    public OrderBuilder setClientName(String clientName){
        order.setClientName(clientName);
        return this;
    }

    public OrderBuilder setCompanyName(String companyName){
        order.setCompanyName(companyName);
        return this;
    }

    public OrderBuilder setProductName(String productName){
        order.setProductName(productName);
        return this;
    }

    public OrderBuilder setCount(int count){
        order.setCount(count);
        return this;
    }

    public OrderBuilder setPrice(double price){
        order.setPrice(price);
        return this;
    }

    public OrderBuilder setSign(boolean sign){
        order.setSign(sign);
        return this;
    }
}
