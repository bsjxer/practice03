package prob5;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class Book {
	int bookNo; //번호
	String title; //제목
	String author; //작가
	int stateCode; //상태코드(대여유무를 나타내는 상태코드)
	
	
	
	public Book( int bookNo, String title, String author ){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public void rent(){
		//대여기능을 수행하는 메소드. Book클래스의 stateCode를 0으로 변경
		//____이(가) 대여 됐습니다. 출력
		//stateCode 변경
		this.stateCode = 0;
		System.out.println( title + "이(가) 대여 됐습니다." );
	}
	
	public void print(){
		//책의 정보가 출력형태와 같이 출력
		//대여 유무는 stateCode가 1이면 "재고 있음" 0이면 "대여중"으로 출력
		System.out.print(
				"책 제목:" + title +
				", 작가:" + author +
				", 대여 유무:");
		if( stateCode == 1 ){
			System.out.println("재고 있음");
		} else {
			System.out.println("대여중");
		}
	}

	
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
