import App.BuddyInfo;
import org.junit.Test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPATest {

    @Test
    public void performJPA() {

        // Creating objects representing some Buddy Info
        BuddyInfo bud1 = new BuddyInfo("Rayhaan");
        bud1.setNumber(1);


        BuddyInfo bud2 = new BuddyInfo("Ray Ray");
        bud2.setNumber(2);


        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        em.persist(bud1);
        em.persist(bud2);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT b FROM BuddyInfo b");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of App.BuddyInfo\n----------------");

        for (BuddyInfo bud : results) {

            System.out.println(bud.getName() + " (id=" + bud.getNumber() + ")");
        }

        // Closing connection
        em.close();

        emf.close();
    }
}