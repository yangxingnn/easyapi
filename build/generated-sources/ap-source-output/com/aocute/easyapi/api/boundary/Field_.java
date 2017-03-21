package com.aocute.easyapi.api.boundary;

import com.aocute.easyapi.api.boundary.Url;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-21T17:56:36")
@StaticMetamodel(Field.class)
public class Field_ { 

    public static volatile SingularAttribute<Field, Long> id;
    public static volatile SingularAttribute<Field, Url> urlId;
    public static volatile SingularAttribute<Field, String> fieldName;
    public static volatile SingularAttribute<Field, Date> createDate;

}