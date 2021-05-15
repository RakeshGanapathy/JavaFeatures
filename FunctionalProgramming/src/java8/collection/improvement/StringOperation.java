package java8.collection.improvement;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperation {

	public static void main(String[] args) {
		Predicate<String> isWordStartsWithA =s->s.startsWith("a");
		Predicate<String> isWordLengthMorethan1 = s->s.length()>1;
		List<String> words = Stream.of("a","aasolo","run","dil","dhool","arul","aadhi").filter(isWordStartsWithA).filter(isWordLengthMorethan1).collect(Collectors.toList());
		words.forEach(System.out::println);// method reference
	}

}
