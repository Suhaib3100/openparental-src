package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator.java */
/* loaded from: classes6.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f59783a = Byte.parseByte(ProtectedSandApp.s("Ø\u0001"), 2);

    /* renamed from: b, reason: collision with root package name */
    private static final byte f59784b = Byte.parseByte(ProtectedSandApp.s("Ù\u0001"), 2);

    /* renamed from: c, reason: collision with root package name */
    private static final int f59785c = 22;

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
        byte[] c5 = c(UUID.randomUUID(), new byte[17]);
        byte b5 = c5[0];
        c5[16] = b5;
        c5[0] = (byte) ((b5 & f59784b) | f59783a);
        return b(c5);
    }
}
