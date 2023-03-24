package co.edu.uan.sofeng.ejemplo;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 

@RestController 
public class sayHello {
   @GetMapping("/")
   public String index() {
      return "Hello World";
   }
} 