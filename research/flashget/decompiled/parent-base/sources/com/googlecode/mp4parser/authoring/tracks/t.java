package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: SilenceTrackImpl.java */
/* loaded from: classes6.dex */
public class t implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: b, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63822b;

    /* renamed from: c, reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f63823c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    long[] f63824d;

    /* renamed from: e, reason: collision with root package name */
    String f63825e;

    public t(com.googlecode.mp4parser.authoring.h hVar, long j4) {
        this.f63822b = hVar;
        this.f63825e = com.flashget.kid.common.configs.log.o.a(j4, ProtectedSandApp.s("ໍ\u0001"));
        if (!ProtectedSandApp.s("໎\u0001").equals(hVar.getSampleDescriptionBox().getSampleEntry().getType())) {
            throw new RuntimeException(ProtectedSandApp.s("\u0ecf\u0001") + hVar.getClass().getSimpleName() + ProtectedSandApp.s("໐\u0001"));
        }
        int a5 = com.googlecode.mp4parser.util.c.a(((u2().k() * j4) / 1000) / 1024);
        long[] jArr = new long[a5];
        this.f63824d = jArr;
        Arrays.fill(jArr, ((u2().k() * j4) / a5) / 1000);
        while (true) {
            int i4 = a5 - 1;
            if (a5 <= 0) {
                return;
            }
            this.f63823c.add(new com.googlecode.mp4parser.authoring.g((ByteBuffer) ByteBuffer.wrap(new byte[]{33, com.google.common.base.c.f54872r, 4, 96, -116, com.google.common.base.c.F}).rewind()));
            a5 = i4;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63823c;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63824d;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> U1() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : this.f63824d) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63822b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return this.f63825e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63822b.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63822b.k2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63822b.u2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }
}
