package org.generation.italy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		int[] arrayNumeri= {3,6,2,1};		//inizializzazione array con 4 elementi	(la dimensione rimane 4)
		
		
		ArrayList<Integer> al= new ArrayList<Integer>() {{	//ad ogni valore viene associato un indice che parte da 0. L'ordine di inserimento è garantito
			add(43);
			add(12);
			add(7);
			add(1);
			add(80);		
		}};
		
		
		System.out.println("\nValori ArrayList (ordine garantito)");
		//for (int i=0;i<al.size();i++)
		//	System.out.println(al.get(i));
		for (int n:al)
			System.out.println(n);
		
		
		//Ordinamento ArrayList (crescente)
		Collections.sort(al);
		System.out.println("\nValori ArrayList (ordinata in maniera crescente con Collections.sort)");		
		for (int n:al)
			System.out.println(n);
		
		
		//Ordinamento ArrayList (decrescente)
		Collections.sort(al, Comparator.reverseOrder());
		System.out.println("\nValori ArrayList (ordinata in maniera decrescente con Collections.sort(al, Comparator.reverseOrder())");		
		for (int n:al)
			System.out.println(n);
		
		
		HashSet<Integer> hs=new HashSet<Integer>();		//HashSet: insieme di valori non duplicati, non è mantenuto l'ordine di inserimento
		hs.add(43);
		hs.add(12);
		hs.add(7);
		hs.add(1);
		hs.add(80);
		
		System.out.println("\nValori HashSet (ordine non garantito)");
		for (int n:hs)
			System.out.println(n);
		
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();		//LinkedHashSet: insieme di valori non duplicati, mantiene l'ordine di inserimento
		lhs.add(43);
		lhs.add(12);
		lhs.add(7);
		lhs.add(1);
		lhs.add(80);
		
		System.out.println("\nValori LinkedHashSet (ordine di inserimento)");
		for (int n:lhs)
			System.out.println(n);
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();		//TreeSet: insieme di valori non duplicati, vengono ordinati in maniera naturale (crescente)
		ts.add(43);
		ts.add(12);
		ts.add(7);
		ts.add(1);
		ts.add(80);
	
		System.out.println("\nValori TreeSet (ordine crescente)");
		for (int n:ts)
			System.out.println(n);
		
		TreeSet<Integer> tsReverse=new TreeSet<Integer>(Comparator.reverseOrder());		//TreeSet (reverse): insieme di valori non duplicati, vengono ordinati in maniera decrescente
		tsReverse.add(43);
		tsReverse.add(12);
		tsReverse.add(7);
		tsReverse.add(1);
		tsReverse.add(80);
		
		System.out.println("\nValori TreeSet (reverse, ordine decrescente)");
		for (int n:tsReverse)
			System.out.println(n);
		
		
		HashMap<String, String> hm=new HashMap<String, String>()  {{		//coppie chiave/valore, ordine delle chiavi non garantito
			put("al","Alimenti");
			put("cs","Casalinghi");
			put("ig","Igiene personale");
			put("el","Materiali elettrici");			
		}};
		
		System.out.println("\nValori HashMap (ordine delle chiavi non garantito)");
		for (String key:hm.keySet())
			System.out.println("Cod: "+key+ "\t\tDescrizione: "+hm.get(key));
		
		
		
		LinkedHashMap<String, String> lhm=new LinkedHashMap<String, String>()  {{ //coppie chiave/valore, mantenuto ordine di inserimento delle chiavi 
			put("al","Alimenti");
			put("cs","Casalinghi");
			put("ig","Igiene personale");
			put("el","Materiali elettrici");			
		}};
		
		System.out.println("\nValori LinkedHashMap (ordine di inserimento))");
		for (String key:lhm.keySet())
			System.out.println("Cod: "+key+ "\t\tDescrizione: "+lhm.get(key));
		
		TreeMap<String, String> tm=new TreeMap<String, String>()  {{	//coppie chiave/valore, chiavi ordinate in maniera crescente
			put("al","Alimenti");
			put("cs","Casalinghi");
			put("ig","Igiene personale");
			put("el","Materiali elettrici");			
		}};
		
		System.out.println("\nValori TreeMap (chiavi ordinate in maniera crescente)");
		for (String key:tm.keySet())
			System.out.println("Cod: "+key+ "\t\tDescrizione: "+tm.get(key));
		
		TreeMap<String, String> tmReverse=new TreeMap<String, String>(Comparator.reverseOrder())  {{ //coppie chiave/valore, chiavi ordinate in maniera decrescente
			put("al","Alimenti");
			put("cs","Casalinghi");
			put("ig","Igiene personale");
			put("el","Materiali elettrici");			
		}};
		
		System.out.println("\nValori TreeMap reverse (chiavi ordinate in maniera decrescente)");
		for (String key:tmReverse.keySet())
			System.out.println("Cod: "+key+ "\t\tDescrizione: "+tmReverse.get(key));
		
		
		
	}

}
