package com.googlecode.mp4parser.authoring.tracks.h265;

import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.mp4parser.iso14496.part15.b;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: H265TrackImplOld.java */
/* loaded from: classes6.dex */
public class e {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 16;
    private static final int H = 17;
    private static final int I = 18;
    private static final int J = 19;
    private static final int K = 20;
    private static final int L = 21;
    private static final long M = 1048576;

    /* renamed from: f, reason: collision with root package name */
    public static final int f63656f = 32;

    /* renamed from: g, reason: collision with root package name */
    public static final int f63657g = 33;

    /* renamed from: h, reason: collision with root package name */
    public static final int f63658h = 34;

    /* renamed from: i, reason: collision with root package name */
    public static final int f63659i = 35;

    /* renamed from: j, reason: collision with root package name */
    public static final int f63660j = 39;

    /* renamed from: k, reason: collision with root package name */
    public static final int f63661k = 41;

    /* renamed from: l, reason: collision with root package name */
    public static final int f63662l = 42;

    /* renamed from: m, reason: collision with root package name */
    public static final int f63663m = 43;

    /* renamed from: n, reason: collision with root package name */
    public static final int f63664n = 44;

    /* renamed from: o, reason: collision with root package name */
    public static final int f63665o = 48;

    /* renamed from: p, reason: collision with root package name */
    public static final int f63666p = 49;

    /* renamed from: q, reason: collision with root package name */
    public static final int f63667q = 50;

    /* renamed from: r, reason: collision with root package name */
    public static final int f63668r = 51;

    /* renamed from: s, reason: collision with root package name */
    public static final int f63669s = 52;

    /* renamed from: t, reason: collision with root package name */
    public static final int f63670t = 53;

    /* renamed from: u, reason: collision with root package name */
    public static final int f63671u = 54;

    /* renamed from: v, reason: collision with root package name */
    public static final int f63672v = 55;

    /* renamed from: w, reason: collision with root package name */
    private static final int f63673w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static final int f63674x = 1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f63675y = 2;

    /* renamed from: z, reason: collision with root package name */
    private static final int f63676z = 3;

    /* renamed from: a, reason: collision with root package name */
    LinkedHashMap<Long, ByteBuffer> f63677a = new LinkedHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    LinkedHashMap<Long, ByteBuffer> f63678b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    LinkedHashMap<Long, ByteBuffer> f63679c = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    List<Long> f63680d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63681e = new ArrayList();

    /* compiled from: H265TrackImplOld.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        long f63682a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f63683b = 0;

        /* renamed from: c, reason: collision with root package name */
        com.googlecode.mp4parser.a f63684c;

        /* renamed from: d, reason: collision with root package name */
        ByteBuffer f63685d;

        /* renamed from: e, reason: collision with root package name */
        long f63686e;

        a(com.googlecode.mp4parser.a aVar) throws IOException {
            this.f63684c = aVar;
            c();
        }

        void a() {
            this.f63683b++;
        }

        void b() {
            int i4 = this.f63683b + 3;
            this.f63683b = i4;
            this.f63686e = this.f63682a + i4;
        }

        public void c() throws IOException {
            com.googlecode.mp4parser.a aVar = this.f63684c;
            this.f63685d = aVar.e3(this.f63682a, Math.min(aVar.size() - this.f63682a, 1048576L));
        }

        public ByteBuffer d() {
            long j4 = this.f63686e;
            long j5 = this.f63682a;
            if (j4 < j5) {
                throw new RuntimeException(ProtectedSandApp.s("ඣ\u0001"));
            }
            this.f63685d.position((int) (j4 - j5));
            ByteBuffer slice = this.f63685d.slice();
            slice.limit((int) (this.f63683b - (this.f63686e - this.f63682a)));
            return slice;
        }

        boolean e() throws IOException {
            int limit = this.f63685d.limit();
            int i4 = this.f63683b;
            if (limit - i4 >= 3) {
                return this.f63685d.get(i4) == 0 && this.f63685d.get(this.f63683b + 1) == 0 && (this.f63685d.get(this.f63683b + 2) == 0 || this.f63685d.get(this.f63683b + 2) == 1);
            }
            if (this.f63682a + i4 + 3 > this.f63684c.size()) {
                return this.f63682a + ((long) this.f63683b) == this.f63684c.size();
            }
            this.f63682a = this.f63686e;
            this.f63683b = 0;
            c();
            return e();
        }

