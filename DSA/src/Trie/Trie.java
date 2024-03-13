package Trie;

import Tree.simpleTree.TreeNode;

public class Trie {
    private TrieNode root;

    public Trie() { //time and space complexity O(1).
        root = new TrieNode();
        System.out.println("The trie has been created.");
    }

    public void insert(String word) { //time and space complexity O(M).
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            TrieNode node = current.child.get(ch);

            if (node == null) {
                node = new TrieNode();
                current.child.put(ch, node);
            }
            current = node;
        }

        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in trie.");
    }

    public boolean search(String word) {
        TrieNode currentNode = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            TrieNode node = currentNode.child.get(ch);

            if (node == null) {
                System.out.println("word: " + word + " does not exist.");
                return false;
            }
            currentNode = node;
        }

        if (currentNode.endOfString == true) {
            System.out.println("word: " + word + " exist in this trie.");
            return false;
        } else {
            System.out.println("word: " + word + " does not exits in this trie. But it's a prefix of another string or word.");
        }
        return currentNode.endOfString;
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.child.get(ch);
        boolean catThisNodeBeDeleted;

        if (currentNode.child.size() > 1) {
            delete(currentNode, word, index+1);
            return false;
        }
        return false;
    }
}
