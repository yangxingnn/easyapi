/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aocute.easyapi.api.boundary;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yangx
 */
@Entity
@Table(name = "example_api", catalog = "easyapi", schema = "data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExampleApi.findAll", query = "SELECT e FROM ExampleApi e"),
    @NamedQuery(name = "ExampleApi.findById", query = "SELECT e FROM ExampleApi e WHERE e.id = :id"),
    @NamedQuery(name = "ExampleApi.findByExampleApi", query = "SELECT e FROM ExampleApi e WHERE e.exampleApi = :exampleApi")})
public class ExampleApi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 512)
    @Column(name = "example_api")
    private String exampleApi;
    @JoinColumn(name = "http_operation_id", referencedColumnName = "id")
    @ManyToOne
    private HttpOperation httpOperationId;

    public ExampleApi() {
    }

    public ExampleApi(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExampleApi() {
        return exampleApi;
    }

    public void setExampleApi(String exampleApi) {
        this.exampleApi = exampleApi;
    }

    public HttpOperation getHttpOperationId() {
        return httpOperationId;
    }

    public void setHttpOperationId(HttpOperation httpOperationId) {
        this.httpOperationId = httpOperationId;
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
        if (!(object instanceof ExampleApi)) {
            return false;
        }
        ExampleApi other = (ExampleApi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aocute.easyapi.api.boundary.ExampleApi[ id=" + id + " ]";
    }
    
}
