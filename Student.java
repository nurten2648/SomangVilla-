import java.util.Scanner;

public class Student {
    void main() throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int[] grade1 = new int[]{41, 42, 45, 42, 46, 39};
        int[] grade2 = new int[]{41, 42, 45, 42, 46, 39};
        int[] grade3 = new int[]{41, 42, 45, 42, 46, 39};

        int[][] school = new int[][]{grade1, grade2, grade3};

        int[][] students = {
                {41, 42, 45, 42, 46, 39, 0},
                {41, 42, 45, 42, 46, 39, 0},
                {41, 42, 45, 42, 46, 39, 0}};

        int[] total = new int[students.length];
        int sum = 0;

        for (int grade = 0; grade < students.length; grade++) {
            int ban = 0;
            while (ban < students[grade].length - 1) {
                System.out.printf(">>>>>> %d 학년 반별 재학생 수 입력 <<<<<<\n", grade + 1);
                while (ban < students[grade].length - 1) {
                    System.out.printf("\t %d학년 %d반 재학생 수 입력 :", grade + 1, ban + 1);
                    students[grade][ban] = keyboard.nextInt();
                    if (students[grade][ban] > 10 && students[grade][ban] <= 50)
                        ban++;
                    else {
                        System.err.println("ERROR");
                        System.in.read();
                    }
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length - 1; j++) {
                students[i][6] += students[i][j];
                total[i] += students[i][j];
            }
        }

        for (int i = 0; i < total.length; i++)
            sum += total[i];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d 학년 %3d %3d %3d %3d %3d %3d %4d\n", i + 1,
                    students[i][0], students[i][1], students[i][2], students[i][3],
                    students[i][4], students[i][5], students[i][6]);
        }

        System.out.printf("\t\t\t 전교생 수: %d\n", sum);
    }
}