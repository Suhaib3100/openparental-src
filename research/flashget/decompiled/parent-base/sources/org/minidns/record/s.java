package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.minidns.constants.b;
import org.minidns.record.u;

/* compiled from: RRSIG.java */
/* loaded from: classes9.dex */
public class s extends h {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f87479o = false;

    /* renamed from: d, reason: collision with root package name */
    public final u.c f87480d;

    /* renamed from: e, reason: collision with root package name */
    public final b.EnumC1350b f87481e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f87482f;

    /* renamed from: g, reason: collision with root package name */
    public final byte f87483g;

    /* renamed from: h, reason: collision with root package name */
    public final long f87484h;

    /* renamed from: i, reason: collision with root package name */
    public final Date f87485i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f87486j;

    /* renamed from: k, reason: collision with root package name */
    public final int f87487k;

    /* renamed from: l, reason: collision with root package name */
    public final org.minidns.dnsname.a f87488l;

    /* renamed from: m, reason: collision with root package name */
    private final byte[] f87489m;

    /* renamed from: n, reason: collision with root package name */
    private transient String f87490n;

    private s(u.c cVar, b.EnumC1350b enumC1350b, byte b5, byte b6, long j4, Date date, Date date2, int i4, org.minidns.dnsname.a aVar, byte[] bArr) {
        this.f87480d = cVar;
        this.f87482f = b5;
        this.f87481e = enumC1350b == null ? b.EnumC1350b.forByte(b5) : enumC1350b;
        this.f87483g = b6;
        this.f87484h = j4;
        this.f87485i = date;
        this.f87486j = date2;
        this.f87487k = i4;
        this.f87488l = aVar;
        this.f87489m = bArr;
    }

    public static s l(DataInputStream dataInputStream, byte[] bArr, int i4) throws IOException {
        u.c type = u.c.getType(dataInputStream.readUnsignedShort());
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        long readInt = dataInputStream.readInt() & 4294967295L;
        Date date = new Date((dataInputStream.readInt() & 4294967295L) * 1000);
        Date date2 = new Date((4294967295L & dataInputStream.readInt()) * 1000);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        org.minidns.dnsname.a E = org.minidns.dnsname.a.E(dataInputStream, bArr);
        int M = (i4 - E.M()) - 18;
        byte[] bArr2 = new byte[M];
        if (dataInputStream.read(bArr2) == M) {
            return new s(type, null, readByte, readByte2, readInt, date, date2, readUnsignedShort, E, bArr2);
        }
        throw new IOException();
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.RRSIG;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        m(dataOutputStream);
        dataOutputStream.write(this.f87489m);
    }

    public byte[] h() {
        return (byte[]) this.f87489m.clone();
    }

    public DataInputStream i() {
        return new DataInputStream(new ByteArrayInputStream(this.f87489m));
    }

    public String j() {
        if (this.f87490n == null) {
            this.f87490n = org.minidns.util.b.a(this.f87489m);
        }
        return this.f87490n;
    }

    public int k() {
        return this.f87489m.length;
    }

    public void m(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f87480d.getValue());
        dataOutputStream.writeByte(this.f87482f);
        dataOutputStream.writeByte(this.f87483g);
        dataOutputStream.writeInt((int) this.f87484h);
        dataOutputStream.writeInt((int) (this.f87485i.getTime() / 1000));
        dataOutputStream.writeInt((int) (this.f87486j.getTime() / 1000));
        dataOutputStream.writeShort(this.f87487k);
        this.f87488l.R(dataOutputStream);
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return this.f87480d + ' ' + this.f87481e + ' ' + ((int) this.f87483g) + ' ' + this.f87484h + ' ' + simpleDateFormat.format(this.f87485i) + ' ' + simpleDateFormat.format(this.f87486j) + ' ' + this.f87487k + ' ' + ((CharSequence) this.f87488l) + ". " + j();
    }

    public s(u.c cVar, int i4, byte b5, long j4, Date date, Date date2, int i5, org.minidns.dnsname.a aVar, byte[] bArr) {
        this(cVar, null, (byte) i4, b5, j4, date, date2, i5, aVar, bArr);
    }

    public s(u.c cVar, int i4, byte b5, long j4, Date date, Date date2, int i5, String str, byte[] bArr) {
        this(cVar, null, (byte) i4, b5, j4, date, date2, i5, org.minidns.dnsname.a.h(str), bArr);
    }

    public s(u.c cVar, b.EnumC1350b enumC1350b, byte b5, long j4, Date date, Date date2, int i4, org.minidns.dnsname.a aVar, byte[] bArr) {
        this(cVar, enumC1350b.number, b5, j4, date, date2, i4, aVar, bArr);
    }

    public s(u.c cVar, b.EnumC1350b enumC1350b, byte b5, long j4, Date date, Date date2, int i4, String str, byte[] bArr) {
        this(cVar, enumC1350b.number, b5, j4, date, date2, i4, org.minidns.dnsname.a.h(str), bArr);
    }
}
