package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.minidns.record.m;
import org.minidns.record.u;

/* compiled from: NSEC3PARAM.java */
/* loaded from: classes9.dex */
public class n extends h {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f87465i = false;

    /* renamed from: d, reason: collision with root package name */
    public final m.a f87466d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f87467e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f87468f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87469g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f87470h;

    private n(m.a aVar, byte b5, byte b6, int i4, byte[] bArr) {
        this.f87467e = b5;
        this.f87466d = aVar == null ? m.a.forByte(b5) : aVar;
        this.f87468f = b6;
        this.f87469g = i4;
        this.f87470h = bArr;
    }

    public static n i(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[readUnsignedByte];
        if (dataInputStream.read(bArr) == readUnsignedByte || readUnsignedByte == 0) {
            return new n(null, readByte, readByte2, readUnsignedShort, bArr);
        }
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.NSEC3PARAM;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f87467e);
        dataOutputStream.writeByte(this.f87468f);
        dataOutputStream.writeShort(this.f87469g);
        dataOutputStream.writeByte(this.f87470h.length);
        dataOutputStream.write(this.f87470h);
    }

    public int h() {
        return this.f87470h.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f87466d);
        sb.append(' ');
        sb.append((int) this.f87468f);
        sb.append(' ');
        sb.append(this.f87469g);
        sb.append(' ');
        sb.append(this.f87470h.length == 0 ? "-" : new BigInteger(1, this.f87470h).toString(16).toUpperCase());
        return sb.toString();
    }

    n(byte b5, byte b6, int i4, byte[] bArr) {
        this(null, b5, b6, i4, bArr);
    }
}
