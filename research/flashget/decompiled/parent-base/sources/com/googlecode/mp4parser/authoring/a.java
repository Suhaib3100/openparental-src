package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AbstractTrack.java */
/* loaded from: classes6.dex */
public abstract class a implements h {

    /* renamed from: b, reason: collision with root package name */
    String f63362b;

    /* renamed from: c, reason: collision with root package name */
    List<c> f63363c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> f63364d = new HashMap();

    public a(String str) {
        this.f63362b = str;
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
    public List<c> U1() {
        return this.f63363c;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
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
    public String getName() {
        return this.f63362b;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2() {
        return this.f63364d;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }
}
