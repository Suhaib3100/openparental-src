package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.i;
import com.googlecode.mp4parser.util.j;
import com.googlecode.mp4parser.util.l;
import com.googlecode.mp4parser.util.m;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class DefaultMp4Builder implements e {

    /* renamed from: f, reason: collision with root package name */
    private static i f63373f = i.a(DefaultMp4Builder.class);

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f63374g = false;

    /* renamed from: a, reason: collision with root package name */
    Map<h, StaticChunkOffsetBox> f63375a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    Set<SampleAuxiliaryInformationOffsetsBox> f63376b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    HashMap<h, List<com.googlecode.mp4parser.authoring.f>> f63377c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    HashMap<h, long[]> f63378d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private d f63379e;

    class a implements Comparator<h> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            return com.googlecode.mp4parser.util.c.a(hVar.u2().l() - hVar2.u2().l());
        }
    }

    public static long s(long j4, long j5) {
        return j5 == 0 ? j4 : s(j5, j4 % j5);
    }

    private static long x(int[] iArr) {
        long j4 = 0;
        for (int i4 : iArr) {
            j4 += i4;
        }
        return j4;
    }

    private static long y(long[] jArr) {
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.googlecode.mp4parser.authoring.builder.e
    public com.coremedia.iso.boxes.c a(com.googlecode.mp4parser.authoring.d dVar) {
        com.coremedia.iso.boxes.b next;
        if (this.f63379e == null) {
            this.f63379e = new com.googlecode.mp4parser.authoring.builder.a(2.0d);
        }
        f63373f.b(ProtectedSandApp.s("ಜ\u0001") + dVar);
        Iterator<h> it = dVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h next2 = it.next();
            List<com.googlecode.mp4parser.authoring.f> A = next2.A();
            v(next2, A);
            int size = A.size();
            long[] jArr = new long[size];
            for (int i4 = 0; i4 < size; i4++) {
                jArr[i4] = A.get(i4).getSize();
            }
            this.f63378d.put(next2, jArr);
        }
        BasicContainer basicContainer = new BasicContainer();
        basicContainer.addBox(f(dVar));
        HashMap hashMap = new HashMap();
        for (h hVar : dVar.g()) {
            hashMap.put(hVar, t(hVar));
        }
        MovieBox g4 = g(dVar, hashMap);
        basicContainer.addBox(g4);
        Iterator it2 = m.f(g4, ProtectedSandApp.s("ಝ\u0001")).iterator();
        long j4 = 0;
        while (it2.hasNext()) {
            j4 += y(((SampleSizeBox) it2.next()).getSampleSizes());
        }
        f63373f.b(ProtectedSandApp.s("ಞ\u0001"));
        InterleaveChunkMdat interleaveChunkMdat = new InterleaveChunkMdat(this, dVar, hashMap, j4, null);
        basicContainer.addBox(interleaveChunkMdat);
        f63373f.b(ProtectedSandApp.s("ಟ\u0001"));
        long dataOffset = interleaveChunkMdat.getDataOffset();
        Iterator<StaticChunkOffsetBox> it3 = this.f63375a.values().iterator();
        while (it3.hasNext()) {
            long[] chunkOffsets = it3.next().getChunkOffsets();
            for (int i5 = 0; i5 < chunkOffsets.length; i5++) {
                chunkOffsets[i5] = chunkOffsets[i5] + dataOffset;
            }
        }
        for (SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox : this.f63376b) {
            long size2 = sampleAuxiliaryInformationOffsetsBox.getSize() + 44;
            SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox2 = sampleAuxiliaryInformationOffsetsBox;
            while (true) {
                com.coremedia.iso.boxes.c parent = sampleAuxiliaryInformationOffsetsBox2.getParent();
                Iterator<com.coremedia.iso.boxes.b> it4 = parent.getBoxes().iterator();
                while (it4.hasNext() && (next = it4.next()) != sampleAuxiliaryInformationOffsetsBox2) {
                    size2 += next.getSize();
                }
                if (!(parent instanceof com.coremedia.iso.boxes.b)) {
                    break;
                }
                sampleAuxiliaryInformationOffsetsBox2 = parent;
            }
            long[] offsets = sampleAuxiliaryInformationOffsetsBox.getOffsets();
            for (int i6 = 0; i6 < offsets.length; i6++) {
                offsets[i6] = offsets[i6] + size2;
            }
            sampleAuxiliaryInformationOffsetsBox.setOffsets(offsets);
        }
        return basicContainer;
    }

    protected void c(com.googlecode.mp4parser.authoring.tracks.h hVar, SampleTableBox sampleTableBox, int[] iArr) {
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = new SampleAuxiliaryInformationSizesBox();
        sampleAuxiliaryInformationSizesBox.setAuxInfoType(ProtectedSandApp.s("ಠ\u0001"));
        sampleAuxiliaryInformationSizesBox.setFlags(1);
        List<com.mp4parser.iso23001.part7.a> g32 = hVar.g3();
        if (hVar.C1()) {
            int size = g32.size();
            short[] sArr = new short[size];
            for (int i4 = 0; i4 < size; i4++) {
                sArr[i4] = (short) g32.get(i4).b();
            }
            sampleAuxiliaryInformationSizesBox.setSampleInfoSizes(sArr);
        } else {
            sampleAuxiliaryInformationSizesBox.setDefaultSampleInfoSize(8);
            sampleAuxiliaryInformationSizesBox.setSampleCount(hVar.A().size());
        }
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = new SampleAuxiliaryInformationOffsetsBox();
        SampleEncryptionBox sampleEncryptionBox = new SampleEncryptionBox();
        sampleEncryptionBox.setSubSampleEncryption(hVar.C1());
        sampleEncryptionBox.setEntries(g32);
        long offsetToFirstIV = sampleEncryptionBox.getOffsetToFirstIV();
        long[] jArr = new long[iArr.length];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = offsetToFirstIV;
            int i7 = 0;
            while (i7 < iArr[i6]) {
                offsetToFirstIV += g32.get(i5).b();
                i7++;
                i5++;
                sampleEncryptionBox = sampleEncryptionBox;
            }
        }
        sampleAuxiliaryInformationOffsetsBox.setOffsets(jArr);
        sampleTableBox.addBox(sampleAuxiliaryInformationSizesBox);
        sampleTableBox.addBox(sampleAuxiliaryInformationOffsetsBox);
        sampleTableBox.addBox(sampleEncryptionBox);
        this.f63376b.add(sampleAuxiliaryInformationOffsetsBox);
    }

    protected void d(h hVar, SampleTableBox sampleTableBox) {
        List<CompositionTimeToSample.a> W = hVar.W();
        if (W == null || W.isEmpty()) {
            return;
        }
        CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
        compositionTimeToSample.setEntries(W);
        sampleTableBox.addBox(compositionTimeToSample);
    }

    protected com.coremedia.iso.boxes.b e(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        if (hVar.U1() == null || hVar.U1().size() <= 0) {
            return null;
        }
        EditListBox editListBox = new EditListBox();
        editListBox.setVersion(0);
        ArrayList arrayList = new ArrayList();
        for (com.googlecode.mp4parser.authoring.c cVar : hVar.U1()) {
            arrayList.add(new EditListBox.a(editListBox, Math.round(cVar.c() * dVar.e()), (hVar.u2().k() * cVar.b()) / cVar.d(), cVar.a()));
        }
        editListBox.setEntries(arrayList);
        EditBox editBox = new EditBox();
        editBox.addBox(editListBox);
        return editBox;
    }

    protected FileTypeBox f(com.googlecode.mp4parser.authoring.d dVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(ProtectedSandApp.s("ಡ\u0001"));
        String s4 = ProtectedSandApp.s("ಢ\u0001");
        linkedList.add(s4);
        linkedList.add(ProtectedSandApp.s("ಣ\u0001"));
        linkedList.add(ProtectedSandApp.s("ತ\u0001"));
        return new FileTypeBox(s4, 1L, linkedList);
    }

    protected MovieBox g(com.googlecode.mp4parser.authoring.d dVar, Map<h, int[]> map) {
        long duration;
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(dVar.c());
        long u4 = u(dVar);
        long j4 = 0;
        for (h hVar : dVar.g()) {
            if (hVar.U1() == null || hVar.U1().isEmpty()) {
                duration = (hVar.getDuration() * u4) / hVar.u2().k();
            } else {
                Iterator<com.googlecode.mp4parser.authoring.c> it = hVar.U1().iterator();
                double d5 = p.f60679p;
                while (it.hasNext()) {
                    d5 += (long) it.next().c();
                }
                duration = (long) (d5 * u4);
            }
            if (duration > j4) {
                j4 = duration;
            }
        }
        movieHeaderBox.setDuration(j4);
        movieHeaderBox.setTimescale(u4);
        long j5 = 0;
        for (h hVar2 : dVar.g()) {
            if (j5 < hVar2.u2().l()) {
                j5 = hVar2.u2().l();
            }
        }
        movieHeaderBox.setNextTrackId(j5 + 1);
        movieBox.addBox(movieHeaderBox);
        Iterator<h> it2 = dVar.g().iterator();
        while (it2.hasNext()) {
            movieBox.addBox(q(it2.next(), dVar, map));
        }
        com.coremedia.iso.boxes.b r4 = r(dVar);
        if (r4 != null) {
            movieBox.addBox(r4);
        }
        return movieBox;
    }

    protected void h(h hVar, SampleTableBox sampleTableBox) {
        if (hVar.I3() == null || hVar.I3().isEmpty()) {
            return;
        }
        SampleDependencyTypeBox sampleDependencyTypeBox = new SampleDependencyTypeBox();
        sampleDependencyTypeBox.setEntries(hVar.I3());
        sampleTableBox.addBox(sampleDependencyTypeBox);
    }

    protected com.coremedia.iso.boxes.b i(h hVar, com.googlecode.mp4parser.authoring.d dVar, Map<h, int[]> map) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        l(hVar, sampleTableBox);
        o(hVar, sampleTableBox);
        d(hVar, sampleTableBox);
        m(hVar, sampleTableBox);
        h(hVar, sampleTableBox);
        k(hVar, map, sampleTableBox);
        n(hVar, sampleTableBox);
        j(hVar, dVar, map, sampleTableBox);
        HashMap hashMap = new HashMap();
        for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> entry : hVar.k2().entrySet()) {
            String b5 = entry.getKey().b();
            List list = (List) hashMap.get(b5);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(b5, list);
            }
            list.add(entry.getKey());
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            SampleGroupDescriptionBox sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
            String str = (String) entry2.getKey();
            sampleGroupDescriptionBox.setGroupingType(str);
            sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
            SampleToGroupBox sampleToGroupBox = new SampleToGroupBox();
            sampleToGroupBox.setGroupingType(str);
            SampleToGroupBox.a aVar = null;
            for (int i4 = 0; i4 < hVar.A().size(); i4++) {
                int i5 = 0;
                for (int i6 = 0; i6 < ((List) entry2.getValue()).size(); i6++) {
                    if (Arrays.binarySearch(hVar.k2().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) ((List) entry2.getValue()).get(i6)), i4) >= 0) {
                        i5 = i6 + 1;
                    }
                }
                if (aVar == null || aVar.a() != i5) {
                    SampleToGroupBox.a aVar2 = new SampleToGroupBox.a(1L, i5);
                    sampleToGroupBox.getEntries().add(aVar2);
                    aVar = aVar2;
                } else {
                    aVar.d(aVar.b() + 1);
                }
            }
            sampleTableBox.addBox(sampleGroupDescriptionBox);
            sampleTableBox.addBox(sampleToGroupBox);
        }
        if (hVar instanceof com.googlecode.mp4parser.authoring.tracks.h) {
            c((com.googlecode.mp4parser.authoring.tracks.h) hVar, sampleTableBox, map.get(hVar));
        }
        p(hVar, sampleTableBox);
        f63373f.b(ProtectedSandApp.s("ಥ\u0001") + hVar.u2().l());
        return sampleTableBox;
    }

    protected void j(h hVar, com.googlecode.mp4parser.authoring.d dVar, Map<h, int[]> map, SampleTableBox sampleTableBox) {
        int i4;
        char c5 = 0;
        int i5 = 1;
        if (this.f63375a.get(hVar) == null) {
            f63373f.b(ProtectedSandApp.s("ದ\u0001") + hVar.u2().l());
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new a());
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i6 = i5;
                h hVar2 = (h) it.next();
                hashMap.put(hVar2, 0);
                hashMap2.put(hVar2, 0);
                hashMap3.put(hVar2, Double.valueOf(p.f60679p));
                this.f63375a.put(hVar2, new StaticChunkOffsetBox());
                i5 = i6;
                c5 = 0;
                arrayList = arrayList;
            }
            long j4 = 0;
            while (true) {
                Iterator it2 = arrayList.iterator();
                h hVar3 = null;
                while (it2.hasNext()) {
                    int i7 = i5;
                    ArrayList arrayList2 = arrayList;
                    h hVar4 = (h) it2.next();
                    if ((hVar3 == null || ((Double) hashMap3.get(hVar4)).doubleValue() < ((Double) hashMap3.get(hVar3)).doubleValue()) && ((Integer) hashMap.get(hVar4)).intValue() < map.get(hVar4).length) {
                        hVar3 = hVar4;
                        arrayList = arrayList2;
                        i5 = i7;
                    } else {
                        i5 = i7;
                        arrayList = arrayList2;
                    }
                    c5 = 0;
                }
                if (hVar3 == null) {
                    break;
                }
                StaticChunkOffsetBox staticChunkOffsetBox = this.f63375a.get(hVar3);
                long[] chunkOffsets = staticChunkOffsetBox.getChunkOffsets();
                long[] jArr = new long[i5];
                jArr[c5] = j4;
                staticChunkOffsetBox.setChunkOffsets(l.c(chunkOffsets, jArr));
                int intValue = ((Integer) hashMap.get(hVar3)).intValue();
                int i10 = map.get(hVar3)[intValue];
                int intValue2 = ((Integer) hashMap2.get(hVar3)).intValue();
                double doubleValue = ((Double) hashMap3.get(hVar3)).doubleValue();
                long[] S2 = hVar3.S2();
                int i11 = intValue2;
                while (true) {
                    i4 = intValue2 + i10;
                    if (i11 >= i4) {
                        break;
                    }
                    long j5 = j4 + this.f63378d.get(hVar3)[i11];
                    doubleValue = (S2[i11] / hVar3.u2().k()) + doubleValue;
                    i11++;
                    i5 = 1;
                    arrayList = arrayList;
                    j4 = j5;
                }
                hashMap.put(hVar3, Integer.valueOf(intValue + i5));
                hashMap2.put(hVar3, Integer.valueOf(i4));
                hashMap3.put(hVar3, Double.valueOf(doubleValue));
                c5 = 0;
            }
        }
        sampleTableBox.addBox(this.f63375a.get(hVar));
    }

    protected void k(h hVar, Map<h, int[]> map, SampleTableBox sampleTableBox) {
        int[] iArr = map.get(hVar);
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        long j4 = -2147483648L;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (j4 != iArr[i4]) {
                sampleToChunkBox.getEntries().add(new SampleToChunkBox.a(i4 + 1, iArr[i4], 1L));
                j4 = iArr[i4];
            }
        }
        sampleTableBox.addBox(sampleToChunkBox);
    }

    protected void l(h hVar, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(hVar.getSampleDescriptionBox());
    }

    protected void m(h hVar, SampleTableBox sampleTableBox) {
        long[] z02 = hVar.z0();
        if (z02 == null || z02.length <= 0) {
            return;
        }
        SyncSampleBox syncSampleBox = new SyncSampleBox();
        syncSampleBox.setSampleNumber(z02);
        sampleTableBox.addBox(syncSampleBox);
    }

    protected void n(h hVar, SampleTableBox sampleTableBox) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.f63378d.get(hVar));
        sampleTableBox.addBox(sampleSizeBox);
    }

    protected void o(h hVar, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        TimeToSampleBox.a aVar = null;
        for (long j4 : hVar.S2()) {
            if (aVar == null || aVar.b() != j4) {
                aVar = new TimeToSampleBox.a(1L, j4);
                arrayList.add(aVar);
            } else {
                aVar.c(aVar.a() + 1);
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    protected void p(h hVar, SampleTableBox sampleTableBox) {
        if (hVar.E0() != null) {
            sampleTableBox.addBox(hVar.E0());
        }
    }

    protected TrackBox q(h hVar, com.googlecode.mp4parser.authoring.d dVar, Map<h, int[]> map) {
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setMatrix(hVar.u2().g());
        trackHeaderBox.setAlternateGroup(hVar.u2().c());
        trackHeaderBox.setCreationTime(hVar.u2().b());
        if (hVar.U1() == null || hVar.U1().isEmpty()) {
            trackHeaderBox.setDuration((u(dVar) * hVar.getDuration()) / hVar.u2().k());
        } else {
            Iterator<com.googlecode.mp4parser.authoring.c> it = hVar.U1().iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 += (long) it.next().c();
            }
            trackHeaderBox.setDuration(hVar.u2().k() * j4);
        }
        trackHeaderBox.setHeight(hVar.u2().d());
        trackHeaderBox.setWidth(hVar.u2().n());
        trackHeaderBox.setLayer(hVar.u2().f());
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(hVar.u2().l());
        trackHeaderBox.setVolume(hVar.u2().m());
        trackBox.addBox(trackHeaderBox);
        trackBox.addBox(e(hVar, dVar));
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(hVar.u2().b());
        mediaHeaderBox.setDuration(hVar.getDuration());
        mediaHeaderBox.setTimescale(hVar.u2().k());
        mediaHeaderBox.setLanguage(hVar.u2().e());
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox();
        mediaBox.addBox(handlerBox);
        handlerBox.setHandlerType(hVar.getHandler());
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        if (hVar.getHandler().equals(ProtectedSandApp.s("ಧ\u0001"))) {
            mediaInformationBox.addBox(new VideoMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ನ\u0001"))) {
            mediaInformationBox.addBox(new SoundMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("\u0ca9\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ಪ\u0001"))) {
            mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ಫ\u0001"))) {
            mediaInformationBox.addBox(new HintMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ಬ\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        }
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        mediaInformationBox.addBox(i(hVar, dVar, map));
        mediaBox.addBox(mediaInformationBox);
        f63373f.b(ProtectedSandApp.s("ಭ\u0001") + hVar.u2().l());
        return trackBox;
    }

    protected com.coremedia.iso.boxes.b r(com.googlecode.mp4parser.authoring.d dVar) {
        return null;
    }

    int[] t(h hVar) {
        long[] a5 = this.f63379e.a(hVar);
        int[] iArr = new int[a5.length];
        int i4 = 0;
        while (i4 < a5.length) {
            int i5 = i4 + 1;
            iArr[i4] = com.googlecode.mp4parser.util.c.a((a5.length == i5 ? hVar.A().size() : a5[i5] - 1) - (a5[i4] - 1));
            i4 = i5;
        }
        return iArr;
    }

    public long u(com.googlecode.mp4parser.authoring.d dVar) {
        long k4 = dVar.g().iterator().next().u2().k();
        Iterator<h> it = dVar.g().iterator();
        while (it.hasNext()) {
            k4 = j.d(k4, it.next().u2().k());
        }
        return k4;
    }

    protected List<com.googlecode.mp4parser.authoring.f> v(h hVar, List<com.googlecode.mp4parser.authoring.f> list) {
        return this.f63377c.put(hVar, list);
    }

    public void w(d dVar) {
        this.f63379e = dVar;
    }

    private class InterleaveChunkMdat implements com.coremedia.iso.boxes.b {
        List<List<com.googlecode.mp4parser.authoring.f>> chunkList;
        long contentSize;
        com.coremedia.iso.boxes.c parent;
        List<h> tracks;

        class a implements Comparator<h> {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(h hVar, h hVar2) {
                return com.googlecode.mp4parser.util.c.a(hVar.u2().l() - hVar2.u2().l());
            }
        }

        private InterleaveChunkMdat(com.googlecode.mp4parser.authoring.d dVar, Map<h, int[]> map, long j4) {
            int i4;
            this.chunkList = new ArrayList();
            this.contentSize = j4;
            this.tracks = dVar.g();
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new a());
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hashMap.put(hVar, 0);
                hashMap2.put(hVar, 0);
                hashMap3.put(hVar, Double.valueOf(p.f60679p));
            }
            while (true) {
                Iterator it2 = arrayList.iterator();
                h hVar2 = null;
                while (it2.hasNext()) {
                    h hVar3 = (h) it2.next();
                    if (hVar2 == null || ((Double) hashMap3.get(hVar3)).doubleValue() < ((Double) hashMap3.get(hVar2)).doubleValue()) {
                        if (((Integer) hashMap.get(hVar3)).intValue() < map.get(hVar3).length) {
                            hVar2 = hVar3;
                        }
                    }
                }
                if (hVar2 == null) {
                    return;
                }
                int intValue = ((Integer) hashMap.get(hVar2)).intValue();
                int i5 = map.get(hVar2)[intValue];
                int intValue2 = ((Integer) hashMap2.get(hVar2)).intValue();
                double doubleValue = ((Double) hashMap3.get(hVar2)).doubleValue();
                int i6 = intValue2;
                while (true) {
                    i4 = intValue2 + i5;
                    if (i6 >= i4) {
                        break;
                    }
                    doubleValue += hVar2.S2()[i6] / hVar2.u2().k();
                    i6++;
                    i5 = i5;
                    intValue = intValue;
                }
                this.chunkList.add(hVar2.A().subList(intValue2, i4));
                hashMap.put(hVar2, Integer.valueOf(intValue + 1));
                hashMap2.put(hVar2, Integer.valueOf(i4));
                hashMap3.put(hVar2, Double.valueOf(doubleValue));
            }
        }

        private boolean isSmallBox(long j4) {
            return j4 + 8 < 4294967296L;
        }

        @Override // com.coremedia.iso.boxes.b
        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                com.coremedia.iso.i.i(allocate, size);
            } else {
                com.coremedia.iso.i.i(allocate, 1L);
            }
            allocate.put(com.coremedia.iso.f.b(ProtectedSandApp.s("ಗ\u0001")));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                com.coremedia.iso.i.l(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
            DefaultMp4Builder.f63373f.b(ProtectedSandApp.s("ಘ\u0001") + this.contentSize);
            Iterator<List<com.googlecode.mp4parser.authoring.f>> it = this.chunkList.iterator();
            long j4 = 0;
            long j5 = 0;
            while (it.hasNext()) {
                for (com.googlecode.mp4parser.authoring.f fVar : it.next()) {
                    fVar.b(writableByteChannel);
                    j4 += fVar.getSize();
                    if (j4 > 1048576) {
                        j4 -= 1048576;
                        j5++;
                        DefaultMp4Builder.f63373f.b(ProtectedSandApp.s("ಙ\u0001") + j5 + ProtectedSandApp.s("ಚ\u0001"));
                    }
                }
            }
        }

        public long getDataOffset() {
            com.coremedia.iso.boxes.b next;
            long j4 = 16;
            Object obj = this;
            while (obj instanceof com.coremedia.iso.boxes.b) {
                com.coremedia.iso.boxes.b bVar = (com.coremedia.iso.boxes.b) obj;
                Iterator<com.coremedia.iso.boxes.b> it = bVar.getParent().getBoxes().iterator();
                while (it.hasNext() && obj != (next = it.next())) {
                    j4 += next.getSize();
                }
                obj = bVar.getParent();
            }
            return j4;
        }

        @Override // com.coremedia.iso.boxes.b
        public long getOffset() {
            throw new RuntimeException(ProtectedSandApp.s("ಛ\u0001"));
        }

        @Override // com.coremedia.iso.boxes.b
        public com.coremedia.iso.boxes.c getParent() {
            return this.parent;
        }

        @Override // com.coremedia.iso.boxes.b
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // com.coremedia.iso.boxes.b
        public String getType() {
            return ProtectedSandApp.s("ಗ\u0001");
        }

        @Override // com.coremedia.iso.boxes.b
        public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        }

        @Override // com.coremedia.iso.boxes.b
        public void setParent(com.coremedia.iso.boxes.c cVar) {
            this.parent = cVar;
        }

        /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, com.googlecode.mp4parser.authoring.d dVar, Map map, long j4, InterleaveChunkMdat interleaveChunkMdat) {
            this(dVar, map, j4);
        }
    }
}
