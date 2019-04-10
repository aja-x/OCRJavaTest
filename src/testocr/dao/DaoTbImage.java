/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr.dao;
import testocr.model.TbImage;
/**
 *
 * @author Kuuhaku
 */
public class DaoTbImage extends BaseDao<TbImage>{
    public DaoTbImage(Class<TbImage> type) {
        super(type);
    }

    @Override
    public void update(int id, TbImage t) {
        startTransaction(PERSISTANCE_META);
        
        TbImage editTbUser = entityManager.find(TbImage.class, id);
        editTbUser.setPath(t.getPath());
        editTbUser.setName(t.getName());
        entityManager.getTransaction().commit();
        endTransaction();
    }
}
