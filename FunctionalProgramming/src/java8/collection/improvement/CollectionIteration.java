package java8.collection.improvement;
import java.util.Arrays;
import java.util.List;

public class CollectionIteration {
	void staticMethod() {
		System.out.println("am a static method");
	}

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charlee","Chapalin",50),
				new Person("sachin","tendulkar",23),
				new Person("Mahender","dhoni",45),
				new Person("ramesh","tendulkar",23),
				new Person("sighn","dhoni",45)
				);
		System.out.println("for loop ");
		for(int i =0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		System.out.println("for each loop");{
			for(Person p:people) {
				System.out.println(p);
			}
		}
		System.out.println("using lambda for each");
		people.forEach(p->System.out.println(p));
		System.out.println("using lambda for each with method ref");
		people.forEach(System.out::println);
		}

}
