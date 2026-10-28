package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: WrappingTrack.java */
/* loaded from: classes6.dex */
public class j implements h {

    /* renamed from: b, reason: collision with root package name */
    h f63428b;

    public j(h hVar) {
        this.f63428b = hVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> A() {
        return this.f63428b.A();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63428b.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63428b.I3();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        return this.f63428b.S2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<c> U1() {
        return this.f63428b.U1();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return this.f63428b.W();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63428b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        return this.f63428b.getDuration();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63428b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return String.valueOf(this.f63428b.getName()).concat(ProtectedSandApp.s("\u0cd9\u0001"));
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63428b.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63428b.k2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i u2() {
        return this.f63428b.u2();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return this.f63428b.z0();
    }
}
