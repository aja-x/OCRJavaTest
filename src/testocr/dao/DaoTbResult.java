/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr.dao;
import javax.persistence.metamodel.SingularAttribute;
import testocr.model.TbResult;
/**
 *
 * @author Kuuhaku
 */
public class DaoTbResult extends BaseDao<TbResult>{
    public DaoTbResult(Class<TbResult> type) {
        super(type);
    }

    @Override
    public void update(int id, TbResult t) {
        startTransaction(PERSISTANCE_META);
        
        TbResult editTbUser = entityManager.find(TbResult.class, id);
        editTbUser.setText(t.getText());
        entityManager.getTransaction().commit();
        endTransaction();
    }
    public void deleteByImageId(int id){
        startTransaction(PERSISTANCE_META);
        TbResult tbResult = findById(id);
        entityManager.remove(tbResult);
        entityManager.getTransaction().commit();
        endTransaction();
    }

    public TbResult findById(SingularAttribute<TbResult, Integer> id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
