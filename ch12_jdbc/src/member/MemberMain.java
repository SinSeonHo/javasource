package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        int result = 0;

        boolean run = true;
        ConsoleUtil util = new ConsoleUtil();
        while (run) {

            System.out.println("===================== Member =====================");
            System.out.println("1. member 추가");
            System.out.println("2. member 수정");
            System.out.println("3. member 삭제");
            System.out.println("4. member 조회");
            System.out.println("5. member 전체조회");
            System.out.println("6. 프로그램 종료");

            System.out.println("==================================================");

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    mDto = util.memberInsertInfo(sc);
                    result = mDao.insert(mDto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                    }
                    // 출력문 호출
                    util.printUpdateSuccessMessage(result, mDto.getId());
                    break;
                case 3:
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    // 출력문 호출
                    util.printDeleteSuccessMessage(result, id);
                    break;
                case 4:
                    String input = util.memberGetInfo(sc);

                    // regex(정규식)
                    // input.matches("^[A-Za-z].*") : 정규식과 일치하면 true

                    // 아이디는 영어로 시작 => getRow()
                    if (input.matches("^[A-Za-z].*")) {
                        mDto = mDao.getRow(input);

                        if (mDto != null) {
                            // 출력문 호출
                            util.memberPrint(mDto);
                        }
                    } else {
                        // 이름은 한글로 시작 => getNameList()
                        List<MemberDTO> list = mDao.getNameList(input);

                        if (!list.isEmpty()) {
                            // 출력문 호출
                            util.memberAllPrint(list);
                        }
                    }

                    break;
                case 5:
                    List<MemberDTO> list = mDao.getList();
                    // 출력문 호출
                    util.memberAllPrint(list);
                    // List<MemberDTO> list2 = mDao.getNameList(sc.nextLine());
                    // // 출력문 호출
                    // util.memberAllPrint(list2);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
