package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: CNAME.java */
/* loaded from: classes9.dex */
public class c extends t {
    public c(String str) {
        super(org.minidns.dnsname.a.h(str));
    }

    public static c i(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        return new c(org.minidns.dnsname.a.E(dataInputStream, bArr));
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.CNAME;
    }

    public c(org.minidns.dnsname.a aVar) {
        super(aVar);
    }
}
