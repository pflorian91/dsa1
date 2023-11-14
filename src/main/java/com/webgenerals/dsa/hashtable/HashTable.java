package com.webgenerals.dsa.hashtable;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
public class HashTable {

	private final Node[] dataMap;

	@ToString
	class Node {
		String key;
		int value;
		Node next;

		Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public HashTable(int size) {
		dataMap = new Node[size];
	}

	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + ":");
			Node temp = dataMap[i];
			while (temp != null) {
				System.out.println("   {" + temp.key + "= " + temp.value + "}");
				temp = temp.next;
			}
		}
	}

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for (int i = 0; i < keyChars.length; i++) {
			int asciiValue = keyChars[i];
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}

	public void set(String key, int value) {
		int index = hash(key);

		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			if (temp.key == key) {
				temp.value += value;
				return;
			}

			while (temp.next != null) {
				temp = temp.next;
				if (temp.key == key) {
					temp.value += value;
					return;
				}
			}

			temp.next = newNode;
		}

	}

	public int get(String key) {
		int index = hash(key);

		Node temp = dataMap[index];
		while (temp != null) {
			if (temp.key == key) return temp.value;
			temp = temp.next;
		}

		return 0;
	}

	public ArrayList keys() {
		ArrayList<String> allKeys = new ArrayList<>();

		for (int i = 0; i < dataMap.length; i++) {
			Node temp = dataMap[i];

			while (temp != null) {
				allKeys.add(temp.key);
				temp = temp.next;
			}
		}

		return allKeys;
	}

	public static List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> numCounts = new HashMap<>();

		for (int num : nums) {
			numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
		}

		List<Integer> duplicates = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}

		return duplicates;
	}


	public static Character firstNonRepeatingChar(String value) {
		Map<Character, Integer> charCounts = new HashMap<>();

		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if (charCounts.get(c) == 1) {
				return c;
			}
		}

		return null;
	}

	public static List<List<String>> groupAnagrams(String[] strings) {
		Map<String, List<String>> anagramGroups = new HashMap<>();

		for (String string : strings) {
			char[] chars = string.toCharArray();
			Arrays.sort(chars);
			String canonical = new String(chars);

			if (anagramGroups.containsKey(canonical)) {
				anagramGroups.get(canonical).add(string);
			} else {
				List<String> group = new ArrayList<>();
				group.add(string);
				anagramGroups.put(canonical, group);
			}
		}

		return new ArrayList<>(anagramGroups.values());
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int complement = target - num;

			if (numMap.containsKey(complement)) {
				return new int[]{numMap.get(complement), i};
			}
			numMap.put(num, i);
		}

		return new int[]{};
	}

	public static int[] subarraySum(int[] nums, int target) {
		Map<Integer, Integer> sumIndex = new HashMap<>();
		sumIndex.put(0, -1);
		int currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];

			if (sumIndex.containsKey(currentSum - target)) {
				return new int[]{sumIndex.get(currentSum - target) + 1, i};
			}

			sumIndex.put(currentSum, i);
		}

		return new int[]{};
	}

	public static boolean hasUniqueChars(String string) {
		Set<Character> charSet = new HashSet<>();

		for (char ch : string.toCharArray()) {
			if (charSet.contains(ch)) {
				return false;
			}
			charSet.add(ch);
		}

		return true;
	}

}
