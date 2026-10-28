package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: SinglePassTranslator.java */
/* loaded from: classes3.dex */
abstract class k extends b {
    k() {
    }

    private String f() {
        Class<?> cls = getClass();
        return cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName();
    }

    @Override // org.apache.commons.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        if (i4 != 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder(), f(), ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index."));
        }
        g(charSequence, writer);
        return Character.codePointCount(charSequence, i4, charSequence.length());
    }

    abstract void g(CharSequence charSequence, Writer writer) throws IOException;
}
