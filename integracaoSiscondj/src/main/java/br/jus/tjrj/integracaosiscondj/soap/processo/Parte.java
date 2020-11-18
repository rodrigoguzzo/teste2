
package br.jus.tjrj.integracaosiscondj.soap.processo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Parte complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Parte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cpfCnpj" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoParte" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parte", propOrder = {
    "cpfCnpj",
    "nome",
    "principal",
    "tipoParte",
    "tipoPessoa"
})
public class Parte {

    protected long cpfCnpj;
    @XmlElement(required = true)
    protected String nome;
    protected boolean principal;
    @XmlElement(required = true)
    protected String tipoParte;
    @XmlElement(required = true)
    protected String tipoPessoa;

    /**
     * Obtém o valor da propriedade cpfCnpj.
     * 
     */
    public long getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     */
    public void setCpfCnpj(long value) {
        this.cpfCnpj = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade principal.
     * 
     */
    public boolean isPrincipal() {
        return principal;
    }

    /**
     * Define o valor da propriedade principal.
     * 
     */
    public void setPrincipal(boolean value) {
        this.principal = value;
    }

    /**
     * Obtém o valor da propriedade tipoParte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoParte() {
        return tipoParte;
    }

    /**
     * Define o valor da propriedade tipoParte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoParte(String value) {
        this.tipoParte = value;
    }

    /**
     * Obtém o valor da propriedade tipoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPessoa() {
        return tipoPessoa;
    }

    /**
     * Define o valor da propriedade tipoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPessoa(String value) {
        this.tipoPessoa = value;
    }

}
