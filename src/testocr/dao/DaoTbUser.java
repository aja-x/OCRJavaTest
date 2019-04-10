/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr.dao;
import testocr.model.TbUser;
/**
 *
 * @author Kuuhaku
 */
public class DaoTbUser extends BaseDao<TbUser>{
    public DaoTbUser(Class<TbUser> type) {
        super(type);
    }
    
    public void update(String username, TbUser t) {
        startTransaction(PERSISTANCE_META);
        
        TbUser editTbUser = findByUsername(username);
        editTbUser.setName(t.getName());
        editTbUser.setPassword(t.getPassword());
        editTbUser.setAlamat(t.getAlamat());
        editTbUser.setNohp(t.getNohp());
        editTbUser.setFoto(t.getFoto());
        editTbUser.setPassword(t.getPassword());
        entityManager.getTransaction().commit();
        endTransaction();
    }
    @Override
    public void update(int id, TbUser t) {
        startTransaction(PERSISTANCE_META);
        
        TbUser editTbUser = entityManager.find(TbUser.class, id);
        editTbUser.setName(t.getName());
        entityManager.getTransaction().commit();
        endTransaction();
    }
    public void deleteByUsername(String username){
        startTransaction(PERSISTANCE_META);
        TbUser tbUser = findByUsername(username);
        entityManager.remove(tbUser);
        entityManager.getTransaction().commit();
        endTransaction();
    }
    public TbUser findByUsername(String username){
        startTransaction(PERSISTANCE_META);
        TbUser tbUser = entityManager.find(TbUser.class, username);
        return tbUser;
    }
}
