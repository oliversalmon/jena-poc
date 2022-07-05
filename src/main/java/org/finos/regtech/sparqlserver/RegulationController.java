package org.finos.regtech.sparqlserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/query")
@RestController
public class RegulationController {
    //Feign Client
    FusekiClient fc;


    @PostMapping("/sparql/")
    public ResponseEntity<String> sparqlQuery(@RequestBody String query){
        return new ResponseEntity<>(fc.sparqlQuery(query), HttpStatus.OK);
    }

    @GetMapping("/alldata/")
    public ResponseEntity<String> getAllData(){
        return new ResponseEntity<>(fc.getAllData(), HttpStatus.OK);
    }

}
