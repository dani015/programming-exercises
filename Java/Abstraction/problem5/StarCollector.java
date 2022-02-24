package problem5;

public class StarCollector {
    private Galaxy galaxy;

    public StarCollector(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void destroyStars(int[] enemyPositions) {

        int enemyRow = enemyPositions[0];
        int enemyCol = enemyPositions[1];

        while (enemyRow >= 0 && enemyCol >= 0){

            if(isInRange(enemyRow, enemyCol)){
                this.galaxy.setStar(enemyRow, enemyCol, new Star(0));
            }

            enemyRow--;
            enemyCol--;
        }
    }



    private boolean isInRange(int enemyRow, int enemyCol){
        return enemyRow >= 0 && enemyRow < this.galaxy.getRows()
                && enemyCol >= 0 && enemyCol < this.galaxy.getColumns(enemyRow);
    }

    public long sumOfStars(int[] playerPosition) {

        int row = playerPosition[0];
        int col = playerPosition[1];
        long sum = 0;
        while (row >= 0 && col < this.galaxy.getColumns(0)){

            if(isInRange(row, col)){
                sum += this.galaxy.getStarValue(row, col);
            }

            row--;
            col++;
        }

        return sum;
    }
}
