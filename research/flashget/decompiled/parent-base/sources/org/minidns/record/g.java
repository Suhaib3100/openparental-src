package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import org.minidns.constants.b;
import org.minidns.record.i;
import org.minidns.record.u;

/* compiled from: DS.java */
/* loaded from: classes9.dex */
public class g extends i {
    public g(int i4, byte b5, byte b6, byte[] bArr) {
        super(i4, b5, b6, bArr);
    }

    public static g l(DataInputStream dataInputStream, int i4) throws IOException {
        i.b k4 = i.k(dataInputStream, i4);
        return new g(k4.f87443a, k4.f87444b, k4.f87445c, k4.f87446d);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.DS;
    }

    public g(int i4, b.EnumC1350b enumC1350b, byte b5, byte[] bArr) {
        super(i4, enumC1350b, b5, bArr);
    }

    public g(int i4, b.EnumC1350b enumC1350b, b.a aVar, byte[] bArr) {
        super(i4, enumC1350b, aVar, bArr);
    }
}
