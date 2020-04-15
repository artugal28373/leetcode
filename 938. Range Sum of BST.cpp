/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int rangeSumBST(TreeNode* root, int L, int R) {
        if(root == NULL ) return 0;
        int add = rangeSumBST(root->left, L, R) + rangeSumBST( root->right, L, R);
        add = add + ( L <= root->val && R >= root->val ? root->val : 0 );
        return add;
    }
};
