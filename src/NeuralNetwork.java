import java.util.Random;

class NeuralNetwork {
    public Layer[] layers;

    /**
     * Constructs a new Neural Network.
     * @param neuronCounts An array representing how many neurons each layer should have. The length of this array should be how many layers the NN should have.
     * @param randMin The minimum bound for the random weights & biases assigned to each neuron.
     * @param randMax The maximum bound for the random weights & biases assigned to each neuron.
     */
    public NeuralNetwork(int[] neuronCounts, double randMin, double randMax){
        // TODO:
        // Initialize each layer by calling its constructor, passing down randMin and randMax
        // Store the created layers in the layers array.
    }

    public double[] runCalculation(double[] inputs){
        // TODO:
        // Run the calculation on each neuron of each layer of the neural network.

            // TODO:
            // Manually set the values of each neuron on the input layer to the inputs we are given

            // TODO:
            // Then, just call runCalculation on each hidden layer

            // TODO:
            // Then, extract and return the values from the output layer.
    }

    // A helper function to create a clone of this NN. This is boring so I just implemented it for you
    public NeuralNetwork deepCopy(){
        int[] neuronCounts = new int[layers.length];
        for(int i = 0; i < layers.length; i++) neuronCounts[i] = layers[i].neurons.length;
        NeuralNetwork copy = new NeuralNetwork(neuronCounts, 0, 0);
        for(int i = 0; i < layers.length; i++){
            for(int j = 0; j < layers[i].neurons.length; j++){
                copy.layers[i].neurons[j].bias = layers[i].neurons[j].bias;
                for(int k = 0; k < layers[i].neurons[j].weights.length; k++){
                    copy.layers[i].neurons[j].weights[k] = layers[i].neurons[j].weights[k];
                }
            }
        }
        return copy;
    }

    public void mutate(double randomAmount){
        // This function is used for training. It simulates the concept of genetic mutation.

        // TODO:
        // Slightly change each weight and bias of each neuron by the amount *randomAmount*.
    }
}
