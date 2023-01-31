package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {


//        Creating Stream from Array

        String[] courses = {"java", "Spring","Agile"};
        Stream<String> courseStream = Arrays.stream(courses);


//        Creating Stream from Collections

        List<String> courseList = Arrays.asList("java", "Spring","Agile");

        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
          new Course("java", 100),
          new Course("DS",366),
          new Course("MS",122));

        Stream<Course> myCourseStream = myCourses.stream();



//        Creating stream values

        Stream<Integer> stream = Stream.of(10,55,44,88,77);










    }
}
