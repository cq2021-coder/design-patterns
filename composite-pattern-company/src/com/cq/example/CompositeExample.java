package com.cq.example;

/**
 * 组合模式例
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public class CompositeExample {
    public static void main(String[] args) {
        //根节点，根上长出两个叶节点LeafA和LeafB
        Composite root = new Composite("root");
        root.add(new Leaf("LeafA"));
        root.add(new Leaf("LeafB"));

        //根上长出分支CompositeX，分支上长出LeafXA和LeafXB
        Composite composite = new Composite("Composite X");
        root.add(composite);
        composite.add(new Leaf("LeafXA"));
        composite.add(new Leaf("LeafXB"));

        //CompositeX长出分支CompositeXY，分支上长出LeafXYA和LeafXYB
        Composite compositeX = new Composite("Composite XY");
        composite.add(compositeX);
        compositeX.add(new Leaf("LeafXYA"));
        compositeX.add(new Leaf("LeafXYB"));

        root.add(new Leaf("LeafC"));
        Leaf leaf = new Leaf("LeafD");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
