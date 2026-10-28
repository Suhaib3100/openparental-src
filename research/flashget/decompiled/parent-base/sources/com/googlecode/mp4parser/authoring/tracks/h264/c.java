package com.googlecode.mp4parser.authoring.tracks.h264;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.tracks.c;
import com.googlecode.mp4parser.authoring.tracks.h264.e;
import com.googlecode.mp4parser.authoring.tracks.k;
import com.googlecode.mp4parser.util.l;
import com.googlecode.mp4parser.util.n;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.tencent.mmkv.MMKV;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import ya.h;
import ya.i;

/* compiled from: H264TrackImpl.java */
/* loaded from: classes6.dex */
public class c extends com.googlecode.mp4parser.authoring.tracks.c {
    private static final Logger J = Logger.getLogger(c.class.getName());
    int A;
    private List<f> B;
    private int C;
    private int D;
    private long E;
    private int F;
    private C0963c G;
    private boolean H;
    private String I;

    /* renamed from: m, reason: collision with root package name */
    Map<Integer, byte[]> f63555m;

    /* renamed from: n, reason: collision with root package name */
    Map<Integer, h> f63556n;

    /* renamed from: o, reason: collision with root package name */
    Map<Integer, byte[]> f63557o;

    /* renamed from: p, reason: collision with root package name */
    Map<Integer, ya.e> f63558p;

    /* renamed from: q, reason: collision with root package name */
    SampleDescriptionBox f63559q;

    /* renamed from: r, reason: collision with root package name */
    h f63560r;

    /* renamed from: s, reason: collision with root package name */
    ya.e f63561s;

    /* renamed from: t, reason: collision with root package name */
    h f63562t;

    /* renamed from: u, reason: collision with root package name */
    ya.e f63563u;

    /* renamed from: v, reason: collision with root package name */
    n<Integer, byte[]> f63564v;

    /* renamed from: w, reason: collision with root package name */
    n<Integer, byte[]> f63565w;

    /* renamed from: x, reason: collision with root package name */
    int f63566x;

    /* renamed from: y, reason: collision with root package name */
    int[] f63567y;

    /* renamed from: z, reason: collision with root package name */
    int f63568z;

    /* compiled from: H264TrackImpl.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        int f63569a;

        /* renamed from: b, reason: collision with root package name */
        int f63570b;

        /* renamed from: c, reason: collision with root package name */
        boolean f63571c;

        /* renamed from: d, reason: collision with root package name */
        boolean f63572d;

        /* renamed from: e, reason: collision with root package name */
        int f63573e;

        /* renamed from: f, reason: collision with root package name */
        int f63574f;

        /* renamed from: g, reason: collision with root package name */
        int f63575g;

        /* renamed from: h, reason: collision with root package name */
        int f63576h;

        /* renamed from: i, reason: collision with root package name */
        int f63577i;

        /* renamed from: j, reason: collision with root package name */
        int f63578j;

        /* renamed from: k, reason: collision with root package name */
        boolean f63579k;

        /* renamed from: l, reason: collision with root package name */
        int f63580l;

        public a(ByteBuffer byteBuffer, int i4, int i5) {
            e eVar = new e(c.f(c.this.new b(byteBuffer)), c.this.f63556n, c.this.f63558p, i5 == 5);
            this.f63569a = eVar.f63609e;
            int i6 = eVar.f63607c;
            this.f63570b = i6;
            this.f63571c = eVar.f63610f;
            this.f63572d = eVar.f63611g;
            this.f63573e = i4;
            this.f63574f = c.this.f63556n.get(Integer.valueOf(c.this.f63558p.get(Integer.valueOf(i6)).f93318f)).f93344a;
            this.f63575g = eVar.f63614j;
            this.f63576h = eVar.f63613i;
            this.f63577i = eVar.f63615k;
            this.f63578j = eVar.f63616l;
            this.f63580l = eVar.f63612h;
        }

