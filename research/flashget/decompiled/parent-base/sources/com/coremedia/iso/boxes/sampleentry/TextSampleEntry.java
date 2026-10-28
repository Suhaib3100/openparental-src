package com.coremedia.iso.boxes.sampleentry;

import android.support.v4.media.session.PlaybackStateCompat;
import com.coremedia.iso.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TextSampleEntry extends AbstractSampleEntry {
    private int[] backgroundColorRgba;
    private a boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private b styleRecord;
    private int verticalJustification;
    public static final String TYPE_ENCRYPTED = ProtectedSandApp.s("ᑉ");
    public static final String TYPE1 = ProtectedSandApp.s("ᑇ");

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f47622a;

        /* renamed from: b, reason: collision with root package name */
        int f47623b;

        /* renamed from: c, reason: collision with root package name */
        int f47624c;

        /* renamed from: d, reason: collision with root package name */
        int f47625d;

        public a() {
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f47622a);
            i.f(byteBuffer, this.f47623b);
            i.f(byteBuffer, this.f47624c);
            i.f(byteBuffer, this.f47625d);
        }

        public int b() {
            return 8;
        }

        public void c(ByteBuffer byteBuffer) {
            this.f47622a = g.i(byteBuffer);
            this.f47623b = g.i(byteBuffer);
            this.f47624c = g.i(byteBuffer);
            this.f47625d = g.i(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47624c == aVar.f47624c && this.f47623b == aVar.f47623b && this.f47625d == aVar.f47625d && this.f47622a == aVar.f47622a;
        }

        public int hashCode() {
            return (((((this.f47622a * 31) + this.f47623b) * 31) + this.f47624c) * 31) + this.f47625d;
        }

        public a(int i4, int i5, int i6, int i7) {
            this.f47622a = i4;
            this.f47623b = i5;
            this.f47624c = i6;
            this.f47625d = i7;
        }
    }

    public TextSampleEntry() {
        super(ProtectedSandApp.s("ᑇ"));
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        allocate.putInt((int) this.displayFlags);
        i.m(allocate, this.horizontalJustification);
        i.m(allocate, this.verticalJustification);
        i.m(allocate, this.backgroundColorRgba[0]);
        i.m(allocate, this.backgroundColorRgba[1]);
        i.m(allocate, this.backgroundColorRgba[2]);
        i.m(allocate, this.backgroundColorRgba[3]);
        this.boxRecord.a(allocate);
        this.styleRecord.a(allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public a getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long containerSize = getContainerSize() + 38;
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }

    public b getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) == PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) == PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(38);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        this.displayFlags = g.l(allocate);
        this.horizontalJustification = g.p(allocate);
        this.verticalJustification = g.p(allocate);
        int[] iArr = new int[4];
        this.backgroundColorRgba = iArr;
        iArr[0] = g.p(allocate);
        this.backgroundColorRgba[1] = g.p(allocate);
        this.backgroundColorRgba[2] = g.p(allocate);
        this.backgroundColorRgba[3] = g.p(allocate);
        a aVar2 = new a();
        this.boxRecord = aVar2;
        aVar2.c(allocate);
        b bVar = new b();
        this.styleRecord = bVar;
        bVar.c(allocate);
        initContainer(aVar, j4 - 38, cVar);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(a aVar) {
        this.boxRecord = aVar;
    }

    public void setContinuousKaraoke(boolean z4) {
        if (z4) {
            this.displayFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        } else {
            this.displayFlags &= -2049;
        }
    }

    public void setFillTextRegion(boolean z4) {
        if (z4) {
            this.displayFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        } else {
            this.displayFlags &= -262145;
        }
    }

    public void setHorizontalJustification(int i4) {
        this.horizontalJustification = i4;
    }

    public void setScrollDirection(boolean z4) {
        if (z4) {
            this.displayFlags |= 384;
        } else {
            this.displayFlags &= -385;
        }
    }

    public void setScrollIn(boolean z4) {
        if (z4) {
            this.displayFlags |= 32;
        } else {
            this.displayFlags &= -33;
        }
    }

    public void setScrollOut(boolean z4) {
        if (z4) {
            this.displayFlags |= 64;
        } else {
            this.displayFlags &= -65;
        }
    }

    public void setStyleRecord(b bVar) {
        this.styleRecord = bVar;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i4) {
        this.verticalJustification = i4;
    }

    public void setWriteTextVertically(boolean z4) {
        if (z4) {
            this.displayFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        } else {
            this.displayFlags &= -131073;
        }
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return ProtectedSandApp.s("ᑈ");
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f47626a;

        /* renamed from: b, reason: collision with root package name */
        int f47627b;

        /* renamed from: c, reason: collision with root package name */
        int f47628c;

        /* renamed from: d, reason: collision with root package name */
        int f47629d;

        /* renamed from: e, reason: collision with root package name */
        int f47630e;

        /* renamed from: f, reason: collision with root package name */
        int[] f47631f;

        public b() {
            this.f47631f = new int[]{255, 255, 255, 255};
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f47626a);
            i.f(byteBuffer, this.f47627b);
            i.f(byteBuffer, this.f47628c);
            i.m(byteBuffer, this.f47629d);
            i.m(byteBuffer, this.f47630e);
            i.m(byteBuffer, this.f47631f[0]);
            i.m(byteBuffer, this.f47631f[1]);
            i.m(byteBuffer, this.f47631f[2]);
            i.m(byteBuffer, this.f47631f[3]);
        }

        public int b() {
            return 12;
        }

        public void c(ByteBuffer byteBuffer) {
            this.f47626a = g.i(byteBuffer);
            this.f47627b = g.i(byteBuffer);
            this.f47628c = g.i(byteBuffer);
            this.f47629d = g.p(byteBuffer);
            this.f47630e = g.p(byteBuffer);
            int[] iArr = new int[4];
            this.f47631f = iArr;
            iArr[0] = g.p(byteBuffer);
            this.f47631f[1] = g.p(byteBuffer);
            this.f47631f[2] = g.p(byteBuffer);
            this.f47631f[3] = g.p(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47627b == bVar.f47627b && this.f47629d == bVar.f47629d && this.f47628c == bVar.f47628c && this.f47630e == bVar.f47630e && this.f47626a == bVar.f47626a && Arrays.equals(this.f47631f, bVar.f47631f);
        }

        public int hashCode() {
            int i4 = ((((((((this.f47626a * 31) + this.f47627b) * 31) + this.f47628c) * 31) + this.f47629d) * 31) + this.f47630e) * 31;
            int[] iArr = this.f47631f;
            return i4 + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }

        public b(int i4, int i5, int i6, int i7, int i10, int[] iArr) {
            this.f47626a = i4;
            this.f47627b = i5;
            this.f47628c = i6;
            this.f47629d = i7;
            this.f47630e = i10;
            this.f47631f = iArr;
        }
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }
}
