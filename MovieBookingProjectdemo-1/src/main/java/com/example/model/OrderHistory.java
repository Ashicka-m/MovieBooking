package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="history")
public class OrderHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hId;
	
	@ElementCollection
	private List<String> seat;
	
	@ElementCollection
	private List<Double> price;
	
	private double total;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name = "book_on_date")
	private Date bookOnDate;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name = "show_on_date")
	private Date showOnDate;
	
	@Column(name = "show_time")
	private String showTime;
	
	@OneToOne
	private Register register;
	@Column(name = "movie_name")
	private String movieName;
	
	
	
	public long gethId() {
		return hId;
	}

	public void sethId(long hId) {
		this.hId = hId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	
	public List<String> getSeat() {
		return seat;
	}

	public void setSeat(List<String> seat) {
		this.seat = seat;
	}

	public List<Double> getPrice() {
		return price;
	}

	public void setPrice(List<Double> price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getBookOnDate() {
		return bookOnDate;
	}

	public void setBookOnDate(Date bookOnDate) {
		this.bookOnDate = bookOnDate;
	}

	public Date getShowOnDate() {
		return showOnDate;
	}

	public void setShowOnDate(Date showOnDate) {
		this.showOnDate = showOnDate;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public OrderHistory() {
		System.out.println("orderhistory object created");
		// TODO Auto-generated constructor stub
	}
	public OrderHistory(long hId, List<String> seat, List<Double> price, double total, String movieName,
			Date bookOnDate, Date showOnDate, String showTime, Register register) {
		super();
		this.hId = hId;
		this.seat = seat;
		this.price = price;
		this.total = total;
		this.movieName = movieName;
		this.bookOnDate = bookOnDate;
		this.showOnDate = showOnDate;
		this.showTime = showTime;
		this.register = register;
	}

	public OrderHistory(List<String> seat, List<Double> price, double total, String movieName, Date bookOnDate,
			Date showOnDate, String showTime, Register customer) {
		super();
		this.seat = seat;
		this.price = price;
		this.total = total;
		this.movieName = movieName;
		this.bookOnDate = bookOnDate;
		this.showOnDate = showOnDate;
		this.showTime = showTime;
		this.register = customer;
	}


	
}
