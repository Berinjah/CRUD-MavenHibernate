package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Aluno;

public class App 
{
    public static void main( String[] args )
    {
       	Aluno alunos = new Aluno();
       	alunos.setNome("Jeferson");
       	alunos.setEndereco("Av. Àguia de Háia");
    		
   		Session session = HibernateUtil.getSessionFactory().openSession();
   		session.beginTransaction();
   		session.delete(alunos);
   		session.getTransaction().commit();
    }
}
