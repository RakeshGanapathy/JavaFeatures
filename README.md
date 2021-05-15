# JavaFeatures
Contains 8+ features examples of Java 

the list of Notable features in java8 
  1. Lambda Expressions
  2. Functional interface 
  3. Predicate interface
  4. Method references
  5. Collection Improvements Interfaces such as Streams , Parallel Stream

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
