package dev.limjustin.jejupractice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public Long saveCoffee(CoffeeDto coffeeDto) {
        Coffee coffee = Coffee.builder()
                .name(coffeeDto.getName())
                .price(coffeeDto.getPrice())
                .build();
        Coffee savedCoffee = coffeeRepository.save(coffee);
        return savedCoffee.getId();
    }

    public Coffee findCoffee(Long id) {
        return coffeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Coffee not found"));
    }
}
