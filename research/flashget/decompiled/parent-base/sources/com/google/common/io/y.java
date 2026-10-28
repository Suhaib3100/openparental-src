package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: LittleEndianDataInputStream.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class y extends FilterInputStream implements DataInput {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
    }

    private byte a() throws IOException, EOFException {
        int read = ((FilterInputStream) this).in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @f9.a
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @f9.a
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @f9.a
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @f9.a
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @f9.a
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        g.p(this, bArr);
    }

    @Override // java.io.DataInput
    @f9.a
    public int readInt() throws IOException {
        byte a5 = a();
        byte a6 = a();
        return com.google.common.primitives.l.k(a(), a(), a6, a5);
    }

    @Override // java.io.DataInput
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    public String readLine() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf6da"));
    }

    @Override // java.io.DataInput
    @f9.a
    public long readLong() throws IOException {
        byte a5 = a();
        byte a6 = a();
        byte a7 = a();
        byte a8 = a();
        byte a10 = a();
        byte a11 = a();
        return com.google.common.primitives.n.j(a(), a(), a11, a10, a8, a7, a6, a5);
    }

    @Override // java.io.DataInput
    @f9.a
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @f9.a
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @f9.a
    public int readUnsignedByte() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @f9.a
    public int readUnsignedShort() throws IOException {
        return com.google.common.primitives.l.k((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int i4) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i4);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i4, int i5) throws IOException {
        g.q(this, bArr, i4, i5);
    }
}
