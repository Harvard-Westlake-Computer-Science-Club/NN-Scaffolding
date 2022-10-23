class Layer {
    public Neuron[] neurons;

    /**
     * Constructs a new layer.
     * @param neuronCount How many neurons this layer should have.
     * @param randMin The minimum bound for the random weights & biases assigned to each neuron.
     * @param randMax The maximum bound for the random weights & biases assigned to each neuron.
     * @param prevLayer The previous layer in the NN; set to null if this layer is the input layer.
     */
    public Layer(int neuronCount, double randMin, double randMax, Layer prevLayer){
        // TODO:
        // Initialize each neuron in this layer, settings its weights and biases to a
        // random number between randMin and randMax.
        // Store the created neurons in the neurons array.

        // Special case: the input layer should have no weights and a bias of 0.
    }

    public void runCalculation(){
        // TODO:
        // Call runCalculation on each neuron in the layer
    }
}
