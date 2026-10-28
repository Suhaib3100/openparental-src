package org.minidns.record;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Inet6Address;
import org.minidns.record.u;

/* compiled from: AAAA.java */
/* loaded from: classes9.dex */
public class b extends j<Inet6Address> {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f87418f = false;

    public b(Inet6Address inet6Address) {
        super(inet6Address);
    }

    public static b k(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[16];
        dataInputStream.readFully(bArr);
        return new b(bArr);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.AAAA;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < this.f87447d.length; i4 += 2) {
            if (i4 != 0) {
                sb.append(':');
            }
            byte[] bArr = this.f87447d;
            sb.append(Integer.toHexString(((bArr[i4] & 255) << 8) + (bArr[i4 + 1] & 255)));
        }
        return sb.toString();
    }

    public b(byte[] bArr) {
        super(bArr);
        if (bArr.length != 16) {
            throw new IllegalArgumentException("IPv6 address in AAAA record is always 16 byte");
        }
    }

    public b(CharSequence charSequence) {
        super(org.minidns.util.g.c(charSequence));
    }
}
