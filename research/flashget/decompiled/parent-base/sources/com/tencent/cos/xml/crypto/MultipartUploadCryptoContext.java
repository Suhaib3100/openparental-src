package com.tencent.cos.xml.crypto;

import androidx.annotation.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MultipartUploadCryptoContext {
    private final String bucketName;
    private final ContentCryptoMaterial cekMaterial;
    private boolean hasFinalPartBeenSeen;
    private final String key;
    private Map<String, String> materialsDescription;

    @b0("this")
    private int partNumber;
    private volatile boolean partUploadInProgress;

    protected MultipartUploadCryptoContext(String str, String str2, ContentCryptoMaterial contentCryptoMaterial) {
        this.bucketName = str;
        this.key = str2;
        this.cekMaterial = contentCryptoMaterial;
    }

    void beginPartUpload(int i4) throws CosXmlClientException {
        String s4 = ProtectedSandApp.s("㘖\u0001");
        if (i4 < 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㘚\u0001"));
        }
        if (this.partUploadInProgress) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㘙\u0001"));
        }
        synchronized (this) {
            try {
                if (this.partUploadInProgress) {
                    throw CosXmlClientException.internalException(ProtectedSandApp.s("㘙\u0001"));
                }
                if (i4 - this.partNumber > 1) {
                    throw CosXmlClientException.internalException(s4 + this.partNumber + ProtectedSandApp.s("㘗\u0001") + i4 + ProtectedSandApp.s("㘘\u0001"));
                }
                this.partNumber = i4;
                this.partUploadInProgress = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void endPartUpload() {
        this.partUploadInProgress = false;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public CipherLite getCipherLite() {
        return this.cekMaterial.getCipherLite();
    }

    ContentCryptoMaterial getContentCryptoMaterial() {
        return this.cekMaterial;
    }

    public final String getKey() {
        return this.key;
    }

    public final Map<String, String> getMaterialsDescription() {
        return this.materialsDescription;
    }

    public final boolean hasFinalPartBeenSeen() {
        return this.hasFinalPartBeenSeen;
    }

    public final void setHasFinalPartBeenSeen(boolean z4) {
        this.hasFinalPartBeenSeen = z4;
    }

    public final void setMaterialsDescription(Map<String, String> map) {
        this.materialsDescription = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
    }
}
