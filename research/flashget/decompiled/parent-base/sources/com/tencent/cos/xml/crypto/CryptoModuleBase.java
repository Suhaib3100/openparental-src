package com.tencent.cos.xml.crypto;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.s3.Base64;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyRequest;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;

/* loaded from: classes6.dex */
public abstract class CryptoModuleBase implements CryptoModule {
    protected static final int DEFAULT_BUFFER_SIZE = 2048;
    private static final boolean IS_MULTI_PART = true;
    protected final ContentCryptoScheme contentCryptoScheme;
    protected final CosXmlSimpleService cos;
    protected final COSCryptoScheme cryptoScheme;
    protected final EncryptionMaterialsProvider kekMaterialsProvider;
    protected final QCLOUDKMS kms;
    protected final Map<String, MultipartUploadCryptoContext> multipartUploadContexts = Collections.synchronizedMap(new HashMap());

    protected CryptoModuleBase(QCLOUDKMS qcloudkms, CosXmlSimpleService cosXmlSimpleService, QCloudCredentialProvider qCloudCredentialProvider, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this.kekMaterialsProvider = encryptionMaterialsProvider;
        this.cos = cosXmlSimpleService;
        COSCryptoScheme from = COSCryptoScheme.from();
        this.cryptoScheme = from;
        this.contentCryptoScheme = from.getContentCryptoScheme();
        this.kms = qcloudkms;
    }

