package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* compiled from: AggregateTranslator.java */
@Deprecated
/* loaded from: classes6.dex */
public class a extends b {

    /* renamed from: b, reason: collision with root package name */
    private final b[] f86199b;

    public a(b... bVarArr) {
        this.f86199b = (b[]) org.apache.commons.lang3.e.R(bVarArr);
    }

    @Override // org.apache.commons.lang3.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        for (b bVar : this.f86199b) {
            int b5 = bVar.b(charSequence, i4, writer);
            if (b5 != 0) {
                return b5;
            }
        }
        return 0;
    }
}
