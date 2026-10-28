package org.minidns.record;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import org.minidns.record.u;

/* compiled from: NSEC.java */
/* loaded from: classes9.dex */
public class o extends h {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f87471g = Logger.getLogger(o.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final org.minidns.dnsname.a f87472d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f87473e;

    /* renamed from: f, reason: collision with root package name */
    public final List<u.c> f87474f;

    public o(String str, List<u.c> list) {
        this(org.minidns.dnsname.a.h(str), list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        k(r3, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static byte[] h(java.util.List<org.minidns.record.u.c> r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r9.next()
            org.minidns.record.u$c r1 = (org.minidns.record.u.c) r1
            int r1 = r1.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto Ld
        L25:
            java.util.Collections.sort(r0)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r9)
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L52
            r2 = -1
            r3 = 0
            r4 = r2
        L39:
            boolean r5 = r0.hasNext()     // Catch: java.io.IOException -> L52
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r0.next()     // Catch: java.io.IOException -> L52
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.io.IOException -> L52
            r6 = 32
            if (r4 == r2) goto L54
            int r7 = r5.intValue()     // Catch: java.io.IOException -> L52
            int r7 = r7 >> 8
            if (r7 == r4) goto L64
            goto L54
        L52:
            r9 = move-exception
            goto L86
        L54:
            if (r4 == r2) goto L59
            k(r3, r1)     // Catch: java.io.IOException -> L52
        L59:
            int r3 = r5.intValue()     // Catch: java.io.IOException -> L52
            int r4 = r3 >> 8
            r1.writeByte(r4)     // Catch: java.io.IOException -> L52
            byte[] r3 = new byte[r6]     // Catch: java.io.IOException -> L52
        L64:
            int r7 = r5.intValue()     // Catch: java.io.IOException -> L52
            int r7 = r7 >> 3
            int r7 = r7 % r6
            int r5 = r5.intValue()     // Catch: java.io.IOException -> L52
            int r5 = r5 % 8
            r6 = r3[r7]     // Catch: java.io.IOException -> L52
            r8 = 128(0x80, float:1.8E-43)
            int r5 = r8 >> r5
            r5 = r5 | r6
            byte r5 = (byte) r5     // Catch: java.io.IOException -> L52
            r3[r7] = r5     // Catch: java.io.IOException -> L52
            goto L39
        L7c:
            if (r4 == r2) goto L81
            k(r3, r1)     // Catch: java.io.IOException -> L52
        L81:
            byte[] r9 = r9.toByteArray()
            return r9
        L86:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.record.o.h(java.util.List):byte[]");
    }

    public static o i(DataInputStream dataInputStream, byte[] bArr, int i4) throws IOException {
        org.minidns.dnsname.a E = org.minidns.dnsname.a.E(dataInputStream, bArr);
        int M = i4 - E.M();
        byte[] bArr2 = new byte[M];
        if (dataInputStream.read(bArr2) == M) {
            return new o(E, j(bArr2));
        }
        throw new IOException();
    }

    static List<u.c> j(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (bArr.length > i4) {
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
                int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                for (int i6 = 0; i6 < 8; i6++) {
                    if (((readUnsignedByte3 >> i6) & 1) > 0) {
                        int i7 = (7 - i6) + (i5 * 8) + (readUnsignedByte << 8);
                        u.c type = u.c.getType(i7);
                        if (type == u.c.UNKNOWN) {
                            f87471g.warning("Skipping unknown type in type bitmap: " + i7);
                        } else {
                            arrayList.add(type);
                        }
                    }
                }
            }
            i4 += readUnsignedByte2 + 2;
        }
        return arrayList;
    }

    private static void k(byte[] bArr, DataOutputStream dataOutputStream) throws IOException {
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (bArr[i5] != 0) {
                i4 = i5 + 1;
            }
        }
        dataOutputStream.writeByte(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            dataOutputStream.writeByte(bArr[i6]);
        }
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.NSEC;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        this.f87472d.R(dataOutputStream);
        dataOutputStream.write(this.f87473e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f87472d);
        sb.append('.');
        for (u.c cVar : this.f87474f) {
            sb.append(' ');
            sb.append(cVar);
        }
        return sb.toString();
    }

    public o(String str, u.c... cVarArr) {
        this(org.minidns.dnsname.a.h(str), (List<u.c>) Arrays.asList(cVarArr));
    }

    public o(org.minidns.dnsname.a aVar, List<u.c> list) {
        this.f87472d = aVar;
        this.f87474f = Collections.unmodifiableList(list);
        this.f87473e = h(list);
    }
}
