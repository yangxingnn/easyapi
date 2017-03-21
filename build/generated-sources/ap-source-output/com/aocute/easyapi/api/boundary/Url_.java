package com.aocute.easyapi.api.boundary;

import com.aocute.easyapi.api.boundary.Field;
import com.aocute.easyapi.api.boundary.HttpOperation;
import com.aocute.easyapi.api.boundary.Project;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-21T17:56:36")
@StaticMetamodel(Url.class)
public class Url_ { 

    public static volatile SingularAttribute<Url, Long> id;
    public static volatile SingularAttribute<Url, String> description;
    public static volatile CollectionAttribute<Url, Field> fieldCollection;
    public static volatile SingularAttribute<Url, Project> projectId;
    public static volatile SingularAttribute<Url, Date> createDate;
    public static volatile SingularAttribute<Url, Boolean> isDeleted;
    public static volatile CollectionAttribute<Url, HttpOperation> httpOperationCollection;
    public static volatile SingularAttribute<Url, String> url;
    public static volatile SingularAttribute<Url, String> version;

}