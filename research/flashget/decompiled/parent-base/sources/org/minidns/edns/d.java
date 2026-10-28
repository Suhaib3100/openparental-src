package org.minidns.edns;

import org.minidns.edns.a;
import org.minidns.util.f;

/* compiled from: UnknownEdnsOption.java */
/* loaded from: classes9.dex */
public class d extends b {
    protected d(int i4, byte[] bArr) {
        super(i4, bArr);
    }

    @Override // org.minidns.edns.b
    protected CharSequence b() {
        return f.a(this.f87329c);
    }

    @Override // org.minidns.edns.b
    public a.c c() {
        return a.c.UNKNOWN;
    }

    @Override // org.minidns.edns.b
    protected CharSequence e() {
        return b();
    }
}
