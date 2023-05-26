package Exeptions.Sem3;

public class emptyArray extends NullPointerException{
    public emptyArray (){
        super("Мы обратились к пустому элементу массива");
    }
}

