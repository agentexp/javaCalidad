
package pregunta1;

public class Matrizz{ 
        
int  numeroColumna;
int numeroFila;
Object matriz[][]={{4,7,-5,4,9},{0,3,-2,6,-2},{1,2,4,1,1},{6,1,0,3,-4},{1,1,1,1,1}};;
 
    public Matrizz ()
    {   numeroColumna=5;
        numeroFila=5;
     }
       
    public int CantidadNumeros()
    {       return (numeroColumna*numeroFila);  }
    
    public int SumaDeTodoLosNumeros()
    { int acumulador=0;
        for (int i=0;i<numeroFila;i++)
       {
           for(int j=0;j<numeroColumna;j++ )
           {     acumulador= acumulador +(int)( matriz[i][j]); }
       }
        return acumulador;
    }
    
    public int numeroMayor()
    {
        int mayor;
        mayor=(int)matriz[0][0];
        
        for (int i=0;i<numeroFila;i++)
        {
           for(int j=0;j<numeroColumna;j++ )
           {   
               if(mayor<(int)matriz[i][j])
                {mayor=(int)(matriz[i][j]);}
           
               }
        }
        return mayor;
        
    }
    public int numeroMenor()
    {
        int menor;
        menor=(int)matriz[0][0];
        
        for (int i=0;i<numeroFila;i++)
        {
           for(int j=0;j<numeroColumna;j++ )
           {   
               if(menor>(int)matriz[i][j])
                {menor=(int)(matriz[i][j]);}
           
               }
        }
        return menor;
    }
    
    public int sumaFilaN(int posFila)
    {int acumulador=0;
        for(int j=0;j<numeroColumna;j++)
        {
            acumulador=acumulador+(int)matriz[posFila][j];
        }
        return acumulador;
    }
    
    public int sumaColumnaN( int posColumna)
    {
        int acumulador=0;
        for(int i=0;i<numeroColumna;i++)
        {
            acumulador=acumulador+(int)matriz[i][posColumna];
        }
        return acumulador;
    }
    public int sumaNoPerteneceDiagonal()
    { int suma=0;
        for (int i=0;i<numeroFila;i++)
       {  for(int j=0;j<numeroColumna;j++ )
           {     
               if(i!=j)
               {
                   suma=suma+(int)(matriz[i][j]);   
               }
            }
       }
        return suma;
    }
    
    public Object[][]  obtenerMatriz()
    { 
        return matriz;
    }
}
