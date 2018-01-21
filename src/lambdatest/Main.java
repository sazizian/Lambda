package lambdatest;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        new Thread(()->{
//            System.out.println("test1");
//            System.out.println("test2");;
//        }).start();

        Employee sasan=new Employee("sasan",39);
        Employee saman=new Employee("Saman",40);
        Employee salar=new Employee("Salar",32);
        Employee elham=new Employee("Elham",35);

        List<Employee> employees=new ArrayList<>();
        employees.add(sasan);
        employees.add(saman);
        employees.add(salar);
        employees.add(elham);

        employees.forEach(emp->{
            System.out.println(emp.getName());
            System.out.println(emp.getAge());
        });

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        Collections.sort(employees, (o1, o2)->
//            o1.getName().compareTo(o2.getName()));
//
//
//        for(Employee e:employees)
//            System.out.println(e.getName());



//        String sillyString=doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        },
//            employees.get(0).getName(),employees.get(1).getName());
//
//        System.out.println(sillyString);

        UpperConcat uc=(s1,s2)->{
            String result=s1.toUpperCase()+"  "+s2.toUpperCase();
            return result;
        };
//
//        String sillyString=doStringStuff(uc,
//                employees.get(0).getName(),employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass=new AnotherClass();
        String s=anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);

    }

}

