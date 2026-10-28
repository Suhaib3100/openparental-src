package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static Logger LOG = Logger.getLogger(FullContainerBox.class.getName());
    private int flags;
    private int version;

    public FullContainerBox(String str) {
        super(str);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.c
    public <T extends com.coremedia.iso.boxes.b> List<T> getBoxes(Class<T> cls) {
        return getBoxes(cls, false);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        return this.flags;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox
    protected ByteBuffer getHeader() {
        ByteBuffer wrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[20];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            i.l(wrap, getSize());
            writeVersionAndFlags(wrap);
        } else {
            byte[] bArr2 = new byte[12];
            bArr2[4] = this.type.getBytes()[0];
            bArr2[5] = this.type.getBytes()[1];
            bArr2[6] = this.type.getBytes()[2];
            bArr2[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr2);
            i.i(wrap, getSize());
            wrap.position(8);
            writeVersionAndFlags(wrap);
        }
        wrap.rewind();
        return wrap;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        aVar.read(allocate);
        parseVersionAndFlags((ByteBuffer) allocate.rewind());
        super.parse(aVar, byteBuffer, j4, cVar);
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = com.coremedia.iso.g.p(byteBuffer);
        this.flags = com.coremedia.iso.g.k(byteBuffer);
        return 4L;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i4) {
        this.flags = i4;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i4) {
        this.version = i4;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return getClass().getSimpleName().concat(ProtectedSandApp.s("ಃ\u0001"));
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        i.m(byteBuffer, this.version);
        i.h(byteBuffer, this.flags);
    }
}
