package academic.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import academic.model.Lecturer;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner scn = new Scanner(System.in);
        HashSet<String> lecturerNames = new HashSet<>();
        
        ArrayList<Course> daftarMataKuliah = new ArrayList<>();
        ArrayList<Student> daftarMahasiswa = new ArrayList<>();
        ArrayList<Enrollment> daftarEnrollments = new ArrayList<>();
        ArrayList<Lecturer> daftarLecturers = new ArrayList<>();

        while(true){
            String command = scn.nextLine();

            if(command.equalsIgnoreCase("---")){
                break;
            } 
            String[] temp = new String[6];
            //split command
            String[] splitCommand = command.split("#");

            temp[0] = splitCommand[0];
            temp[1] = splitCommand[1];
            temp[2] = splitCommand[2];
            temp[3] = splitCommand[3];
            temp[4] = splitCommand[4];

            if(temp[0].equals("course-add")){
                temp[5] = splitCommand[5];
                Course course = new Course(temp[1], temp[2], temp[3], temp[4]);
                daftarMataKuliah.add(course);
            } else if(temp[0].equals("student-add")){
                Student student = new Student(temp[1], temp[2], temp[3], temp[4]);
                daftarMahasiswa.add(student);
            } else if(temp[0].equals("enrollment-add")){
                Enrollment enrollment = new Enrollment(temp[1], temp[2], temp[3], temp[4]);
                daftarEnrollments.add(enrollment);
            } else if(temp[0].equals("lecturer-add")){
                temp[5] = splitCommand[5];
                Lecturer lecturer = new Lecturer(temp[1], temp[2], temp[3] ,temp[4], temp[5]);
                daftarLecturers.add(lecturer);
            }
        }

        for(int i = 0; i < daftarLecturers.size(); i++){
            for(int j = 0; j < daftarLecturers.size(); j++){
                if(daftarLecturers.get(i).getNidn().equals(daftarLecturers.get(j).getNidn()) && i != j){
                    daftarLecturers.remove(j);
                }
            }
        }

        for(int i = 0; i < daftarLecturers.size();i++){
            daftarLecturers.get(i).DisplayLecturer();
        }

        for(int i = daftarMataKuliah.size()-1; i >= 0; i--){
            daftarMataKuliah.get(i).DisplayCourse();
        }
        for(int i = 0; i < daftarMahasiswa.size(); i++){
            daftarMahasiswa.get(i).DisplayStudent();
        }
        for(int i = 0; i < daftarEnrollments.size(); i++){
            daftarEnrollments.get(i).DisplayEnrollment();
        }
    }
}
