package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;

/* compiled from: ReplaceSampleTrack.java */
/* loaded from: classes6.dex */
public class s extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f63817e;

    /* renamed from: f, reason: collision with root package name */
    private long f63818f;

    /* renamed from: g, reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.f f63819g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f63820h;

    /* compiled from: ReplaceSampleTrack.java */
    private class b extends AbstractList<com.googlecode.mp4parser.authoring.f> {
        private b() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.googlecode.mp4parser.authoring.f get(int i4) {
            return s.this.f63818f == ((long) i4) ? s.this.f63819g : s.this.f63817e.A().get(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return s.this.f63817e.A().size();
        }

        /* synthetic */ b(s sVar, b bVar) {
            this();
        }
    }

    public s(com.googlecode.mp4parser.authoring.h hVar, long j4, ByteBuffer byteBuffer) {
        super(ProtectedSandApp.s("໋\u0001") + hVar.getName() + ProtectedSandApp.s("໌\u0001"));
        this.f63817e = hVar;
        this.f63818f = j4;
        this.f63819g = new com.googlecode.mp4parser.authoring.g(byteBuffer);
        this.f63820h = new b(this, null);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        return this.f63820h;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63817e.E0();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63817e.I3();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] S2() {
        return this.f63817e.S2();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return this.f63817e.W();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63817e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63817e.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63817e.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63817e.u2();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public synchronized long[] z0() {
        return this.f63817e.z0();
    }
}
