package com.user.name.school.dto;
import com.user.name.school.dto.interfaces.*;
public class StudentDTO implements StudentDTOInterface
{
	private int rollNumber;
	private String name;
	private char gender;
	private boolean isIndian;
	private java.util.Date dateOfBirth;
	public StudentDTO()
	{
		this.rollNumber = 0;
		this.name = "";
		this.gender = ' ';
		this.isIndian = false;
		this.dateOfBirth=null;
	}
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return this.gender;
	}

	public void setIsIndian(boolean isIndian)
	{
		this.isIndian=isIndian;
	}
	public boolean getIsIndian()
	{
		return this.isIndian;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public java.util.Date getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	public boolean equals(Object other)
	{
		if(!(other instanceof StudentDTOInterface)) return false;
		StudentDTOInterface studentDTOInterface;
		studentDTOInterface = (StudentDTOInterface)other;
		return this.rollNumber == studentDTOInterface.getRollNumber();
	}
}
