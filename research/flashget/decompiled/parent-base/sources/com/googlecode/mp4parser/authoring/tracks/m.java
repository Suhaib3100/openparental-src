package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.tencent.ugc.TXRecordCommon;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.g2;
import org.apache.log4j.helpers.UtilLoggingLevel;

/* compiled from: DTSTrackImpl.java */
/* loaded from: classes6.dex */
public class m extends com.googlecode.mp4parser.authoring.a {
    private static final int Q = 67108864;
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    int H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    String O;
    private String P;

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f63718e;

    /* renamed from: f, reason: collision with root package name */
    SampleDescriptionBox f63719f;

    /* renamed from: g, reason: collision with root package name */
    int f63720g;

    /* renamed from: h, reason: collision with root package name */
    int f63721h;

    /* renamed from: i, reason: collision with root package name */
    int f63722i;

    /* renamed from: j, reason: collision with root package name */
    int f63723j;

    /* renamed from: k, reason: collision with root package name */
    int f63724k;

    /* renamed from: l, reason: collision with root package name */
    int f63725l;

    /* renamed from: m, reason: collision with root package name */
    private long[] f63726m;

    /* renamed from: n, reason: collision with root package name */
    private int f63727n;

    /* renamed from: o, reason: collision with root package name */
    DTSSpecificBox f63728o;

    /* renamed from: p, reason: collision with root package name */
    private com.googlecode.mp4parser.a f63729p;

    /* renamed from: q, reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f63730q;

    /* renamed from: r, reason: collision with root package name */
    boolean f63731r;

    /* renamed from: s, reason: collision with root package name */
    boolean f63732s;

    /* renamed from: t, reason: collision with root package name */
    boolean f63733t;

    /* renamed from: u, reason: collision with root package name */
    int f63734u;

    /* renamed from: v, reason: collision with root package name */
    int f63735v;

    /* renamed from: w, reason: collision with root package name */
    int f63736w;

    /* renamed from: x, reason: collision with root package name */
    int f63737x;

    /* renamed from: y, reason: collision with root package name */
    int f63738y;

    /* renamed from: z, reason: collision with root package name */
    int f63739z;

    /* compiled from: DTSTrackImpl.java */
    class a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ ByteBuffer f63741b;

