package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Inet4Address;
import org.minidns.record.u;

/* compiled from: A.java */
/* loaded from: classes9.dex */
public class a extends j<Inet4Address> {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f87417f = false;

    public a(Inet4Address inet4Address) {
        super(inet4Address);
    }

    public static a k(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        return new a(bArr);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.A;
    }

    public String toString() {
        return Integer.toString(this.f87447d[0] & 255) + "." + Integer.toString(this.f87447d[1] & 255) + "." + Integer.toString(this.f87447d[2] & 255) + "." + Integer.toString(this.f87447d[3] & 255);
    }

    public a(int i4, int i5, int i6, int i7) {
        super(new byte[]{(byte) i4, (byte) i5, (byte) i6, (byte) i7});
        if (i4 < 0 || i4 > 255 || i5 < 0 || i5 > 255 || i6 < 0 || i6 > 255 || i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException();
        }
    }

    public a(byte[] bArr) {
        super(bArr);
        if (bArr.length != 4) {
            throw new IllegalArgumentException("IPv4 address in A record is always 4 byte");
        }
    }

    public a(CharSequence charSequence) {
        super(org.minidns.util.g.b(charSequence));
    }
}
