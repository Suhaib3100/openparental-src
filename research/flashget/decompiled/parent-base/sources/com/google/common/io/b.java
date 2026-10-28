package com.google.common.io;

import java.io.DataInput;

/* compiled from: ByteArrayDataInput.java */
@p
@d9.c
/* loaded from: classes6.dex */
public interface b extends DataInput {
    @Override // java.io.DataInput
    @f9.a
    boolean readBoolean();

    @Override // java.io.DataInput
    @f9.a
    byte readByte();

    @Override // java.io.DataInput
    @f9.a
    char readChar();

    @Override // java.io.DataInput
    @f9.a
    double readDouble();

    @Override // java.io.DataInput
    @f9.a
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] bArr);

    @Override // java.io.DataInput
    void readFully(byte[] bArr, int i4, int i5);

    @Override // java.io.DataInput
    @f9.a
    int readInt();

    @Override // java.io.DataInput
    @zc.a
    @f9.a
    String readLine();

    @Override // java.io.DataInput
    @f9.a
    long readLong();

    @Override // java.io.DataInput
    @f9.a
    short readShort();

    @Override // java.io.DataInput
    @f9.a
    String readUTF();

    @Override // java.io.DataInput
    @f9.a
    int readUnsignedByte();

    @Override // java.io.DataInput
    @f9.a
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int i4);
}
