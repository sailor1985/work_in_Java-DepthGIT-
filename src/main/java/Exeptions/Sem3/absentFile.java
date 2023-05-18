package Exeptions.Sem3;

import java.io.FileNotFoundException;

public class absentFile extends FileNotFoundException {
    public absentFile(){
        super("Такого файла нет!");
    }
}
