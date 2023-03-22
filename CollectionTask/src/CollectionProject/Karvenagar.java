package CollectionProject;

import java.util.*;

public class Karvenagar implements Cjc {

	Scanner sc = new Scanner(System.in);
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	@Override
	public void addCourse() {
		System.out.println("Enter number courses to added :");
		int ncourse=sc.nextInt();
		for(int i=0; i<ncourse;i++) {
		Course c = new Course();
		System.out.println("Enter course id :");
		c.setCid(sc.nextInt());
		System.out.println("Enter course name :");
		c.setCname(sc.next());
		clist.add(c);}
	}
	@Override
	public void viewCourse() {
		clist.forEach((cl) -> {
			System.out.println("course id :" + cl.getCid());
			System.out.println("course name :" + cl.getCname());

		});

	}

	@Override
	public void addFaculty() {
		System.out.println("Enter no faculty:");
		int numFaculty=sc.nextInt();
		for(int i=0;i<numFaculty;i++) {
			
		Faculty f= new Faculty();
		System.out.println("Enter faculty id :");
		f.setFid(sc.nextInt());
		System.out.println("Enter faculty name :");
		f.setFname(sc.next());
		System.out.println("Choose any one course below :");
		clist.forEach((cl) ->{ System.out.print("course id :"+cl.getCid());
		System.out.println("course name :"+cl.getCname());});
		System.out.println("Enter Course Id :");
		int x = sc.nextInt();
		clist.forEach((cl) -> 
					{
						if(x==cl.getCid()) {
							f.setCourse(cl);
						}
					}		
				);
		flist.add(f);
		}
		
	
		
	}

	@Override
	public void viewFaculty() {
		flist.forEach((fl) -> {
			System.out.println("faculty id :" + fl.getFid());
			System.out.println("faculty name :" + fl.getFname());
			System.out.println("course :"+fl.getCourse().getCname());
		});

	}

	@Override
	public void addBatch() {
		System.out.println("Enter number of batch to add :");

		int nbatch=sc.nextInt();
		for(int i=0;i<nbatch;i++) {
	    Batch b=new Batch();
		System.out.println("Enter batch id :");
		b.setBid(sc.nextInt());
		System.out.println("Enter batch name");
		b.setBname(sc.next());
		System.out.println("choose any faculty bellow :");
		flist.forEach((fl) -> {
			System.out.println("faculty id :" + fl.getFid());
			System.out.println("faculty name :" + fl.getFname());
			System.out.println("course :"+fl.getCourse().getCname());
		});
		System.out.println("Enter faculty id :");
		int f= sc.nextInt();
		flist.forEach((fl) -> {
		if(f==fl.getFid()){
			b.setFaculty(fl);
		}
			
		});
		blist.add(b);
		
		}
	}

	@Override
	public void viewBatch() {
		blist.forEach((bl)->{
			System.out.println("batch id :"+bl.getBid());
			System.out.println("batch name :"+bl.getBname());
			System.out.println("facutlty :"+bl.getFaculty().getFname());
		});

	}

	@Override
	public void addStudent() {
	 System.out.println("Enter number of student to add :");
	 int nstu=sc.nextInt();
	 for(int i=0; i<nstu;i++) {
		 Student s= new Student();
		 System.out.println("Enter student id :");
		 s.setSid(sc.nextInt());
		 System.out.println("Enter student name :");
		 s.setSname(sc.next());
		 System.out.println("select youe batch from bellow");
		 blist.forEach((bl)->{
				System.out.println("batch id :"+bl.getBid());
				System.out.println("batch name :"+bl.getBname());
				System.out.println("facutlty :"+bl.getFaculty().getFname());
			});
		 System.out.println("Enter batch id :");
		 int b=sc.nextInt();
		 blist.forEach((bl)->{
			 if(b==bl.getBid()) {
				 s.setBatch(bl);
			 }
		 });
		 slist.add(s);
		 
		 
		 
	 }

	}

	@Override
	public void viewStudent() {
		slist.forEach((st) ->{
			System.out.println("Student id :"+st.getSid());
			System.out.println("Student name :"+st.getSname());
			System.out.println("batch name :"+st.getBatch().getBname());
			System.out.println("faculty name :"+st.getBatch().getFaculty().getFname());
			System.out.println("course name :"+st.getBatch().getFaculty().getCourse().getCname());
		});

	}

}
