class Neuron {

    // These WEIGHTS and BIAS are the parameters we can tweak to change our neural network.
    public double[] weights;
    public double bias;
    public Layer prevLayer;

    // This value is the neuron's output from the most recent run.
    public double val;

    // We take the whole layer as an argument since every neuron from the previous layer is linked to every node of the next layer!
    public Neuron(double[] weights, double bias, Layer prevLayer){
        this.weights = weights;
        this.bias = bias;
        this.prevLayer = prevLayer;
    }

    public void runCalculation(){
        // TODO:
        // This method should run the linear calculation and set *val* to the result.
        // Remember, the formula is: (Weight A) x (Input A) + (Weight B) * (Input B) + ... + Bias
    }
}
