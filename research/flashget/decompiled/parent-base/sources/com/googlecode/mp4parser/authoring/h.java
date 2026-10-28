package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* compiled from: Track.java */
/* loaded from: classes6.dex */
public interface h extends Closeable {
    List<f> A();

    SubSampleInformationBox E0();

    List<SampleDependencyTypeBox.a> I3();

    long[] S2();

    List<c> U1();

    List<CompositionTimeToSample.a> W();

    long getDuration();

    String getHandler();

    String getName();

    SampleDescriptionBox getSampleDescriptionBox();

    Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> k2();

    i u2();

    long[] z0();
}
