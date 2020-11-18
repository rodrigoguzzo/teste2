
package br.jus.tjrj.integracaosiscondj.soap.processo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.jus.tjrj.integracaosiscondj.soap.processo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.jus.tjrj.integracaosiscondj.soap.processo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornarProcessoPorNumeroRequest }
     * 
     */
    public RetornarProcessoPorNumeroRequest createRetornarProcessoPorNumeroRequest() {
        return new RetornarProcessoPorNumeroRequest();
    }

    /**
     * Create an instance of {@link RetornarProcessoPorNumeroResponse }
     * 
     */
    public RetornarProcessoPorNumeroResponse createRetornarProcessoPorNumeroResponse() {
        return new RetornarProcessoPorNumeroResponse();
    }

    /**
     * Create an instance of {@link Processo }
     * 
     */
    public Processo createProcesso() {
        return new Processo();
    }

    /**
     * Create an instance of {@link Parte }
     * 
     */
    public Parte createParte() {
        return new Parte();
    }

}
