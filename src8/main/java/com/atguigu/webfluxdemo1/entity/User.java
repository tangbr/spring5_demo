package com.atguigu.webfluxdemo1.entity;

public class User {

		private String name;			
		private String gender;
		private Integer age;
		
		public User() {
			// TODO Auto-generated constructor stub
		}

		public User(String name, String gender, Integer age) {
					super();
					this.name = name;
					this.gender = gender;
					this.age = age;
		}
		
		/**
				 * @return the name
				 */
				public String getName() {
					return name;
				}
				/**
				 * @param name the name to set
				 */
				public void setName(String name) {
					this.name = name;
				}
				/**
				 * @return the gender
				 */
				public String getGender() {
					return gender;
				}
				/**
				 * @param gender the gender to set
				 */
				public void setGender(String gender) {
					this.gender = gender;
				}
				/**
				 * @return the age
				 */
				public Integer getAge() {
					return age;
				}
				/**
				 * @param age the age to set
				 */
				public void setAge(Integer age) {
					this.age = age;
				}
					
}
