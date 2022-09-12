package com.lti.app;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

class MysqlConnection {

	public static int[] getArray(String str) {

		String[] string = str.replaceAll("\\[", "").replaceAll("]", "").split(", ");

		int[] arr = new int[string.length+1];

		for (int i = 0; i < string.length; i++) {
			arr[i] = Integer.valueOf(string[i]);
		}
		
		return arr;

		// printing the Integer array
		// System.out.print("\nInteger array : " + Arrays.toString(arr));
	}

	public static void insert(int id, String name, int age) {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("insert into student(id, name, age) values(?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, age);

			// execute query
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void insertJson(int id, String jsonData) {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("insert into jsondata(id, json) values(?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, jsonData);

			// execute query
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void updateJson(int id, int a) {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			PreparedStatement stmt = con.prepareStatement("select * from jsondata where id=?");
			stmt.setInt(1, id);

			// execute query
			ResultSet rs = stmt.executeQuery();
			
			String jsonData="";
			while (rs.next()) {
				jsonData = rs.getString(2);
			}
			
			// System.out.println("inside update function: "+jsonData);
			
			int[] arr = getArray(jsonData);
			arr[arr.length-1]=a;

			// prepare query
			PreparedStatement stmt1 = con.prepareStatement("update jsondata set json = ? where id = ?");
			stmt1.setString(1, Arrays.toString(arr));
			stmt1.setInt(2, id);
			stmt1.execute();

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void update(int id, String key, String value) {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("update student set ? = ? where id = ?");
			stmt.setString(1, key);
			stmt.setString(2, value);
			stmt.setInt(3, id);
			stmt.execute();

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void delete(int id) {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("delete from student where id=?");
			stmt.setInt(1, id);

			// execute query
			int i = stmt.executeUpdate();
			System.out.println(i + " records deleted");

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void show() {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("select * from student");

			// execute query
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " age: " + rs.getInt(3));
			}

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void showJsonData() {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("select * from jsondata");

			// execute query
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println("id: " + rs.getInt(1) + " json: " + rs.getString(2));
			}

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void search(int id, String name) {
		try {
			// not necessary
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rohit");

			// prepare query
			PreparedStatement stmt = con.prepareStatement("select * from student where id=? and name=?");
			stmt.setInt(1, id);
			stmt.setString(2, name);

			// execute query
			ResultSet rs = stmt.executeQuery();

			if (rs == null) {
				System.out.println("nothing found");
				return;
			}

			while (rs.next()) {
				System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " age: " + rs.getInt(3));
			}

			// close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {

		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("******************Menu*****************");
			System.out.println("1. insert");
			System.out.println("2. delete");
			System.out.println("3. show");
			System.out.println("4. search");
			System.out.println("5. update");
			System.out.println("6. insertjson");
			System.out.println("7. showjson");
			System.out.println("8. updatejson");
			System.out.println("***************************************");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter id:");
				int id = sc.nextInt();
				System.out.println("Enter name:");
				String name = sc.next();
				System.out.println("Enter age:");
				int age = sc.nextInt();
				insert(id, name, age);
				break;

			case 2:
				System.out.println("Enter id:");
				int id1 = sc.nextInt();
				delete(id1);
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("Enter id:");
				int id2 = sc.nextInt();
				System.out.println("Enter name:");
				String name2 = sc.next();
				search(id2, name2);
				break;
			case 5:
				System.out.println("Enter id:");
				int id3 = sc.nextInt();
				System.out.println("Enter key:");
				String key = sc.next();
				System.out.println("Enter value:");
				String value = sc.next();
				update(id3, key, value);
				break;
			case 6:
				System.out.println("Enter id:");
				int id4 = sc.nextInt();
				System.out.println("Enter jsondata:");
				String jsonData = sc.next();
				insertJson(id4, jsonData);
				break;
			case 7:
				showJsonData();
				break;
			case 8:
				System.out.println("Enter id:");
				int id5 = sc.nextInt();
				System.out.println("Enter int data:");
				int id6 = sc.nextInt();
				updateJson(id5, id6);
				break;
			default:
				System.out.println("please enter correct choice");
				break;
			}
		}
	}
}