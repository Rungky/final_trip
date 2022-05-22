package com.spring.trip.service;

import java.sql.Date;
import java.util.List;

import com.spring.trip.dto.CheckDTO;
import com.spring.trip.dto.DormDTO;
import com.spring.trip.dto.DormVO;
import com.spring.trip.dto.MemberDTO;
import com.spring.trip.dto.PaymentDTO;
import com.spring.trip.dto.QuestionDTO;
import com.spring.trip.dto.ReservationDTO;
import com.spring.trip.dto.ReviewDTO;
import com.spring.trip.dto.RoomDTO;

public interface TripService {
	public DormDTO selectDorm(int dormNo);
	public void changeLike(int dormNo, int num);
	public boolean checkLike(int dormNo, String id);
	public void insertLike(int dormNo, String id);
	public void deleteLike(int dormNo, String id);
	public List<RoomDTO> selectRoomsList(int dormNo);
	public List<RoomDTO> reservedRoomsList(int dormNo, Date checkIn, Date checkOut);
	public List<ReviewDTO> selectReviewsList(int dormNo);
	public ReservationDTO selectReservation(int reserveno);
	public List<ReservationDTO> selectReservationsList(String member);
	public int reserDelete(int reserve_no);
	public CheckDTO checkList(int dorm_no, int room_no, String dorm_name, String room_name, 
			Date reserve_checkin,Date reserve_checkout, int reserve_pay) ;
	public void insertReview(String title, String contents, double reviewScore, Date date, 
			String picture, int reserveNo, String memberId);
	public int selectTotalQuestion();
	public void insertReservation(String member, Date reserve_checkin, Date reserve_checkout, 
			int reserve_pay,int room_no, int dorm_no, int pay_no, int pay_check);
	public void insertPayment(int pay_check, String member, String pay_ment, String pay_num, 
			String real_name,String dorm_name,String room_name);
	public MemberDTO memberDto(String member_id);
	public int countQuestion(String id);
	public List<QuestionDTO> selectMemberQuestion(String id);
	public List<QuestionDTO> selectAnswer();
	public void insertNewQuestion (QuestionDTO questionDTO);
	public void insertReplyQuestion (QuestionDTO questionDTO);
	public List<QuestionDTO> selectQuestion(int question_no);
	public List<QuestionDTO> selectReply();
	public void plusViewCount(int articleNo);
	public void updateArticle(QuestionDTO questionDTO);
	public List<QuestionDTO> selectmodQuestion(int question_no);
	public void deleteArticle(int question_no);
	List<DormVO> getDormList(int dorm_category_no, Date start, Date end, int opt_wifi, int opt_parking, int opt_aircon, int opt_dryer, int opt_port, int room_person, int order, int price, String search);
	public List<DormDTO> selectMain_dormList(); // 메인 숙소 추천
	public List<QuestionDTO> selectAllQuestion(int parentno);
	public List<QuestionDTO> selectmodReply(int question_no);
	public void updateReply(QuestionDTO questionDTO);
	public void deleteReply(int question_no);
	public PaymentDTO selectPayment(String pay_num);
	public int paynoSelect(int reserve_no);
	public PaymentDTO nopaynoSelect(int pay_no);
	
}
