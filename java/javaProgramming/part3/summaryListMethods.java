ArrayList<String> exercises1 = new ArrayList<>();
ArrayList<String> exercises2 = new ArrayList<>();

exercises1.add("Ada Lovelace");
exercises1.add("Hello World! (Ja Mualima!)");
exercises1.add("Six");

exercises2.add("Adding a positive number");
exercises2.add("Employee's pension insurance");

System.out.println("The size of list 1: " + exercises1.size());
System.out.println("The size of list 2: " + exercises2.size());

System.out.println("The first value of the first list " + exercises1.get(0));
System.out.println("The last value of the second list " + exercises2.get(exercises2.size() - 1));

ArrayList<String> list = new ArrayList<>();
int size = list.size();
System.out.println(size);

ArrayList<String> list = new ArrayList<>();
list.add("hello world!");
String string = list.get(0);
System.out.println(string);

ArrayList<String> list = new ArrayList<>();
// remove the string "hello world!"
list.remove("hello world!");
 // remove the value at index 3
list.remove(3);

ArrayList<String> list = new ArrayList<>();
boolean found = list.contains("hello world!");