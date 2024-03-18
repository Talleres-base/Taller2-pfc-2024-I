package taller2;

class InsertionSort {


  type AlgoritmoOrd[T] = List[T] => (List[T], Int)
  type Comparador[T] = (T, T) => Boolean
  /**
      * 
      *
      * @param e Elemento a insertar tipo T
      * @param l Lista ordenada de elementos tipo T
      * @param comp Funcion de comparacion de elementos tipo T
      * @return para deja de lista ordenada incluyendo el elemento e y cuantas comparaciones se hicieron para lograrlo
      */
  def insert[T](e:T, l:List[T], comp:Comparador[T]): (List[T], int) = {

  }


  /**
      * 
      *
      * @param comp comparador de elementos tipo T
      * @return una función que recibe una lista de elementos tipo T y devuelve una tupla con la lista ordenada y el número de comparaciones realizada
      */
  def InsertionSort[T](comp:Comparador[T]): AlgoritmoOrd[T] = {
  
  }

}
