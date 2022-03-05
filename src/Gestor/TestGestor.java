package Gestor;

import encripta.ENCRIPTA;
import encripta.EncriptadoVignere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

public class TestGestor {
    private String op;
    private ENCRIPTA encripta;

    @Autowired
    public void setEncripta(ENCRIPTA encripta) {
        this.encripta = encripta;
    }

    public void run() throws IOException {
        //System.out.println("Ingrese el texto:");
        //String s = String.valueOf(System.in.read());
        String s = "fabuloso";
        encripta.encripta(s);
        //encripta.desencripta(s);
    }
}

