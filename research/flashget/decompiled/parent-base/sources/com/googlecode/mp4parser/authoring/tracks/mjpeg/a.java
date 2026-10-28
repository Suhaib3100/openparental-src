package com.googlecode.mp4parser.authoring.tracks.mjpeg;

import android.support.v4.media.b;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.coremedia.iso.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.googlecode.mp4parser.authoring.c;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.authoring.i;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.m;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;

/* compiled from: OneJpegPerIframe.java */
/* loaded from: classes6.dex */
public class a extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    File[] f63750e;

    /* renamed from: f, reason: collision with root package name */
    i f63751f;

    /* renamed from: g, reason: collision with root package name */
    long[] f63752g;

    /* renamed from: h, reason: collision with root package name */
    SampleDescriptionBox f63753h;

    /* renamed from: i, reason: collision with root package name */
    long[] f63754i;

    /* compiled from: OneJpegPerIframe.java */
    /* renamed from: com.googlecode.mp4parser.authoring.tracks.mjpeg.a$a, reason: collision with other inner class name */
    class C0964a extends AbstractList<f> {

        /* compiled from: OneJpegPerIframe.java */
        /* renamed from: com.googlecode.mp4parser.authoring.tracks.mjpeg.a$a$a, reason: collision with other inner class name */
        class C0965a implements f {

            /* renamed from: a, reason: collision with root package name */
            ByteBuffer f63756a = null;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ int f63758c;

            C0965a(int i4) {
                this.f63758c = i4;
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public ByteBuffer a() {
                if (this.f63756a == null) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(a.this.f63750e[this.f63758c], ProtectedSandApp.s("ຑ\u0001"));
                        this.f63756a = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    } catch (IOException e4) {
                        throw new RuntimeException(e4);
                    }
                }
                return this.f63756a;
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public void b(WritableByteChannel writableByteChannel) throws IOException {
                RandomAccessFile randomAccessFile = new RandomAccessFile(a.this.f63750e[this.f63758c], ProtectedSandApp.s("ຑ\u0001"));
                randomAccessFile.getChannel().transferTo(0L, randomAccessFile.length(), writableByteChannel);
                randomAccessFile.close();
            }

            @Override // com.googlecode.mp4parser.authoring.f
            public long getSize() {
                return a.this.f63750e[this.f63758c].length();
            }
        }

        C0964a() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f get(int i4) {
            return new C0965a(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return a.this.f63750e.length;
        }
    }

    public a(String str, File[] fileArr, h hVar) throws IOException {
        super(str);
        this.f63751f = new i();
        this.f63750e = fileArr;
        if (hVar.z0().length != fileArr.length) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ຖ\u0001"));
            sb.append(hVar.z0().length);
            sb.append(ProtectedSandApp.s("ທ\u0001"));
            throw new RuntimeException(b.a(sb, fileArr.length, ProtectedSandApp.s("ຘ\u0001")));
        }
        BufferedImage read = ImageIO.read(fileArr[0]);
        this.f63751f.z(read.getWidth());
        this.f63751f.q(read.getHeight());
        this.f63751f.v(hVar.u2().k());
        long[] S2 = hVar.S2();
        long[] z02 = hVar.z0();
        this.f63752g = new long[z02.length];
        long j4 = 0;
        boolean z4 = true;
        long j5 = 0;
        int i4 = 1;
        for (int i5 = 1; i5 < S2.length; i5++) {
            if (i4 < z02.length && i5 == z02[i4]) {
                this.f63752g[i4 - 1] = j5;
                i4++;
                j5 = 0;
            }
            j5 += S2[i5];
        }
        long[] jArr = this.f63752g;
        jArr[jArr.length - 1] = j5;
        this.f63753h = new SampleDescriptionBox();
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry(ProtectedSandApp.s("ຒ\u0001"));
        this.f63753h.addBox(visualSampleEntry);
        ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
        String s4 = ProtectedSandApp.s("ຓ\u0001");
        eSDescriptorBox.setData(ByteBuffer.wrap(e.a(s4)));
        eSDescriptorBox.setEsDescriptor((com.googlecode.mp4parser.boxes.mp4.objectdescriptors.h) m.a(-1, ByteBuffer.wrap(e.a(s4))));
        visualSampleEntry.addBox(eSDescriptorBox);
        this.f63754i = new long[fileArr.length];
        int i6 = 0;
        while (true) {
            long[] jArr2 = this.f63754i;
            if (i6 >= jArr2.length) {
                break;
            }
            int i7 = i6 + 1;
            jArr2[i6] = i7;
            i6 = i7;
        }
        boolean z5 = true;
        double d5 = 0.0d;
        for (c cVar : hVar.U1()) {
            if (cVar.b() == -1 && !z4) {
                throw new RuntimeException(ProtectedSandApp.s("ດ\u0001"));
            }
            if (cVar.b() >= 0 && !z5) {
                throw new RuntimeException(ProtectedSandApp.s("ຕ\u0001"));
            }
            if (cVar.b() == -1) {
                d5 += cVar.c();
            } else {
                d5 -= cVar.b() / cVar.d();
                z5 = false;
                z4 = false;
            }
        }
        if (hVar.W() != null && hVar.W().size() > 0) {
            int[] blowupCompositionTimes = CompositionTimeToSample.blowupCompositionTimes(hVar.W());
            for (int i10 = 0; i10 < blowupCompositionTimes.length && i10 < 50; i10++) {
                blowupCompositionTimes[i10] = (int) (blowupCompositionTimes[i10] + j4);
                j4 += hVar.S2()[i10];
            }
            Arrays.sort(blowupCompositionTimes);
            d5 += blowupCompositionTimes[0] / hVar.u2().k();
        }
        if (d5 < p.f60679p) {
            U1().add(new c((long) ((-d5) * u2().k()), u2().k(), 1.0d, getDuration() / u2().k()));
        } else if (d5 > p.f60679p) {
            U1().add(new c(-1L, u2().k(), 1.0d, d5));
            U1().add(new c(0L, u2().k(), 1.0d, getDuration() / u2().k()));
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> A() {
        return new C0964a();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63752g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ນ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63753h;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i u2() {
        return this.f63751f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63754i;
    }
}
