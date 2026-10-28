package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = ProtectedSandApp.s("ᦰ\u0001");
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry() {
        super(ProtectedSandApp.s("ᦰ\u0001"));
        this.namespace = "";
        this.schemaLocation = "";
        this.auxiliaryMimeTypes = "";
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(this.auxiliaryMimeTypes.length() + this.schemaLocation.length() + this.namespace.length() + 8 + 3);
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        i.o(allocate, this.namespace);
        i.o(allocate, this.schemaLocation);
        i.o(allocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long containerSize = getContainerSize() + a.a(this.auxiliaryMimeTypes, this.schemaLocation.length() + this.namespace.length() + 8, 3);
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aVar.read((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        long position = aVar.position();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        aVar.read((ByteBuffer) allocate2.rewind());
        this.namespace = g.g((ByteBuffer) allocate2.rewind());
        aVar.O1(r3.length() + position + 1);
        aVar.read((ByteBuffer) allocate2.rewind());
        this.schemaLocation = g.g((ByteBuffer) allocate2.rewind());
        aVar.O1(this.namespace.length() + position + this.schemaLocation.length() + 2);
        aVar.read((ByteBuffer) allocate2.rewind());
        this.auxiliaryMimeTypes = g.g((ByteBuffer) allocate2.rewind());
        aVar.O1(position + this.namespace.length() + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        initContainer(aVar, j4 - a.a(this.auxiliaryMimeTypes, this.schemaLocation.length() + (this.namespace.length() + byteBuffer.remaining()), 3), cVar);
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }
}
