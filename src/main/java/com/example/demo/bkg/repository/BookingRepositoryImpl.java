package com.example.demo.bkg.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.bkg.domain.Booking;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class BookingRepositoryImpl extends QuerydslRepositorySupport implements BookingCustomRepository {

	//private final JPAQueryFactory qf;
	public BookingRepositoryImpl() {
		super(Booking.class);
		//this.qf = qf;
	}

}
