package org.apache.commons.text.matcher;

import org.apache.commons.lang3.j;

/* compiled from: StringMatcher.java */
/* loaded from: classes3.dex */
public interface b {
    default int a(CharSequence charSequence, int i4) {
        return c(charSequence, i4, 0, charSequence.length());
    }

    int b(char[] cArr, int i4, int i5, int i6);

    default int c(CharSequence charSequence, int i4, int i5, int i6) {
        return b(j.h(charSequence), i4, i6, i6);
    }

    default int d(char[] cArr, int i4) {
        return b(cArr, i4, 0, cArr.length);
    }

    default b e(b bVar) {
        return c.f86564c.a(this, bVar);
    }

    default int size() {
        return 0;
    }
}
