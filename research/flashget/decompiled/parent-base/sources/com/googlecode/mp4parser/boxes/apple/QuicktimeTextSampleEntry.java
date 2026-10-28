package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.c;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* loaded from: classes6.dex */
public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = ProtectedSandApp.s("ᆖ\u0001");
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName;
    short fontNumber;
    int foregroundB;
    int foregroundG;
    int foregroundR;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
        super(ProtectedSandApp.s("ᆖ\u0001"));
        this.foregroundR = 65535;
        this.foregroundG = 65535;
        this.foregroundB = 65535;
        this.fontName = "";
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void addBox(b bVar) {
        throw new RuntimeException(ProtectedSandApp.s("ᆗ\u0001"));
    }

    public int getBackgroundB() {
        return this.backgroundB;
    }

    public int getBackgroundG() {
        return this.backgroundG;
    }

    public int getBackgroundR() {
        return this.backgroundR;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        String str = this.fontName;
        ByteBuffer allocate = ByteBuffer.allocate((str != null ? str.length() : 0) + 52);
        allocate.position(6);
        i.f(allocate, this.dataReferenceIndex);
        allocate.putInt(this.displayFlags);
        allocate.putInt(this.textJustification);
        i.f(allocate, this.backgroundR);
        i.f(allocate, this.backgroundG);
        i.f(allocate, this.backgroundB);
        allocate.putLong(this.defaultTextBox);
        allocate.putLong(this.reserved1);
        allocate.putShort(this.fontNumber);
        allocate.putShort(this.fontFace);
        allocate.put(this.reserved2);
        allocate.putShort(this.reserved3);
        i.f(allocate, this.foregroundR);
        i.f(allocate, this.foregroundG);
        i.f(allocate, this.foregroundB);
        String str2 = this.fontName;
        if (str2 != null) {
            i.m(allocate, str2.length());
            allocate.put(this.fontName.getBytes());
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }

    public int getDisplayFlags() {
        return this.displayFlags;
    }

    public short getFontFace() {
        return this.fontFace;
    }

    public String getFontName() {
        return this.fontName;
    }

    public short getFontNumber() {
        return this.fontNumber;
    }

    public int getForegroundB() {
        return this.foregroundB;
    }

    public int getForegroundG() {
        return this.foregroundG;
    }

    public int getForegroundR() {
        return this.foregroundR;
    }

    public long getReserved1() {
        return this.reserved1;
    }

    public byte getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public long getSize() {
        long containerSize = getContainerSize() + 52 + (this.fontName != null ? r2.length() : 0);
        return containerSize + ((this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8);
    }

    public int getTextJustification() {
        return this.textJustification;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.b
    public void parse(a aVar, ByteBuffer byteBuffer, long j4, c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        aVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = g.i(allocate);
        this.displayFlags = allocate.getInt();
        this.textJustification = allocate.getInt();
        this.backgroundR = g.i(allocate);
        this.backgroundG = g.i(allocate);
        this.backgroundB = g.i(allocate);
        this.defaultTextBox = g.o(allocate);
        this.reserved1 = g.o(allocate);
        this.fontNumber = allocate.getShort();
        this.fontFace = allocate.getShort();
        this.reserved2 = allocate.get();
        this.reserved3 = allocate.getShort();
        this.foregroundR = g.i(allocate);
        this.foregroundG = g.i(allocate);
        this.foregroundB = g.i(allocate);
        if (allocate.remaining() <= 0) {
            this.fontName = null;
            return;
        }
        byte[] bArr = new byte[g.p(allocate)];
        allocate.get(bArr);
        this.fontName = new String(bArr);
    }

    public void setBackgroundB(int i4) {
        this.backgroundB = i4;
    }

    public void setBackgroundG(int i4) {
        this.backgroundG = i4;
    }

    public void setBackgroundR(int i4) {
        this.backgroundR = i4;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.c
    public void setBoxes(List<b> list) {
        throw new RuntimeException(ProtectedSandApp.s("ᆗ\u0001"));
    }

    public void setDefaultTextBox(long j4) {
        this.defaultTextBox = j4;
    }

    public void setDisplayFlags(int i4) {
        this.displayFlags = i4;
    }

    public void setFontFace(short s4) {
        this.fontFace = s4;
    }

    public void setFontName(String str) {
        this.fontName = str;
    }

    public void setFontNumber(short s4) {
        this.fontNumber = s4;
    }

    public void setForegroundB(int i4) {
        this.foregroundB = i4;
    }

    public void setForegroundG(int i4) {
        this.foregroundG = i4;
    }

    public void setForegroundR(int i4) {
        this.foregroundR = i4;
    }

    public void setReserved1(long j4) {
        this.reserved1 = j4;
    }

    public void setReserved2(byte b5) {
        this.reserved2 = b5;
    }

    public void setReserved3(short s4) {
        this.reserved3 = s4;
    }

    public void setTextJustification(int i4) {
        this.textJustification = i4;
    }
}
