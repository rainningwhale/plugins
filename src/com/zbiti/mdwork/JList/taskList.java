package com.zbiti.mdwork.JList;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author hzh
 * @date 2023/12/11  10:44 AM
 */
public class  taskList extends JFrame {

    public static String FILE_NAME;
    public static DefaultListModel LIST_DLM = new DefaultListModel();    // 列表的数据
    public static String[] HEADERS;
    public static JList taskDataList = new JList();
    public  JScrollPane js;

    // 构造函数
    public taskList(String title) throws HeadlessException {
        super(title);
    }

    // 添加新的列表
    public static JList addTaskList(String content){
        LIST_DLM.addElement(content);
        taskDataList.setModel(LIST_DLM);
        return taskDataList;
    }

    // 批量新增原始数据
    public static DefaultListModel addTaskListAll(){
        List<String> list = new ArrayList();
        list.add("胡大帅");  //把 字符串 加入list集合中
        list.add("胡大帅12");  //把 字符串 加入list集合中
        list.add("胡大帅123");  //把 字符串 加入list集合中
        LIST_DLM.addElement("123");
        taskDataList.setModel(LIST_DLM);
        return LIST_DLM;

    }
}
