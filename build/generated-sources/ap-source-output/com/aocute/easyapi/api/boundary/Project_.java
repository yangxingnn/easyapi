package com.aocute.easyapi.api.boundary;

import com.aocute.easyapi.api.boundary.Url;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-22T20:30:09")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, Long> id;
    public static volatile SingularAttribute<Project, String> projectName;
    public static volatile CollectionAttribute<Project, Url> urlCollection;

}