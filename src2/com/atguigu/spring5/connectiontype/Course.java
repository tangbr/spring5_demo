package com.atguigu.spring5.connectiontype;

public class Course {

			private String cname;

			public void setCname(String cname) {
				this.cname = cname;
			}

			@Override
			public String toString() {
				return "Course [cname=" + cname + "]";
			}
			
	
}
