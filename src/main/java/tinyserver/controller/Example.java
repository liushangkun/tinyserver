/**
 * 
 */
package tinyserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsk
 */
@RestController
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
