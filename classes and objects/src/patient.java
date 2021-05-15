public class patient { 
   String patientName; 
   double height,width; 
  double computeBMI(double weight, double height) 
{ 
double h=height*height; 
return weight/h; 

} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patient p1=new patient(); 

		double x=p1.computeBMI(100,50.0); 

		System.out.println("BMI is "+x); 

	}

}
