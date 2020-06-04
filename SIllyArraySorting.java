import java.util.Random;

public class SillyArraySorting {
	
	private void set2DArray( int smallestValueAnIntegerCanBe, int poolOfValuesAddedToSmallestValue)  {
	 Random r = new Random();
        int[][] a = new int[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					a[i][j] = smallestValueAnIntegerCanBe + r.nextInt(poolOfValuesAddedToSmallestValue);
            }
        }

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(" "+a[i][j]);
            }
						System.out.print("\n");
        }

        boolean ordering = true;//If the value are replaced than the values go from not being in order false to being in order true
        int startingPoint, valuesWithinTheSet;//there are starting values and ending values that will accomadate the function
        int replacingIntergerToIntegerInTheCorrectOrder, currentI, currentJ, nextI, nextJ; //This allows for the current to be swapped with a following value and now has new varibles that reflext that

        startingPoint = 0;

			while (ordering) {
				ordering = false;
					startingPoint = startingPoint + 1;
	
						for (valuesWithinTheSet = 0; valuesWithinTheSet < 3 * 3 - startingPoint; valuesWithinTheSet++) {
							currentI = valuesWithinTheSet / 3;
							currentJ = valuesWithinTheSet % 3;
							nextI = (valuesWithinTheSet + 1) / 3;
							nextJ = (valuesWithinTheSet + 1) % 3;
						if (a[currentI][currentJ] > a[nextI][nextJ]) {
							replacingIntergerToIntegerInTheCorrectOrder = a[currentI][currentJ];
							a[currentI][currentJ] = a[nextI][nextJ];
							a[nextI][nextJ] = replacingIntergerToIntegerInTheCorrectOrder;
							ordering = true;
							
							System.out.print("\n");

								for (int i = 0; i < 3; i++) {
									for (int j = 0; j < 3; j++) {
										System.out.print(" "+a[i][j]);
									}
									System.out.print("\n");
                }
            }
        }
		}
	}

		
	 public static void main (String []args){
		SillyArraySorting obj = new SillyArraySorting(); //Calling on the array set created
		obj.set2DArray(10, 90); //new setter method
						
											}
							
							
			
									
									
									
									
									


	}