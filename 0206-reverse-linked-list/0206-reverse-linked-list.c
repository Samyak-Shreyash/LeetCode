/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
    struct ListNode* temp=head;
    struct ListNode* pre_add=NULL;
    struct ListNode* next_add=NULL;
    
    
    while(temp!=NULL)
    {   
        // printf("Temp-Value %d\n",temp->val);
        // printf("Begin\tPre-Temp --> %x\t",pre_add);
        // printf("Temp --> %x\t",temp);
        // printf("Temp-Next --> %x\t",temp->next);
        // printf("Next-Addr --> %x\n",next_add);
        next_add=temp->next;
        temp->next=pre_add;
        pre_add=temp;      
        // printf("Temp-Value %d\n",temp->val);
        // printf("After\tPre-Temp --> %x\t",pre_add);
        // printf("Temp --> %x\t",temp);
        // printf("Temp-Next --> %x \t",temp->next);
        // printf("Next-Addr --> %x\n",next_add);
        temp=next_add;
     //    printf("Temp-Value %d\n",temp->val);
     // printf("End\tPre-Temp --> %x\t",pre_add);
     //    printf("Temp --> %x\t",temp);
     //    printf("Temp-Next --> %x\t",temp->next);
     //    printf("Next-Addr --> %x\n",next_add);
    }
    // printf("%d ",pre_add->val);
    head=pre_add;
    // printf("%d ",head->val);
    return head;
}

