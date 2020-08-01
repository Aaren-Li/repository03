package com.collection.HumanManage;

public class Test {

    public static void main(String[] args) {
        System.out.println("-------可选用的操作-----------");
        System.out.println("-------1、增加员工------------");
        System.out.println("-------2、删除员工------------");
        System.out.println("-------3、查看所有员工信息-----");
        System.out.println("-------4、查询员工信息---------");
        System.out.println("-------5、退出系统------------");
        System.out.println("请从以上选项中选择你的操作:");
        Company company = new Company();
        company.operate();
    }
}
//这个控制类主要是一个界面管理；并实例化了一个公司类；通过公司类对员工的增、删、查进行操作；
