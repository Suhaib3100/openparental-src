package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.c;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex;

    protected AbstractSampleEntry(String str) {
        super(str);
        this.dataReferenceIndex = 1;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public abstract void getBox(WritableByteChannel writableByteChannel) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public abstract void parse(a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException;

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i4) {
        this.dataReferenceIndex = i4;
    }
}
