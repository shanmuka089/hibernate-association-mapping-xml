package com.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.enities.Answer;
import com.hibernate.enities.Question;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate-cfg.xml").build();

		Metadata metadata = new MetadataSources(registry).buildMetadata();

		SessionFactory sessionFactory = metadata.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Question question = new Question();

		question.setQsn("What is Java?");

		Answer answer = new Answer();

		answer.setAnswerName("Java is a object oriented programming language.");

		answer.setPostedBy("Shanu");

		Answer answer2 = new Answer();

		answer2.setAnswerName("Java is a high level programming language.");

		answer2.setPostedBy("Shanu");

		List<Answer> answers = Arrays.asList(answer, answer2);

		question.setAnswers(answers);

		session.save(question);

		transaction.commit();

		sessionFactory.close();

		session.close();
	}
}
