package com.utn.parcial.service;

import com.utn.parcial.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;
    public ResponseEntity<String> getLastCall(){
        return integrationComponent.getLastCall();
    }
}
