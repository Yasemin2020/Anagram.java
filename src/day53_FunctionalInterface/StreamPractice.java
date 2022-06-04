package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        System.out.println("----------------distinct()-------------------");
        List<Integer> list1 =new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,5,6));
        list1=list1.stream().distinct().collect(Collectors.toList());

        //[1,2,3,4,5,6]

        System.out.println(list1);

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
       arr1= Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------skip()--------------------");
        List<Integer> list2 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2=list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);

        int [] nums2= {1,2,3,4,5,6,7,8,9,10};
        nums2=Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));
        System.out.println("-------------------------limit()-------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> list3_2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3=list3.stream().limit(7).collect(Collectors.toList());
        list3_2=list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println("list3 = " + list3);
        System.out.println("list3_2 = " + list3_2);

        System.out.println("---------------map()--------------------");
//multiply each element by 10 and return a collection
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4=list4.stream().map(p-> p*10).collect(Collectors.toList());
        System.out.println("list4 = " + list4);
//write first 3 characters of days
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days = days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());
        System.out.println("days = " + days);


        System.out.println("---------------------filter()--------------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter(p->p%2==0).collect(Collectors.toList());

        System.out.println(evens);

        System.out.println("-------------------------count()----------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long count = names.stream().filter(p->p.equalsIgnoreCase("java")).count();
        System.out.println("count = " + count);

        System.out.println("-------------------forEach()----------------------------------");

        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));

        System.out.println("------------allMatch()---------anyMatch()-----------noneMatch------------");

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));

        boolean r1 = list6.stream().allMatch(p-> p%2==0);
        System.out.println("r1 = " + r1);

        boolean r2 = list6.stream().anyMatch(p-> p>20);
        System.out.println("r2 = " + r2);

        boolean r3 = list6.stream().noneMatch(p-> p%3==0);
        System.out.println("r3 = " + r3);




    }
}
