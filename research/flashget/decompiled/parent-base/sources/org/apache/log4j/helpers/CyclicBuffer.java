package org.apache.log4j.helpers;

import androidx.collection.r2;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class CyclicBuffer {

    /* renamed from: ea, reason: collision with root package name */
    LoggingEvent[] f86718ea;
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(int i4) throws IllegalArgumentException {
        if (i4 < 1) {
            throw new IllegalArgumentException(r2.a("The maxSize argument (", i4, ") is not a positive integer."));
        }
        this.maxSize = i4;
        this.f86718ea = new LoggingEvent[i4];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(LoggingEvent loggingEvent) {
        LoggingEvent[] loggingEventArr = this.f86718ea;
        int i4 = this.last;
        loggingEventArr[i4] = loggingEvent;
        int i5 = i4 + 1;
        this.last = i5;
        int i6 = this.maxSize;
        if (i5 == i6) {
            this.last = 0;
        }
        int i7 = this.numElems;
        if (i7 < i6) {
            this.numElems = i7 + 1;
            return;
        }
        int i10 = this.first + 1;
        this.first = i10;
        if (i10 == i6) {
            this.first = 0;
        }
    }

    public LoggingEvent get(int i4) {
        if (i4 < 0 || i4 >= this.numElems) {
            return null;
        }
        return this.f86718ea[(this.first + i4) % this.maxSize];
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(r2.a("Negative array size [", i4, "] not allowed."));
        }
        int i5 = this.numElems;
        if (i4 == i5) {
            return;
        }
        LoggingEvent[] loggingEventArr = new LoggingEvent[i4];
        if (i4 < i5) {
            i5 = i4;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            LoggingEvent[] loggingEventArr2 = this.f86718ea;
            int i7 = this.first;
            loggingEventArr[i6] = loggingEventArr2[i7];
            loggingEventArr2[i7] = null;
            int i10 = i7 + 1;
            this.first = i10;
            if (i10 == this.numElems) {
                this.first = 0;
            }
        }
        this.f86718ea = loggingEventArr;
        this.first = 0;
        this.numElems = i5;
        this.maxSize = i4;
        if (i5 == i4) {
            this.last = 0;
        } else {
            this.last = i5;
        }
    }

    public LoggingEvent get() {
        int i4 = this.numElems;
        if (i4 <= 0) {
            return null;
        }
        this.numElems = i4 - 1;
        LoggingEvent[] loggingEventArr = this.f86718ea;
        int i5 = this.first;
        LoggingEvent loggingEvent = loggingEventArr[i5];
        loggingEventArr[i5] = null;
        int i6 = i5 + 1;
        this.first = i6;
        if (i6 == this.maxSize) {
            this.first = 0;
        }
        return loggingEvent;
    }
}
