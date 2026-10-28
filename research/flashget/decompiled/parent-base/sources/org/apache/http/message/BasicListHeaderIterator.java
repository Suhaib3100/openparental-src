package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@NotThreadSafe
/* loaded from: classes3.dex */
public class BasicListHeaderIterator implements HeaderIterator {
    protected final List<Header> allHeaders;
    protected String headerName;
    protected int currentIndex = findNext(-1);
    protected int lastIndex = -1;

    public BasicListHeaderIterator(List<Header> list, String str) {
        this.allHeaders = (List) Args.notNull(list, "Header list");
        this.headerName = str;
    }

    protected boolean filterHeader(int i4) {
        if (this.headerName == null) {
            return true;
        }
        return this.headerName.equalsIgnoreCase(this.allHeaders.get(i4).getName());
    }

    protected int findNext(int i4) {
        if (i4 < -1) {
            return -1;
        }
        int size = this.allHeaders.size() - 1;
        boolean z4 = false;
        while (!z4 && i4 < size) {
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
        this.lastIndex = i4;
        this.currentIndex = findNext(i4);
        return this.allHeaders.get(i4);
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        Asserts.check(this.lastIndex >= 0, "No header to remove");
        this.allHeaders.remove(this.lastIndex);
        this.lastIndex = -1;
        this.currentIndex--;
    }
}
