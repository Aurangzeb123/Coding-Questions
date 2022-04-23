/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[] a = {5, 1, 22, 25, 6, -1, 8, 10};
		int[] b = {1, 5, -1, 10};
		//selectionSort(a, 5);
		boolean ret = isSubsequence(a, a.length, b, b.length);
		System.out.println(ret);
	}

	static boolean isSubsequence(int[] arr, int n, int[] sub, int k)
	{
	    int i=0;
	    int j=0;
	    
	    for(;i<k&&j<n;)
	    {
	        if(sub[i]==arr[j])
	        {
	            i++;
	        }
	        j++;
	    }
	    
	    if(i==k)
	        return true;
	    return false;
	}  
}