        boolean a(a aVar) {
            boolean z4;
            boolean z5;
            boolean z6;
            if (aVar.f63569a != this.f63569a || aVar.f63570b != this.f63570b || (z4 = aVar.f63571c) != this.f63571c) {
                return true;
            }
            if ((z4 && aVar.f63572d != this.f63572d) || aVar.f63573e != this.f63573e) {
                return true;
            }
            int i4 = aVar.f63574f;
            if (i4 == 0 && this.f63574f == 0 && (aVar.f63576h != this.f63576h || aVar.f63575g != this.f63575g)) {
                return true;
            }
            if (!(i4 == 1 && this.f63574f == 1 && (aVar.f63577i != this.f63577i || aVar.f63578j != this.f63578j)) && (z5 = aVar.f63579k) == (z6 = this.f63579k)) {
                return z5 && z6 && aVar.f63580l != this.f63580l;
            }
            return true;
        }
    }

    /* compiled from: H264TrackImpl.java */
    /* renamed from: com.googlecode.mp4parser.authoring.tracks.h264.c$c, reason: collision with other inner class name */
    public class C0963c {

        /* renamed from: a, reason: collision with root package name */
        int f63584a;

        /* renamed from: b, reason: collision with root package name */
        int f63585b;

        /* renamed from: c, reason: collision with root package name */
        boolean f63586c;

        /* renamed from: d, reason: collision with root package name */
        int f63587d;

        /* renamed from: e, reason: collision with root package name */
        int f63588e;

        /* renamed from: f, reason: collision with root package name */
        boolean f63589f;

        /* renamed from: g, reason: collision with root package name */
        int f63590g;

        /* renamed from: h, reason: collision with root package name */
        int f63591h;

        /* renamed from: i, reason: collision with root package name */
        int f63592i;

        /* renamed from: j, reason: collision with root package name */
        int f63593j;

        /* renamed from: k, reason: collision with root package name */
        int f63594k;

        /* renamed from: l, reason: collision with root package name */
        int f63595l;

        /* renamed from: m, reason: collision with root package name */
        int f63596m;

        /* renamed from: n, reason: collision with root package name */
        int f63597n;

        /* renamed from: o, reason: collision with root package name */
        int f63598o;

        /* renamed from: p, reason: collision with root package name */
        int f63599p;

        /* renamed from: q, reason: collision with root package name */
        int f63600q;

        /* renamed from: r, reason: collision with root package name */
        int f63601r;

        /* renamed from: s, reason: collision with root package name */
        int f63602s;

        /* renamed from: t, reason: collision with root package name */
        h f63603t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [int] */
        /* JADX WARN: Type inference failed for: r10v3 */
        public C0963c(InputStream inputStream, h hVar) throws IOException {
            int i4;
            boolean z4 = false;
            this.f63584a = 0;
            this.f63585b = 0;
            this.f63603t = hVar;
            inputStream.read();
            int available = inputStream.available();
            int i5 = 0;
            while (i5 < available) {
                this.f63584a = z4 ? 1 : 0;
                this.f63585b = z4 ? 1 : 0;
                int read = inputStream.read();
                int i6 = i5 + 1;
                while (read == 255) {
                    this.f63584a += read;
                    read = inputStream.read();
                    i6++;
                    z4 = false;
                }
                this.f63584a += read;
                int read2 = inputStream.read();
                i5 = i6 + 1;
                while (read2 == 255) {
                    this.f63585b += read2;
                    read2 = inputStream.read();
                    i5++;
                    z4 = false;
                }
                int i7 = this.f63585b + read2;
                this.f63585b = i7;
                if (available - i5 >= i7) {
                    int i10 = 1;
                    if (this.f63584a == 1) {
                        i iVar = hVar.M;
                        if (iVar == null || (iVar.f93391v == null && iVar.f93392w == null && !iVar.f93390u)) {
                            for (int i11 = 0; i11 < this.f63585b; i11++) {
                                inputStream.read();
                                i5++;
                            }
                        } else {
                            byte[] bArr = new byte[i7];
                            inputStream.read(bArr);
                            i5 += this.f63585b;
                            com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(new ByteArrayInputStream(bArr));
                            i iVar2 = hVar.M;
                            ya.d dVar = iVar2.f93391v;
                            if (dVar == null && iVar2.f93392w == null) {
                                this.f63586c = z4;
                            } else {
                                this.f63586c = true;
                                this.f63587d = (int) bVar.s(dVar.f93310h + 1, ProtectedSandApp.s("ൂ\u0001"));
                                this.f63588e = (int) bVar.s(hVar.M.f93391v.f93311i + 1, ProtectedSandApp.s("ൃ\u0001"));
                            }
                            if (hVar.M.f93390u) {
                                int s4 = (int) bVar.s(4, ProtectedSandApp.s("ൄ\u0001"));
                                this.f63590g = s4;
                                switch (s4) {
                                    case 3:
                                    case 4:
                                    case 7:
                                        i4 = 2;
                                        break;
                                    case 5:
                                    case 6:
                                    case 8:
                                        i4 = 3;
                                        break;
                                    default:
                                        i4 = 1;
                                        break;
                                }
                                for (?? r10 = z4; r10 < i4; r10++) {
                                    boolean a5 = d.a(ProtectedSandApp.s("\u0d45\u0001"), r10, ProtectedSandApp.s("െ\u0001"), bVar);
                                    this.f63589f = a5;
                                    if (a5) {
                                        this.f63591h = (int) bVar.s(2, ProtectedSandApp.s("േ\u0001"));
                                        this.f63592i = (int) bVar.s(i10, ProtectedSandApp.s("ൈ\u0001"));
                                        this.f63593j = (int) bVar.s(5, ProtectedSandApp.s("\u0d49\u0001"));
                                        this.f63594k = (int) bVar.s(i10, ProtectedSandApp.s("ൊ\u0001"));
                                        this.f63595l = (int) bVar.s(i10, ProtectedSandApp.s("ോ\u0001"));
                                        this.f63596m = (int) bVar.s(i10, ProtectedSandApp.s("ൌ\u0001"));
                                        this.f63597n = (int) bVar.s(8, ProtectedSandApp.s("്\u0001"));
                                        int i12 = this.f63594k;
                                        String s5 = ProtectedSandApp.s("ൎ\u0001");
                                        String s6 = ProtectedSandApp.s("൏\u0001");
                                        String s7 = ProtectedSandApp.s("\u0d50\u0001");
                                        if (i12 == i10) {
                                            this.f63598o = (int) bVar.s(6, s7);
                                            this.f63599p = (int) bVar.s(6, s6);
                                            this.f63600q = (int) bVar.s(5, s5);
                                        } else if (bVar.p(ProtectedSandApp.s("\u0d51\u0001"))) {
                                            this.f63598o = (int) bVar.s(6, s7);
                                            if (bVar.p(ProtectedSandApp.s("\u0d52\u0001"))) {
                                                this.f63599p = (int) bVar.s(6, s6);
                                                if (bVar.p(ProtectedSandApp.s("\u0d53\u0001"))) {
                                                    this.f63600q = (int) bVar.s(5, s5);
                                                }
                                            }
                                        }
                                        i iVar3 = hVar.M;
                                        ya.d dVar2 = iVar3.f93391v;
                                        if (dVar2 != null) {
                                            this.f63601r = dVar2.f93312j;
                                        } else {
                                            ya.d dVar3 = iVar3.f93392w;
                                            if (dVar3 != null) {
                                                this.f63601r = dVar3.f93312j;
                                            } else {
                                                this.f63601r = 24;
                                            }
                                        }
                                        this.f63602s = (int) bVar.s(24, ProtectedSandApp.s("ൔ\u0001"));
                                    }
                                    i10 = 1;
                                }
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f63585b; i13++) {
                            inputStream.read();
                            i5++;
                        }
                    }
                } else {
                    i5 = available;
                }
                c.J.fine(toString());
                z4 = false;
            }
        }

        public String toString() {
            String str = ProtectedSandApp.s("ൕ\u0001") + this.f63584a + ProtectedSandApp.s("ൖ\u0001") + this.f63585b;
            if (this.f63584a == 1) {
                i iVar = this.f63603t.M;
                if (iVar.f93391v != null || iVar.f93392w != null) {
                    str = String.valueOf(str) + ProtectedSandApp.s("ൗ\u0001") + this.f63587d + ProtectedSandApp.s("൘\u0001") + this.f63588e;
                }
                if (this.f63603t.M.f93390u) {
                    str = String.valueOf(str) + ProtectedSandApp.s("൙\u0001") + this.f63590g;
                    if (this.f63589f) {
                        str = String.valueOf(str) + ProtectedSandApp.s("൚\u0001") + this.f63591h + ProtectedSandApp.s("൛\u0001") + this.f63592i + ProtectedSandApp.s("൜\u0001") + this.f63593j + ProtectedSandApp.s("൝\u0001") + this.f63594k + ProtectedSandApp.s("൞\u0001") + this.f63595l + ProtectedSandApp.s("ൟ\u0001") + this.f63596m + ProtectedSandApp.s("ൠ\u0001") + this.f63597n + ProtectedSandApp.s("ൡ\u0001") + this.f63598o + ProtectedSandApp.s("ൢ\u0001") + this.f63599p + ProtectedSandApp.s("ൣ\u0001") + this.f63600q + ProtectedSandApp.s("\u0d64\u0001") + this.f63601r + ProtectedSandApp.s("\u0d65\u0001") + this.f63602s;
                    }
                }
            }
            return String.valueOf(str).concat(ProtectedSandApp.s("൦\u0001"));
        }
    }

    public c(com.googlecode.mp4parser.a aVar, String str, long j4, int i4) throws IOException {
        super(aVar, true);
        this.f63555m = new HashMap();
        this.f63556n = new HashMap();
        this.f63557o = new HashMap();
        this.f63558p = new HashMap();
        this.f63560r = null;
        this.f63561s = null;
        this.f63562t = null;
        this.f63563u = null;
        this.f63564v = new n<>();
        this.f63565w = new n<>();
        this.f63566x = 0;
        this.f63567y = new int[0];
        this.f63568z = 0;
        this.A = 0;
        this.H = true;
        this.I = str;
        this.E = j4;
        this.F = i4;
        if (j4 > 0 && i4 > 0) {
            this.H = false;
        }
        t(new c.a(aVar));
    }

    static InputStream f(InputStream inputStream) {
        return new k(inputStream);
    }

    private int h(com.googlecode.mp4parser.authoring.tracks.h264.a aVar, e eVar) {
        int i4 = eVar.f63613i;
        int i5 = 1 << (eVar.f63618n.f93354k + 4);
        int i6 = this.f63568z;
        int i7 = (i4 >= i6 || i6 - i4 < i5 / 2) ? (i4 <= i6 || i4 - i6 <= i5 / 2) ? this.A : this.A - i5 : this.A + i5;
        if (aVar.f63527a != 0) {
            this.A = i7;
            this.f63568z = i4;
        }
        return i7 + i4;
    }

    private int i(int i4, com.googlecode.mp4parser.authoring.tracks.h264.a aVar, e eVar) {
        int i5;
        int i6 = 0;
        if (eVar.f63618n.O == 0) {
            i4 = 0;
        }
        if (aVar.f63527a == 0 && i4 > 0) {
            i4--;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            h hVar = eVar.f63618n;
            i5 = hVar.O;
            if (i7 >= i5) {
                break;
            }
            i10 += hVar.L[i7];
            i7++;
        }
        if (i4 > 0) {
            int i11 = i4 - 1;
            int i12 = i11 / i5;
            int i13 = i11 % i5;
            int i14 = i12 * i10;
            while (i6 <= i13) {
                i14 += eVar.f63618n.L[i6];
                i6++;
            }
            i6 = i14;
        }
        if (aVar.f63527a == 0) {
            i6 += eVar.f63618n.B;
        }
        return i6 + eVar.f63615k;
    }

    private int k(int i4, com.googlecode.mp4parser.authoring.tracks.h264.a aVar, e eVar) {
        return aVar.f63527a == 0 ? (i4 * 2) - 1 : i4 * 2;
    }

    private int l(int i4, com.googlecode.mp4parser.authoring.tracks.h264.a aVar, e eVar) {
        int i5 = eVar.f63618n.f93344a;
        return i5 == 0 ? h(aVar, eVar) : i5 == 1 ? i(i4, aVar, eVar) : k(i4, aVar, eVar);
    }

    private void m() {
        if (this.H) {
            i iVar = this.f63560r.M;
            if (iVar == null) {
                J.warning(ProtectedSandApp.s("൭\u0001"));
                this.E = 90000L;
                this.F = MMKV.ExpireInHour;
                return;
            }
            long j4 = iVar.f93387r >> 1;
            this.E = j4;
            int i4 = iVar.f93386q;
            this.F = i4;
            if (j4 == 0 || i4 == 0) {
                J.warning(ProtectedSandApp.s("൨\u0001") + this.E + ProtectedSandApp.s("൩\u0001") + this.F + ProtectedSandApp.s("൪\u0001"));
                this.E = 90000L;
                this.F = MMKV.ExpireInHour;
            }
            if (this.E / this.F > 100) {
                J.warning(ProtectedSandApp.s("൫\u0001") + (this.E / this.F) + ProtectedSandApp.s("൬\u0001"));
            }
        }
    }

    private void n(List<ByteBuffer> list) throws IOException {
        SampleDependencyTypeBox.a aVar = new SampleDependencyTypeBox.a(0);
        Iterator<ByteBuffer> it = list.iterator();
        com.googlecode.mp4parser.authoring.tracks.h264.a aVar2 = null;
        boolean z4 = false;
        while (it.hasNext()) {
            com.googlecode.mp4parser.authoring.tracks.h264.a o4 = o(it.next());
            int i4 = o4.f63528b;
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                if (i4 == 5) {
                    z4 = true;
                }
            }
            aVar2 = o4;
        }
        if (aVar2 == null) {
            J.warning(ProtectedSandApp.s("൮\u0001"));
            return;
        }
        if (z4) {
            g();
        }
        e eVar = new e(new k(new b((ByteBuffer) androidx.appcompat.view.menu.d.a(list, 1))), this.f63556n, this.f63558p, z4);
        if (aVar2.f63527a == 0) {
            aVar.i(2);
        } else {
            aVar.i(1);
        }
        e.a aVar3 = eVar.f63606b;
        if (aVar3 == e.a.I || aVar3 == e.a.SI) {
            aVar.g(2);
        } else {
            aVar.g(1);
        }
        f b5 = b(list);
        list.clear();
        C0963c c0963c = this.G;
        if (c0963c == null || c0963c.f63597n == 0) {
            this.f63566x = 0;
        }
        h hVar = eVar.f63618n;
        int i5 = hVar.f93344a;
        if (i5 == 0) {
            int i6 = 1 << (hVar.f93354k + 4);
            int i7 = eVar.f63613i;
            int i10 = this.f63568z;
            int i11 = (i7 >= i10 || i10 - i7 < i6 / 2) ? (i7 <= i10 || i7 - i10 <= i6 / 2) ? this.A : this.A - i6 : this.A + i6;
            this.f63567y = l.b(this.f63567y, i11 + i7);
            this.f63568z = i7;
            this.A = i11;
        } else {
            if (i5 == 1) {
                throw new RuntimeException(ProtectedSandApp.s("൯\u0001"));
            }
            if (i5 == 2) {
                this.f63567y = l.b(this.f63567y, this.B.size());
            }
        }
        this.f63498h.add(aVar);
        this.f63566x++;
        this.B.add(b5);
        if (z4) {
            this.f63499i.add(Integer.valueOf(this.B.size()));
        }
    }

    public static com.googlecode.mp4parser.authoring.tracks.h264.a o(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.authoring.tracks.h264.a aVar = new com.googlecode.mp4parser.authoring.tracks.h264.a();
        byte b5 = byteBuffer.get(0);
        aVar.f63527a = (b5 >> 5) & 3;
        aVar.f63528b = b5 & com.google.common.base.c.I;
        return aVar;
    }

    private void q(ByteBuffer byteBuffer) throws IOException {
        b bVar = new b(byteBuffer);
        bVar.read();
        ya.e b5 = ya.e.b(bVar);
        if (this.f63561s == null) {
            this.f63561s = b5;
        }
        this.f63563u = b5;
        byte[] d5 = com.googlecode.mp4parser.authoring.tracks.c.d((ByteBuffer) byteBuffer.rewind());
        byte[] bArr = this.f63557o.get(Integer.valueOf(b5.f93317e));
        if (bArr != null && !Arrays.equals(bArr, d5)) {
            throw new RuntimeException(ProtectedSandApp.s("൰\u0001"));
        }
        if (bArr == null) {
            this.f63565w.put(Integer.valueOf(this.B.size()), d5);
        }
        this.f63557o.put(Integer.valueOf(b5.f93317e), d5);
        this.f63558p.put(Integer.valueOf(b5.f93317e), b5);
    }

    private void s(ByteBuffer byteBuffer) throws IOException {
        k kVar = new k(new b(byteBuffer));
        kVar.read();
        h c5 = h.c(kVar);
        if (this.f63560r == null) {
            this.f63560r = c5;
            m();
        }
        this.f63562t = c5;
        byte[] d5 = com.googlecode.mp4parser.authoring.tracks.c.d((ByteBuffer) byteBuffer.rewind());
        byte[] bArr = this.f63555m.get(Integer.valueOf(c5.f93369z));
        if (bArr != null && !Arrays.equals(bArr, d5)) {
            throw new RuntimeException(ProtectedSandApp.s("൱\u0001"));
        }
        if (bArr != null) {
            this.f63564v.put(Integer.valueOf(this.B.size()), d5);
        }
        this.f63555m.put(Integer.valueOf(c5.f93369z), d5);
        this.f63556n.put(Integer.valueOf(c5.f93369z), c5);
    }

    private void t(c.a aVar) throws IOException {
        this.B = new ArrayList();
        if (!u(aVar)) {
            throw new IOException();
        }
        if (!x()) {
            throw new IOException();
        }
        this.f63559q = new SampleDescriptionBox();
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry(ProtectedSandApp.s("൲\u0001"));
        visualSampleEntry.setDataReferenceIndex(1);
        visualSampleEntry.setDepth(24);
        visualSampleEntry.setFrameCount(1);
        visualSampleEntry.setHorizresolution(72.0d);
        visualSampleEntry.setVertresolution(72.0d);
        visualSampleEntry.setWidth(this.C);
        visualSampleEntry.setHeight(this.D);
        visualSampleEntry.setCompressorname(ProtectedSandApp.s("൳\u0001"));
        AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
        avcConfigurationBox.setSequenceParameterSets(new ArrayList(this.f63555m.values()));
        avcConfigurationBox.setPictureParameterSets(new ArrayList(this.f63557o.values()));
        avcConfigurationBox.setAvcLevelIndication(this.f63560r.f93368y);
        avcConfigurationBox.setAvcProfileIndication(this.f63560r.f93360q);
        avcConfigurationBox.setBitDepthLumaMinus8(this.f63560r.f93357n);
        avcConfigurationBox.setBitDepthChromaMinus8(this.f63560r.f93358o);
        avcConfigurationBox.setChromaFormat(this.f63560r.f93352i.b());
        avcConfigurationBox.setConfigurationVersion(1);
        avcConfigurationBox.setLengthSizeMinusOne(3);
        h hVar = this.f63560r;
        avcConfigurationBox.setProfileCompatibility((hVar.f93362s ? 128 : 0) + (hVar.f93363t ? 64 : 0) + (hVar.f93364u ? 32 : 0) + (hVar.f93365v ? 16 : 0) + (hVar.f93366w ? 8 : 0) + ((int) (hVar.f93361r & 3)));
        visualSampleEntry.addBox(avcConfigurationBox);
        this.f63559q.addBox(visualSampleEntry);
        this.f63500j.o(new Date());
        this.f63500j.u(new Date());
        this.f63500j.r(this.I);
        this.f63500j.v(this.E);
        this.f63500j.z(this.C);
        this.f63500j.q(this.D);
    }

    private boolean u(c.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        a aVar2 = null;
        while (true) {
            ByteBuffer c5 = c(aVar);
            if (c5 != null) {
                com.googlecode.mp4parser.authoring.tracks.h264.a o4 = o(c5);
                int i4 = o4.f63528b;
                switch (i4) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        a aVar3 = new a(c5, o4.f63527a, i4);
                        if (aVar2 != null && aVar2.a(aVar3)) {
                            J.finer(ProtectedSandApp.s("ൺ\u0001"));
                            n(arrayList);
                        }
                        arrayList.add((ByteBuffer) c5.rewind());
                        aVar2 = aVar3;
                        continue;
                        break;
                    case 6:
                        if (aVar2 != null) {
                            J.finer(ProtectedSandApp.s("൹\u0001"));
                            n(arrayList);
                            aVar2 = null;
                        }
                        this.G = new C0963c(new k(new b(c5)), this.f63562t);
                        arrayList.add(c5);
                        continue;
                    case 7:
                        if (aVar2 != null) {
                            J.finer(ProtectedSandApp.s("൸\u0001"));
                            n(arrayList);
                            aVar2 = null;
                        }
                        s((ByteBuffer) c5.rewind());
                        continue;
                    case 8:
                        if (aVar2 != null) {
                            J.finer(ProtectedSandApp.s("൷\u0001"));
                            n(arrayList);
                            aVar2 = null;
                        }
                        q((ByteBuffer) c5.rewind());
                        continue;
                    case 9:
                        if (aVar2 != null) {
                            J.finer(ProtectedSandApp.s("൶\u0001"));
                            n(arrayList);
                            aVar2 = null;
                        }
                        arrayList.add(c5);
                        continue;
                    case 10:
                    case 11:
                        break;
                    case 12:
                    default:
                        J.warning(ProtectedSandApp.s("൴\u0001") + o4.f63528b);
                        continue;
                    case 13:
                        throw new RuntimeException(ProtectedSandApp.s("൵\u0001"));
                }
            }
        }
        if (arrayList.size() > 0) {
            n(arrayList);
        }
        g();
        long[] jArr = new long[this.B.size()];
        this.f63496f = jArr;
        Arrays.fill(jArr, this.F);
        return true;
    }

    private boolean x() {
        int i4;
        h hVar = this.f63560r;
        this.C = (hVar.f93356m + 1) * 16;
        int i5 = hVar.F ? 1 : 2;
        this.D = (hVar.f93355l + 1) * 16 * i5;
        if (hVar.G) {
            if ((!hVar.A ? hVar.f93352i.b() : 0) != 0) {
                i4 = this.f63560r.f93352i.d();
                i5 *= this.f63560r.f93352i.c();
            } else {
                i4 = 1;
            }
            int i6 = this.C;
            h hVar2 = this.f63560r;
            this.C = i6 - ((hVar2.H + hVar2.I) * i4);
            this.D -= (hVar2.J + hVar2.K) * i5;
        }
        return true;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> A() {
        return this.B;
    }

    public void g() {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f63567y.length) {
            int i7 = Integer.MAX_VALUE;
            int i10 = 0;
            for (int max = Math.max(0, i5 - 128); max < Math.min(this.f63567y.length, i5 + 128); max++) {
                int i11 = this.f63567y[max];
                if (i11 > i4 && i11 < i7) {
                    i10 = max;
                    i7 = i11;
                }
            }
            int[] iArr = this.f63567y;
            int i12 = iArr[i10];
            iArr[i10] = i6;
            i5++;
            i4 = i12;
            i6++;
        }
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f63567y;
            if (i13 >= iArr2.length) {
                this.f63567y = new int[0];
                return;
            } else {
                this.f63497g.add(new CompositionTimeToSample.a(1, iArr2[i13] - i13));
                i13++;
            }
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ൻ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63559q;
    }

    /* compiled from: H264TrackImpl.java */
    public class b extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        private final ByteBuffer f63582b;

        public b(ByteBuffer byteBuffer) {
            this.f63582b = byteBuffer.duplicate();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f63582b.hasRemaining()) {
                return this.f63582b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            if (!this.f63582b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i5, this.f63582b.remaining());
            this.f63582b.get(bArr, i4, min);
            return min;
        }
    }

    public c(com.googlecode.mp4parser.a aVar, String str) throws IOException {
        this(aVar, str, -1L, -1);
    }

    public c(com.googlecode.mp4parser.a aVar) throws IOException {
        this(aVar, ProtectedSandApp.s("൧\u0001"));
    }
}
