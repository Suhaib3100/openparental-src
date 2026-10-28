package org.apache.http.message;

import androidx.collection.s;
import kotlin.text.m0;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes3.dex */
public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public ParserCursor(int i4, int i5) {
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i4 > i5) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.lowerBound = i4;
        this.upperBound = i5;
        this.pos = i4;
    }

    public boolean atEnd() {
        return this.pos >= this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        return "[" + Integer.toString(this.lowerBound) + m0.greater + Integer.toString(this.pos) + m0.greater + Integer.toString(this.upperBound) + ']';
    }

    public void updatePos(int i4) {
        if (i4 < this.lowerBound) {
            StringBuilder a5 = s.a("pos: ", i4, " < lowerBound: ");
            a5.append(this.lowerBound);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i4 <= this.upperBound) {
            this.pos = i4;
        } else {
            StringBuilder a6 = s.a("pos: ", i4, " > upperBound: ");
            a6.append(this.upperBound);
            throw new IndexOutOfBoundsException(a6.toString());
        }
    }
}
