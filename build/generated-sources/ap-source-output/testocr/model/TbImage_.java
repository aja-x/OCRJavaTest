package testocr.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import testocr.model.TbResult;
import testocr.model.TbUser;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-09T08:19:52")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-10T08:29:00")
>>>>>>> 65fc41d9f9d92782997f078766ffa71203ffac13
@StaticMetamodel(TbImage.class)
public class TbImage_ { 

    public static volatile CollectionAttribute<TbImage, TbResult> tbResultCollection;
    public static volatile SingularAttribute<TbImage, String> path;
    public static volatile SingularAttribute<TbImage, TbUser> userUsername;
    public static volatile SingularAttribute<TbImage, String> name;
    public static volatile SingularAttribute<TbImage, Integer> id;

}