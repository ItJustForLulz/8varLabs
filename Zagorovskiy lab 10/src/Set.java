import java.util.ArrayList;
import java.util.List;

/**
 * Created by graver_mc on 14.05.2018.
 */
public class Set {
    private List<Integer> set;

    public Set(){
        this.set = new ArrayList<Integer>();
    }

    public Set(List<Integer> set) {
        this.set = new ArrayList<Integer>(set);
    }

    public void add(int value){
        this.set.add(value);
    }

    public void remove(){
        this.set.remove(this.set.size()-1);
    }

    public int size(){
        return this.set.size();
    }

    public Set intersection(Set obj){
        Set temp = new Set();
        for(int i=0;i<this.set.size();i++){
            for(int j=0;j<obj.size();j++){
                if(this.set.get(i)==obj.getSet().get(j)) {
                    temp.add(this.set.get(i));
                }
            }
        }
        return temp;
    }

    public Set association(Set obj){
        Set intersect = new Set(this.intersection(obj).getSet());
        Set objCopy = new Set(obj.getSet());
        Set temp = new Set();
        for(int i:this.set){
            temp.add(i);
        }
        for(int i=0;i<objCopy.size();i++){
            for(int j=0;j<intersect.size();j++){
                if(objCopy.getSet().get(i)==intersect.getSet().get(j)){ objCopy.removeFromPosition(i+1); }
            }
        }
        for(int i:objCopy.set){
            temp.add(i);
        }
        return temp;
    }

    public void addToPosition(int index,int value){
        index-=1;
        List<Integer> temp = new ArrayList<Integer>();
        temp.addAll(this.set);
        for(int i=temp.size()-1;i>index-1;i--){
            this.set.remove(i);
        }
        this.set.add(value);
        for(int i=index;i<=temp.size()-1;i++){
            this.set.add(temp.get(i));
        }

    }

    public void removeFromPosition(int index){
        this.set.remove(index-1);
    }

    public String toString(){
        String s = "Множество: ";
        for(int a:this.set){
            s+= a+" ";
        }
        s+="\n";
        return s;
    }

    public List<Integer> getSet() {
        return set;
    }

    public void setSet(List<Integer> set) {
        this.set = set;
    }
}
