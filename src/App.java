import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import controllers.StackSorterG;
import models.Persona;


public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);

        System.out.println("\n========= PILA  =========");
        System.out.println("Elementos actuales en la pila:");
        stack.printStack(); 
        System.out.println("Tamaño de la pila: " + stack.size());
        stack.pop();
        System.out.println("Elementos después del pop:");
        stack.printStack(); 
        System.out.println("Tamaño actualizado de la pila: " + stack.size());

        System.out.println("\n========= PILA GENÉRICA =========");
        StackG<Integer> stackGInt = new StackG<>();
        stackGInt.push(1);
        stackGInt.push(4);
        System.out.println("Elementos en la pila genérica:");
        stackGInt.printStack(); 
        System.out.println("Tamaño de la pila genérica: " + stackGInt.size());

        StackG<String> stackGString = new StackG<>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        System.out.println("Elementos en la pila genérica :");
        stackGString.printStack(); 
        System.out.println("Tamaño de la pila genérica : " + stackGString.size());

        System.out.println("\n========= COLA =========");
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tamaño de la cola: " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Después de remover un elemento:");
        System.out.println("Tamaño de la cola: " + cola.size);
        cola.printCola();

        System.out.println("\n========= COLA GENÉRICA =========");
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersona = new ColaG<>();
        colaPersona.add(p1);
        colaPersona.add(p2);
        colaPersona.add(p3);
        System.out.println("Tamaño de la cola: " + colaPersona.size());
        colaPersona.printColag();
        System.out.println("Atiende a la persona => " + colaPersona.remove());
        System.out.println("Tamaño de la cola: " + colaPersona.size());
        colaPersona.printColag();

        System.out.println("\n========= ENCONTRAR NOMBRE =========");
        System.out.println("La persona a buscar es David");
        colaPersona.findByName("David");

        Persona personaEliminada = colaPersona.removeByName("David");
        if (personaEliminada != null) {
            System.out.println("Persona eliminada: " + personaEliminada.getNombre());
        } else {
            System.out.println("No se encontró a la persona con ese nombre.");
        }

        System.out.println("\n========= EJERCICIO UNO =========");
        SignValidator validator = new SignValidator();
        System.out.println("La cadena --> ([]){} es: " + validator.isValid("([]){}"));
        System.out.println("La cadena --> ([]){} es: " + validator.isValid("({)}"));

        System.out.println("\n========= EJERCICIO DOS =========");
        StackG<Integer> stack = new StackG<>();
        stack.push(5);
        stack.push(1); 
        stack.push(4);
        stack.push(2);

        StackG sorter = new StackG();
        sorter.sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
