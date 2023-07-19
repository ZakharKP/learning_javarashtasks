package com.javarush.task.task37.task3701;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

public class Solution<T> extends ArrayList<T> {
	public static void main(String[] args) {
		Solution<Integer> list = new Solution<>();
		list.add(1);
		list.add(2);
		list.add(3);

		int count = 0;
		for (Integer i : list) {
			// 1 2 3 1 2 3 1 2 3 1
			System.out.print(i + " ");
			count++;
			if (count == 10) {
				break;
			}
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new RoundIterator();
	}

	public class RoundIterator implements Iterator<T> {
		int cursor; // index of next element to return
		int lastRet = -1; // index of last element returned; -1 if no such
		int expectedModCount = modCount;

		@Override
		public boolean hasNext() {
			return size() > 0;
		}

		@Override
		public T next() {
			checkForComodification();
			int i = cursor;
			if (i >= size())
				throw new NoSuchElementException();
			Object[] elementData = Solution.this.toArray();
			if (i >= elementData.length)
				throw new ConcurrentModificationException();
			cursor = i + 1;
			cursor = cursor == size() ? 0 : cursor;
			return (T) elementData[lastRet = i];
		}

		@Override
		public void remove() {
			if (lastRet < 0)
				throw new IllegalStateException();
			checkForComodification();

			try {
				Solution.this.remove(lastRet);
				cursor = lastRet;
				lastRet = -1;
				expectedModCount = modCount;
			} catch (IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}
		}

		@Override
		public void forEachRemaining(Consumer<? super T> action) {
			Objects.requireNonNull(action);
			final int size = size();
			int i = cursor;
			if (i < size) {
				final T[] es = (T[]) Solution.this.toArray();
				if (i >= es.length)
					throw new ConcurrentModificationException();
				for (; i < size && modCount == expectedModCount; i++)
					action.accept(es[i]);
				// update once at end to reduce heap write traffic
				cursor = i;
				lastRet = i - 1;
				checkForComodification();
			}
		}

		final void checkForComodification() {
			if (modCount != expectedModCount)
				throw new ConcurrentModificationException();
		}

	}
}
