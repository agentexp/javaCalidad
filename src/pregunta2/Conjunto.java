
package pregunta2;

public class Conjunto {
    String [] conjuntoA;
    String [] conjuntoB;
    int capacidadA;
    int capacidadB; 
   
    public Conjunto (){
    capacidadA=(int)(Math.random()*8)+2;
    capacidadB=(int)(Math.random()*8)+2;
    conjuntoA=new String[capacidadA];
    conjuntoB=new String[capacidadB];
    llenarAleatorioConjuntos();
    }
    
    public void llenarAleatorioConjuntos()
    {String elemento; int i=0,j=0;
        for (int k = 0; k < capacidadA; k++) {
            conjuntoA[k]=String.valueOf((int)(Math.random()*10));
        }
        for (int k = 0; k < capacidadB; k++) {
            conjuntoB[k]=String.valueOf((int)(Math.random()*10));
        }
        while (i<capacidadA)
        { elemento=String.valueOf((int)(Math.random()*10));
                   if (buscarEnA(elemento)<0)
                    {  conjuntoA[i]=elemento; 
                     i++;
                    }
         }
        
         while (j<capacidadB)
        { elemento=String.valueOf((int)(Math.random()*10));
                   if (buscarEnB(elemento)<0)
                    {  conjuntoB[j]=elemento; 
                     j++;
                    }
         }
    }
    
    public String[] obtenerConjuntoA()
    {      return conjuntoA;     }
    
    public String[] obtenerConjuntoB()
    {       return conjuntoB;     }
 
    public String[] ObtenerConjuntoUnion() {
        int indice=0; 
        String [] union =new String[capacidadA+capacidadB];
        
        for (int i = 0; i <capacidadA; i++) {
            union[indice]=conjuntoA[i];
            indice++;
        }
        
        for (int i = 0; i <capacidadB; i++) {
            if(buscarEnA(conjuntoB[i])<0)
            {
                union[indice]=conjuntoB[i];
                indice++;
            }
                   
        }
        
        return union;
    }
   
   public String [] ObtenerConjuntoInterseccion()
    {int pos=-1;    String [] interseccion =new String[capacidadA+capacidadB];
    int indice=0;
        for (int i = 0; i <capacidadA; i++) {
                pos=buscarEnB(conjuntoA[i]);
                if (pos>=0)
                {
                    interseccion[indice]=conjuntoA[i];
                    indice++;
                }  
        }
       
        return interseccion;
    }
   
   
    public String[] ObtenerDifeSimetrica()
    {
        int pos=-1;  
        int indice=0;
        String [] diferenciaSimetrica =new String[capacidadA+capacidadB];
        
        for (int i = 0; i <capacidadA; i++) {
                pos=buscarEnB(conjuntoA[i]);
                if (pos<0)  //paso lo que no hay a en b
                {
                    diferenciaSimetrica[indice]=conjuntoA[i];
                    indice++;
                }  
        }
         for (int i = 0; i <capacidadB; i++) {
                pos=buscarEnA(conjuntoB[i]);
                if (pos<0)      //paso lo que no hay b en a
                {
                    diferenciaSimetrica[indice]=conjuntoB[i];
                    indice++;
                }  
        }
        return diferenciaSimetrica;
    }
   
    
    public String []ObtenerSubconjuntoBenA()
    { String[] mensaje={"no es subConjunto "};
        int contador=0;
        int pos=-1;
       
        for (int i = 0; i < capacidadB; i++) {
            pos=buscarEnA(conjuntoB[i]);
            if (pos>=0)
            {      contador++;    }
  
        }
        if (contador==capacidadB)
        {        mensaje=conjuntoB;    }
        
        return mensaje;
    }
    public String [] ObtenerSuperConjuntoAdeB()
    { String[] mensaje={"no es superConjunto "};
        int contador=0;
        int pos=-1;
       
        for (int i = 0; i < capacidadB; i++) {
            pos=buscarEnA(conjuntoB[i]);
            if (pos>=0)
            {      contador++;    }
  
        }
        if (contador==capacidadB)
        {     mensaje=conjuntoA;    }
        
        return mensaje;
    }
    
    public int buscarEnB(String  elemento)
    {   int pos=-1;
        for (int i = 0; i <capacidadB; i++) {
            if (conjuntoB[i].equals(elemento))
            {pos=i;   }
        }
        return pos;
    }
   
    public int buscarEnA(String  elemento)
    {   int pos=-1;
        for (int i = 0; i <capacidadA; i++) {
            if (conjuntoA[i].equals(elemento))
            {pos=i;   }
        }
        return pos;
    }
    
   
  
}
