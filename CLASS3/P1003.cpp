/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
long long arr[50]={0,1,};
long long fib(int N){
    if (N==0 || N==1)
        return arr[N];
    else if (arr[N]==0)
        arr[N]=fib(N-1)+fib(N-2);
    return arr[N];
}
int main(){
    int T;
    cin>>T;
    int tmp;
    for (int i=0;i<T;i++){
        cin>>tmp;
        if(tmp==0)
            cout<<"1 0"<<"\n";
        else
            cout << fib(tmp-1)<<' '<<fib(tmp)<<'\n';
    }
}