        boolean f() throws IOException {
            int limit = this.f63685d.limit();
            int i4 = this.f63683b;
            if (limit - i4 >= 3) {
                return this.f63685d.get(i4) == 0 && this.f63685d.get(this.f63683b + 1) == 0 && this.f63685d.get(this.f63683b + 2) == 1;
            }
            if (this.f63682a + i4 == this.f63684c.size()) {
                throw new EOFException();
            }
            throw new RuntimeException(ProtectedSandApp.s("ඤ\u0001"));
        }
    }

    /* compiled from: H265TrackImplOld.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f63688a;

        /* renamed from: b, reason: collision with root package name */
        int f63689b;

        /* renamed from: c, reason: collision with root package name */
        int f63690c;

        /* renamed from: d, reason: collision with root package name */
        int f63691d;
    }

    /* compiled from: H265TrackImplOld.java */
    public enum c {
        AUD_SEI_SLICE,
        SEI_SLICE,
        SLICE_OES_EOB;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            int length = valuesCustom.length;
            c[] cVarArr = new c[length];
            System.arraycopy(valuesCustom, 0, cVarArr, 0, length);
            return cVarArr;
        }
    }

    public e(com.googlecode.mp4parser.a aVar) throws IOException {
        a aVar2 = new a(aVar);
        ArrayList arrayList = new ArrayList();
        long j4 = 1;
        int i4 = 0;
        while (true) {
            ByteBuffer b5 = b(aVar2);
            if (b5 == null) {
                System.err.println("");
                com.mp4parser.iso14496.part15.b bVar = new com.mp4parser.iso14496.part15.b();
                bVar.y(c());
                bVar.z(0);
                return;
            }
            b e4 = e(b5);
            switch (e4.f63689b) {
                case 32:
                    this.f63677a.put(Long.valueOf(j4), b5);
                    break;
                case 33:
                    this.f63678b.put(Long.valueOf(j4), b5);
                    break;
                case 34:
                    this.f63679c.put(Long.valueOf(j4), b5);
                    break;
            }
            int i5 = e4.f63689b;
            i4 = i5 < 32 ? i5 : i4;
            if (g(i5, b5, arrayList) && !arrayList.isEmpty()) {
                System.err.println(ProtectedSandApp.s("ඨ\u0001"));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    b e5 = e(byteBuffer);
                    System.err.println(String.format(ProtectedSandApp.s("ඪ\u0001"), Integer.valueOf(e5.f63689b), Integer.valueOf(e5.f63690c), Integer.valueOf(e5.f63691d), Integer.valueOf(byteBuffer.limit())));
                }
                System.err.println(ProtectedSandApp.s("ඩ\u0001"));
                this.f63681e.add(a(arrayList));
                arrayList.clear();
                j4++;
            }
            arrayList.add(b5);
            if (i4 >= 16 && i4 <= 21) {
                this.f63680d.add(Long.valueOf(j4));
            }
        }
    }

    private ByteBuffer b(a aVar) throws IOException {
        while (!aVar.f()) {
            try {
                aVar.a();
            } catch (EOFException unused) {
                return null;
            }
        }
        aVar.b();
        while (!aVar.e()) {
            aVar.a();
        }
        return aVar.d();
    }

    private List<b.a> c() {
        b.a aVar = new b.a();
        aVar.f70062a = true;
        aVar.f70064c = 32;
        aVar.f70065d = new ArrayList();
        for (ByteBuffer byteBuffer : this.f63677a.values()) {
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.position(0);
            byteBuffer.get(bArr);
            aVar.f70065d.add(bArr);
        }
        b.a aVar2 = new b.a();
        aVar2.f70062a = true;
        aVar2.f70064c = 33;
        aVar2.f70065d = new ArrayList();
        for (ByteBuffer byteBuffer2 : this.f63678b.values()) {
            byte[] bArr2 = new byte[byteBuffer2.limit()];
            byteBuffer2.position(0);
            byteBuffer2.get(bArr2);
            aVar2.f70065d.add(bArr2);
        }
        b.a aVar3 = new b.a();
        aVar3.f70062a = true;
        aVar3.f70064c = 33;
        aVar3.f70065d = new ArrayList();
        for (ByteBuffer byteBuffer3 : this.f63679c.values()) {
            byte[] bArr3 = new byte[byteBuffer3.limit()];
            byteBuffer3.position(0);
            byteBuffer3.get(bArr3);
            aVar3.f70065d.add(bArr3);
        }
        return Arrays.asList(aVar, aVar2, aVar3);
    }

    private void f(boolean z4, int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        boolean z5;
        boolean z6;
        boolean z7;
        if (z4) {
            z5 = bVar.p(ProtectedSandApp.s("ණ\u0001"));
            z6 = bVar.p(ProtectedSandApp.s("ඬ\u0001"));
            if (z5 || z6) {
                z7 = bVar.p(ProtectedSandApp.s("ත\u0001"));
                if (z7) {
                    bVar.w(8, ProtectedSandApp.s("ථ\u0001"));
                    bVar.w(5, ProtectedSandApp.s("ද\u0001"));
                    bVar.p(ProtectedSandApp.s("ධ\u0001"));
                    bVar.w(5, ProtectedSandApp.s("න\u0001"));
                }
                bVar.w(4, ProtectedSandApp.s("\u0db2\u0001"));
                bVar.w(4, ProtectedSandApp.s("ඳ\u0001"));
                if (z7) {
                    bVar.w(4, ProtectedSandApp.s("ප\u0001"));
                }
                bVar.w(5, ProtectedSandApp.s("ඵ\u0001"));
                bVar.w(5, ProtectedSandApp.s("බ\u0001"));
                bVar.w(5, ProtectedSandApp.s("භ\u0001"));
            } else {
                z7 = false;
            }
        } else {
            z5 = false;
            z6 = false;
            z7 = false;
        }
        boolean[] zArr = new boolean[i4];
        boolean[] zArr2 = new boolean[i4];
        boolean[] zArr3 = new boolean[i4];
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 <= i4; i5++) {
            String s4 = ProtectedSandApp.s("ම\u0001");
            String s5 = ProtectedSandApp.s("ඹ\u0001");
            boolean a5 = com.googlecode.mp4parser.authoring.tracks.h264.d.a(s4, i5, s5, bVar);
            zArr[i5] = a5;
            if (!a5) {
                zArr2[i5] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ය\u0001"), i5, s5, bVar);
            }
            if (zArr2[i5]) {
                iArr2[i5] = d.a(ProtectedSandApp.s("ර\u0001"), i5, s5, bVar);
            } else {
                zArr3[i5] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0dbc\u0001"), i5, s5, bVar);
            }
            if (!zArr3[i5]) {
                iArr[i5] = d.a(ProtectedSandApp.s("ල\u0001"), i5, s5, bVar);
            }
            if (z5) {
                j(i5, iArr[i5], z7, bVar);
            }
            if (z6) {
                j(i5, iArr[i5], z7, bVar);
            }
        }
    }

    public static void h(String[] strArr) throws IOException {
        new e(new com.googlecode.mp4parser.c(ProtectedSandApp.s("\u0dbe\u0001")));
    }

    protected com.googlecode.mp4parser.authoring.f a(List<ByteBuffer> list) {
        byte[] bArr = new byte[list.size() * 4];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Iterator<ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            wrap.putInt(it.next().remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = i4 * 2;
            byteBufferArr[i5] = ByteBuffer.wrap(bArr, i4 * 4, 4);
            byteBufferArr[i5 + 1] = list.get(i4);
        }
        return new com.googlecode.mp4parser.authoring.g(byteBufferArr);
    }

    public int d(ByteBuffer byteBuffer) throws IOException {
        String s4;
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(Channels.newInputStream(new com.googlecode.mp4parser.util.b((ByteBuffer) byteBuffer.position(0))));
        bVar.s(4, ProtectedSandApp.s("\u0dbf\u0001"));
        bVar.s(2, ProtectedSandApp.s("ව\u0001"));
        bVar.s(6, ProtectedSandApp.s("ශ\u0001"));
        int s5 = (int) bVar.s(3, ProtectedSandApp.s("ෂ\u0001"));
        bVar.p(ProtectedSandApp.s("ස\u0001"));
        bVar.s(16, ProtectedSandApp.s("හ\u0001"));
        i(s5, bVar);
        boolean p4 = bVar.p(ProtectedSandApp.s("ළ\u0001"));
        int[] iArr = new int[p4 ? 0 : s5];
        int[] iArr2 = new int[p4 ? 0 : s5];
        int[] iArr3 = new int[p4 ? 0 : s5];
        int i4 = p4 ? 0 : s5;
        while (true) {
            s4 = ProtectedSandApp.s("ඹ\u0001");
            if (i4 > s5) {
                break;
            }
            String s6 = ProtectedSandApp.s("ු\u0001");
            iArr[i4] = d.a(s6, i4, s4, bVar);
            iArr2[i4] = d.a(s6, i4, s4, bVar);
            iArr3[i4] = d.a(s6, i4, s4, bVar);
            i4++;
        }
        int s7 = (int) bVar.s(6, ProtectedSandApp.s("ෆ\u0001"));
        int y4 = bVar.y(ProtectedSandApp.s("\u0dc7\u0001"));
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, y4, s7);
        for (int i5 = 1; i5 <= y4; i5++) {
            for (int i6 = 0; i6 <= s7; i6++) {
                zArr[i5][i6] = bVar.p(q2.a(ProtectedSandApp.s("ි\u0001"), i5, ProtectedSandApp.s("ී\u0001"), i6, s4));
            }
        }
        if (bVar.p(ProtectedSandApp.s("\u0dc8\u0001"))) {
            bVar.s(32, ProtectedSandApp.s("\u0dc9\u0001"));
            bVar.s(32, ProtectedSandApp.s("්\u0001"));
            if (bVar.p(ProtectedSandApp.s("\u0dcb\u0001"))) {
                bVar.y(ProtectedSandApp.s("\u0dcc\u0001"));
            }
            int y5 = bVar.y(ProtectedSandApp.s("\u0dcd\u0001"));
            int[] iArr4 = new int[y5];
            boolean[] zArr2 = new boolean[y5];
            for (int i7 = 0; i7 < y5; i7++) {
                iArr4[i7] = d.a(ProtectedSandApp.s("\u0dce\u0001"), i7, s4, bVar);
                if (i7 > 0) {
                    zArr2[i7] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ා\u0001"), i7, s4, bVar);
                } else {
                    zArr2[0] = true;
                }
                f(zArr2[i7], s5, bVar);
            }
        }
        if (bVar.p(ProtectedSandApp.s("ැ\u0001"))) {
            while (bVar.f()) {
                bVar.p(ProtectedSandApp.s("ෑ\u0001"));
            }
        }
        bVar.v();
        return 0;
    }

    public b e(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int i4 = com.coremedia.iso.g.i(byteBuffer);
        b bVar = new b();
        bVar.f63688a = (32768 & i4) >> 15;
        bVar.f63689b = (i4 & 32256) >> 9;
        bVar.f63690c = (i4 & 504) >> 3;
        bVar.f63691d = i4 & 7;
        return bVar;
    }

    boolean g(int i4, ByteBuffer byteBuffer, List<ByteBuffer> list) {
        if (list.isEmpty()) {
            return true;
        }
        boolean z4 = e((ByteBuffer) androidx.appcompat.view.menu.d.a(list, 1)).f63689b <= 31;
        switch (i4) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 39:
            case 41:
            case 42:
            case 43:
            case 44:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                if (z4) {
                    return true;
                }
                break;
        }
        switch (i4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                switch (i4) {
                }
                return true;
        }
        byteBuffer.position(0);
        byteBuffer.get(new byte[50]);
        byteBuffer.position(2);
        return z4 && (com.coremedia.iso.g.p(byteBuffer) & 128) > 0;
    }

    public void i(int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        String s4;
        int i5 = i4;
        int i6 = 2;
        bVar.w(2, ProtectedSandApp.s("\u0dd5\u0001"));
        bVar.p(ProtectedSandApp.s("ූ\u0001"));
        bVar.w(5, ProtectedSandApp.s("\u0dd7\u0001"));
        int i7 = 32;
        boolean[] zArr = new boolean[32];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            s4 = ProtectedSandApp.s("ඹ\u0001");
            if (i11 >= i7) {
                break;
            }
            zArr[i11] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("෫\u0001"), i11, s4, bVar);
            i11++;
            i5 = i4;
            i7 = 32;
            i6 = 2;
            i10 = 0;
        }
        bVar.p(ProtectedSandApp.s("ෘ\u0001"));
        bVar.p(ProtectedSandApp.s("ෙ\u0001"));
        bVar.p(ProtectedSandApp.s("ේ\u0001"));
        bVar.p(ProtectedSandApp.s("ෛ\u0001"));
        bVar.w(44, ProtectedSandApp.s("ො\u0001"));
        bVar.w(8, ProtectedSandApp.s("ෝ\u0001"));
        boolean[] zArr2 = new boolean[i5];
        boolean[] zArr3 = new boolean[i5];
        int i12 = i10;
        while (i12 < i5) {
            zArr2[i12] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("෩\u0001"), i12, s4, bVar);
            zArr3[i12] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("෪\u0001"), i12, s4, bVar);
            i12++;
            i5 = i4;
            i7 = 32;
            i6 = 2;
            i10 = 0;
        }
        if (i5 > 0) {
            for (int i13 = i5; i13 < 8; i13++) {
                bVar.w(i6, ProtectedSandApp.s("ෞ\u0001"));
            }
        }
        int[] iArr = new int[i5];
        boolean[] zArr4 = new boolean[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i6];
        iArr3[1] = i7;
        iArr3[i10] = i5;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iArr3);
        boolean[] zArr6 = new boolean[i5];
        boolean[] zArr7 = new boolean[i5];
        boolean[] zArr8 = new boolean[i5];
        boolean[] zArr9 = new boolean[i5];
        int[] iArr4 = new int[i5];
        int i14 = 0;
        while (i14 < i5) {
            if (zArr2[i14]) {
                iArr[i14] = bVar.w(2, ProtectedSandApp.s("ෟ\u0001") + i14 + s4);
                zArr4[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0de0\u0001"), i14, s4, bVar);
                iArr2[i14] = bVar.w(5, ProtectedSandApp.s("\u0de1\u0001") + i14 + s4);
                int i15 = 0;
                for (int i16 = 32; i15 < i16; i16 = 32) {
                    zArr5[i14][i15] = bVar.p(q2.a(ProtectedSandApp.s("෧\u0001"), i14, ProtectedSandApp.s("ී\u0001"), i15, s4));
                    i15++;
                    zArr6 = zArr6;
                }
                zArr6[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0de2\u0001"), i14, s4, bVar);
                zArr7[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0de3\u0001"), i14, s4, bVar);
                zArr8[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0de4\u0001"), i14, s4, bVar);
                zArr9[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0de5\u0001"), i14, s4, bVar);
                bVar.s(44, ProtectedSandApp.s("෦\u0001"));
            }
            boolean[] zArr10 = zArr6;
            if (zArr3[i14]) {
                iArr4[i14] = bVar.w(8, ProtectedSandApp.s("෨\u0001"));
            }
            i14++;
            i5 = i4;
            zArr6 = zArr10;
        }
    }

    void j(int i4, int i5, boolean z4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        boolean[] zArr = new boolean[i5];
        for (int i6 = 0; i6 <= i5; i6++) {
            String s4 = ProtectedSandApp.s("෬\u0001");
            String s5 = ProtectedSandApp.s("ඹ\u0001");
            iArr[i6] = d.a(s4, i6, s5, bVar);
            iArr2[i6] = d.a(ProtectedSandApp.s("෭\u0001"), i6, s5, bVar);
            if (z4) {
                iArr3[i6] = d.a(ProtectedSandApp.s("෮\u0001"), i6, s5, bVar);
                iArr4[i6] = d.a(ProtectedSandApp.s("෯\u0001"), i6, s5, bVar);
            }
            zArr[i6] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0df0\u0001"), i6, s5, bVar);
        }
    }
}
