import arrierePlans.*;
import fabriquerDecors.*;
import sols.Sol;

public class Decor {

    private Sol sol;
    private ArrierePlan arrierePlan;
    private FabriqueDecor fabriqueDecor;

    public Decor(Sol sol, ArrierePlan arrierePlan, FabriqueDecor fabriqueDecor) {
        this.sol = sol;
        this.arrierePlan = arrierePlan;
        this.fabriqueDecor = fabriqueDecor;
    }
    public Sol getSol() {return sol;}

    public void setSol(Sol sol) {this.sol = sol;}

    public ArrierePlan getArrierePlan() {return arrierePlan;}

    public void setArrierePlan(ArrierePlan arrierePlan) {
        this.arrierePlan = arrierePlan;
    }

    public FabriqueDecor getFabriqueDecor() {
        return fabriqueDecor;
    }

    public void setFabriqueDecor(FabriqueDecor fabriqueDecor) {
        this.fabriqueDecor = fabriqueDecor;
    }


}
