package de.greenrobot.dao.internal;

import androidx.paging.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.DaoLog;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class LongHashMap<T> {
    private int capacity;
    private int size;
    private Entry<T>[] table;
    private int threshold;

    static final class Entry<T> {
        final long key;
        Entry<T> next;
        T value;

        Entry(long j4, T t4, Entry<T> entry) {
            this.key = j4;
            this.value = t4;
            this.next = entry;
        }
    }

    public LongHashMap() {
        this(16);
    }

    public void clear() {
        this.size = 0;
        Arrays.fill(this.table, (Object) null);
    }

    public boolean containsKey(long j4) {
        for (Entry<T> entry = this.table[((((int) (j4 >>> 32)) ^ ((int) j4)) & Integer.MAX_VALUE) % this.capacity]; entry != null; entry = entry.next) {
            if (entry.key == j4) {
                return true;
            }
        }
        return false;
    }

    public T get(long j4) {
        for (Entry<T> entry = this.table[((((int) (j4 >>> 32)) ^ ((int) j4)) & Integer.MAX_VALUE) % this.capacity]; entry != null; entry = entry.next) {
            if (entry.key == j4) {
                return entry.value;
            }
        }
        return null;
    }

    public void logStats() {
        int i4 = 0;
        for (Entry<T> entry : this.table) {
            while (entry != null) {
                entry = entry.next;
                if (entry != null) {
                    i4++;
                }
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("忠\u0001"));
        sb.append(this.size / this.capacity);
        sb.append(ProtectedSandApp.s("忡\u0001"));
        sb.append(this.size);
        sb.append(ProtectedSandApp.s("忢\u0001"));
        l.a(sb, this.capacity, ProtectedSandApp.s("忣\u0001"), i4, ProtectedSandApp.s("忤\u0001"));
        sb.append(i4 / this.size);
        DaoLog.d(sb.toString());
    }

    public T put(long j4, T t4) {
        int i4 = ((((int) (j4 >>> 32)) ^ ((int) j4)) & Integer.MAX_VALUE) % this.capacity;
        Entry<T> entry = this.table[i4];
        for (Entry<T> entry2 = entry; entry2 != null; entry2 = entry2.next) {
            if (entry2.key == j4) {
                T t5 = entry2.value;
                entry2.value = t4;
                return t5;
            }
        }
        this.table[i4] = new Entry<>(j4, t4, entry);
        int i5 = this.size + 1;
        this.size = i5;
        if (i5 <= this.threshold) {
            return null;
        }
        setCapacity(this.capacity * 2);
        return null;
    }

    public T remove(long j4) {
        int i4 = ((((int) (j4 >>> 32)) ^ ((int) j4)) & Integer.MAX_VALUE) % this.capacity;
        Entry<T> entry = this.table[i4];
        Entry<T> entry2 = null;
        while (entry != null) {
            Entry<T> entry3 = entry.next;
            if (entry.key == j4) {
                if (entry2 == null) {
                    this.table[i4] = entry3;
                } else {
                    entry2.next = entry3;
                }
                this.size--;
                return entry.value;
            }
            entry2 = entry;
            entry = entry3;
        }
        return null;
    }

    public void reserveRoom(int i4) {
        setCapacity((i4 * 5) / 3);
    }

    public void setCapacity(int i4) {
        Entry<T>[] entryArr = new Entry[i4];
        int length = this.table.length;
        for (int i5 = 0; i5 < length; i5++) {
            Entry<T> entry = this.table[i5];
            while (entry != null) {
                long j4 = entry.key;
                int i6 = ((((int) j4) ^ ((int) (j4 >>> 32))) & Integer.MAX_VALUE) % i4;
                Entry<T> entry2 = entry.next;
                entry.next = entryArr[i6];
                entryArr[i6] = entry;
                entry = entry2;
            }
        }
        this.table = entryArr;
        this.capacity = i4;
        this.threshold = (i4 * 4) / 3;
    }

    public int size() {
        return this.size;
    }

    public LongHashMap(int i4) {
        this.capacity = i4;
        this.threshold = (i4 * 4) / 3;
        this.table = new Entry[i4];
    }
}
