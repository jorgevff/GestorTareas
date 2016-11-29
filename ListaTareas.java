import java.util.ArrayList;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    // instance variables - replace the example below with your own
   /**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    // Coleccion que almacena todas las tareas
    private ArrayList<String> listaDeTareas;
    

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<String>();
    }

    public void verTareas() 
    {
        System.out.println(listaDeTareas);


    }
    
    public void addTarea(String nuevaTarea){
        //añade objetos string al array, invocando add sobre el objeto de la clase arraylist
        listaDeTareas.add(nuevaTarea);
    
    }
    
    /**
     * devuelve el numeero de tareas, un numero, por eso es int
     */
    public int getNumeroTareas(){
        return listaDeTareas.size();
    
    }
    /**
      * Elimina la tarea que ocupa la posicion indicada.
      * Si la posicion indicada no es valida, no hace nada
      */
    
    public void eliminaTarea(int posicion){
        if (posicion >= 0 && posicion < listaDeTareas.size() && listaDeTareas == null){
        listaDeTareas.remove(posicion);
    }
    }
}

