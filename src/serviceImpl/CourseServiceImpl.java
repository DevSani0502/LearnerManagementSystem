package serviceImpl;

import models.CourseDTO;
import service.CourseService;
import utility.BasicMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseServiceImpl implements CourseService {
    private static List<CourseDTO> courses = new ArrayList<>();

    @Override
    public void addNewCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Description: ");
        String desc = sc.nextLine();

        System.out.print("Enter Duration in Weeks: ");
        String duration = sc.nextLine();

        int id = BasicMethods.getNextCourseId();
        CourseDTO course = new CourseDTO(String.valueOf(id), name, desc, duration, true);
        courses.add(course);

    }

    @Override
    public void viewAllCourse() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("----- Course List -----");
        for (CourseDTO course : courses) {
            System.out.println("ID: " + course.getId());
            System.out.println("Name: " + course.getCourseName());
            System.out.println("Description: " + course.getDescription());
            System.out.println("Duration (weeks): " + course.getDurationInWeeks());
            System.out.println("Active: " + course.isActive());
            System.out.println("----------------------");
        }
    }

    @Override
    public void actionOnCourseById() {
        Scanner sc = new Scanner(System.in);

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.print("Enter Course ID: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (CourseDTO course : courses) {
            if (course.getId().equalsIgnoreCase(searchId)) {
                System.out.println("----- Course Details -----");
                System.out.println("ID: " + course.getId());
                System.out.println("Name: " + course.getCourseName());
                System.out.println("Description: " + course.getDescription());
                System.out.println("Duration (weeks): " + course.getDurationInWeeks());
                System.out.println("Active: " + course.isActive());

                System.out.print("Do you want to deactivate this course? (Y/N): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("Y")) {
                    if (!course.isActive()) {
                        System.out.println("Course is already deactivated.");
                    } else {
                        course.setActive(false);
                        System.out.println("Course successfully deactivated.");
                    }
                }

                System.out.println("---------------------------");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course with ID " + searchId + " not found.");
        }
    }

}
