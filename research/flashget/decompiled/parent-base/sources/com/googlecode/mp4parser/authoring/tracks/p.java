package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.tracks.c;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.tencent.mmkv.MMKV;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: H263TrackImpl.java */
/* loaded from: classes6.dex */
public class p extends c {

    /* renamed from: w, reason: collision with root package name */
    private static Logger f63778w = Logger.getLogger(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h.class.getName());

    /* renamed from: m, reason: collision with root package name */
    int f63779m;

    /* renamed from: n, reason: collision with root package name */
    int f63780n;

    /* renamed from: o, reason: collision with root package name */
    int f63781o;

    /* renamed from: p, reason: collision with root package name */
    int f63782p;

    /* renamed from: q, reason: collision with root package name */
    SampleDescriptionBox f63783q;

    /* renamed from: r, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63784r;

    /* renamed from: s, reason: collision with root package name */
    List<ByteBuffer> f63785s;

    /* renamed from: t, reason: collision with root package name */
    boolean f63786t;

    /* renamed from: u, reason: collision with root package name */
    int f63787u;

    /* renamed from: v, reason: collision with root package name */
    int f63788v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.googlecode.mp4parser.a aVar) throws IOException {
        super(aVar, false);
        int i4;
        char c5 = 0;
        this.f63779m = 0;
        this.f63780n = 1;
        int i5 = 2;
        this.f63781o = 2;
        this.f63782p = 3;
        this.f63784r = new ArrayList();
        this.f63785s = new ArrayList();
        this.f63786t = false;
        this.f63787u = -1;
        this.f63788v = 0;
        c.a aVar2 = new c.a(aVar);
        ArrayList arrayList = new ArrayList();
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry(ProtectedSandApp.s("ະ\u0001"));
        SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
        this.f63783q = sampleDescriptionBox;
        sampleDescriptionBox.addBox(visualSampleEntry);
        long j4 = 0;
        int i6 = 0;
        long j5 = -1;
        while (true) {
            ByteBuffer c6 = c(aVar2);
            if (c6 == null) {
                long[] jArr = this.f63496f;
                long[] jArr2 = new long[1];
                jArr2[c5] = jArr[jArr.length - 1];
                this.f63496f = com.googlecode.mp4parser.util.l.c(jArr, jArr2);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h hVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h();
                hVar.x(1);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e eVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e();
                eVar.w(32);
                eVar.x(4);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.f fVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.f();
                com.googlecode.mp4parser.authoring.f b5 = b(this.f63785s);
                byte[] bArr = new byte[com.googlecode.mp4parser.util.c.a(b5.getSize())];
                b5.a().get(bArr);
                fVar.i(bArr);
                eVar.u(fVar);
                hVar.v(eVar);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.o oVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.o();
                oVar.j(i5);
                hVar.z(oVar);
                ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
                eSDescriptorBox.setEsDescriptor(hVar);
                visualSampleEntry.addBox(eSDescriptorBox);
                this.f63500j.v(this.f63788v);
                return;
            }
            ByteBuffer duplicate = c6.duplicate();
            int p4 = com.coremedia.iso.g.p(c6);
            if (p4 == 176 || p4 == 181 || p4 == 0 || p4 == 32 || p4 == 178) {
                int i7 = i6;
                if (this.f63786t) {
                    i4 = i7;
                } else {
                    this.f63785s.add(duplicate);
                    if (p4 == 32) {
                        i4 = i7;
                        i(c6, i4, visualSampleEntry);
                    } else {
                        i4 = i7;
                        if (p4 == 181) {
                            i6 = h(c6);
                        }
                    }
                }
                i6 = i4;
            } else if (p4 == 179) {
                this.f63786t = true;
                int c7 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(c6).c(18);
                j4 = (((c7 >>> 13) & 31) * MMKV.ExpireInHour) + (((c7 >>> 7) & 63) * 60) + (c7 & 63);
                this.f63499i.add(Integer.valueOf(this.f63784r.size() + 1));
                arrayList.add(duplicate);
            } else {
                if (p4 != 182) {
                    throw new RuntimeException(ProtectedSandApp.s("ີ\u0001"));
                }
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(c6);
                cVar.c(2);
                while (cVar.d()) {
                    j4++;
                }
                cVar.d();
                int i10 = 0;
                while (this.f63788v >= (1 << i10)) {
                    i10++;
                }
                int c10 = cVar.c(i10);
                int i11 = i6;
                long j6 = (this.f63788v * j4) + (c10 % r9);
                if (j5 != -1) {
                    this.f63496f = com.googlecode.mp4parser.util.l.c(this.f63496f, j6 - j5);
                }
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ັ\u0001"));
                sb.append(j6 - j5);
                sb.append(ProtectedSandApp.s("າ\u0001"));
                sb.append(c10);
                androidx.multidex.c.a(sb, ProtectedSandApp.s("ຳ\u0001"), j4, ProtectedSandApp.s("ິ\u0001"));
                sb.append(j6);
                printStream.println(sb.toString());
                arrayList.add(duplicate);
                this.f63784r.add(b(arrayList));
                arrayList.clear();
                j5 = j6;
                i6 = i11;
            }
            c5 = 0;
            i5 = 2;
        }
    }

    public static void e(String[] strArr) throws IOException {
        com.googlecode.mp4parser.c cVar = new com.googlecode.mp4parser.c(ProtectedSandApp.s("ຶ\u0001"));
        com.googlecode.mp4parser.authoring.d dVar = new com.googlecode.mp4parser.authoring.d();
        dVar.a(new p(cVar));
        new DefaultMp4Builder().a(dVar).writeContainer(Channels.newChannel(new FileOutputStream(ProtectedSandApp.s("ື\u0001"))));
    }

    public static void f(String[] strArr) throws IOException {
        File[] listFiles = new File(ProtectedSandApp.s("ຸ\u0001")).listFiles();
        Arrays.sort(listFiles);
        com.googlecode.mp4parser.authoring.d dVar = new com.googlecode.mp4parser.authoring.d();
        dVar.a(new p(new com.googlecode.mp4parser.f(listFiles)));
        new DefaultMp4Builder().a(dVar).writeContainer(Channels.newChannel(new FileOutputStream(ProtectedSandApp.s("ື\u0001"))));
    }

    public static void g(String[] strArr) throws IOException {
        ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) com.googlecode.mp4parser.util.m.d(new com.coremedia.iso.f(ProtectedSandApp.s("ູ\u0001")), ProtectedSandApp.s("຺\u0001"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        eSDescriptorBox.getBox(Channels.newChannel(byteArrayOutputStream));
        PrintStream printStream = System.err;
        printStream.println(com.coremedia.iso.e.b(byteArrayOutputStream.toByteArray()));
        printStream.println(eSDescriptorBox.getEsDescriptor());
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        eSDescriptorBox.getBox(Channels.newChannel(byteArrayOutputStream2));
        printStream.println(com.coremedia.iso.e.c(byteArrayOutputStream2.toByteArray(), 0));
    }

    private int h(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        if (!cVar.d()) {
            return 0;
        }
        int c5 = cVar.c(4);
        cVar.c(3);
        return c5;
    }

    private void i(ByteBuffer byteBuffer, int i4, VisualSampleEntry visualSampleEntry) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        cVar.d();
        cVar.c(8);
        if (cVar.d()) {
            i4 = cVar.c(4);
            cVar.c(3);
        }
        if (cVar.c(4) == 15) {
            cVar.c(8);
            cVar.c(8);
        }
        if (cVar.d()) {
            cVar.c(2);
            cVar.d();
            if (cVar.d()) {
                throw new RuntimeException(ProtectedSandApp.s("ົ\u0001"));
            }
        }
        int c5 = cVar.c(2);
        if (c5 == this.f63782p && i4 != 1) {
            cVar.c(4);
        }
        cVar.d();
        this.f63788v = cVar.c(16);
        cVar.d();
        if (cVar.d()) {
            f63778w.info(ProtectedSandApp.s("ຼ\u0001"));
            int i5 = 0;
            while (this.f63788v >= (1 << i5)) {
                i5++;
            }
            this.f63787u = cVar.c(i5);
        }
        if (c5 == this.f63781o) {
            throw new RuntimeException(ProtectedSandApp.s("ຽ\u0001"));
        }
        if (c5 == this.f63779m) {
            cVar.d();
            visualSampleEntry.setWidth(cVar.c(13));
            cVar.d();
            visualSampleEntry.setHeight(cVar.c(13));
            cVar.d();
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63784r;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.c
    protected com.googlecode.mp4parser.authoring.f b(List<? extends ByteBuffer> list) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[]{0, 0, 1});
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = i4 * 2;
            byteBufferArr[i5] = wrap;
            byteBufferArr[i5 + 1] = list.get(i4);
        }
        return new com.googlecode.mp4parser.authoring.g(byteBufferArr);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("\u0ebe\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63783q;
    }
}
