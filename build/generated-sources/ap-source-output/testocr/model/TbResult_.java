package testocr.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import testocr.model.TbImage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-10T08:29:00")
@StaticMetamodel(TbResult.class)
public class TbResult_ { 

    public static volatile SingularAttribute<TbResult, TbImage> imageId;
    public static volatile SingularAttribute<TbResult, Integer> id;
    public static volatile SingularAttribute<TbResult, String> text;

}