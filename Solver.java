public class Solver {
    //class constants
    // something
    private int[][] white = {{0, 0, 0},{0, 0, 0}, {0, 0, 0}};
    //class variables
    Cube cube;
    String ollDot = "FRUruf";
    String ollBar = "FRUruf";
    String ollL = "FURurf";
      
    public Solver(Cube cube) {
        this.cube = cube;
    }
  
    public int[] find(int a, int b) {

    //FOR (the amount of faces)
        for (int i = 0; i < 6; i++) {

        //FOR (each piece on a face i)
            // for (int j = 0; j < 9; j++) {
            //     if (this.cube.faces[i][j] == a) {
            //         if (j == 1 && this.cube.faces[i].up[7] == b) {
            //             return 
            //         }
            //     }
            // }
        }
    }

    private boolean color(Face face, int pos, int color) {
        return face.matrix[pos] == color;
    }

    private void solveWhiteCross() {
        //
    }

    private void solveF2l() {
        //
    }

    private void oll() {
        Face face = this.cube.yellowFace;

        if (!color(face, 3, this.cube.YELLOW)) {
            if (color(face, 5, this.cube.YELLOW)) {
                // TODO perform counter clockwise turn
                if(!color(face, 3, this.cube.YELLOW)) {
                    // TODO perform counter clockwise turn
                }

                this.cube.algorithm(ollL);
            } else {
                if (!color(face, 1, this.cube.YELLOW)) {
                    this.cube.algorithm(ollDot);
                    // TODO perform turn
                    this.cube.algorithm(ollBar);
                }
            }
        } else {
            if (!color(face, 1, this.cube.YELLOW)) {
                this.cube.algorithm(ollBar);
            }
        }
    }

    private void pll() {

    }
  }
