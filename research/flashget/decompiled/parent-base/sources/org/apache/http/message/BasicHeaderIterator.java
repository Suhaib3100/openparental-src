package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
/* loaded from: classes3.dex */
public class BasicHeaderIterator implements HeaderIterator {
    protected final Header[] allHeaders;
    protected int currentIndex = findNext(-1);
    protected String headerName;

    public BasicHeaderIterator(Header[] headerArr, String str) {
        this.allHeaders = (Header[]) Args.notNull(headerArr, "Header array");
        this.headerName = str;
    }

    protected boolean filterHeader(int i4) {
        String str = this.headerName;
        return str == null || str.equalsIgnoreCase(this.allHeaders[i4].getName());
    }

    protected int findNext(int i4) {
        if (i4 < -1) {
            return -1;
        }
        int length = this.allHeaders.length - 1;
        boolean z4 = false;
        while (!z4 && i4 < length) {
            i4++;
            z4 = filterHeader(i4);
        }
        if (z4) {
            return i4;
        }
        return -1;
    }

    @Override // org.apache.http.HeaderIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextHeader();
    }

    @Override // org.apache.http.HeaderIterator
    public Header nextHeader() throws NoSuchElementException {
        int i4 = this.currentIndex;
        if (i4 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.currentIndex = findNext(i4);
        return this.allHeaders[i4];
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
