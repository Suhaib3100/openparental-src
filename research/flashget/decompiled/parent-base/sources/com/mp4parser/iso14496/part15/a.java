package com.mp4parser.iso14496.part15;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.tracks.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ya.h;

/* compiled from: AvcDecoderConfigurationRecord.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f70019a;

    /* renamed from: b, reason: collision with root package name */
    public int f70020b;

    /* renamed from: c, reason: collision with root package name */
    public int f70021c;

    /* renamed from: d, reason: collision with root package name */
    public int f70022d;

    /* renamed from: e, reason: collision with root package name */
    public int f70023e;

    /* renamed from: f, reason: collision with root package name */
    public List<byte[]> f70024f;

    /* renamed from: g, reason: collision with root package name */
    public List<byte[]> f70025g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70026h;

    /* renamed from: i, reason: collision with root package name */
    public int f70027i;

    /* renamed from: j, reason: collision with root package name */
    public int f70028j;

    /* renamed from: k, reason: collision with root package name */
    public int f70029k;

    /* renamed from: l, reason: collision with root package name */
    public List<byte[]> f70030l;

    /* renamed from: m, reason: collision with root package name */
    public int f70031m;

    /* renamed from: n, reason: collision with root package name */
    public int f70032n;

    /* renamed from: o, reason: collision with root package name */
    public int f70033o;

    /* renamed from: p, reason: collision with root package name */
    public int f70034p;

    /* renamed from: q, reason: collision with root package name */
    public int f70035q;

    public a() {
        this.f70024f = new ArrayList();
        this.f70025g = new ArrayList();
        this.f70026h = true;
        this.f70027i = 1;
        this.f70028j = 0;
        this.f70029k = 0;
        this.f70030l = new ArrayList();
        this.f70031m = 63;
        this.f70032n = 7;
        this.f70033o = 31;
        this.f70034p = 31;
        this.f70035q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        i.m(byteBuffer, this.f70019a);
        i.m(byteBuffer, this.f70020b);
        i.m(byteBuffer, this.f70021c);
        i.m(byteBuffer, this.f70022d);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
        dVar.a(this.f70031m, 6);
        dVar.a(this.f70023e, 2);
        dVar.a(this.f70032n, 3);
        dVar.a(this.f70025g.size(), 5);
        for (byte[] bArr : this.f70024f) {
            i.f(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        i.m(byteBuffer, this.f70025g.size());
        for (byte[] bArr2 : this.f70025g) {
            i.f(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f70026h) {
            int i4 = this.f70020b;
            if (i4 == 100 || i4 == 110 || i4 == 122 || i4 == 144) {
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
                dVar2.a(this.f70033o, 6);
                dVar2.a(this.f70027i, 2);
                dVar2.a(this.f70034p, 5);
                dVar2.a(this.f70028j, 3);
                dVar2.a(this.f70035q, 5);
                dVar2.a(this.f70029k, 3);
                for (byte[] bArr3 : this.f70030l) {
                    i.f(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        int i4;
        long j4 = 6;
        while (this.f70024f.iterator().hasNext()) {
            j4 = j4 + 2 + r0.next().length;
        }
        long j5 = j4 + 1;
        while (this.f70025g.iterator().hasNext()) {
            j5 = j5 + 2 + r3.next().length;
        }
        if (this.f70026h && ((i4 = this.f70020b) == 100 || i4 == 110 || i4 == 122 || i4 == 144)) {
            j5 += 4;
            while (this.f70030l.iterator().hasNext()) {
                j5 = j5 + 2 + r0.next().length;
            }
        }
        return j5;
    }

    public String[] c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f70025g) {
            try {
                arrayList.add(ya.e.b(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList(this.f70025g.size());
        Iterator<byte[]> it = this.f70025g.iterator();
        while (it.hasNext()) {
            arrayList.add(com.coremedia.iso.e.b(it.next()));
        }
        return arrayList;
    }

    public String[] e() {
        String s4;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f70024f) {
            try {
                s4 = h.c(new k(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                s4 = ProtectedSandApp.s("ᥞ\u0001");
            }
            arrayList.add(s4);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> f() {
        ArrayList arrayList = new ArrayList(this.f70030l.size());
        Iterator<byte[]> it = this.f70030l.iterator();
        while (it.hasNext()) {
            arrayList.add(com.coremedia.iso.e.b(it.next()));
        }
        return arrayList;
    }

    public List<String> g() {
        ArrayList arrayList = new ArrayList(this.f70024f.size());
        Iterator<byte[]> it = this.f70024f.iterator();
        while (it.hasNext()) {
            arrayList.add(com.coremedia.iso.e.b(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᥟ\u0001"));
        sb.append(this.f70019a);
        sb.append(ProtectedSandApp.s("ᥠ\u0001"));
        sb.append(this.f70020b);
        sb.append(ProtectedSandApp.s("ᥡ\u0001"));
        sb.append(this.f70021c);
        sb.append(ProtectedSandApp.s("ᥢ\u0001"));
        sb.append(this.f70022d);
        sb.append(ProtectedSandApp.s("ᥣ\u0001"));
        sb.append(this.f70023e);
        sb.append(ProtectedSandApp.s("ᥤ\u0001"));
        sb.append(this.f70026h);
        sb.append(ProtectedSandApp.s("ᥥ\u0001"));
        sb.append(this.f70027i);
        sb.append(ProtectedSandApp.s("ᥦ\u0001"));
        sb.append(this.f70028j);
        sb.append(ProtectedSandApp.s("ᥧ\u0001"));
        sb.append(this.f70029k);
        sb.append(ProtectedSandApp.s("ᥨ\u0001"));
        sb.append(this.f70031m);
        sb.append(ProtectedSandApp.s("ᥩ\u0001"));
        sb.append(this.f70032n);
        sb.append(ProtectedSandApp.s("ᥪ\u0001"));
        sb.append(this.f70033o);
        sb.append(ProtectedSandApp.s("ᥫ\u0001"));
        sb.append(this.f70034p);
        sb.append(ProtectedSandApp.s("ᥬ\u0001"));
        return androidx.view.e.a(sb, this.f70035q, '}');
    }

    public a(ByteBuffer byteBuffer) {
        int i4;
        this.f70024f = new ArrayList();
        this.f70025g = new ArrayList();
        this.f70026h = true;
        this.f70027i = 1;
        this.f70028j = 0;
        this.f70029k = 0;
        this.f70030l = new ArrayList();
        this.f70031m = 63;
        this.f70032n = 7;
        this.f70033o = 31;
        this.f70034p = 31;
        this.f70035q = 31;
        this.f70019a = g.p(byteBuffer);
        this.f70020b = g.p(byteBuffer);
        this.f70021c = g.p(byteBuffer);
        this.f70022d = g.p(byteBuffer);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.f70031m = cVar.c(6);
        this.f70023e = cVar.c(2);
        this.f70032n = cVar.c(3);
        int c5 = cVar.c(5);
        for (int i5 = 0; i5 < c5; i5++) {
            byte[] bArr = new byte[g.i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f70024f.add(bArr);
        }
        long p4 = g.p(byteBuffer);
        for (int i6 = 0; i6 < p4; i6++) {
            byte[] bArr2 = new byte[g.i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f70025g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f70026h = false;
        }
        if (this.f70026h && ((i4 = this.f70020b) == 100 || i4 == 110 || i4 == 122 || i4 == 144)) {
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
            this.f70033o = cVar2.c(6);
            this.f70027i = cVar2.c(2);
            this.f70034p = cVar2.c(5);
            this.f70028j = cVar2.c(3);
            this.f70035q = cVar2.c(5);
            this.f70029k = cVar2.c(3);
            long p5 = g.p(byteBuffer);
            for (int i7 = 0; i7 < p5; i7++) {
                byte[] bArr3 = new byte[g.i(byteBuffer)];
                byteBuffer.get(bArr3);
                this.f70030l.add(bArr3);
            }
            return;
        }
        this.f70027i = -1;
        this.f70028j = -1;
        this.f70029k = -1;
    }
}
