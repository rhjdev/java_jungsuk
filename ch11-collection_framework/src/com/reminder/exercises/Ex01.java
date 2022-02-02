package com.reminder.exercises;

import java.util.ArrayList;

public class Ex01 {
	
	public static void main(String[] args) {
		ArrayList listA = new ArrayList();
		ArrayList listB = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listB.add(3);
		listB.add(4);
		listB.add(5);
		listB.add(6);
		
		kyo.addAll(listA);
		kyo.retainAll(listB);
		
		cha.addAll(listA);
		cha.removeAll(listB);
		
		hap.addAll(listA);
		hap.removeAll(kyo);
		hap.addAll(listB);
		
		System.out.println("listA="+listA);
		System.out.println("listB="+listB);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}

}
