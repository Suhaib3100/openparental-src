package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TextTrackImpl.java */
/* loaded from: classes6.dex */
public class u extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f63838e;

    /* renamed from: f, reason: collision with root package name */
    SampleDescriptionBox f63839f;

    /* renamed from: g, reason: collision with root package name */
    List<a> f63840g;

    /* renamed from: h, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63841h;

    /* compiled from: TextTrackImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f63842a;

        /* renamed from: b, reason: collision with root package name */
        long f63843b;

        /* renamed from: c, reason: collision with root package name */
        String f63844c;

        public a(long j4, long j5, String str) {
            this.f63842a = j4;
            this.f63843b = j5;
            this.f63844c = str;
        }

        public long a() {
            return this.f63842a;
        }

        public String b() {
            return this.f63844c;
        }

        public long c() {
            return this.f63843b;
        }
    }

    public u() {
        super(ProtectedSandApp.s("༃\u0001"));
        this.f63838e = new com.googlecode.mp4parser.authoring.i();
        this.f63840g = new LinkedList();
        this.f63839f = new SampleDescriptionBox();
        TextSampleEntry textSampleEntry = new TextSampleEntry(ProtectedSandApp.s("༄\u0001"));
        textSampleEntry.setDataReferenceIndex(1);
        textSampleEntry.setStyleRecord(new TextSampleEntry.b());
        textSampleEntry.setBoxRecord(new TextSampleEntry.a());
        this.f63839f.addBox(textSampleEntry);
        FontTableBox fontTableBox = new FontTableBox();
        fontTableBox.setEntries(Collections.singletonList(new FontTableBox.a(1, ProtectedSandApp.s("༅\u0001"))));
        textSampleEntry.addBox(fontTableBox);
        this.f63838e.o(new Date());
        this.f63838e.u(new Date());
        this.f63838e.v(1000L);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized List<com.googlecode.mp4parser.authoring.f> A() {
        try {
            if (this.f63841h == null) {
                this.f63841h = new ArrayList();
                long j4 = 0;
                for (a aVar : this.f63840g) {
                    long j5 = aVar.f63842a - j4;
                    if (j5 > 0) {
                        this.f63841h.add(new com.googlecode.mp4parser.authoring.g(ByteBuffer.wrap(new byte[2])));
                    } else if (j5 < 0) {
                        throw new Error(ProtectedSandApp.s("༈\u0001"));
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeShort(aVar.f63844c.getBytes(ProtectedSandApp.s("༆\u0001")).length);
                        dataOutputStream.write(aVar.f63844c.getBytes(ProtectedSandApp.s("༆\u0001")));
                        dataOutputStream.close();
                        this.f63841h.add(new com.googlecode.mp4parser.authoring.g(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
                        j4 = aVar.f63843b;
                    } catch (IOException unused) {
                        throw new Error(ProtectedSandApp.s("༇\u0001"));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f63841h;
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
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        for (a aVar : this.f63840g) {
            long j5 = aVar.f63842a - j4;
            if (j5 > 0) {
                arrayList.add(Long.valueOf(j5));
            } else if (j5 < 0) {
                throw new Error(ProtectedSandApp.s("༈\u0001"));
            }
            arrayList.add(Long.valueOf(aVar.f63843b - aVar.f63842a));
            j4 = aVar.f63843b;
        }
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr[i4] = ((Long) it.next()).longValue();
            i4++;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
    }

    public List<a> a() {
        return this.f63840g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("༉\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63839f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63838e;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }
}
