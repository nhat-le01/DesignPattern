public class RoachMotel {

    private static RoachMotel roachMotel;

    private RoachMotel(){}

    public static RoachMotel getInstance(){
        if(roachMotel == null) {
            roachMotel = new RoachMotel();
        }
        return roachMotel;
    }
}

