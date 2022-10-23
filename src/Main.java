import java.util.Arrays;
import java.util.Comparator;

class Main {

    // HELLO COMP SCI CLUB!
    // Today, you are going to be implementing your OWN neural network.
    // Follow the TO-DO comments throughout!

    // 1. Start by implementing Neuron, then Layer, then NeuralNetwork classes.
    // 2. Then, fill out the calculateError function in Main.
    // 3. Then, complete trainByHillClimber.
    // 4. Then, complete trainByEvolution.

    // Solutions are online: https://github.com/Harvard-Westlake-Computer-Science-Club/NeuralNetworks





    public static void main(String[] args){

        // Let's train a NN that can add two numbers!
        // You can make up your own simple algorithm and have the computer guess - just add a few data points below and
        // then train, and then add test cases to see if it found the algorithm!
        double[][] inputs = {
                {1, 2},
                {2, 4},
                {5, 2},
                {10, 2},
                {5, 5},
                {100, -50}
        };
        double[][] solutions = {
                {3}, {6}, {7}, {12}, {10}, {50}
        };


        // I've found that the parameters I set below work best for me; you can change them if it's not working quite right
        NeuralNetwork nn = trainByHillClimber(new int[]{inputs[0].length, 10, 10, solutions[0].length}, -2, 2, 0.001, 0.02, inputs, solutions);
//      NeuralNetwork nn = trainByEvolution(new int[]{inputs[0].length, 10, 10, solutions[0].length}, -2, 2, 0.001, 0.02, inputs, solutions);


        // Let's run a calculation that *wasn't* included in our training set to make sure the NN actually found our
        // solution, and wasn't just overfitting to our training dataset.
        System.out.println(nn.runCalculation(new double[]{9, 10})[0]); // --> should output 19
        System.out.println(nn.runCalculation(new double[]{4, 5})[0]); // --> should output 9
        System.out.println(nn.runCalculation(new double[]{10, -5})[0]); // --> should output 5
    }

    public static double calculateError(NeuralNetwork nn, double[][] inputs, double[][] solutions){
        // TODO:
        // Run the calculation on the neural net, and then return a double
        // representing the error, or how far it was off from the correct solution.

        // Remember: our error function for a single variable is: ABS(guess - solution)
    }


    /**
     * Trains a neural network by hill climber.
     * @param neuronCounts The number of neurons in each layer. The length of this array should be the number of layers
     * @param initialRandMin Min value of random weights/biases
     * @param initialRandMax Max value of random weights/biases
     * @param mutationAmt Amount each weight and bias should change by when net is mutated
     * @param successThreshold When error goes below this value, we consider the training to be complete
     * @param inputs The inputs of our training data
     * @param solutions The outputs of our training data
     * @return The trained neural network
     */
    public static NeuralNetwork trainByHillClimber(int[] neuronCounts, double initialRandMin, double initialRandMax, double mutationAmt, double successThreshold, double[][] inputs, double[][] solutions){
        // TODO: Implement this function after you have finished the NeuralNetwork, Neuron, and Layer classes

        // 0. Create a new neural network with random values ranging from initialRandMin to initialRandMax
        // 1. Mutate the net a little
        // 2. Check if the new error is better than the old error before the mutation
        // - if it's better, save that as our new network
        // - if it's worse, revert to our old network
        // 3. Repeat until error is less than successThreshold. Return the network

        // Hint: you might find it easier to debug if you print out the error at each step
    }

    /**
     * Trains a neural network by evolution.
     * @param neuronCounts The number of neurons in each layer. The length of this array should be the number of layers
     * @param initialRandMin Min value of random weights/biases
     * @param initialRandMax Max value of random weights/biases
     * @param mutationAmt Amount each weight and bias should change by when net is mutated
     * @param successThreshold When error goes below this value, we consider the training to be complete
     * @param inputs The inputs of our training data
     * @param solutions The outputs of our training data
     * @return The trained neural network
     */
    public static NeuralNetwork trainByEvolution(int[] neuronCounts, double initialRandMin, double initialRandMax, double mutationAmt, double successThreshold, double[][] inputs, double[][] solutions){
        // TODO: Implement this method after you have completed trainByHillClimber


        // 1. Create 100 (or however many you want) neural networks.
        // 2. Calculate the error on each neural network and store it somewhere.
        // 3. Sort the networks by their error.
        // 4.
        //   a) Clone the top 20%, mutate them, and add them into the pool
        //   b) Mutate top 20-80% and keep them in the pool
        //   c) Kill off the bottom 20%
        // 5. Repeat until the best network has an error less than successThreshold. Return the best network


        // Hint: you might find it easier to debug if you print out the best, worst, and median error at each step
    }
}
