package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: DNAME.java */
/* loaded from: classes9.dex */
public class e extends t {
    public e(String str) {
        super(org.minidns.dnsname.a.h(str));
    }

    public static e i(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new e(org.minidns.dnsname.a.E(dataInputStream, bArr));
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.DNAME;
    }

    public e(org.minidns.dnsname.a aVar) {
        super(aVar);
    }
}
