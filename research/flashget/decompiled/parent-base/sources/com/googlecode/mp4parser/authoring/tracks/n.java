package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: DivideTimeScaleTrack.java */
/* loaded from: classes6.dex */
public class n implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: b, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63759b;

    /* renamed from: c, reason: collision with root package name */
    private int f63760c;

    public n(com.googlecode.mp4parser.authoring.h hVar, int i4) {
        this.f63759b = hVar;
        this.f63760c = i4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63759b.A();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63759b.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63759b.I3();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        long[] jArr = new long[this.f63759b.S2().length];
        for (int i4 = 0; i4 < this.f63759b.S2().length; i4++) {
            jArr[i4] = this.f63759b.S2()[i4] / this.f63760c;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> U1() {
        return this.f63759b.U1();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return a();
    }

    List<CompositionTimeToSample.a> a() {
        List<CompositionTimeToSample.a> W = this.f63759b.W();
        if (W == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(W.size());
        for (CompositionTimeToSample.a aVar : W) {
            arrayList.add(new CompositionTimeToSample.a(aVar.a(), aVar.b() / this.f63760c));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63759b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : S2()) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63759b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return ProtectedSandApp.s("ບ\u0001") + this.f63759b.getName() + ProtectedSandApp.s("ປ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63759b.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63759b.k2();
    }

    public String toString() {
        return ProtectedSandApp.s("ຜ\u0001") + this.f63759b + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        com.googlecode.mp4parser.authoring.i iVar = (com.googlecode.mp4parser.authoring.i) this.f63759b.u2().clone();
        iVar.v(this.f63759b.u2().k() / this.f63760c);
        return iVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63759b.z0();
    }
}
