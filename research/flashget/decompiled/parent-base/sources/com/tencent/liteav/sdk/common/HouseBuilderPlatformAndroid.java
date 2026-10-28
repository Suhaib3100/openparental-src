package com.tencent.liteav.sdk.common;

import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@JNINamespace("liteav::house")
/* loaded from: classes7.dex */
public class HouseBuilderPlatformAndroid {
    private static final String ALGORITHM_AES = ProtectedSandApp.s("呈\u0001");
    private static final String ALGORITHM_SHA256WITH_RSA = ProtectedSandApp.s("呎\u0001");
    private static final String ALGORITHM_AES_CBC_PKCS5PADDING = ProtectedSandApp.s("呉\u0001");
    private static final String TAG = ProtectedSandApp.s("呋\u0001");
    private static final String ALGORITHM_RSA = ProtectedSandApp.s("呍\u0001");

    public static String decryptHouse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            Log.w(ProtectedSandApp.s("呋\u0001"), ProtectedSandApp.s("告\u0001"), new Object[0]);
            return "";
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, ProtectedSandApp.s("呈\u0001"));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        try {
            Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("呉\u0001"));
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(bArr, 0)));
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String getPackageFile(String str) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = ContextUtils.getApplicationContext().getAssets().open(str);
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) <= 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return "";
                }
                inputStream.close();
                String str2 = new String(bArr);
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
                return str2;
            } catch (IOException e4) {
                Log.w(ProtectedSandApp.s("呋\u0001"), ProtectedSandApp.s("呌\u0001"), e4);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return "";
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static boolean verifyHouse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            Log.w(ProtectedSandApp.s("呋\u0001"), ProtectedSandApp.s("呏\u0001"), new Object[0]);
            return false;
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance(ProtectedSandApp.s("呍\u0001")).generatePublic(new X509EncodedKeySpec(Base64.decode(bArr3, 0)));
            Signature signature = Signature.getInstance(ProtectedSandApp.s("呎\u0001"));
            signature.initVerify(generatePublic);
            signature.update(Base64.decode(bArr, 0));
            return signature.verify(Base64.decode(bArr2, 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
