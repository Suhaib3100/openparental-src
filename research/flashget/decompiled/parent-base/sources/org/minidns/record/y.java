package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.minidns.record.u;

/* compiled from: TXT.java */
/* loaded from: classes9.dex */
public class y extends h {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f87525d;

    /* renamed from: e, reason: collision with root package name */
    private transient String f87526e;

    /* renamed from: f, reason: collision with root package name */
    private transient List<String> f87527f;

    public y(byte[] bArr) {
        this.f87525d = bArr;
    }

    public static y l(DataInputStream dataInputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        dataInputStream.readFully(bArr);
        return new y(bArr);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.TXT;
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f87525d);
    }

    public byte[] h() {
        return (byte[]) this.f87525d.clone();
    }

    public List<String> i() {
        if (this.f87527f == null) {
            List<byte[]> j4 = j();
            ArrayList arrayList = new ArrayList(j4.size());
            Iterator<byte[]> it = j4.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new String(it.next(), "UTF-8"));
                } catch (UnsupportedEncodingException e4) {
                    throw new AssertionError(e4);
                }
            }
            this.f87527f = Collections.unmodifiableList(arrayList);
        }
        return this.f87527f;
    }

    public List<byte[]> j() {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f87525d;
            if (i4 >= bArr.length) {
                return arrayList;
            }
            int i5 = bArr[i4] & 255;
            int i6 = i4 + 1;
            int i7 = i5 + i6;
            arrayList.add(Arrays.copyOfRange(bArr, i6, i7));
            i4 = i7;
        }
    }

    public String k() {
        if (this.f87526e == null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = i().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append(" / ");
                }
            }
            this.f87526e = sb.toString();
        }
        return this.f87526e;
    }

    public String toString() {
        return "\"" + k() + "\"";
    }
}
