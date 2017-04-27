
import java.util.*;

public abstract class ObjetObservable{
        private List<ObjetObservateur> list;
        private boolean etat;

        public ObjetObservable(){
                list = new ArrayList<ObjetObservateur>();
                etat = false;
        }

        public void ajouteObservateur(ObjetObservateur o ){
                list.add(o);
        }

        public void prevenirObservateur(){
                for(ObjetObservateur o : list){
                        o.action(this);
                }
        }

        public void setEtat(){
                this.etat=!this.etat;
        }

        public boolean getEtat(){
                return this.etat;
        }

}
