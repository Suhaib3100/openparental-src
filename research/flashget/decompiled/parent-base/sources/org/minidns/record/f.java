package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import org.minidns.constants.b;
import org.minidns.record.u;

/* compiled from: DNSKEY.java */
/* loaded from: classes9.dex */
public class f extends h {

    /* renamed from: l, reason: collision with root package name */
    public static final short f87419l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final short f87420m = 128;

    /* renamed from: n, reason: collision with root package name */
    public static final short f87421n = 256;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f87422o = 3;

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f87423p = false;

    /* renamed from: d, reason: collision with root package name */
    public final short f87424d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f87425e;

    /* renamed from: f, reason: collision with root package name */
    public final b.EnumC1350b f87426f;

    /* renamed from: g, reason: collision with root package name */
    public final byte f87427g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f87428h;

    /* renamed from: i, reason: collision with root package name */
    private transient Integer f87429i;

    /* renamed from: j, reason: collision with root package name */
    private transient String f87430j;

    /* renamed from: k, reason: collision with root package name */
    private transient BigInteger f87431k;

    private f(short s4, byte b5, b.EnumC1350b enumC1350b, byte b6, byte[] bArr) {
        this.f87424d = s4;
        this.f87425e = b5;
        this.f87427g = b6;
        this.f87426f = enumC1350b == null ? b.EnumC1350b.forByte(b6) : enumC1350b;
        this.f87428h = bArr;
    }

    public static f p(DataInputStream dataInputStream, int i4) throws IOException {
        short readShort = dataInputStream.readShort();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte[] bArr = new byte[i4 - 4];
        dataInputStream.readFully(bArr);
        return new f(readShort, readByte, readByte2, bArr);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.DNSKEY;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f87424d);
        dataOutputStream.writeByte(this.f87425e);
        dataOutputStream.writeByte(this.f87427g);
        dataOutputStream.write(this.f87428h);
    }

    public byte[] h() {
        return (byte[]) this.f87428h.clone();
    }

    public DataInputStream i() {
        return new DataInputStream(new ByteArrayInputStream(this.f87428h));
    }

    public String j() {
        if (this.f87430j == null) {
            this.f87430j = org.minidns.util.b.a(this.f87428h);
        }
        return this.f87430j;
    }

    public BigInteger k() {
        if (this.f87431k == null) {
            this.f87431k = new BigInteger(this.f87428h);
        }
        return this.f87431k;
    }

    public int l() {
        return this.f87428h.length;
    }

    public int m() {
        if (this.f87429i == null) {
            byte[] e4 = e();
            long j4 = 0;
            for (int i4 = 0; i4 < e4.length; i4++) {
                j4 += (i4 & 1) > 0 ? e4[i4] & 255 : (e4[i4] & 255) << 8;
            }
            this.f87429i = Integer.valueOf((int) ((j4 + ((j4 >> 16) & okhttp3.internal.ws.g.f84969s)) & okhttp3.internal.ws.g.f84969s));
        }
        return this.f87429i.intValue();
    }

    public boolean n() {
        return (this.f87424d & 1) == 1;
    }

    public boolean o(byte[] bArr) {
        return Arrays.equals(this.f87428h, bArr);
    }

    public String toString() {
        return ((int) this.f87424d) + ' ' + ((int) this.f87425e) + ' ' + this.f87426f + ' ' + org.minidns.util.b.a(this.f87428h);
    }

    public f(short s4, byte b5, byte b6, byte[] bArr) {
        this(s4, b5, b.EnumC1350b.forByte(b6), b6, bArr);
    }

    public f(short s4, byte b5, b.EnumC1350b enumC1350b, byte[] bArr) {
        this(s4, b5, enumC1350b, enumC1350b.number, bArr);
    }
}
