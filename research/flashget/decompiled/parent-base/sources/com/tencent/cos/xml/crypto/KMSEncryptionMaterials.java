package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.security.KeyPair;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
public class KMSEncryptionMaterials extends EncryptionMaterials implements Serializable {
    public static final String CUSTOMER_MASTER_KEY_ID = ProtectedSandApp.s("㘇\u0001");

    public KMSEncryptionMaterials(String str) {
        super(null, null);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㘈\u0001"));
        }
        addDescription(ProtectedSandApp.s("㘇\u0001"), str);
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public String getCustomerMasterKeyId() {
        return getDescription(ProtectedSandApp.s("㘇\u0001"));
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public final KeyPair getKeyPair() {
        throw new UnsupportedOperationException();
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public final SecretKey getSymmetricKey() {
        throw new UnsupportedOperationException();
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public final boolean isKMSEnabled() {
        return true;
    }

    public String toString() {
        return String.valueOf(getMaterialsDescription());
    }
}
