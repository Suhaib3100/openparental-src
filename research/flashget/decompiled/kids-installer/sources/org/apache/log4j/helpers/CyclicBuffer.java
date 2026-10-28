package org.apache.log4j.helpers;

import androidx.constraintlayout.solver.f;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes5.dex */
public class CyclicBuffer {
    LoggingEvent[] ea;
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(int i5) throws IllegalArgumentException {
        if (i5 < 1) {
            throw new IllegalArgumentException(f.a("The maxSize argument (", i5, ") is not a positive integer."));
        }
        this.maxSize = i5;
        this.ea = new LoggingEvent[i5];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(LoggingEvent loggingEvent) {
        LoggingEvent[] loggingEventArr = this.ea;
        int i5 = this.last;
        loggingEventArr[i5] = loggingEvent;
        int i6 = i5 + 1;
        this.last = i6;
        int i7 = this.maxSize;
        if (i6 == i7) {
            this.last = 0;
        }
        int i8 = this.numElems;
        if (i8 < i7) {
            this.numElems = i8 + 1;
            return;
        }
        int i9 = this.first + 1;
        this.first = i9;
        if (i9 == i7) {
            this.first = 0;
        }
    }

    public LoggingEvent get(int i5) {
        if (i5 < 0 || i5 >= this.numElems) {
            return null;
        }
        return this.ea[(this.first + i5) % this.maxSize];
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(f.a("Negative array size [", i5, "] not allowed."));
        }
        int i6 = this.numElems;
        if (i5 == i6) {
            return;
        }
        LoggingEvent[] loggingEventArr = new LoggingEvent[i5];
        if (i5 < i6) {
            i6 = i5;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            LoggingEvent[] loggingEventArr2 = this.ea;
            int i8 = this.first;
            loggingEventArr[i7] = loggingEventArr2[i8];
            loggingEventArr2[i8] = null;
            int i9 = i8 + 1;
            this.first = i9;
            if (i9 == this.numElems) {
                this.first = 0;
            }
        }
        this.ea = loggingEventArr;
        this.first = 0;
        this.numElems = i6;
        this.maxSize = i5;
        if (i6 == i5) {
            this.last = 0;
        } else {
            this.last = i6;
        }
    }

    public LoggingEvent get() {
        int i5 = this.numElems;
        if (i5 <= 0) {
            return null;
        }
        this.numElems = i5 - 1;
        LoggingEvent[] loggingEventArr = this.ea;
        int i6 = this.first;
        LoggingEvent loggingEvent = loggingEventArr[i6];
        loggingEventArr[i6] = null;
        int i7 = i6 + 1;
        this.first = i7;
        if (i7 == this.maxSize) {
            this.first = 0;
        }
        return loggingEvent;
    }
}
