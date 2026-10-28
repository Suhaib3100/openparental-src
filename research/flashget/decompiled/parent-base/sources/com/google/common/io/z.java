package com.google.common.io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: LittleEndianDataOutputStream.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class z extends FilterOutputStream implements DataOutput {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(OutputStream outputStream) {
        super(new DataOutputStream(outputStream));
        outputStream.getClass();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i4, i5);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z4) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z4);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i4) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i4);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i4) throws IOException {
        writeShort(i4);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i4 = 0; i4 < str.length(); i4++) {
            writeShort(str.charAt(i4));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d5) throws IOException {
        writeLong(Double.doubleToLongBits(d5));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f4) throws IOException {
        writeInt(Float.floatToIntBits(f4));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i4) throws IOException {
        ((FilterOutputStream) this).out.write(i4 & 255);
        ((FilterOutputStream) this).out.write((i4 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i4 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i4 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j4) throws IOException {
        byte[] A = com.google.common.primitives.n.A(Long.reverseBytes(j4));
        write(A, 0, A.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i4) throws IOException {
        ((FilterOutputStream) this).out.write(i4 & 255);
        ((FilterOutputStream) this).out.write((i4 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
