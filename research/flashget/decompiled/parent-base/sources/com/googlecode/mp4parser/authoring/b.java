package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.m;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import com.mp4parser.iso23001.part7.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: CencMp4TrackImplImpl.java */
/* loaded from: classes6.dex */
public class b extends e implements com.googlecode.mp4parser.authoring.tracks.h {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f63365s = false;

    /* renamed from: q, reason: collision with root package name */
    private List<com.mp4parser.iso23001.part7.a> f63366q;

    /* renamed from: r, reason: collision with root package name */
    private UUID f63367r;

    /* compiled from: CencMp4TrackImplImpl.java */
    private class a {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f63368e = false;

        /* renamed from: a, reason: collision with root package name */
        private com.coremedia.iso.boxes.c f63369a;

        /* renamed from: b, reason: collision with root package name */
        private SampleAuxiliaryInformationSizesBox f63370b;

        /* renamed from: c, reason: collision with root package name */
        private SampleAuxiliaryInformationOffsetsBox f63371c;

        public a(com.coremedia.iso.boxes.c cVar) {
            this.f63369a = cVar;
        }

        public SampleAuxiliaryInformationOffsetsBox c() {
            return this.f63371c;
        }

        public SampleAuxiliaryInformationSizesBox d() {
            return this.f63370b;
        }

