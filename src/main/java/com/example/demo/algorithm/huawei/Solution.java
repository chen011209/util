package com.example.demo.algorithm.huawei;
import java.util.*;
class Solution {
	static void pathToResult(LinkedList<Integer> path,int n,int k,List<Integer> result){
		if(path.size() == n -1){
			if(path.getLast() - k >=0){
				int tmp = 0;
				for (int j = 0; j < path.size(); j++) {
					tmp+= path.get(j);
					tmp*=10;
				}
				tmp += path.getLast();
				tmp -= k;
				result.add(tmp);
			}
			if(k==0)
				return;

			if(path.getLast() + k <=9){
				int tmp = 0;
				for (int j = 0; j < path.size(); j++) {
					tmp+= path.get(j);
					tmp*=10;
				}
				tmp += path.getLast();
				tmp += k;
				result.add(tmp);
			}
			return;
		}

		if(path.getLast() - k >=0){
			path.add(path.getLast() - k);
			pathToResult(path,n,k,result);
			path.removeLast();
		}
		if(path.getLast() + k <=9){
			path.add(path.getLast() + k);
			pathToResult(path,n,k,result);
			path.removeLast();
		}

	}

	 static List<Integer> method(int n,int k){
		List<Integer> result = new ArrayList<>();
		LinkedList<Integer> path = new LinkedList<>();
		for (int i = 1; i <= 9; i++) {
			path.add(i);
			pathToResult(path,n,k,result);
			path.removeLast();

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(2,2));
	}
}