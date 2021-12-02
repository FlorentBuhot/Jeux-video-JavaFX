package fabriquerDecors;

import arrierePlans.ArrierePlan;
import arrierePlans.ArrierePlanFeu;
import sols.Sol;
import sols.SolFeu;

public class FabriquerDecorFeu extends FabriqueDecor{

    @Override
    public Sol creerSol() {
        return new SolFeu();
    }

    @Override
    public ArrierePlan creerArrierePlan() {
        return new ArrierePlanFeu();
    }
}
