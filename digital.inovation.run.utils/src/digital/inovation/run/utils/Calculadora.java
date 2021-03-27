package digital.inovation.run.utils;

import digital.inovation.run.utils.internal.DivHelper;
import digital.inovation.run.utils.internal.MultiHelper;
import digital.inovation.run.utils.internal.SubHelper;
import digital.inovation.run.utils.internal.SumHelper;

public class Calculadora {

    private final DivHelper divHelper;
    private final MultiHelper multiHelper;
    private final SubHelper subHelper;
    private final SumHelper sumHelper;

    public Calculadora() {
        divHelper = new DivHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a,b);
    }

    public int multi(int a, int b) {
        return multiHelper.execute(a,b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }



}
