public class Exercise10{
    public static void main(String args[]){

        int maximaVecesQueSeRepite = 0;
        int moda = 0;
        int M[] = {'B','A','B','C','A','C','D','C','A','A','C','D','C','B','A','A'};

        for(int i=0; i<M.length; i++){
            int vecesQueSeRepite = 0;
            for(int j=0; j<M.length; j++){
                if(M[i] == M[j])
                    vecesQueSeRepite++;
            }
            if(vecesQueSeRepite > maximaVecesQueSeRepite){
                moda = M[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        System.out.println("La moda es "+moda+" y se repitió "+maximaVecesQueSeRepite+" veces.");
    }
}

