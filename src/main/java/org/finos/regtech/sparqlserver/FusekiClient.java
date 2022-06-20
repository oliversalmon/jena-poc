package org.finos.regtech.sparqlserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("localhost:3030")
public interface FusekiClient {

    @RequestMapping(method= RequestMethod.GET, value = "/finosregtech/get")
    public String getAllData();

    @RequestMapping(method= RequestMethod.GET, value = "/finosregtech/sparql")
    public String sparqlQuery(String query);

}
