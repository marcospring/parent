package com.csyy.core.datasource.param;

public interface CustomSQL {
	CustomSQL cloumn(String column);

	CustomSQL operator(ESQLOperator operator);

	CustomSQL v(Object value);

//    CustomSQL array(String [] array);
//
//    CustomSQL array(int [] array);
}
