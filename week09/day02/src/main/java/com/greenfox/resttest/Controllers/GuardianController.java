package com.greenfox.resttest.Controllers;

import com.greenfox.resttest.Model.Errormsg;
import com.greenfox.resttest.Model.Guardian;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value = "/groot")
    public Object imgroot(@RequestParam(value = "message", required = false) String somemessage) {
        if (somemessage != null) {
            return new Guardian(somemessage);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errormsg("ERROR"));
        }
    }
}
