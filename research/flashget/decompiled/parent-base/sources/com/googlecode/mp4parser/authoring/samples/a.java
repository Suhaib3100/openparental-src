package com.googlecode.mp4parser.authoring.samples;

import androidx.collection.p0;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.util.i;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/* compiled from: DefaultMp4SampleList.java */
/* loaded from: classes6.dex */
public class a extends AbstractList<f> {

    /* renamed from: k, reason: collision with root package name */
    private static final i f63429k = i.a(a.class);

    /* renamed from: b, reason: collision with root package name */
    c f63430b;

    /* renamed from: c, reason: collision with root package name */
    TrackBox f63431c;

    /* renamed from: d, reason: collision with root package name */
    SoftReference<ByteBuffer>[] f63432d;

    /* renamed from: e, reason: collision with root package name */
    int[] f63433e;

    /* renamed from: f, reason: collision with root package name */
    long[] f63434f;

    /* renamed from: g, reason: collision with root package name */
    long[] f63435g;

    /* renamed from: h, reason: collision with root package name */
    long[][] f63436h;

    /* renamed from: i, reason: collision with root package name */
    SampleSizeBox f63437i;

    /* renamed from: j, reason: collision with root package name */
    int f63438j = 0;

    /* compiled from: DefaultMp4SampleList.java */
    /* renamed from: com.googlecode.mp4parser.authoring.samples.a$a, reason: collision with other inner class name */
    class C0960a implements f {

        /* renamed from: a, reason: collision with root package name */
        private int f63439a;

        public C0960a(int i4) {
            this.f63439a = i4;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public synchronized ByteBuffer a() {
            long j4;
            ByteBuffer byteBuffer;
            int f4 = a.this.f(this.f63439a);
            a aVar = a.this;
            SoftReference<ByteBuffer> softReference = aVar.f63432d[f4];
            int i4 = this.f63439a - (aVar.f63433e[f4] - 1);
            long j5 = f4;
            long[] jArr = aVar.f63436h[com.googlecode.mp4parser.util.c.a(j5)];
            j4 = jArr[i4];
            if (softReference == null || (byteBuffer = softReference.get()) == null) {
                try {
                    a aVar2 = a.this;
                    byteBuffer = aVar2.f63430b.getByteBuffer(aVar2.f63434f[com.googlecode.mp4parser.util.c.a(j5)], jArr[jArr.length - 1] + a.this.f63437i.getSampleSizeAtIndex((r3 + jArr.length) - 1));
                    a.this.f63432d[f4] = new SoftReference<>(byteBuffer);
                } catch (IOException e4) {
                    StringWriter stringWriter = new StringWriter();
                    e4.printStackTrace(new PrintWriter(stringWriter));
                    a.f63429k.c(stringWriter.toString());
                    throw new IndexOutOfBoundsException(e4.getMessage());
                }
            }
            return (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(com.googlecode.mp4parser.util.c.a(j4))).slice().limit(com.googlecode.mp4parser.util.c.a(a.this.f63437i.getSampleSizeAtIndex(this.f63439a)));
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(a());
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return a.this.f63437i.getSampleSizeAtIndex(this.f63439a);
        }

        public String toString() {
            return ProtectedSandApp.s("\u0cda\u0001") + this.f63439a + ProtectedSandApp.s("\u0cdb\u0001") + a.this.f63437i.getSampleSizeAtIndex(this.f63439a) + ProtectedSandApp.s("\u0cdc\u0001");
        }
    }

