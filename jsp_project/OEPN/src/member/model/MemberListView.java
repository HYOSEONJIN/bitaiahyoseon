package member.model;

import java.util.List;

public class MemberListView {

	private int memberTotalCount;
	private int memberCountPerPage;
	private List<Member> memberList;
	private int pageTotalCount;
	private int firstRow;
	private int pageNumber;
	
	public MemberListView(int memberTotalCount, 
			int memberCountPerPage, 
			List<Member> memberList, 
			int firstRow,
			int pageNumber) {
		this.memberTotalCount = memberTotalCount;
		this.memberCountPerPage = memberCountPerPage;
		this.memberList = memberList;
		this.firstRow = firstRow;
		this.pageNumber = pageNumber;
	}
	
	private void calToTalPageCount() {
		if(memberTotalCount==0) {
			pageTotalCount = 0;
		}else {
		pageTotalCount= memberTotalCount/memberCountPerPage;
		pageTotalCount = memberTotalCount%memberCountPerPage>0? pageTotalCount++ : pageTotalCount;
		}
	}

	@Override
	public String toString() {
		return "MemberListView [memberTotalCount=" + memberTotalCount + ", memberCountPerPage=" + memberCountPerPage
				+ ", memberList=" + memberList + ", pageTotalCount=" + pageTotalCount + ", firstRow=" + firstRow
				+ ", pageNumber=" + pageNumber + "]";
	}
	
	
}
