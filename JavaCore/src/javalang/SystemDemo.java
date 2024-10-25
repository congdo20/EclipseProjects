package javalang;

public class SystemDemo {
    public static void main(String[] args) {
        // Lấy và in ra các thuộc tính của hệ thống Java
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.class.version"));
        System.out.println(System.getProperty("java.specification.vendor"));
        System.out.println(System.getProperty("java.specification.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vm.name"));
    }
}
