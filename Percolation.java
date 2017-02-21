import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

    public class Percolation(){
        public boolean [][] arr;
        public WeightedQuickUnionUF wqf;
        public int gridSize;
        private int high;
        private int low; 
        private int numOfOpenSites;
        
        //creates a grid n-by-n, with all the sites blocked
        public Percolation(int N){
            numOfOpenSites++;
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
                arr[row - 1][col - 1] = true;
                if(row = 1){
                    wqf.union(getQFIndex(row, col) high);
                }
                
               
            }
        //is site (row, col) open
            public boolean isOpen(int row, int col){
                return (row-1, col-1);
            }
        //is site (row, col) full
        public boolean isFull(int row, int col){
            if !(isOpen(row, col)){
                return false;
            }
            return wqf.connected(toIndex(row, col)
        }
        // number of open sites
        public int numberOfOpenSites(){
            return numOfOpenSites;
        }
        //does the system percolate?
        public boolean percolates(){
            return wqf.connected(high, low);
        }
        //main test
        public static void main (String[] args){
        }
        }
            
            