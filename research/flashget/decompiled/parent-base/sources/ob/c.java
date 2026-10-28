package ob;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.utils.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Md5FileNameGenerator.java */
/* loaded from: classes6.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f83760a = ProtectedSandApp.s("㢄\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final int f83761b = 36;

    private byte[] b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("㢄\u0001"));
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e4) {
            d.d(e4);
            return null;
        }
    }

    @Override // ob.a
    public String a(String str) {
        return new BigInteger(b(str.getBytes())).abs().toString(36);
    }
}
