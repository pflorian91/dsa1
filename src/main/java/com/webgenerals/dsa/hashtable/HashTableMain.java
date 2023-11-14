package com.webgenerals.dsa.hashtable;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.webgenerals.dsa.hashtable.HashTable.*;

@Slf4j
public class HashTableMain {

	public static void main(String[] args) {

		HashTable myHashTable = new HashTable(4);

		myHashTable.set("paint", 20);
		myHashTable.set("bolts", 40);
		myHashTable.set("nails", 100);
		myHashTable.set("tile", 50);
		myHashTable.set("lumber", 80);

		myHashTable.set("paint2", 21);
		myHashTable.set("bolts3", 42);
		myHashTable.set("nails4", 103);
		myHashTable.set("tile5", 54);
		myHashTable.set("lumber6", 85);

		System.out.println( "Keys " + myHashTable.keys() );

		// duplicates

		System.out.println("Find Duplicates using hashmap");
		int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
		List<Integer> duplicates = HashTable.findDuplicates(nums);
		System.out.println(duplicates);

		// first non repeating char
		String valueForChar = "some-day-good-sir";
		Character character = firstNonRepeatingChar(valueForChar);
		log.debug("First non repeating char in `{}` is `{}`", valueForChar, character);

		log.debug("First non repeating char in `{}` is `{}`", "aabbcc", firstNonRepeatingChar("aabbcc"));

		// anagrams
		log.debug("Anagrams:");

		String[] stringsA1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
		log.debug("Anagrams for array {} is {}", stringsA1, groupAnagrams(stringsA1));

		String[] stringsA2 = {"abc", "cba", "bac", "foo", "bar"};
		log.debug("Anagrams for array {} is {}", stringsA2, groupAnagrams(stringsA2));

		String[] stringsA3 = {"listen", "silent", "triangle", "integral", "garden", "ranged"};
		log.debug("Anagrams for array {} is {}", stringsA3, groupAnagrams(stringsA3));

		// index of two sum
		log.debug("Indexes of two sum");
		log.debug("Given array for two sum {}, target {}, indexes {}", new int[]{2, 7, 11, 15}, 9, twoSum(new int[]{2, 7, 11, 15}, 9));
		log.debug("Given array for two sum {}, target {}, indexes {}", new int[]{3, 2, 4}, 6, twoSum(new int[]{3, 2, 4}, 6));
		log.debug("Given array for two sum {}, target {}, indexes {}", new int[]{3, 3}, 6, twoSum(new int[]{3, 3}, 6));

		// subarray sum
		log.debug("Subarray sum");

		int[] nums1 = {1, 2, 3, 4, 5};
		int target1 = 9;
		int[] result1 = subarraySum(nums1, target1);
		log.debug("Subarray sum for given `{}`, target `{}` is `{}`", nums1, target1, result1);

		int[] nums2 = {-1, 2, 3, -4, 5};
		int target2 = 0;
		int[] result2 = subarraySum(nums2, target2);
		log.debug("Subarray sum for given `{}`, target `{}` is `{}`", nums2, target2, result2);

		int[] nums3 = {2, 3, 4, 5, 6};
		int target3 = 3;
		int[] result3 = subarraySum(nums3, target3);
		log.debug("Subarray sum for given `{}`, target `{}` is `{}`", nums3, target3, result3);

		int[] nums4 = {};
		int target4 = 0;
		int[] result4 = subarraySum(nums4, target4);
		log.debug("Subarray sum for given `{}`, target `{}` is `{}`", nums4, target4, result4);


	}

}
