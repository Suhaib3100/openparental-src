package com.mp4parser.iso14496.part12;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public class HintSampleEntry extends AbstractSampleEntry {
    protected byte[] data;

    public HintSampleEntry(String str) {
        super(str);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        allocate.rewind();
        writableByteChannel.write(allocate);
        writableByteChannel.write(ByteBuffer.wrap(this.data));
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long length = this.data.length + 8;
        return length + ((this.largeBox || 8 + length >= 4294967296L) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        byte[] bArr = new byte[com.googlecode.mp4parser.util.c.a(j4 - 8)];
        this.data = bArr;
        aVar.read(ByteBuffer.wrap(bArr));
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }
}
