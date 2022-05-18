package org.finos.regtech.sparqlserver;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegulationController {

    Model regModel = ModelFactory.createDefaultModel();

}
