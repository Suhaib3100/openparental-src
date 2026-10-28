package org.apache.log4j.helpers;

import androidx.constraintlayout.solver.f;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes5.dex */
public class BoundedFIFO {
    LoggingEvent[] buf;
    int maxSize;
    int numElements = 0;
    int first = 0;
    int next = 0;

    public BoundedFIFO(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(f.a("The maxSize argument (", i5, ") is not a positive integer."));
        }
        this.maxSize = i5;
        this.buf = new LoggingEvent[i5];
    }

    public LoggingEvent get() {
        int i5 = this.numElements;
        if (i5 == 0) {
            return null;
        }
        LoggingEvent[] loggingEventArr = this.buf;
        int i6 = this.first;
        LoggingEvent loggingEvent = loggingEventArr[i6];
        loggingEventArr[i6] = null;
        int i7 = i6 + 1;
        this.first = i7;
        if (i7 == this.maxSize) {
            this.first = 0;
        }
        this.numElements = i5 - 1;
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

    int min(int i5, int i6) {
        return i5 < i6 ? i5 : i6;
    }

    public void put(LoggingEvent loggingEvent) {
        int i5 = this.numElements;
        int i6 = this.maxSize;
        if (i5 != i6) {
            LoggingEvent[] loggingEventArr = this.buf;
            int i7 = this.next;
            loggingEventArr[i7] = loggingEvent;
            int i8 = i7 + 1;
            this.next = i8;
            if (i8 == i6) {
                this.next = 0;
            }
            this.numElements = i5 + 1;
        }
    }

    public synchronized void resize(int i5) {
        int i6;
        int i7 = this.maxSize;
        if (i5 == i7) {
            return;
        }
        LoggingEvent[] loggingEventArr = new LoggingEvent[i5];
        int min = min(min(i7 - this.first, i5), this.numElements);
        System.arraycopy(this.buf, this.first, loggingEventArr, 0, min);
        int i8 = this.numElements;
        if (min >= i8 || min >= i5) {
            i6 = 0;
        } else {
            i6 = min(i8 - min, i5 - min);
            System.arraycopy(this.buf, 0, loggingEventArr, min, i6);
        }
        this.buf = loggingEventArr;
        this.maxSize = i5;
        this.first = 0;
        int i9 = min + i6;
        this.numElements = i9;
        this.next = i9;
        if (i9 == i5) {
            this.next = 0;
        }
    }

    public boolean wasEmpty() {
        return this.numElements == 1;
    }

    public boolean wasFull() {
        return this.numElements + 1 == this.maxSize;
    }
}
