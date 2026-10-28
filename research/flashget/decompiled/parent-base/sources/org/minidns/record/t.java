package org.minidns.record;

import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: RRWithTarget.java */
/* loaded from: classes9.dex */
public abstract class t extends h {

    /* renamed from: d, reason: collision with root package name */
    public final org.minidns.dnsname.a f87491d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public final org.minidns.dnsname.a f87492e;

    protected t(org.minidns.dnsname.a aVar) {
        this.f87491d = aVar;
        this.f87492e = aVar;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        this.f87491d.R(dataOutputStream);
    }

    public final org.minidns.dnsname.a h() {
        return this.f87491d;
    }

    public String toString() {
        return ((Object) this.f87491d) + ".";
    }
}
