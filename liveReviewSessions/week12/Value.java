package week12;

public class Value {
    int param=0;
    boolean calledMethod=false;
    boolean calledConstructor=false;
    public Value(){}
    public Value(int param){
        this.param=param;
    }
    public void setValue(int param){
        this.param=param;
        calledMethod=true;
    }
    public boolean wasModified(){
       return calledMethod;
    }

    public int getValue(){
      /*  if(tis.calledMethod){
            return this.param;
        }
        else if (calledConstructor){
            return this.param;
        }else{
            return this.param;
        }

    }
   */
        return this.param;
    }

}
/*
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called, it getVal returns the last value passed to setVal. Otherwise if the "single int parameter" constructor was used to create the object, getVal returns the value passed to that constructor. Otherwise getVal returns 0.
 */
