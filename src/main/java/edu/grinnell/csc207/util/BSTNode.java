package edu.grinnell.csc207.util;

/**
 * Nodes in a binary search tree.
 *
 * @author Samuel A. Rebelsky
 *
 * @param <K>
 *   The type of keys.
 * @param <V>
 *   The type of values.
 */
class BSTNode<K, V> {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The key.  May not be null.
   */
  K key;

  /**
   * The associated value.
   */
  V value;

  /**
   * The left subtree.
   */
  BSTNode<K, V> left;

  /**
   * The right subtree.
   */
  BSTNode<K, V> right;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new node with no children.
   *
   * @param k
   *   The key in the node.
   * @param v
   *   The value in the ndoe.
   */
  public BSTNode(K k, V v) {
    this.key = k;
    this.value = v;
    this.left = null;
    this.right = null;
  } // BSTNode(K, V)

} // class BSTNode<K, V>
