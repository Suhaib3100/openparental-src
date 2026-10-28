package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.s3.Base64;
import com.tencentcloudapi.kms.v20190118.models.DecryptRequest;
import com.tencentcloudapi.kms.v20190118.models.EncryptRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyPair;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;

/* loaded from: classes6.dex */
final class ContentCryptoMaterial {
    private final CipherLite cipherLite;
    private final byte[] encryptedCEK;
    private final Map<String, String> kekMaterialsDescription;
    private final String keyWrappingAlgorithm;

    ContentCryptoMaterial(Map<String, String> map, byte[] bArr, String str, CipherLite cipherLite) {
        this.cipherLite = cipherLite;
        this.keyWrappingAlgorithm = str;
        this.encryptedCEK = (byte[]) bArr.clone();
        this.kekMaterialsDescription = map;
    }

    private static SecretKey cek(byte[] bArr, String str, EncryptionMaterials encryptionMaterials, Provider provider, ContentCryptoScheme contentCryptoScheme, QCLOUDKMS qcloudkms) throws CosXmlClientException {
        Key symmetricKey;
        if (KMSSecuredCEK.isKMSKeyWrapped(str)) {
            return cekByKMS(bArr, str, encryptionMaterials, contentCryptoScheme, qcloudkms);
        }
        KeyPair keyPair = encryptionMaterials.getKeyPair();
        String s4 = ProtectedSandApp.s("㖔\u0001");
        if (keyPair != null) {
            symmetricKey = encryptionMaterials.getKeyPair().getPrivate();
            if (symmetricKey == null) {
                throw CosXmlClientException.internalException(s4);
            }
        } else {
            symmetricKey = encryptionMaterials.getSymmetricKey();
            if (symmetricKey == null) {
                throw CosXmlClientException.internalException(s4);
            }
        }
        try {
            if (str != null) {
                Cipher cipher = provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
                cipher.init(4, symmetricKey);
                return (SecretKey) cipher.unwrap(bArr, str, 3);
            }
            Cipher cipher2 = provider != null ? Cipher.getInstance(symmetricKey.getAlgorithm(), provider) : Cipher.getInstance(symmetricKey.getAlgorithm());
            cipher2.init(2, symmetricKey);
            return new SecretKeySpec(cipher2.doFinal(bArr), ProtectedSandApp.s("㖕\u0001"));
        } catch (Exception unused) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖖\u0001"));
        }
    }

    private static SecretKey cekByKMS(byte[] bArr, String str, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, QCLOUDKMS qcloudkms) throws CosXmlClientException {
        DecryptRequest decryptRequest = new DecryptRequest();
        try {
            decryptRequest.setEncryptionContext(JSONUtils.toJsonString(encryptionMaterials.getMaterialsDescription()));
            decryptRequest.setCiphertextBlob(new String(bArr));
            return new SecretKeySpec(Base64.decode(qcloudkms.decrypt(decryptRequest).getPlaintext()), contentCryptoScheme.getKeyGeneratorAlgorithm());
        } catch (JSONException unused) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖗\u0001"));
        }
    }

    private static String convertStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(ProtectedSandApp.s("㖘\u0001"))));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    inputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    static ContentCryptoMaterial create(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return doCreate(secretKey, bArr, encryptionMaterials, contentCryptoScheme, cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
    }

    private static ContentCryptoMaterial doCreate(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return wrap(secretKey, bArr, contentCryptoScheme, provider, secureCEK(secretKey, encryptionMaterials, cOSCryptoScheme.getKeyWrapScheme(), cOSCryptoScheme.getSecureRandom(), provider, qcloudkms, cosXmlRequest));
    }

    static ContentCryptoMaterial fromObjectMetadata(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, boolean z4, QCLOUDKMS qcloudkms) throws CosXmlClientException, JSONException {
        return fromObjectMetadata0(objectMetadata, encryptionMaterialsAccessor, provider, null, z4, qcloudkms);
    }

    private static ContentCryptoMaterial fromObjectMetadata0(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, boolean z4, QCLOUDKMS qcloudkms) throws CosXmlClientException, JSONException {
        EncryptionMaterials encryptionMaterials;
        int parseInt;
        Map<String, String> userMetadata = objectMetadata.getUserMetadata();
        String s4 = ProtectedSandApp.s("㖙\u0001");
        String str = userMetadata.get(s4);
        if (str == null && (str = userMetadata.get(s4)) == null) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖚\u0001"));
        }
        byte[] decode = Base64.decode(str);
        byte[] decode2 = Base64.decode(userMetadata.get(ProtectedSandApp.s("㖛\u0001")));
        if (decode == null || decode2 == null) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖤\u0001"));
        }
        String str2 = userMetadata.get(ProtectedSandApp.s("㖜\u0001"));
        String str3 = userMetadata.get(ProtectedSandApp.s("㖝\u0001"));
        boolean isKMSKeyWrapped = KMSSecuredCEK.isKMSKeyWrapped(str3);
        Map<String, String> matdescFromJson = matdescFromJson(str2);
        if (isKMSKeyWrapped) {
            encryptionMaterials = new KMSEncryptionMaterials(matdescFromJson.get(ProtectedSandApp.s("㖞\u0001")));
            encryptionMaterials.addDescriptions(matdescFromJson);
        } else {
            encryptionMaterials = encryptionMaterialsAccessor == null ? null : encryptionMaterialsAccessor.getEncryptionMaterials(matdescFromJson);
            if (encryptionMaterials == null) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("㖣\u0001"));
            }
        }
        EncryptionMaterials encryptionMaterials2 = encryptionMaterials;
        String str4 = userMetadata.get(ProtectedSandApp.s("㖟\u0001"));
        boolean z5 = jArr != null;
        ContentCryptoScheme fromCEKAlgo = ContentCryptoScheme.fromCEKAlgo(str4);
        if (z5) {
            decode2 = fromCEKAlgo.adjustIV(decode2, jArr[0]);
        } else {
            int tagLengthInBits = fromCEKAlgo.getTagLengthInBits();
            if (tagLengthInBits > 0 && tagLengthInBits != (parseInt = Integer.parseInt(userMetadata.get(ProtectedSandApp.s("㖠\u0001"))))) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("㖡\u0001") + parseInt + ProtectedSandApp.s("㖢\u0001") + tagLengthInBits);
            }
        }
        if (z4 && str3 == null) {
            throw newKeyWrapException();
        }
        return new ContentCryptoMaterial(matdescFromJson, decode, str3, fromCEKAlgo.createCipherLite(cek(decode, str3, encryptionMaterials2, provider, fromCEKAlgo, qcloudkms), decode2, 2, provider));
    }

    private String kekMaterialDescAsJson() throws JSONException {
        Map<String, String> kEKMaterialsDescription = getKEKMaterialsDescription();
        if (kEKMaterialsDescription == null) {
            kEKMaterialsDescription = Collections.emptyMap();
        }
        return JSONUtils.toJsonString(kEKMaterialsDescription);
    }

    private static Map<String, String> matdescFromJson(String str) throws JSONException {
        Map<String, String> map = JSONUtils.toMap(str);
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Map<String, String> mergeMaterialDescriptions(EncryptionMaterials encryptionMaterials, CosXmlRequest cosXmlRequest) {
        Map<String, String> materialsDescription;
        Map<String, String> materialsDescription2 = encryptionMaterials.getMaterialsDescription();
        if (!(cosXmlRequest instanceof MaterialsDescriptionProvider) || (materialsDescription = ((MaterialsDescriptionProvider) cosXmlRequest).getMaterialsDescription()) == null) {
            return materialsDescription2;
        }
        TreeMap treeMap = new TreeMap(materialsDescription2);
        treeMap.putAll(materialsDescription);
        return treeMap;
    }

    private static CosXmlClientException newKeyWrapException() throws CosXmlClientException {
        return CosXmlClientException.internalException(ProtectedSandApp.s("㖥\u0001"));
    }

    private static SecuredCEK secureCEK(SecretKey secretKey, EncryptionMaterials encryptionMaterials, COSKeyWrapScheme cOSKeyWrapScheme, SecureRandom secureRandom, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        if (encryptionMaterials.isKMSEnabled()) {
            Map<String, String> mergeMaterialDescriptions = mergeMaterialDescriptions(encryptionMaterials, cosXmlRequest);
            EncryptRequest encryptRequest = new EncryptRequest();
            try {
                encryptRequest.setEncryptionContext(JSONUtils.toJsonString(mergeMaterialDescriptions));
                encryptRequest.setKeyId(encryptionMaterials.getCustomerMasterKeyId());
                encryptRequest.setPlaintext(secretKey.getEncoded().toString());
                return new KMSSecuredCEK(qcloudkms.encrypt(encryptRequest).getCiphertextBlob().getBytes(), mergeMaterialDescriptions);
            } catch (JSONException unused) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("㖦\u0001"));
            }
        }
        Map<String, String> materialsDescription = encryptionMaterials.getMaterialsDescription();
        Key key = encryptionMaterials.getKeyPair() != null ? encryptionMaterials.getKeyPair().getPublic() : encryptionMaterials.getSymmetricKey();
        String keyWrapAlgorithm = cOSKeyWrapScheme.getKeyWrapAlgorithm(key);
        try {
            Cipher cipher = provider == null ? Cipher.getInstance(keyWrapAlgorithm) : Cipher.getInstance(keyWrapAlgorithm, provider);
            cipher.init(3, key, secureRandom);
            return new SecuredCEK(cipher.wrap(secretKey), keyWrapAlgorithm, materialsDescription);
        } catch (Exception unused2) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖧\u0001"));
        }
    }

    private boolean usesKMSKey() {
        return KMSSecuredCEK.isKMSKeyWrapped(this.keyWrappingAlgorithm);
    }

    public static ContentCryptoMaterial wrap(SecretKey secretKey, byte[] bArr, ContentCryptoScheme contentCryptoScheme, Provider provider, SecuredCEK securedCEK) throws CosXmlClientException {
        return new ContentCryptoMaterial(securedCEK.getMaterialDescription(), securedCEK.getEncrypted(), securedCEK.getKeyWrapAlgorithm(), contentCryptoScheme.createCipherLite(secretKey, bArr, 1, provider));
    }

    public CipherLite getCipherLite() {
        return this.cipherLite;
    }

    ContentCryptoScheme getContentCryptoScheme() {
        return this.cipherLite.getContentCryptoScheme();
    }

    byte[] getEncryptedCEK() {
        return (byte[]) this.encryptedCEK.clone();
    }

    Map<String, String> getKEKMaterialsDescription() {
        return this.kekMaterialsDescription;
    }

    String getKeyWrappingAlgorithm() {
        return this.keyWrappingAlgorithm;
    }

    ContentCryptoMaterial recreate(Map<String, String> map, EncryptionMaterialsAccessor encryptionMaterialsAccessor, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials;
        if (!usesKMSKey() && map.equals(this.kekMaterialsDescription)) {
            throw new SecurityException(ProtectedSandApp.s("㖨\u0001"));
        }
        if (usesKMSKey()) {
            encryptionMaterials = new KMSEncryptionMaterials(this.kekMaterialsDescription.get(ProtectedSandApp.s("㖞\u0001")));
        } else {
            encryptionMaterials = encryptionMaterialsAccessor.getEncryptionMaterials(this.kekMaterialsDescription);
            if (encryptionMaterials == null) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("㖪\u0001"));
            }
        }
        EncryptionMaterials encryptionMaterials2 = encryptionMaterials;
        EncryptionMaterials encryptionMaterials3 = encryptionMaterialsAccessor.getEncryptionMaterials(map);
        if (encryptionMaterials3 != null) {
            ContentCryptoMaterial create = create(cek(this.encryptedCEK, this.keyWrappingAlgorithm, encryptionMaterials2, provider, getContentCryptoScheme(), qcloudkms), this.cipherLite.getIV(), encryptionMaterials3, getContentCryptoScheme(), cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
            if (Arrays.equals(create.encryptedCEK, this.encryptedCEK)) {
                throw new SecurityException(ProtectedSandApp.s("㖩\u0001"));
            }
            return create;
        }
        throw CosXmlClientException.internalException(ProtectedSandApp.s("㖫\u0001") + map + ProtectedSandApp.s("㖬\u0001"));
    }

    String toJsonString() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㖙\u0001"), Base64.encodeAsString(getEncryptedCEK()));
        hashMap.put(ProtectedSandApp.s("㖛\u0001"), Base64.encodeAsString(this.cipherLite.getIV()));
        hashMap.put(ProtectedSandApp.s("㖜\u0001"), kekMaterialDescAsJson());
        ContentCryptoScheme contentCryptoScheme = getContentCryptoScheme();
        hashMap.put(ProtectedSandApp.s("㖟\u0001"), contentCryptoScheme.getCipherAlgorithm());
        int tagLengthInBits = contentCryptoScheme.getTagLengthInBits();
        if (tagLengthInBits > 0) {
            hashMap.put(ProtectedSandApp.s("㖠\u0001"), String.valueOf(tagLengthInBits));
        }
        String keyWrappingAlgorithm = getKeyWrappingAlgorithm();
        if (keyWrappingAlgorithm != null) {
            hashMap.put(ProtectedSandApp.s("㖝\u0001"), keyWrappingAlgorithm);
        }
        return JSONUtils.toJsonString(hashMap);
    }

    ObjectMetadata toObjectMetadata(ObjectMetadata objectMetadata) throws JSONException {
        objectMetadata.addUserMetadata(ProtectedSandApp.s("㖙\u0001"), Base64.encodeAsString(getEncryptedCEK()));
        objectMetadata.addUserMetadata(ProtectedSandApp.s("㖛\u0001"), Base64.encodeAsString(this.cipherLite.getIV()));
        objectMetadata.addUserMetadata(ProtectedSandApp.s("㖜\u0001"), kekMaterialDescAsJson());
        ContentCryptoScheme contentCryptoScheme = getContentCryptoScheme();
        objectMetadata.addUserMetadata(ProtectedSandApp.s("㖟\u0001"), contentCryptoScheme.getCipherAlgorithm());
        int tagLengthInBits = contentCryptoScheme.getTagLengthInBits();
        if (tagLengthInBits > 0) {
            objectMetadata.addUserMetadata(ProtectedSandApp.s("㖠\u0001"), String.valueOf(tagLengthInBits));
        }
        String keyWrappingAlgorithm = getKeyWrappingAlgorithm();
        if (keyWrappingAlgorithm != null) {
            objectMetadata.addUserMetadata(ProtectedSandApp.s("㖝\u0001"), keyWrappingAlgorithm);
        }
        return objectMetadata;
    }

    static ContentCryptoMaterial create(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return doCreate(secretKey, bArr, encryptionMaterials, cOSCryptoScheme.getContentCryptoScheme(), cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
    }

    static ContentCryptoMaterial fromObjectMetadata(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, boolean z4, QCLOUDKMS qcloudkms) throws CosXmlClientException, JSONException {
        return fromObjectMetadata0(objectMetadata, encryptionMaterialsAccessor, provider, jArr, z4, qcloudkms);
    }

    ContentCryptoMaterial recreate(EncryptionMaterials encryptionMaterials, EncryptionMaterialsAccessor encryptionMaterialsAccessor, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials2;
        if (!usesKMSKey() && encryptionMaterials.getMaterialsDescription().equals(this.kekMaterialsDescription)) {
            throw new SecurityException(ProtectedSandApp.s("㖨\u0001"));
        }
        if (usesKMSKey()) {
            encryptionMaterials2 = new KMSEncryptionMaterials(this.kekMaterialsDescription.get(ProtectedSandApp.s("㖞\u0001")));
        } else {
            encryptionMaterials2 = encryptionMaterialsAccessor.getEncryptionMaterials(this.kekMaterialsDescription);
            if (encryptionMaterials2 == null) {
                throw CosXmlClientException.internalException(ProtectedSandApp.s("㖪\u0001"));
            }
        }
        ContentCryptoMaterial create = create(cek(this.encryptedCEK, this.keyWrappingAlgorithm, encryptionMaterials2, provider, getContentCryptoScheme(), qcloudkms), this.cipherLite.getIV(), encryptionMaterials, getContentCryptoScheme(), cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
        if (Arrays.equals(create.encryptedCEK, this.encryptedCEK)) {
            throw new SecurityException(ProtectedSandApp.s("㖩\u0001"));
        }
        return create;
    }
}
