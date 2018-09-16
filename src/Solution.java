import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

    List<Student> sortedList = new ArrayList<Student>();
    sortedList = sortList(studentList);

    for(Student st: sortedList){
		  System.out.println(st.getFname());
		}
	}

    public static List sortList(List<Student> list){
      int size = list.size();
      for(int i = 0; i < size-1; i++){
        for (int j = 0; j < size - i -1; j++){
          if(list.get(j).getCgpa() < list.get(j+1).getCgpa()){
            Student aux1 = list.get(j);
            Student aux2 = list.get(j+1);
            list.set(j,aux2);
            list.set(j+1,aux1);
          }
          else if (list.get(j).getCgpa() == list.get(j+1).getCgpa()){
            int compare = list.get(j).getFname().compareTo(list.get(j+1).getFname());

            if(compare > 0){
              Student aux1 = list.get(j);
              Student aux2 = list.get(j+1);
              list.set(j,aux2);
              list.set(j+1,aux1);
            }
            else if(compare == 0){
              if(list.get(j).getId() > list.get(j+1).getId()){
                Student aux1 = list.get(j);
                Student aux2 = list.get(j+1);
                list.set(j,aux2);
                list.set(j+1,aux1);
              }
            }
          }
        }
      }
      //System.out.println(list);
      return list;
    }
}