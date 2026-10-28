package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.record.u;

/* compiled from: NSEC3.java */
/* loaded from: classes9.dex */
public class m extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final byte f87452n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final Map<Byte, a> f87453o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f87454p = false;

    /* renamed from: d, reason: collision with root package name */
    public final a f87455d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f87456e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f87457f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87458g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f87459h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f87460i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f87461j;

    /* renamed from: k, reason: collision with root package name */
    public final List<u.c> f87462k;

    /* renamed from: l, reason: collision with root package name */
    private String f87463l;

    /* renamed from: m, reason: collision with root package name */
    private DnsLabel f87464m;

    /* compiled from: NSEC3.java */
    public enum a {
        RESERVED(0, "Reserved"),
        SHA1(1, "SHA-1");

        public final String description;
        public final byte value;

        a(int i4, String str) {
            if (i4 < 0 || i4 > 255) {
                throw new IllegalArgumentException();
            }
            byte b5 = (byte) i4;
            this.value = b5;
            this.description = str;
            m.f87453o.put(Byte.valueOf(b5), this);
        }

        public static a forByte(byte b5) {
            return (a) m.f87453o.get(Byte.valueOf(b5));
        }
    }

    private m(a aVar, byte b5, byte b6, int i4, byte[] bArr, byte[] bArr2, List<u.c> list) {
        this.f87456e = b5;
        this.f87455d = aVar == null ? a.forByte(b5) : aVar;
        this.f87457f = b6;
        this.f87458g = i4;
        this.f87459h = bArr;
        this.f87460i = bArr2;
        this.f87462k = list;
        this.f87461j = o.h(list);
    }

    public static m o(DataInputStream dataInputStream, int i4) throws IOException {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[readUnsignedByte];
        if (dataInputStream.read(bArr) != readUnsignedByte) {
            throw new IOException();
        }
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        byte[] bArr2 = new byte[readUnsignedByte2];
        if (dataInputStream.read(bArr2) != readUnsignedByte2) {
            throw new IOException();
        }
        int i5 = i4 - ((readUnsignedByte + 6) + readUnsignedByte2);
        byte[] bArr3 = new byte[i5];
        if (dataInputStream.read(bArr3) == i5) {
            return new m(null, readByte, readByte2, readUnsignedShort, bArr, bArr2, o.j(bArr3));
        }
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.NSEC3;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f87456e);
        dataOutputStream.writeByte(this.f87457f);
        dataOutputStream.writeShort(this.f87458g);
        dataOutputStream.writeByte(this.f87459h.length);
        dataOutputStream.write(this.f87459h);
        dataOutputStream.writeByte(this.f87460i.length);
        dataOutputStream.write(this.f87460i);
        dataOutputStream.write(this.f87461j);
    }

    public void i(byte[] bArr, int i4) {
        byte[] bArr2 = this.f87459h;
        System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
    }

    public byte[] j() {
        return (byte[]) this.f87460i.clone();
    }

    public String k() {
        if (this.f87463l == null) {
            this.f87463l = org.minidns.util.a.a(this.f87460i);
        }
        return this.f87463l;
    }

    public DnsLabel l() {
        if (this.f87464m == null) {
            this.f87464m = DnsLabel.f(k());
        }
        return this.f87464m;
    }

    public byte[] m() {
        return (byte[]) this.f87459h.clone();
    }

    public int n() {
        return this.f87459h.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f87455d);
        sb.append(' ');
        sb.append((int) this.f87457f);
        sb.append(' ');
        sb.append(this.f87458g);
        sb.append(' ');
        sb.append(this.f87459h.length == 0 ? "-" : new BigInteger(1, this.f87459h).toString(16).toUpperCase());
        sb.append(' ');
        sb.append(org.minidns.util.a.a(this.f87460i));
        for (u.c cVar : this.f87462k) {
            sb.append(' ');
            sb.append(cVar);
        }
        return sb.toString();
    }

    public m(byte b5, byte b6, int i4, byte[] bArr, byte[] bArr2, List<u.c> list) {
        this(null, b5, b6, i4, bArr, bArr2, list);
    }

    public m(byte b5, byte b6, int i4, byte[] bArr, byte[] bArr2, u.c... cVarArr) {
        this(null, b5, b6, i4, bArr, bArr2, Arrays.asList(cVarArr));
    }
}
