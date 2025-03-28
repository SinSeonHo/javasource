package emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("======================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 전체조회");
            System.out.println("5. 특정사원조회");
            System.out.println("6. 종료");
            System.out.println("======================");

            System.out.print("메뉴 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertInfo(sc);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 2:
                    eDto = updateInfo(sc);
                    result = eDao.update(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 3:
                    empNo = deleteInfo(sc);
                    result = eDao.delete(empNo);
                    System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                    break;
                case 4:
                    List<EmpDTO> list = eDao.selectAll();
                    empPrint(list);
                    // System.out.println(list);
                    break;
                case 5:
                    empNo = getRow(sc);
                    eDto = eDao.select(empNo);
                    System.out.println(eDto);
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static void empPrint(List<EmpDTO> list) {
        System.out.println("=================================================================");
        System.out.println("사번  이름  직무  매니저번호  입사일  급여  수당  부서번호");
        System.out.println("=================================================================");

        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpNo() + "\t");
            System.out.print(empDTO.getEName() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHireDate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptNo() + "\n");
        }
    }

    public static int getRow(Scanner sc) {
        // 조회할 empno 입력받은 후 리턴
        System.out.println("조회 대상 empNo 입력 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }

    public static int deleteInfo(Scanner sc) {
        // 삭제할 empno 입력받은 후 리턴
        System.out.println("삭제 대상 empNo 입력 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }

    public static EmpDTO updateInfo(Scanner sc) {
        // 수정할 empno, sal 입력받은 후 리턴
        System.out.println("수정 대상 empNo 입력 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        System.out.println("변경 급여 입력 >> ");
        int sal = Integer.parseInt(sc.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;
    }

    public static EmpDTO insertInfo(Scanner sc) {
        // 새로운 사원 정보 입력 EMPNO, ENAME, job, MGR, HIREDATE, sal, comm, DEPTNO
        System.out.println("사번 입력 >> ");
        int empNo = Integer.parseInt(sc.nextLine());

        System.out.println("이름 입력 >> ");
        String eName = sc.nextLine();

        System.out.println("직무 입력 >> ");
        String job = sc.nextLine();

        System.out.println("매니저번호 입력 >> ");
        int mgr = Integer.parseInt(sc.nextLine());

        System.out.println("입사일 입력 >> ");
        String hireDate = sc.nextLine();

        System.out.println("급여 입력 >> ");
        int sal = Integer.parseInt(sc.nextLine());

        System.out.println("수당 입력 >> ");
        int comm = Integer.parseInt(sc.nextLine());

        System.out.println("부서번호 입력 >> ");
        int deptNo = Integer.parseInt(sc.nextLine());

        Date date = null;

        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(hireDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // EmpDTO eDto = EmpDTO.builder().empNo(empNo).eName(eName).job(job)
        // .mgr(mgr).hireDate(date).sal(sal).comm(comm).deptNo(deptNo).build();

        // return eDto;
        // 위와 같은 내용
        return new EmpDTO(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
    }
}
