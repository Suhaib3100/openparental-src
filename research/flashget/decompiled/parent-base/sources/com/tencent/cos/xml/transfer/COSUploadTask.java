package com.tencent.cos.xml.transfer;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.compose.runtime.changelist.j;
import bolts.h;
import bolts.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.COSDirect;
import com.tencent.cos.xml.crypto.MultipartUploadCryptoContext;
import com.tencent.cos.xml.crypto.ObjectMetadata;
import com.tencent.cos.xml.crypto.ResettableInputStream;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsRequest;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult;
import com.tencent.cos.xml.model.tag.ListMultipartUploads;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.cos.xml.transfer.COSTransferTask;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class COSUploadTask extends COSTransferTask {
    private static final int UPLOAD_CONCURRENT = 2;
    private boolean mForceSimpleUpload;
    private long mMaxPartSize;
    private PutObjectRequest mPutObjectRequest;
    private long multipartUploadThreshold;
    private long uploadLength;
    private BaseUploadTask uploadTask;
    private boolean verifyCRC64;
    public static final String TAG = ProtectedSandApp.s("伲\u0001");
    private static ThreadPoolExecutor uploadTaskExecutor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(Integer.MAX_VALUE), new COSTransferTask.TaskThreadFactory(ProtectedSandApp.s("伳\u0001"), 8));

    static abstract class BaseUploadTask {
        protected COSDirect cosDirect;
        protected TransferTaskMetrics mTransferMetrics;
        protected bolts.e mTransferTaskCts;
        protected PutObjectRequest putObjectRequest;
        protected String taskId;
        protected i<CosXmlResult> tcs = new i<>();
        protected long totalUploadSize;

        BaseUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, bolts.e eVar, long j4) {
            this.cosDirect = cOSDirect;
            this.putObjectRequest = putObjectRequest;
            this.mTransferTaskCts = eVar;
            this.totalUploadSize = j4;
        }

        public abstract void cancel();

        public abstract void cancel(boolean z4);

        public h<CosXmlResult> getTask() {
            return this.tcs.a();
        }

        public void setTaskId(String str) {
            this.taskId = str;
        }

        protected abstract CosXmlResult upload(PutObjectRequest putObjectRequest) throws Exception;
    }

    private static class SimpleUploadTask extends BaseUploadTask {
        SimpleUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, bolts.e eVar, long j4) {
            super(cOSDirect, putObjectRequest, eVar, j4);
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void cancel() {
            this.cosDirect.cancel(this.putObjectRequest);
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void cancel(boolean z4) {
            this.cosDirect.cancel(this.putObjectRequest, z4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public PutObjectResult upload(PutObjectRequest putObjectRequest) throws Exception {
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.mTransferMetrics.size = this.totalUploadSize;
            putObjectRequest.attachMetrics(httpTaskMetrics);
            PutObjectResult putObject = this.cosDirect.putObject(putObjectRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            COSTransferTask.loggerInfo(ProtectedSandApp.s("估\u0001"), this.taskId, ProtectedSandApp.s("伱\u0001"), new Object[0]);
            return putObject;
        }
    }

    static final class UploadPart {
        String etag;
        int number;
        long offset;
        long size;

        public UploadPart(String str, int i4, long j4, long j5) {
            this.etag = str;
            this.number = i4;
            this.offset = j4;
            this.size = j5;
        }
    }

    public COSUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest) {
        super(cOSDirect, putObjectRequest);
        this.multipartUploadThreshold = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        this.mMaxPartSize = 1048576L;
        this.verifyCRC64 = true;
        this.mForceSimpleUpload = false;
        this.uploadLength = -1L;
        this.mPutObjectRequest = putObjectRequest;
    }

    private PutObjectResult buildPutObjectResult(CompleteMultiUploadResult completeMultiUploadResult) {
        PutObjectResult putObjectResult = new PutObjectResult();
        putObjectResult.httpCode = completeMultiUploadResult.httpCode;
        putObjectResult.httpMessage = completeMultiUploadResult.httpMessage;
        putObjectResult.headers = completeMultiUploadResult.headers;
        putObjectResult.accessUrl = completeMultiUploadResult.accessUrl;
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultiUploadResult.completeMultipartUpload;
        putObjectResult.eTag = completeMultipartUploadResult.eTag;
        putObjectResult.picUploadResult = completeMultipartUploadResult.getPicUploadResult();
        return putObjectResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getUploadLength() {
        return this.uploadLength;
    }

    private boolean isMultipartUploadLength() {
        return this.uploadLength >= this.multipartUploadThreshold;
    }

    private boolean isMultipartUploadRequest() {
        return (this.mPutObjectRequest.getSrcPath() == null && this.mPutObjectRequest.getUri() == null) ? false : true;
    }

    private boolean shouldMultipartUpload() {
        return !this.mForceSimpleUpload && isMultipartUploadRequest() && isMultipartUploadLength();
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void cancel() {
        super.cancel();
        BaseUploadTask baseUploadTask = this.uploadTask;
        if (baseUploadTask != null) {
            baseUploadTask.cancel();
        }
        BaseUploadTask baseUploadTask2 = this.uploadTask;
        if (baseUploadTask2 instanceof MultipartUploadTask) {
            ((MultipartUploadTask) baseUploadTask2).abort();
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected void checking() throws CosXmlClientException {
        super.checking();
        this.mPutObjectRequest.setProgressListener(new CosXmlProgressListener() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j4, long j5) {
                COSUploadTask cOSUploadTask = COSUploadTask.this;
                cOSUploadTask.onTransferProgressChange(j4, cOSUploadTask.getUploadLength());
            }
        });
        byte[] data = this.mPutObjectRequest.getData();
        this.mPutObjectRequest.getInputStream();
        String srcPath = this.mPutObjectRequest.getSrcPath();
        Uri uri = this.mPutObjectRequest.getUri();
        this.mPutObjectRequest.getUrl();
        String strData = this.mPutObjectRequest.getStrData();
        this.mPutObjectRequest.getUrlUploadPolicy();
        if (TextUtils.isEmpty(srcPath) && uri == null && data == null && strData == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("伴\u0001"));
        }
        if (!TextUtils.isEmpty(srcPath)) {
            File file = new File(srcPath);
            if (!file.exists()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), j.a(srcPath, ProtectedSandApp.s("伸\u0001")));
            }
            if (file.isDirectory()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), j.a(srcPath, ProtectedSandApp.s("伷\u0001")));
            }
            if (!file.canRead()) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), android.support.v4.media.d.a(ProtectedSandApp.s("伵\u0001"), srcPath, ProtectedSandApp.s("伶\u0001")));
            }
            this.uploadLength = file.length();
        } else if (uri != null) {
            Context appContext = ContextHolder.getAppContext();
            if (appContext != null) {
                if (!QCloudUtils.doesUriFileExist(uri, appContext.getContentResolver())) {
                    throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("伹\u0001") + uri + ProtectedSandApp.s("伺\u0001"));
                }
                this.uploadLength = QCloudUtils.getUriContentLength(uri, appContext.getContentResolver());
            }
        } else if (data != null) {
            this.uploadLength = data.length;
        } else if (strData != null) {
            this.uploadLength = strData.getBytes().length;
        }
        COSTransferTask.loggerInfo(ProtectedSandApp.s("伲\u0001"), this.taskId, ProtectedSandApp.s("伻\u0001"), Long.valueOf(this.uploadLength));
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected CosXmlResult execute() throws Exception {
        boolean shouldMultipartUpload = shouldMultipartUpload();
        String s4 = ProtectedSandApp.s("伲\u0001");
        if (shouldMultipartUpload) {
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("似\u0001"), new Object[0]);
            MultipartUploadTask multipartUploadTask = new MultipartUploadTask(this.cosDirect, this.mPutObjectRequest, this.mTransferTaskCts, getUploadLength());
            multipartUploadTask.mMaxPartSize = this.mMaxPartSize;
            multipartUploadTask.verifyCRC64 = this.verifyCRC64;
            this.uploadTask = multipartUploadTask;
        } else {
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伽\u0001"), this.key);
            this.uploadTask = new SimpleUploadTask(this.cosDirect, this.mPutObjectRequest, this.mTransferTaskCts, getUploadLength());
        }
        this.uploadTask.mTransferMetrics = this.transferTaskMetrics;
        this.uploadTask.setTaskId(this.taskId);
        CosXmlResult upload = this.uploadTask.upload(this.mPutObjectRequest);
        return upload instanceof CompleteMultiUploadResult ? buildPutObjectResult((CompleteMultiUploadResult) upload) : upload;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected Executor executor() {
        return uploadTaskExecutor;
    }

    void forceSimpleUpload(boolean z4) {
        this.mForceSimpleUpload = z4;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void pause() {
        super.pause();
        BaseUploadTask baseUploadTask = this.uploadTask;
        if (baseUploadTask != null) {
            baseUploadTask.cancel();
        }
    }

    void setPartSize(long j4) {
        this.mMaxPartSize = j4;
    }

    void setSliceSizeThreshold(long j4) {
        this.multipartUploadThreshold = j4;
    }

    void setVerifyCRC64(boolean z4) {
        this.verifyCRC64 = z4;
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    protected String tag() {
        return ProtectedSandApp.s("伲\u0001");
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void pause(boolean z4) {
        super.pause();
        BaseUploadTask baseUploadTask = this.uploadTask;
        if (baseUploadTask != null) {
            baseUploadTask.cancel(z4);
        }
    }

    @Override // com.tencent.cos.xml.transfer.COSTransferTask
    public void cancel(boolean z4) {
        super.cancel();
        BaseUploadTask baseUploadTask = this.uploadTask;
        if (baseUploadTask != null) {
            baseUploadTask.cancel(z4);
        }
        BaseUploadTask baseUploadTask2 = this.uploadTask;
        if (baseUploadTask2 instanceof MultipartUploadTask) {
            ((MultipartUploadTask) baseUploadTask2).abort();
        }
    }

    private static class MultipartUploadTask extends BaseUploadTask {
        private String bucket;
        private volatile CompleteMultiUploadRequest completeMultiUploadRequest;
        private CosXmlSimpleService cosService;
        private volatile InitMultipartUploadRequest initMultipartUploadRequest;
        private String key;
        private volatile ListMultiUploadsRequest listMultiUploadsRequest;
        private volatile ListPartsRequest listPartsRequest;
        private MultipartUploadCryptoContext mCryptoContext;
        private long mMaxPartSize;
        private String mUploadId;
        private String region;
        private TreeSet<UploadPart> uploadParts;
        private BaseUploadPartsTask uploadPartsTask;
        private boolean verifyCRC64;

        public MultipartUploadTask(COSDirect cOSDirect, PutObjectRequest putObjectRequest, bolts.e eVar, long j4) {
            super(cOSDirect, putObjectRequest, eVar, j4);
            this.mMaxPartSize = 1048576L;
            this.verifyCRC64 = true;
            this.putObjectRequest = putObjectRequest;
            this.tcs = new i<>();
            this.bucket = putObjectRequest.getBucket();
            this.region = putObjectRequest.getRegion();
            this.key = putObjectRequest.getCosPath();
            this.uploadParts = new TreeSet<>(new Comparator<UploadPart>() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.1
                @Override // java.util.Comparator
                public int compare(UploadPart uploadPart, UploadPart uploadPart2) {
                    int i4 = uploadPart.number;
                    int i5 = uploadPart2.number;
                    if (i4 < i5) {
                        return -1;
                    }
                    return i4 == i5 ? 0 : 1;
                }
            });
            this.cosService = this.cosDirect.getCosService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void abort() {
            if (TextUtils.isEmpty(this.mUploadId)) {
                return;
            }
            AbortMultiUploadRequest abortMultiUploadRequest = new AbortMultiUploadRequest(this.bucket, this.key, this.mUploadId);
            abortMultiUploadRequest.setRegion(this.region);
            this.cosService.abortMultiUploadAsync(abortMultiUploadRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.2
                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                }

                @Override // com.tencent.cos.xml.listener.CosXmlResultListener
                public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                }
            });
        }

        private void assetNotNull(Object obj) throws CosXmlClientException {
            if (obj == null) {
                throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), ProtectedSandApp.s("伕\u0001"));
            }
        }

        private void checkoutManualCanceled() throws CosXmlClientException {
            if (this.mTransferTaskCts.h()) {
                throw CosXmlClientException.manualCancelException();
            }
        }

        private boolean checkoutUploadId(String str) throws CosXmlClientException, CosXmlServiceException {
            int i4;
            String s4 = ProtectedSandApp.s("伖\u0001");
            this.uploadParts.clear();
            int i5 = 0;
            if (this.cosDirect.isTransferSecurely()) {
                if (this.cosDirect.getCryptoModule() == null) {
                    throw CosXmlClientException.internalException(ProtectedSandApp.s("众\u0001"));
                }
                if (!this.cosDirect.getCryptoModule().hasMultipartUploadContext(str)) {
                    return false;
                }
            }
            this.listPartsRequest = new ListPartsRequest(this.bucket, this.key, str);
            this.listPartsRequest.setRegion(this.region);
            List<ListParts.Part> list = this.cosService.listParts(this.listPartsRequest).listParts.parts;
            Collections.sort(list, new Comparator<ListParts.Part>() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.4
                @Override // java.util.Comparator
                public int compare(ListParts.Part part, ListParts.Part part2) {
                    int parseInt = Integer.parseInt(part.partNumber);
                    int parseInt2 = Integer.parseInt(part2.partNumber);
                    if (parseInt < parseInt2) {
                        return -1;
                    }
                    return parseInt == parseInt2 ? 0 : 1;
                }
            });
            try {
                InputStream openInputStream = openInputStream();
                int i6 = 0;
                for (ListParts.Part part : list) {
                    int parseInt = Integer.parseInt(part.partNumber);
                    long parseLong = Long.parseLong(part.size);
                    int i7 = i5 + 1;
                    if (i7 != parseInt) {
                        COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("优\u0001"), Integer.valueOf(parseInt));
                        i4 = i7;
                    } else {
                        String cOSMd5 = DigestUtils.getCOSMd5(openInputStream, 0L, parseLong);
                        if (cOSMd5 == null || !cOSMd5.equals(part.eTag)) {
                            i4 = i7;
                            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("会\u0001"), Integer.valueOf(parseInt), cOSMd5, part.eTag);
                        } else {
                            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伙\u0001"), Integer.valueOf(parseInt));
                            long j4 = i6;
                            this.uploadParts.add(new UploadPart(part.eTag, parseInt, j4, parseLong));
                            i6 = (int) (j4 + parseLong);
                            i5 = i7;
                        }
                    }
                    i5 = i4;
                }
                openInputStream.close();
                COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伛\u0001"), Integer.valueOf(list.size()), Integer.valueOf(i6), Integer.valueOf(i5));
                return true;
            } catch (IOException e4) {
                COSTransferTask.loggerWarn(s4, this.taskId, ProtectedSandApp.s("伜\u0001"), e4.getMessage());
                throw CosXmlClientException.internalException(e4.getMessage());
            }
        }

        private CosXmlResult completeMultipartUpload(String str) throws CosXmlClientException, CosXmlServiceException {
            String s4 = ProtectedSandApp.s("伖\u0001");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<UploadPart> it = this.uploadParts.iterator();
            while (it.hasNext()) {
                UploadPart next = it.next();
                linkedHashMap.put(Integer.valueOf(next.number), next.etag);
            }
            try {
                this.completeMultiUploadRequest = new CompleteMultiUploadRequest(this.bucket, this.key, str, linkedHashMap);
                this.completeMultiUploadRequest.setRequestHeaders(getCompleteHeaders(this.putObjectRequest));
                CompleteMultiUploadResult completeMultipartUpload = this.cosDirect.completeMultipartUpload(this.completeMultiUploadRequest);
                COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伝\u0001"), this.key, str);
                return completeMultipartUpload;
            } catch (CosXmlServiceException e4) {
                if (!ProtectedSandApp.s("伞\u0001").equals(e4.getErrorCode())) {
                    throw e4;
                }
                try {
                    HeadObjectRequest headObjectRequest = new HeadObjectRequest(this.bucket, this.key);
                    headObjectRequest.setRegion(this.region);
                    COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伟\u0001"), str);
                    return this.cosService.headObject(headObjectRequest);
                } catch (Exception unused) {
                    throw e4;
                }
            }
        }

        private void crc64Verify(String str) throws CosXmlClientException {
            if (TextUtils.isEmpty(str)) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("伣\u0001"));
            }
            try {
                long bigIntFromString = DigestUtils.getBigIntFromString(str);
                InputStream openInputStream = openInputStream();
                long crc64 = DigestUtils.getCRC64(openInputStream);
                openInputStream.close();
                if (bigIntFromString != crc64) {
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), String.format(Locale.ENGLISH, ProtectedSandApp.s("伡\u0001"), Long.valueOf(bigIntFromString), Long.valueOf(crc64)));
                }
                COSTransferTask.loggerInfo(ProtectedSandApp.s("伖\u0001"), this.taskId, ProtectedSandApp.s("传\u0001"), str);
            } catch (IOException e4) {
                throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), String.format(Locale.ENGLISH, ProtectedSandApp.s("伢\u0001"), e4.getMessage()));
            }
        }

        private Map<String, List<String>> getCompleteHeaders(PutObjectRequest putObjectRequest) {
            Map<String, List<String>> requestHeaders = putObjectRequest.getRequestHeaders();
            if (requestHeaders == null) {
                return new HashMap();
            }
            HashMap hashMap = new HashMap(requestHeaders);
            hashMap.remove(ProtectedSandApp.s("伤\u0001"));
            return hashMap;
        }

        private Map<String, List<String>> getInitHeaders(PutObjectRequest putObjectRequest) {
            Map<String, List<String>> requestHeaders = putObjectRequest.getRequestHeaders();
            return requestHeaders == null ? new HashMap() : new HashMap(requestHeaders);
        }

        private String getStorageClass() {
            List<String> list = this.putObjectRequest.getRequestHeaders().get(ProtectedSandApp.s("伥\u0001"));
            return (list == null || list.isEmpty()) ? ProtectedSandApp.s("伦\u0001") : list.get(0);
        }

        private String initUploadId() throws Exception {
            this.initMultipartUploadRequest = new InitMultipartUploadRequest(this.bucket, this.key);
            this.initMultipartUploadRequest.setRegion(this.region);
            this.initMultipartUploadRequest.setRequestHeaders(getInitHeaders(this.putObjectRequest));
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.initMultipartUploadRequest.attachMetrics(httpTaskMetrics);
            if (this.cosDirect.isTransferSecurely()) {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                objectMetadata.setContentLength(this.totalUploadSize);
                objectMetadata.setContentMD5(DigestUtils.getCOSMd5(openUnencryptedInputStream(), 0L, this.totalUploadSize));
                this.initMultipartUploadRequest.setMetadata(objectMetadata);
            }
            InitMultipartUploadResult initMultipartUpload = this.cosDirect.initMultipartUpload(this.initMultipartUploadRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            String str = initMultipartUpload.initMultipartUpload.uploadId;
            if (this.cosDirect.isTransferSecurely()) {
                this.mCryptoContext = this.cosDirect.getCryptoModule().getCryptoContext(str);
            }
            COSTransferTask.loggerInfo(ProtectedSandApp.s("伖\u0001"), this.taskId, ProtectedSandApp.s("伧\u0001"), str);
            return str;
        }

        private boolean isParallelUpload() {
            return !this.cosDirect.isTransferSecurely();
        }

        private List<String> listObjectUploadIds() throws CosXmlClientException, CosXmlServiceException {
            String substring = this.key.startsWith(ProtectedSandApp.s("伨\u0001")) ? this.key.substring(1) : this.key;
            HttpTaskMetrics httpTaskMetrics = new HttpTaskMetrics();
            this.listMultiUploadsRequest = new ListMultiUploadsRequest(this.bucket);
            this.listMultiUploadsRequest.setPrefix(substring);
            this.listMultiUploadsRequest.setRegion(this.region);
            this.listMultiUploadsRequest.attachMetrics(httpTaskMetrics);
            LinkedList linkedList = new LinkedList();
            ListMultiUploadsResult listMultiUploads = this.cosService.listMultiUploads(this.listMultiUploadsRequest);
            this.mTransferMetrics.connectAddress = httpTaskMetrics.getConnectAddress();
            ListMultipartUploads listMultipartUploads = listMultiUploads.listMultipartUploads;
            String s4 = ProtectedSandApp.s("伖\u0001");
            if (listMultipartUploads != null) {
                List<ListMultipartUploads.Upload> list = listMultipartUploads.uploads;
                COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伩\u0001"), Integer.valueOf(list.size()), substring);
                if (!list.isEmpty()) {
                    Collections.sort(list, new Comparator<ListMultipartUploads.Upload>() { // from class: com.tencent.cos.xml.transfer.COSUploadTask.MultipartUploadTask.3
                        @Override // java.util.Comparator
                        public int compare(ListMultipartUploads.Upload upload, ListMultipartUploads.Upload upload2) {
                            long parseInitiatedDate = MultipartUploadTask.this.parseInitiatedDate(upload.initiated);
                            Long valueOf = Long.valueOf(parseInitiatedDate);
                            long parseInitiatedDate2 = MultipartUploadTask.this.parseInitiatedDate(upload2.initiated);
                            Long valueOf2 = Long.valueOf(parseInitiatedDate2);
                            if (parseInitiatedDate2 < parseInitiatedDate) {
                                return -1;
                            }
                            return valueOf2 == valueOf ? 0 : 1;
                        }
                    });
                    for (ListMultipartUploads.Upload upload : list) {
                        if (upload.key.equals(substring) && upload.storageClass.equals(getStorageClass())) {
                            linkedList.add(upload.uploadID);
                        }
                    }
                }
            }
            COSTransferTask.loggerInfo(s4, this.taskId, ProtectedSandApp.s("伪\u0001"), Integer.valueOf(linkedList.size()));
            return linkedList;
        }

        private InputStream openInputStream() throws CosXmlClientException {
            InputStream openUnencryptedInputStream = openUnencryptedInputStream();
            if (this.cosDirect.isTransferSecurely()) {
                if (this.mCryptoContext == null) {
                    throw CosXmlClientException.internalException(this.mUploadId + ProtectedSandApp.s("伫\u0001"));
                }
                openUnencryptedInputStream = this.cosDirect.getCryptoModule().newCOSCipherLiteInputStream(this.putObjectRequest, this.mCryptoContext.getCipherLite());
            }
            assetNotNull(openUnencryptedInputStream);
            return openUnencryptedInputStream;
        }

        private InputStream openUnencryptedInputStream() throws CosXmlClientException {
            try {
                String srcPath = this.putObjectRequest.getSrcPath();
                Uri uri = this.putObjectRequest.getUri();
                InputStream resettableInputStream = srcPath != null ? new ResettableInputStream(srcPath) : (uri == null || ContextHolder.getAppContext() == null) ? null : ContextHolder.getAppContext().getContentResolver().openInputStream(uri);
                assetNotNull(resettableInputStream);
                return resettableInputStream;
            } catch (Exception unused) {
                throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), ProtectedSandApp.s("伬\u0001"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long parseInitiatedDate(String str) {
            try {
                return new SimpleDateFormat(ProtectedSandApp.s("伭\u0001"), Locale.getDefault()).parse(str).getTime();
            } catch (ParseException e4) {
                e4.printStackTrace();
                return 0L;
            }
        }

        private void uploadParts(String str) throws Exception {
            long j4;
            long j5;
            int i4;
            long j6 = this.totalUploadSize;
            UploadPart last = this.uploadParts.isEmpty() ? null : this.uploadParts.last();
            if (last != null) {
                long j7 = last.offset + last.size;
                j4 = j6 - j7;
                i4 = 1 + last.number;
                j5 = j7;
            } else {
                j4 = j6;
                j5 = 0;
                i4 = 1;
            }
            this.mTransferMetrics.size = j4;
            if (j4 > 0) {
                COSTransferTask.loggerInfo(ProtectedSandApp.s("伖\u0001"), this.taskId, ProtectedSandApp.s("伮\u0001"), Long.valueOf(j5), Long.valueOf(j4), Integer.valueOf(i4));
                if (isParallelUpload()) {
                    this.uploadPartsTask = new ParallelUploadPartsTask(this.cosDirect, this.putObjectRequest, j5, j4, i4, str);
                } else {
                    this.uploadPartsTask = new SerialUploadPartsTask(this.cosDirect, this.putObjectRequest, j5, j4, i4, str);
                }
                BaseUploadPartsTask baseUploadPartsTask = this.uploadPartsTask;
                baseUploadPartsTask.mMaxPartSize = this.mMaxPartSize;
                baseUploadPartsTask.setTaskId(this.taskId);
                this.uploadPartsTask.setProgressListener(this.putObjectRequest.getProgressListener());
                this.uploadParts.addAll(this.uploadPartsTask.upload());
            }
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void cancel() {
            if (this.listMultiUploadsRequest != null) {
                this.cosDirect.cancel(this.listMultiUploadsRequest);
            }
            if (this.initMultipartUploadRequest != null) {
                this.cosDirect.cancel(this.initMultipartUploadRequest);
            }
            if (this.listPartsRequest != null) {
                this.cosDirect.cancel(this.listPartsRequest);
            }
            if (this.completeMultiUploadRequest != null) {
                this.cosDirect.cancel(this.completeMultiUploadRequest);
            }
            BaseUploadPartsTask baseUploadPartsTask = this.uploadPartsTask;
            if (baseUploadPartsTask != null) {
                baseUploadPartsTask.cancel();
            }
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void setTaskId(String str) {
            this.taskId = str;
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        protected CosXmlResult upload(PutObjectRequest putObjectRequest) throws Exception {
            if (!this.cosDirect.isTransferSecurely()) {
                checkoutManualCanceled();
                List<String> listObjectUploadIds = listObjectUploadIds();
                checkoutManualCanceled();
                Iterator<String> it = listObjectUploadIds.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (checkoutUploadId(next)) {
                        this.mUploadId = next;
                        break;
                    }
                }
            }
            checkoutManualCanceled();
            if (TextUtils.isEmpty(this.mUploadId)) {
                this.mUploadId = initUploadId();
            }
            checkoutManualCanceled();
            uploadParts(this.mUploadId);
            checkoutManualCanceled();
            CosXmlResult completeMultipartUpload = completeMultipartUpload(this.mUploadId);
            if (this.verifyCRC64) {
                checkoutManualCanceled();
                crc64Verify(completeMultipartUpload.getHeader(ProtectedSandApp.s("伯\u0001")));
            }
            return completeMultipartUpload;
        }

        @Override // com.tencent.cos.xml.transfer.COSUploadTask.BaseUploadTask
        public void cancel(boolean z4) {
            if (this.listMultiUploadsRequest != null) {
                this.cosDirect.cancel(this.listMultiUploadsRequest, z4);
            }
            if (this.initMultipartUploadRequest != null) {
                this.cosDirect.cancel(this.initMultipartUploadRequest, z4);
            }
            if (this.listPartsRequest != null) {
                this.cosDirect.cancel(this.listPartsRequest, z4);
            }
            if (this.completeMultiUploadRequest != null) {
                this.cosDirect.cancel(this.completeMultiUploadRequest, z4);
            }
            BaseUploadPartsTask baseUploadPartsTask = this.uploadPartsTask;
            if (baseUploadPartsTask != null) {
                baseUploadPartsTask.cancel(z4);
            }
        }
    }
}
