package com.coremedia.iso.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public class ItemProtectionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = ProtectedSandApp.s("Ⴐ");
    private int flags;
    private int version;

    public ItemProtectionBox() {
        super(ProtectedSandApp.s("Ⴐ"));
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(6);
        i.m(allocate, this.version);
        i.h(allocate, this.flags);
        i.f(allocate, getBoxes().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        return this.flags;
    }

    public SchemeInformationBox getItemProtectionScheme() {
        if (getBoxes(SchemeInformationBox.class).isEmpty()) {
            return null;
        }
        return (SchemeInformationBox) getBoxes(SchemeInformationBox.class).get(0);
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long containerSize = getContainerSize() + 6;
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        aVar.read(allocate);
        allocate.rewind();
        this.version = g.p(allocate);
        this.flags = g.k(allocate);
        initContainer(aVar, j4 - 6, cVar);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i4) {
        this.flags = i4;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i4) {
        this.version = i4;
    }
}
