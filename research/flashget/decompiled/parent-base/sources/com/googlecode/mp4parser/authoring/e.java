package com.googlecode.mp4parser.authoring;

import androidx.compose.runtime.z4;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.l;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Mp4TrackImpl.java */
/* loaded from: classes6.dex */
public class e extends a {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f63401p = false;

    /* renamed from: e, reason: collision with root package name */
    TrackBox f63402e;

    /* renamed from: f, reason: collision with root package name */
    com.coremedia.iso.f[] f63403f;

    /* renamed from: g, reason: collision with root package name */
    private List<f> f63404g;

    /* renamed from: h, reason: collision with root package name */
    private SampleDescriptionBox f63405h;

    /* renamed from: i, reason: collision with root package name */
    private long[] f63406i;

    /* renamed from: j, reason: collision with root package name */
    private List<CompositionTimeToSample.a> f63407j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f63408k;

    /* renamed from: l, reason: collision with root package name */
    private List<SampleDependencyTypeBox.a> f63409l;

    /* renamed from: m, reason: collision with root package name */
    private i f63410m;

    /* renamed from: n, reason: collision with root package name */
    private String f63411n;

    /* renamed from: o, reason: collision with root package name */
    private SubSampleInformationBox f63412o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, TrackBox trackBox, com.coremedia.iso.f... fVarArr) {
        super(str);
        ArrayList arrayList;
        SampleTableBox sampleTableBox;
        boolean z4;
        int i4;
        e eVar = this;
        eVar.f63408k = null;
        eVar.f63410m = new i();
        eVar.f63412o = null;
        eVar.f63402e = trackBox;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        eVar.f63404g = new com.coremedia.iso.boxes.mdat.a(trackBox, fVarArr);
        SampleTableBox sampleTableBox2 = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        eVar.f63411n = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        ArrayList arrayList2 = new ArrayList();
        eVar.f63407j = new ArrayList();
        eVar.f63409l = new ArrayList();
        arrayList2.addAll(sampleTableBox2.getTimeToSampleBox().getEntries());
        if (sampleTableBox2.getCompositionTimeToSample() != null) {
            eVar.f63407j.addAll(sampleTableBox2.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox2.getSampleDependencyTypeBox() != null) {
            eVar.f63409l.addAll(sampleTableBox2.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox2.getSyncSampleBox() != null) {
            eVar.f63408k = sampleTableBox2.getSyncSampleBox().getSampleNumber();
        }
        String s4 = ProtectedSandApp.s("ಇ\u0001");
        eVar.f63412o = (SubSampleInformationBox) m.e(sampleTableBox2, s4);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(((com.coremedia.iso.boxes.b) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = fVarArr.length;
        int i5 = 0;
        while (i5 < length) {
            ArrayList arrayList4 = arrayList3;
            arrayList4.addAll(fVarArr[i5].getBoxes(MovieFragmentBox.class));
            i5++;
            arrayList3 = arrayList4;
            eVar = this;
        }
        eVar.f63405h = sampleTableBox2.getSampleDescriptionBox();
        List boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        Class<SampleGroupDescriptionBox> cls = SampleGroupDescriptionBox.class;
        if (boxes.size() > 0) {
            Iterator it = boxes.iterator();
            while (it.hasNext()) {
                for (TrackExtendsBox trackExtendsBox : ((MovieExtendsBox) it.next()).getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox.getTrackId() == trackId) {
                        if (m.h(((com.coremedia.iso.boxes.b) trackBox.getParent()).getParent(), ProtectedSandApp.s("ಈ\u0001")).size() > 0) {
                            eVar.f63412o = new SubSampleInformationBox();
                        }
                        Iterator it2 = arrayList3.iterator();
                        long j4 = 1;
                        long j5 = 1;
                        while (it2.hasNext()) {
                            Iterator it3 = ((MovieFragmentBox) it2.next()).getBoxes(TrackFragmentBox.class).iterator();
                            long j6 = j5;
                            while (it3.hasNext()) {
                                TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it3.next();
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    Iterator it4 = it3;
                                    long j7 = trackId;
                                    long j10 = j4;
                                    ArrayList arrayList5 = arrayList3;
                                    Class<SampleGroupDescriptionBox> cls2 = cls;
                                    eVar.f63364d = a(sampleTableBox2.getBoxes(cls), m.h(trackFragmentBox, ProtectedSandApp.s("ಉ\u0001")), m.h(trackFragmentBox, ProtectedSandApp.s("ಊ\u0001")), eVar.f63364d, j6 - j4);
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) m.e(trackFragmentBox, s4);
                                    if (subSampleInformationBox != null) {
                                        long j11 = (j6 - 0) - j10;
                                        for (SubSampleInformationBox.a aVar : subSampleInformationBox.getEntries()) {
                                            SubSampleInformationBox.a aVar2 = new SubSampleInformationBox.a();
                                            aVar2.c().addAll(aVar.c());
                                            if (j11 != 0) {
                                                aVar2.d(aVar.a() + j11);
                                                j11 = 0;
                                            } else {
                                                aVar2.d(aVar.a());
                                            }
                                            eVar.f63412o.getEntries().add(aVar2);
                                        }
                                    }
                                    for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {
                                        TrackFragmentHeaderBox trackFragmentHeaderBox = ((TrackFragmentBox) trackRunBox.getParent()).getTrackFragmentHeaderBox();
                                        boolean z5 = true;
                                        for (TrackRunBox.a aVar3 : trackRunBox.getEntries()) {
                                            if (!trackRunBox.isSampleDurationPresent()) {
                                                arrayList = arrayList5;
                                                sampleTableBox = sampleTableBox2;
                                                if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                    arrayList2.add(new TimeToSampleBox.a(j10, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                                } else {
                                                    arrayList2.add(new TimeToSampleBox.a(j10, trackExtendsBox.getDefaultSampleDuration()));
                                                }
                                            } else if (arrayList2.size() == 0 || ((TimeToSampleBox.a) z4.a(arrayList2, 1)).b() != aVar3.j()) {
                                                arrayList = arrayList5;
                                                sampleTableBox = sampleTableBox2;
                                                arrayList2.add(new TimeToSampleBox.a(j10, aVar3.j()));
                                            } else {
                                                TimeToSampleBox.a aVar4 = (TimeToSampleBox.a) z4.a(arrayList2, 1);
                                                arrayList = arrayList5;
                                                sampleTableBox = sampleTableBox2;
                                                aVar4.c(aVar4.a() + j10);
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (eVar.f63407j.size() != 0) {
                                                    i4 = 1;
                                                    if (((CompositionTimeToSample.a) androidx.appcompat.view.menu.d.a(eVar.f63407j, 1)).b() == aVar3.i()) {
                                                        CompositionTimeToSample.a aVar5 = (CompositionTimeToSample.a) androidx.appcompat.view.menu.d.a(eVar.f63407j, 1);
                                                        aVar5.c(aVar5.a() + 1);
                                                    }
                                                } else {
                                                    i4 = 1;
                                                }
                                                eVar.f63407j.add(new CompositionTimeToSample.a(i4, com.googlecode.mp4parser.util.c.a(aVar3.i())));
                                            }
                                            com.coremedia.iso.boxes.fragment.a k4 = trackRunBox.isSampleFlagsPresent() ? aVar3.k() : (z5 && trackRunBox.isFirstSampleFlagsPresent()) ? trackRunBox.getFirstSampleFlags() : trackFragmentHeaderBox.hasDefaultSampleFlags() ? trackFragmentHeaderBox.getDefaultSampleFlags() : trackExtendsBox.getDefaultSampleFlags();
                                            if (k4 == null || k4.i()) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                                eVar.f63408k = l.c(eVar.f63408k, j6);
                                            }
                                            j6++;
                                            z5 = z4;
                                            sampleTableBox2 = sampleTableBox;
                                            j10 = 1;
                                            arrayList5 = arrayList;
                                        }
                                    }
                                    j4 = j10;
                                    arrayList3 = arrayList5;
                                    trackId = j7;
                                    cls = cls2;
                                    it3 = it4;
                                } else {
                                    arrayList3 = arrayList3;
                                }
                            }
                            j5 = j6;
                        }
                    }
                }
            }
        } else {
            eVar.f63364d = a(sampleTableBox2.getBoxes(cls), null, sampleTableBox2.getBoxes(SampleToGroupBox.class), eVar.f63364d, 0L);
        }
        eVar.f63406i = TimeToSampleBox.blowupTimeToSamples(arrayList2);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        eVar.f63410m.w(trackHeaderBox.getTrackId());
        eVar.f63410m.o(mediaHeaderBox.getCreationTime());
        eVar.f63410m.r(mediaHeaderBox.getLanguage());
        eVar.f63410m.u(mediaHeaderBox.getModificationTime());
        eVar.f63410m.v(mediaHeaderBox.getTimescale());
        eVar.f63410m.q(trackHeaderBox.getHeight());
        eVar.f63410m.z(trackHeaderBox.getWidth());
        eVar.f63410m.s(trackHeaderBox.getLayer());
        eVar.f63410m.t(trackHeaderBox.getMatrix());
        eVar.f63410m.y(trackHeaderBox.getVolume());
        EditListBox editListBox = (EditListBox) m.e(trackBox, ProtectedSandApp.s("ಋ\u0001"));
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) m.e(trackBox, ProtectedSandApp.s("ಌ\u0001"));
        if (editListBox != null) {
            for (Iterator<EditListBox.a> it5 = editListBox.getEntries().iterator(); it5.hasNext(); it5 = it5) {
                EditListBox.a next = it5.next();
                eVar.f63363c.add(new c(next.c(), mediaHeaderBox.getTimescale(), next.b(), next.d() / movieHeaderBox.getTimescale()));
                eVar = this;
                mediaHeaderBox = mediaHeaderBox;
            }
        }
    }

    private Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> a(List<SampleGroupDescriptionBox> list, List<SampleGroupDescriptionBox> list2, List<SampleToGroupBox> list3, Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> map, long j4) {
        for (SampleToGroupBox sampleToGroupBox : list3) {
            int i4 = 0;
            for (SampleToGroupBox.a aVar : sampleToGroupBox.getEntries()) {
                if (aVar.a() > 0) {
                    com.googlecode.mp4parser.boxes.mp4.samplegrouping.b bVar = null;
                    if (aVar.a() > 65535) {
                        for (SampleGroupDescriptionBox sampleGroupDescriptionBox : list2) {
                            if (sampleGroupDescriptionBox.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                bVar = sampleGroupDescriptionBox.getGroupEntries().get((aVar.a() - 1) & 65535);
                            }
                        }
                    } else {
                        for (SampleGroupDescriptionBox sampleGroupDescriptionBox2 : list) {
                            if (sampleGroupDescriptionBox2.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                bVar = sampleGroupDescriptionBox2.getGroupEntries().get(aVar.a() - 1);
                            }
                        }
                    }
                    com.googlecode.mp4parser.boxes.mp4.samplegrouping.b bVar2 = bVar;
                    long[] jArr = map.get(bVar2);
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    long[] jArr2 = jArr;
                    long[] jArr3 = new long[com.googlecode.mp4parser.util.c.a(aVar.b()) + jArr2.length];
                    System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
                    int i5 = 0;
                    while (true) {
                        long j5 = i5;
                        if (j5 >= aVar.b()) {
                            break;
                        }
                        jArr3[jArr2.length + i5] = j4 + i4 + j5;
                        i5++;
                    }
                    map.put(bVar2, jArr3);
                }
                i4 = (int) (aVar.b() + i4);
            }
        }
        return map;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> A() {
        return this.f63404g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63412o;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<SampleDependencyTypeBox.a> I3() {
        return this.f63409l;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] S2() {
        return this.f63406i;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<CompositionTimeToSample.a> W() {
        return this.f63407j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        com.coremedia.iso.boxes.c parent = this.f63402e.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
        com.coremedia.iso.f[] fVarArr = this.f63403f;
        if (fVarArr != null) {
            for (com.coremedia.iso.f fVar : fVarArr) {
                fVar.close();
            }
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f63411n;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63405h;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i u2() {
        return this.f63410m;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] z0() {
        long[] jArr = this.f63408k;
        if (jArr == null || jArr.length == this.f63404g.size()) {
            return null;
        }
        return this.f63408k;
    }
}
