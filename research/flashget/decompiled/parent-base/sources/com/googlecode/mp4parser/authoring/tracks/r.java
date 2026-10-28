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

/* compiled from: MultiplyTimeScaleTrack.java */
/* loaded from: classes6.dex */
public class r implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: b, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63815b;

    /* renamed from: c, reason: collision with root package name */
    private int f63816c;

    public r(com.googlecode.mp4parser.authoring.h hVar, int i4) {
        this.f63815b = hVar;
        this.f63816c = i4;
    }

    static List<CompositionTimeToSample.a> a(List<CompositionTimeToSample.a> list, int i4) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (CompositionTimeToSample.a aVar : list) {
            arrayList.add(new CompositionTimeToSample.a(aVar.a(), aVar.b() * i4));
        }
        return arrayList;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63815b.A();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63815b.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63815b.I3();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        long[] jArr = new long[this.f63815b.S2().length];
        for (int i4 = 0; i4 < this.f63815b.S2().length; i4++) {
            jArr[i4] = this.f63815b.S2()[i4] * this.f63816c;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> U1() {
        return this.f63815b.U1();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return a(this.f63815b.W(), this.f63816c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63815b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        return this.f63815b.getDuration() * this.f63816c;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63815b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return ProtectedSandApp.s("່\u0001") + this.f63815b.getName() + ProtectedSandApp.s("້\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63815b.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63815b.k2();
    }

    public String toString() {
        return ProtectedSandApp.s("໊\u0001") + this.f63815b + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        com.googlecode.mp4parser.authoring.i iVar = (com.googlecode.mp4parser.authoring.i) this.f63815b.u2().clone();
        iVar.v(this.f63815b.u2().k() * this.f63816c);
        return iVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63815b.z0();
    }
}
