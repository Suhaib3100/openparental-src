package com.googlecode.mp4parser;

import com.coremedia.iso.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public class AbstractContainerBox extends BasicContainer implements com.coremedia.iso.boxes.b {
    protected boolean largeBox;
    private long offset;
    com.coremedia.iso.boxes.c parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    protected ByteBuffer getHeader() {
        ByteBuffer wrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            i.l(wrap, getSize());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3]});
            i.i(wrap, getSize());
        }
        wrap.rewind();
        return wrap;
    }

    @Override // com.coremedia.iso.boxes.b
    public long getOffset() {
        return this.offset;
    }

    @Override // com.coremedia.iso.boxes.b
    public com.coremedia.iso.boxes.c getParent() {
        return this.parent;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.b
    public String getType() {
        return this.type;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(a aVar, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.dataSource = aVar;
        long position = aVar.position();
        this.parsePosition = position;
        this.startPosition = position - ((this.largeBox || 8 + j4 >= 4294967296L) ? 16 : 8);
        aVar.O1(aVar.position() + j4);
        this.endPosition = aVar.position();
        this.boxParser = cVar;
    }

    public void parse(a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.offset = aVar.position() - byteBuffer.remaining();
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(aVar, j4, cVar);
    }

    @Override // com.coremedia.iso.boxes.b
    public void setParent(com.coremedia.iso.boxes.c cVar) {
        this.parent = cVar;
    }
}
