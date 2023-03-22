package com.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;
import com.service.College;
import com.utility.Configuration;

public class Kailas implements College {
	Scanner sc=new Scanner(System.in);
	@Override
	public void addCourse() {
		//Scanner sc=new Scanner(System.in);
		try {
		Connection cn=Configuration.buildConnection();
		Course c=new Course();
		System.out.println("Enter course id :");
		c.setCid(sc.nextInt());
		System.out.println("Enter course name :");
		c.setCname(sc.next());
		String sql="insert into Course values(?,?)";
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, c.getCid());
		ps.setString(2, c.getCname());
		ps.execute();
	}
		catch(Exception e) {
			System.out.println(e);
		

		}}
			@Override
	public void viewCourse() {
		try {
			Connection cn= Configuration.buildConnection();
			String sql="Select * from Course";
			PreparedStatement psm =cn.prepareStatement(sql);
			ResultSet rs=psm.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addFaculty() {
		try {
			Connection cn=Configuration.buildConnection();
			 Faculty f=new Faculty();
			System.out.println("Enter faculty id :");
			f.setFid(sc.nextInt());
			System.out.println("Enter faculty name");
			f.setFname(sc.next());
			System.out.println("choose course for faculty :");
			viewCourse();
			System.out.println("Enter course id");
			int csid=sc.nextInt();
			
				//Connection cn1= Configuration.buildConnection();
				String sql="Select * from Course where cid=?";
				PreparedStatement psm =cn.prepareStatement(sql);
			     psm.setInt(1, csid);
			     
			     ResultSet rs=psm.executeQuery();
			if(rs.next()) {
				Course c= new Course();
				c.setCid(rs.getInt(1));
				c.setCname(rs.getString(2));
				f.setCo(c);
				try {
					Connection cn2=Configuration.buildConnection();
				
				String s="insert into faculty values(?,?,?,?)";
				PreparedStatement ps1=cn2.prepareStatement(s);
				ps1.setInt(1, f.getFid());
				ps1.setString(2, f.getFname());
				ps1.setInt(3, f.getCo().getCid());
				ps1.setString(4, f.getCo().getCname());
				ps1.execute();
				
				
				System.out.println("faculty successfully added");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			else {
				System.out.println("Enter valid id");
			}
			
		}
			
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	@Override
	public void viewFaculty() {
		try {
			Connection cn= Configuration.buildConnection();
			String sql="Select * from Faculty";
			PreparedStatement psm =cn.prepareStatement(sql);
			ResultSet rs=psm.executeQuery();
	        while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addBatch() {
		try {
			Connection cn= Configuration.buildConnection();
			Batch b=new Batch();
			System.out.println("Enter batch id :");
			b.setBid(sc.nextInt());
			System.out.println("Enter batch name");
			b.setBname(sc.next());
			System.out.println("select faculty from bellow for batch");
			viewFaculty();
			System.out.println("Enter faculty id :");
			int id=sc.nextInt();
			String sql="Select * from faculty where fid=?";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Faculty f= new Faculty();
				f.setFid(rs.getInt(1));
				f.setFname(rs.getString(2));
				Course c=new Course();
				c.setCid(rs.getInt(3));
				c.setCname(rs.getString(4));
				f.setCo(c);
				b.setFc(f); 
				try {
					System.out.println(b.getFc().getCo().getCid());
					Connection cn1=Configuration.buildConnection();
					String s="insert into batch values(?,?,?,?,?,?)";
					//System.out.println(sql);
					PreparedStatement ps1=cn1.prepareStatement(s);
					ps1.setInt(1, b.getBid());
					ps1.setString(2, b.getBname());
					ps1.setInt(3,b.getFc().getFid());
					ps1.setString(4, b.getFc().getFname());
					ps1.setInt(5, b.getFc().getCo().getCid());
					ps1.setString(6, b.getFc().getCo().getCname());
					ps1.execute();
					System.out.println("data added successfully in batch");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void viewBatch() {
		try {
			Connection cn=Configuration.buildConnection();
			String sql="Select * from batch";
			PreparedStatement psm =cn.prepareStatement(sql);
			ResultSet rs=psm.executeQuery();
	        while(rs.next()) {
	        	System.out.print(rs.getInt(1)+" ");
	        	System.out.print(rs.getString(2)+" ");
	        	System.out.print(rs.getInt(3)+" ");
	        	System.out.print(rs.getString(4)+" ");
	        	System.out.print(rs.getInt(5)+" ");
	        	System.out.print(rs.getString(6)+" ");
	        }
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addStudent() {
		try {
			Connection cn=Configuration.buildConnection();
			Student s= new Student();
			System.out.println("Enter student id ");
			s.setSid(sc.nextInt());
			System.out.println("Enter student name");
			s.setSname(sc.next());
			System.out.println("select batch for student");
			viewBatch();
			System.out.println("Enter batch id ");
			int id=sc.nextInt();
			String sql="Select * from batch where bid=?";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Batch b= new Batch();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				s.setBa(b);
				Faculty f= new Faculty();
				f.setFid(rs.getInt(3));
				f.setFname(rs.getString(4));
				b.setFc(f);
				
		       Course c=new Course();
				c.setCid(rs.getInt(5));
				c.setCname(rs.getString(6));
				f.setCo(c);
				b.setFc(f); 
			
				try {
					
					Connection cn1=Configuration.buildConnection();
					String sql1="insert into Student values(?,?,?,?,?,?,?,?)";
					
					PreparedStatement ps1=cn1.prepareStatement(sql1);
					ps1.setInt(1, s.getSid());
					ps1.setString(2, s.getSname());
					ps1.setInt(3,s.getBa().getBid());
					ps1.setString(4, s.getBa().getBname());
					ps1.setInt(5, s.getBa().getFc().getFid());
					ps1.setString(6,s.getBa().getFc().getFname());
					ps1.setInt(7, s.getBa().getFc().getCo().getCid());
					ps1.setString(8,s.getBa().getFc().getCo().getCname());
				
					ps1.execute();
					System.out.println("data added successfully in student");
				}
				catch(Exception e) {
					System.out.println(e);
				}}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void viewStudent() {
		try {
			Connection cn=Configuration.buildConnection();
			String s="Select * from student";
			PreparedStatement psm=cn.prepareStatement(s);
			ResultSet rs=psm.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8));
			}
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
	}
public void updateBatch() {
	 
	
}
}
