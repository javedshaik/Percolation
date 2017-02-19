import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

    public class Percolation(){
        public boolean [][] arr;
        public WeightedQuickUnionUF wqf;
        public int gridSize;
        
        //creates a grid n-by-n, with all the sites blocked
        public Percolation(int N){
            gridSize = N;
            wqf = new WeightedQuickUnionUF((N*N));
            arr = new boolean [N][N];
            
            for(int row = 0; row<N; i++){
                for(int col = 0; col < N; j++){
                    arr[row][col] = false;
                }
            }
        //open site (row, col) if it is not open already
            public void open (int row, int col){
            }
        //is site (row, col) open
            public boolean isOpen(int row, int col){
            }
        //is site (row, col) full
        public boolean isFull(int row, int col){
        }
        // number of open sites
        public int numberOfOpenSites(){
        }
        //does the system percolate?
        public boolean percolates(){
        }
        //main test
        public static void main (String[] args){
        }
        }
            
            