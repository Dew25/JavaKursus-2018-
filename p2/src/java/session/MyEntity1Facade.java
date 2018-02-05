/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.MyEntity1;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Melnikov
 */
@Stateless
public class MyEntity1Facade extends AbstractFacade<MyEntity1> {

    @PersistenceContext(unitName = "p2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyEntity1Facade() {
        super(MyEntity1.class);
    }
  
    public MyEntity1 findXY(int n1, int n2) {
        try {
            return (MyEntity1) em.createQuery("SELECT myentity FROM MyEntity1 myentity WHERE myentity.n1=:n1 AND myentity.n2=:n2")
                .setParameter("n1", n1)
                .setParameter("n2", n2)
                .getSingleResult();
        } catch (Exception e) {
            return null;
        }
        
    }
}
