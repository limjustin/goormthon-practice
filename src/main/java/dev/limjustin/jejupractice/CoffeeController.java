package dev.limjustin.jejupractice;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class CoffeeController {

    private final CoffeeService coffeeService;

    @PostMapping("/api/coffee/save")
    public ResponseEntity<?> saveCoffee(@RequestBody CoffeeDto coffeeDto) {
        Long coffeeId = coffeeService.saveCoffee(coffeeDto);
        return new ResponseEntity<>(coffeeId, HttpStatus.OK);
    }

    @GetMapping("/api/coffee/{coffeeId}")
    public ResponseEntity<?> findCoffee(@PathVariable("coffeeId") Long coffeeId) {
        return new ResponseEntity<>(coffeeService.findCoffee(coffeeId), HttpStatus.OK);
    }
}
