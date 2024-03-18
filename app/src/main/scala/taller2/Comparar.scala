package taller2;

class Comparar {

  type AlgoritmoOrd[T] = List[T] => (List[T], Int)
  type Comparador[T] = (T, T) => Boolean

  /**
      * 
      *
      * @param a1 Algoritmo de ordenamiento
      * @param a2 Algoritmo de ordenamiento
      * @param l lista de para ordenar de tipo T
      * @return parajea con las comparaciones hechas por a1 y por a2, si los dos algoritmos dan el mismo resultado, si no (-1,-1)
      */
  def comparar[T](a1:AlgoritmoOrd[T], a2:AlgoritmoOrd[T], l:List[T]):(Int, Int) = {
    (-1,-1)
  }

}
