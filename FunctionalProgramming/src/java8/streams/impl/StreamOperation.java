package java8.streams.impl;

import java.util.Arrays;
import java.util.List;

import java8.collection.improvement.Person;

public class StreamOperation {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charlee","Chapalin",50),
				new Person("sachin","tendulkar",23),
				new Person("Mahender","dhoni",45),
				new Person("ramesh","tendulkar",23),
				new Person("sighn","dhoni",45)
				);
		// print all
		people.stream().forEach(p->System.out.println(p));
		// print the last name in which the first name starts with M
		people.stream().filter(p ->p.getFirstName().startsWith("s")).forEach(p->System.out.println(p.getLastName()));
		System.out.println("print the person first name whose age is greater than 40");
		people.parallelStream().filter(p->p.getAge()>40).forEach(p->System.out.println(p.getFirstName()));
		long count =people.parallelStream().filter(p->p.getAge()>40).count();
		System.out.println("the player whose age greater than 40 is"+count);
	}

}
