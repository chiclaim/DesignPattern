package proxy.jdk;

// 政府部门处理落户(真实主题)
public class GovDepartment implements ISettle {
    @Override
    public void settle() {
        System.out.println("----落户----");
    }
}
