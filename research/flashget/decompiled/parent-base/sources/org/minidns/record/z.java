package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.minidns.record.u;

/* compiled from: UNKNOWN.java */
/* loaded from: classes9.dex */
public final class z extends h {

    /* renamed from: d, reason: collision with root package name */
    private final u.c f87528d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f87529e;

    private z(DataInputStream dataInputStream, int i4, u.c cVar) throws IOException {
        this.f87528d = cVar;
        byte[] bArr = new byte[i4];
        this.f87529e = bArr;
        dataInputStream.readFully(bArr);
    }

    public static z h(DataInputStream dataInputStream, int i4, u.c cVar) throws IOException {
        return new z(dataInputStream, i4, cVar);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return this.f87528d;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f87529e);
    }
}
