package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: CodePointTranslator.java */
/* loaded from: classes3.dex */
public abstract class c extends b {
    @Override // org.apache.commons.text.translate.b
    public final int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        return f(Character.codePointAt(charSequence, i4), writer) ? 1 : 0;
    }

    public abstract boolean f(int i4, Writer writer) throws IOException;
}
