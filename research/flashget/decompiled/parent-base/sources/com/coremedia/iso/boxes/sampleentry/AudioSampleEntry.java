package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.b;
import com.coremedia.iso.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;
    public static final String TYPE3 = ProtectedSandApp.s("ᐬ");
    public static final String TYPE2 = ProtectedSandApp.s("ᐭ");
    public static final String TYPE5 = ProtectedSandApp.s("ᐮ");
    public static final String TYPE4 = ProtectedSandApp.s("ᐯ");
    public static final String TYPE7 = ProtectedSandApp.s("ᐰ");
    public static final String TYPE9 = ProtectedSandApp.s("ᐱ");
    public static final String TYPE8 = ProtectedSandApp.s("ᐲ");
    public static final String TYPE11 = ProtectedSandApp.s("ᐳ");
    public static final String TYPE12 = ProtectedSandApp.s("ᐴ");
    public static final String TYPE10 = ProtectedSandApp.s("ᐵ");
    public static final String TYPE_ENCRYPTED = ProtectedSandApp.s("ᐶ");
    public static final String TYPE1 = ProtectedSandApp.s("ᐷ");
    public static final String TYPE13 = ProtectedSandApp.s("ᐸ");

    public AudioSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        int i4 = this.soundVersion;
        ByteBuffer allocate = ByteBuffer.allocate((i4 == 1 ? 16 : 0) + 28 + (i4 == 2 ? 36 : 0));
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        i.f(allocate, this.soundVersion);
        i.f(allocate, this.reserved1);
        allocate.putInt((int) this.reserved2);
        i.f(allocate, this.channelCount);
        i.f(allocate, this.sampleSize);
        i.f(allocate, this.compressionId);
        i.f(allocate, this.packetSize);
        if (this.type.equals(ProtectedSandApp.s("ᐵ"))) {
            allocate.putInt((int) getSampleRate());
        } else {
            allocate.putInt((int) (getSampleRate() << 16));
        }
        if (this.soundVersion == 1) {
            allocate.putInt((int) this.samplesPerPacket);
            allocate.putInt((int) this.bytesPerPacket);
            allocate.putInt((int) this.bytesPerFrame);
            allocate.putInt((int) this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            allocate.putInt((int) this.samplesPerPacket);
            allocate.putInt((int) this.bytesPerPacket);
            allocate.putInt((int) this.bytesPerFrame);
            allocate.putInt((int) this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getCompressionId() {
        return this.compressionId;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getReserved1() {
        return this.reserved1;
    }

    public long getReserved2() {
        return this.reserved2;
    }

    public long getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        int i4 = this.soundVersion;
        int i5 = 16;
        long containerSize = (i4 == 1 ? 16 : 0) + 28 + (i4 == 2 ? 36 : 0) + getContainerSize();
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i5 = 8;
        }
        return containerSize + i5;
    }

    public int getSoundVersion() {
        return this.soundVersion;
    }

    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        this.soundVersion = g.i(allocate);
        this.reserved1 = g.i(allocate);
        this.reserved2 = g.l(allocate);
        this.channelCount = g.i(allocate);
        this.sampleSize = g.i(allocate);
        this.compressionId = g.i(allocate);
        this.packetSize = g.i(allocate);
        this.sampleRate = g.l(allocate);
        if (!this.type.equals(ProtectedSandApp.s("ᐵ"))) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            aVar.read(allocate2);
            allocate2.rewind();
            this.samplesPerPacket = g.l(allocate2);
            this.bytesPerPacket = g.l(allocate2);
            this.bytesPerFrame = g.l(allocate2);
            this.bytesPerSample = g.l(allocate2);
        }
        if (this.soundVersion == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            aVar.read(allocate3);
            allocate3.rewind();
            this.samplesPerPacket = g.l(allocate3);
            this.bytesPerPacket = g.l(allocate3);
            this.bytesPerFrame = g.l(allocate3);
            this.bytesPerSample = g.l(allocate3);
            byte[] bArr = new byte[20];
            this.soundVersion2Data = bArr;
            allocate3.get(bArr);
        }
        String str = this.type;
        String s4 = ProtectedSandApp.s("ᐰ");
        if (!s4.equals(str)) {
            long j5 = j4 - 28;
            int i4 = this.soundVersion;
            initContainer(aVar, (j5 - (i4 != 1 ? 0 : 16)) - (i4 != 2 ? 0 : 36), cVar);
            return;
        }
        System.err.println(s4);
        long j6 = j4 - 28;
        int i5 = this.soundVersion;
        final long j7 = (j6 - (i5 != 1 ? 0 : 16)) - (i5 != 2 ? 0 : 36);
        final ByteBuffer allocate4 = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j7));
        aVar.read(allocate4);
        addBox(new b() { // from class: com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.1
            @Override // com.coremedia.iso.boxes.b
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                allocate4.rewind();
                writableByteChannel.write(allocate4);
            }

            @Override // com.coremedia.iso.boxes.b
            public long getOffset() {
                return 0L;
            }

            @Override // com.coremedia.iso.boxes.b
            public com.coremedia.iso.boxes.c getParent() {
                return AudioSampleEntry.this;
            }

            @Override // com.coremedia.iso.boxes.b
            public long getSize() {
                return j7;
            }

            @Override // com.coremedia.iso.boxes.b
            public String getType() {
                return ProtectedSandApp.s("ᐩ");
            }

            @Override // com.coremedia.iso.boxes.b
            public void parse(a aVar2, ByteBuffer byteBuffer2, long j10, c cVar2) throws IOException {
                throw new RuntimeException(ProtectedSandApp.s("ᐪ"));
            }

            @Override // com.coremedia.iso.boxes.b
            public void setParent(com.coremedia.iso.boxes.c cVar2) {
                if (!AudioSampleEntry.$assertionsDisabled && cVar2 != AudioSampleEntry.this) {
                    throw new AssertionError(ProtectedSandApp.s("ᐫ"));
                }
            }
        });
    }

    public void setBytesPerFrame(long j4) {
        this.bytesPerFrame = j4;
    }

    public void setBytesPerPacket(long j4) {
        this.bytesPerPacket = j4;
    }

    public void setBytesPerSample(long j4) {
        this.bytesPerSample = j4;
    }

    public void setChannelCount(int i4) {
        this.channelCount = i4;
    }

    public void setCompressionId(int i4) {
        this.compressionId = i4;
    }

    public void setPacketSize(int i4) {
        this.packetSize = i4;
    }

    public void setReserved1(int i4) {
        this.reserved1 = i4;
    }

    public void setReserved2(long j4) {
        this.reserved2 = j4;
    }

    public void setSampleRate(long j4) {
        this.sampleRate = j4;
    }

    public void setSampleSize(int i4) {
        this.sampleSize = i4;
    }

    public void setSamplesPerPacket(long j4) {
        this.samplesPerPacket = j4;
    }

    public void setSoundVersion(int i4) {
        this.soundVersion = i4;
    }

    public void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return ProtectedSandApp.s("ᐹ") + this.bytesPerSample + ProtectedSandApp.s("ᐺ") + this.bytesPerFrame + ProtectedSandApp.s("ᐻ") + this.bytesPerPacket + ProtectedSandApp.s("ᐼ") + this.samplesPerPacket + ProtectedSandApp.s("ᐽ") + this.packetSize + ProtectedSandApp.s("ᐾ") + this.compressionId + ProtectedSandApp.s("ᐿ") + this.soundVersion + ProtectedSandApp.s("ᑀ") + this.sampleRate + ProtectedSandApp.s("ᑁ") + this.sampleSize + ProtectedSandApp.s("ᑂ") + this.channelCount + ProtectedSandApp.s("ᑃ") + getBoxes() + '}';
    }
}
