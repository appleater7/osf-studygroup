package quiz;
/*
 *  자신의 로컬PC 에 오라클을 설치하고 진행하시오
 *  1. DB : 이름 order_board
 *          컬럼 orderNum(기본키 발주번호) 시퀀스 사용, buyer(varchar2 - 100) 요청자, 
 *          	 buyAdr(varchar2 - 1000) 요청자주소, 
 *               reqName(varchar2 - 100) 요청품목, reqCnt(number - 10) 요청수량, 
 *               reqDat(char - 8) 시스템 연월일, reqTim(char - 6) 시스템 시분초
 *               
 *  2. JAVA : 	아래 4가지 클래스로 구분하여 코딩하시오
 *  			기본적으로 db.board2 나 db.user 와 유사하게 진행하면 됩니다.
 *  			DBCon(DB접속), OrderBoardVO(DB 입출력 대응 할 수 있는 데이터타입), BoardService(연산 대응)
 *              Execute(실행 화면 및 실행)
 *              
 *              DBCon(DB접속)
 *              OrderBoardVO(DB 입출력 대응할 저장타입)
 *  			BoardService(연산 대응) - CRUD(입력, 조회, 수정, 삭제) 메서드 구현
 *  									  단 조회의 검색조건은 buyer, 품목 두 가지로 한정함
 *  									  (ex. 1. 전체, 2. buyer, 3. 품목명, 4.buyer - 품목명)
 *  			Execute(실행 화면 및 실행) - id, pw 를 입력받아 사용자가 CRUD 할 수 있도록 구현
 */
public class C04DBPractice {
	
}
