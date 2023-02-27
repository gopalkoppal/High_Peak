import java.util.*;
public class JobTitle {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the number of Jobs");
		        int n = sc.nextInt();

		        int[][] jobs = new int[n][3];

		        System.out.println("Enter job start time, end time, and earnings");

		        for (int i = 0; i < n; i++) {
		            jobs[i][0] = sc.nextInt();
		            jobs[i][1] = sc.nextInt();
		            jobs[i][2] = sc.nextInt();
		        }

		        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);


		        int count = 1;

		        
		        int earnings;
		        if(jobs[0][2]>jobs[1][2])
		        {
		        	if(jobs[0][2]>jobs[2][2])
		        	{
		        		earnings = jobs[0][2];
		        	}
		        	else
		        	{
		        		earnings = jobs[2][2];
		        	}
		        }
		        else
		        {
		        	if(jobs[1][2]>jobs[2][2])
		        	{
		        		earnings = jobs[1][2];
		        	}
		        	else
		        	{
		        		earnings = jobs[2][2];
		        	}
		        }


		        System.out.println("The number of tasks and earnings available for others");
		        
		        System.out.println("Task: " + (n - count) /*earnings*/);
		        
		       
		        
		        System.out.println("Earnings: " + (Arrays.stream(jobs).mapToInt(j -> j[2]).sum() - earnings));
		    }
	}