        a(ByteBuffer byteBuffer) {
            this.f63741b = byteBuffer;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            return this.f63741b;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write((ByteBuffer) this.f63741b.rewind());
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f63741b.rewind().remaining();
        }
    }

    /* compiled from: DTSTrackImpl.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f63742a;

        /* renamed from: b, reason: collision with root package name */
        long f63743b;

        /* renamed from: c, reason: collision with root package name */
        int f63744c = 0;

        /* renamed from: d, reason: collision with root package name */
        com.googlecode.mp4parser.a f63745d;

        /* renamed from: e, reason: collision with root package name */
        long f63746e;

        /* renamed from: f, reason: collision with root package name */
        ByteBuffer f63747f;

        /* renamed from: g, reason: collision with root package name */
        long f63748g;

        b(com.googlecode.mp4parser.a aVar, long j4, long j5, int i4) throws IOException {
            this.f63745d = aVar;
            this.f63743b = j4;
            this.f63746e = j5 + j4;
            this.f63742a = i4;
            d();
        }

        private void a() {
            this.f63744c++;
        }

        private void b() {
            long j4 = this.f63743b;
            int i4 = this.f63744c;
            this.f63748g = j4 + i4;
            this.f63744c = i4 + 4;
        }

        private void c() {
            this.f63744c += 4;
        }

        private void d() throws IOException {
            System.err.println(ProtectedSandApp.s("\u0e83\u0001"));
            com.googlecode.mp4parser.a aVar = this.f63745d;
            long j4 = this.f63743b;
            this.f63747f = aVar.e3(j4, Math.min(this.f63746e - j4, 67108864L));
        }

        private ByteBuffer f() {
            long j4 = this.f63748g;
            long j5 = this.f63743b;
            if (j4 < j5) {
                throw new RuntimeException(ProtectedSandApp.s("ຄ\u0001"));
            }
            this.f63747f.position((int) (j4 - j5));
            ByteBuffer slice = this.f63747f.slice();
            slice.limit((int) (this.f63744c - (this.f63748g - this.f63743b)));
            return slice;
        }

        private boolean g(byte b5, byte b6, byte b7, byte b10) throws IOException {
            int limit = this.f63747f.limit();
            int i4 = this.f63744c;
            if (limit - i4 >= 4) {
                return this.f63747f.get(i4) == b5 && this.f63747f.get(this.f63744c + 1) == b6 && this.f63747f.get(this.f63744c + 2) == b7 && this.f63747f.get(this.f63744c + 3) == b10;
            }
            if (this.f63743b + i4 + 4 < this.f63745d.size()) {
                return false;
            }
            throw new EOFException();
        }

        private boolean h() throws IOException {
            return g((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }

        private boolean i() throws IOException {
            return l((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }

        private boolean j() throws IOException {
            return g(Byte.MAX_VALUE, (byte) -2, Byte.MIN_VALUE, (byte) 1);
        }

        private boolean k() throws IOException {
            return l(Byte.MAX_VALUE, (byte) -2, Byte.MIN_VALUE, (byte) 1);
        }

        private boolean l(byte b5, byte b6, byte b7, byte b10) throws IOException {
            int limit = this.f63747f.limit();
            int i4 = this.f63744c;
            if (limit - i4 >= 4) {
                if ((this.f63743b + i4) % 1048576 == 0) {
                    PrintStream printStream = System.err;
                    StringBuilder sb = new StringBuilder();
                    sb.append(((this.f63743b + this.f63744c) / 1024) / 1024);
                    printStream.println(sb.toString());
                }
                return this.f63747f.get(this.f63744c) == b5 && this.f63747f.get(this.f63744c + 1) == b6 && this.f63747f.get(this.f63744c + 2) == b7 && this.f63747f.get(this.f63744c + 3) == b10;
            }
            long j4 = this.f63743b;
            long j5 = i4 + j4 + 4;
            long j6 = this.f63746e;
            if (j5 > j6) {
                return j4 + ((long) i4) == j6;
            }
            this.f63743b = this.f63748g;
            this.f63744c = 0;
            d();
            return j();
        }

        public ByteBuffer e() throws IOException {
            while (true) {
                try {
                    if (this.f63742a == 1) {
                        if (j()) {
                            break;
                        }
                        a();
                    } else {
                        if (h()) {
                            break;
                        }
                        a();
                    }
                } catch (EOFException unused) {
                    return null;
                }
                return null;
            }
            b();
            while (true) {
                if (this.f63742a == 1) {
                    if (k()) {
                        break;
                    }
                    c();
                } else {
                    if (i()) {
                        break;
                    }
                    c();
                }
                return null;
            }
            return f();
        }
    }

    public m(com.googlecode.mp4parser.a aVar, String str) throws IOException {
        super(aVar.toString());
        this.f63718e = new com.googlecode.mp4parser.authoring.i();
        this.f63722i = 0;
        this.f63727n = 0;
        this.f63728o = new DTSSpecificBox();
        this.f63731r = false;
        this.f63732s = false;
        this.f63733t = false;
        this.f63734u = 0;
        this.f63735v = 0;
        this.f63736w = 0;
        this.f63737x = 0;
        this.f63738y = 0;
        this.f63739z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = ProtectedSandApp.s("\u0e85\u0001");
        this.P = str;
        this.f63729p = aVar;
        d();
    }

    private List<com.googlecode.mp4parser.authoring.f> a(com.googlecode.mp4parser.a aVar, int i4, long j4, int i5) throws IOException {
        b bVar = new b(aVar, i4, j4, i5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteBuffer e4 = bVar.e();
            if (e4 == null) {
                System.err.println(ProtectedSandApp.s("ງ\u0001"));
                return arrayList;
            }
            arrayList.add(new a(e4));
        }
    }

    private int b(int i4) throws IOException {
        switch (i4) {
            case 0:
                return 32;
            case 1:
                return 56;
            case 2:
                return 64;
            case 3:
                return 96;
            case 4:
                return 112;
            case 5:
                return 128;
            case 6:
                return 192;
            case 7:
                return 224;
            case 8:
                return 256;
            case 9:
                return 320;
            case 10:
                return 384;
            case 11:
                return net.minidev.json.parser.f.f81763q;
            case 12:
                return 512;
            case 13:
                return 576;
            case 14:
                return 640;
            case 15:
                return 768;
            case 16:
                return 960;
            case 17:
                return 1024;
            case 18:
                return 1152;
            case 19:
                return 1280;
            case 20:
                return 1344;
            case 21:
                return 1408;
            case 22:
                return 1411;
            case 23:
                return 1472;
            case 24:
                return 1536;
            case 25:
                return -1;
            default:
                throw new IOException(ProtectedSandApp.s("ຈ\u0001"));
        }
    }

    private int c(int i4) throws IOException {
        switch (i4) {
            case 1:
                return TXRecordCommon.AUDIO_SAMPLERATE_8000;
            case 2:
                return 16000;
            case 3:
                return 32000;
            case 4:
            case 5:
            case 9:
            case 10:
            default:
                throw new IOException(ProtectedSandApp.s("ຉ\u0001"));
            case 6:
                return 11025;
            case 7:
                return 22050;
            case 8:
                return 44100;
            case 11:
                return UtilLoggingLevel.FINER_INT;
            case 12:
                return 24000;
            case 13:
                return 48000;
        }
    }

    private void d() throws IOException {
        if (!i()) {
            throw new IOException();
        }
        this.f63719f = new SampleDescriptionBox();
        AudioSampleEntry audioSampleEntry = new AudioSampleEntry(this.O);
        audioSampleEntry.setChannelCount(this.f63725l);
        audioSampleEntry.setSampleRate(this.f63720g);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        audioSampleEntry.addBox(this.f63728o);
        this.f63719f.addBox(audioSampleEntry);
        this.f63718e.o(new Date());
        this.f63718e.u(new Date());
        this.f63718e.r(this.P);
        this.f63718e.v(this.f63720g);
    }

    private boolean e(int i4, ByteBuffer byteBuffer) {
        int i5;
        byteBuffer.get();
        short s4 = byteBuffer.getShort();
        this.D = (byteBuffer.get() << com.google.common.base.c.f54872r) | (byteBuffer.getShort() & g2.f75095e);
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getShort();
        this.H = (byteBuffer.get() << 32) | (byteBuffer.getInt() & 65535);
        this.I = byteBuffer.getShort();
        this.J = byteBuffer.getShort();
        if ((s4 & 3) == 3) {
            this.K = (byteBuffer.get() << com.google.common.base.c.f54872r) | (byteBuffer.getShort() & g2.f75095e);
            this.L = byteBuffer.getShort();
            this.M = byteBuffer.getShort();
            i5 = 28;
        } else {
            i5 = 21;
        }
        if ((s4 & 4) > 0) {
            this.N = byteBuffer.get();
            i5++;
        }
        if ((s4 & 8) > 0) {
            this.E = 1;
        }
        while (i5 < i4) {
            byteBuffer.get();
            i5++;
        }
        return true;
    }

    private boolean f(int i4, ByteBuffer byteBuffer) {
        this.f63735v = (byteBuffer.get() << com.google.common.base.c.f54872r) | (byteBuffer.getShort() & g2.f75095e);
        this.f63736w = byteBuffer.getShort();
        this.f63737x = byteBuffer.getShort();
        this.f63738y = byteBuffer.getInt();
        for (int i5 = 11; i5 < i4; i5++) {
            byteBuffer.get();
        }
        return true;
    }

    private void g(int i4, ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        byteBuffer.get();
        byteBuffer.getInt();
        byteBuffer.get();
        short s4 = byteBuffer.getShort();
        byteBuffer.get();
        byte b5 = byteBuffer.get();
        this.f63734u = b5;
        if ((s4 & 1) == 1) {
            this.f63731r = true;
        }
        if ((s4 & 8) == 8) {
            this.f63732s = true;
        }
        if ((s4 & 16) == 16) {
            this.f63733t = true;
            this.f63734u = b5 + 1;
        } else {
            this.f63734u = 0;
        }
        for (int i5 = 14; i5 < i4; i5++) {
            byteBuffer.get();
        }
    }

    private boolean h(int i4, ByteBuffer byteBuffer) {
        int i5;
        this.f63739z = (byteBuffer.get() << com.google.common.base.c.f54872r) | (byteBuffer.getShort() & g2.f75095e);
        if (this.f63731r) {
            this.A = (byteBuffer.get() << com.google.common.base.c.f54872r) | (byteBuffer.getShort() & g2.f75095e);
            this.B = byteBuffer.getShort();
            i5 = 8;
        } else {
            this.C = byteBuffer.getInt();
            i5 = 7;
        }
        while (i5 < i4) {
            byteBuffer.get();
            i5++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x042a, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x042c, code lost:
    
        r17 = r20;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0430, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0435, code lost:
    
        if (r3 != 176167201) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0437, code lost:
    
        if (r13 != true) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0439, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x043b, code lost:
    
        r17 = r20;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0442, code lost:
    
        if (r3 != 1101174087) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0444, code lost:
    
        if (r10 != true) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r3 = r0.getLong();
        r26.f63727n = r0.position();
        r1 = -1;
        r5 = -1;
        r8 = -1;
        r9 = 65535;
        r2 = false;
        r10 = false;
        r11 = false;
        r12 = 0;
        r13 = false;
        r14 = false;
        r15 = false;
        r16 = 0;
        r17 = false;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0446, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0448, code lost:
    
        r17 = r20;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044f, code lost:
    
        if (r3 != 45126241) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0451, code lost:
    
        if (r14 != true) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0453, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0455, code lost:
    
        r17 = r20;
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0459, code lost:
    
        r17 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03e1, code lost:
    
        r7 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x048a, code lost:
    
        throw new java.io.IOException(com.flashget.parentalcontrol.ProtectedSandApp.s("ຎ\u0001") + r0.position());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x004e, code lost:
    
        r0 = r26.f63724k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0054, code lost:
    
        if (r0 == 512) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0058, code lost:
    
        if (r0 == 1024) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x005c, code lost:
    
        if (r0 == 2048) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x005e, code lost:
    
        if (r0 == 4096) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (r2 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0060, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0069, code lost:
    
        if (r0 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x006b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x006d, code lost:
    
        if (r8 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0070, code lost:
    
        if (r8 == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0072, code lost:
    
        switch(r8) {
            case 4: goto L35;
            case 5: goto L35;
            case 6: goto L35;
            case 7: goto L35;
            case 8: goto L35;
            case 9: goto L35;
            default: goto L34;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0075, code lost:
    
        r8 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0077, code lost:
    
        r1 = com.flashget.parentalcontrol.ProtectedSandApp.s("ຊ\u0001");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x007d, code lost:
    
        if (r5 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x02b4, code lost:
    
        r20 = r17;
        r21 = r18;
        r18 = r0.position();
        r1 = r0.getInt();
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0081, code lost:
    
        if (r10 != true) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0083, code lost:
    
        if (r14 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0085, code lost:
    
        r26.O = com.flashget.parentalcontrol.ProtectedSandApp.s("\u0e8b\u0001");
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00b9, code lost:
    
        r26.f63720g = r26.D;
        r26.f63723j = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c8, code lost:
    
        r26.f63728o.setDTSSamplingFrequency(r26.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d2, code lost:
    
        if (r26.f63731r == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d4, code lost:
    
        r26.f63728o.setMaxBitRate((r26.f63736w + r26.A) * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ef, code lost:
    
        r26.f63728o.setAvgBitRate((r26.f63736w + r26.f63739z) * 1000);
        r26.f63728o.setPcmSampleDepth(r26.f63723j);
        r26.f63728o.setFrameDuration(r0);
        r26.f63728o.setStreamConstruction(r1);
        r0 = r26.f63737x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0211, code lost:
    
        if ((r0 & 8) > 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x02c7, code lost:
    
        if (r1 != 2147385345) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0214, code lost:
    
        if ((r0 & 4096) <= 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0217, code lost:
    
        r26.f63728o.setCoreLFEPresent(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0223, code lost:
    
        r26.f63728o.setCoreLayout(r8);
        r26.f63728o.setCoreSize(r26.f63738y);
        r26.f63728o.setStereoDownmix(0);
        r26.f63728o.setRepresentationType(4);
        r26.f63728o.setChannelLayout(r26.I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0244, code lost:
    
        if (r26.f63735v <= 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0248, code lost:
    
        if (r26.f63739z <= 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x024a, code lost:
    
        r26.f63728o.setMultiAssetFlag(1);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0257, code lost:
    
        r26.f63728o.setLBRDurationMod(r26.E);
        r26.f63728o.setReservedBoxPresent(r1);
        r26.f63725l = r1;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x02c9, code lost:
    
        if (r5 != 1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0268, code lost:
    
        if (r0 < 16) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0289, code lost:
    
        if (((r26.I >> r0) & 1) != 1) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x028d, code lost:
    
        if (r0 == 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x028f, code lost:
    
        if (r0 == 12) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0293, code lost:
    
        if (r0 == 14) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0296, code lost:
    
        if (r0 == 3) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0299, code lost:
    
        if (r0 == 4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x029c, code lost:
    
        if (r0 == 7) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02a0, code lost:
    
        if (r0 == 8) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02a2, code lost:
    
        r26.f63725l += 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b1, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02a9, code lost:
    
        r26.f63725l++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x02d3, code lost:
    
        r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(r0);
        r2 = r1.c(1);
        r8 = r1.c(5);
        r5 = r1.c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x026a, code lost:
    
        r0 = a(r26.f63729p, r26.f63727n, r3, r5);
        r26.f63730q = r0;
        r0 = new long[r0.size()];
        r26.f63726m = r0;
        java.util.Arrays.fill(r0, r26.f63724k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0284, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0251, code lost:
    
        r1 = 0;
        r26.f63728o.setMultiAssetFlag(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x021e, code lost:
    
        r26.f63728o.setCoreLFEPresent(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01e2, code lost:
    
        r26.f63728o.setMaxBitRate((r26.f63736w + r26.f63739z) * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0090, code lost:
    
        r26.O = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x02e5, code lost:
    
        if (r2 != 1) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0092, code lost:
    
        r1 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0094, code lost:
    
        if (r13 != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0096, code lost:
    
        r26.O = com.flashget.parentalcontrol.ProtectedSandApp.s("ຌ\u0001");
        r1 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00a1, code lost:
    
        if (r14 != true) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00a3, code lost:
    
        r26.O = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00a5, code lost:
    
        if (r15 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00a7, code lost:
    
        if (r10 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00a9, code lost:
    
        r1 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00ac, code lost:
    
        if (r15 != true) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00ae, code lost:
    
        if (r10 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00b0, code lost:
    
        r1 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00b3, code lost:
    
        if (r15 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00b5, code lost:
    
        if (r10 != true) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00b8, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00c3, code lost:
    
        if (r9 >= 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00c5, code lost:
    
        r2 = com.flashget.parentalcontrol.ProtectedSandApp.s("ຍ\u0001");
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00cb, code lost:
    
        if (r12 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00cd, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00cf, code lost:
    
        if (r9 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02e9, code lost:
    
        if (r8 != 31) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00d2, code lost:
    
        if (r9 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00d5, code lost:
    
        if (r9 == 6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00d7, code lost:
    
        r26.O = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00d9, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00dc, code lost:
    
        r26.O = r1;
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00e1, code lost:
    
        r26.O = r2;
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00e6, code lost:
    
        r26.O = r2;
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00eb, code lost:
    
        r26.O = r2;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00f0, code lost:
    
        r9 = r16;
        r26.O = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x02eb, code lost:
    
        if (r5 == 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00f4, code lost:
    
        if (r12 != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00f6, code lost:
    
        if (r14 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00f8, code lost:
    
        if (r15 != true) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00fa, code lost:
    
        r1 = r17;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00fe, code lost:
    
        if (r1 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0100, code lost:
    
        if (r2 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0102, code lost:
    
        if (r10 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0104, code lost:
    
        if (r13 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0106, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x010d, code lost:
    
        if (r14 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x02f0, code lost:
    
        r26.f63724k = (r1.c(7) + 1) * 32;
        r2 = r1.c(14);
        r26.f63722i = (r2 + 1) + r26.f63722i;
        r12 = r1.c(6);
        r26.f63720g = c(r1.c(4));
        r26.f63721h = b(r1.c(5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x010f, code lost:
    
        if (r15 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0111, code lost:
    
        if (r1 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0113, code lost:
    
        if (r2 != true) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0115, code lost:
    
        if (r10 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0117, code lost:
    
        if (r13 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0119, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x011c, code lost:
    
        if (r14 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x011e, code lost:
    
        if (r15 != true) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0120, code lost:
    
        if (r1 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0122, code lost:
    
        if (r2 != true) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0327, code lost:
    
        if (r1.c(1) == 0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0124, code lost:
    
        if (r10 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0126, code lost:
    
        if (r13 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0128, code lost:
    
        r1 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x012c, code lost:
    
        if (r14 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x012e, code lost:
    
        if (r15 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0130, code lost:
    
        if (r1 != true) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0132, code lost:
    
        if (r2 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0134, code lost:
    
        if (r10 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0136, code lost:
    
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0138, code lost:
    
        r1 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x032b, code lost:
    
        r1.c(1);
        r1.c(1);
        r1.c(1);
        r1.c(1);
        r16 = r1.c(3);
        r8 = r1.c(1);
        r1.c(1);
        r23 = r3;
        r1.c(2);
        r1.c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x013c, code lost:
    
        if (r14 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x013e, code lost:
    
        if (r15 != true) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0140, code lost:
    
        if (r1 != true) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0142, code lost:
    
        if (r2 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0144, code lost:
    
        if (r10 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0146, code lost:
    
        if (r13 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0148, code lost:
    
        r1 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x014c, code lost:
    
        if (r14 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x014e, code lost:
    
        if (r15 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0150, code lost:
    
        if (r1 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x034c, code lost:
    
        if (r5 != 1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0152, code lost:
    
        if (r2 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0154, code lost:
    
        if (r10 != true) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0156, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0158, code lost:
    
        r1 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0109, code lost:
    
        r1 = r17;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x015c, code lost:
    
        r1 = r17;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0160, code lost:
    
        if (r9 != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0162, code lost:
    
        if (r14 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0164, code lost:
    
        if (r15 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0166, code lost:
    
        if (r1 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x034e, code lost:
    
        r1.c(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0168, code lost:
    
        if (r2 != true) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x016a, code lost:
    
        if (r10 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x016c, code lost:
    
        if (r13 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x016e, code lost:
    
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0172, code lost:
    
        if (r9 != 6) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0174, code lost:
    
        if (r14 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0176, code lost:
    
        if (r15 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0178, code lost:
    
        if (r1 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x017a, code lost:
    
        if (r2 != true) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0353, code lost:
    
        r1.c(1);
        r5 = r1.c(4);
        r1.c(2);
        r3 = r1.c(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x017c, code lost:
    
        if (r10 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x017e, code lost:
    
        if (r13 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0180, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0183, code lost:
    
        if (r9 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0185, code lost:
    
        if (r14 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0187, code lost:
    
        if (r15 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0189, code lost:
    
        if (r1 != true) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x018b, code lost:
    
        if (r2 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x018d, code lost:
    
        if (r10 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x018f, code lost:
    
        if (r13 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0363, code lost:
    
        if (r3 == 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0191, code lost:
    
        r1 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0195, code lost:
    
        if (r9 != 6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0197, code lost:
    
        if (r14 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0199, code lost:
    
        if (r15 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x019b, code lost:
    
        if (r1 != true) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x019d, code lost:
    
        if (r2 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x019f, code lost:
    
        if (r10 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01a1, code lost:
    
        if (r13 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01a3, code lost:
    
        r1 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0365, code lost:
    
        if (r3 == 1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x01a6, code lost:
    
        if (r9 != 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01a8, code lost:
    
        if (r14 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x01aa, code lost:
    
        if (r15 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x01ac, code lost:
    
        if (r1 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x01ae, code lost:
    
        if (r2 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x01b0, code lost:
    
        if (r10 != true) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01b2, code lost:
    
        if (r13 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01b4, code lost:
    
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x01b8, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x01ba, code lost:
    
        if (r14 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x01bc, code lost:
    
        if (r15 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x01be, code lost:
    
        if (r1 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x01c0, code lost:
    
        if (r2 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x01c2, code lost:
    
        if (r10 != true) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x01c4, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x01c6, code lost:
    
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0062, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0064, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0066, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0368, code lost:
    
        if (r3 == 2) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0068, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x036a, code lost:
    
        if (r3 == 3) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x036d, code lost:
    
        if (r3 == 5) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0370, code lost:
    
        if (r3 == 6) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0372, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0374, code lost:
    
        r26.f63723j = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0384, code lost:
    
        r1.c(1);
        r1.c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x038b, code lost:
    
        if (r5 == 6) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x038e, code lost:
    
        if (r5 == 7) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0390, code lost:
    
        r1.c(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x039e, code lost:
    
        r0.position((r18 + r2) + 1);
        r17 = r20;
        r18 = r21;
        r2 = r22;
        r3 = r23;
        r1 = -1;
        r5 = 1;
        r12 = r8;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0395, code lost:
    
        r1.c(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x039a, code lost:
    
        r1.c(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x037a, code lost:
    
        r26.f63723j = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x037f, code lost:
    
        r26.f63723j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0329, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02ed, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02cb, code lost:
    
        r2 = true;
        r17 = r20;
        r18 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d0, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03b7, code lost:
    
        r23 = r3;
        r3 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03c0, code lost:
    
        if (r1 != 1683496997) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03c3, code lost:
    
        if (r5 != (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03c5, code lost:
    
        r26.f63724k = r26.G;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03ca, code lost:
    
        r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(r0);
        r7 = 8;
        r2.c(8);
        r2.c(2);
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03dd, code lost:
    
        if (r2.c(1) != 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03df, code lost:
    
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03e3, code lost:
    
        r4 = r2.c(r7) + 1;
        r2 = r2.c(r3) + 1;
        r0.position(r18 + r4);
        r3 = r0.getInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03f9, code lost:
    
        if (r3 != 1515870810) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03fb, code lost:
    
        if (r11 != true) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03fd, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03ff, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0400, code lost:
    
        r17 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0402, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x045b, code lost:
    
        if (r22 != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x045d, code lost:
    
        r26.f63722i += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0462, code lost:
    
        r0.position(r18 + r2);
        r18 = r4;
        r2 = r22;
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0409, code lost:
    
        if (r3 != 1191201283) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x040b, code lost:
    
        if (r15 != true) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x040d, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x040f, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0414, code lost:
    
        if (r3 != 496366178) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0418, code lost:
    
        if (r20 != true) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x041a, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x041c, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0424, code lost:
    
        if (r3 != 1700671838) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0428, code lost:
    
        if (r21 != true) goto L287;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean i() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.m.i():boolean");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63730q;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63726m;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63729p.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ຐ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63719f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63718e;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }

    public m(com.googlecode.mp4parser.a aVar) throws IOException {
        super(aVar.toString());
        this.f63718e = new com.googlecode.mp4parser.authoring.i();
        this.f63722i = 0;
        this.f63727n = 0;
        this.f63728o = new DTSSpecificBox();
        this.f63731r = false;
        this.f63732s = false;
        this.f63733t = false;
        this.f63734u = 0;
        this.f63735v = 0;
        this.f63736w = 0;
        this.f63737x = 0;
        this.f63738y = 0;
        this.f63739z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = ProtectedSandApp.s("\u0e85\u0001");
        this.P = ProtectedSandApp.s("ຆ\u0001");
        this.f63729p = aVar;
        d();
    }
}
