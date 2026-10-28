package org.apache.commons.io.input;

import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: SwappedDataInputStream.java */
/* loaded from: classes6.dex */
public class r extends n implements DataInput {
    public r(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException, EOFException {
        return readByte() != 0;
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException, EOFException {
        return (byte) ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException, EOFException {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException, EOFException {
        return org.apache.commons.io.d.b(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException, EOFException {
        return org.apache.commons.io.d.d(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException, EOFException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException, EOFException {
        return org.apache.commons.io.d.f(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException, EOFException {
        throw new UnsupportedOperationException("Operation not supported: readLine()");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException, EOFException {
        return org.apache.commons.io.d.h(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException, EOFException {
        return org.apache.commons.io.d.j(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException, EOFException {
        throw new UnsupportedOperationException("Operation not supported: readUTF()");
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException, EOFException {
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException, EOFException {
        return org.apache.commons.io.d.n(((FilterInputStream) this).in);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i5) throws IOException, EOFException {
        return (int) ((FilterInputStream) this).in.skip(i5);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i5, int i6) throws IOException, EOFException {
        int i7 = i6;
        while (i7 > 0) {
            int read = read(bArr, (i5 + i6) - i7, i7);
            if (-1 == read) {
                throw new EOFException();
            }
            i7 -= read;
        }
    }
}
