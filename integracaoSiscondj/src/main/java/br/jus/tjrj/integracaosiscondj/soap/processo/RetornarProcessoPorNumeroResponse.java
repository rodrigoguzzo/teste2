
package br.jus.tjrj.integracaosiscondj.soap.processo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRetorno" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="processos" type="{processo.soap.integracaoSiscondj.tjrj.jus.br}Processo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codigoRetorno",
    "processos"
})
@XmlRootElement(name = "retornarProcessoPorNumeroResponse")
public class RetornarProcessoPorNumeroResponse {

    @XmlElement(required = true)
    protected BigInteger codigoRetorno;
    @XmlElement(required = true)
    protected Processo processos;

    /**
     * Obtém o valor da propriedade codigoRetorno.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * Define o valor da propriedade codigoRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoRetorno(BigInteger value) {
        this.codigoRetorno = value;
    }

    /**
     * Obtém o valor da propriedade processos.
     * 
     * @return
     *     possible object is
     *     {@link Processo }
     *     
     */
    public Processo getProcessos() {
        return processos;
    }

    /**
     * Define o valor da propriedade processos.
     * 
     * @param value
     *     allowed object is
     *     {@link Processo }
     *     
     */
    public void setProcessos(Processo value) {
        this.processos = value;
    }

}
