package com.puzza.schoolmanagement.Exception;

import javax.transaction.SystemException;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.resource.transaction.backend.jta.internal.synchronization.ExceptionMapper;
//@provider
public class TeacherExceptionMapper implements ExceptionMapper{

	@Override
	public RuntimeException mapStatusCheckFailure(String message, SystemException systemException,
			SessionImplementor sessionImplementor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RuntimeException mapManagedFlushFailure(String message, RuntimeException failure,
			SessionImplementor session) {
		// TODO Auto-generated method stub
		return null;
	}


}
