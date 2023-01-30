package com.compact.info.common;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public class CommonDate {
	//공통 date
	
	@CreatedDate
	private LocalDateTime registeredAt;

	@LastModifiedDate
	private LocalDateTime updateedAt;
}
