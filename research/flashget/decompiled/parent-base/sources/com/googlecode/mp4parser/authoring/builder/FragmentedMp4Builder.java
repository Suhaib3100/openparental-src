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
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.m;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public class FragmentedMp4Builder implements e {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f63382b = Logger.getLogger(FragmentedMp4Builder.class.getName());

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f63383c = false;

    /* renamed from: a, reason: collision with root package name */
    protected d f63384a;

    class a implements Comparator<h> {

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ Map f63386c;

        /* renamed from: d, reason: collision with root package name */
        private final /* synthetic */ int f63387d;

        a(Map map, int i4) {
            this.f63386c = map;
            this.f63387d = i4;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            long j4 = ((long[]) this.f63386c.get(hVar))[this.f63387d];
            long j5 = ((long[]) this.f63386c.get(hVar2))[this.f63387d];
            long[] S2 = hVar.S2();
            long[] S22 = hVar2.S2();
            long j6 = 0;
            for (int i4 = 1; i4 < j4; i4++) {
                j6 += S2[i4 - 1];
            }
            long j7 = 0;
            for (int i5 = 1; i5 < j5; i5++) {
                j7 += S22[i5 - 1];
            }
            return (int) (((j6 / hVar.u2().k()) - (j7 / hVar2.u2().k())) * 100.0d);
        }
    }

    private long I(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        return (dVar.e() * hVar.getDuration()) / hVar.u2().k();
    }

    protected void A(long j4, long j5, h hVar, int i4, MovieFragmentBox movieFragmentBox) {
        TrackFragmentBox trackFragmentBox = new TrackFragmentBox();
        movieFragmentBox.addBox(trackFragmentBox);
        x(j4, j5, hVar, i4, trackFragmentBox);
        w(j4, hVar, trackFragmentBox);
        D(j4, j5, hVar, i4, trackFragmentBox);
        if (hVar instanceof com.googlecode.mp4parser.authoring.tracks.h) {
            com.googlecode.mp4parser.authoring.tracks.h hVar2 = (com.googlecode.mp4parser.authoring.tracks.h) hVar;
            s(j4, j5, hVar2, i4, trackFragmentBox);
            t(j4, j5, hVar2, i4, trackFragmentBox);
            r(j4, j5, hVar2, i4, trackFragmentBox);
        }
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
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            SampleGroupDescriptionBox sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
            String str = (String) entry2.getKey();
            sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
            sampleGroupDescriptionBox.setGroupingType(str);
            SampleToGroupBox sampleToGroupBox = new SampleToGroupBox();
            sampleToGroupBox.setGroupingType(str);
            long j6 = 1;
            SampleToGroupBox.a aVar = null;
            for (int a5 = com.googlecode.mp4parser.util.c.a(j4 - 1); a5 < com.googlecode.mp4parser.util.c.a(j5 - j6); a5++) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < ((List) entry2.getValue()).size()) {
                    Iterator it2 = it;
                    i6 = Arrays.binarySearch(hVar.k2().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) ((List) entry2.getValue()).get(i5)), (long) a5) >= 0 ? 65537 + i5 : i6;
                    i5++;
                    it = it2;
                    j6 = 1;
                }
                if (aVar == null || aVar.a() != i6) {
                    SampleToGroupBox.a aVar2 = new SampleToGroupBox.a(j6, i6);
                    sampleToGroupBox.getEntries().add(aVar2);
                    aVar = aVar2;
                } else {
                    aVar.d(aVar.b() + j6);
                }
            }
            trackFragmentBox.addBox(sampleGroupDescriptionBox);
            trackFragmentBox.addBox(sampleToGroupBox);
        }
    }

    protected com.coremedia.iso.boxes.b B(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        f63382b.fine(ProtectedSandApp.s("ರ\u0001") + hVar);
        TrackBox trackBox = new TrackBox();
        trackBox.addBox(z(dVar, hVar));
        com.coremedia.iso.boxes.b c5 = c(hVar, dVar);
        if (c5 != null) {
            trackBox.addBox(c5);
        }
        trackBox.addBox(h(hVar, dVar));
        return trackBox;
    }

    protected com.coremedia.iso.boxes.b C(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        TrackExtendsBox trackExtendsBox = new TrackExtendsBox();
        trackExtendsBox.setTrackId(hVar.u2().l());
        trackExtendsBox.setDefaultSampleDescriptionIndex(1L);
        trackExtendsBox.setDefaultSampleDuration(0L);
        trackExtendsBox.setDefaultSampleSize(0L);
        com.coremedia.iso.boxes.fragment.a aVar = new com.coremedia.iso.boxes.fragment.a();
        if (ProtectedSandApp.s("ಱ\u0001").equals(hVar.getHandler()) || ProtectedSandApp.s("ಲ\u0001").equals(hVar.getHandler())) {
            aVar.m(2);
            aVar.o(2);
        }
        trackExtendsBox.setDefaultSampleFlags(aVar);
        return trackExtendsBox;
    }

    protected void D(long j4, long j5, h hVar, int i4, TrackFragmentBox trackFragmentBox) {
        long[] jArr;
        long j6;
        boolean z4;
        TrackRunBox trackRunBox = new TrackRunBox();
        boolean z5 = true;
        trackRunBox.setVersion(1);
        long[] G = G(j4, j5, hVar, i4);
        trackRunBox.setSampleDurationPresent(true);
        trackRunBox.setSampleSizePresent(true);
        ArrayList arrayList = new ArrayList(com.googlecode.mp4parser.util.c.a(j5 - j4));
        List<CompositionTimeToSample.a> W = hVar.W();
        CompositionTimeToSample.a[] aVarArr = (W == null || W.size() <= 0) ? null : (CompositionTimeToSample.a[]) W.toArray(new CompositionTimeToSample.a[W.size()]);
        long a5 = aVarArr != null ? aVarArr[0].a() : -1;
        trackRunBox.setSampleCompositionTimeOffsetPresent(a5 > 0);
        int i5 = 0;
        long j7 = 1;
        while (j7 < j4) {
            long[] jArr2 = G;
            if (aVarArr != null) {
                a5--;
                j6 = 0;
                if (a5 == 0) {
                    z4 = true;
                    if (aVarArr.length - i5 > 1) {
                        i5++;
                        a5 = aVarArr[i5].a();
                    }
                    j7++;
                    G = jArr2;
                    z5 = z4;
                }
            } else {
                j6 = 0;
            }
            z4 = true;
            j7++;
            G = jArr2;
            z5 = z4;
        }
        boolean z6 = ((hVar.I3() == null || hVar.I3().isEmpty()) && (hVar.z0() == null || hVar.z0().length == 0)) ? false : z5;
        trackRunBox.setSampleFlagsPresent(z6);
        int i6 = 0;
        while (i6 < G.length) {
            TrackRunBox.a aVar = new TrackRunBox.a();
            aVar.p(G[i6]);
            if (z6) {
                com.coremedia.iso.boxes.fragment.a aVar2 = new com.coremedia.iso.boxes.fragment.a();
                if (hVar.I3() != null && !hVar.I3().isEmpty()) {
                    SampleDependencyTypeBox.a aVar3 = hVar.I3().get(i6);
                    aVar2.m(aVar3.c());
                    aVar2.o(aVar3.e());
                    aVar2.n(aVar3.d());
                }
                if (hVar.z0() == null || hVar.z0().length <= 0) {
                    jArr = G;
                } else {
                    jArr = G;
                    if (Arrays.binarySearch(hVar.z0(), j4 + i6) >= 0) {
                        aVar2.p(false);
                        aVar2.m(2);
                    } else {
                        aVar2.p(true);
                        aVar2.m(1);
                    }
                }
                aVar.o(aVar2);
            } else {
                jArr = G;
            }
            aVar.n(hVar.S2()[com.googlecode.mp4parser.util.c.a((j4 + i6) - 1)]);
            if (aVarArr != null) {
                aVar.m(aVarArr[i5].b());
                a5--;
                if (a5 == 0 && aVarArr.length - i5 > 1) {
                    i5++;
                    a5 = aVarArr[i5].a();
                }
            }
            arrayList.add(aVar);
            i6++;
            G = jArr;
        }
        trackRunBox.setEntries(arrayList);
        trackFragmentBox.addBox(trackRunBox);
    }

    public Date E() {
        return new Date();
    }

    public d F() {
        return this.f63384a;
    }

    protected long[] G(long j4, long j5, h hVar, int i4) {
        List<com.googlecode.mp4parser.authoring.f> H = H(j4, j5, hVar);
        int size = H.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            jArr[i5] = H.get(i5).getSize();
        }
        return jArr;
    }

    protected List<com.googlecode.mp4parser.authoring.f> H(long j4, long j5, h hVar) {
        return hVar.A().subList(com.googlecode.mp4parser.util.c.a(j4) - 1, com.googlecode.mp4parser.util.c.a(j5) - 1);
    }

    public void J(d dVar) {
        this.f63384a = dVar;
    }

    protected List<h> K(List<h> list, int i4, Map<h, long[]> map) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new a(map, i4));
        return linkedList;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.e
    public com.coremedia.iso.boxes.c a(com.googlecode.mp4parser.authoring.d dVar) {
        f63382b.fine(ProtectedSandApp.s("ಳ\u0001") + dVar);
        if (this.f63384a == null) {
            this.f63384a = new com.googlecode.mp4parser.authoring.builder.a(2.0d);
        }
        BasicContainer basicContainer = new BasicContainer();
        basicContainer.addBox(e(dVar));
        basicContainer.addBox(o(dVar));
        Iterator<com.coremedia.iso.boxes.b> it = n(dVar).iterator();
        while (it.hasNext()) {
            basicContainer.addBox(it.next());
        }
        basicContainer.addBox(k(dVar, basicContainer));
        return basicContainer;
    }

    protected DataInformationBox b(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        return dataInformationBox;
    }

    protected com.coremedia.iso.boxes.b c(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        if (hVar.U1() == null || hVar.U1().size() <= 0) {
            return null;
        }
        EditListBox editListBox = new EditListBox();
        editListBox.setVersion(1);
        ArrayList arrayList = new ArrayList();
        for (com.googlecode.mp4parser.authoring.c cVar : hVar.U1()) {
            arrayList.add(new EditListBox.a(editListBox, Math.round(cVar.c() * dVar.e()), (hVar.u2().k() * cVar.b()) / cVar.d(), cVar.a()));
        }
        editListBox.setEntries(arrayList);
        EditBox editBox = new EditBox();
        editBox.addBox(editListBox);
        return editBox;
    }

    protected int d(List<com.coremedia.iso.boxes.b> list, h hVar, long j4, long j5, int i4) {
        if (j4 != j5) {
            list.add(m(j4, j5, hVar, i4));
            list.add(f(j4, j5, hVar, i4));
        }
        return i4;
    }

    public com.coremedia.iso.boxes.b e(com.googlecode.mp4parser.authoring.d dVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(ProtectedSandApp.s("\u0cb4\u0001"));
        String s4 = ProtectedSandApp.s("ವ\u0001");
        linkedList.add(s4);
        linkedList.add(ProtectedSandApp.s("ಶ\u0001"));
        linkedList.add(ProtectedSandApp.s("ಷ\u0001"));
        return new FileTypeBox(s4, 1L, linkedList);
    }

    protected com.coremedia.iso.boxes.b f(final long j4, final long j5, final h hVar, int i4) {
        return new com.coremedia.iso.boxes.b() { // from class: com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.1Mdat
            com.coremedia.iso.boxes.c parent;
            long size_ = -1;

            @Override // com.coremedia.iso.boxes.b
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                i.i(allocate, com.googlecode.mp4parser.util.c.a(getSize()));
                allocate.put(com.coremedia.iso.f.b(getType()));
                allocate.rewind();
                writableByteChannel.write(allocate);
                Iterator<com.googlecode.mp4parser.authoring.f> it = FragmentedMp4Builder.this.H(j4, j5, hVar).iterator();
                while (it.hasNext()) {
                    it.next().b(writableByteChannel);
                }
            }

            @Override // com.coremedia.iso.boxes.b
            public long getOffset() {
                throw new RuntimeException(ProtectedSandApp.s("ಮ\u0001"));
            }

            @Override // com.coremedia.iso.boxes.b
            public com.coremedia.iso.boxes.c getParent() {
                return this.parent;
            }

            @Override // com.coremedia.iso.boxes.b
            public long getSize() {
                long j6 = this.size_;
                if (j6 != -1) {
                    return j6;
                }
                Iterator<com.googlecode.mp4parser.authoring.f> it = FragmentedMp4Builder.this.H(j4, j5, hVar).iterator();
                long j7 = 8;
                while (it.hasNext()) {
                    j7 += it.next().getSize();
                }
                this.size_ = j7;
                return j7;
            }

            @Override // com.coremedia.iso.boxes.b
            public String getType() {
                return ProtectedSandApp.s("ಯ\u0001");
            }

            @Override // com.coremedia.iso.boxes.b
            public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j6, com.coremedia.iso.c cVar) throws IOException {
            }

            @Override // com.coremedia.iso.boxes.b
            public void setParent(com.coremedia.iso.boxes.c cVar) {
                this.parent = cVar;
            }
        };
    }

    protected com.coremedia.iso.boxes.b g(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(hVar.u2().b());
        mediaHeaderBox.setModificationTime(E());
        mediaHeaderBox.setDuration(0L);
        mediaHeaderBox.setTimescale(hVar.u2().k());
        mediaHeaderBox.setLanguage(hVar.u2().e());
        return mediaHeaderBox;
    }

    protected com.coremedia.iso.boxes.b h(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        MediaBox mediaBox = new MediaBox();
        mediaBox.addBox(g(dVar, hVar));
        mediaBox.addBox(i(hVar, dVar));
        mediaBox.addBox(l(hVar, dVar));
        return mediaBox;
    }

    protected com.coremedia.iso.boxes.b i(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setHandlerType(hVar.getHandler());
        return handlerBox;
    }

    protected void j(long j4, long j5, h hVar, int i4, MovieFragmentBox movieFragmentBox) {
        MovieFragmentHeaderBox movieFragmentHeaderBox = new MovieFragmentHeaderBox();
        movieFragmentHeaderBox.setSequenceNumber(i4);
        movieFragmentBox.addBox(movieFragmentHeaderBox);
    }

    protected com.coremedia.iso.boxes.b k(com.googlecode.mp4parser.authoring.d dVar, com.coremedia.iso.boxes.c cVar) {
        MovieFragmentRandomAccessBox movieFragmentRandomAccessBox = new MovieFragmentRandomAccessBox();
        Iterator<h> it = dVar.g().iterator();
        while (it.hasNext()) {
            movieFragmentRandomAccessBox.addBox(y(it.next(), cVar));
        }
        MovieFragmentRandomAccessOffsetBox movieFragmentRandomAccessOffsetBox = new MovieFragmentRandomAccessOffsetBox();
        movieFragmentRandomAccessBox.addBox(movieFragmentRandomAccessOffsetBox);
        movieFragmentRandomAccessOffsetBox.setMfraSize(movieFragmentRandomAccessBox.getSize());
        return movieFragmentRandomAccessBox;
    }

    protected com.coremedia.iso.boxes.b l(h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        if (hVar.getHandler().equals(ProtectedSandApp.s("ಸ\u0001"))) {
            mediaInformationBox.addBox(new VideoMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ಱ\u0001"))) {
            mediaInformationBox.addBox(new SoundMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ಹ\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("ಲ\u0001"))) {
            mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("\u0cba\u0001"))) {
            mediaInformationBox.addBox(new HintMediaHeaderBox());
        } else if (hVar.getHandler().equals(ProtectedSandApp.s("\u0cbb\u0001"))) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        }
        mediaInformationBox.addBox(b(dVar, hVar));
        mediaInformationBox.addBox(u(dVar, hVar));
        return mediaInformationBox;
    }

    protected com.coremedia.iso.boxes.b m(long j4, long j5, h hVar, int i4) {
        MovieFragmentBox movieFragmentBox = new MovieFragmentBox();
        j(j4, j5, hVar, i4, movieFragmentBox);
        A(j4, j5, hVar, i4, movieFragmentBox);
        TrackRunBox trackRunBox = movieFragmentBox.getTrackRunBoxes().get(0);
        trackRunBox.setDataOffset(1);
        trackRunBox.setDataOffset((int) (movieFragmentBox.getSize() + 8));
        return movieFragmentBox;
    }

    protected List<com.coremedia.iso.boxes.b> n(com.googlecode.mp4parser.authoring.d dVar) {
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (h hVar : dVar.g()) {
            hashMap.put(hVar, this.f63384a.a(hVar));
            hashMap2.put(hVar, Double.valueOf(p.f60679p));
        }
        int i4 = 1;
        int i5 = 1;
        while (!hashMap.isEmpty()) {
            double d5 = Double.MAX_VALUE;
            h hVar2 = null;
            for (Map.Entry entry : hashMap2.entrySet()) {
                int i6 = i4;
                int i7 = i5;
                if (((Double) entry.getValue()).doubleValue() < d5) {
                    d5 = ((Double) entry.getValue()).doubleValue();
                    hVar2 = (h) entry.getKey();
                }
                i4 = i6;
                i5 = i7;
            }
            long[] jArr = (long[]) hashMap.get(hVar2);
            long j4 = jArr[0];
            long size = jArr.length > i4 ? jArr[i4] : hVar2.A().size() + i4;
            long[] S2 = hVar2.S2();
            int i10 = i5;
            long k4 = hVar2.u2().k();
            double d6 = d5;
            long j5 = j4;
            while (j5 < size) {
                d6 = (S2[com.googlecode.mp4parser.util.c.a(j5 - 1)] / k4) + d6;
                j5++;
                j4 = j4;
                size = size;
            }
            d(linkedList, hVar2, j4, size, i10);
            if (jArr.length == 1) {
                hashMap.remove(hVar2);
                hashMap2.remove(hVar2);
            } else {
                int length = jArr.length - 1;
                long[] jArr2 = new long[length];
                System.arraycopy(jArr, 1, jArr2, 0, length);
                hashMap.put(hVar2, jArr2);
                hashMap2.put(hVar2, Double.valueOf(d6));
            }
            i5 = i10 + 1;
            i4 = 1;
        }
        return linkedList;
    }

    protected com.coremedia.iso.boxes.b o(com.googlecode.mp4parser.authoring.d dVar) {
        MovieBox movieBox = new MovieBox();
        movieBox.addBox(q(dVar));
        Iterator<h> it = dVar.g().iterator();
        while (it.hasNext()) {
            movieBox.addBox(B(it.next(), dVar));
        }
        movieBox.addBox(p(dVar));
        return movieBox;
    }

    protected com.coremedia.iso.boxes.b p(com.googlecode.mp4parser.authoring.d dVar) {
        MovieExtendsBox movieExtendsBox = new MovieExtendsBox();
        MovieExtendsHeaderBox movieExtendsHeaderBox = new MovieExtendsHeaderBox();
        movieExtendsHeaderBox.setVersion(1);
        Iterator<h> it = dVar.g().iterator();
        while (it.hasNext()) {
            long I = I(dVar, it.next());
            if (movieExtendsHeaderBox.getFragmentDuration() < I) {
                movieExtendsHeaderBox.setFragmentDuration(I);
            }
        }
        movieExtendsBox.addBox(movieExtendsHeaderBox);
        Iterator<h> it2 = dVar.g().iterator();
        while (it2.hasNext()) {
            movieExtendsBox.addBox(C(dVar, it2.next()));
        }
        return movieExtendsBox;
    }

    protected com.coremedia.iso.boxes.b q(com.googlecode.mp4parser.authoring.d dVar) {
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setVersion(1);
        movieHeaderBox.setCreationTime(E());
        movieHeaderBox.setModificationTime(E());
        long j4 = 0;
        movieHeaderBox.setDuration(0L);
        movieHeaderBox.setTimescale(dVar.e());
        for (h hVar : dVar.g()) {
            if (j4 < hVar.u2().l()) {
                j4 = hVar.u2().l();
            }
        }
        movieHeaderBox.setNextTrackId(j4 + 1);
        return movieHeaderBox;
    }

    protected void r(long j4, long j5, com.googlecode.mp4parser.authoring.tracks.h hVar, int i4, TrackFragmentBox trackFragmentBox) {
        com.coremedia.iso.boxes.b next;
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = new SampleAuxiliaryInformationOffsetsBox();
        trackFragmentBox.addBox(sampleAuxiliaryInformationOffsetsBox);
        sampleAuxiliaryInformationOffsetsBox.setAuxInfoType(ProtectedSandApp.s("ಽ\u0001"));
        sampleAuxiliaryInformationOffsetsBox.setFlags(1);
        Iterator<com.coremedia.iso.boxes.b> it = trackFragmentBox.getBoxes().iterator();
        long j6 = 8;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.coremedia.iso.boxes.b next2 = it.next();
            if (next2 instanceof SampleEncryptionBox) {
                j6 += ((SampleEncryptionBox) next2).getOffsetToFirstIV();
                break;
            }
            j6 += next2.getSize();
        }
        long j7 = j6 + 16;
        Iterator<com.coremedia.iso.boxes.b> it2 = ((MovieFragmentBox) trackFragmentBox.getParent()).getBoxes().iterator();
        while (it2.hasNext() && (next = it2.next()) != trackFragmentBox) {
            j7 += next.getSize();
        }
        sampleAuxiliaryInformationOffsetsBox.setOffsets(new long[]{j7});
    }

    protected void s(long j4, long j5, com.googlecode.mp4parser.authoring.tracks.h hVar, int i4, TrackFragmentBox trackFragmentBox) {
        SampleDescriptionBox sampleDescriptionBox = hVar.getSampleDescriptionBox();
        TrackEncryptionBox trackEncryptionBox = (TrackEncryptionBox) m.e(sampleDescriptionBox, ProtectedSandApp.s("ಾ\u0001"));
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = new SampleAuxiliaryInformationSizesBox();
        sampleAuxiliaryInformationSizesBox.setAuxInfoType(ProtectedSandApp.s("ಽ\u0001"));
        sampleAuxiliaryInformationSizesBox.setFlags(1);
        if (hVar.C1()) {
            int a5 = com.googlecode.mp4parser.util.c.a(j5 - j4);
            short[] sArr = new short[a5];
            List<com.mp4parser.iso23001.part7.a> subList = hVar.g3().subList(com.googlecode.mp4parser.util.c.a(j4 - 1), com.googlecode.mp4parser.util.c.a(j5 - 1));
            for (int i5 = 0; i5 < a5; i5++) {
                sArr[i5] = (short) subList.get(i5).b();
            }
            sampleAuxiliaryInformationSizesBox.setSampleInfoSizes(sArr);
        } else {
            sampleAuxiliaryInformationSizesBox.setDefaultSampleInfoSize(trackEncryptionBox.getDefaultIvSize());
            sampleAuxiliaryInformationSizesBox.setSampleCount(com.googlecode.mp4parser.util.c.a(j5 - j4));
        }
        trackFragmentBox.addBox(sampleAuxiliaryInformationSizesBox);
    }

    protected void t(long j4, long j5, com.googlecode.mp4parser.authoring.tracks.h hVar, int i4, TrackFragmentBox trackFragmentBox) {
        SampleEncryptionBox sampleEncryptionBox = new SampleEncryptionBox();
        sampleEncryptionBox.setSubSampleEncryption(hVar.C1());
        sampleEncryptionBox.setEntries(hVar.g3().subList(com.googlecode.mp4parser.util.c.a(j4 - 1), com.googlecode.mp4parser.util.c.a(j5 - 1)));
        trackFragmentBox.addBox(sampleEncryptionBox);
    }

    protected com.coremedia.iso.boxes.b u(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        v(hVar, sampleTableBox);
        sampleTableBox.addBox(new TimeToSampleBox());
        sampleTableBox.addBox(new SampleToChunkBox());
        sampleTableBox.addBox(new SampleSizeBox());
        sampleTableBox.addBox(new StaticChunkOffsetBox());
        return sampleTableBox;
    }

    protected void v(h hVar, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(hVar.getSampleDescriptionBox());
    }

    protected void w(long j4, h hVar, TrackFragmentBox trackFragmentBox) {
        TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox = new TrackFragmentBaseMediaDecodeTimeBox();
        trackFragmentBaseMediaDecodeTimeBox.setVersion(1);
        long[] S2 = hVar.S2();
        long j5 = 0;
        for (int i4 = 1; i4 < j4; i4++) {
            j5 += S2[i4 - 1];
        }
        trackFragmentBaseMediaDecodeTimeBox.setBaseMediaDecodeTime(j5);
        trackFragmentBox.addBox(trackFragmentBaseMediaDecodeTimeBox);
    }

    protected void x(long j4, long j5, h hVar, int i4, TrackFragmentBox trackFragmentBox) {
        TrackFragmentHeaderBox trackFragmentHeaderBox = new TrackFragmentHeaderBox();
        trackFragmentHeaderBox.setDefaultSampleFlags(new com.coremedia.iso.boxes.fragment.a());
        trackFragmentHeaderBox.setBaseDataOffset(-1L);
        trackFragmentHeaderBox.setTrackId(hVar.u2().l());
        trackFragmentHeaderBox.setDefaultBaseIsMoof(true);
        trackFragmentBox.addBox(trackFragmentHeaderBox);
    }

    protected com.coremedia.iso.boxes.b y(h hVar, com.coremedia.iso.boxes.c cVar) {
        TrackFragmentRandomAccessBox trackFragmentRandomAccessBox;
        LinkedList linkedList;
        TrackExtendsBox trackExtendsBox;
        Iterator<com.coremedia.iso.boxes.b> it;
        int i4;
        int i5;
        int i6;
        List list;
        List list2;
        com.coremedia.iso.boxes.b bVar;
        LinkedList linkedList2;
        TrackFragmentRandomAccessBox trackFragmentRandomAccessBox2 = new TrackFragmentRandomAccessBox();
        trackFragmentRandomAccessBox2.setVersion(1);
        LinkedList linkedList3 = new LinkedList();
        r4 = null;
        for (TrackExtendsBox trackExtendsBox2 : m.h(cVar, ProtectedSandApp.s("ಿ\u0001"))) {
            TrackFragmentRandomAccessBox trackFragmentRandomAccessBox3 = trackFragmentRandomAccessBox2;
            LinkedList linkedList4 = linkedList3;
            TrackExtendsBox trackExtendsBox3 = trackExtendsBox2;
            if (trackExtendsBox2.getTrackId() == hVar.u2().l()) {
                trackFragmentRandomAccessBox2 = trackFragmentRandomAccessBox3;
                linkedList3 = linkedList4;
            } else {
                trackFragmentRandomAccessBox2 = trackFragmentRandomAccessBox3;
                linkedList3 = linkedList4;
                trackExtendsBox2 = trackExtendsBox3;
            }
        }
        Iterator<com.coremedia.iso.boxes.b> it2 = cVar.getBoxes().iterator();
        long j4 = 0;
        long j5 = 0;
        while (it2.hasNext()) {
            com.coremedia.iso.boxes.b next = it2.next();
            if (next instanceof MovieFragmentBox) {
                List boxes = ((MovieFragmentBox) next).getBoxes(TrackFragmentBox.class);
                int i7 = 0;
                int i10 = 0;
                while (i10 < boxes.size()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) boxes.get(i10);
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == hVar.u2().l()) {
                        List boxes2 = trackFragmentBox.getBoxes(TrackRunBox.class);
                        int i11 = i7;
                        while (i11 < boxes2.size()) {
                            LinkedList linkedList5 = new LinkedList();
                            TrackRunBox trackRunBox = (TrackRunBox) boxes2.get(i11);
                            long j6 = j5;
                            int i12 = i7;
                            while (i12 < trackRunBox.getEntries().size()) {
                                TrackRunBox.a aVar = trackRunBox.getEntries().get(i12);
                                com.coremedia.iso.boxes.fragment.a firstSampleFlags = (i12 == 0 && trackRunBox.isFirstSampleFlagsPresent()) ? trackRunBox.getFirstSampleFlags() : trackRunBox.isSampleFlagsPresent() ? aVar.k() : trackExtendsBox2.getDefaultSampleFlags();
                                if (firstSampleFlags == null && hVar.getHandler().equals(ProtectedSandApp.s("ಸ\u0001"))) {
                                    throw new RuntimeException(ProtectedSandApp.s("ೀ\u0001"));
                                }
                                if (firstSampleFlags == null || firstSampleFlags.e() == 2) {
                                    trackFragmentRandomAccessBox = trackFragmentRandomAccessBox2;
                                    linkedList = linkedList3;
                                    trackExtendsBox = trackExtendsBox2;
                                    it = it2;
                                    i4 = i12;
                                    i5 = i11;
                                    i6 = i10;
                                    list = boxes2;
                                    list2 = boxes;
                                    bVar = next;
                                    linkedList2 = linkedList5;
                                    linkedList2.add(new TrackFragmentRandomAccessBox.a(j6, j4, i10 + 1, i11 + 1, i12 + 1));
                                } else {
                                    trackFragmentRandomAccessBox = trackFragmentRandomAccessBox2;
                                    linkedList = linkedList3;
                                    trackExtendsBox = trackExtendsBox2;
                                    it = it2;
                                    i4 = i12;
                                    i5 = i11;
                                    linkedList2 = linkedList5;
                                    i6 = i10;
                                    list = boxes2;
                                    list2 = boxes;
                                    bVar = next;
                                }
                                j6 = aVar.j() + j6;
                                i12 = i4 + 1;
                                boxes = list2;
                                linkedList5 = linkedList2;
                                trackFragmentRandomAccessBox2 = trackFragmentRandomAccessBox;
                                linkedList3 = linkedList;
                                trackExtendsBox2 = trackExtendsBox;
                                it2 = it;
                                next = bVar;
                                i11 = i5;
                                i10 = i6;
                                boxes2 = list;
                                i7 = 0;
                            }
                            if (linkedList5.size() != trackRunBox.getEntries().size() || trackRunBox.getEntries().size() <= 0) {
                                linkedList3.addAll(linkedList5);
                            } else {
                                linkedList3.add((TrackFragmentRandomAccessBox.a) linkedList5.get(i7));
                            }
                            i11++;
                            j5 = j6;
                        }
                    }
                    i10++;
                    boxes = boxes;
                    trackFragmentRandomAccessBox2 = trackFragmentRandomAccessBox2;
                    linkedList3 = linkedList3;
                    trackExtendsBox2 = trackExtendsBox2;
                    it2 = it2;
                    next = next;
                    i7 = 0;
                }
            }
            TrackFragmentRandomAccessBox trackFragmentRandomAccessBox4 = trackFragmentRandomAccessBox2;
            LinkedList linkedList6 = linkedList3;
            TrackExtendsBox trackExtendsBox4 = trackExtendsBox2;
            Iterator<com.coremedia.iso.boxes.b> it3 = it2;
            j4 += next.getSize();
            trackFragmentRandomAccessBox2 = trackFragmentRandomAccessBox4;
            linkedList3 = linkedList6;
            trackExtendsBox2 = trackExtendsBox4;
            it2 = it3;
        }
        trackFragmentRandomAccessBox2.setEntries(linkedList3);
        trackFragmentRandomAccessBox2.setTrackId(hVar.u2().l());
        return trackFragmentRandomAccessBox2;
    }

    protected com.coremedia.iso.boxes.b z(com.googlecode.mp4parser.authoring.d dVar, h hVar) {
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setVersion(1);
        trackHeaderBox.setFlags(7);
        trackHeaderBox.setAlternateGroup(hVar.u2().c());
        trackHeaderBox.setCreationTime(hVar.u2().b());
        trackHeaderBox.setDuration(0L);
        trackHeaderBox.setHeight(hVar.u2().d());
        trackHeaderBox.setWidth(hVar.u2().n());
        trackHeaderBox.setLayer(hVar.u2().f());
        trackHeaderBox.setModificationTime(E());
        trackHeaderBox.setTrackId(hVar.u2().l());
        trackHeaderBox.setVolume(hVar.u2().m());
        return trackHeaderBox;
    }
}
