
package br.jus.tjrj.integracaosiscondj.soap.processo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Processo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Processo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoComarca" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoServentia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="instancia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroProcessoCNJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroProcessoTribunal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partes" type="{processo.soap.integracaoSiscondj.tjrj.jus.br}Parte" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Processo", propOrder = {
    "codigoComarca",
    "codigoServentia",
    "instancia",
    "numeroProcessoCNJ",
    "numeroProcessoTribunal",
    "partes"
})
public class Processo {

    protected int codigoComarca;
    protected int codigoServentia;
    protected int instancia;
    @XmlElement(required = true)
    protected String numeroProcessoCNJ;
    @XmlElement(required = true)
    protected String numeroProcessoTribunal;
    @XmlElement(required = true)
    protected List<Parte> partes;

    /**
     * Obtém o valor da propriedade codigoComarca.
     * 
     */
    public int getCodigoComarca() {
        return codigoComarca;
    }

    /**
     * Define o valor da propriedade codigoComarca.
     * 
     */
    public void setCodigoComarca(int value) {
        this.codigoComarca = value;
    }

    /**
     * Obtém o valor da propriedade codigoServentia.
     * 
     */
    public int getCodigoServentia() {
        return codigoServentia;
    }

    /**
     * Define o valor da propriedade codigoServentia.
     * 
     */
    public void setCodigoServentia(int value) {
        this.codigoServentia = value;
    }

    /**
     * Obtém o valor da propriedade instancia.
     * 
     */
    public int getInstancia() {
        return instancia;
    }

    /**
     * Define o valor da propriedade instancia.
     * 
     */
    public void setInstancia(int value) {
        this.instancia = value;
    }

    /**
     * Obtém o valor da propriedade numeroProcessoCNJ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcessoCNJ() {
        return numeroProcessoCNJ;
    }

    /**
     * Define o valor da propriedade numeroProcessoCNJ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcessoCNJ(String value) {
        this.numeroProcessoCNJ = value;
    }

    /**
     * Obtém o valor da propriedade numeroProcessoTribunal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcessoTribunal() {
        return numeroProcessoTribunal;
    }

    /**
     * Define o valor da propriedade numeroProcessoTribunal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcessoTribunal(String value) {
        this.numeroProcessoTribunal = value;
    }

    /**
     * Gets the value of the partes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parte }
     * 
     * 
     */
    public List<Parte> getPartes() {
        if (partes == null) {
            partes = new ArrayList<Parte>();
        }
        return this.partes;
    }

}
