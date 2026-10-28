package org.apache.log4j.helpers;

import androidx.collection.r2;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class BoundedFIFO {
    LoggingEvent[] buf;
    int maxSize;
    int numElements = 0;
    int first = 0;
    int next = 0;

    public BoundedFIFO(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException(r2.a("The maxSize argument (", i4, ") is not a positive integer."));
        }
        this.maxSize = i4;
        this.buf = new LoggingEvent[i4];
    }

    public LoggingEvent get() {
        int i4 = this.numElements;
        if (i4 == 0) {
            return null;
        }
        LoggingEvent[] loggingEventArr = this.buf;
        int i5 = this.first;
        LoggingEvent loggingEvent = loggingEventArr[i5];
        loggingEventArr[i5] = null;
        int i6 = i5 + 1;
        this.first = i6;
        if (i6 == this.maxSize) {
            this.first = 0;
        }
        this.numElements = i4 - 1;
        return loggingEvent;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public boolean isFull() {
        return this.numElements == this.maxSize;
    }

    public int length() {
        return this.numElements;
    }

    int min(int i4, int i5) {
        return i4 < i5 ? i4 : i5;
    }

    public void put(LoggingEvent loggingEvent) {
        int i4 = this.numElements;
        int i5 = this.maxSize;
        if (i4 != i5) {
            LoggingEvent[] loggingEventArr = this.buf;
            int i6 = this.next;
            loggingEventArr[i6] = loggingEvent;
            int i7 = i6 + 1;
            this.next = i7;
            if (i7 == i5) {
                this.next = 0;
            }
            this.numElements = i4 + 1;
        }
    }

    public synchronized void resize(int i4) {
        int i5;
        try {
            int i6 = this.maxSize;
            if (i4 == i6) {
                return;
            }
            LoggingEvent[] loggingEventArr = new LoggingEvent[i4];
            int min = min(min(i6 - this.first, i4), this.numElements);
            System.arraycopy(this.buf, this.first, loggingEventArr, 0, min);
            int i7 = this.numElements;
            if (min >= i7 || min >= i4) {
                i5 = 0;
            } else {
                i5 = min(i7 - min, i4 - min);
                System.arraycopy(this.buf, 0, loggingEventArr, min, i5);
            }
            this.buf = loggingEventArr;
            this.maxSize = i4;
            this.first = 0;
            int i10 = min + i5;
            this.numElements = i10;
            this.next = i10;
            if (i10 == i4) {
                this.next = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean wasEmpty() {
        return this.numElements == 1;
    }

    public boolean wasFull() {
        return this.numElements + 1 == this.maxSize;
    }
}
