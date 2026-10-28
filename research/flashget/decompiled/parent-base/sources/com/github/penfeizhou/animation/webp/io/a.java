package com.github.penfeizhou.animation.webp.io;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.d;
import java.io.IOException;

/* compiled from: WebPReader.java */
/* loaded from: classes5.dex */
public class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<byte[]> f50900b = new ThreadLocal<>();

    public a(Reader reader) {
        super(reader);
    }

    protected static byte[] ensureBytes() {
        byte[] bArr = f50900b.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f50900b.set(bArr2);
        return bArr2;
    }

    public int a() throws IOException {
        return d() + 1;
    }

    public int b() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[3] & 255) << 24) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8) | ((ensureBytes[2] & 255) << 16);
    }

    public int c() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 2);
        return ((ensureBytes[1] & 255) << 8) | (ensureBytes[0] & 255);
    }

    public int d() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 3);
        return ((ensureBytes[2] & 255) << 16) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8);
    }

    public int e() throws IOException {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[3] & 255) << 24) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8) | ((ensureBytes[2] & 255) << 16);
    }

    public boolean f(String str) throws IOException {
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
}
