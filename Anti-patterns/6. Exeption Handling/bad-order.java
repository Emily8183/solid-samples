// **BAD**

try {
    processOrder();
} catch(Exception e) {
    <!-- Silent catch or just e.printStackTrace() -->
}
