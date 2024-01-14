/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        if(root==null||root.left==null&&root.right == null) return 0;
         Map<Integer, List<Integer>> map = convertToGraph(root);
        Queue<Integer> queue = new LinkedList<>();
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        int time =-1;
         Set<Integer> visited = new HashSet<>();
        queue.add(start);
        while(!queue.isEmpty()){
            time++;
             System.out.println(queue.peek());
             for(int i =queue.size();i>0;i--){
                 int curr = queue.remove();
                 visited.add(curr);
                 
                if(map.containsKey(curr))
                for(Integer l:map.get(curr)){
                  
                  if(!visited.contains(l))  {System.out.println(l); queue.add(l);}
                }
             }
               
        }

       return time;
    }

     Map<Integer, List<Integer>> convertToGraph(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Map<Integer, List<Integer>> map = new HashMap<>();
        while(!queue.isEmpty()){
           
           TreeNode node = queue.remove();
           List<Integer> list = map.getOrDefault(node.val,new ArrayList<>());
           List<Integer> list1 =new ArrayList<Integer>();
            List<Integer> list2 =new ArrayList<Integer>();
            if(node.left!=null){
                  list.add(node.left.val);
                  map.put(node.val, list );
                          list1.add(node.val);
                           map.put(node.left.val,list1 );
                  queue.add(node.left);
            }

            if(node.right!=null){
                  list.add(node.right.val);
                  map.put(node.val,  list);
                        list2.add(node.val);
                        map.put(node.right.val,list2 );
                  queue.add(node.right);
            }

        }
        return map;

    }

    
}
