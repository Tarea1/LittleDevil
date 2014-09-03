/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ld;

/**
 *
 * @author andres mora
 */
public class LD {

    class Nodo {
        String info;
        Nodo ant,sig;
    }
    private Nodo raiz;
    private Nodo actual;
    
    public LD () {
        raiz=null;
    }
              
    
    public void insertarUltimo(String cancion) {
        Nodo nuevo=new Nodo();
        nuevo.info=cancion;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;            
            raiz=nuevo;
        } else {
            Nodo ultimo=raiz.ant;
            nuevo.sig=raiz;
            nuevo.ant=ultimo;
            raiz.ant=nuevo;
            ultimo.sig=nuevo;
        }
    }    
    
    public boolean vacia ()
    {
        if (this.raiz == null)
            return true;
        else
            return false;
    }
    
    public void imprimir ()
    {
        if (!vacia()) 
        {
            int i=1;
            Nodo reco=this.raiz;
            do {
                System.out.print (i+"-"+reco.info +"\n");
                reco = reco.sig;
                ++i;
            } while (reco!=this.raiz);
            System.out.println();
        }    
    }
    
    public void siguiente()
    {
        if (this.actual==null)
        {
            this.actual= this.raiz;
            this.actual= this.actual.sig;
        } 
        else
        {
            this.actual= this.actual.sig;
        }
    }
    
        public void anterior()
    {
        if (this.actual==null)
        {
            this.actual= this.raiz;
            this.actual= this.actual.ant;
        } 
        else
        {
            this.actual= this.actual.ant;
        }
    }
    
    public int cantidad ()
    {
        int cant = 0;
        if (!vacia()) {
            Nodo reco=this.raiz;
            do {
                cant++;
                reco = reco.sig;                
            } while (reco!=this.raiz);
        }    
        return cant;
    }
    
    public void borrar (int pos)
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                if (cantidad()==1) {
                    raiz=null;
                } else {
                    Nodo ultimo=raiz.ant;    
                    raiz = raiz.sig;
                    ultimo.sig=raiz;
                    raiz.ant=ultimo;
                } 
            } else {
                Nodo reco = raiz;
                for (int f = 1 ; f <= pos - 1 ; f++)
                    reco = reco.sig;
                Nodo anterior = reco.ant;
                reco=reco.sig;
                anterior.sig=reco;
                reco.ant=anterior;
            }
        }
    } 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
