package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import org.minidns.constants.b;

/* compiled from: DelegatingDnssecRR.java */
/* loaded from: classes9.dex */
public abstract class i extends h {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f87434l = false;

    /* renamed from: d, reason: collision with root package name */
    public final int f87435d;

    /* renamed from: e, reason: collision with root package name */
    public final b.EnumC1350b f87436e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f87437f;

    /* renamed from: g, reason: collision with root package name */
    public final b.a f87438g;

    /* renamed from: h, reason: collision with root package name */
    public final byte f87439h;

    /* renamed from: i, reason: collision with root package name */
    protected final byte[] f87440i;

    /* renamed from: j, reason: collision with root package name */
    private transient BigInteger f87441j;

    /* renamed from: k, reason: collision with root package name */
    private transient String f87442k;

    /* compiled from: DelegatingDnssecRR.java */
    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        protected final int f87443a;

        /* renamed from: b, reason: collision with root package name */
        protected final byte f87444b;

        /* renamed from: c, reason: collision with root package name */
        protected final byte f87445c;

        /* renamed from: d, reason: collision with root package name */
        protected final byte[] f87446d;

        private b(int i4, byte b5, byte b6, byte[] bArr) {
            this.f87443a = i4;
            this.f87444b = b5;
            this.f87445c = b6;
            this.f87446d = bArr;
        }
    }

    protected i(int i4, b.EnumC1350b enumC1350b, byte b5, b.a aVar, byte b6, byte[] bArr) {
        this.f87435d = i4;
        this.f87437f = b5;
        this.f87436e = enumC1350b == null ? b.EnumC1350b.forByte(b5) : enumC1350b;
        this.f87439h = b6;
        this.f87438g = aVar == null ? b.a.forByte(b6) : aVar;
        this.f87440i = bArr;
    }

    protected static b k(DataInputStream dataInputStream, int i4) throws IOException {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int i5 = i4 - 4;
        byte[] bArr = new byte[i5];
        if (dataInputStream.read(bArr) == i5) {
            return new b(readUnsignedShort, readByte, readByte2, bArr);
        }
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f87435d);
        dataOutputStream.writeByte(this.f87437f);
        dataOutputStream.writeByte(this.f87439h);
        dataOutputStream.write(this.f87440i);
    }

    public boolean h(byte[] bArr) {
        return Arrays.equals(this.f87440i, bArr);
    }

    public BigInteger i() {
        if (this.f87441j == null) {
            this.f87441j = new BigInteger(1, this.f87440i);
        }
        return this.f87441j;
    }

    public String j() {
        if (this.f87442k == null) {
            this.f87442k = i().toString(16).toUpperCase();
        }
        return this.f87442k;
    }

    public String toString() {
        return this.f87435d + ' ' + this.f87436e + ' ' + this.f87438g + ' ' + new BigInteger(1, this.f87440i).toString(16).toUpperCase();
    }

    protected i(int i4, byte b5, byte b6, byte[] bArr) {
        this(i4, null, b5, null, b6, bArr);
    }

    protected i(int i4, b.EnumC1350b enumC1350b, b.a aVar, byte[] bArr) {
        this(i4, enumC1350b, enumC1350b.number, aVar, aVar.value, bArr);
    }

    protected i(int i4, b.EnumC1350b enumC1350b, byte b5, byte[] bArr) {
        this(i4, enumC1350b, enumC1350b.number, null, b5, bArr);
    }
}
