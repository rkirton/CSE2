{"filter":false,"title":"SearchArrays.java","tooltip":"/lab11/SearchArrays.java","undoManager":{"mark":0,"position":0,"stack":[[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":64,"column":1},"action":"insert","lines":["import java.util.Scanner;","import java.util.Random;","public class searchArrays{","","public static void main(String[] args) {//generate random array","//Random numGen = new Random();//to import random numbers","\tint[] randomInputs=new int [50];//size 10 array","\tint i=1;//for count","\tfor(i=0; i<=49; i++){","\t\tint random=(int) ((Math.random())*100);//random numbers in array","\t\trandomInputs[i]=random;","\t}","\tint max=0;","\tint min=100;","\tfor(i=0; i<=49; i++){","\tif (randomInputs[i]<min){","\t\tmin=randomInputs[i];","\t}","","\telse if (randomInputs[i]>max){","\t\tmax=randomInputs[i];","\t}","\t}","\tSystem.out.println(\"The maximum of array1 is: \"+max);","\tSystem.out.println(\"The minimum of array1 is: \"+min);","\t","\t","\t","\tint[] orderInputs=new int [50];","\tint count=0;","\t\tfor(i=0; i<=49; i++){","\t\tint random=(int) ((Math.random())*100);//random numbers in array","\t\tcount+=random;","\t\torderInputs[i]=count;","}","System.out.println(\"The maximum of array2 is: \"+orderInputs[49]);","System.out.println(\"The minimum of array2 is: \"+orderInputs[0]);","","\tScanner scan=new Scanner(System.in);","\tSystem.out.println(\"Enter an int: \");","\tint binaryNum=scan.nextInt();","\t","\tint bottom=0;","\tint top=49;","\tint brackets=26;","\twhile (top!=brackets&bottom!=brackets){//orderInputs[brackets]!=binaryNum || top==bottom+1||top==bottom||","\t\tif (orderInputs[brackets]<binaryNum){","\t\t\tbottom=(int)(bottom+(top-bottom)/2);","\t\t\t\tbrackets=((int)(bottom+((top-bottom)/2)+.5));","\t\t\t//\tSystem.out.println(brackets+\"  \"+bottom);","\t\t\t\t","\t\t}","\t\telse {","\t\t\ttop=(int)(top-(top-bottom)/2);","\t\t\t\tbrackets=((int)(top-((top-bottom)/2)+.5));","\t\t\t//\tSystem.out.println(brackets+\" \"+top);","","\t\t}","\t}","\tint bracketTop=top;","\tint bracketBottom=brackets-1;","\tSystem.out.println(\"your number was found between \"+orderInputs[top]+\" and \"+orderInputs[bottom]);","","}","}"]}]}]]},"ace":{"folds":[],"scrolltop":195,"scrollleft":0,"selection":{"start":{"row":64,"column":1},"end":{"row":64,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":12,"state":"start","mode":"ace/mode/java"}},"timestamp":1429281300929,"hash":"f82615e6592ba6691be2f9da742365d163010ffa"}