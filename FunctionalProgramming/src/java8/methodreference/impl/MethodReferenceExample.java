package java8.methodreference.impl;

public class MethodReferenceExample {
public static void main (String [] args) {
	Thread th= new Thread(MethodReferenceExample::printMessage);
	th.start();
}
static void printMessage() {
	System.out.println("method ref");
}
}
