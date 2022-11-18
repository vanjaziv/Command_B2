import java.util.LinkedList;
import java.util.Queue;


public class Kitchen {

    private static Kitchen kitchen = null;
    Queue<Command> queue = new LinkedList<>();

    private Kitchen() {
    }

    public static Kitchen getInstance(){
        if (kitchen == null){
            kitchen = new Kitchen();
        }else{
            System.out.println("Küche bereits erstellt, gebe 'alte' Instanz züruck");
        }
        return kitchen;
    }

    public void add(Command c){
        queue.add(c);

        System.out.println("Kitchen hat eine neuw Bestellung erhalten");

        if (queue.size() > 4){
            System.out.println("Kitchen: schalte Herd an.");
           while (! queue.isEmpty()){
               Command einCommand = queue.remove();
               einCommand.execute();
           }
        }
    }

}
