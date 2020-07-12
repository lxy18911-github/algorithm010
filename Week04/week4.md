

### 深度优先搜索、广度优先搜索的实现和特性



```Java
// 深度优先 DFS with stack
if (root == null) return list;
Stack<TreeNode> stack = new Stack<>();
stack.push(root);
while (!stack.isEmpty()) {
  TreeNode node = stack.pop();
  if (node.right != null) stack.push(node.right);
  if (node.left != null) stack.push(node.left);
}
// 深度优先 DFS with recursion
void dfsWithRecursion(TreeNode root) {
  if (root == null) return;
  if (root.left != null) dfsWithRecursion(root.left, list);
  if (root.right != null) dfsWithRecursion(root.right, list);
}
```

```Java
// 广度优先 BFS
void bfsWithQueue(TreeNode root) {
  if (root == null) return;
  Queue<TreeNode> queue = new LinkedList<TreeNode>();
  queue.add(root);
  while (!queue.isEmpty()) {
    int count = queue.size();
    for (int i = 0; i < count; i++) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }
}
```



### 贪心算法

在每一步选择中都采取在当前状态下最好或最优(即最有 利)的选择，从而希望导致结果是全局最好或最优的算法。

贪心算法与动态规划的不同在于它**对每个子问题的解决方案都做出选择，不 能回退**。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。

贪心可以从前往后顺序贪心、从后向前逆序贪心、从某一个节点开始进行贪心



### 二分查找

```text
##二分查找的前提条件
1. 目标函数单调性(单调递增或者递减) 
2. 存在上下界(bounded)
3. 能够通过索引访问(index accessible)
```



```Java
// 返回目标元素在数组中的下标 没有返回-1
public int binarySearch(int[] array, int targetElement) {
        int leftIndex = 0, rightIndex = array.length - 1, middleIndex = (leftIndex + rightIndex) / 2;
        while (leftIndex <= rightIndex) {
            int middleElement = array[middleIndex];
            if (targetElement < middleElement) {
                rightIndex = middleIndex - 1;
            } else if (targetElement > middleElement) {
                leftIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }

            middleIndex = (leftIndex + rightIndex) / 2;
        }

        return -1;
    }
```





## 参考链接

- [DFS 代码模板（递归写法、非递归写法）](https://shimo.im/docs/UdY2UUKtliYXmk8t/)

  https://shimo.im/docs/UdY2UUKtliYXmk8t/

- [BFS 代码模板](https://shimo.im/docs/ZBghMEZWix0Lc2jQ/)

  https://shimo.im/docs/ZBghMEZWix0Lc2jQ/

## 实战题目

- [二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description)（字节跳动、亚马逊、微软在半年内面试中考过）

  https://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description

- [最小基因变化](https://leetcode-cn.com/problems/minimum-genetic-mutation/#/description)

  https://leetcode-cn.com/problems/minimum-genetic-mutation/#/description

- [括号生成](https://leetcode-cn.com/problems/generate-parentheses/#/description)（字节跳动、亚马逊、Facebook 在半年内面试中考过）

  https://leetcode-cn.com/problems/generate-parentheses/#/description

- [在每个树行中找最大值](https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/#/description)（微软、亚马逊、Facebook 在半年内面试中考过）

  https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/#/description

## 课后作业

- [单词接龙](https://leetcode-cn.com/problems/word-ladder/description/)（亚马逊在半年内面试常考）

  https://leetcode-cn.com/problems/word-ladder/description/

- [单词接龙 II ](https://leetcode-cn.com/problems/word-ladder-ii/description/)（微软、亚马逊、Facebook 在半年内面试中考过）

  https://leetcode-cn.com/problems/word-ladder-ii/description/

- [岛屿数量](https://leetcode-cn.com/problems/number-of-islands/)（近半年内，亚马逊在面试中考查此题达到 350 次）

  https://leetcode-cn.com/problems/number-of-islands/

- [扫雷游戏](https://leetcode-cn.com/problems/minesweeper/description/)（亚马逊、Facebook 在半年内面试中考过）

  https://leetcode-cn.com/problems/minesweeper/description/