        public a e() {
            List boxes = this.f63369a.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            List boxes2 = this.f63369a.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            this.f63370b = null;
            this.f63371c = null;
            for (int i4 = 0; i4 < boxes.size(); i4++) {
                SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = this.f63370b;
                String s4 = ProtectedSandApp.s("಄\u0001");
                if ((sampleAuxiliaryInformationSizesBox == null && ((SampleAuxiliaryInformationSizesBox) boxes.get(i4)).getAuxInfoType() == null) || s4.equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i4)).getAuxInfoType())) {
                    this.f63370b = (SampleAuxiliaryInformationSizesBox) boxes.get(i4);
                } else {
                    SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox2 = this.f63370b;
                    if (sampleAuxiliaryInformationSizesBox2 == null || sampleAuxiliaryInformationSizesBox2.getAuxInfoType() != null || !s4.equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i4)).getAuxInfoType())) {
                        throw new RuntimeException(ProtectedSandApp.s("ಆ\u0001"));
                    }
                    this.f63370b = (SampleAuxiliaryInformationSizesBox) boxes.get(i4);
                }
                if ((this.f63371c == null && ((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i4)).getAuxInfoType() == null) || s4.equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i4)).getAuxInfoType())) {
                    this.f63371c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i4);
                } else {
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = this.f63371c;
                    if (sampleAuxiliaryInformationOffsetsBox == null || sampleAuxiliaryInformationOffsetsBox.getAuxInfoType() != null || !s4.equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i4)).getAuxInfoType())) {
                        throw new RuntimeException(ProtectedSandApp.s("ಅ\u0001"));
                    }
                    this.f63371c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i4);
                }
            }
            return this;
        }
    }

    public b(String str, TrackBox trackBox, com.coremedia.iso.f... fVarArr) throws IOException {
        super(str, trackBox, fVarArr);
        long j4;
        long j5;
        int i4;
        com.coremedia.iso.boxes.c cVar;
        long j6;
        int i5;
        this.f63366q = new ArrayList();
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        int size = trackBox.getParent().getBoxes(MovieExtendsBox.class).size();
        String s4 = ProtectedSandApp.s("ಎ\u0001");
        if (size <= 0) {
            TrackEncryptionBox trackEncryptionBox = (TrackEncryptionBox) m.e(trackBox, s4);
            this.f63367r = trackEncryptionBox.getDefault_KID();
            ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) m.e(trackBox, ProtectedSandApp.s("ಏ\u0001"));
            long[] blowup = trackBox.getSampleTableBox().getSampleToChunkBox().blowup((chunkOffsetBox == null ? (ChunkOffsetBox) m.e(trackBox, ProtectedSandApp.s("ಐ\u0001")) : chunkOffsetBox).getChunkOffsets().length);
            a e4 = new a((com.coremedia.iso.boxes.c) m.e(trackBox, ProtectedSandApp.s("\u0c91\u0001"))).e();
            SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = e4.f63371c;
            SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = e4.f63370b;
            com.coremedia.iso.boxes.c parent = ((MovieBox) trackBox.getParent()).getParent();
            if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length == 1) {
                long j7 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[0];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    i4 = sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() * sampleAuxiliaryInformationSizesBox.getSampleCount();
                } else {
                    i4 = 0;
                    for (int i6 = 0; i6 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i6++) {
                        i4 += sampleAuxiliaryInformationSizesBox.getSampleInfoSizes()[i6];
                    }
                }
                ByteBuffer byteBuffer = parent.getByteBuffer(j7, i4);
                for (int i7 = 0; i7 < sampleAuxiliaryInformationSizesBox.getSampleCount(); i7++) {
                    this.f63366q.add(b(trackEncryptionBox.getDefaultIvSize(), byteBuffer, sampleAuxiliaryInformationSizesBox.getSize(i7)));
                }
                return;
            }
            if (sampleAuxiliaryInformationOffsetsBox.getOffsets().length != blowup.length) {
                throw new RuntimeException(ProtectedSandApp.s("ಒ\u0001"));
            }
            int i10 = 0;
            for (int i11 = 0; i11 < blowup.length; i11++) {
                long j10 = sampleAuxiliaryInformationOffsetsBox.getOffsets()[i11];
                if (sampleAuxiliaryInformationSizesBox.getDefaultSampleInfoSize() > 0) {
                    j4 = sampleAuxiliaryInformationSizesBox.getSampleCount() * blowup[i11];
                } else {
                    j4 = 0;
                    for (int i12 = 0; i12 < blowup[i11]; i12++) {
                        j4 += sampleAuxiliaryInformationSizesBox.getSize(i10 + i12);
                    }
                }
                ByteBuffer byteBuffer2 = parent.getByteBuffer(j10, j4);
                int i13 = 0;
                while (true) {
                    long j11 = i13;
                    j5 = blowup[i11];
                    if (j11 >= j5) {
                        break;
                    }
                    this.f63366q.add(b(trackEncryptionBox.getDefaultIvSize(), byteBuffer2, sampleAuxiliaryInformationSizesBox.getSize(i10 + i13)));
                    i13++;
                }
                i10 = (int) (i10 + j5);
            }
            return;
        }
        Iterator it = ((com.coremedia.iso.boxes.b) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
        while (it.hasNext()) {
            MovieFragmentBox movieFragmentBox = (MovieFragmentBox) it.next();
            Iterator it2 = movieFragmentBox.getBoxes(TrackFragmentBox.class).iterator();
            while (it2.hasNext()) {
                TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it2.next();
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                    TrackEncryptionBox trackEncryptionBox2 = (TrackEncryptionBox) m.e(trackBox, s4);
                    this.f63367r = trackEncryptionBox2.getDefault_KID();
                    if (trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                        cVar = ((com.coremedia.iso.boxes.b) trackBox.getParent()).getParent();
                        j6 = trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                    } else {
                        cVar = movieFragmentBox;
                        j6 = 0;
                    }
                    a e5 = new a(trackFragmentBox).e();
                    SampleAuxiliaryInformationOffsetsBox c5 = e5.c();
                    SampleAuxiliaryInformationSizesBox d5 = e5.d();
                    long[] offsets = c5.getOffsets();
                    List boxes = trackFragmentBox.getBoxes(TrackRunBox.class);
                    long j12 = trackId;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < offsets.length) {
                        int size2 = ((TrackRunBox) boxes.get(i14)).getEntries().size();
                        long j13 = offsets[i14];
                        Iterator it3 = it;
                        long[] jArr = offsets;
                        List list = boxes;
                        int i16 = i15;
                        long j14 = 0;
                        while (true) {
                            i5 = i15 + size2;
                            if (i16 >= i5) {
                                break;
                            }
                            j14 += d5.getSize(i16);
                            i16++;
                            movieFragmentBox = movieFragmentBox;
                            it2 = it2;
                        }
                        ByteBuffer byteBuffer3 = cVar.getByteBuffer(j6 + j13, j14);
                        int i17 = i15;
                        while (i17 < i5) {
                            this.f63366q.add(b(trackEncryptionBox2.getDefaultIvSize(), byteBuffer3, d5.getSize(i17)));
                            i17++;
                            i5 = i5;
                            movieFragmentBox = movieFragmentBox;
                            it2 = it2;
                        }
                        i14++;
                        offsets = jArr;
                        i15 = i5;
                        boxes = list;
                        it = it3;
                    }
                    trackId = j12;
                }
            }
        }
    }

    private com.mp4parser.iso23001.part7.a b(int i4, ByteBuffer byteBuffer, long j4) {
        com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
        if (j4 > 0) {
            byte[] bArr = new byte[i4];
            aVar.f70084a = bArr;
            byteBuffer.get(bArr);
            if (j4 > i4) {
                aVar.f70085b = new a.k[com.coremedia.iso.g.i(byteBuffer)];
                int i5 = 0;
                while (true) {
                    a.k[] kVarArr = aVar.f70085b;
                    if (i5 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i5] = aVar.a(com.coremedia.iso.g.i(byteBuffer), com.coremedia.iso.g.l(byteBuffer));
                    i5++;
                }
            }
        }
        return aVar;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.h
    public boolean C1() {
        return false;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.h
    public List<com.mp4parser.iso23001.part7.a> g3() {
        return this.f63366q;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public String getName() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("ಓ\u0001")), this.f63362b, ProtectedSandApp.s("ಔ\u0001"));
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.h
    public UUID r2() {
        return this.f63367r;
    }

    public String toString() {
        return ProtectedSandApp.s("ಕ\u0001") + getHandler() + ProtectedSandApp.s("ಖ\u0001");
    }
}
