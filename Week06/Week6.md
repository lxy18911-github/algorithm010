## 动态规划

​		动态规划算法与分治法类似,其基本思想也是将待求解问题分解成若干个子问题,先求解子问题,然后从这些子问题的解得到原问题的解。与分治法不同的是,适合于用动态规划求解的问题,经分解得到子问题往往不是互相独立的。若用分治法来解这类问题,则分解得到的子问题数目太多,有些子问题被重复计算了很多次。如果我们能够保存已解决的子问题的答案,而在需要时再找出已求得的答案,这样就可以避免大量的重复计算,节省时间。

​		动态规划是一种空间换时间的算法思想。

动态规划 和 递归或者分治 没有根本上的区别（关键看有无最优的子结构） 

**共性：找到重复子问题**

差异性：最优子结构、中途可以**淘汰**次优解





## 本周作业

### 中等

- [最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/)（亚马逊、高盛集团、谷歌在半年内面试中考过）

  https://leetcode-cn.com/problems/minimum-path-sum/

- [解码方法](https://leetcode-cn.com/problems/decode-ways)（亚马逊、Facebook、字节跳动在半年内面试中考过）

  https://leetcode-cn.com/problems/decode-ways

- [最大正方形](https://leetcode-cn.com/problems/maximal-square/)（华为、谷歌、字节跳动在半年内面试中考过）

- [任务调度器](https://leetcode-cn.com/problems/task-scheduler/)（Facebook 在半年内面试中常考）

- [回文子串](https://leetcode-cn.com/problems/palindromic-substrings/)（Facebook、苹果、字节跳动在半年内面试中考过）

### 困难

- [最长有效括号](https://leetcode-cn.com/problems/longest-valid-parentheses/)（字节跳动、亚马逊、微软在半年内面试中考过）
- [编辑距离](https://leetcode-cn.com/problems/edit-distance/)（字节跳动、亚马逊、谷歌在半年内面试中考过）
- [矩形区域不超过 K 的最大数值和](https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/)（谷歌在半年内面试中考过）
- [青蛙过河](https://leetcode-cn.com/problems/frog-jump/)（亚马逊、苹果、字节跳动在半年内面试中考过）
- [分割数组的最大值](https://leetcode-cn.com/problems/split-array-largest-sum)（谷歌、亚马逊、Facebook 在半年内面试中考过）
- [学生出勤记录 II ](https://leetcode-cn.com/problems/student-attendance-record-ii/)（谷歌在半年内面试中考过）
- [最小覆盖子串](https://leetcode-cn.com/problems/minimum-window-substring/)（Facebook 在半年内面试中常考）
- [戳气球](https://leetcode-cn.com/problems/burst-balloons/)（亚马逊在半年内面试中考过）

