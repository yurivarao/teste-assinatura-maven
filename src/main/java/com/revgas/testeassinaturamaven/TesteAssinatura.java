package com.revgas.testeassinaturamaven;

import com.revgas.assinatura.digital.maven.*;

public class TesteAssinatura {

    public static void main(String[] args) throws Exception {
        // Declaração de variáveis utilizadas como parâmetros pela função assinar da classe AssinarXML.
        final String localDocumentoXML = "src/main/java/com/revgas/testeassinaturamaven/purchaseOrder.xml";
        final String localKeystoreXML = "src/main/java/com/revgas/testeassinaturamaven/keystore";
        final String senhaKeystoreXML = "changeit";
        final String nomePrivateKeyXML = "mykey";
        final String senhaPrivateKeyXML = "changeit";
        
        // Chamada ao método para assinar
        AssinaturaXML signxml = new AssinaturaXML();
        //signxml.assinar(localDocumentoXML, localKeystoreXML, senhaKeystoreXML, nomePrivateKeyXML, senhaPrivateKeyXML);
        signxml.assinarTag(localDocumentoXML, localKeystoreXML, senhaKeystoreXML, nomePrivateKeyXML, senhaPrivateKeyXML, "Buyer");
        
        // Declaração de variáveis utilizadas como parâmetros pela função assinar da classe AssinarTXT.
        final String localDocumento = "src/main/java/com/revgas/testeassinaturamaven/teste.txt";
        final String localKeystore = "src/main/java/com/revgas/testeassinaturamaven/keystore.jks";
        final String nomeKeyStore = "mykey";
        final String senhaKeyStore = "store123";
        final String senhaPrivateKey = "key123";
        final String nomeCertificado = "mykey";
        
        // Chamada ao método para assinar 
        AssinaturaTXT signtxt = new AssinaturaTXT();
        signtxt.assinar(localDocumento, localKeystore, nomeKeyStore, senhaKeyStore, 
            senhaPrivateKey, nomeCertificado);
        
        String assin = signtxt.retornaAssinatura(localDocumento, localKeystore, nomeKeyStore, senhaKeyStore, 
            senhaPrivateKey, nomeCertificado);
        System.out.println(assin.getBytes());
    }  
}
