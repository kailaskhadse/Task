package CompanyProjectList;

import java.util.*;

public class Company {

	public static void main(String[] args) {
		List<Project>team1=new ArrayList<>();
		Project project1=new Project();
		project1.setProjectId(123);
		project1.setProjectName("Jio");
		project1.setManagerName("Raj");
		Project project2=new Project();
		project2.setProjectId(1234);
		project2.setProjectName("Idea");
		project2.setManagerName("Rahul");
		List<Project>team2=new ArrayList<>();
		Project project3=new Project();
		project3.setProjectId(456);
		project3.setProjectName("Bsnl");
		project3.setManagerName("Anil");
		Project project4=new Project();
		project4.setProjectId(4567);
		project4.setProjectName("Airtel");
		project4.setManagerName("Bharati");
		Project project5=new Project();
		project5.setProjectId(45678);
		project5.setProjectName("Vodafone");
		project5.setManagerName("Suraj");
		team1.add(project1);
		team1.add(project2);
		team2.add(project3);
		team2.add(project4);
		team2.add(project5);
		List<List<Project>> Company=new ArrayList<>();
		Company.add(team1);
		Company.add(team2);
		Company.forEach((team) ->
		team.forEach((p)->{System.out.println("Project id :"+p.getProjectId());
		System.out.println("Project name :"+p.getProjectName());
		System.out.println("Project Manager Name :"+p.getManagerName());}));

		/*for(List<Project>team:Company) {
			for(Project p:team) {
				System.out.println("Project id :"+p.getProjectId());
				System.out.println("Project name :"+p.getProjectName());
				System.out.println("Project Manager Name :"+p.getManagerName());
			}
		}*/
		
		
		

	}

}
