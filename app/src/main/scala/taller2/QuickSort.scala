package taller2;

class QuickSort {

  type AlgoritmoOrd[T] = List[T] => (List[T], Int)
  type Comparador[T] = (T, T) => Boolean

  /**
      * 
      *
      * @param l recibe una lista de elementos tipo T
      * @param v pivote de la lista
      * @param comp comparador de elementos tipo T
      * @ Una tupla que contiene una lista que son menores que v, la lista de que son mayores o iguales a v y cuantas comparaciones de hicieron
      */
  def menoresQue_noMenoresQue[T](l:List[T], v:T, comp:Comparador[T]): (List[T],List[T],Int) = {
     (List(),List(),0)
  }

  def QuickSort[T](comp:Comparador[T]): AlgoritmoOrd[T] = {
     (L:List[T]) => (List(),0)
  }
}
