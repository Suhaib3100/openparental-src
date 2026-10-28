package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Internal.java */
/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f25745a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f25746b;

    /* compiled from: Internal.java */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface b<T extends a> {
        T a(int i5);
    }

    static {
        byte[] bArr = new byte[0];
        f25745a = bArr;
        f25746b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return v.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, ProtectedSandApp.s("体"));
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(ProtectedSandApp.s("佔"), e6);
        }
    }
}
