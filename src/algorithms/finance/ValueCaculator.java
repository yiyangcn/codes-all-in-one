package algorithms.finance;

public class ValueCaculator {

    /**
     *  PV: present value
     *  CF: cashflow
     *  R: intrest rate  
     * @param args
     */
    static double calculatePVWithFixedCFAndR(double CF, double R, int T) {
        double PV = CF/R * (1- 1/Math.pow(1+R,T));
        return PV;
    }

    /**
     * 
     * 
     *  PV: present value
     *  CF: cashflow
     *  R: intrest rate  
     * @param CF
     * @param R
     * @param T
     * @return
    */
    static double calculateFVWithFixedCFAndR(double CF, double R, int T) {
        double PV = CF/R  * (1- 1/Math.pow(1+R,T));
        double FV = PV * Math.pow(1+R,T+1);
        return FV;
    }

    static double caculatePVWithChangedCF(double[] CFs, double R) {
        double PV = 0;
        for (int i=0; i < CFs.length; i++) {
            PV = PV + CFs[i] / Math.pow(1+R, i+1);
        }
        return PV;
    }

    static double caculateFVWithChangedCF(double[] CFs, double R, double initial) {
        double FV = initial;
        for (int i=0; i < CFs.length; i++) {
            FV = FV + CFs[i] * Math.pow(1+R, i+1);
        }
        return FV;
    }

    static double caculateEPR(double R, int n) {
        double EAR =  Math.pow(1 + R/n, n) - 1;
        return EAR;

    }
    static double caculateEPRContinuously (double R) {
        double EAR =  Math.pow(Math.E, R) - 1;
        return EAR;

    }
    public static void main(String[] args) {
        // calculatePVWithFixedCFAndR(CF, R, T);
        double[] CFs = {1.5, 1.3, 1.05, 0.9, 0.75};
        System.out.println(caculatePVWithChangedCF(CFs, 0.12));
        System.out.println(caculateEPRContinuously(0.0475));
    }
    
}
