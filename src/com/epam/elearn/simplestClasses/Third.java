package com.epam.elearn.simplestClasses;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов,
имеющих оценки, равные только 9 или 10.
 */

public class Third {
    public static void main(String[] args) {

        System.out.println("+++++++++++++++");

        Student[] students = new Student[10];

        students[0] = new Student("Petrov M.M.", 103, new int[]{7, 6, 8, 7, 9});
        students[1] = new Student("Ivanov I.I.", 102, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Borisov M.V.", 101, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Krauchuk A.S.", 101, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Kovalchuk E.A.", 102, new int[]{7, 6, 8, 7, 9});
        students[5] = new Student("Plotich Y.A.", 101, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Davidov I.V.", 103, new int[]{9, 9, 8, 10, 9});
        students[7] = new Student("Sidorov M.M.", 102, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Tramp D.A.", 102, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Mask I.P.", 102, new int[]{10, 9, 9, 10, 9});

        bestStudent(students);
    }
        // выборка студентов с 9 и 10 балами
    public static void bestStudent(Student[] student) {
        boolean best = true;

        for (int i = 0; i < student.length; i++) {
            int minScore = 10;
            for (int j = 0; j < student[i].getAcademicLength(); j++) {
                if (student[i].getAcademicPerformanceId(j) < minScore) {
                    minScore = student[i].getAcademicPerformanceId(j);
                }
            }
            if (minScore >= 9) {
                System.out.println("Отличный студент " + student[i].getFio() + " из группы " + student[i].getNumberGroup());
            }
        }
    }
}

class Student {

    private String fio;
    private int numberGroup;
    private int[] academicPerformance = new int[5];

    public Student() {
    }

    public Student(String fio, int numberGroup, int[] academicPerformance) {
        this.fio = fio;
        this.numberGroup = numberGroup;
        this.academicPerformance = academicPerformance;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void getAcademicPerformancePrint() {
        for (int i = 0; i < academicPerformance.length; i++) {
            System.out.print(academicPerformance[i] + " ");
        }
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public int getAcademicPerformanceId(int i) {
        return academicPerformance[i];
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
    public int getAcademicLength(){
        return academicPerformance.length;
    }

}
