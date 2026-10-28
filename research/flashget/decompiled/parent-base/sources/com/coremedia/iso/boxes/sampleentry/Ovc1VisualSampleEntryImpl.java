package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {
    public static final String TYPE = ProtectedSandApp.s("ᑆ");
    private byte[] vc1Content;

    public Ovc1VisualSampleEntryImpl() {
        super(ProtectedSandApp.s("ᑆ"));
        this.vc1Content = new byte[0];
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(this.vc1Content));
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        int i4 = 16;
        if (!this.largeBox && this.vc1Content.length + 16 < 4294967296L) {
            i4 = 8;
        }
        return i4 + this.vc1Content.length + 8;
    }

    public byte[] getVc1Content() {
        return this.vc1Content;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        byte[] bArr = new byte[allocate.remaining()];
        this.vc1Content = bArr;
        allocate.get(bArr);
    }

    public void setVc1Content(byte[] bArr) {
        this.vc1Content = bArr;
    }
}
