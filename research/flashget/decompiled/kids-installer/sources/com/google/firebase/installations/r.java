package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f16915a = Byte.parseByte(ProtectedSandApp.s("ᙻ"), 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f16916b = Byte.parseByte(ProtectedSandApp.s("ᙼ"), 2);

    /* renamed from: c, reason: collision with root package name */
    private static final int f16917c = 22;

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @o0
    public String a() {
        byte[] c6 = c(UUID.randomUUID(), new byte[17]);
        byte b6 = c6[0];
        c6[16] = b6;
        c6[0] = (byte) ((b6 & f16916b) | f16915a);
        return b(c6);
    }
}
