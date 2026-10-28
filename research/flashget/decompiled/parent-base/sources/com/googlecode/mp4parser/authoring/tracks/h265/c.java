package com.googlecode.mp4parser.authoring.tracks.h265;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.tracks.c;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import com.mp4parser.iso14496.part15.b;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: H265TrackImpl.java */
/* loaded from: classes6.dex */
public class c extends com.googlecode.mp4parser.authoring.tracks.c implements b {

    /* renamed from: m, reason: collision with root package name */
    ArrayList<ByteBuffer> f63651m;

    /* renamed from: n, reason: collision with root package name */
    ArrayList<ByteBuffer> f63652n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<ByteBuffer> f63653o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<com.googlecode.mp4parser.authoring.f> f63654p;

    /* renamed from: q, reason: collision with root package name */
    SampleDescriptionBox f63655q;

    public c(com.googlecode.mp4parser.a aVar) throws IOException {
        super(aVar, true);
        this.f63651m = new ArrayList<>();
        this.f63652n = new ArrayList<>();
        this.f63653o = new ArrayList<>();
        this.f63654p = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        c.a aVar2 = new c.a(aVar);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = {true};
        while (true) {
            ByteBuffer c5 = c(aVar2);
            if (c5 == null) {
                this.f63655q = e();
                this.f63496f = new long[this.f63654p.size()];
                u2().v(25L);
                Arrays.fill(this.f63496f, 1L);
                return;
            }
            a f4 = f(c5);
            if (zArr[0]) {
                if (!g(f4)) {
                    switch (f4.f63620b) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
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
                            i(arrayList, zArr, zArr2);
                            break;
                    }
                } else if ((c5.get(2) & Byte.MIN_VALUE) != 0) {
                    i(arrayList, zArr, zArr2);
                }
            }
            int i4 = f4.f63620b;
            if (i4 != 39) {
                switch (i4) {
                    case 32:
                        c5.position(2);
                        this.f63653o.add(c5.slice());
                        System.err.println(ProtectedSandApp.s("\u0d99\u0001"));
                        break;
                    case 33:
                        c5.position(2);
                        this.f63651m.add(c5.slice());
                        c5.position(1);
                        new h(Channels.newInputStream(new com.googlecode.mp4parser.util.b(c5.slice())));
                        System.err.println(ProtectedSandApp.s("\u0d98\u0001"));
                        break;
                    case 34:
                        c5.position(2);
                        this.f63652n.add(c5.slice());
                        System.err.println(ProtectedSandApp.s("\u0d97\u0001"));
                        break;
                }
            } else {
                new g(new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(c5.slice()));
            }
            switch (f4.f63620b) {
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    break;
                default:
                    System.err.println(ProtectedSandApp.s("ක\u0001") + f4.f63620b);
                    arrayList.add(c5);
                    break;
            }
            if (g(f4)) {
                int i5 = f4.f63620b;
                if (i5 == 19 || i5 == 20) {
                    zArr2[0] = zArr2[0];
                } else {
                    zArr2[0] = false;
                }
            }
            zArr[0] = zArr[0] | g(f4);
        }
    }

    private SampleDescriptionBox e() {
        this.f63655q = new SampleDescriptionBox();
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry(ProtectedSandApp.s("ඛ\u0001"));
        visualSampleEntry.setDataReferenceIndex(1);
        visualSampleEntry.setDepth(24);
        visualSampleEntry.setFrameCount(1);
        visualSampleEntry.setHorizresolution(72.0d);
        visualSampleEntry.setVertresolution(72.0d);
        visualSampleEntry.setWidth(640);
        visualSampleEntry.setHeight(480);
        visualSampleEntry.setCompressorname(ProtectedSandApp.s("ග\u0001"));
        HevcConfigurationBox hevcConfigurationBox = new HevcConfigurationBox();
        b.a aVar = new b.a();
        aVar.f70062a = true;
        aVar.f70064c = 33;
        aVar.f70065d = new ArrayList();
        Iterator<ByteBuffer> it = this.f63651m.iterator();
        while (it.hasNext()) {
            aVar.f70065d.add(com.googlecode.mp4parser.authoring.tracks.c.d(it.next()));
        }
        b.a aVar2 = new b.a();
        aVar2.f70062a = true;
        aVar2.f70064c = 34;
        aVar2.f70065d = new ArrayList();
        Iterator<ByteBuffer> it2 = this.f63652n.iterator();
        while (it2.hasNext()) {
            aVar2.f70065d.add(com.googlecode.mp4parser.authoring.tracks.c.d(it2.next()));
        }
        b.a aVar3 = new b.a();
        aVar3.f70062a = true;
        aVar3.f70064c = 34;
        aVar3.f70065d = new ArrayList();
        Iterator<ByteBuffer> it3 = this.f63653o.iterator();
        while (it3.hasNext()) {
            aVar3.f70065d.add(com.googlecode.mp4parser.authoring.tracks.c.d(it3.next()));
        }
        hevcConfigurationBox.getArrays().addAll(Arrays.asList(aVar, aVar3, aVar2));
        visualSampleEntry.addBox(hevcConfigurationBox);
        this.f63655q.addBox(visualSampleEntry);
        return this.f63655q;
    }

    public static a f(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int i4 = com.coremedia.iso.g.i(byteBuffer);
        a aVar = new a();
        aVar.f63619a = (32768 & i4) >> 15;
        aVar.f63620b = (i4 & 32256) >> 9;
        aVar.f63621c = (i4 & 504) >> 3;
        aVar.f63622d = i4 & 7;
        return aVar;
    }

    public static void h(String[] strArr) throws IOException {
        c cVar = new c(new com.googlecode.mp4parser.c(ProtectedSandApp.s("ඝ\u0001")));
        com.googlecode.mp4parser.authoring.d dVar = new com.googlecode.mp4parser.authoring.d();
        dVar.a(cVar);
        new DefaultMp4Builder().a(dVar).writeContainer(new FileOutputStream(ProtectedSandApp.s("ඞ\u0001")).getChannel());
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63654p;
    }

    boolean g(a aVar) {
        int i4 = aVar.f63620b;
        return i4 >= 0 && i4 <= 31;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ඟ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return null;
    }

    public void i(List<ByteBuffer> list, boolean[] zArr, boolean[] zArr2) {
        this.f63654p.add(b(list));
        PrintStream printStream = System.err;
        printStream.print(ProtectedSandApp.s("ච\u0001") + list.size() + ProtectedSandApp.s("ඡ\u0001"));
        if (zArr2[0]) {
            printStream.println(ProtectedSandApp.s("ජ\u0001"));
        } else {
            printStream.println();
        }
        zArr[0] = false;
        zArr2[0] = true;
        list.clear();
    }
}
