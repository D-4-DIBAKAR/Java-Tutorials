## Key Java String Methods:
toUpperCase(): Converts the entire string to uppercase.

Example: "hello".toUpperCase() → "HELLO"
toLowerCase(): Converts the entire string to lowercase.

Example: "HELLO".toLowerCase() → "hello"
trim(): Removes leading and trailing whitespace from the string.

Example: " hello ".trim() → "hello"
replace(target, replacement): Replaces all occurrences of the target string with the replacement string.

Example: "apple".replace("p", "b") → "abble"
contains(sequence): Checks if the string contains the specified sequence of characters.

Example: "hello".contains("ell") → true
startsWith(prefix): Checks if the string starts with the specified prefix.

Example: "hello".startsWith("he") → true
endsWith(suffix): Checks if the string ends with the specified suffix.

Example: "hello".endsWith("lo") → true
isEmpty(): Returns true if the string is empty (""), otherwise false.

Example: "".isEmpty() → true
isBlank(): Returns true if the string is blank (contains only spaces or is empty), otherwise false.

Example: " ".isBlank() → true
indexOf(char): Returns the index of the first occurrence of the specified character.

Example: "hello".indexOf('l') → 2
lastIndexOf(char): Returns the index of the last occurrence of the specified character.

Example: "hello".lastIndexOf('l') → 3
valueOf(value): Converts a given primitive value to a string.

Example: String.valueOf(10) → "10"
String.format(): Creates a formatted string with specified placeholders.

Example: String.format("Name: %s, Age: %d", "Dev", 22) → "Name: Dev, Age: 22"
substring(start) and substring(start, end): Extracts a portion of the string from the specified start index to the end index.

Example: "hello".substring(1, 4) → "ell"
Important Notes:
String Comparison: Use .equals() for comparing content, and == for comparing references (memory addresses).
String Methods: Many string methods are immutable, meaning they do not change the original string, but return a new one.