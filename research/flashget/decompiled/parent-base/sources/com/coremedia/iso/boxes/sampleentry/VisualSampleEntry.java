package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public final class VisualSampleEntry extends AbstractSampleEntry implements c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;
    public static final String TYPE3 = ProtectedSandApp.s("ᑊ");
    public static final String TYPE2 = ProtectedSandApp.s("ᑋ");
    public static final String TYPE5 = ProtectedSandApp.s("ᑌ");
    public static final String TYPE4 = ProtectedSandApp.s("ᑍ");
    public static final String TYPE7 = ProtectedSandApp.s("ᑎ");
    public static final String TYPE6 = ProtectedSandApp.s("ᑏ");
    public static final String TYPE_ENCRYPTED = ProtectedSandApp.s("ᑐ");
    public static final String TYPE1 = ProtectedSandApp.s("ᑑ");

    class a implements com.googlecode.mp4parser.a {

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ long f47633c;

        /* renamed from: d, reason: collision with root package name */
        private final /* synthetic */ com.googlecode.mp4parser.a f47634d;

        a(long j4, com.googlecode.mp4parser.a aVar) {
            this.f47633c = j4;
            this.f47634d = aVar;
        }

        @Override // com.googlecode.mp4parser.a
        public void O1(long j4) throws IOException {
            this.f47634d.O1(j4);
        }

        @Override // com.googlecode.mp4parser.a
        public long T(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
            return this.f47634d.T(j4, j5, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f47634d.close();
        }

        @Override // com.googlecode.mp4parser.a
        public ByteBuffer e3(long j4, long j5) throws IOException {
            return this.f47634d.e3(j4, j5);
        }

        @Override // com.googlecode.mp4parser.a
        public long position() throws IOException {
            return this.f47634d.position();
        }

        @Override // com.googlecode.mp4parser.a
        public int read(ByteBuffer byteBuffer) throws IOException {
            if (this.f47633c == this.f47634d.position()) {
                return -1;
            }
            if (byteBuffer.remaining() <= this.f47633c - this.f47634d.position()) {
                return this.f47634d.read(byteBuffer);
            }
            ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(this.f47633c - this.f47634d.position()));
            this.f47634d.read(allocate);
            byteBuffer.put((ByteBuffer) allocate.rewind());
            return allocate.capacity();
        }

        @Override // com.googlecode.mp4parser.a
        public long size() throws IOException {
            return this.f47633c;
        }
    }

    public VisualSampleEntry() {
        super(ProtectedSandApp.s("ᑊ"));
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        i.f(allocate, 0);
        i.f(allocate, 0);
        allocate.putInt((int) this.predefined[0]);
        allocate.putInt((int) this.predefined[1]);
        allocate.putInt((int) this.predefined[2]);
        i.f(allocate, getWidth());
        i.f(allocate, getHeight());
        i.b(allocate, getHorizresolution());
        i.b(allocate, getVertresolution());
        allocate.putInt((int) 0);
        i.f(allocate, getFrameCount());
        i.m(allocate, l.c(getCompressorname()));
        allocate.put(l.b(getCompressorname()));
        int c5 = l.c(getCompressorname());
        while (c5 < 31) {
            c5++;
            allocate.put((byte) 0);
        }
        i.f(allocate, getDepth());
        i.f(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getCompressorname() {
        return this.compressorname;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getHeight() {
        return this.height;
    }

    public double getHorizresolution() {
        return this.horizresolution;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long containerSize = getContainerSize();
        return 78 + containerSize + ((this.largeBox || containerSize + 86 >= 4294967296L) ? 16 : 8);
    }

    public double getVertresolution() {
        return this.vertresolution;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        long position = aVar.position() + j4;
        ByteBuffer allocate = ByteBuffer.allocate(78);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        g.i(allocate);
        g.i(allocate);
        this.predefined[0] = g.l(allocate);
        this.predefined[1] = g.l(allocate);
        this.predefined[2] = g.l(allocate);
        this.width = g.i(allocate);
        this.height = g.i(allocate);
        this.horizresolution = g.d(allocate);
        this.vertresolution = g.d(allocate);
        g.l(allocate);
        this.frameCount = g.i(allocate);
        int p4 = g.p(allocate);
        if (p4 > 31) {
            p4 = 31;
        }
        byte[] bArr = new byte[p4];
        allocate.get(bArr);
        this.compressorname = l.a(bArr);
        if (p4 < 31) {
            allocate.get(new byte[31 - p4]);
        }
        this.depth = g.i(allocate);
        g.i(allocate);
        initContainer(new a(position, aVar), j4 - 78, cVar);
    }

    public void setCompressorname(String str) {
        this.compressorname = str;
    }

    public void setDepth(int i4) {
        this.depth = i4;
    }

    public void setFrameCount(int i4) {
        this.frameCount = i4;
    }

    public void setHeight(int i4) {
        this.height = i4;
    }

    public void setHorizresolution(double d5) {
        this.horizresolution = d5;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVertresolution(double d5) {
        this.vertresolution = d5;
    }

    public void setWidth(int i4) {
        this.width = i4;
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }
}
