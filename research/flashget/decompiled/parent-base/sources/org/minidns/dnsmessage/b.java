package org.minidns.dnsmessage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.minidns.dnsmessage.a;
import org.minidns.record.u;

/* compiled from: Question.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ boolean f87206f = false;

    /* renamed from: a, reason: collision with root package name */
    public final org.minidns.dnsname.a f87207a;

    /* renamed from: b, reason: collision with root package name */
    public final u.c f87208b;

    /* renamed from: c, reason: collision with root package name */
    public final u.b f87209c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f87210d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f87211e;

    public b(CharSequence charSequence, u.c cVar, u.b bVar, boolean z4) {
        this(org.minidns.dnsname.a.f(charSequence), cVar, bVar, z4);
    }

    public a.b a() {
        a.b e4 = a.e();
        e4.M(this);
        return e4;
    }

    public a b() {
        a.b a5 = a();
        a5.getClass();
        return new a(a5);
    }

    public byte[] c() {
        if (this.f87211e == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                this.f87207a.R(dataOutputStream);
                dataOutputStream.writeShort(this.f87208b.getValue());
                dataOutputStream.writeShort(this.f87209c.getValue() | (this.f87210d ? 32768 : 0));
                dataOutputStream.flush();
                this.f87211e = byteArrayOutputStream.toByteArray();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
        return this.f87211e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Arrays.equals(c(), ((b) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(c());
    }

    public String toString() {
        return this.f87207a.w() + ".\t" + this.f87209c + '\t' + this.f87208b;
    }

    public b(org.minidns.dnsname.a aVar, u.c cVar, u.b bVar, boolean z4) {
        this.f87207a = aVar;
        this.f87208b = cVar;
        this.f87209c = bVar;
        this.f87210d = z4;
    }

    public b(org.minidns.dnsname.a aVar, u.c cVar, u.b bVar) {
        this(aVar, cVar, bVar, false);
    }

    public b(org.minidns.dnsname.a aVar, u.c cVar) {
        this(aVar, cVar, u.b.IN, false);
    }

    public b(CharSequence charSequence, u.c cVar, u.b bVar) {
        this(org.minidns.dnsname.a.f(charSequence), cVar, bVar, false);
    }

    public b(CharSequence charSequence, u.c cVar) {
        this(org.minidns.dnsname.a.f(charSequence), cVar);
    }

    public b(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        this.f87207a = org.minidns.dnsname.a.E(dataInputStream, bArr);
        this.f87208b = u.c.getType(dataInputStream.readUnsignedShort());
        this.f87209c = u.b.getClass(dataInputStream.readUnsignedShort());
        this.f87210d = false;
    }
}
