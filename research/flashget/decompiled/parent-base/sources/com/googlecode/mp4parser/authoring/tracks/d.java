package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: Amf0Track.java */
/* loaded from: classes6.dex */
public class d extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    SortedMap<Long, byte[]> f63507e;

    /* renamed from: f, reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.i f63508f;

    /* compiled from: Amf0Track.java */
    class a extends TreeMap<Long, byte[]> {
        a() {
        }
    }

    public d(Map<Long, byte[]> map) {
        super(ProtectedSandApp.s("ട\u0001"));
        this.f63507e = new a();
        this.f63508f = new com.googlecode.mp4parser.authoring.i();
        this.f63507e = new TreeMap(map);
        this.f63508f.o(new Date());
        this.f63508f.u(new Date());
        this.f63508f.v(1000L);
        this.f63508f.r(ProtectedSandApp.s("ഠ\u0001"));
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> A() {
        LinkedList linkedList = new LinkedList();
        Iterator<byte[]> it = this.f63507e.values().iterator();
        while (it.hasNext()) {
            linkedList.add(new com.googlecode.mp4parser.authoring.g(ByteBuffer.wrap(it.next())));
        }
        return linkedList;
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
        LinkedList linkedList = new LinkedList(this.f63507e.keySet());
        Collections.sort(linkedList);
        long[] jArr = new long[linkedList.size()];
        for (int i4 = 0; i4 < linkedList.size(); i4++) {
            jArr[i4] = ((Long) linkedList.get(i4)).longValue();
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("ഡ\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
        ActionMessageFormat0SampleEntryBox actionMessageFormat0SampleEntryBox = new ActionMessageFormat0SampleEntryBox();
        actionMessageFormat0SampleEntryBox.setDataReferenceIndex(1);
        sampleDescriptionBox.addBox(actionMessageFormat0SampleEntryBox);
        return sampleDescriptionBox;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i u2() {
        return this.f63508f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        return null;
    }
}
