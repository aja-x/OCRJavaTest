/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr.dao;
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
    public void update(long id, TbResult t) {
        startTransaction(PERSISTANCE_META);
        
        TbResult editTbUser = entityManager.find(TbResult.class, id);
        editTbUser.setText(t.getText());
        entityManager.getTransaction().commit();
        endTransaction();
    }
}
