package edu.grinnell.csc207.util;

import java.util.Iterator;
import java.util.function.BiConsumer;

/**
 * A simple version of the Map interface (more or less).
 */
public interface SimpleMap<K,V> {
  /**
   * Set the value associated with key.
   * 
   * @param key
   *   The key to use.
   * @param value
   *   The associated value.
   *
   * @return the previous value associated with key (or null, if there's no
   *         such value)
   *         
   * @throws NullPointerException if the key is null.
   */
  public V set(K key, V value);
  
  /**
   * Get the value associated with key.
   * 
   * @param key
   *   The key to use.
   *
   * @return the corresponding value.
   *
   * @throws IndexOutOfBoundsException if the key is not in the map.
   * @throws NullPointerException if the key is null.
   */
  public V get(K key);
  
  /**
   * Determine how many key/value pairs are in the map.
   *
   * @return the number of key/value pairs.
   */
  public int size();
  
  /**
   * Determine if a key appears in the table.
   *
   * @param key
   *   The key to check.
   *
   * @return true if the key appears in the table and false otherwise.
   */
  public boolean containsKey(K key);
  
  /**
   * Remove the value with the given key. Also remove the key.
   *
   * @param key
   *   The key to remove.
   * 
   * @return The associated value (or null, if there is no associated value).
   * @throws NullPointerException if the key is null.
   */
  public V remove(K key);
  
  /**
   * Get an iterator for all of the keys in the map.
   *
   * @return an iterator for all the keys.
   */
  public Iterator<K> keys();
  
  /**
   * Get an iterator for all of the values in the map.
   *
   * @return an iterator for all the values.
   */
  public Iterator<V> values();
  
  /**
   * Apply a procedure to each key/value pair.
   *
   * @param action
   *   The action to perform for each key/value pair.
   */
  public void forEach(BiConsumer<? super K, ? super V> action);
  
} // SimpleMap