    public a(long j4, c cVar) {
        int i4;
        this.f63431c = null;
        this.f63432d = null;
        int i5 = 0;
        this.f63430b = cVar;
        for (TrackBox trackBox : ((MovieBox) cVar.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j4) {
                this.f63431c = trackBox;
            }
        }
        TrackBox trackBox2 = this.f63431c;
        if (trackBox2 == null) {
            throw new RuntimeException(p0.a(ProtectedSandApp.s("ೝ\u0001"), j4));
        }
        long[] chunkOffsets = trackBox2.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        this.f63434f = chunkOffsets;
        this.f63435g = new long[chunkOffsets.length];
        SoftReference<ByteBuffer>[] softReferenceArr = new SoftReference[chunkOffsets.length];
        this.f63432d = softReferenceArr;
        Arrays.fill(softReferenceArr, new SoftReference(null));
        this.f63436h = new long[this.f63434f.length][];
        this.f63437i = this.f63431c.getSampleTableBox().getSampleSizeBox();
        List<SampleToChunkBox.a> entries = this.f63431c.getSampleTableBox().getSampleToChunkBox().getEntries();
        SampleToChunkBox.a[] aVarArr = (SampleToChunkBox.a[]) entries.toArray(new SampleToChunkBox.a[entries.size()]);
        SampleToChunkBox.a aVar = aVarArr[0];
        long a5 = aVar.a();
        int a6 = com.googlecode.mp4parser.util.c.a(aVar.c());
        int size = size();
        int i6 = 0;
        int i7 = 0;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = i6 + 1;
            if (i12 == a5) {
                if (aVarArr.length > i10) {
                    SampleToChunkBox.a aVar2 = aVarArr[i10];
                    i7 = a6;
                    a6 = com.googlecode.mp4parser.util.c.a(aVar2.c());
                    i10++;
                    a5 = aVar2.a();
                } else {
                    i7 = a6;
                    a6 = -1;
                    a5 = Long.MAX_VALUE;
                }
            }
            this.f63436h[i6] = new long[i7];
            i11 += i7;
            if (i11 > size) {
                break;
            } else {
                i6 = i12;
            }
        }
        this.f63433e = new int[i6 + 2];
        SampleToChunkBox.a aVar3 = aVarArr[0];
        long a7 = aVar3.a();
        int a8 = com.googlecode.mp4parser.util.c.a(aVar3.c());
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        int i16 = 1;
        while (true) {
            i4 = i13 + 1;
            this.f63433e[i13] = i15;
            if (i4 == a7) {
                if (aVarArr.length > i16) {
                    SampleToChunkBox.a aVar4 = aVarArr[i16];
                    i14 = a8;
                    i16++;
                    a8 = com.googlecode.mp4parser.util.c.a(aVar4.c());
                    a7 = aVar4.a();
                } else {
                    i14 = a8;
                    a8 = -1;
                    a7 = Long.MAX_VALUE;
                }
            }
            i15 += i14;
            if (i15 > size) {
                break;
            } else {
                i13 = i4;
            }
        }
        this.f63433e[i4] = Integer.MAX_VALUE;
        long j5 = 0;
        for (int i17 = 1; i17 <= this.f63437i.getSampleCount(); i17++) {
            while (i17 == this.f63433e[i5]) {
                i5++;
                j5 = 0;
            }
            long[] jArr = this.f63435g;
            int i18 = i5 - 1;
            int i19 = i17 - 1;
            jArr[i18] = this.f63437i.getSampleSizeAtIndex(i19) + jArr[i18];
            this.f63436h[i18][i17 - this.f63433e[i18]] = j5;
            j5 += this.f63437i.getSampleSizeAtIndex(i19);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f get(int i4) {
        if (i4 < this.f63437i.getSampleCount()) {
            return new C0960a(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    synchronized int f(int i4) {
        int i5 = i4 + 1;
        int[] iArr = this.f63433e;
        int i6 = this.f63438j;
        int i7 = iArr[i6];
        if (i5 >= i7 && i5 < iArr[i6 + 1]) {
            return i6;
        }
        if (i5 < i7) {
            this.f63438j = 0;
            while (true) {
                int[] iArr2 = this.f63433e;
                int i10 = this.f63438j;
                if (iArr2[i10 + 1] > i5) {
                    return i10;
                }
                this.f63438j = i10 + 1;
            }
        } else {
            this.f63438j = i6 + 1;
            while (true) {
                int[] iArr3 = this.f63433e;
                int i11 = this.f63438j;
                if (iArr3[i11 + 1] > i5) {
                    return i11;
                }
                this.f63438j = i11 + 1;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return com.googlecode.mp4parser.util.c.a(this.f63431c.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
