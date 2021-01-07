package member.dao;

public class MemberDao implements Dao {

	@Override
	public void insert() {
		System.out.println("회원 정보 데이터베이스 저장");

	}

	@Override
	public void select() {
		System.out.println("회원 정보 검색");
	}

	@Override
	public void delete() {
		System.out.println("회원 정보 삭제");

	}

	@Override
	public void update() {
		System.out.println("회원 정보 수정");
	}

}
