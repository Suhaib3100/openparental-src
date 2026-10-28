package com.github.penfeizhou.animation.apng.io;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.d;
import java.io.IOException;

/* compiled from: APNGReader.java */
/* loaded from: classes5.dex */
public class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<byte[]> f50752b = new ThreadLocal<>();

    public a(Reader reader) {
        super(reader);
    }

    protected static byte[] ensureBytes() {
        byte[] bArr = f50752b.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f50752b.set(bArr2);
        return bArr2;
    }

    public boolean a(String str) throws IOException {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int b5 = b();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((b5 >> (i4 * 8)) & 255) != str.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public int b() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[3] & 255) << 24) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8) | ((ensureBytes[2] & 255) << 16);
    }

    public int c() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[0] & 255) << 24) | (ensureBytes[3] & 255) | ((ensureBytes[2] & 255) << 8) | ((ensureBytes[1] & 255) << 16);
    }

    public short d() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 2);
        return (short) (((ensureBytes[0] & 255) << 8) | (ensureBytes[1] & 255));
    }
}
