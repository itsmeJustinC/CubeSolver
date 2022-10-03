public class Cube {
    // This class will have the matrices of each face
    // of the cube
  
    final int WHITE = 0;
    final int RED = 1;
    final int BLUE = 2;
    final int ORANGE = 3;
    final int GREEN = 4;
    final int YELLOW = 5;
  
    public void createMatrix() {
      // local constants
  
      // local variables
  
    }
  
    // It will have methods that are capable of altering
    // the matrices in a way that represents what the cube
    // would look like in the real world if one of its faces were turned.
    
    // ######################################################
    // ##### New Content #####
    // ######################################################

    // One turn affects 5 of the matrices, all except the opposite side
    // I think it might be a good idea to create a class that represents
    // each side and would hold information regarding which other sides
    // turning itself would affect. Basically the class would hold the 
    // 3x3 matrix the represents itself and then also have some variables
    // that point to the other sides it is conencted to. Then in cube.java
    // there would be a turn method that takes a "Side" object as a parameter
    // and then performs the neccesary changes for when that side is turned.

    // ######################################################
    // ######################################################
    // ######################################################
  
    /*****
     * could use a for loop and possibly variables
     * for column "3" top[][2] rotate to front[][2], front rotate
     * to bottom[][2]...
     *
     * we can make different methods for specific moves like U R U', ect
     * this way you would only have to call the moves methods
     * 
     * we could also print out the scramble and "fastest" algorithm *used to solve (
     * this would open the possibility up to other *people searching for 1. random
     * scrambles 2. faster ways to solve
     * their own cube )
     * 
     * ect ect
     *****/
  
    // This class should also hold properties of the cube
    // such as whether or not it is in a solved state, and
    // the various stages of being solved (ex. white cross, first
    // two layers, oriented last layer)
  
    // A matrix is essentially a 2D array so there will have
    // to be 6 2D matrices to represent the cube. Probably should
    // refer to these matrices as top, bottom, left, right, front, and back
  
    // For the colors I'm thinkning:
    // 0 - White
    // 1 - Red
    // 2 - Blue
    // 3 - Orange
    // 4 - Green
    // 5 - Yellow
  
    // Will also need a way to retrieve all of the faces of the cube
    // so that I can loop over all the faces to look for pieces
  }