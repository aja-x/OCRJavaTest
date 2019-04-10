package testocr.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import testocr.model.TbResult;
import testocr.model.TbUser;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-10T08:29:00")
@StaticMetamodel(TbImage.class)
public class TbImage_ { 

    public static volatile CollectionAttribute<TbImage, TbResult> tbResultCollection;
    public static volatile SingularAttribute<TbImage, String> path;
    public static volatile SingularAttribute<TbImage, TbUser> userUsername;
    public static volatile SingularAttribute<TbImage, String> name;
    public static volatile SingularAttribute<TbImage, Integer> id;

}