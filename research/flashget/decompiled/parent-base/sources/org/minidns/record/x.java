package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.minidns.record.u;

/* compiled from: TLSA.java */
/* loaded from: classes9.dex */
public class x extends h {

    /* renamed from: k, reason: collision with root package name */
    private static final Map<Byte, a> f87515k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private static final Map<Byte, c> f87516l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private static final Map<Byte, b> f87517m = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final byte f87518d;

    /* renamed from: e, reason: collision with root package name */
    public final a f87519e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f87520f;

    /* renamed from: g, reason: collision with root package name */
    public final c f87521g;

    /* renamed from: h, reason: collision with root package name */
    public final byte f87522h;

    /* renamed from: i, reason: collision with root package name */
    public final b f87523i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f87524j;

    /* compiled from: TLSA.java */
    public enum a {
        caConstraint((byte) 0),
        serviceCertificateConstraint((byte) 1),
        trustAnchorAssertion((byte) 2),
        domainIssuedCertificate((byte) 3);

        public final byte byteValue;

        a(byte b5) {
            this.byteValue = b5;
            x.f87515k.put(Byte.valueOf(b5), this);
        }
    }

    /* compiled from: TLSA.java */
    public enum b {
        noHash((byte) 0),
        sha256((byte) 1),
        sha512((byte) 2);

        public final byte byteValue;

        b(byte b5) {
            this.byteValue = b5;
            x.f87517m.put(Byte.valueOf(b5), this);
        }
    }

    /* compiled from: TLSA.java */
    public enum c {
        fullCertificate((byte) 0),
        subjectPublicKeyInfo((byte) 1);

        public final byte byteValue;

        c(byte b5) {
            this.byteValue = b5;
            x.f87516l.put(Byte.valueOf(b5), this);
        }
    }

    static {
        a.values();
        c.values();
        b.values();
    }

    x(byte b5, byte b6, byte b7, byte[] bArr) {
        this.f87518d = b5;
        this.f87519e = f87515k.get(Byte.valueOf(b5));
        this.f87520f = b6;
        this.f87521g = f87516l.get(Byte.valueOf(b6));
        this.f87522h = b7;
        this.f87523i = f87517m.get(Byte.valueOf(b7));
        this.f87524j = bArr;
    }

    public static x m(DataInputStream dataInputStream, int i4) throws IOException {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        int i5 = i4 - 3;
        byte[] bArr = new byte[i5];
        if (dataInputStream.read(bArr) == i5) {
            return new x(readByte, readByte2, readByte3, bArr);
        }
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.TLSA;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f87518d);
        dataOutputStream.writeByte(this.f87520f);
        dataOutputStream.writeByte(this.f87522h);
        dataOutputStream.write(this.f87524j);
    }

    public boolean k(byte[] bArr) {
        return Arrays.equals(this.f87524j, bArr);
    }

    public byte[] l() {
        return (byte[]) this.f87524j.clone();
    }

    public String toString() {
        return ((int) this.f87518d) + ' ' + ((int) this.f87520f) + ' ' + ((int) this.f87522h) + ' ' + new BigInteger(1, this.f87524j).toString(16);
    }
}
