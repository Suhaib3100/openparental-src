package com.googlecode.mp4parser.authoring.samples;

import androidx.collection.p0;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.c;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentedMp4SampleList.java */
/* loaded from: classes6.dex */
public class b extends AbstractList<f> {

    /* renamed from: b, reason: collision with root package name */
    c f63441b;

    /* renamed from: c, reason: collision with root package name */
    com.coremedia.iso.f[] f63442c;

    /* renamed from: d, reason: collision with root package name */
    TrackBox f63443d;

    /* renamed from: e, reason: collision with root package name */
    TrackExtendsBox f63444e;

    /* renamed from: f, reason: collision with root package name */
    private SoftReference<f>[] f63445f;

    /* renamed from: g, reason: collision with root package name */
    private List<TrackFragmentBox> f63446g;

    /* renamed from: i, reason: collision with root package name */
    private int[] f63448i;

    /* renamed from: h, reason: collision with root package name */
    private Map<TrackRunBox, SoftReference<ByteBuffer>> f63447h = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private int f63449j = -1;

    /* compiled from: FragmentedMp4SampleList.java */
    class a implements f {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ long f63451b;

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ ByteBuffer f63452c;

        /* renamed from: d, reason: collision with root package name */
        private final /* synthetic */ int f63453d;

        a(long j4, ByteBuffer byteBuffer, int i4) {
            this.f63451b = j4;
            this.f63452c = byteBuffer;
            this.f63453d = i4;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            return (ByteBuffer) ((ByteBuffer) this.f63452c.position(this.f63453d)).slice().limit(com.googlecode.mp4parser.util.c.a(this.f63451b));
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(a());
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f63451b;
        }
    }

