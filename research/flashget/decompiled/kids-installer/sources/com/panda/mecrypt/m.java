package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Md5Encrypt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/panda/mecrypt/m;", "", "", "data", "", "a", "", "text", "b", "[C", "DIGITS", "<init>", "()V", "Mecrypt_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final m f21494a = new m();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private m() {
    }

    private final char[] a(byte[] data) {
        char[] cArr = new char[data.length << 1];
        int i5 = 0;
        for (byte b6 : data) {
            int i6 = i5 + 1;
            char[] cArr2 = DIGITS;
            cArr[i5] = cArr2[(b6 & 240) >>> 4];
            i5 = i6 + 1;
            cArr[i6] = cArr2[b6 & 15];
        }
        return cArr;
    }

    @d5.d
    public final String b(@d5.d String text) {
        l0.p(text, ProtectedSandApp.s("㘘"));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㘙"));
            if (messageDigest != null) {
                try {
                    Charset forName = Charset.forName(ProtectedSandApp.s("㘚"));
                    l0.o(forName, ProtectedSandApp.s("㘛"));
                    byte[] bytes = text.getBytes(forName);
                    l0.o(bytes, ProtectedSandApp.s("㘜"));
                    messageDigest.update(bytes);
                } catch (UnsupportedEncodingException unused) {
                    throw new IllegalStateException(ProtectedSandApp.s("㘝"));
                }
            }
            byte[] digest = messageDigest != null ? messageDigest.digest() : null;
            l0.m(digest);
            return new String(a(digest));
        } catch (NoSuchAlgorithmException unused2) {
            throw new IllegalStateException(ProtectedSandApp.s("㘞"));
        }
    }
}
