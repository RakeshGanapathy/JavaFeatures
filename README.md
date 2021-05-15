# JavaFeatures
Contains 8+ features examples of Java 

the list of Notable features in java8 
  1. Lambda Expressions
  2. Functional interface 
  3. Predicate interface
  4. Method references
  5. ForEach 
  6. Collection Improvements Interfaces such as Streams , Parallel Stream

Lambda Expression:
  
  * Lambda Expression provides clear and concise way to represent one method interface using an expression.
  and it is also used in collection library and helps to iterate , filter and extract data from colloction 
  
  * used to provide the implementation of an interface (functional interface) it saves a lot of code 
  * Lambda expression is treated as a function , so compiler does not create a .class file 


             public class Candidate {
              public void participate(Performing perf) {
                perf.perform();
              }
              public static void main(String[] args) {
                Candidate ref = new Candidate();
                // passing the object as parameter
                  ref.participate(new SwimmingCompetition());
                  ref.participate(new MartialArtsCompetition());

                // inorder to overcome the problem like creating subclass and overriding methods 
                  //becomes an overhead when the subclass implementation keeps on growing

              }
            }
            
            
##### Lambda expression assigns the method or function to a variable ,it enables to pass the method as an argument 

ablockofCode = ()->{



} 
when you enable lambda expression you dont need to specify 
1. method returntype
2. method name 
3. parameterlist datatype 

                          public class Candidate {
                            public void participate(Performing perf) {
                              perf.perform();
                            }

                            public static void main(String[] args) {
                              Candidate ref = new Candidate();
                              // passing the method as parameter
                                ref.participate(()->{
                                  System.out.println("cooking implementation");
                                });
                                ref.participate(()->{
                                  System.out.println("fighting competition");
                                });
                            }
                          }

Lambda expression consist of 3 components 
1. Argument list 
2. Arrow - token
3. Body 

no Parameter syntax:

() -> {

}

one parameter Syntax 

(p1) -> {
 
 }
 
 two param syntax 
 
 (p1,p2) -> {
 
 
 }
 
#####Functional Interface

* Functional interface is an interface which contains only one abstract method whereas it do have n number of default or static methods 

* Functional interface should be declared along with an annotation @FunctionalInterface, though its optional , but it will create a restriction in the 
interface , like not to add any additional abstract method.

                      @FunctionalInterface
                      public interface Performing {
                        void perform();// abstract method
                      }
                      
       * the Lambda expression is providing the implementation of functional iterface 


#### Streams 

A sequence of elements supporting sequential and parallel aggregate operation






