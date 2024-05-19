package dev.limjustin.jejupractice.coffee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@Getter
@Entity
public class Coffee {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;
    private int price;

    @Builder
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
