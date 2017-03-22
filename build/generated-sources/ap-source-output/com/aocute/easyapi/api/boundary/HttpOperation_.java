package com.aocute.easyapi.api.boundary;

import com.aocute.easyapi.api.boundary.ExampleApi;
import com.aocute.easyapi.api.boundary.Url;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-22T20:30:09")
@StaticMetamodel(HttpOperation.class)
public class HttpOperation_ { 

    public static volatile SingularAttribute<HttpOperation, Long> id;
    public static volatile SingularAttribute<HttpOperation, String> httpOperation;
    public static volatile SingularAttribute<HttpOperation, Url> urlId;
    public static volatile SingularAttribute<HttpOperation, String> description;
    public static volatile CollectionAttribute<HttpOperation, ExampleApi> exampleApiCollection;

}