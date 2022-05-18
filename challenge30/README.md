# Hashtables

* Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.
* A hash is the ability to encode the key that will eventually map to a specific location in the data structure that we can look at directly to retrieve the value

## Challenge

* in this challenge i will to create many of functions inside hashTable Class that will do some process.

___

## Approach & Efficiency

* Big O notation for hashTable structure :
    1. Time : O(n). -> because there's linkedlist inside evrey buckets in hashTable
    2. Space: O(n).

___

## API

* Fuctions in the hashTable Class :
    1. set (K key, V value) :
        * in this functin i will to create set function that will accept key and value as a parameter to add these for hashTable structure
    2. contains (K key) :
        * in this function i will to create contains functinos that will accept key as a parameter then will return boolean valur if this key is exists inide hashTable or not
    3. keys ()
        * this will return all keys inside hashTable structure as a List.
    4. get(K key)
        * this functino that accept key as a parameter then will return the value for this key if it exists.

    5. hash(K key)
        * this functino that accept key as a parameter then will return the hash  for this key if it exists.

___
