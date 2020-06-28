## 泛型递归、树的递归

##### Java递归代码模板

```
public void recur(int level, int param) {
     // recursion terminator 递归终止条件
     if (level > MAX_LEVEL) { // process result
     		return; 
     }
     // process current logic 处理当前层逻辑
     process(level, param);
     // drill down 下到下一层
     recur( level: level + 1, newParam);
     // restore current status 清理当前层
}
```

##### 理解递归需要注意：

1.不要进行人肉递归

2.找到最近最简方法，将其拆解成可重复解决的问题

3.数学归纳法思维



## 分治、回溯

#### 分治

分而治之，把一个复杂的问题分解成很多规模较小的子问题，然后解决这些子问题，把解决的子问题合并起来，解决复杂问题。

#### 分治法的基本特征：

1.问题缩小到一定规模容易解决

2.分解成的子问题是相同种类的子问题，即该问题具有最优子结构性质

3.分解而成的小问题在解决之后要可以合并

4.子问题是相互独立的，即子问题之间没有公共的子问题

#### 回溯

选优搜索法，又称为试探法，按选优条件向前搜索，以达到目标。但当探索到某一步时，发现原先选择并不优或达不到目标，就退回一步重新选择，这种走不通就退回再走的技术为回溯法，而满足回溯条件的某个状态的点称为“回溯点”。



## 实战题目

- [爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/)（阿里巴巴、腾讯、字节跳动在半年内面试常考）

  https://leetcode-cn.com/problems/climbing-stairs/

- [括号生成](https://leetcode-cn.com/problems/generate-parentheses/) (字节跳动在半年内面试中考过)

  https://leetcode-cn.com/problems/generate-parentheses/

- [翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/description/) (谷歌、字节跳动、Facebook 在半年内面试中考过)

  https://leetcode-cn.com/problems/invert-binary-tree/description/

- [验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree)（亚马逊、微软、Facebook 在半年内面试中考过）

  https://leetcode-cn.com/problems/validate-binary-search-tree

- [二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree)（亚马逊、微软、字节跳动在半年内面试中考过）

  https://leetcode-cn.com/problems/maximum-depth-of-binary-tree

- [二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree)（Facebook、字节跳动、谷歌在半年内面试中考过）

  https://leetcode-cn.com/problems/minimum-depth-of-binary-tree

- [二叉树的序列化与反序列化](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/)（Facebook、亚马逊在半年内面试常考）

  https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree



## 课后作业

### 中等：

- [二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)（Facebook 在半年内面试常考）

  https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/

- [从前序与中序遍历序列构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)（字节跳动、亚马逊、微软在半年内面试中考过）

  https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

- [组合](https://leetcode-cn.com/problems/combinations/)（微软、亚马逊、谷歌在半年内面试中考过）

  https://leetcode-cn.com/problems/combinations/

- [全排列](https://leetcode-cn.com/problems/permutations/)（字节跳动在半年内面试常考）

  https://leetcode-cn.com/problems/permutations/

- [全排列 II ](https://leetcode-cn.com/problems/permutations-ii/)（亚马逊、字节跳动、Facebook 在半年内面试中考过）

  https://leetcode-cn.com/problems/permutations-ii/

## 下周预习

### 预习题目：

- [二叉树的层次遍历](http://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description)
- [分发饼干](http://leetcode-cn.com/problems/assign-cookies/description/)
- [买卖股票的最佳时机 II](http://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/)
- [跳跃游戏](http://leetcode-cn.com/problems/jump-game/)
- [x 的平方根](http://leetcode-cn.com/problems/sqrtx/)
- [有效的完全平方数](http://leetcode-cn.com/problems/valid-perfect-square/)

