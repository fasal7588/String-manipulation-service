package com.example.stringmanipulationservice;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService(endpointInterface = "com.example.stringmanipulationservice.StringManipulationService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(String text) {
        if (text == null) {
            return "";
        }
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}
