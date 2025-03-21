package com.example.stringmanipulationservice;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface StringManipulationService {
    String reverseText(@WebParam(name = "text") String text);
    int countCharacters(@WebParam(name = "text") String text);
}
