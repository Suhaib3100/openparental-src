package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: PTR.java */
/* loaded from: classes9.dex */
public class r extends t {
    r(String str) {
        super(org.minidns.dnsname.a.h(str));
    }

    public static r i(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new r(org.minidns.dnsname.a.E(dataInputStream, bArr));
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.PTR;
    }

    r(org.minidns.dnsname.a aVar) {
        super(aVar);
    }
}
