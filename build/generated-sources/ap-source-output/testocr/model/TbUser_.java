package testocr.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import testocr.model.TbImage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-09T08:19:52")
@StaticMetamodel(TbUser.class)
public class TbUser_ { 

    public static volatile SingularAttribute<TbUser, String> password;
    public static volatile SingularAttribute<TbUser, String> foto;
    public static volatile SingularAttribute<TbUser, String> level;
    public static volatile SingularAttribute<TbUser, String> name;
    public static volatile SingularAttribute<TbUser, String> nohp;
    public static volatile CollectionAttribute<TbUser, TbImage> tbImageCollection;
    public static volatile SingularAttribute<TbUser, String> username;
    public static volatile SingularAttribute<TbUser, String> alamat;

}