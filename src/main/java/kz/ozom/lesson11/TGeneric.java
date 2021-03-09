package kz.ozom.lesson11;

public class TGeneric<TG> {
    private TG obj;

    public TGeneric(TG obj) {
        this.obj = obj;
    }

    public TG getObj(){
        return obj;
    }

    public void showType(){
        System.out.println(obj.getClass().getName());
    }
}
