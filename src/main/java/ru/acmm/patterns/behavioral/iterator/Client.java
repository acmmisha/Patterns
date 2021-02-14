/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author tmv
 */
public class Client {

    private static class MyCollection implements Iterable<Number> {

        @Override
        public Iterator<Number> iterator() {
            return new Iterator<Number>() {
                @Override
                public boolean hasNext() {
                    return true;
                }

                @Override
                public Number next() {
                    return new Number() {
                        @Override
                        public int intValue() {
                            return 1;
                        }

                        @Override
                        public long longValue() {
                            return 1l;
                        }

                        @Override
                        public float floatValue() {
                            return 1f;
                        }

                        @Override
                        public double doubleValue() {
                            return 1.0;
                        }

                        @Override
                        public String toString() {
                            return "" + 1.0;
                        }
                        
                    };
                }
            };
        }

        @Override
        public void forEach(Consumer<? super Number> action) {
            Iterable.super.forEach(action);
        }

    }

    public static void main(String[] args) {
        MyCollection col = new MyCollection();
        System.out.println(col.iterator().next());
    }
}
