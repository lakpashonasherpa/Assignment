package exam;
/*Given a sentence print the word and count the frequency in a given sentence
 * for example 
 * Tree are plants, and plants are carnivorous
 * output sould be like
 * plant:2
 * are:2
 * trees:1
 * carnivorous:1
 * some:1
 * 
 * 
 * 
 * 
 * */
public class Solution2 {
	public static void main(String[] args) {
		String string="Tree are plants and plants are carnivorous";
		int count=1;
		String[] arr=string.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].equals(arr[j])&&arr[i]!="-1") {
					arr[j]="-1";
					count++;
					
				}
				
			}
			if(count>1 && arr[i]!="-1")
            {
                System.out.println(arr[i]+" "+count);
                 arr[i]="-1";
            }
            count=1;
			
		}
		
	}

}
