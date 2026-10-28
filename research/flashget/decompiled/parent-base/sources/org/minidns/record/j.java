package org.minidns.record;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: InternetAddressRR.java */
/* loaded from: classes9.dex */
public abstract class j<IA extends InetAddress> extends h {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f87447d;

    /* renamed from: e, reason: collision with root package name */
    private transient IA f87448e;

    protected j(byte[] bArr) {
        this.f87447d = bArr;
    }

    public static j<? extends InetAddress> h(InetAddress inetAddress) {
        return inetAddress instanceof Inet4Address ? new a((Inet4Address) inetAddress) : new b((Inet6Address) inetAddress);
    }

    @Override // org.minidns.record.h
    public final void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f87447d);
    }

    public final IA i() {
        if (this.f87448e == null) {
            try {
                this.f87448e = (IA) InetAddress.getByAddress(this.f87447d);
            } catch (UnknownHostException e4) {
                throw new IllegalStateException(e4);
            }
        }
        return this.f87448e;
    }

    public final byte[] j() {
        return (byte[]) this.f87447d.clone();
    }

    protected j(IA ia2) {
        this(ia2.getAddress());
        this.f87448e = ia2;
    }
}
