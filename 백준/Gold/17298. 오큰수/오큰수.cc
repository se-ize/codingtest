#include <iostream>
#include <vector>
#include <stack>
using namespace std;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int N;
    cin >> N;
    vector<int> A(N, 0);
    vector<int> ans(N, 0);
    
    for(int i=0; i<N; i++){
        cin >> A[i];
    }
    
    stack<int> stack;
    stack.push(0);
    
    for(int i=0; i<N; i++){
        while(!stack.empty() && A[stack.top()] < A[i]) {
            ans[stack.top()] = A[i];
            stack.pop();
        }
        stack.push(i);
    }
    while(!stack.empty()){
        ans[stack.top()] = -1;
        stack.pop();
    }
    for(int i=0; i<N; i++){
        cout << ans[i] << " ";
    }
}