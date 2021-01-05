package org.edu.nisith;

import java.util.LinkedList;

/**
 * Created by c0244782 on 27/12/2020.
 */
public class StringFactor {

    public static void main (String args[]){
        String val ="abcd";
        if(args.length == 1){
          val =args[0];
        }

        LinkedList<String> result = new LinkedList<String>();

//        int i= valArr.length;
//        long fact=1;
//        while(i>0){
//            fact = fact*i;
//            i--;
//        }
//
//        System.out.println(fact);

        // printPermString(val,0,val.length());

           result = permStringList(val,0,val.length(),result);

        for(String res : result){
            System.out.println(res);
        }

    }


/*    static void printPermString(char[] text, String val, int start, int point){
        char[] valTemp = text;

        if (point == 1){
            System.out.println(val);
            return ;
        }else if (point ==2){
            System.out.println(new String(valTemp));

            char tem = valTemp[valTemp.length - 1];
            valTemp[valTemp.length - 1] = valTemp[valTemp.length - 2];
            valTemp[valTemp.length - 2] = tem;

            System.out.println(new String(valTemp));
            return ;
        }else{
            for(int i = 0; i < point ; i++){
                System.out.println("i -- > "+i);
                System.out.println("point -- > "+point);
                System.out.println("start -- > "+start);
                System.out.println("valTemp -- > "+new String(valTemp));
                valTemp = val.toCharArray();
                char tem = valTemp[start];
                valTemp[start] = valTemp[start+i];
                valTemp[start+i] = tem;
                printPermString(valTemp, new String(valTemp), start+1,point-1);
                }
        }

        }*/

    static void printPermString( String val, int start, int point){

        if (point == 0){
            System.out.println(val);
            return ;
         }else{
            for(int i = 0; i < point ; i++){
                char[] valTemp = val.toCharArray();
                char tem = valTemp[start];
                valTemp[start] = valTemp[start+i];
                valTemp[start+i] = tem;
                printPermString( new String(valTemp), start+1,point-1);
            }
        }

    }

    static LinkedList<String> permStringList( String val, int start, int point,LinkedList<String> result ){

        if (point == 1){
            System.out.println(val);
            result.add(val);
            return result;
        }else{
            for(int i = 0; i < point ; i++){
                char[] valTemp = val.toCharArray();
                char tem = valTemp[start];
                valTemp[start] = valTemp[start+i];
                valTemp[start+i] = tem;
                result = permStringList(new String(valTemp), start+1,point-1,result);
            }
        }
        return result;
    }
}
