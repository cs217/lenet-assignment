# Introduction
LeNet is a classic (i.e. really old) neural network, which you will be optimizing for this assignment.
The variant of LeNet for this assignment is taken from 
[Google Slim](https://github.com/tensorflow/models/blob/master/research/slim/nets/lenet.py).

This assignment will be due in 1 month, on March 13th.

# Details
### Input
This is a 28x28 input (single channel), and you will be processing a total of 8 inputs.

### Conv1 (28x28 -> 32 channels @ 28x28)
This layer consists of 32 5x5 convolutions, with 0-padding on the edges.
A RELU is then applied to each of these outputs.

### MaxPool (32 channels @ 28x28 -> 32 channels @ 14x14)
This layer simply takes the maximum element of each 2x2 block.

### Conv2 (32 channels @ 14x14 -> 64 channels @ 14x14)
This layer consists of 64 5x5 convolutions, each acting on all 32 channels (effectively 32x5x5), followed by a RELU.

### MaxPool (64 channels @ 14x14 -> 64 channels @ 7x7)
This layer simply takes the maximum element of each 2x2 block.

### FC1 (64 channels @ 7x7 -> 1024)
This layer is a fully connected layer, from all 3136 elements in the flattened output
from the MaxPool to 1024 elements. These are then passed through a RELU.

### FC2 (1024 -> 10)
This layer is also a fully connected layer, with 10 outputs.
These outputs are then passed through a SoftMax for the final result. (Softmax not used for this assignment)


# Constraints
For this assignment you will have 2048 Operations, and 16 MiB of SRAM + Registers. Unlike the GEMM/GEMV assignment, you are only required to have the final prediction be identical (argmax(output)).
Your goal for this assignment is to execute 8 inferences using as few cycles as possible.

You are allowed to permute the input, weight, and output tensors however you'd like within the host-side code (outside the Accel block) to achieve this goal. However, any actual computation must be done within the Accel block.
We will not be using LineBuffers for this assignment.

# Additional Information
Reference inputs, outputs, and intermediate activations are provided in weights/lenet.npz file.
We encourage testing your implementation with 1 or 2 examples first, as the base implementation can take upwards of 10-15 minutes per example on slower machines.

# Final Submission Instructions
Have your implementation of Lenet placed in lenet.scala on the master branch of your github repository

There will additionally be a write-up due on Gradescope.
