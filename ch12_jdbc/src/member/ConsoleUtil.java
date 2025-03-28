package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();

        MemberDTO memberDTO = new MemberDTO();

        System.out.println("======== 회원정보 입력 ========");

        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());

        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());

        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());

        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());

        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("========= 회원 정보 수정 =========");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("==================================");
        System.out.print("원하는 작업 선택 >> ");
        int no = Integer.parseInt(sc.nextLine());

        MemberDTO memberDTO = null;

        // no == 1 -> memberUpdateAddr() 호출
        // no == 2 -> memberUpdateEmail() 호출
        switch (no) {
            case 1:
                memberDTO = memberUpdateAddr(sc);
                break;
            case 2:
                memberDTO = memberUpdateEmail(sc);
                break;
            default:
                break;
        }
        return memberDTO;

        // 리턴받은 DTO를 리턴
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력받기(id, 변경할addr) => DTO에 담은 후 리턴

        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======= 수정 정보 입력 =======");
        System.out.print("변경할 대상의 id입력 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 주소(addr)값 입력 >> ");
        memberDTO.setAddr(sc.nextLine());

        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력받기(id, 변경할email) => DTO에 담은 후 리턴

        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======= 수정 정보 입력 =======");
        System.out.print("변경할 대상의 id입력 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 이메일(email)값 입력 >> ");
        memberDTO.setEmail(sc.nextLine());

        return memberDTO;
    }

    public String memberDeleteInfo(Scanner sc) {
        // 삭제 작업

        // MemberDTO memberDTO = new MemberDTO();

        System.out.println("========= 회원 정보 삭제 =========");
        System.out.println("삭제를 원하는 회원의 ID를 입력하세요 >> ");
        System.out.print("삭제할 대상의 id입력 >> ");
        String id = (sc.nextLine());

        return id;
    }

    public String memberGetInfo(Scanner sc) {
        // 조회할 회원 아이디 리턴
        System.out.println("========= 회원 정보 조회 =========");
        System.out.println("1. 아이디로 조회 ");
        System.out.println("2. 이름으로 조회 ");

        System.out.println("원하는 작업을 입력하세요 >> ");
        int no = Integer.parseInt(sc.nextLine());

        String input = "";

        if (no == 1) {
            System.out.println("조회할 회원 아이디 >> ");
            input = sc.nextLine();
        } else {
            System.out.println("조회할 회원 이름 >> ");
            input = sc.nextLine();
        }

        // 입력받은 아이디or이름 리턴
        return input;
    }

    public void memberPrint(MemberDTO dto) {
        // System.out.println("NO\tID\tNAME\t\tADDR\t\tEMAIL\t\tAGE");
        System.out.println("================= 조회한 회원 정보 =================");
        System.out.println("번호 : " + dto.getNo());
        System.out.println("아이디 : " + dto.getId());
        System.out.println("이름 : " + dto.getName());
        System.out.println("주소 : " + dto.getAddr());
        System.out.println("이메일 : " + dto.getEmail());
        System.out.println("나이 : " + dto.getAge());
        System.out.println("====================================================");
        // System.out.printf("%d\t%s\t%s\t%s\t%s\t%d\n", dto.getNo(), dto.getId(),
        // dto.getName(), dto.getAddr(),
        // dto.getEmail(), dto.getAge());

    }

    public void memberAllPrint(List<MemberDTO> list) {

        System.out.println("================= 조회한 회원 정보 =================");
        for (MemberDTO dto : list) {
            // System.out.println("번호 : " + dto.getNo());
            // System.out.println("아이디 : " + dto.getId());
            // System.out.println("이름 : " + dto.getName());
            // System.out.println("주소 : " + dto.getAddr());
            // System.out.println("이메일 : " + dto.getEmail());
            // System.out.println("나이 : " + dto.getAge());
            // System.out.println("==================================================");
            memberPrint(dto);
        }
    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {

        // result 값에 따라 입력 성공 or 실패 출력
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    public void printUpdateSuccessMessage(int result, String id) {

        // result 값에 따라 수정 성공 or 실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다" : id + "님의 정보 수정에 실패하였습니다");
    }

    public void printDeleteSuccessMessage(int result, String id) {

        // result 값에 따라 수정 성공 or 실패 출력
        // System.out.println(result > 0 ? id + "님의 정보를 삭제하였습니다" : id + "님의 정보 삭제에
        // 실패하였습니다");
        System.out.println(result > 0 ? id + "님의 정보를 삭제하였습니다" : id + "님의 정보 삭제에 실패하였습니다");
    }

}
