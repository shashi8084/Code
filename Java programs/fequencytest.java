class fequencytest {
    public static void main(String[] args) {
        String text = "This is a test. This test is easy.";
        text = text.toLowerCase().replaceAll("[^a-z\\s]", ""); 
        String[] words = text.split("\\s+"); 

        
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        for (String word : words) {
            boolean found = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    counts[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        System.out.print("{ ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print("\"" + uniqueWords[i] + "\": " + counts[i]);
            if (i < uniqueCount - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}