    public b(long j4, c cVar, com.coremedia.iso.f... fVarArr) {
        this.f63443d = null;
        this.f63444e = null;
        this.f63441b = cVar;
        this.f63442c = fVarArr;
        for (TrackBox trackBox : m.h(cVar, ProtectedSandApp.s("ೞ\u0001"))) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j4) {
                this.f63443d = trackBox;
            }
        }
        if (this.f63443d == null) {
            throw new RuntimeException(p0.a(ProtectedSandApp.s("ೠ\u0001"), j4));
        }
        for (TrackExtendsBox trackExtendsBox : m.h(cVar, ProtectedSandApp.s("\u0cdf\u0001"))) {
            if (trackExtendsBox.getTrackId() == this.f63443d.getTrackHeaderBox().getTrackId()) {
                this.f63444e = trackExtendsBox;
            }
        }
        this.f63445f = (SoftReference[]) Array.newInstance((Class<?>) SoftReference.class, size());
        f();
    }

    private int c(TrackFragmentBox trackFragmentBox) {
        List<com.coremedia.iso.boxes.b> boxes = trackFragmentBox.getBoxes();
        int i4 = 0;
        for (int i5 = 0; i5 < boxes.size(); i5++) {
            com.coremedia.iso.boxes.b bVar = boxes.get(i5);
            if (bVar instanceof TrackRunBox) {
                i4 = com.googlecode.mp4parser.util.c.a(((TrackRunBox) bVar).getSampleCount()) + i4;
            }
        }
        return i4;
    }

    private List<TrackFragmentBox> f() {
        List<TrackFragmentBox> list = this.f63446g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f63441b.getBoxes(MovieFragmentBox.class).iterator();
        while (it.hasNext()) {
            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) it.next()).getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f63443d.getTrackHeaderBox().getTrackId()) {
                    arrayList.add(trackFragmentBox);
                }
            }
        }
        com.coremedia.iso.f[] fVarArr = this.f63442c;
        if (fVarArr != null) {
            for (com.coremedia.iso.f fVar : fVarArr) {
                Iterator it2 = fVar.getBoxes(MovieFragmentBox.class).iterator();
                while (it2.hasNext()) {
                    for (TrackFragmentBox trackFragmentBox2 : ((MovieFragmentBox) it2.next()).getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f63443d.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        this.f63446g = arrayList;
        this.f63448i = new int[arrayList.size()];
        int i4 = 1;
        for (int i5 = 0; i5 < this.f63446g.size(); i5++) {
            this.f63448i[i5] = i4;
            i4 += c(this.f63446g.get(i5));
        }
        return arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get(int i4) {
        long j4;
        ByteBuffer byteBuffer;
        long defaultSampleSize;
        f fVar;
        SoftReference<f> softReference = this.f63445f[i4];
        if (softReference != null && (fVar = softReference.get()) != null) {
            return fVar;
        }
        int i5 = i4 + 1;
        int length = this.f63448i.length;
        do {
            length--;
        } while (i5 - this.f63448i[length] < 0);
        TrackFragmentBox trackFragmentBox = this.f63446g.get(length);
        int i6 = i5 - this.f63448i[length];
        MovieFragmentBox movieFragmentBox = (MovieFragmentBox) trackFragmentBox.getParent();
        int i7 = 0;
        for (com.coremedia.iso.boxes.b bVar : trackFragmentBox.getBoxes()) {
            if (bVar instanceof TrackRunBox) {
                TrackRunBox trackRunBox = (TrackRunBox) bVar;
                int i10 = i6 - i7;
                if (trackRunBox.getEntries().size() > i10) {
                    List<TrackRunBox.a> entries = trackRunBox.getEntries();
                    TrackFragmentHeaderBox trackFragmentHeaderBox = trackFragmentBox.getTrackFragmentHeaderBox();
                    boolean isSampleSizePresent = trackRunBox.isSampleSizePresent();
                    boolean hasDefaultSampleSize = trackFragmentHeaderBox.hasDefaultSampleSize();
                    long j5 = 0;
                    if (isSampleSizePresent) {
                        j4 = 0;
                    } else {
                        if (hasDefaultSampleSize) {
                            defaultSampleSize = trackFragmentHeaderBox.getDefaultSampleSize();
                        } else {
                            TrackExtendsBox trackExtendsBox = this.f63444e;
                            if (trackExtendsBox == null) {
                                throw new RuntimeException(ProtectedSandApp.s("ೡ\u0001"));
                            }
                            defaultSampleSize = trackExtendsBox.getDefaultSampleSize();
                        }
                        j4 = defaultSampleSize;
                    }
                    SoftReference<ByteBuffer> softReference2 = this.f63447h.get(trackRunBox);
                    ByteBuffer byteBuffer2 = softReference2 != null ? softReference2.get() : null;
                    if (byteBuffer2 == null) {
                        c cVar = movieFragmentBox;
                        if (trackFragmentHeaderBox.hasBaseDataOffset()) {
                            j5 = trackFragmentHeaderBox.getBaseDataOffset();
                            cVar = movieFragmentBox.getParent();
                        }
                        if (trackRunBox.isDataOffsetPresent()) {
                            j5 += trackRunBox.getDataOffset();
                        }
                        Iterator<TrackRunBox.a> it = entries.iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            i11 = (int) (isSampleSizePresent ? it.next().l() + i11 : i11 + j4);
                        }
                        try {
                            ByteBuffer byteBuffer3 = cVar.getByteBuffer(j5, i11);
                            this.f63447h.put(trackRunBox, new SoftReference<>(byteBuffer3));
                            byteBuffer = byteBuffer3;
                        } catch (IOException e4) {
                            throw new RuntimeException(e4);
                        }
                    } else {
                        byteBuffer = byteBuffer2;
                    }
                    int i12 = 0;
                    for (int i13 = 0; i13 < i10; i13++) {
                        i12 = isSampleSizePresent ? (int) (entries.get(i13).l() + i12) : (int) (i12 + j4);
                    }
                    a aVar = new a(isSampleSizePresent ? entries.get(i10).l() : j4, byteBuffer, i12);
                    this.f63445f[i4] = new SoftReference<>(aVar);
                    return aVar;
                }
                i7 += trackRunBox.getEntries().size();
            }
        }
        throw new RuntimeException(ProtectedSandApp.s("ೢ\u0001"));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int i4 = this.f63449j;
        if (i4 != -1) {
            return i4;
        }
        Iterator it = this.f63441b.getBoxes(MovieFragmentBox.class).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) it.next()).getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.f63443d.getTrackHeaderBox().getTrackId()) {
                    Iterator it2 = trackFragmentBox.getBoxes(TrackRunBox.class).iterator();
                    while (it2.hasNext()) {
                        i5 = (int) (((TrackRunBox) it2.next()).getSampleCount() + i5);
                    }
                }
            }
        }
        for (com.coremedia.iso.f fVar : this.f63442c) {
            Iterator it3 = fVar.getBoxes(MovieFragmentBox.class).iterator();
            while (it3.hasNext()) {
                for (TrackFragmentBox trackFragmentBox2 : ((MovieFragmentBox) it3.next()).getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.f63443d.getTrackHeaderBox().getTrackId()) {
                        Iterator it4 = trackFragmentBox2.getBoxes(TrackRunBox.class).iterator();
                        while (it4.hasNext()) {
                            i5 = (int) (((TrackRunBox) it4.next()).getSampleCount() + i5);
                        }
                    }
                }
            }
        }
        this.f63449j = i5;
        return i5;
    }
}
