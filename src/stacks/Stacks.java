
package stacks;

/**
 *
 * @author Henz Montera
 */
public class Stacks {

    
    public static void main(String[] args) {
        
        linkedstack<String> strstck = new linkedstack<>();
        
        try{//----------------------------------------------------------//
                                                                        //
        strstck.push("bottom");                                         //
        strstck.push("middle");                                         //
        strstck.push("top");                                            //
                                                                        //
                                                                        //
        System.out.print("Top: "+ strstck.top() + "\n");                //
        System.out.print("Size: "+ strstck.size() + "\n");              //
                                                //
        System.out.print("Top: "+ strstck.top() + "\n");                //-- Used for testing the Exception Message
        System.out.print("Size: "+ strstck.size() + "\n");              //-- the try and catch method.
                                                 //
        System.out.print("Top: "+ strstck.top() + "\n");                //
        System.out.print("Size: "+ strstck.size() + "\n");              //
                    //
              //
                                                                        
        }catch(EmptyStackException e){                                //
            System.out.print(e.getMessage());                         //
        }//-------------------------------------------------------------//
        
       
//     linkedstack<recentmovies> mlist = new linkedstack<>();
//     
//     
//     try{
//        mlist.push(new recentmovies("Iron man",2008,7));
//        System.out.print(mlist.top().display()+"\n");
//        mlist.pop();
//        mlist.push(new recentmovies("endgame",2019,12));
//        System.out.print(mlist.top().display()+"\n");
//        mlist.pop();
//        mlist.push(new recentmovies("blackpanther",2017,10));
//        System.out.print(mlist.top().display()+"\n");
//        mlist.pop();
//        mlist.push(new recentmovies("john wick 3",2019,4));
//        System.out.print(mlist.top().display()+"\n");
//        mlist.pop();
//        mlist.push(new recentmovies("Peaky Blinders",2016,2));
//        System.out.print(mlist.top().display()+"\n");
//        mlist.pop();
//        mlist.pop();
//     }catch(EmptyStackException e){
//         System.out.println(e.getMessage());
//     }
 
        
        
    }
    
}
