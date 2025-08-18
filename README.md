# 🚀 Sorting & Searching Algorithms (Java)

## 📌 Project Overview
This repository contains explanations of the most commonly used **sorting and searching algorithms** in Java. Each algorithm is explained with:

- Its **logic / idea**
- **Time complexity** (Best, Average, Worst case)
- **Space complexity**
- Real-world **intuition** for better understanding

---

## 🔄 Sorting Algorithms  

### 1️⃣ Bubble Sort  
**Logic / Idea:**  
- Repeatedly compare adjacent elements and swap them if they are in the wrong order.  
- Largest element “bubbles up” to the end in each pass.  

**Complexity:**  
- Best Case: **O(n)** (already sorted)  
- Average Case: **O(n²)**  
- Worst Case: **O(n²)**  
- Space: **O(1)**  

---

### 2️⃣ Insertion Sort  
**Logic / Idea:**  
- Build a sorted portion of the array one element at a time.  
- Take the next element and insert it into its correct position in the sorted part.  

**Complexity:**  
- Best Case: **O(n)** (already sorted)  
- Average Case: **O(n²)**  
- Worst Case: **O(n²)**  
- Space: **O(1)**  

---

### 3️⃣ Selection Sort  
**Logic / Idea:**  
- Repeatedly find the minimum element from the unsorted part and place it at the beginning.  
- The sorted portion grows one element per iteration.  

**Complexity:**  
- Best Case: **O(n²)**  
- Average Case: **O(n²)**  
- Worst Case: **O(n²)**  
- Space: **O(1)**  

---

### 4️⃣ Merge Sort  
**Logic / Idea:**  
- Divide the array into halves until single elements remain.  
- Merge the halves back together in sorted order.  
- Based on the **Divide and Conquer** approach.  

**Complexity:**  
- Best Case: **O(n log n)**  
- Average Case: **O(n log n)**  
- Worst Case: **O(n log n)**  
- Space: **O(n)**  

---

### 5️⃣ Quick Sort  
**Logic / Idea:**  
- Select a **pivot** element.  
- Partition the array so elements smaller than pivot go left, larger go right.  
- Recursively sort partitions.  

**Complexity:**  
- Best Case: **O(n log n)**  
- Average Case: **O(n log n)**  
- Worst Case: **O(n²)** (bad pivot choice)  
- Space: **O(log n)** (recursive stack)  

---

## 🔍 Searching Algorithms  

### 1️⃣ Linear Search  
**Logic / Idea:**  
- Traverse the array element by element until the target is found or the list ends.  

**Complexity:**  
- Best Case: **O(1)**  
- Average Case: **O(n)**  
- Worst Case: **O(n)**  
- Space: **O(1)**  

---

### 2️⃣ Binary Search  
**Logic / Idea:**  
- Works only on **sorted arrays**.  
- Repeatedly divide the search interval into halves.  
- Compare target with middle element:  
  - If equal → Found  
  - If smaller → Search left half  
  - If larger → Search right half  

**Complexity:**  
- Best Case: **O(1)**  
- Average Case: **O(log n)**  
- Worst Case: **O(log n)**  
- Space: **O(1)** (iterative) or **O(log n)** (recursive)  

---

## 📊 Complexity Comparison Table  

| Algorithm       | Best Case | Average Case | Worst Case | Space    |
|-----------------|-----------|--------------|------------|----------|
| Bubble Sort     | O(n)      | O(n²)        | O(n²)      | O(1)     |
| Insertion Sort  | O(n)      | O(n²)        | O(n²)      | O(1)     |
| Selection Sort  | O(n²)     | O(n²)        | O(n²)      | O(1)     |
| Merge Sort      | O(n log n)| O(n log n)   | O(n log n) | O(n)     |
| Quick Sort      | O(n log n)| O(n log n)   | O(n²)      | O(log n) |
| Linear Search   | O(1)      | O(n)         | O(n)       | O(1)     |
| Binary Search   | O(1)      | O(log n)     | O(log n)   | O(1)/O(log n) |

---

## ✅ Conclusion  
This repository explains the **core sorting and searching algorithms** in Java with their complexities.  
Mastering these will help in **coding interviews, problem-solving, and real-world applications**.

---
