/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author APinero
 *
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping(method = RequestMethod.GET)
    String readResource() {
        return "Hola!";
    }
}