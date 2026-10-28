package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosTrackService;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.ListPartsResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.model.tag.CallbackResult;
import com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult;
import com.tencent.cos.xml.model.tag.InitiateMultipartUpload;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.cos.xml.model.tag.UrlUploadPolicy;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.cos.xml.transfer.COSXMLTask;
import com.tencent.cos.xml.utils.CloseUtil;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudStringUtils;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class COSXMLUploadTask extends COSXMLTask {
    private static Executor executor = Executors.newSingleThreadExecutor();
    private AtomicLong ALREADY_SEND_DATA_LEN;
    private Object SYNC_UPLOAD_PART;
    private final String TAG;
    private AtomicInteger UPLOAD_PART_COUNT;
    private byte[] bytes;
    private String clientTraceId;
    private CompleteMultiUploadRequest completeMultiUploadRequest;
    private long fileLength;
    boolean forceSimpleUpload;
    private HeadObjectRequest headObjectRequest;
    HttpTaskMetrics httpTaskMetrics;
    private InitMultipartUploadRequest initMultipartUploadRequest;
    private InputStream inputStream;
    private boolean isSliceUpload;
    private ListPartsRequest listPartsRequest;
    protected long multiUploadSizeDivision;
    private MultiUploadsStateListener multiUploadsStateListenerHandler;
    private Map<Integer, SlicePartStruct> partStructMap;
    boolean priorityLow;
    private PutObjectRequest putObjectRequest;
    private AtomicBoolean sendingCompleteRequest;
    private long simpleAlreadySendDataLen;
    protected long sliceSize;
    String srcPath;
    private long startTime;
    private String uploadId;
    private Map<UploadPartRequest, Long> uploadPartRequestLongMap;
    private Uri uri;
    private URL url;
    private UrlUploadPolicy urlUploadPolicy;
    private WeightStrategy weightStrategy;

    /* renamed from: com.tencent.cos.xml.transfer.COSXMLUploadTask$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {
        final /* synthetic */ ArrayList val$allParts;
        final /* synthetic */ CosXmlResultListener val$cosXmlResultListener;
        final /* synthetic */ CosXmlSimpleService val$cosXmlService;
        final /* synthetic */ AtomicReference val$nextPartNumberMarker;

        AnonymousClass6(AtomicReference atomicReference, CosXmlSimpleService cosXmlSimpleService, ArrayList arrayList, CosXmlResultListener cosXmlResultListener) {
            this.val$nextPartNumberMarker = atomicReference;
            this.val$cosXmlService = cosXmlSimpleService;
            this.val$allParts = arrayList;
            this.val$cosXmlResultListener = cosXmlResultListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.val$nextPartNumberMarker.get() != null && !((String) this.val$nextPartNumberMarker.get()).isEmpty()) {
                COSXMLUploadTask.this.listPartsRequest.setPartNumberMarker((String) this.val$nextPartNumberMarker.get());
            }
            this.val$cosXmlService.listPartsAsync(COSXMLUploadTask.this.listPartsRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.6.1
                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                    AnonymousClass6.this.val$cosXmlResultListener.onFail(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }

                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                    ListPartsResult listPartsResult = (ListPartsResult) cosXmlResult;
                    List<ListParts.Part> list = listPartsResult.listParts.parts;
                    if (list != null && list.size() > 0) {
                        AnonymousClass6.this.val$allParts.addAll(listPartsResult.listParts.parts);
                    }
                    AnonymousClass6.this.val$nextPartNumberMarker.set(listPartsResult.listParts.nextPartNumberMarker);
                    if (AnonymousClass6.this.val$nextPartNumberMarker.get() != null && !((String) AnonymousClass6.this.val$nextPartNumberMarker.get()).isEmpty()) {
                        AnonymousClass6.this.run();
                        return;
                    }
                    ListParts listParts = listPartsResult.listParts;
                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                    listParts.parts = anonymousClass6.val$allParts;
                    anonymousClass6.val$cosXmlResultListener.onSuccess(cosXmlRequest, listPartsResult);
                }
            });
        }
    }

    public static class COSXMLUploadTaskRequest extends PutObjectRequest {
        protected COSXMLUploadTaskRequest(String str, String str2, String str3, String str4, Map<String, List<String>> map, Map<String, String> map2) {
            super(str2, str3, str4);
            setRegion(str);
            setRequestHeaders(map);
            setQueryParameters(map2);
        }
    }

    public static class COSXMLUploadTaskResult extends CosXmlResult {
        public CallbackResult callbackResult;
        public String eTag;
        public PicUploadResult picUploadResult;

        protected COSXMLUploadTaskResult() {
        }
    }

    private interface MultiUploadsStateListener {
        void onCompleted(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult);

        void onFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException);

        void onInit();

        void onListParts();

        void onUploadParts();
    }

    private static class SlicePartStruct {
        public String eTag;
        public boolean isAlreadyUpload;
        public long offset;
        public int partNumber;
        public long sliceSize;

        private SlicePartStruct() {
        }
    }

    private static class WeightStrategy {
        private final long DEFAULT_WEIGHT_HIGH_SIZE;
        private final long DEFAULT_WEIGHT_NORMAL_SIZE;
        private long highSize;
        private long normalSize;

        /* JADX INFO: Access modifiers changed from: private */
        public int getWeight(long j4) {
            if (j4 > this.highSize) {
                return 2;
            }
            return j4 > this.normalSize ? 1 : 0;
        }

        private WeightStrategy() {
            this.DEFAULT_WEIGHT_NORMAL_SIZE = 83886080L;
            this.DEFAULT_WEIGHT_HIGH_SIZE = 157286400L;
            this.normalSize = 83886080L;
            this.highSize = 157286400L;
        }
    }

    private COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3) {
        this.TAG = ProtectedSandApp.s("例\u0001");
        this.isSliceUpload = false;
        this.SYNC_UPLOAD_PART = new Object();
        this.startTime = 0L;
        this.simpleAlreadySendDataLen = 0L;
        this.priorityLow = false;
        this.sendingCompleteRequest = new AtomicBoolean(false);
        this.weightStrategy = new WeightStrategy();
        this.multiUploadsStateListenerHandler = new MultiUploadsStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.1
            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onCompleted(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                COSXMLUploadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onFailed(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                CosXmlClientException cosXmlClientException2 = cosXmlClientException == null ? cosXmlServiceException : cosXmlClientException;
                COSXMLUploadTask.this.reportException(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                COSXMLUploadTask.this.updateState(TransferState.FAILED, cosXmlClientException2, null, false);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onInit() {
                COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                cOSXMLUploadTask.multiUploadPart(cOSXMLUploadTask.cosXmlService);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onListParts() {
                COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                cOSXMLUploadTask.multiUploadPart(cOSXMLUploadTask.cosXmlService);
            }

            @Override // com.tencent.cos.xml.transfer.COSXMLUploadTask.MultiUploadsStateListener
            public void onUploadParts() {
                COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                cOSXMLUploadTask.completeMultiUpload(cOSXMLUploadTask.cosXmlService);
            }
        };
        this.cosXmlService = cosXmlSimpleService;
        this.region = str;
        this.bucket = str2;
        this.cosPath = str3;
        this.httpTaskMetrics = new HttpTaskMetrics();
    }

    private void abortMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        String str = this.uploadId;
        if (str == null) {
            return;
        }
        AbortMultiUploadRequest abortMultiUploadRequest = new AbortMultiUploadRequest(this.bucket, this.cosPath, str);
        abortMultiUploadRequest.setRegion(this.region);
        abortMultiUploadRequest.setCredentialProvider(this.credentialProvider);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            abortMultiUploadRequest.setSign(onSignatureListener.onGetSign(abortMultiUploadRequest));
        }
        abortMultiUploadRequest.setClientTraceId(this.clientTraceId);
        getHttpMetrics(abortMultiUploadRequest, ProtectedSandApp.s("侌\u0001"));
        cosXmlSimpleService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.14
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
            }
        });
    }

    private void clear() {
        Map<UploadPartRequest, Long> map = this.uploadPartRequestLongMap;
        if (map != null) {
            map.clear();
        }
        Map<Integer, SlicePartStruct> map2 = this.partStructMap;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        this.sendingCompleteRequest.set(true);
        CompleteMultiUploadRequest completeMultiUploadRequest = new CompleteMultiUploadRequest(this.bucket, this.cosPath, this.uploadId, null);
        this.completeMultiUploadRequest = completeMultiUploadRequest;
        completeMultiUploadRequest.setRegion(this.region);
        Iterator<Map.Entry<Integer, SlicePartStruct>> it = this.partStructMap.entrySet().iterator();
        while (it.hasNext()) {
            SlicePartStruct value = it.next().getValue();
            this.completeMultiUploadRequest.setPartNumberAndETag(value.partNumber, value.eTag);
        }
        this.completeMultiUploadRequest.setNeedMD5(this.isNeedMd5);
        this.completeMultiUploadRequest.setRequestHeaders(getCustomCompleteHeaders(this.headers));
        this.completeMultiUploadRequest.addNoSignHeader(this.noSignHeaders);
        this.completeMultiUploadRequest.setNetworkType(this.networkType);
        this.completeMultiUploadRequest.setHost(this.host);
        this.completeMultiUploadRequest.setCredentialProvider(this.credentialProvider);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            CompleteMultiUploadRequest completeMultiUploadRequest2 = this.completeMultiUploadRequest;
            completeMultiUploadRequest2.setSign(onSignatureListener.onGetSign(completeMultiUploadRequest2));
        }
        this.completeMultiUploadRequest.setClientTraceId(this.clientTraceId);
        getHttpMetrics(this.completeMultiUploadRequest, ProtectedSandApp.s("侍\u0001"));
        cosXmlSimpleService.completeMultiUploadAsync(this.completeMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.13
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(final CosXmlRequest cosXmlRequest, final CosXmlClientException cosXmlClientException, final CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest != COSXMLUploadTask.this.completeMultiUploadRequest) {
                    return;
                }
                if (cosXmlServiceException != null && ProtectedSandApp.s("侉\u0001").equals(cosXmlServiceException.getErrorCode())) {
                    COSXMLUploadTask.executor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.13.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HeadObjectResult headObjectToCheckCRC64 = COSXMLUploadTask.this.headObjectToCheckCRC64();
                            if (headObjectToCheckCRC64 != null) {
                                COSXMLUploadTask.this.onTransferComplete(cosXmlRequest, headObjectToCheckCRC64);
                            } else {
                                COSXMLUploadTask.this.encounterError(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                            }
                            COSXMLUploadTask.this.sendingCompleteRequest.set(false);
                        }
                    });
                } else {
                    COSXMLUploadTask.this.encounterError(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                    COSXMLUploadTask.this.sendingCompleteRequest.set(false);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest != COSXMLUploadTask.this.completeMultiUploadRequest) {
                    return;
                }
                COSXMLUploadTask.this.sendingCompleteRequest.set(false);
                COSXMLUploadTask.this.onTransferComplete(cosXmlRequest, cosXmlResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchInitMultipleUpload(InitiateMultipartUpload initiateMultipartUpload) {
        InitMultipleUploadListener initMultipleUploadListener = this.initMultipleUploadListener;
        if (initMultipleUploadListener != null) {
            initMultipleUploadListener.onSuccess(initiateMultipartUpload);
        }
        InitMultipleUploadListener initMultipleUploadListener2 = this.internalInitMultipleUploadListener;
        if (initMultipleUploadListener2 != null) {
            initMultipleUploadListener2.onSuccess(initiateMultipartUpload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchProgressChange(long j4, long j5) {
        CosXmlProgressListener cosXmlProgressListener = this.cosXmlProgressListener;
        if (cosXmlProgressListener != null) {
            cosXmlProgressListener.onProgress(j4, j5);
        }
        CosXmlProgressListener cosXmlProgressListener2 = this.internalProgressListener;
        if (cosXmlProgressListener2 != null) {
            cosXmlProgressListener2.onProgress(j4, j5);
        }
    }

    @q0
    private String getCRCValue(HeadObjectResult headObjectResult) {
        List<String> list = headObjectResult.headers.get(ProtectedSandApp.s("侎\u0001"));
        if (list == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }

    private String getContentTypeByHeaders(Map<String, List<String>> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        List<String> list = map.get(ProtectedSandApp.s("侏\u0001"));
        if (list == null || list.isEmpty()) {
            list = map.get(ProtectedSandApp.s("侐\u0001"));
        }
        if (list == null || list.isEmpty()) {
            list = map.get(ProtectedSandApp.s("侑\u0001"));
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private Map<String, List<String>> getCustomCompleteHeaders(@q0 Map<String, List<String>> map) {
        if (map == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(map);
        hashMap.remove(ProtectedSandApp.s("侏\u0001"));
        return hashMap;
    }

    private int getIndexOfParts(List<ListParts.Part> list) {
        if (Integer.valueOf(list.get(0).partNumber).intValue() != 1) {
            return -1;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 1;
        for (int i6 = 1; i6 < size; i6++) {
            ListParts.Part part = list.get(i6);
            if (Integer.valueOf(part.partNumber).intValue() != i5 + 1) {
                break;
            }
            i5 = Integer.valueOf(part.partNumber).intValue();
            i4 = i6;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q0
    public HeadObjectResult headObjectToCheckCRC64() {
        try {
            HeadObjectRequest headObjectRequest = new HeadObjectRequest(this.bucket, this.cosPath);
            this.headObjectRequest = headObjectRequest;
            headObjectRequest.setCredentialProvider(this.credentialProvider);
            this.headObjectRequest.setClientTraceId(this.clientTraceId);
            HeadObjectResult headObject = this.cosXmlService.headObject(this.headObjectRequest);
            long bigIntFromString = DigestUtils.getBigIntFromString(getCRCValue(headObject));
            InputStream openUploadFileStream = openUploadFileStream();
            long crc64 = DigestUtils.getCRC64(openUploadFileStream);
            openUploadFileStream.close();
            if (bigIntFromString == crc64) {
                return headObject;
            }
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private void initMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        String str;
        InitMultipartUploadRequest initMultipartUploadRequest = new InitMultipartUploadRequest(this.bucket, this.cosPath);
        this.initMultipartUploadRequest = initMultipartUploadRequest;
        initMultipartUploadRequest.setRegion(this.region);
        this.initMultipartUploadRequest.setRequestHeaders(this.headers);
        this.initMultipartUploadRequest.addNoSignHeader(this.noSignHeaders);
        this.initMultipartUploadRequest.setNetworkType(this.networkType);
        this.initMultipartUploadRequest.setHost(this.host);
        this.initMultipartUploadRequest.setCredentialProvider(this.credentialProvider);
        if (getContentTypeByHeaders(this.headers) == null) {
            URL url = this.url;
            if (url != null) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url.toString()));
            } else {
                String str2 = this.srcPath;
                if (str2 != null) {
                    str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(QCloudStringUtils.getExtension(str2));
                } else {
                    str = null;
                }
            }
            if (str != null) {
                try {
                    this.initMultipartUploadRequest.setRequestHeaders(ProtectedSandApp.s("侏\u0001"), str, false);
                } catch (CosXmlClientException unused) {
                }
            }
        }
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            InitMultipartUploadRequest initMultipartUploadRequest2 = this.initMultipartUploadRequest;
            initMultipartUploadRequest2.setSign(onSignatureListener.onGetSign(initMultipartUploadRequest2));
        }
        this.initMultipartUploadRequest.setClientTraceId(this.clientTraceId);
        this.httpTaskMetrics.setDomainName(this.initMultipartUploadRequest.getRequestHost(cosXmlSimpleService.getConfig()));
        getHttpMetrics(this.initMultipartUploadRequest, ProtectedSandApp.s("侒\u0001"));
        cosXmlSimpleService.initMultipartUploadAsync(this.initMultipartUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.5
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLUploadTask.this.initMultipartUploadRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.IS_EXIT.set(true);
                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLUploadTask.this.initMultipartUploadRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.onUpdateInProgress();
                    InitiateMultipartUpload initiateMultipartUpload = ((InitMultipartUploadResult) cosXmlResult).initMultipartUpload;
                    COSXMLUploadTask.this.uploadId = initiateMultipartUpload.uploadId;
                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onInit();
                    COSXMLUploadTask.this.dispatchInitMultipleUpload(initiateMultipartUpload);
                }
            }
        });
    }

    private void initSlicePart(long j4, long j5, int i4) {
        int i5 = (int) (j5 / this.sliceSize);
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            SlicePartStruct slicePartStruct = new SlicePartStruct();
            slicePartStruct.isAlreadyUpload = false;
            int i7 = i4 + i6;
            slicePartStruct.partNumber = i7;
            long j6 = this.sliceSize;
            slicePartStruct.offset = (i6 * j6) + j4;
            slicePartStruct.sliceSize = j6;
            this.partStructMap.put(Integer.valueOf(i7), slicePartStruct);
            i6++;
        }
        if (j5 % this.sliceSize != 0) {
            SlicePartStruct slicePartStruct2 = new SlicePartStruct();
            slicePartStruct2.isAlreadyUpload = false;
            int i10 = i4 + i5;
            slicePartStruct2.partNumber = i10;
            long j7 = (i5 * this.sliceSize) + j4;
            slicePartStruct2.offset = j7;
            slicePartStruct2.sliceSize = (j4 + j5) - j7;
            this.partStructMap.put(Integer.valueOf(i10), slicePartStruct2);
            i5++;
        }
        this.UPLOAD_PART_COUNT.set((i4 + i5) - 1);
        this.IS_EXIT.get();
    }

    private boolean isFixSliceSize(List<ListParts.Part> list) {
        for (ListParts.Part part : list) {
            if (this.partStructMap.containsKey(Integer.valueOf(part.partNumber)) && this.partStructMap.get(Integer.valueOf(part.partNumber)).sliceSize != Long.valueOf(part.size).longValue()) {
                return false;
            }
        }
        return true;
    }

    private void listMultiUpload(CosXmlSimpleService cosXmlSimpleService) {
        ListPartsRequest listPartsRequest = new ListPartsRequest(this.bucket, this.cosPath, this.uploadId);
        this.listPartsRequest = listPartsRequest;
        listPartsRequest.setRegion(this.region);
        this.listPartsRequest.setRequestHeaders(this.headers);
        this.listPartsRequest.addNoSignHeader(this.noSignHeaders);
        this.listPartsRequest.setNetworkType(this.networkType);
        this.listPartsRequest.setHost(this.host);
        this.listPartsRequest.setCredentialProvider(this.credentialProvider);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            ListPartsRequest listPartsRequest2 = this.listPartsRequest;
            listPartsRequest2.setSign(onSignatureListener.onGetSign(listPartsRequest2));
        }
        this.httpTaskMetrics.setDomainName(this.listPartsRequest.getRequestHost(cosXmlSimpleService.getConfig()));
        getHttpMetrics(this.listPartsRequest, ProtectedSandApp.s("侓\u0001"));
        this.listPartsRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.7
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i4) {
                if (COSXMLUploadTask.this.IS_EXIT.get()) {
                    return;
                }
                COSXMLUploadTask.this.onUpdateInProgress();
            }
        });
        this.listPartsRequest.setClientTraceId(this.clientTraceId);
        listAllPartsAsync(cosXmlSimpleService, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.8
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(final CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLUploadTask.this.listPartsRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    if (cosXmlServiceException != null && ProtectedSandApp.s("侊\u0001").equals(cosXmlServiceException.getErrorCode())) {
                        COSXMLUploadTask.executor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.8.2
                            @Override // java.lang.Runnable
                            public void run() {
                                HeadObjectResult headObjectToCheckCRC64 = COSXMLUploadTask.this.headObjectToCheckCRC64();
                                if (headObjectToCheckCRC64 != null) {
                                    COSXMLUploadTask.this.onTransferComplete(cosXmlRequest, headObjectToCheckCRC64);
                                } else {
                                    if (COSXMLUploadTask.this.IS_EXIT.get()) {
                                        return;
                                    }
                                    COSXMLUploadTask.this.reTrans();
                                }
                            }
                        });
                    } else {
                        COSXMLUploadTask.this.IS_EXIT.set(true);
                        COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                    }
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, final CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLUploadTask.this.listPartsRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    if (COSXMLUploadTask.this.url == null) {
                        COSXMLUploadTask.executor.execute(new Runnable() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.8.1
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v15, types: [com.tencent.cos.xml.exception.CosXmlClientException, java.lang.Throwable] */
                            /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.cos.xml.exception.CosXmlClientException, java.lang.Throwable] */
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z4;
                                InputStream inputStream = null;
                                inputStream = null;
                                try {
                                    try {
                                        inputStream = COSXMLUploadTask.this.openUploadFileStream();
                                        z4 = COSXMLUploadTask.this.verifyUploadParts(((ListPartsResult) cosXmlResult).listParts, inputStream);
                                        inputStream = inputStream;
                                        if (inputStream != null) {
                                            try {
                                                CloseUtil.closeQuietly(inputStream);
                                                inputStream = inputStream;
                                            } catch (CosXmlClientException e4) {
                                                e4.printStackTrace();
                                                inputStream = e4;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (inputStream != null) {
                                            try {
                                                CloseUtil.closeQuietly(inputStream);
                                            } catch (CosXmlClientException e5) {
                                                e5.printStackTrace();
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                    InputStream inputStream2 = inputStream;
                                    if (inputStream != null) {
                                        try {
                                            CloseUtil.closeQuietly(inputStream);
                                            inputStream2 = inputStream;
                                        } catch (CosXmlClientException e7) {
                                            e7.printStackTrace();
                                            inputStream2 = e7;
                                        }
                                    }
                                    z4 = false;
                                    inputStream = inputStream2;
                                }
                                if (!z4) {
                                    COSXMLUploadTask.this.reTrans();
                                } else {
                                    COSXMLUploadTask.this.updateSlicePart((ListPartsResult) cosXmlResult);
                                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onListParts();
                                }
                            }
                        });
                    } else {
                        COSXMLUploadTask.this.updateSlicePart((ListPartsResult) cosXmlResult);
                        COSXMLUploadTask.this.multiUploadsStateListenerHandler.onListParts();
                    }
                }
            }
        });
    }

    private void multiUpload(CosXmlSimpleService cosXmlSimpleService) {
        initSlicePart(0L, this.fileLength, 1);
        if (TextUtils.isEmpty(this.uploadId)) {
            initMultiUpload(cosXmlSimpleService);
        } else {
            listMultiUpload(cosXmlSimpleService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void multiUploadPart(CosXmlSimpleService cosXmlSimpleService) {
        Iterator<Map.Entry<Integer, SlicePartStruct>> it = this.partStructMap.entrySet().iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            final SlicePartStruct value = it.next().getValue();
            if (!value.isAlreadyUpload && !this.IS_EXIT.get()) {
                String str = this.srcPath;
                final UploadPartRequest uploadPartRequest = str != null ? new UploadPartRequest(this.bucket, this.cosPath, value.partNumber, str, value.offset, value.sliceSize, this.uploadId) : null;
                Uri uri = this.uri;
                if (uri != null) {
                    uploadPartRequest = new UploadPartRequest(this.bucket, this.cosPath, value.partNumber, uri, value.offset, value.sliceSize, this.uploadId);
                }
                URL url = this.url;
                if (url != null) {
                    uploadPartRequest = new UploadPartRequest(this.bucket, this.cosPath, value.partNumber, url, value.offset, value.sliceSize, this.uploadId);
                }
                if (this.priorityLow) {
                    uploadPartRequest.setPriorityLow();
                }
                uploadPartRequest.setRegion(this.region);
                if (this.url == null) {
                    uploadPartRequest.setNeedMD5(this.isNeedMd5);
                } else {
                    uploadPartRequest.setNeedMD5(false);
                }
                uploadPartRequest.setRequestHeaders(this.headers);
                uploadPartRequest.addNoSignHeader(this.noSignHeaders);
                uploadPartRequest.setNetworkType(this.networkType);
                uploadPartRequest.setHost(this.host);
                uploadPartRequest.setCredentialProvider(this.credentialProvider);
                uploadPartRequest.setOnRequestWeightListener(new CosXmlRequest.OnRequestWeightListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.10
                    @Override // com.tencent.cos.xml.model.CosXmlRequest.OnRequestWeightListener
                    public int onWeight() {
                        return COSXMLUploadTask.this.weightStrategy.getWeight(COSXMLUploadTask.this.ALREADY_SEND_DATA_LEN.get());
                    }
                });
                COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
                if (onSignatureListener != null) {
                    uploadPartRequest.setSign(onSignatureListener.onGetSign(uploadPartRequest));
                }
                getHttpMetrics(uploadPartRequest, ProtectedSandApp.s("侔\u0001"));
                this.uploadPartRequestLongMap.put(uploadPartRequest, 0L);
                uploadPartRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.11
                    @Override // com.tencent.qcloud.core.common.QCloudProgressListener
                    public void onProgress(long j4, long j5) {
                        if (COSXMLUploadTask.this.IS_EXIT.get()) {
                            return;
                        }
                        try {
                            long addAndGet = COSXMLUploadTask.this.ALREADY_SEND_DATA_LEN.addAndGet(j4 - ((Long) COSXMLUploadTask.this.uploadPartRequestLongMap.get(uploadPartRequest)).longValue());
                            COSXMLUploadTask.this.uploadPartRequestLongMap.put(uploadPartRequest, Long.valueOf(j4));
                            COSXMLUploadTask cOSXMLUploadTask = COSXMLUploadTask.this;
                            cOSXMLUploadTask.dispatchProgressChange(addAndGet, cOSXMLUploadTask.fileLength);
                        } catch (Exception unused) {
                        }
                    }
                });
                uploadPartRequest.setClientTraceId(this.clientTraceId);
                cosXmlSimpleService.uploadPartAsync(uploadPartRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.12
                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                        if (cosXmlRequest == uploadPartRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                            COSXMLUploadTask.this.IS_EXIT.set(true);
                            COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                        }
                    }

                    @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                    public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                        if (cosXmlRequest != uploadPartRequest) {
                            return;
                        }
                        COSXMLUploadTask.this.httpTaskMetrics.merge(cosXmlRequest.getMetrics());
                        if (COSXMLUploadTask.this.IS_EXIT.get()) {
                            return;
                        }
                        SlicePartStruct slicePartStruct = value;
                        slicePartStruct.eTag = ((UploadPartResult) cosXmlResult).eTag;
                        slicePartStruct.isAlreadyUpload = true;
                        synchronized (COSXMLUploadTask.this.SYNC_UPLOAD_PART) {
                            try {
                                COSXMLUploadTask.this.UPLOAD_PART_COUNT.decrementAndGet();
                                if (COSXMLUploadTask.this.UPLOAD_PART_COUNT.get() == 0) {
                                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onUploadParts();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                z4 = false;
            }
        }
        if (!z4 || this.IS_EXIT.get()) {
            return;
        }
        long j4 = this.fileLength;
        dispatchProgressChange(j4, j4);
        this.multiUploadsStateListenerHandler.onUploadParts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTransferComplete(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
        cosXmlRequest.attachMetrics(this.httpTaskMetrics);
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        CosTrackService.getInstance().reportUploadTaskSuccess(cosXmlRequest, getCosXmlServiceConfigTrackParams());
        this.multiUploadsStateListenerHandler.onCompleted(cosXmlRequest, cosXmlResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUpdateInProgress() {
        updateState(TransferState.IN_PROGRESS, null, null, false);
        Timer timer = this.waitTimeoutTimer;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream openUploadFileStream() throws IOException {
        if (this.srcPath != null) {
            return new FileInputStream(this.srcPath);
        }
        if (this.uri == null) {
            throw new IOException(ProtectedSandApp.s("侖\u0001"));
        }
        if (ContextHolder.getAppContext() != null) {
            return ContextHolder.getAppContext().getContentResolver().openInputStream(this.uri);
        }
        throw new IOException(ProtectedSandApp.s("侕\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reTrans() {
        this.uploadId = null;
        startUpload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportException(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (cosXmlRequest == null) {
            cosXmlRequest = buildCOSXMLTaskRequest();
        }
        if (cosXmlClientException != null) {
            CosTrackService.getInstance().reportUploadTaskClientException(cosXmlRequest, cosXmlClientException, getCosXmlServiceConfigTrackParams());
        }
        if (cosXmlServiceException != null) {
            CosTrackService.getInstance().reportUploadTaskServiceException(cosXmlRequest, cosXmlServiceException, getCosXmlServiceConfigTrackParams());
        }
    }

    private void simpleUpload(CosXmlSimpleService cosXmlSimpleService) {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, bArr);
        } else {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, inputStream);
            } else {
                Uri uri = this.uri;
                if (uri != null) {
                    this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, uri);
                } else {
                    URL url = this.url;
                    if (url != null) {
                        this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, url);
                    } else {
                        this.putObjectRequest = new PutObjectRequest(this.bucket, this.cosPath, this.srcPath);
                    }
                }
            }
        }
        this.putObjectRequest.setRegion(this.region);
        if (this.url != null) {
            this.putObjectRequest.setNeedMD5(false);
        } else {
            this.putObjectRequest.setNeedMD5(this.isNeedMd5);
        }
        this.putObjectRequest.setRequestHeaders(this.headers);
        this.putObjectRequest.addNoSignHeader(this.noSignHeaders);
        this.putObjectRequest.setNetworkType(this.networkType);
        this.putObjectRequest.setHost(this.host);
        this.putObjectRequest.setCredentialProvider(this.credentialProvider);
        COSXMLTask.OnSignatureListener onSignatureListener = this.onSignatureListener;
        if (onSignatureListener != null) {
            PutObjectRequest putObjectRequest = this.putObjectRequest;
            putObjectRequest.setSign(onSignatureListener.onGetSign(putObjectRequest));
        }
        getHttpMetrics(this.putObjectRequest, ProtectedSandApp.s("侗\u0001"));
        this.putObjectRequest.setTaskStateListener(new QCloudTaskStateListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.2
            @Override // com.tencent.qcloud.core.common.QCloudTaskStateListener
            public void onStateChanged(String str, int i4) {
                if (COSXMLUploadTask.this.IS_EXIT.get()) {
                    return;
                }
                if (i4 == 2 || i4 == 3) {
                    COSXMLUploadTask.this.onUpdateInProgress();
                }
            }
        });
        this.putObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.3
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j4, long j5) {
                COSXMLUploadTask.this.simpleAlreadySendDataLen = j4;
                COSXMLUploadTask.this.dispatchProgressChange(j4, j5);
            }
        });
        if (this.priorityLow) {
            this.putObjectRequest.setPriorityLow();
        }
        this.putObjectRequest.setClientTraceId(this.clientTraceId);
        cosXmlSimpleService.internalPutObjectAsync(this.putObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.4
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlRequest == COSXMLUploadTask.this.putObjectRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.IS_EXIT.set(true);
                    COSXMLUploadTask.this.multiUploadsStateListenerHandler.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                if (cosXmlRequest == COSXMLUploadTask.this.putObjectRequest && !COSXMLUploadTask.this.IS_EXIT.get()) {
                    COSXMLUploadTask.this.IS_EXIT.set(true);
                    CosTrackService.getInstance().reportUploadTaskSuccess(cosXmlRequest, COSXMLUploadTask.this.getCosXmlServiceConfigTrackParams());
                    COSXMLUploadTask.this.updateState(TransferState.COMPLETED, null, cosXmlResult, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSlicePart(ListPartsResult listPartsResult) {
        ListParts listParts;
        List<ListParts.Part> list;
        if (listPartsResult == null || (listParts = listPartsResult.listParts) == null || (list = listParts.parts) == null || list.size() <= 0) {
            return;
        }
        if (isFixSliceSize(list)) {
            for (ListParts.Part part : list) {
                if (this.partStructMap.containsKey(Integer.valueOf(part.partNumber))) {
                    SlicePartStruct slicePartStruct = this.partStructMap.get(Integer.valueOf(part.partNumber));
                    slicePartStruct.isAlreadyUpload = true;
                    slicePartStruct.eTag = part.eTag;
                    this.UPLOAD_PART_COUNT.decrementAndGet();
                    this.ALREADY_SEND_DATA_LEN.addAndGet(Long.parseLong(part.size));
                }
            }
            return;
        }
        Collections.sort(list, new Comparator<ListParts.Part>() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.15
            @Override // java.util.Comparator
            public int compare(ListParts.Part part2, ListParts.Part part3) {
                int intValue = Integer.valueOf(part2.partNumber).intValue();
                int intValue2 = Integer.valueOf(part3.partNumber).intValue();
                if (intValue > intValue2) {
                    return 1;
                }
                return intValue < intValue2 ? -1 : 0;
            }
        });
        int indexOfParts = getIndexOfParts(list);
        if (indexOfParts < 0) {
            return;
        }
        this.partStructMap.clear();
        long j4 = 0;
        int i4 = 0;
        while (i4 <= indexOfParts) {
            ListParts.Part part2 = list.get(i4);
            SlicePartStruct slicePartStruct2 = new SlicePartStruct();
            i4++;
            slicePartStruct2.partNumber = i4;
            slicePartStruct2.offset = j4;
            long parseLong = Long.parseLong(part2.size);
            slicePartStruct2.sliceSize = parseLong;
            slicePartStruct2.eTag = part2.eTag;
            slicePartStruct2.isAlreadyUpload = true;
            j4 += parseLong;
            this.partStructMap.put(Integer.valueOf(i4), slicePartStruct2);
        }
        this.ALREADY_SEND_DATA_LEN.addAndGet(j4);
        initSlicePart(j4, this.fileLength - j4, indexOfParts + 2);
        for (int i5 = 0; i5 <= indexOfParts; i5++) {
            this.UPLOAD_PART_COUNT.decrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean verifyUploadParts(ListParts listParts, InputStream inputStream) throws IOException {
        List<ListParts.Part> list = listParts.parts;
        Collections.sort(list, new Comparator<ListParts.Part>() { // from class: com.tencent.cos.xml.transfer.COSXMLUploadTask.9
            @Override // java.util.Comparator
            public int compare(ListParts.Part part, ListParts.Part part2) {
                int intValue = Integer.valueOf(part.partNumber).intValue();
                int intValue2 = Integer.valueOf(part2.partNumber).intValue();
                if (intValue > intValue2) {
                    return 1;
                }
                return intValue < intValue2 ? -1 : 0;
            }
        });
        boolean isFixSliceSize = isFixSliceSize(list);
        boolean z4 = true;
        int i4 = 0;
        for (ListParts.Part part : list) {
            int parseInt = Integer.parseInt(part.partNumber);
            z4 = z4 && i4 + 1 == parseInt;
            if (!isFixSliceSize && !z4) {
                return true;
            }
            String cOSMd5 = DigestUtils.getCOSMd5(inputStream, ((parseInt - i4) - 1) * this.sliceSize, Long.parseLong(part.size));
            if (!part.eTag.equals(cOSMd5)) {
                COSLogger.iProcess(ProtectedSandApp.s("例\u0001"), ProtectedSandApp.s("侘\u0001") + part.partNumber + ProtectedSandApp.s("侙\u0001") + part.eTag + ProtectedSandApp.s("侚\u0001") + cOSMd5);
                return false;
            }
            i4 = parseInt;
        }
        return true;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlRequest buildCOSXMLTaskRequest() {
        return new COSXMLUploadTaskRequest(this.region, this.bucket, this.cosPath, this.srcPath, this.headers, this.queries);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected CosXmlResult buildCOSXMLTaskResult(CosXmlResult cosXmlResult) {
        COSXMLUploadTaskResult cOSXMLUploadTaskResult = new COSXMLUploadTaskResult();
        if (cosXmlResult != null) {
            cOSXMLUploadTaskResult.httpCode = cosXmlResult.httpCode;
            cOSXMLUploadTaskResult.httpMessage = cosXmlResult.httpMessage;
            cOSXMLUploadTaskResult.headers = cosXmlResult.headers;
            cOSXMLUploadTaskResult.accessUrl = cosXmlResult.accessUrl;
        }
        if (cosXmlResult instanceof PutObjectResult) {
            PutObjectResult putObjectResult = (PutObjectResult) cosXmlResult;
            cOSXMLUploadTaskResult.eTag = putObjectResult.eTag;
            cOSXMLUploadTaskResult.picUploadResult = putObjectResult.picUploadResult();
            cOSXMLUploadTaskResult.callbackResult = putObjectResult.callbackResult;
        } else if (cosXmlResult instanceof CompleteMultiUploadResult) {
            CompleteMultiUploadResult completeMultiUploadResult = (CompleteMultiUploadResult) cosXmlResult;
            CompleteMultipartUploadResult completeMultipartUploadResult = completeMultiUploadResult.completeMultipartUpload;
            if (completeMultipartUploadResult != null) {
                cOSXMLUploadTaskResult.eTag = completeMultipartUploadResult.eTag;
                PicUploadResult picUploadResult = new PicUploadResult();
                picUploadResult.originalInfo = completeMultiUploadResult.completeMultipartUpload.getOriginInfo();
                CompleteMultipartUploadResult completeMultipartUploadResult2 = completeMultiUploadResult.completeMultipartUpload;
                picUploadResult.processResults = completeMultipartUploadResult2.processResults;
                cOSXMLUploadTaskResult.picUploadResult = picUploadResult;
                cOSXMLUploadTaskResult.callbackResult = completeMultipartUploadResult2.callbackResult;
            }
        } else if (cosXmlResult instanceof HeadObjectResult) {
            cOSXMLUploadTaskResult.eTag = ((HeadObjectResult) cosXmlResult).eTag;
        }
        return cOSXMLUploadTaskResult;
    }

    void cancelAllRequest(CosXmlSimpleService cosXmlSimpleService, boolean z4) {
        HeadObjectRequest headObjectRequest = this.headObjectRequest;
        if (headObjectRequest != null) {
            cosXmlSimpleService.cancel(headObjectRequest, z4);
        }
        PutObjectRequest putObjectRequest = this.putObjectRequest;
        if (putObjectRequest != null) {
            cosXmlSimpleService.cancel(putObjectRequest, z4);
        }
        InitMultipartUploadRequest initMultipartUploadRequest = this.initMultipartUploadRequest;
        if (initMultipartUploadRequest != null) {
            cosXmlSimpleService.cancel(initMultipartUploadRequest, z4);
        }
        ListPartsRequest listPartsRequest = this.listPartsRequest;
        if (listPartsRequest != null) {
            cosXmlSimpleService.cancel(listPartsRequest, z4);
        }
        Map<UploadPartRequest, Long> map = this.uploadPartRequestLongMap;
        if (map != null) {
            Iterator<UploadPartRequest> it = map.keySet().iterator();
            while (it.hasNext()) {
                cosXmlSimpleService.cancel(it.next(), z4);
            }
        }
        CompleteMultiUploadRequest completeMultiUploadRequest = this.completeMultiUploadRequest;
        if (completeMultiUploadRequest != null) {
            cosXmlSimpleService.cancel(completeMultiUploadRequest, z4);
        }
    }

    protected boolean checkParameter() {
        UrlUploadPolicy urlUploadPolicy;
        Context appContext;
        if (this.bytes == null && this.inputStream == null && this.srcPath == null && this.uri == null && this.url == null) {
            if (this.IS_EXIT.get()) {
                return false;
            }
            this.IS_EXIT.set(true);
            this.multiUploadsStateListenerHandler.onFailed(new PutObjectRequest(this.bucket, this.cosPath, ""), new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("供\u0001")), null);
            return false;
        }
        if (this.srcPath != null) {
            File file = new File(this.srcPath);
            if (!file.exists() || file.isDirectory() || !file.canRead()) {
                if (this.IS_EXIT.get()) {
                    return false;
                }
                this.IS_EXIT.set(true);
                this.multiUploadsStateListenerHandler.onFailed(new PutObjectRequest(this.bucket, this.cosPath, this.srcPath), new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("侜\u0001") + this.srcPath), null);
                return false;
            }
            this.fileLength = file.length();
        }
        if (this.uri != null && (appContext = ContextHolder.getAppContext()) != null) {
            this.fileLength = QCloudUtils.getUriContentLength(this.uri, appContext.getContentResolver());
        }
        if (this.url != null && (urlUploadPolicy = this.urlUploadPolicy) != null) {
            if (urlUploadPolicy.getDownloadType() == UrlUploadPolicy.Type.NOTSUPPORT) {
                if (this.IS_EXIT.get()) {
                    return false;
                }
                COSXMLTask.monitor.sendStateMessage(this, TransferState.FAILED, new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("依\u0001")), null, 1);
                this.IS_EXIT.set(true);
                return false;
            }
            this.fileLength = this.urlUploadPolicy.getFileLength();
        }
        return true;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void encounterError(@q0 CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        if (this.IS_EXIT.get()) {
            return;
        }
        this.IS_EXIT.set(true);
        MultiUploadsStateListener multiUploadsStateListener = this.multiUploadsStateListenerHandler;
        if (cosXmlRequest == null) {
            cosXmlRequest = buildCOSXMLTaskRequest();
        }
        multiUploadsStateListener.onFailed(cosXmlRequest, cosXmlClientException, cosXmlServiceException);
    }

    public boolean getSendingCompleteRequest() {
        return this.sendingCompleteRequest.get();
    }

    public String getUploadId() {
        return this.uploadId;
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCancel(boolean z4) {
        cancelAllRequest(this.cosXmlService, z4);
        if (this.isSliceUpload) {
            abortMultiUpload(this.cosXmlService);
        }
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalCompleted() {
        clear();
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalFailed() {
        cancelAllRequest(this.cosXmlService, false);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalPause(boolean z4) {
        CosXmlRequest buildCOSXMLTaskRequest = buildCOSXMLTaskRequest();
        buildCOSXMLTaskRequest.attachMetrics(this.httpTaskMetrics);
        CosTrackService.getInstance().reportUploadTaskSuccess(buildCOSXMLTaskRequest, getCosXmlServiceConfigTrackParams());
        cancelAllRequest(this.cosXmlService, z4);
    }

    @Override // com.tencent.cos.xml.transfer.COSXMLTask
    protected void internalResume() {
        this.taskState = TransferState.WAITING;
        this.IS_EXIT.set(false);
        if (this.inputStream == null) {
            upload();
        } else {
            this.IS_EXIT.set(true);
            this.multiUploadsStateListenerHandler.onFailed(buildCOSXMLTaskRequest(), new CosXmlClientException(ClientErrorCode.SINK_SOURCE_NOT_FOUND.getCode(), ProtectedSandApp.s("侞\u0001")), null);
        }
    }

    public void listAllPartsAsync(CosXmlSimpleService cosXmlSimpleService, CosXmlResultListener cosXmlResultListener) {
        new AnonymousClass6(new AtomicReference(null), cosXmlSimpleService, new ArrayList(), cosXmlResultListener).run();
    }

    public boolean pauseSafely() {
        if (this.sendingCompleteRequest.get()) {
            return false;
        }
        pause();
        return true;
    }

    public void setUploadId(String str) {
        this.uploadId = str;
    }

    protected void startUpload() {
        if (this.bytes != null || this.inputStream != null) {
            simpleUpload(this.cosXmlService);
            return;
        }
        long j4 = this.fileLength;
        if (j4 < this.multiUploadSizeDivision || this.forceSimpleUpload) {
            simpleUpload(this.cosXmlService);
            return;
        }
        long j5 = this.sliceSize;
        if (Math.ceil(j4 / j5) > 10000.0d) {
            this.sliceSize = (long) Math.ceil(this.fileLength / 10000.0d);
        } else {
            this.sliceSize = j5;
        }
        this.isSliceUpload = true;
        this.UPLOAD_PART_COUNT = new AtomicInteger(0);
        this.ALREADY_SEND_DATA_LEN = new AtomicLong(0L);
        this.partStructMap = new LinkedHashMap();
        this.uploadPartRequestLongMap = new LinkedHashMap();
        multiUpload(this.cosXmlService);
    }

    protected void upload() {
        if (checkParameter()) {
            this.startTime = System.nanoTime();
            this.clientTraceId = UUID.randomUUID().toString();
            startUpload();
        }
    }

    public boolean pauseSafely(boolean z4) {
        if (this.sendingCompleteRequest.get()) {
            return false;
        }
        pause(z4);
        return true;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, String str4, String str5) {
        this(cosXmlSimpleService, str, str2, str3);
        this.srcPath = str4;
        this.uploadId = str5;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, Uri uri, String str4) {
        this(cosXmlSimpleService, str, str2, str3);
        this.uri = uri;
        this.uploadId = str4;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, URL url, UrlUploadPolicy urlUploadPolicy, String str4) {
        this(cosXmlSimpleService, str, str2, str3);
        this.url = url;
        this.urlUploadPolicy = urlUploadPolicy;
        this.uploadId = str4;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, URL url, String str4) {
        this(cosXmlSimpleService, str, str2, str3);
        this.url = url;
        this.uploadId = str4;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, byte[] bArr) {
        this(cosXmlSimpleService, str, str2, str3);
        this.bytes = bArr;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, String str, String str2, String str3, InputStream inputStream) {
        this(cosXmlSimpleService, str, str2, str3);
        this.inputStream = inputStream;
    }

    COSXMLUploadTask(CosXmlSimpleService cosXmlSimpleService, PutObjectRequest putObjectRequest, String str) {
        this(cosXmlSimpleService, putObjectRequest.getRegion(), putObjectRequest.getBucket(), putObjectRequest.getPath(cosXmlSimpleService.getConfig()));
        this.uri = putObjectRequest.getUri();
        this.url = putObjectRequest.getUrl();
        this.urlUploadPolicy = putObjectRequest.getUrlUploadPolicy();
        this.srcPath = putObjectRequest.getSrcPath();
        this.bytes = putObjectRequest.getData();
        this.inputStream = putObjectRequest.getInputStream();
        this.queries = putObjectRequest.getQueryString();
        this.headers = putObjectRequest.getRequestHeaders();
        this.noSignHeaders = putObjectRequest.getNoSignHeaders();
        this.isNeedMd5 = putObjectRequest.isNeedMD5();
        this.networkType = putObjectRequest.getNetworkType();
        this.host = putObjectRequest.getHost();
        this.credentialProvider = putObjectRequest.getCredentialProvider();
        this.uploadId = str;
        this.priorityLow = putObjectRequest.isPriorityLow();
    }
}
