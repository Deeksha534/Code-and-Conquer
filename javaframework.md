# Java Collections Framework (JCF)

When you start programming in Java, the first tool you probably use to store multiple values is an **array**. Arrays are easy to understand—they hold a fixed number of elements of the same type, and you can access them using an index.

However, arrays have one major limitation: **their size is fixed once they are created**. If you need to store more elements than the array's capacity, you must create a new array, copy all the existing elements into it, and then add the new ones. This process is tedious, inefficient, and error-prone.

Arrays also do not provide built-in methods for common operations such as:
- Searching
- Sorting
- Inserting elements
- Removing elements

This is where the **Java Collections Framework (JCF)** becomes useful.

---

## What is the Java Collections Framework?

The **Java Collections Framework (JCF)** is a part of the `java.util` package that provides ready-to-use classes and interfaces for storing and manipulating groups of objects.

### Advantages

- Dynamic size (can grow or shrink)
- Built-in methods for common operations
- Better performance than manually managing arrays
- Consistent API across all collection classes
- Easy to learn and use

---

## Java Collections Framework Hierarchy

![Java Collection Framework](JAVA_FRAMEWORK.png)

---

# The Concept of a Framework

The Java Collections Framework is not just a random set of classes—it's an organized hierarchy.

At the top is the **Iterable** interface, which allows objects to be traversed using the enhanced **for-each loop**.

Next comes the **Collection** interface, which represents a group of objects and provides basic operations such as:

- `add()`
- `remove()`
- `contains()`
- `size()`
- `clear()`

The Collection interface is divided into three major branches:

- **List** → Ordered collection that allows duplicates.
- **Set** → Unordered collection that does not allow duplicates.
- **Queue** → Collection designed for processing elements in a specific order.

Apart from these, there is another important interface:

- **Map** → Stores data as **key-value pairs**. (Map is **not** a subtype of Collection.)

---

# List

A **List** is an ordered collection that:

- Maintains insertion order
- Allows duplicate elements
- Supports index-based access

### Common Implementations

### ArrayList
- Backed by a dynamic array
- Fast random access (`O(1)`)
- Slower insertion and deletion in the middle

### LinkedList
- Implemented using a doubly linked list
- Faster insertion and deletion
- Slower random access

### Vector
- Similar to ArrayList
- Thread-safe (synchronized)
- Considered legacy and rarely used in modern applications

---

# Set

A **Set** stores only **unique elements**.

It is commonly used for:

- Usernames
- IDs
- Unique values

### Common Implementations

### HashSet
- Uses hashing internally
- No guaranteed ordering
- Very fast insertion, deletion, and lookup

### LinkedHashSet
- Similar to HashSet
- Maintains insertion order

### TreeSet
- Stores elements in ascending sorted order
- Internally uses a Red-Black Tree
- Slower than HashSet but maintains sorting

---

# Map

Unlike other collection types, a **Map** stores data as **key-value pairs**.

Characteristics:

- Keys must be unique
- Values can be duplicated
- Provides very fast lookup using keys

### Common Implementations

### HashMap
- Fast lookups
- No ordering of keys

### LinkedHashMap
- Maintains insertion order

### TreeMap
- Stores keys in ascending sorted order
- Internally uses a Red-Black Tree

---

# Generics and Type Safety

One of the biggest advantages of the Collections Framework is **Generics**.

Generics provide:

- Compile-time type safety
- Better readability
- No manual type casting
- Prevention of inserting incorrect data types

### Example

```java
List<String> names = new ArrayList<>();

names.add("John");

// names.add(42); // Compile-time Error
```

---

# Collections Utility Class

The framework also provides a helper class called **Collections**.

It contains many useful static methods, such as:

- `sort()`
- `reverse()`
- `shuffle()`
- `min()`
- `max()`

### Example

```java
List<Integer> nums = Arrays.asList(3, 1, 4, 2);

Collections.sort(nums);
Collections.reverse(nums);
```

---

# Internal Working of Collections

### HashMap / HashSet
- Use **Hash Tables**
- Very fast insertion and lookup

### TreeMap / TreeSet
- Use **Red-Black Trees**
- Store elements in sorted order

### ArrayList
- Uses a **Resizable Array**
- Automatically increases capacity when needed

### LinkedList
- Uses a **Doubly Linked List**
- Each node stores:
  - Data
  - Reference to previous node
  - Reference to next node

---

# Summary

| Collection | Allows Duplicates | Maintains Order | Sorted |
|------------|-------------------|-----------------|--------|
| ArrayList | ✅ Yes | ✅ Yes | ❌ No |
| LinkedList | ✅ Yes | ✅ Yes | ❌ No |
| Vector | ✅ Yes | ✅ Yes | ❌ No |
| HashSet | ❌ No | ❌ No | ❌ No |
| LinkedHashSet | ❌ No | ✅ Yes | ❌ No |
| TreeSet | ❌ No | ✅ Yes | ✅ Yes |
| HashMap | Keys ❌ Values ✅ | ❌ No | ❌ No |
| LinkedHashMap | Keys ❌ Values ✅ | ✅ Yes | ❌ No |
| TreeMap | Keys ❌ Values ✅ | ✅ Yes | ✅ Yes |