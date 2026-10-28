package com.googlecode.mp4parser.authoring.tracks;

import androidx.compose.ui.graphics.l6;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* compiled from: EC3TrackImpl.java */
/* loaded from: classes6.dex */
public class o extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: m, reason: collision with root package name */
    private static final long f63761m = 20;

    /* renamed from: e, reason: collision with root package name */
    private final com.googlecode.mp4parser.a f63762e;

    /* renamed from: f, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f63763f;

    /* renamed from: g, reason: collision with root package name */
    SampleDescriptionBox f63764g;

    /* renamed from: h, reason: collision with root package name */
    private int f63765h;

    /* renamed from: i, reason: collision with root package name */
    private int f63766i;

    /* renamed from: j, reason: collision with root package name */
    private List<b> f63767j;

    /* renamed from: k, reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f63768k;

    /* renamed from: l, reason: collision with root package name */
    private long[] f63769l;

    /* compiled from: EC3TrackImpl.java */
    class a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ int f63771b;

        a(int i4) {
            this.f63771b = i4;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            try {
                return o.this.f63762e.e3(this.f63771b, o.this.f63766i);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            o.this.f63762e.T(this.f63771b, o.this.f63766i, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return o.this.f63766i;
        }
    }

    /* compiled from: EC3TrackImpl.java */
    public static class b extends EC3SpecificBox.a {

        /* renamed from: j, reason: collision with root package name */
        public int f63772j;

        /* renamed from: k, reason: collision with root package name */
        public int f63773k;

        /* renamed from: l, reason: collision with root package name */
        public int f63774l;

        /* renamed from: m, reason: collision with root package name */
        public int f63775m;

        /* renamed from: n, reason: collision with root package name */
        public int f63776n;

        /* renamed from: o, reason: collision with root package name */
        public int f63777o;

        @Override // com.googlecode.mp4parser.boxes.EC3SpecificBox.a
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0ea6\u0001"));
            sb.append(this.f63772j);
            sb.append(ProtectedSandApp.s("ວ\u0001"));
            sb.append(this.f63773k);
            sb.append(ProtectedSandApp.s("ຨ\u0001"));
            sb.append(this.f63774l);
            sb.append(ProtectedSandApp.s("ຩ\u0001"));
            sb.append(this.f63775m);
            sb.append(ProtectedSandApp.s("ສ\u0001"));
            sb.append(this.f63776n);
            sb.append(ProtectedSandApp.s("ຫ\u0001"));
            return androidx.view.e.a(sb, this.f63777o, '}');
        }
    }

    public o(com.googlecode.mp4parser.a aVar) throws IOException {
        super(aVar.toString());
        this.f63763f = new com.googlecode.mp4parser.authoring.i();
        this.f63767j = new LinkedList();
        this.f63762e = aVar;
        boolean z4 = false;
        while (!z4) {
            b d5 = d();
            if (d5 == null) {
                throw new IOException();
            }
            for (b bVar : this.f63767j) {
                if (d5.f63776n != 1 && bVar.f63773k == d5.f63773k) {
                    z4 = true;
                }
            }
            if (!z4) {
                this.f63767j.add(d5);
            }
        }
        if (this.f63767j.size() == 0) {
            throw new IOException();
        }
        int i4 = this.f63767j.get(0).f63775m;
        this.f63764g = new SampleDescriptionBox();
        AudioSampleEntry audioSampleEntry = new AudioSampleEntry(ProtectedSandApp.s("ຬ\u0001"));
        audioSampleEntry.setChannelCount(2);
        long j4 = i4;
        audioSampleEntry.setSampleRate(j4);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        EC3SpecificBox eC3SpecificBox = new EC3SpecificBox();
        int[] iArr = new int[this.f63767j.size()];
        int[] iArr2 = new int[this.f63767j.size()];
        for (b bVar2 : this.f63767j) {
            if (bVar2.f63776n == 1) {
                int i5 = bVar2.f63773k;
                iArr[i5] = iArr[i5] + 1;
                int i6 = bVar2.f63777o;
                iArr2[i5] = ((i6 >> 5) & 255) | ((i6 >> 6) & 256);
            }
        }
        for (b bVar3 : this.f63767j) {
            if (bVar3.f63776n != 1) {
                EC3SpecificBox.a aVar2 = new EC3SpecificBox.a();
                aVar2.f63866a = bVar3.f63866a;
                aVar2.f63867b = bVar3.f63867b;
                aVar2.f63868c = bVar3.f63868c;
                aVar2.f63869d = bVar3.f63869d;
                aVar2.f63870e = bVar3.f63870e;
                aVar2.f63871f = 0;
                int i7 = bVar3.f63773k;
                aVar2.f63872g = iArr[i7];
                aVar2.f63873h = iArr2[i7];
                aVar2.f63874i = 0;
                eC3SpecificBox.addEntry(aVar2);
            }
            this.f63765h += bVar3.f63774l;
            this.f63766i += bVar3.f63772j;
        }
        eC3SpecificBox.setDataRate(this.f63765h / 1000);
        audioSampleEntry.addBox(eC3SpecificBox);
        this.f63764g.addBox(audioSampleEntry);
        this.f63763f.o(new Date());
        this.f63763f.u(new Date());
        this.f63763f.v(j4);
        this.f63763f.y(1.0f);
        aVar.O1(0L);
        List<com.googlecode.mp4parser.authoring.f> c5 = c();
        this.f63768k = c5;
        long[] jArr = new long[c5.size()];
        this.f63769l = jArr;
        Arrays.fill(jArr, 1536L);
    }

    private List<com.googlecode.mp4parser.authoring.f> c() throws IOException {
        int a5 = com.googlecode.mp4parser.util.c.a((this.f63762e.size() - this.f63762e.position()) / this.f63766i);
        ArrayList arrayList = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            arrayList.add(new a(this.f63766i * i4));
        }
        return arrayList;
    }

    private b d() throws IOException {
        int c5;
        int i4;
        long position = this.f63762e.position();
        ByteBuffer allocate = ByteBuffer.allocate(200);
        this.f63762e.read(allocate);
        allocate.rewind();
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(allocate);
        if (cVar.c(16) != 2935) {
            return null;
        }
        b bVar = new b();
        bVar.f63776n = cVar.c(2);
        bVar.f63773k = cVar.c(3);
        bVar.f63772j = (cVar.c(11) + 1) * 2;
        int c6 = cVar.c(2);
        bVar.f63866a = c6;
        if (c6 == 3) {
            i4 = cVar.c(2);
            c5 = 3;
        } else {
            c5 = cVar.c(2);
            i4 = -1;
        }
        int i5 = c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? 0 : 6 : 3 : 2 : 1;
        bVar.f63772j *= 6 / i5;
        bVar.f63869d = cVar.c(3);
        bVar.f63870e = cVar.c(1);
        bVar.f63867b = cVar.c(5);
        cVar.c(5);
        if (1 == cVar.c(1)) {
            cVar.c(8);
        }
        if (bVar.f63869d == 0) {
            cVar.c(5);
            if (1 == cVar.c(1)) {
                cVar.c(8);
            }
        }
        if (1 == bVar.f63776n && 1 == cVar.c(1)) {
            bVar.f63777o = cVar.c(16);
        }
        if (1 == cVar.c(1)) {
            if (bVar.f63869d > 2) {
                cVar.c(2);
            }
            int i6 = bVar.f63869d;
            if (1 == (i6 & 1) && i6 > 2) {
                cVar.c(3);
                cVar.c(3);
            }
            if ((bVar.f63869d & 4) > 0) {
                cVar.c(3);
                cVar.c(3);
            }
            if (1 == bVar.f63870e && 1 == cVar.c(1)) {
                cVar.c(5);
            }
            if (bVar.f63776n == 0) {
                if (1 == cVar.c(1)) {
                    cVar.c(6);
                }
                if (bVar.f63869d == 0 && 1 == cVar.c(1)) {
                    cVar.c(6);
                }
                if (1 == cVar.c(1)) {
                    cVar.c(6);
                }
                int c7 = cVar.c(2);
                if (1 == c7) {
                    cVar.c(5);
                } else if (2 == c7) {
                    cVar.c(12);
                } else if (3 == c7) {
                    int c10 = cVar.c(5);
                    if (1 == cVar.c(1)) {
                        cVar.c(5);
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            if (1 == cVar.c(1)) {
                                cVar.c(4);
                            }
                            if (1 == cVar.c(1)) {
                                cVar.c(4);
                            }
                        }
                    }
                    if (1 == cVar.c(1)) {
                        cVar.c(5);
                        if (1 == cVar.c(1)) {
                            cVar.c(7);
                            if (1 == cVar.c(1)) {
                                cVar.c(8);
                            }
                        }
                    }
                    for (int i7 = 0; i7 < c10 + 2; i7++) {
                        cVar.c(8);
                    }
                    cVar.a();
                }
                if (bVar.f63869d < 2) {
                    if (1 == cVar.c(1)) {
                        cVar.c(14);
                    }
                    if (bVar.f63869d == 0 && 1 == cVar.c(1)) {
                        cVar.c(14);
                    }
                    if (1 == cVar.c(1)) {
                        if (c5 == 0) {
                            cVar.c(5);
                        } else {
                            for (int i10 = 0; i10 < i5; i10++) {
                                if (1 == cVar.c(1)) {
                                    cVar.c(5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (1 == cVar.c(1)) {
            bVar.f63868c = cVar.c(3);
        }
        int i11 = bVar.f63866a;
        if (i11 == 0) {
            bVar.f63775m = 48000;
        } else if (i11 == 1) {
            bVar.f63775m = 44100;
        } else if (i11 == 2) {
            bVar.f63775m = 32000;
        } else if (i11 == 3) {
            if (i4 == 0) {
                bVar.f63775m = 24000;
            } else if (i4 == 1) {
                bVar.f63775m = 22050;
            } else if (i4 == 2) {
                bVar.f63775m = 16000;
            } else if (i4 == 3) {
                bVar.f63775m = 0;
            }
        }
        int i12 = bVar.f63775m;
        if (i12 == 0) {
            return null;
        }
        int i13 = bVar.f63772j;
        bVar.f63774l = (int) ((i12 / 1536.0d) * i13 * 8.0d);
        this.f63762e.O1(position + i13);
        return bVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63768k;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63769l;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63762e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ອ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63764g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ຮ\u0001"));
        sb.append(this.f63765h);
        sb.append(ProtectedSandApp.s("ຯ\u0001"));
        return l6.a(sb, this.f63767j, '}');
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63763f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }
}
