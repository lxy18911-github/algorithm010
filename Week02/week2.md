### 哈希表、映射、集合

哈希表(Hash table)，也叫散列表，是根据关键码值(Key value)而直接进行访问的数据结构。 它通过把关键码值映射到表中一个位置来访问记录，以加快查找的 速度。

这个映射函数叫作散列函数(Hash Function)，存放记录的数组 叫作哈希表(或散列表)。

```
Map:key-value对，key不重复
- new HashMap() / new TreeMap() - map.set(key, value)
- map.get(key)
- map.has(key)
- map.size()
- map.clear()
HashMap, 
Hashtable, 
ConcurrentHashMap
---------------------------------------------------
Set:不重复元素的集合
- new HashSet() / new TreeSet() - set.add(value)
- set.delete(value)
- set.hash(value)
TreeSet, 
HashSet,
ConcurrentSkipListSet, 
CopyOnWriteArraySet, 
EnumSet, 
JobState Reasons, 
LinkedHashSet
```



### 树、二叉树、二叉搜索树

```Java
//Java下树节点定义
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
```

##### 二叉树的遍历

1.前序(Pre-order):根-左-右 

2.中序(In-order):左-根-右 

3.后序(Post-order):左-右-根

##### 二叉搜索树 Binary Search Tree

也称有序二叉树(Ordered Binary Tree)、 排序二叉树(Sorted Binary Tree)，是指一棵空树或者具有下列性质的二叉树:

1. 左子树上所有结点的值均小于它的根结点的值;

2. 右子树上所有结点的值均大于它的根结点的值;
3. 以此类推:左、右子树也分别为二叉查找树。 

### 堆和二叉堆、图

​	Heap：可以迅速找到一堆数中的最大或者最小值的数据结构

​	其中根节点最大的堆叫做大顶堆或大根堆，根节点最小的堆叫做小顶堆或小根堆。	 				 		 		 		 		 		 		 		 		 	







### 简单：

- 写一个关于 HashMap 的小总结。
  说明：对于不熟悉 Java 语言的同学，此项作业可选做。

- [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/description/)（亚马逊、Facebook、谷歌在半年内面试中考过）

  https://leetcode-cn.com/problems/valid-anagram/description

- [两数之和](https://leetcode-cn.com/problems/two-sum/description/)（近半年内，亚马逊考查此题达到 216 次、字节跳动 147 次、谷歌 104 次，Facebook、苹果、微软、腾讯也在近半年内面试常考）

  https://leetcode-cn.com/problems/two-sum/description/

- [N 叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/)（亚马逊在半年内面试中考过）

  https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description

- HeapSort ：自学 https://www.geeksforgeeks.org/heap-sort/

### 中等：

- [字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/)（亚马逊在半年内面试中常考）
- [二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)（亚马逊、字节跳动、微软在半年内面试中考过）
- [二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)（字节跳动、谷歌、腾讯在半年内面试中考过）
- [N 叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/)（亚马逊在半年内面试中考过）
- [丑数](https://leetcode-cn.com/problems/chou-shu-lcof/)（字节跳动在半年内面试中考过）
- [前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/)（亚马逊在半年内面试中常考）