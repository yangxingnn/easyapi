/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aocute.easyapi.api.boundary;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yangx
 */
@Entity
@Table(name = "http_operation", catalog = "easyapi", schema = "data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HttpOperation.findAll", query = "SELECT h FROM HttpOperation h"),
    @NamedQuery(name = "HttpOperation.findById", query = "SELECT h FROM HttpOperation h WHERE h.id = :id"),
    @NamedQuery(name = "HttpOperation.findByHttpOperation", query = "SELECT h FROM HttpOperation h WHERE h.httpOperation = :httpOperation"),
    @NamedQuery(name = "HttpOperation.findByDescription", query = "SELECT h FROM HttpOperation h WHERE h.description = :description")})
public class HttpOperation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "http_operation")
    private String httpOperation;
    @Size(max = 256)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "httpOperationId")
    private Collection<ExampleApi> exampleApiCollection;
    @JoinColumn(name = "url_id", referencedColumnName = "id")
    @ManyToOne
    private Url urlId;

    public HttpOperation() {
    }

    public HttpOperation(Long id) {
        this.id = id;
    }

    public HttpOperation(Long id, String httpOperation) {
        this.id = id;
        this.httpOperation = httpOperation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHttpOperation() {
        return httpOperation;
    }

    public void setHttpOperation(String httpOperation) {
        this.httpOperation = httpOperation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<ExampleApi> getExampleApiCollection() {
        return exampleApiCollection;
    }

    public void setExampleApiCollection(Collection<ExampleApi> exampleApiCollection) {
        this.exampleApiCollection = exampleApiCollection;
    }

    public Url getUrlId() {
        return urlId;
    }

    public void setUrlId(Url urlId) {
        this.urlId = urlId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HttpOperation)) {
            return false;
        }
        HttpOperation other = (HttpOperation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aocute.easyapi.api.boundary.HttpOperation[ id=" + id + " ]";
    }
    
}
