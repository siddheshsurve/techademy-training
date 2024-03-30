interface ItService{
    public void getItService();
}
class BaseCompany implements ItService {
    void getBaseCompanyDetails() {
        System.out.println("Base company details");
    }

    public void getItService() {
        System.out.println("It Services provided");
    }
}

class ChildCompany extends BaseCompany {

}

class LocalCompany extends ChildCompany{

}

class SharedCompany extends BaseCompany {

}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        LocalCompany lc = new LocalCompany();
        lc.getBaseCompanyDetails();
        SharedCompany sc = new SharedCompany();
        sc.getBaseCompanyDetails();
    }
}
