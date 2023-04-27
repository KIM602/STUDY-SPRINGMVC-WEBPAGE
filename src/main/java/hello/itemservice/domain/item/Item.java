package hello.itemservice.domain.item;

import lombok.Data;

//@Data 핵심 도메인에서는 위험. 예측하지 못하게 동작할 수 있음
//@Getter @Setter 사용
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