    private ContentCryptoMaterial buildContentCryptoMaterial(EncryptionMaterials encryptionMaterials, Provider provider, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        byte[] bArr = new byte[this.contentCryptoScheme.getIVLengthInBytes()];
        this.cryptoScheme.getSecureRandom().nextBytes(bArr);
        if (!encryptionMaterials.isKMSEnabled()) {
            return ContentCryptoMaterial.create(generateCEK(encryptionMaterials, provider), bArr, encryptionMaterials, this.cryptoScheme, provider, this.kms, cosXmlRequest);
        }
        Map<String, String> mergeMaterialDescriptions = ContentCryptoMaterial.mergeMaterialDescriptions(encryptionMaterials, cosXmlRequest);
        GenerateDataKeyRequest generateDataKeyRequest = new GenerateDataKeyRequest();
        try {
            generateDataKeyRequest.setEncryptionContext(JSONUtils.toJsonString(mergeMaterialDescriptions));
            generateDataKeyRequest.setKeyId(encryptionMaterials.getCustomerMasterKeyId());
            generateDataKeyRequest.setKeySpec(this.contentCryptoScheme.getKeySpec());
            GenerateDataKeyResponse generateDataKey = this.kms.generateDataKey(generateDataKeyRequest);
            return ContentCryptoMaterial.wrap(new SecretKeySpec(Base64.decode(generateDataKey.getPlaintext()), this.contentCryptoScheme.getKeyGeneratorAlgorithm()), bArr, this.contentCryptoScheme, provider, new KMSSecuredCEK(generateDataKey.getCiphertextBlob().getBytes(), mergeMaterialDescriptions));
        } catch (JSONException unused) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖭\u0001"));
        }
    }

    static Range getAdjustedCryptoRange(Range range) {
        if (range == null) {
            return null;
        }
        return new Range(getCipherBlockLowerBound(range.getStart()), range.getEnd() != -1 ? getCipherBlockUpperBound(range.getEnd()) : -1L);
    }

    private static long getCipherBlockLowerBound(long j4) {
        long j5 = (j4 - (j4 % 16)) - 16;
        if (j5 < 0) {
            return 0L;
        }
        return j5;
    }

    private static long getCipherBlockUpperBound(long j4) {
        long j5 = (16 - (j4 % 16)) + j4 + 16;
        if (j5 < 0) {
            return Long.MAX_VALUE;
        }
        return j5;
    }

    private CipherLiteInputStream newCOSCipherLiteInputStream(PutObjectRequest putObjectRequest, ContentCryptoMaterial contentCryptoMaterial, long j4) throws CosXmlClientException {
        try {
            InputStream openInputStream = openInputStream(putObjectRequest);
            if (j4 > -1) {
                openInputStream = new LengthCheckInputStream(openInputStream, j4, false);
            }
            CipherLite cipherLite = contentCryptoMaterial.getCipherLite();
            return cipherLite.markSupported() ? new CipherLiteInputStream(openInputStream, cipherLite, 2048) : new RenewableCipherLiteInputStream(openInputStream, cipherLite, 2048);
        } catch (Exception e4) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖮\u0001") + e4.getMessage());
        }
    }

    private ContentCryptoMaterial newContentCryptoMaterial(EncryptionMaterialsProvider encryptionMaterialsProvider, Map<String, String> map, Provider provider, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials(map);
        if (encryptionMaterials == null) {
            return null;
        }
        return buildContentCryptoMaterial(encryptionMaterials, provider, cosXmlRequest);
    }

    @q0
    private InputStream openInputStream(PutObjectRequest putObjectRequest) throws IOException {
        String srcPath = putObjectRequest.getSrcPath();
        Uri uri = putObjectRequest.getUri();
        if (srcPath != null) {
            return new FileInputStream(srcPath);
        }
        if (uri == null || ContextHolder.getAppContext() == null) {
            return null;
        }
        return ContextHolder.getAppContext().getContentResolver().openInputStream(uri);
    }

    protected final InitMultipartUploadRequest cipherInitMultipartUploadRequest(InitMultipartUploadRequest initMultipartUploadRequest) {
        ObjectMetadata metadata = initMultipartUploadRequest.getMetadata();
        if (metadata == null) {
            return initMultipartUploadRequest;
        }
        if (metadata.getContentMD5() != null) {
            metadata.addUserMetadata(ProtectedSandApp.s("㖰\u0001"), metadata.getContentMD5());
        }
        metadata.setContentMD5(null);
        if (metadata.getContentLength() != 0) {
            metadata.addUserMetadata(ProtectedSandApp.s("㖱\u0001"), Long.toString(metadata.getContentLength()));
            metadata.setContentLength(0L);
        }
        initMultipartUploadRequest.setMetadata(metadata);
        return initMultipartUploadRequest;
    }

    abstract CipherLite cipherLiteForNextPart(MultipartUploadCryptoContext multipartUploadCryptoContext);

    protected abstract long ciphertextLength(long j4);

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public CompleteMultiUploadResult completeMultipartUploadSecurely(CompleteMultiUploadRequest completeMultiUploadRequest) throws CosXmlClientException, CosXmlServiceException {
        String uploadId = completeMultiUploadRequest.getUploadId();
        MultipartUploadCryptoContext multipartUploadCryptoContext = this.multipartUploadContexts.get(uploadId);
        if (multipartUploadCryptoContext != null && !multipartUploadCryptoContext.hasFinalPartBeenSeen()) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖲\u0001"));
        }
        CompleteMultiUploadResult completeMultiUpload = this.cos.completeMultiUpload(completeMultiUploadRequest);
        this.multipartUploadContexts.remove(uploadId);
        return completeMultiUpload;
    }

    abstract long computeLastPartSize(UploadPartRequest uploadPartRequest);

    protected final ContentCryptoMaterial createContentCryptoMaterial(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return newContentCryptoMaterial(this.kekMaterialsProvider, null, cosXmlRequest);
    }

    protected final SecretKey generateCEK(EncryptionMaterials encryptionMaterials, Provider provider) throws CosXmlClientException {
        boolean z4;
        String keyGeneratorAlgorithm = this.contentCryptoScheme.getKeyGeneratorAlgorithm();
        try {
            KeyGenerator keyGenerator = provider == null ? KeyGenerator.getInstance(keyGeneratorAlgorithm) : KeyGenerator.getInstance(keyGeneratorAlgorithm, provider);
            keyGenerator.init(this.contentCryptoScheme.getKeyLengthInBits(), this.cryptoScheme.getSecureRandom());
            KeyPair keyPair = encryptionMaterials.getKeyPair();
            if (keyPair == null || this.cryptoScheme.getKeyWrapScheme().getKeyWrapAlgorithm(keyPair.getPublic()) != null) {
                z4 = false;
            } else {
                Provider provider2 = keyGenerator.getProvider();
                z4 = ProtectedSandApp.s("㖳\u0001").equals(provider2 == null ? null : provider2.getName());
            }
            SecretKey generateKey = keyGenerator.generateKey();
            if (z4 && generateKey.getEncoded()[0] == 0) {
                for (int i4 = 0; i4 < 10; i4++) {
                    SecretKey generateKey2 = keyGenerator.generateKey();
                    if (generateKey2.getEncoded()[0] != 0) {
                        return generateKey2;
                    }
                }
                throw CosXmlClientException.internalException(ProtectedSandApp.s("㖴\u0001"));
            }
            return generateKey;
        } catch (NoSuchAlgorithmException e4) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖵\u0001") + e4.getMessage());
        }
    }

    public final COSCryptoScheme getCOSCryptoScheme() {
        return this.cryptoScheme;
    }

    public MultipartUploadCryptoContext getCryptoContext(String str) {
        return this.multipartUploadContexts.get(str);
    }

    public boolean hasMultipartUploadContext(String str) {
        return this.multipartUploadContexts.containsKey(str);
    }

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public InitMultipartUploadResult initMultipartUploadSecurely(InitMultipartUploadRequest initMultipartUploadRequest) throws CosXmlClientException, CosXmlServiceException {
        cipherInitMultipartUploadRequest(initMultipartUploadRequest);
        ContentCryptoMaterial createContentCryptoMaterial = createContentCryptoMaterial(initMultipartUploadRequest);
        ObjectMetadata metadata = initMultipartUploadRequest.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }
        initMultipartUploadRequest.setMetadata(updateMetadataWithContentCryptoMaterial(metadata, createContentCryptoMaterial));
        InitMultipartUploadResult initMultipartUpload = this.cos.initMultipartUpload(initMultipartUploadRequest);
        this.multipartUploadContexts.put(initMultipartUpload.initMultipartUpload.uploadId, newUploadContext(initMultipartUploadRequest, createContentCryptoMaterial));
        return initMultipartUpload;
    }

    public final CipherLiteInputStream newMultipartCOSCipherInputStream(UploadPartRequest uploadPartRequest, CipherLite cipherLite) throws CosXmlClientException {
        String srcPath = uploadPartRequest.getSrcPath();
        Uri uri = uploadPartRequest.getUri();
        try {
            InputSubstream inputSubstream = new InputSubstream(!TextUtils.isEmpty(srcPath) ? new ResettableInputStream(srcPath) : (uri == null || ContextHolder.getAppContext() == null) ? null : ContextHolder.getAppContext().getContentResolver().openInputStream(uri), uploadPartRequest.getFileOffset(), uploadPartRequest.getFileContentLength(), uploadPartRequest.isLastPart());
            return cipherLite.markSupported() ? new CipherLiteInputStream(inputSubstream, cipherLite, 2048, true, uploadPartRequest.isLastPart()) : new RenewableCipherLiteInputStream(inputSubstream, cipherLite, 2048, true, uploadPartRequest.isLastPart());
        } catch (Exception e4) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖮\u0001") + e4.getMessage());
        }
    }

    abstract MultipartUploadCryptoContext newUploadContext(InitMultipartUploadRequest initMultipartUploadRequest, ContentCryptoMaterial contentCryptoMaterial);

    protected final long plaintextLength(PutObjectRequest putObjectRequest, ObjectMetadata objectMetadata) {
        Context appContext;
        String srcPath = putObjectRequest.getSrcPath();
        Uri uri = putObjectRequest.getUri();
        if (!TextUtils.isEmpty(srcPath)) {
            return new File(srcPath).length();
        }
        if (uri == null || (appContext = ContextHolder.getAppContext()) == null) {
            return -1L;
        }
        return QCloudUtils.getUriContentLength(uri, appContext.getContentResolver());
    }

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) throws CosXmlClientException, CosXmlServiceException {
        ContentCryptoMaterial createContentCryptoMaterial = createContentCryptoMaterial(putObjectRequest);
        PutObjectRequest wrapWithCipher = wrapWithCipher(putObjectRequest, createContentCryptoMaterial);
        putObjectRequest.setMetadata(updateMetadataWithContentCryptoMaterial(putObjectRequest.getMetadata(), createContentCryptoMaterial));
        return this.cos.putObject(wrapWithCipher);
    }

    protected final ObjectMetadata updateMetadataWithContentCryptoMaterial(ObjectMetadata objectMetadata, ContentCryptoMaterial contentCryptoMaterial) throws CosXmlClientException {
        if (objectMetadata == null) {
            objectMetadata = new ObjectMetadata();
        }
        try {
            return contentCryptoMaterial.toObjectMetadata(objectMetadata);
        } catch (JSONException e4) {
            throw CosXmlClientException.internalException(e4.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    @Override // com.tencent.cos.xml.crypto.CryptoModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uploadPartAsyncSecurely(com.tencent.cos.xml.model.object.UploadPartRequest r12, com.tencent.cos.xml.listener.CosXmlResultListener r13) {
        /*
            r11 = this;
            java.lang.String r0 = "㖶\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r1 = "㖷\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r2 = r12.isLastPart()
            r3 = 1
            r4 = 0
            com.tencent.cos.xml.crypto.ContentCryptoScheme r5 = r11.contentCryptoScheme     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            int r5 = r5.getBlockSizeInBytes()     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            java.lang.String r6 = r12.getUploadId()     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            long r7 = r12.getFileLength()     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            long r9 = (long) r5     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            long r7 = r7 % r9
            r9 = 0
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L2a
            r7 = r3
            goto L2b
        L2a:
            r7 = 0
        L2b:
            if (r2 != 0) goto L50
            if (r7 == 0) goto L30
            goto L50
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            r0.append(r5)     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            java.lang.String r1 = "㖸\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            com.tencent.cos.xml.exception.CosXmlClientException r0 = com.tencent.cos.xml.exception.CosXmlClientException.internalException(r0)     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            throw r0     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
        L4a:
            r12 = move-exception
            goto Lc1
        L4d:
            r0 = move-exception
            r1 = r4
            goto Lb3
        L50:
            java.util.Map<java.lang.String, com.tencent.cos.xml.crypto.MultipartUploadCryptoContext> r1 = r11.multipartUploadContexts     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            com.tencent.cos.xml.crypto.MultipartUploadCryptoContext r1 = (com.tencent.cos.xml.crypto.MultipartUploadCryptoContext) r1     // Catch: java.lang.Throwable -> L4a com.tencent.cos.xml.exception.CosXmlClientException -> L4d
            if (r1 == 0) goto La2
            int r0 = r12.getPartNumber()     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r1.beginPartUpload(r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            com.tencent.cos.xml.crypto.CipherLite r0 = r11.cipherLiteForNextPart(r1)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            com.tencent.cos.xml.crypto.CipherLiteInputStream r0 = r11.newMultipartCOSCipherInputStream(r12, r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r12.setInputStream(r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r12.setSrcPath(r4)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r12.setFileOffset(r9)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            if (r2 == 0) goto L99
            long r5 = r11.computeLastPartSize(r12)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L87
            r12.setFileContentLength(r5)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            goto L87
        L82:
            r12 = move-exception
            r4 = r1
            goto Lc1
        L85:
            r0 = move-exception
            goto Lb3
        L87:
            boolean r0 = r1.hasFinalPartBeenSeen()     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            if (r0 != 0) goto L8e
            goto L99
        L8e:
            java.lang.String r0 = "㖹\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            com.tencent.cos.xml.exception.CosXmlClientException r0 = com.tencent.cos.xml.exception.CosXmlClientException.internalException(r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            throw r0     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
        L99:
            com.tencent.cos.xml.CosXmlSimpleService r0 = r11.cos     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r0.uploadPartAsync(r12, r13)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
        L9e:
            r1.endPartUpload()
            goto Lb9
        La2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            r5.append(r6)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            com.tencent.cos.xml.exception.CosXmlClientException r0 = com.tencent.cos.xml.exception.CosXmlClientException.internalException(r0)     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
            throw r0     // Catch: java.lang.Throwable -> L82 com.tencent.cos.xml.exception.CosXmlClientException -> L85
        Lb3:
            r13.onFail(r12, r0, r4)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto Lb9
            goto L9e
        Lb9:
            if (r2 == 0) goto Lc0
            if (r1 == 0) goto Lc0
            r1.setHasFinalPartBeenSeen(r3)
        Lc0:
            return
        Lc1:
            if (r4 == 0) goto Lc6
            r4.endPartUpload()
        Lc6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cos.xml.crypto.CryptoModuleBase.uploadPartAsyncSecurely(com.tencent.cos.xml.model.object.UploadPartRequest, com.tencent.cos.xml.listener.CosXmlResultListener):void");
    }

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest) throws CosXmlClientException, CosXmlServiceException {
        int blockSizeInBytes = this.contentCryptoScheme.getBlockSizeInBytes();
        boolean isLastPart = uploadPartRequest.isLastPart();
        String uploadId = uploadPartRequest.getUploadId();
        boolean z4 = 0 == uploadPartRequest.getFileLength() % ((long) blockSizeInBytes);
        if (!isLastPart && !z4) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖷\u0001") + blockSizeInBytes + ProtectedSandApp.s("㖸\u0001"));
        }
        MultipartUploadCryptoContext multipartUploadCryptoContext = this.multipartUploadContexts.get(uploadId);
        if (multipartUploadCryptoContext == null) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖶\u0001") + uploadId);
        }
        multipartUploadCryptoContext.beginPartUpload(uploadPartRequest.getPartNumber());
        try {
            uploadPartRequest.setInputStream(newMultipartCOSCipherInputStream(uploadPartRequest, cipherLiteForNextPart(multipartUploadCryptoContext)));
            uploadPartRequest.setSrcPath(null);
            uploadPartRequest.setFileOffset(0L);
            if (isLastPart) {
                long computeLastPartSize = computeLastPartSize(uploadPartRequest);
                if (computeLastPartSize > -1) {
                    uploadPartRequest.setFileContentLength(computeLastPartSize);
                }
                if (multipartUploadCryptoContext.hasFinalPartBeenSeen()) {
                    throw CosXmlClientException.internalException(ProtectedSandApp.s("㖹\u0001"));
                }
            }
            UploadPartResult uploadPart = this.cos.uploadPart(uploadPartRequest);
            multipartUploadCryptoContext.endPartUpload();
            if (isLastPart) {
                multipartUploadCryptoContext.setHasFinalPartBeenSeen(true);
            }
            return uploadPart;
        } catch (Throwable th) {
            multipartUploadCryptoContext.endPartUpload();
            throw th;
        }
    }

    protected final PutObjectRequest wrapWithCipher(PutObjectRequest putObjectRequest, ContentCryptoMaterial contentCryptoMaterial) throws CosXmlClientException {
        ObjectMetadata metadata = putObjectRequest.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }
        String contentMD5 = metadata.getContentMD5();
        if (TextUtils.isEmpty(contentMD5)) {
            try {
                InputStream openInputStream = openInputStream(putObjectRequest);
                if (openInputStream != null) {
                    contentMD5 = DigestUtils.getCOSMd5(openInputStream, 0L, -1L);
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        if (contentMD5 != null) {
            metadata.addUserMetadata(ProtectedSandApp.s("㖰\u0001"), contentMD5);
        }
        metadata.setContentMD5(null);
        long plaintextLength = plaintextLength(putObjectRequest, metadata);
        if (plaintextLength >= 0) {
            metadata.addUserMetadata(ProtectedSandApp.s("㖱\u0001"), Long.toString(plaintextLength));
            metadata.setContentLength(ciphertextLength(plaintextLength));
        }
        putObjectRequest.setMetadata(metadata);
        putObjectRequest.setInputStream(newCOSCipherLiteInputStream(putObjectRequest, contentCryptoMaterial, plaintextLength));
        putObjectRequest.setSrcPath(null);
        return putObjectRequest;
    }

    private ContentCryptoMaterial newContentCryptoMaterial(EncryptionMaterialsProvider encryptionMaterialsProvider, Provider provider, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials();
        if (encryptionMaterials != null) {
            return buildContentCryptoMaterial(encryptionMaterials, provider, cosXmlRequest);
        }
        throw CosXmlClientException.internalException(ProtectedSandApp.s("㖯\u0001"));
    }

    static long[] getAdjustedCryptoRange(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long j4 = jArr[0];
        if (j4 > jArr[1]) {
            return null;
        }
        return new long[]{getCipherBlockLowerBound(j4), getCipherBlockUpperBound(jArr[1])};
    }

    public CipherLiteInputStream newCOSCipherLiteInputStream(PutObjectRequest putObjectRequest, CipherLite cipherLite) throws CosXmlClientException {
        try {
            InputStream openInputStream = openInputStream(putObjectRequest);
            if (cipherLite.markSupported()) {
                return new CipherLiteInputStream(openInputStream, cipherLite, 2048);
            }
            return new RenewableCipherLiteInputStream(openInputStream, cipherLite, 2048);
        } catch (Exception e4) {
            throw CosXmlClientException.internalException(ProtectedSandApp.s("㖮\u0001") + e4.getMessage());
        }
    }

    protected CryptoModuleBase(CosXmlSimpleService cosXmlSimpleService, QCloudCredentialProvider qCloudCredentialProvider, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this.kekMaterialsProvider = encryptionMaterialsProvider;
        this.cos = cosXmlSimpleService;
        COSCryptoScheme from = COSCryptoScheme.from();
        this.cryptoScheme = from;
        this.contentCryptoScheme = from.getContentCryptoScheme();
        this.kms = null;
    }
}
