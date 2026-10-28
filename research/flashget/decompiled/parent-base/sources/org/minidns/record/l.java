package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: NS.java */
/* loaded from: classes9.dex */
public class l extends t {
    public l(org.minidns.dnsname.a aVar) {
        super(aVar);
    }

    public static l i(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new l(org.minidns.dnsname.a.E(dataInputStream, bArr));
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.NS;
    }
}
