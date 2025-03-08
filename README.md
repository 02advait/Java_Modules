# Java_Modules

Here is the **README**-ready version of the information on **Type Casting in Java**:  

---

# **Type Casting in Java**  

## **What is Type Casting?**  
Type casting in Java means **converting one data type into another**. It is useful when you need to **store one type of value in another type of variable** (e.g., converting an `int` to a `double`).  

There are **two types** of type casting in Java:  
1. **Implicit Type Casting (Widening) – Automatic**  
2. **Explicit Type Casting (Narrowing) – Manual**  

---

## **1. Implicit Type Casting (Widening)**  
- ✅ **Happens automatically**  
- ✅ **No data loss**  
- ✅ **Smaller type → Larger type**  
- **Example:** `byte → short → int → long → float → double`  

```java
public class ImplicitCasting {
    public static void main(String[] args) {
        int num = 10;      // int type
        double d = num;    // Automatic conversion from int to double

        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);
    }
}
```
### **Output:**
```
Integer: 10
Double: 10.0
```

✅ `int` is automatically converted to `double` without losing data.  

---

## **2. Explicit Type Casting (Narrowing)**  
- ❌ **Not automatic** (Must be done manually using `(type)`)  
- ⚠️ **Data loss may happen**  
- ❌ **Larger type → Smaller type**  
- **Example:** `double → float → long → int → short → byte`  

```java
public class ExplicitCasting {
    public static void main(String[] args) {
        double d = 9.78;      // double type
        int num = (int) d;    // Manual conversion from double to int

        System.out.println("Double: " + d);
        System.out.println("Integer: " + num); // Decimal part is lost
    }
}
```
### **Output:**
```
Double: 9.78
Integer: 9
```
⚠️ `double` has a decimal part, but `int` **cannot store decimals**, so the decimal part is lost.  

---

## **3. Type Casting with Characters**
Characters (`char`) can be converted into numbers using type casting.  

```java
public class CharToInt {
    public static void main(String[] args) {
        char ch = 'A';   // Character 'A'
        int num = ch;    // Automatic conversion (char to int)

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + num);
    }
}
```
### **Output:**
```
Character: A
ASCII Value: 65
```
✅ The **ASCII value** of `'A'` is **65**, so Java converts `'A'` to `65` automatically.  

---

## **4. Type Casting with Boolean**
🚫 **Boolean (`true/false`) cannot be type cast** into numbers or other types in Java.  

```java
boolean flag = true;
int num = (int) flag; // ❌ ERROR - Java does not allow this
```
🚫 Unlike Python (`int(True) = 1`, `int(False) = 0`), Java **does not** support converting `boolean` to `int` directly.  

---

## **5. Type Casting Between Non-Compatible Types**
🚫 Java **does not allow** direct conversion between completely different types like `String → int` or `int → String`.  

### **Convert String to Integer**
```java
public class StringToInt {
    public static void main(String[] args) {
        String str = "100";
        int num = Integer.parseInt(str); // Converts String to int

        System.out.println("Converted Number: " + num);
    }
}
```
### **Output:**  
```
Converted Number: 100
```

### **Convert Integer to String**
```java
public class IntToString {
    public static void main(String[] args) {
        int num = 100;
        String str = String.valueOf(num); // Converts int to String

        System.out.println("Converted String: " + str);
    }
}
```
### **Output:**  
```
Converted String: 100
```

---

## **6. Difference Between Widening & Narrowing**
| Feature | Widening (Implicit) | Narrowing (Explicit) |
|---------|--------------------|--------------------|
| **Automatic?** | ✅ Yes | ❌ No (Manual) |
| **Data Loss?** | ❌ No | ✅ Yes (Possible) |
| **Conversion Direction** | Small → Big | Big → Small |
| **Example** | `int → double` | `double → int` |

---

## **7. Summary**
- ✅ **Type casting** means converting one data type to another.  
- ✅ **Widening (Implicit)** happens **automatically** (small → big).  
- ✅ **Narrowing (Explicit)** must be done **manually** using `(type)` (big → small).  
- ✅ **Data loss** can happen in **narrowing** conversions.  
- ✅ **Boolean** cannot be converted into numbers.  
- ✅ **String and number conversions** require special methods like `Integer.parseInt()`.  

---

This is formatted perfectly for **GitHub README**! 🚀 Let me know if you need any modifications. 😊
