package com.androidquery.util;

import java.io.ByteArrayOutputStream;

/* compiled from: PredefinedBAOS.java */
/* loaded from: classes3.dex */
public class e extends ByteArrayOutputStream {
    public e(int i4) {
        super(i4);
    }

    @Override // java.io.ByteArrayOutputStream
    public byte[] toByteArray() {
        int i4 = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        return i4 == bArr.length ? bArr : super.toByteArray();
    }
}
