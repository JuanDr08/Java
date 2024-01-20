public class Birthday{
    public static void main(String[] args){

            // create a variable, n, for number of possible outcomes (first command line argument)
        int n = Integer.parseInt(args[0]);

// create a variable, trials, for number of trials to perform (second command line argument)
        int trials = Integer.parseInt(args[1]);

// Initialize an integer array to track the number of rolls necessary to make a match, for each trial
        int[] rollsPerTrial = new int[n+2];

        for (int i = 0; i < trials; i++) {
            int rolls = 0;// Initialize a count of rolls

            boolean[] listOfRolls = new boolean[n];// Initialize a boolean array of length n, (defaults to all == false)

            // Perform a 'roll' (i.e. create a uniform random digit between (0, n - 1)
            // Count the additional roll
            // Check whether that roll has occurred already. listOfRolls[rand] == (true/false)?
            // If true, then stop the process
            // If false, then set listOfRolls[roll] to true, and roll again
            while (true) {
                int rand =  (int) (Math.random() * (n-1));   // Call a random number between 0 and n-1
                rolls += 1;     
                                        // Increment the roll counter
                if (listOfRolls[rand] == true){ // Test whether that random number has come up before
                break;
               }else{
                listOfRolls[rand] = true;  // Otherwise, set that F to T and re-roll
                }          
            } rollsPerTrial[rolls] += 1;                  // Update the count of respective rolls for each trial
        }

// Track the frequency of number of rolls per trial
        double[] frequencyOfRolls = new double[rollsPerTrial.length];
        int totalRolls = 0;
        for (int i = 0; i < rollsPerTrial.length; i++) {
            totalRolls += rollsPerTrial[i];
            frequencyOfRolls[i] = (double) totalRolls / trials;
        }

// Print results: a) number of people in the room, b) number of times that number was needed, c) frequency of that amount
        for (int i = 1; i <= rollsPerTrial.length; i++) {
            System.out.println(i + "\t" + rollsPerTrial[i] + " \t " + frequencyOfRolls[i]);
            if (frequencyOfRolls[i] >= 0.50) break;       // Stop once frequency reaches 50%

        }
    }
}
       

    
