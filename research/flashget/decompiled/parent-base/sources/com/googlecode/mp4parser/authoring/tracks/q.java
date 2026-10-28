package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Priority;

/* compiled from: MP3TrackImpl.java */
/* loaded from: classes6.dex */
public class q extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: m, reason: collision with root package name */
    private static final int f63789m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final int f63790n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f63791o = {44100, 48000, 32000, 0};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f63792p = {0, 32000, Priority.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 0};

    /* renamed from: q, reason: collision with root package name */
    private static final int f63793q = 1152;

    /* renamed from: r, reason: collision with root package name */
    private static final int f63794r = 107;

    /* renamed from: s, reason: collision with root package name */
    private static final int f63795s = 5;

    /* renamed from: e, reason: collision with root package name */
    private final com.googlecode.mp4parser.a f63796e;

    /* renamed from: f, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f63797f;

    /* renamed from: g, reason: collision with root package name */
    SampleDescriptionBox f63798g;

    /* renamed from: h, reason: collision with root package name */
    a f63799h;

    /* renamed from: i, reason: collision with root package name */
    long f63800i;

    /* renamed from: j, reason: collision with root package name */
    long f63801j;

    /* renamed from: k, reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f63802k;

    /* renamed from: l, reason: collision with root package name */
    private long[] f63803l;

    /* compiled from: MP3TrackImpl.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        int f63804a;

        /* renamed from: b, reason: collision with root package name */
        int f63805b;

        /* renamed from: c, reason: collision with root package name */
        int f63806c;

        /* renamed from: d, reason: collision with root package name */
        int f63807d;

        /* renamed from: e, reason: collision with root package name */
        int f63808e;

        /* renamed from: f, reason: collision with root package name */
        int f63809f;

        /* renamed from: g, reason: collision with root package name */
        int f63810g;

        /* renamed from: h, reason: collision with root package name */
        int f63811h;

        /* renamed from: i, reason: collision with root package name */
        int f63812i;

        /* renamed from: j, reason: collision with root package name */
        int f63813j;

        a() {
        }

        int a() {
            return ((this.f63808e * 144) / this.f63810g) + this.f63811h;
        }
    }

    public q(com.googlecode.mp4parser.a aVar) throws IOException {
        this(aVar, ProtectedSandApp.s("\u0ebf\u0001"));
    }

    private a a(com.googlecode.mp4parser.a aVar) throws IOException {
        a aVar2 = new a();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        while (allocate.position() < 4) {
            if (aVar.read(allocate) == -1) {
                return null;
            }
        }
        if (allocate.get(0) == 84 && allocate.get(1) == 65 && allocate.get(2) == 71) {
            return null;
        }
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c((ByteBuffer) allocate.rewind());
        if (cVar.c(11) != 2047) {
            throw new IOException(ProtectedSandApp.s("\u0ec5\u0001"));
        }
        int c5 = cVar.c(2);
        aVar2.f63804a = c5;
        if (c5 != 3) {
            throw new IOException(ProtectedSandApp.s("ໄ\u0001"));
        }
        int c6 = cVar.c(2);
        aVar2.f63805b = c6;
        if (c6 != 1) {
            throw new IOException(ProtectedSandApp.s("ໃ\u0001"));
        }
        aVar2.f63806c = cVar.c(1);
        int c7 = cVar.c(4);
        aVar2.f63807d = c7;
        int i4 = f63792p[c7];
        aVar2.f63808e = i4;
        if (i4 == 0) {
            throw new IOException(ProtectedSandApp.s("ໂ\u0001"));
        }
        int c10 = cVar.c(2);
        aVar2.f63809f = c10;
        int i5 = f63791o[c10];
        aVar2.f63810g = i5;
        if (i5 == 0) {
            throw new IOException(ProtectedSandApp.s("ແ\u0001"));
        }
        aVar2.f63811h = cVar.c(1);
        cVar.c(1);
        int c11 = cVar.c(2);
        aVar2.f63812i = c11;
        aVar2.f63813j = c11 == 3 ? 1 : 2;
        return aVar2;
    }

    private a b(com.googlecode.mp4parser.a aVar) throws IOException {
        a aVar2 = null;
        while (true) {
            long position = aVar.position();
            a a5 = a(aVar);
            if (a5 == null) {
                return aVar2;
            }
            if (aVar2 == null) {
                aVar2 = a5;
            }
            aVar.O1(position);
            ByteBuffer allocate = ByteBuffer.allocate(a5.a());
            aVar.read(allocate);
            allocate.rewind();
            this.f63802k.add(new com.googlecode.mp4parser.authoring.g(allocate));
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63802k;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63803l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63796e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ໆ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63798g;
    }

    public String toString() {
        return ProtectedSandApp.s("\u0ec7\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63797f;
    }

    public q(com.googlecode.mp4parser.a aVar, String str) throws IOException {
        super(aVar.toString());
        this.f63797f = new com.googlecode.mp4parser.authoring.i();
        this.f63796e = aVar;
        this.f63802k = new LinkedList();
        this.f63799h = b(aVar);
        double d5 = r12.f63810g / 1152.0d;
        double size = this.f63802k.size() / d5;
        LinkedList linkedList = new LinkedList();
        Iterator<com.googlecode.mp4parser.authoring.f> it = this.f63802k.iterator();
        long j4 = 0;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                this.f63801j = (int) ((j4 * 8) / size);
                this.f63798g = new SampleDescriptionBox();
                AudioSampleEntry audioSampleEntry = new AudioSampleEntry(ProtectedSandApp.s("ເ\u0001"));
                audioSampleEntry.setChannelCount(this.f63799h.f63813j);
                audioSampleEntry.setSampleRate(this.f63799h.f63810g);
                audioSampleEntry.setDataReferenceIndex(1);
                audioSampleEntry.setSampleSize(16);
                ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h hVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h();
                hVar.x(0);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.o oVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.o();
                oVar.j(2);
                hVar.z(oVar);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e eVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e();
                eVar.w(107);
                eVar.x(5);
                eVar.v(this.f63800i);
                eVar.s(this.f63801j);
                hVar.v(eVar);
                eSDescriptorBox.setData(hVar.g());
                audioSampleEntry.addBox(eSDescriptorBox);
                this.f63798g.addBox(audioSampleEntry);
                this.f63797f.o(new Date());
                this.f63797f.u(new Date());
                this.f63797f.r(str);
                this.f63797f.y(1.0f);
                this.f63797f.v(this.f63799h.f63810g);
                long[] jArr = new long[this.f63802k.size()];
                this.f63803l = jArr;
                Arrays.fill(jArr, 1152L);
                return;
            }
            int size2 = (int) it.next().getSize();
            j4 += size2;
            linkedList.add(Integer.valueOf(size2));
            while (linkedList.size() > d5) {
                linkedList.pop();
            }
            if (linkedList.size() == ((int) d5)) {
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    i4 += ((Integer) it2.next()).intValue();
                }
                if (((i4 * 8.0d) / linkedList.size()) * d5 > this.f63800i) {
                    this.f63800i = (int) r7;
                }
            }
        }
    }
}
