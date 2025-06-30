package com.giyun.backboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.giyun.backboard.entity.Board;
import com.giyun.backboard.repository.BoardRepository;

@SpringBootTest
class BackboardApplicationTests {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testBoardRepository() {
		Board board1 = new Board();
		board1.setTitle("첫번째 게시글입니다."); // @Setter에서 자동 생성해주는 메서드
		board1.setContent("내용은 없습니다."); // @Setter에서 자동 생성해주는 메서드
		board1.setCreateDate(LocalDateTime.now()); // @Setter에서 자동 생성해주는 메서드

		Board board2 = new Board();
		board2.setTitle(" 두번째 게시글입니다."); // @Setter에서 자동 생성해주는 메서드
		board2.setContent("내용은 없습니다."); // @Setter에서 자동 생성해주는 메서드
		board2.setCreateDate(LocalDateTime.now()); // @Setter에서 자동 생성해주는 메서드

		boardRepository.save(board1); // BoardRepository를 통해 데이터베이스에 저장
		boardRepository.save(board2); // BoardRepository를 통해 데이터베이스에 저장

	}

	@Test
	void testSelectOneJpa() {
		// Optional => null이 될 수 있는 객체를 감싸는 클래스
		Optional<Board> opBoard = this.boardRepository.findById(0L);
		if (opBoard.isPresent()) {
			Board board = opBoard.get(); // Optional에서 Board 객체를 꺼냄
			assertEquals("내용은 없습니다.", board.getContent());

		}
	}

	@Test
	void testSelectByTitle() {
		Board board = this.boardRepository.findByTitle("첫번째 게시글입니다.");
		assertEquals(1L, board.getBno()); // 게시글 번호가 2L인지 확인
	}

	@Test // SELECT FROM LIKE
	void testSelectByContent() {
		List<Board> boards = this.boardRepository.findByContentContaining("%게시글%");
		assertEquals(2, boards.size()); // 게시글이 2개인지 확인

		Board board = boards.get(0); // 첫 번째 게시글 가져오기
		assertEquals("첫번째 게시글입니다.", board.getTitle()); // 제목이 "첫
	}

	@Test
	void findAllBoards() {
		List<Board> boards = this.boardRepository.findAll(); // 모든 게시글 조회
		assertEquals(2, boards.size());

		Board board = boards.get(0); // 첫 번째 게시글 가져오기
		assertEquals("첫번째 게시글입니다.", board.getTitle());

	}

	@Test
	void deleteAllBoards() {
		boardRepository.deleteAll(); // 모든 게시글 삭제
		System.out.println("모든 게시글이 삭제되었습니다.");
	}

	@Test
	void deleteBoardById() {
		assertEquals(4, boardRepository.count()); // 게시글 개수 확인
		Optional<Board> opBoard = boardRepository.findById(1L); // ID로 게시글 조회
		assertEquals(opBoard, deleteBoardById());

		Board board = opBoard.get(); // Optional에서 Board 객체를 꺼냄
		boardRepository.delete(board); // 게시글 삭제
		assertEquals(3, boardRepository.count()); // 게시글 개수 확인
}
