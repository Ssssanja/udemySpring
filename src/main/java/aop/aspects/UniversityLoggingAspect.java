package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение списка студентов до метода " +
//                "getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student>students){
//        Student firstStudent = students.get(0);
//        String nameSurName = firstStudent.getNameSurname();
//        nameSurName = "Mr." + nameSurName;
//        firstStudent.setNameSurname(nameSurName);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningStudentsLoggingAdvice: логгируем получение списка студентов после метода " +
//                "getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exceptioneeee")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exceptioneeee){
//        System.out.println("afterThrowingStudentsLoggingAdvice: логгируем выброс исключения " + exceptioneeee);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логгируем нормальное окончание работы" +
                " метода getStudents или выброс исключения");
    }
}
