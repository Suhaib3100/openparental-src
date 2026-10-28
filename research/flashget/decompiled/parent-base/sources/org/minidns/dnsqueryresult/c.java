package org.minidns.dnsqueryresult;

import org.minidns.dnsmessage.a;

/* compiled from: DnsQueryResult.java */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f87239d = false;

    /* renamed from: a, reason: collision with root package name */
    public final a f87240a;

    /* renamed from: b, reason: collision with root package name */
    public final org.minidns.dnsmessage.a f87241b;

    /* renamed from: c, reason: collision with root package name */
    public final org.minidns.dnsmessage.a f87242c;

    /* compiled from: DnsQueryResult.java */
    public enum a {
        udp,
        tcp,
        asyncUdp,
        asyncTcp,
        cachedDirect,
        cachedSynthesized,
        testWorld
    }

    protected c(a aVar, org.minidns.dnsmessage.a aVar2, org.minidns.dnsmessage.a aVar3) {
        this.f87240a = aVar;
        this.f87241b = aVar2;
        this.f87242c = aVar3;
    }

    public boolean a() {
        return this.f87242c.f87168c == a.d.NO_ERROR;
    }

    public String toString() {
        return this.f87242c.toString();
    }
}
