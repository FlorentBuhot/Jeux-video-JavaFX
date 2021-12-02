package fabriquerDecors;
import arrierePlans.ArrierePlan;
import arrierePlans.ArrierePlanEau;
import arrierePlans.ArrierePlanFeu;
import sols.*;
import arrierePlans.ArrierePlan;


public class FabriqueDecorEau extends FabriqueDecor {
    @Override
    public Sol creerSol(){
        return new SolEau();
    }

    @Override
    public ArrierePlan creerArrierePlan(){
        return new ArrierePlanEau();
    }
}
