class Grade{
	
	public static void main(String [] args){

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your number");

	int num= sc.nextInt();

	if(num>=0&&num<=30){
		System.out.println("Fail");
	}
	else if (num>=31&&num<=59){
		System.out.println("Secont");
	}
	else if (num>=60&&num<=100);{
		System.out.println("First")
	}

	else{
		System.out.println("Invalid num");
	}



	}
}