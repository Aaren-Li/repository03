package com.shuzu.HumanManade;
import java.util.Scanner;
public class Test {
    static int count=0;
    static Worker worker[]=new Worker[100];
    public static void main(String[] args) {
	// write your code here

        System.out.println("-------可选用的操作-----------");
        System.out.println("-------1、增加员工------------");
        System.out.println("-------2、删除员工------------");
        System.out.println("-------3、查看所有员工信息-----");
        System.out.println("-------4、退出系统------------");
        System.out.println("请从以上选项中选择你的操作:");
        Op();
    }
    public static void Op()
    {
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt() ;
        switch (op)
        {
            case 1:Add();
                break;
            case 2:Remove();
                break;
            case 3:Display();
                break;
            case 4:System.exit(0);
            default:
                System.out.println("您的操作有误，请重新选择；");
        }
    }
    public static void Add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入即将加入公司的员工姓名：");
        String empname = sc.nextLine();
        System.out.println("请输入即将加入公司的员工性别：");
        String empsex = sc.nextLine();
        System.out.println("请输入即将加入公司的员工年龄：");
        int empage = sc.nextInt();
        System.out.println("请输入即将加入公司的员工工号：");
        int empid = sc.nextInt();
        System.out.println("请输入即将加入公司的员工薪资：");
        double empsalary = sc.nextDouble();
        worker[count++] = new Worker(empname,empage,empsex, empid, empsalary);
        System.out.println("添加完成");
        System.out.println("继续操作请输入对应操作；");
        Op();
    }
    public static void Remove()
    {
        System.out.println("请输入将要删除的员工姓名");
        Scanner sc = new Scanner(System.in);
        String empname = sc.nextLine();
        for(int i=0;i<count;i++)
        {
            if(empname.equals(worker[i].getName()))
            {
                for(int j=i;j<count-i;j++)
                {
                    worker[j]=worker[j+1];
                }
                count++;
                System.out.println("删除成功");
                System.out.println("继续操作请输入对应操作：");
                Op();
            }
        }
        System.out.println("公司没有这个员工，是否继续操作（Y/N）");
        String respond = sc.nextLine();
        if(respond.equals("Y"))
        {
            System.out.println("请输入对应操作；");
              Op();
        }else{
            System.exit(0);
        }
    }
public static void Display()
{
    if(worker[0]==null)
    {
        System.out.println("当前没有员工；");
        System.out.println("继续操作请输入对应操作；");
        Op();
    }else {
        System.out.println("姓名" + "  " + "性别" + "  " + "年龄" + "  " + "工号" + "  " + "薪资");
        for (int i = 0; i <count; i++) {
            System.out.println(worker[i].getName() + "  " + worker[i].getSex() + "  " + worker[i].age + "  " + worker[i].getId() + "  " + worker[i].getSalary());
        }
        System.out.println("继续操作请输入对应操作；");
        Op();
    }
}
}
