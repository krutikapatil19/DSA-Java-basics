# Hashing

Hashing is a smart technique to find or store data quickly — especially when you're working with large or similar types of data.
Imagine you're in a library with millions of books, and you want to find your book in just 1 second instead of searching shelf by shelf.
That's what hashing helps with — super fast searching, almost in O(1) time!

## The idea behind it

You take a value (like a name or number) → call it a key.
You apply a hash function to convert this key into a number.
This number becomes an index of an array where your data will be stored.

## Why use Hashing?

Fast access to data → No need to search through the whole array.
Keys can be very large, so we convert them to a smaller index using a hash function.


