package fabriquerDecors;

import sols.Sol;
import arrierePlans.ArrierePlan;

public abstract class FabriqueDecor {
    public abstract Sol creerSol();
    public abstract ArrierePlan creerArrierePlan();
}
