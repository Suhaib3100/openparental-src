package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Internal.java */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f77727a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f77728b;

    /* compiled from: Internal.java */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface b<T extends a> {
        T a(int i4);
    }

    static {
        byte[] bArr = new byte[0];
        f77727a = bArr;
        f77728b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return v.f(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, ProtectedSandApp.s("盚\u0001"));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(ProtectedSandApp.s("盛\u0001"), e4);
        }
    }
}
