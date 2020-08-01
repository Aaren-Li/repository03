package com.collection.HumanManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Company{
    private List<Worker> workerList;//申明List集合对象
    Company()
    {
        this.workerList = new ArrayList<>();//实例化对象；
    }
    public void operate()//这个函数实现的功能是利用switch选择语句，选择不同的操作；
    {
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt() ;
        switch (op)
        {
            case 1:add();
                break;
            case 2:remove();
                break;
            case 3:display();
                break;
            case 4:qurryWorker();
                break;
            case 5:System.exit(0);
            default:
                System.out.println("您的操作有误，请重新选择；");//当选择有误时，重新调用该函数进行操作选择；
                operate();
        }
    }
    public void add() //增加员工
    {
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
        double empsalary=sc.nextDouble();
        Worker worker=new Worker(empname,empage,empsex,empid,empsalary);//实例化一个Worker对象；
        workerList.add(worker);//通过调用List的add()方法将当前对象加入集合；
        System.out.println("添加完成");
        System.out.println("继续操作请输入对应操作；");
        operate();//调用操作函数继续操作；
    }
    public void remove()//移除员工
    {
        Worker size[]=new Worker[workerList.size()];//定义一个和集合长度大小一样的对象数组；
        for(int i=0;i<size.length;i++)//将集合中的对象存入这个对象数组，便于遍历所有的对象并匹配将要删除的员工；
        {
            size[i]=workerList.get(i);
        }
        System.out.println("请输入将要删除的员工姓名");
        Scanner sc = new Scanner(System.in);
        String empname = sc.nextLine();
        for(int i=0;i<size.length;i++)//遍历所有的对象并匹配将要删除的员工；
        {
            if(empname.equals(size[i].getName()))//通过对象的姓名来匹配；
            {
                workerList.remove(i);//List集合的移除函数
                System.out.println("删除成功");
                System.out.println("继续操作请输入对应操作：");
                operate();//继续操作
            }
        }
        System.out.println("公司没有这个员工，是否继续操作（Y/N）");//遍历完整个对象数组也没有该员工；
        String respond = sc.nextLine();
        if(respond.equals("Y"))//是否继续操作（Yes/No）
        {
            System.out.println("请输入对应操作；");
            operate();
        }else{
            System.exit(0);//退出整个程序；
        }
    }
    public void display()//遍历员工；
    {
        if(workerList.size()==0)//判断当前是否有员工
        {
            System.out.println("当前没有员工；");
            System.out.println("继续操作请输入对应操作；");
            operate();
        }else {
            System.out.println("        -----姓名" + "  " + "   年龄" + "  " + "   性别" + "  " + "   工号" + "  " + "    薪资-----");
            for (int i = 0; i <workerList.size(); i++)//通过调用同toString（）函数获取员工属性；
            {
                System.out.println(workerList.get(i).toString());
            }
            System.out.println("继续操作请输入对应操作；");
            operate();
        }
    }
    public void qurryWorker()//查询员工
    {
        System.out.println("请输入您要查找的员工");
        Scanner sc=new Scanner(System.in);
        String workerName=sc.nextLine();
        if(workerList.size()==0)//判断当前是否有员工；
        {
            System.out.println("当前没有员工；");
            System.out.println("继续操作请输入对应操作；");
            operate();
        }else {
            for (int i = 0; i < workerList.size(); i++)//遍历并匹配员工；
            {
                if (workerName.equals(workerList.get(i).getName()))
                {
                    System.out.println("        -----姓名" + "  " + "   年龄" + "  " + "   性别" + "  " + "   工号" + "  " + "    薪资-----");
                    System.out.println(workerList.get(i).toString());
                    System.out.println("继续操作请输入对应操作；");
                    operate();
                }
            }
            System.out.println("您的输入有误，请返回重新输入");//输入员工不是该公司的，重新输入；
            qurryWorker();
        }

    }

}
