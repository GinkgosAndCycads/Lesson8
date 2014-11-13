public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
        private int test[] = new int[3];
	//turn this into an array///////////////
    	private int mark1, mark2, mark3; 


 //constructor methods - 3 ways you can make a student
      public Student(){
		this("", 0, 0, 0);
	} 
      public Student(String nm, int t[]){ 
          name = nm; 
          test = t;
      } 
      public Student (Student other){ 
            this(other.name, other.test);
      }

	//Additonal Constructor
	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		mark1 = t1;
		mark2 = t2;
		mark3 = t3;
	}
    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int i, int score){ 
        test[i-1] = score;
    }

    public int getAverage() {
    	int average = (test[0] + test[1] + test[2]) / 3;
    	return average;
    }


    public int getMark(int i) {
	return test [i-1];
    }

    public int getHighscore() {
    	if (mark1 > mark2 && mark1 > mark3) {
    		return mark1;
    	}
    	else if (mark2 > mark1 && mark2 > mark3){
    		return mark2;

    	} else {
    		return mark3;
    	}
    }

    public String toString() {
    	//prints the details of the student when itr is printed 
        String str; 
        str = "Name:\t\t" + name + "\n"; 
        str+=""+getAverage(); 
        return str;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (mark1 < 0 || mark1 > 100 || mark2 < 0 || mark2 > 100 || mark3 < 0 || mark3 > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
	
	return message;
    	}

    int[] getMark(int[] marks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }

