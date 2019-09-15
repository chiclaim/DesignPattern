package proxy;

// 政府工商部门
public class GovDepartment implements IBusiness {
    @Override
    public void registerCompany() {
        System.out.println("----注册公司----");
    }
}
