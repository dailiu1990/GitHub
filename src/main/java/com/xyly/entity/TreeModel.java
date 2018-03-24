package com.xyly.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TreeModel {

    private List<Menu> childNodes=new ArrayList<>();

    public List<Menu> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Menu> childNodes) {
        this.childNodes = childNodes;
    }




    /***
     * 以level==1的节点作为开始节点构建树结构
     * @param nodes
     * @return
     */
    public static List<Menu> buildTree(List<Menu> nodes){
        if (isEmpty(nodes)){
            return null;
        }
        List<Menu> firstLevels=nodes.stream().filter(node->!node.getDisabled()
                && node.getParentid()==1).collect(Collectors.toList());
        sortByOrder(firstLevels);
        firstLevels.stream().forEach(node-> setChildren(node,nodes));
        return firstLevels;
    }

    public static int getLevel(String path) {
        if(path==null){
            return 1;
        }
        return path.split(",").length;
    }

    private static void sortByOrder(List<Menu> firstLevels) {
        firstLevels.sort((node1,node2)->node1.getOrder().compareTo(node2.getOrder()));
    }

    private static  void setChildren(Menu currentNode, List<Menu> nodeList){
        List<Menu> childrens=nodeList.stream().filter(node->(!node.getDisabled() &&
                node.getParentid().equals(currentNode.getId())))
                .collect(Collectors.toList());
        currentNode.setChildNodes(childrens);
        if (isEmpty(childrens)){
            return;
        }
        sortByOrder(childrens);
        childrens.stream().forEach(node-> setChildren(node,nodeList));

    }

    /***
     * 按数结构给节点排序
     * @param nodes
     */
    public static void sortByTree(List<Menu> nodes) {
        if(isEmpty(nodes)){
            return;
        }

        sortByOrder(nodes);
        nodes.sort((o1, o2) -> (String.valueOf(o1.getOrder())).compareTo(String.valueOf(o2.getOrder())));
    }

    private static boolean isEmpty(List nodes) {
        return nodes == null || nodes.isEmpty();
    }

    //按节点的父子层次顺序展示
    private static void printTreeToConsole(List<Menu> nodes){
        if (isEmpty(nodes)){
            return;
        }
        sortByTree(nodes);
        nodes.stream().forEach(node->{
            if(node.getDisabled()){
                return;
            }
        });
    }

    //以第一层为起点，递归方式展示父子层次树
    private static void printFirstLevelTreeToConsole(List<Menu> nodes){
        if (isEmpty(nodes)){
            return;
        }
        nodes.forEach(item->{
            if(item.getDisabled()){
                return;
            }
            printFirstLevelTreeToConsole(item.getChildNodes());
        });
    }

    public Menu newChildNode(int parentId, String label, int order){
        Menu node=new Menu();
        node.setParentid(parentId);
       // node.setId(nodeId);
        node.setOrder(order);
        node.setLabel(label);
        return node;
    }



}
