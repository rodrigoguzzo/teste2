
package br.jus.tjrj.integracaosiscondj.soap.comarca;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="listaComarcas" type="{comarca.soap.integracaoSiscondj.tjrj.jus.br}Comarca" maxOccurs="unbounded"/&gt;
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
    "listaComarcas"
})
@XmlRootElement(name = "retornarTodasComarcasResponse")
public class RetornarTodasComarcasResponse {

    @XmlElement(required = true)
    protected BigInteger codigoRetorno;
    @XmlElement(required = true)
    protected List<Comarca> listaComarcas;

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
     * Gets the value of the listaComarcas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaComarcas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaComarcas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comarca }
     * 
     * 
     */
    public List<Comarca> getListaComarcas() {
        if (listaComarcas == null) {
            listaComarcas = new ArrayList<Comarca>();
        }
        return this.listaComarcas;
    }

}
