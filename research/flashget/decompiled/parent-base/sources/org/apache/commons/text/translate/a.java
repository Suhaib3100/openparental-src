package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AggregateTranslator.java */
/* loaded from: classes3.dex */
public class a extends b {

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f86686b = new ArrayList();

    public a(b... bVarArr) {
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    this.f86686b.add(bVar);
                }
            }
        }
    }

    @Override // org.apache.commons.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        Iterator<b> it = this.f86686b.iterator();
        while (it.hasNext()) {
            int b5 = it.next().b(charSequence, i4, writer);
            if (b5 != 0) {
                return b5;
            }
        }
        return 0;
    }
}
