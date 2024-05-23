import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {
	
	private 

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBookManager() {
		fail("Not yet implemented");
	}

	@Test
	void testBookManagerIntStringStringInt() {
		
	}

	@Test
	void testTestAddBook() {

		assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}도서가 추가되었습니다.",junit.testAddBook(1, "자바 기초", "Jane", 2021));
		assertEquals("해당 ID(1) 는 이미 존재합니다.",junit.testAddBook(1, "자바 기초", "Jane", 2021));
		System.out.println("검색 결과:");
		assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}", junit.testSearchBook(1, "자바 기초", "Jane", 2021));
		
		assertEquals("Book{id: '2', 제목: '소프트웨어 공학', 저자: 'Tom', 출판년도: 2014}도서가 추가되었습니다.", junit.testAddBook(2, "소프트웨어 공학", "Tom", 2014));
		assertEquals("Book{id: '3', 제목: '분산 컴퓨팅', 저자: 'Yoon', 출판년도: 2024}도서가 추가되었습니다.",junit.testAddBook(3, "분산 컴퓨팅", "Yoon", 2024));
	}

	@Test
	void testTestSearchBook() {
		junit.testAddBook(1, "자바 기초", "Jane", 2021);
		junit.testAddBook(2, "소프트웨어 공학", "Tom", 2014);
		junit.testAddBook(3, "분산 컴퓨팅", "Yoon", 2024);
		System.out.println("검색 결과:");
		assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}", junit.testSearchBook(1, "자바 기초", "Jane", 2021));
		System.out.println("검색 결과:");
		assertEquals("Book{id: '2', 제목: '소프트웨어 공학', 저자: 'Tom', 출판년도: 2014}",junit.testSearchBook(2, "소프트웨어 공학", "Tom", 2014));
		System.out.println("검색 결과:");
		assertEquals("Book{id: '3', 제목: '분산 컴퓨팅', 저자: 'Yoon', 출판년도: 2024}", junit.testSearchBook(3, "분산 컴퓨팅", "Yoon", 2024));
	}

	@Test
	void testTestRemoveBook() {
		assertEquals("검색된 도서가 없습니다.", junit.testSearchBook(1, "자바 기초", "Jane", 2020));		
		assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}도서가 추가되었습니다.",junit.testAddBook(1, "자바 기초", "Jane", 2021));
		assertEquals("Book{id: '2', 제목: '소프트웨어 공학', 저자: 'Tom', 출판년도: 2014}도서가 추가되었습니다.", junit.testAddBook(2, "소프트웨어 공학", "Tom", 2014));
		assertEquals("Book{id: '1', 제목: '자바 기초', 저자: 'Jane', 출판년도: 2021}도서가 삭제되었습니다",junit.testSearchBook(1, "자바 기초", "Jane", 2021));
		asserEqulas("해당 ID(1)의 도서를 찾을 수 없습니다.", junit.testSearchBook(1, "자바 기초", "Jane", 2021));
		asserEqulas("검색된 도서가 없습니다.", junit.testSearchBook(1, "자바 기초", "Jane", 2021));
	}

}
