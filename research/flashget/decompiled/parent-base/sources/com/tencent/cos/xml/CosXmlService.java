package com.tencent.cos.xml;

import android.content.Context;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.MetaDataDirective;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlBooleanListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.EmptyResponseResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketCORSRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketCORSResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketDomainRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketDomainResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketLifecycleRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketLifecycleResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketPolicyRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketPolicyResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketReplicationRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketReplicationResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketTaggingRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketTaggingResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketWebsiteRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketWebsiteResult;
import com.tencent.cos.xml.model.bucket.GetBucketACLRequest;
import com.tencent.cos.xml.model.bucket.GetBucketACLResult;
import com.tencent.cos.xml.model.bucket.GetBucketAccelerateRequest;
import com.tencent.cos.xml.model.bucket.GetBucketAccelerateResult;
import com.tencent.cos.xml.model.bucket.GetBucketCORSRequest;
import com.tencent.cos.xml.model.bucket.GetBucketCORSResult;
import com.tencent.cos.xml.model.bucket.GetBucketDomainRequest;
import com.tencent.cos.xml.model.bucket.GetBucketDomainResult;
import com.tencent.cos.xml.model.bucket.GetBucketIntelligentTieringRequest;
import com.tencent.cos.xml.model.bucket.GetBucketIntelligentTieringResult;
import com.tencent.cos.xml.model.bucket.GetBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.GetBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.GetBucketLifecycleRequest;
import com.tencent.cos.xml.model.bucket.GetBucketLifecycleResult;
import com.tencent.cos.xml.model.bucket.GetBucketLocationRequest;
import com.tencent.cos.xml.model.bucket.GetBucketLocationResult;
import com.tencent.cos.xml.model.bucket.GetBucketLoggingRequest;
import com.tencent.cos.xml.model.bucket.GetBucketLoggingResult;
import com.tencent.cos.xml.model.bucket.GetBucketObjectVersionsRequest;
import com.tencent.cos.xml.model.bucket.GetBucketObjectVersionsResult;
import com.tencent.cos.xml.model.bucket.GetBucketPolicyRequest;
import com.tencent.cos.xml.model.bucket.GetBucketPolicyResult;
import com.tencent.cos.xml.model.bucket.GetBucketRefererRequest;
import com.tencent.cos.xml.model.bucket.GetBucketRefererResult;
import com.tencent.cos.xml.model.bucket.GetBucketReplicationRequest;
import com.tencent.cos.xml.model.bucket.GetBucketReplicationResult;
import com.tencent.cos.xml.model.bucket.GetBucketRequest;
import com.tencent.cos.xml.model.bucket.GetBucketResult;
import com.tencent.cos.xml.model.bucket.GetBucketTaggingRequest;
import com.tencent.cos.xml.model.bucket.GetBucketTaggingResult;
import com.tencent.cos.xml.model.bucket.GetBucketVersioningRequest;
import com.tencent.cos.xml.model.bucket.GetBucketVersioningResult;
import com.tencent.cos.xml.model.bucket.GetBucketWebsiteRequest;
import com.tencent.cos.xml.model.bucket.GetBucketWebsiteResult;
import com.tencent.cos.xml.model.bucket.HeadBucketRequest;
import com.tencent.cos.xml.model.bucket.HeadBucketResult;
import com.tencent.cos.xml.model.bucket.ListBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.ListBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.ListBucketVersionsRequest;
import com.tencent.cos.xml.model.bucket.ListBucketVersionsResult;
import com.tencent.cos.xml.model.bucket.PutBucketACLRequest;
import com.tencent.cos.xml.model.bucket.PutBucketACLResult;
import com.tencent.cos.xml.model.bucket.PutBucketAccelerateRequest;
import com.tencent.cos.xml.model.bucket.PutBucketAccelerateResult;
import com.tencent.cos.xml.model.bucket.PutBucketCORSRequest;
import com.tencent.cos.xml.model.bucket.PutBucketCORSResult;
import com.tencent.cos.xml.model.bucket.PutBucketDomainRequest;
import com.tencent.cos.xml.model.bucket.PutBucketDomainResult;
import com.tencent.cos.xml.model.bucket.PutBucketIntelligentTieringRequest;
import com.tencent.cos.xml.model.bucket.PutBucketIntelligentTieringResult;
import com.tencent.cos.xml.model.bucket.PutBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.PutBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.PutBucketLifecycleRequest;
import com.tencent.cos.xml.model.bucket.PutBucketLifecycleResult;
import com.tencent.cos.xml.model.bucket.PutBucketLoggingRequest;
import com.tencent.cos.xml.model.bucket.PutBucketLoggingResult;
import com.tencent.cos.xml.model.bucket.PutBucketPolicyRequest;
import com.tencent.cos.xml.model.bucket.PutBucketPolicyResult;
import com.tencent.cos.xml.model.bucket.PutBucketRefererRequest;
import com.tencent.cos.xml.model.bucket.PutBucketRefererResult;
import com.tencent.cos.xml.model.bucket.PutBucketReplicationRequest;
import com.tencent.cos.xml.model.bucket.PutBucketReplicationResult;
import com.tencent.cos.xml.model.bucket.PutBucketRequest;
import com.tencent.cos.xml.model.bucket.PutBucketResult;
import com.tencent.cos.xml.model.bucket.PutBucketTaggingRequest;
import com.tencent.cos.xml.model.bucket.PutBucketTaggingResult;
import com.tencent.cos.xml.model.bucket.PutBucketVersioningRequest;
import com.tencent.cos.xml.model.bucket.PutBucketVersioningResult;
import com.tencent.cos.xml.model.bucket.PutBucketWebsiteRequest;
import com.tencent.cos.xml.model.bucket.PutBucketWebsiteResult;
import com.tencent.cos.xml.model.ci.FormatConversionRequest;
import com.tencent.cos.xml.model.ci.FormatConversionResult;
import com.tencent.cos.xml.model.ci.GetDescribeMediaBucketsRequest;
import com.tencent.cos.xml.model.ci.GetDescribeMediaBucketsResult;
import com.tencent.cos.xml.model.ci.GetMediaInfoRequest;
import com.tencent.cos.xml.model.ci.GetMediaInfoResult;
import com.tencent.cos.xml.model.ci.GetSnapshotRequest;
import com.tencent.cos.xml.model.ci.GetSnapshotResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlBytesRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlBytesResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlLinkRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlLinkResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentResult;
import com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionRequest;
import com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResult;
import com.tencent.cos.xml.model.ci.ai.AIDetectCarRequest;
import com.tencent.cos.xml.model.ci.ai.AIDetectCarResult;
import com.tencent.cos.xml.model.ci.ai.AIDetectFaceRequest;
import com.tencent.cos.xml.model.ci.ai.AIDetectFaceResult;
import com.tencent.cos.xml.model.ci.ai.AIDetectPetRequest;
import com.tencent.cos.xml.model.ci.ai.AIDetectPetResult;
import com.tencent.cos.xml.model.ci.ai.AIEnhanceImageRequest;
import com.tencent.cos.xml.model.ci.ai.AIFaceEffectRequest;
import com.tencent.cos.xml.model.ci.ai.AIFaceEffectResult;
import com.tencent.cos.xml.model.ci.ai.AIGameRecRequest;
import com.tencent.cos.xml.model.ci.ai.AIGameRecResult;
import com.tencent.cos.xml.model.ci.ai.AIIDCardOCRRequest;
import com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResult;
import com.tencent.cos.xml.model.ci.ai.AIImageColoringRequest;
import com.tencent.cos.xml.model.ci.ai.AIImageCropRequest;
import com.tencent.cos.xml.model.ci.ai.AILicenseRecRequest;
import com.tencent.cos.xml.model.ci.ai.AILicenseRecResult;
import com.tencent.cos.xml.model.ci.ai.AISuperResolutionRequest;
import com.tencent.cos.xml.model.ci.ai.AddImageSearchRequest;
import com.tencent.cos.xml.model.ci.ai.AssessQualityRequest;
import com.tencent.cos.xml.model.ci.ai.AssessQualityResult;
import com.tencent.cos.xml.model.ci.ai.AutoTranslationBlockRequest;
import com.tencent.cos.xml.model.ci.ai.AutoTranslationBlockResult;
import com.tencent.cos.xml.model.ci.ai.COSOCRRequest;
import com.tencent.cos.xml.model.ci.ai.COSOCRResult;
import com.tencent.cos.xml.model.ci.ai.CreateCRcodeRequest;
import com.tencent.cos.xml.model.ci.ai.CreateCRcodeResult;
import com.tencent.cos.xml.model.ci.ai.DeleteImageSearchRequest;
import com.tencent.cos.xml.model.ci.ai.DetectLabelRequest;
import com.tencent.cos.xml.model.ci.ai.DetectLabelResult;
import com.tencent.cos.xml.model.ci.ai.GetActionSequenceRequest;
import com.tencent.cos.xml.model.ci.ai.GetActionSequenceResult;
import com.tencent.cos.xml.model.ci.ai.GetLiveCodeRequest;
import com.tencent.cos.xml.model.ci.ai.GetLiveCodeResult;
import com.tencent.cos.xml.model.ci.ai.GetSearchImageRequest;
import com.tencent.cos.xml.model.ci.ai.GetSearchImageResult;
import com.tencent.cos.xml.model.ci.ai.GoodsMattingRequest;
import com.tencent.cos.xml.model.ci.ai.ImageRepairRequest;
import com.tencent.cos.xml.model.ci.ai.LivenessRecognitionRequest;
import com.tencent.cos.xml.model.ci.ai.LivenessRecognitionResult;
import com.tencent.cos.xml.model.ci.ai.RecognitionQRcodeRequest;
import com.tencent.cos.xml.model.ci.ai.RecognitionQRcodeResult;
import com.tencent.cos.xml.model.ci.ai.RecognizeLogoRequest;
import com.tencent.cos.xml.model.ci.ai.RecognizeLogoResult;
import com.tencent.cos.xml.model.ci.media.GetPrivateM3U8Request;
import com.tencent.cos.xml.model.ci.media.GetPrivateM3U8Result;
import com.tencent.cos.xml.model.ci.media.GetWorkflowDetailRequest;
import com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResult;
import com.tencent.cos.xml.model.object.AppendObjectRequest;
import com.tencent.cos.xml.model.object.AppendObjectResult;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.DeleteMultiObjectRequest;
import com.tencent.cos.xml.model.object.DeleteMultiObjectResult;
import com.tencent.cos.xml.model.object.DeleteObjectRequest;
import com.tencent.cos.xml.model.object.DeleteObjectTaggingRequest;
import com.tencent.cos.xml.model.object.DeleteObjectTaggingResult;
import com.tencent.cos.xml.model.object.GetObjectACLRequest;
import com.tencent.cos.xml.model.object.GetObjectACLResult;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.GetObjectTaggingRequest;
import com.tencent.cos.xml.model.object.GetObjectTaggingResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.OptionObjectRequest;
import com.tencent.cos.xml.model.object.OptionObjectResult;
import com.tencent.cos.xml.model.object.PutObjectACLRequest;
import com.tencent.cos.xml.model.object.PutObjectACLResult;
import com.tencent.cos.xml.model.object.PutObjectTaggingRequest;
import com.tencent.cos.xml.model.object.PutObjectTaggingResult;
import com.tencent.cos.xml.model.object.RestoreRequest;
import com.tencent.cos.xml.model.object.RestoreResult;
import com.tencent.cos.xml.model.object.SelectObjectContentRequest;
import com.tencent.cos.xml.model.object.SelectObjectContentResult;
import com.tencent.cos.xml.model.service.GetServiceRequest;
import com.tencent.cos.xml.model.service.GetServiceResult;
import com.tencent.cos.xml.model.tag.COSMetaData;
import com.tencent.cos.xml.transfer.SelectObjectContentConverter;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudSelfSigner;
import com.tencent.qcloud.core.auth.QCloudSigner;
import com.tencent.qcloud.core.http.QCloudHttpRequest;
import com.tencent.qcloud.core.http.ResponseBodyConverter;

/* loaded from: classes6.dex */
public class CosXmlService extends CosXmlSimpleService implements CosXml {
    private String getServiceRequestDomain;

    public CosXmlService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudCredentialProvider qCloudCredentialProvider) {
        super(context, cosXmlServiceConfig, qCloudCredentialProvider);
    }

    @Override // com.tencent.cos.xml.CosXml
    public EmptyResponseResult addImageSearch(AddImageSearchRequest addImageSearchRequest) throws CosXmlClientException, CosXmlServiceException {
        return (EmptyResponseResult) execute(addImageSearchRequest, new EmptyResponseResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void addImageSearchAsync(AddImageSearchRequest addImageSearchRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(addImageSearchRequest, new EmptyResponseResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIBodyRecognitionResult aiBodyRecognition(AIBodyRecognitionRequest aIBodyRecognitionRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIBodyRecognitionResult) execute(aIBodyRecognitionRequest, new AIBodyRecognitionResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiBodyRecognitionAsync(AIBodyRecognitionRequest aIBodyRecognitionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIBodyRecognitionRequest, new AIBodyRecognitionResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIDetectCarResult aiDetectCar(AIDetectCarRequest aIDetectCarRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIDetectCarResult) execute(aIDetectCarRequest, new AIDetectCarResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiDetectCarAsync(AIDetectCarRequest aIDetectCarRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIDetectCarRequest, new AIDetectCarResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIDetectFaceResult aiDetectFace(AIDetectFaceRequest aIDetectFaceRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIDetectFaceResult) execute(aIDetectFaceRequest, new AIDetectFaceResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiDetectFaceAsync(AIDetectFaceRequest aIDetectFaceRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIDetectFaceRequest, new AIDetectFaceResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIDetectPetResult aiDetectPet(AIDetectPetRequest aIDetectPetRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIDetectPetResult) execute(aIDetectPetRequest, new AIDetectPetResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiDetectPetAsync(AIDetectPetRequest aIDetectPetRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIDetectPetRequest, new AIDetectPetResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectResult aiEnhanceImage(AIEnhanceImageRequest aIEnhanceImageRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(aIEnhanceImageRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiEnhanceImageAsync(AIEnhanceImageRequest aIEnhanceImageRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIEnhanceImageRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIFaceEffectResult aiFaceEffect(AIFaceEffectRequest aIFaceEffectRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIFaceEffectResult) execute(aIFaceEffectRequest, new AIFaceEffectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiFaceEffectAsync(AIFaceEffectRequest aIFaceEffectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIFaceEffectRequest, new AIFaceEffectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIGameRecResult aiGameRec(AIGameRecRequest aIGameRecRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIGameRecResult) execute(aIGameRecRequest, new AIGameRecResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiGameRecAsync(AIGameRecRequest aIGameRecRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIGameRecRequest, new AIGameRecResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AIIDCardOCRResult aiIDCardOCR(AIIDCardOCRRequest aIIDCardOCRRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AIIDCardOCRResult) execute(aIIDCardOCRRequest, new AIIDCardOCRResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiIDCardOCRAsync(AIIDCardOCRRequest aIIDCardOCRRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIIDCardOCRRequest, new AIIDCardOCRResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectResult aiImageColoring(AIImageColoringRequest aIImageColoringRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(aIImageColoringRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiImageColoringAsync(AIImageColoringRequest aIImageColoringRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIImageColoringRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectResult aiImageCrop(AIImageCropRequest aIImageCropRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(aIImageCropRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiImageCropAsync(AIImageCropRequest aIImageCropRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aIImageCropRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AILicenseRecResult aiLicenseRec(AILicenseRecRequest aILicenseRecRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AILicenseRecResult) execute(aILicenseRecRequest, new AILicenseRecResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiLicenseRecAsync(AILicenseRecRequest aILicenseRecRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aILicenseRecRequest, new AILicenseRecResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectResult aiSuperResolution(AISuperResolutionRequest aISuperResolutionRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(aISuperResolutionRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void aiSuperResolutionAsync(AISuperResolutionRequest aISuperResolutionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(aISuperResolutionRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AppendObjectResult appendObject(AppendObjectRequest appendObjectRequest) throws CosXmlClientException, CosXmlServiceException {
        AppendObjectResult appendObjectResult = new AppendObjectResult();
        appendObjectResult.accessUrl = getAccessUrl(appendObjectRequest);
        return (AppendObjectResult) execute(appendObjectRequest, appendObjectResult);
    }

    @Override // com.tencent.cos.xml.CosXml
    public void appendObjectAsync(AppendObjectRequest appendObjectRequest, CosXmlResultListener cosXmlResultListener) {
        AppendObjectResult appendObjectResult = new AppendObjectResult();
        appendObjectResult.accessUrl = getAccessUrl(appendObjectRequest);
        schedule(appendObjectRequest, appendObjectResult, cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AssessQualityResult assessQuality(AssessQualityRequest assessQualityRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AssessQualityResult) execute(assessQualityRequest, new AssessQualityResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void assessQualityAsync(AssessQualityRequest assessQualityRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(assessQualityRequest, new AssessQualityResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public AutoTranslationBlockResult autoTranslationBlock(AutoTranslationBlockRequest autoTranslationBlockRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AutoTranslationBlockResult) execute(autoTranslationBlockRequest, new AutoTranslationBlockResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void autoTranslationBlockAsync(AutoTranslationBlockRequest autoTranslationBlockRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(autoTranslationBlockRequest, new AutoTranslationBlockResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXmlBaseService
    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> boolean buildHttpRequestBodyConverter(T1 t12, T2 t22, QCloudHttpRequest.Builder<T2> builder) {
        if (!(t12 instanceof SelectObjectContentRequest)) {
            return super.buildHttpRequestBodyConverter(t12, t22, builder);
        }
        SelectObjectContentRequest selectObjectContentRequest = (SelectObjectContentRequest) t12;
        SelectObjectContentConverter selectObjectContentConverter = new SelectObjectContentConverter((SelectObjectContentResult) t22, selectObjectContentRequest.getSelectResponseFilePath());
        selectObjectContentConverter.setContentListener(selectObjectContentRequest.getSelectObjectContentProgressListener());
        builder.converter((ResponseBodyConverter<T2>) selectObjectContentConverter);
        return true;
    }

    @Override // com.tencent.cos.xml.CosXml
    public COSOCRResult cOSOCR(COSOCRRequest cOSOCRRequest) throws CosXmlClientException, CosXmlServiceException {
        return (COSOCRResult) execute(cOSOCRRequest, new COSOCRResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void cOSOCRAsync(COSOCRRequest cOSOCRRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(cOSOCRRequest, new COSOCRResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public CreateCRcodeResult createCRcode(CreateCRcodeRequest createCRcodeRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateCRcodeResult) execute(createCRcodeRequest, new CreateCRcodeResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void createCRcodeAsync(CreateCRcodeRequest createCRcodeRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createCRcodeRequest, new CreateCRcodeResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketResult deleteBucket(DeleteBucketRequest deleteBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketResult) execute(deleteBucketRequest, new DeleteBucketResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketAsync(DeleteBucketRequest deleteBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketRequest, new DeleteBucketResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketCORSResult deleteBucketCORS(DeleteBucketCORSRequest deleteBucketCORSRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketCORSResult) execute(deleteBucketCORSRequest, new DeleteBucketCORSResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketCORSAsync(DeleteBucketCORSRequest deleteBucketCORSRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketCORSRequest, new DeleteBucketCORSResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketDomainResult deleteBucketDomain(DeleteBucketDomainRequest deleteBucketDomainRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketDomainResult) execute(deleteBucketDomainRequest, new DeleteBucketDomainResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketDomainAsync(DeleteBucketDomainRequest deleteBucketDomainRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketDomainRequest, new DeleteBucketDomainResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketInventoryResult deleteBucketInventory(DeleteBucketInventoryRequest deleteBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketInventoryResult) execute(deleteBucketInventoryRequest, new DeleteBucketInventoryResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketInventoryAsync(DeleteBucketInventoryRequest deleteBucketInventoryRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketInventoryRequest, new DeleteBucketInventoryResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketLifecycleResult deleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketLifecycleResult) execute(deleteBucketLifecycleRequest, new DeleteBucketLifecycleResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketLifecycleAsync(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketLifecycleRequest, new DeleteBucketLifecycleResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketPolicyResult deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketPolicyResult) execute(deleteBucketPolicyRequest, new DeleteBucketPolicyResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketPolicyAsync(DeleteBucketPolicyRequest deleteBucketPolicyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketPolicyRequest, new DeleteBucketPolicyResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketReplicationResult deleteBucketReplication(DeleteBucketReplicationRequest deleteBucketReplicationRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketReplicationResult) execute(deleteBucketReplicationRequest, new DeleteBucketReplicationResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketReplicationAsync(DeleteBucketReplicationRequest deleteBucketReplicationRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketReplicationRequest, new DeleteBucketReplicationResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketTaggingResult deleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketTaggingResult) execute(deleteBucketTaggingRequest, new DeleteBucketTaggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketTaggingAsync(DeleteBucketTaggingRequest deleteBucketTaggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketTaggingRequest, new DeleteBucketTaggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteBucketWebsiteResult deleteBucketWebsite(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketWebsiteResult) execute(deleteBucketWebsiteRequest, new DeleteBucketWebsiteResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteBucketWebsiteAsync(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketWebsiteRequest, new DeleteBucketWebsiteResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public EmptyResponseResult deleteImageSearch(DeleteImageSearchRequest deleteImageSearchRequest) throws CosXmlClientException, CosXmlServiceException {
        return (EmptyResponseResult) execute(deleteImageSearchRequest, new EmptyResponseResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteImageSearchAsync(DeleteImageSearchRequest deleteImageSearchRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteImageSearchRequest, new EmptyResponseResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteMultiObjectResult deleteMultiObject(DeleteMultiObjectRequest deleteMultiObjectRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteMultiObjectResult) execute(deleteMultiObjectRequest, new DeleteMultiObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteMultiObjectAsync(DeleteMultiObjectRequest deleteMultiObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteMultiObjectRequest, new DeleteMultiObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public boolean deleteObject(String str, String str2) throws CosXmlClientException, CosXmlServiceException {
        deleteObject(new DeleteObjectRequest(str, str2));
        return true;
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteObjectAsync(String str, String str2, final CosXmlBooleanListener cosXmlBooleanListener) {
        deleteObjectAsync(new DeleteObjectRequest(str, str2), new CosXmlResultListener() { // from class: com.tencent.cos.xml.CosXmlService.3
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                cosXmlBooleanListener.onFail(cosXmlClientException, cosXmlServiceException);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                cosXmlBooleanListener.onSuccess(true);
            }
        });
    }

    @Override // com.tencent.cos.xml.CosXml
    public DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteObjectTaggingResult) execute(deleteObjectTaggingRequest, new DeleteObjectTaggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void deleteObjectTaggingAsync(DeleteObjectTaggingRequest deleteObjectTaggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteObjectTaggingRequest, new DeleteObjectTaggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public DetectLabelResult detectLabel(DetectLabelRequest detectLabelRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DetectLabelResult) execute(detectLabelRequest, new DetectLabelResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void detectLabelAsync(DetectLabelRequest detectLabelRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(detectLabelRequest, new DetectLabelResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public boolean doesBucketExist(String str) throws CosXmlClientException, CosXmlServiceException {
        try {
            getBucketACL(new GetBucketACLRequest(str));
            return true;
        } catch (CosXmlServiceException e4) {
            if (e4.getStatusCode() == 301 || ProtectedSandApp.s("㑔\u0001").equals(e4.getErrorCode())) {
                return true;
            }
            if (e4.getStatusCode() == 404) {
                return false;
            }
            throw e4;
        }
    }

    @Override // com.tencent.cos.xml.CosXml
    public void doesBucketExistAsync(String str, final CosXmlBooleanListener cosXmlBooleanListener) {
        headBucketAsync(new HeadBucketRequest(str), new CosXmlResultListener() { // from class: com.tencent.cos.xml.CosXmlService.1
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                boolean z4;
                boolean z5 = false;
                if (cosXmlClientException == null && cosXmlServiceException != null) {
                    if (cosXmlServiceException.getStatusCode() == 301 || ProtectedSandApp.s("㓍\u0001").equals(cosXmlServiceException.getErrorCode())) {
                        cosXmlBooleanListener.onSuccess(true);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (cosXmlServiceException.getStatusCode() == 404) {
                        cosXmlBooleanListener.onSuccess(false);
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                }
                if (z5) {
                    return;
                }
                cosXmlBooleanListener.onFail(cosXmlClientException, cosXmlServiceException);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                cosXmlBooleanListener.onSuccess(true);
            }
        });
    }

    @Override // com.tencent.cos.xml.CosXml
    public boolean doesObjectExist(String str, String str2) throws CosXmlClientException, CosXmlServiceException {
        try {
            headObject(new HeadObjectRequest(str, str2));
            return true;
        } catch (CosXmlServiceException e4) {
            if (e4.getStatusCode() == 404) {
                return false;
            }
            throw e4;
        }
    }

    @Override // com.tencent.cos.xml.CosXml
    public void doesObjectExistAsync(String str, String str2, final CosXmlBooleanListener cosXmlBooleanListener) {
        headObjectAsync(new HeadObjectRequest(str, str2), new CosXmlResultListener() { // from class: com.tencent.cos.xml.CosXmlService.2
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                if (cosXmlServiceException == null || cosXmlServiceException.getStatusCode() != 404) {
                    cosXmlBooleanListener.onFail(cosXmlClientException, cosXmlServiceException);
                } else {
                    cosXmlBooleanListener.onSuccess(false);
                }
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                cosXmlBooleanListener.onSuccess(true);
            }
        });
    }

    public void formatConversionAsync(FormatConversionRequest formatConversionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(formatConversionRequest, new FormatConversionResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetActionSequenceResult getActionSequence(GetActionSequenceRequest getActionSequenceRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetActionSequenceResult) execute(getActionSequenceRequest, new GetActionSequenceResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getActionSequenceAsync(GetActionSequenceRequest getActionSequenceRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getActionSequenceRequest, new GetActionSequenceResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketResult getBucket(GetBucketRequest getBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketResult) execute(getBucketRequest, new GetBucketResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketACLResult getBucketACL(GetBucketACLRequest getBucketACLRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketACLResult) execute(getBucketACLRequest, new GetBucketACLResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketACLAsync(GetBucketACLRequest getBucketACLRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketACLRequest, new GetBucketACLResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketAccelerateResult getBucketAccelerate(GetBucketAccelerateRequest getBucketAccelerateRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketAccelerateResult) execute(getBucketAccelerateRequest, new GetBucketAccelerateResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketAccelerateAsync(GetBucketAccelerateRequest getBucketAccelerateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketAccelerateRequest, new GetBucketAccelerateResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketAsync(GetBucketRequest getBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketRequest, new GetBucketResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketCORSResult getBucketCORS(GetBucketCORSRequest getBucketCORSRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketCORSResult) execute(getBucketCORSRequest, new GetBucketCORSResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketCORSAsync(GetBucketCORSRequest getBucketCORSRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketCORSRequest, new GetBucketCORSResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketDomainResult getBucketDomain(GetBucketDomainRequest getBucketDomainRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketDomainResult) execute(getBucketDomainRequest, new GetBucketDomainResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketDomainAsync(GetBucketDomainRequest getBucketDomainRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketDomainRequest, new GetBucketDomainResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketIntelligentTieringResult getBucketIntelligentTiering(GetBucketIntelligentTieringRequest getBucketIntelligentTieringRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketIntelligentTieringResult) execute(getBucketIntelligentTieringRequest, new GetBucketIntelligentTieringResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketIntelligentTieringAsync(GetBucketIntelligentTieringRequest getBucketIntelligentTieringRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketIntelligentTieringRequest, new GetBucketIntelligentTieringResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketInventoryResult getBucketInventory(GetBucketInventoryRequest getBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketInventoryResult) execute(getBucketInventoryRequest, new GetBucketInventoryResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketInventoryAsync(GetBucketInventoryRequest getBucketInventoryRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketInventoryRequest, new GetBucketInventoryResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketLifecycleResult getBucketLifecycle(GetBucketLifecycleRequest getBucketLifecycleRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketLifecycleResult) execute(getBucketLifecycleRequest, new GetBucketLifecycleResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketLifecycleAsync(GetBucketLifecycleRequest getBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketLifecycleRequest, new GetBucketLifecycleResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketLocationResult getBucketLocation(GetBucketLocationRequest getBucketLocationRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketLocationResult) execute(getBucketLocationRequest, new GetBucketLocationResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketLocationAsync(GetBucketLocationRequest getBucketLocationRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketLocationRequest, new GetBucketLocationResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketLoggingResult getBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketLoggingResult) execute(getBucketLoggingRequest, new GetBucketLoggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketLoggingAsync(GetBucketLoggingRequest getBucketLoggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketLoggingRequest, new GetBucketLoggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketObjectVersionsResult getBucketObjectVersions(GetBucketObjectVersionsRequest getBucketObjectVersionsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketObjectVersionsResult) execute(getBucketObjectVersionsRequest, new GetBucketObjectVersionsResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketObjectVersionsAsync(GetBucketObjectVersionsRequest getBucketObjectVersionsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketObjectVersionsRequest, new GetBucketObjectVersionsResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketPolicyResult getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketPolicyResult) execute(getBucketPolicyRequest, new GetBucketPolicyResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketPolicyAsync(GetBucketPolicyRequest getBucketPolicyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketPolicyRequest, new GetBucketPolicyResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketRefererResult getBucketReferer(GetBucketRefererRequest getBucketRefererRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketRefererResult) execute(getBucketRefererRequest, new GetBucketRefererResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketRefererAsync(GetBucketRefererRequest getBucketRefererRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketRefererRequest, new GetBucketRefererResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketReplicationResult getBucketReplication(GetBucketReplicationRequest getBucketReplicationRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketReplicationResult) execute(getBucketReplicationRequest, new GetBucketReplicationResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketReplicationAsync(GetBucketReplicationRequest getBucketReplicationRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketReplicationRequest, new GetBucketReplicationResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketTaggingResult getBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketTaggingResult) execute(getBucketTaggingRequest, new GetBucketTaggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketTaggingAsync(GetBucketTaggingRequest getBucketTaggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketTaggingRequest, new GetBucketTaggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketVersioningResult getBucketVersioning(GetBucketVersioningRequest getBucketVersioningRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketVersioningResult) execute(getBucketVersioningRequest, new GetBucketVersioningResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketVersioningAsync(GetBucketVersioningRequest getBucketVersioningRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketVersioningRequest, new GetBucketVersioningResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetBucketWebsiteResult getBucketWebsite(GetBucketWebsiteRequest getBucketWebsiteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetBucketWebsiteResult) execute(getBucketWebsiteRequest, new GetBucketWebsiteResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getBucketWebsiteAsync(GetBucketWebsiteRequest getBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketWebsiteRequest, new GetBucketWebsiteResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetDescribeMediaBucketsResult getDescribeMediaBuckets(GetDescribeMediaBucketsRequest getDescribeMediaBucketsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetDescribeMediaBucketsResult) execute(getDescribeMediaBucketsRequest, new GetDescribeMediaBucketsResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getDescribeMediaBucketsAsync(GetDescribeMediaBucketsRequest getDescribeMediaBucketsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getDescribeMediaBucketsRequest, new GetDescribeMediaBucketsResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetLiveCodeResult getLiveCode(GetLiveCodeRequest getLiveCodeRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetLiveCodeResult) execute(getLiveCodeRequest, new GetLiveCodeResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getLiveCodeAsync(GetLiveCodeRequest getLiveCodeRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getLiveCodeRequest, new GetLiveCodeResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetMediaInfoResult getMediaInfo(GetMediaInfoRequest getMediaInfoRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetMediaInfoResult) execute(getMediaInfoRequest, new GetMediaInfoResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getMediaInfoAsync(GetMediaInfoRequest getMediaInfoRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getMediaInfoRequest, new GetMediaInfoResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectACLResult getObjectACL(GetObjectACLRequest getObjectACLRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectACLResult) execute(getObjectACLRequest, new GetObjectACLResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getObjectACLAsync(GetObjectACLRequest getObjectACLRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getObjectACLRequest, new GetObjectACLResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectTaggingResult) execute(getObjectTaggingRequest, new GetObjectTaggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getObjectTaggingAsync(GetObjectTaggingRequest getObjectTaggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getObjectTaggingRequest, new GetObjectTaggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetPrivateM3U8Result getPrivateM3U8(GetPrivateM3U8Request getPrivateM3U8Request) throws CosXmlClientException, CosXmlServiceException {
        return (GetPrivateM3U8Result) execute(getPrivateM3U8Request, new GetPrivateM3U8Result());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getPrivateM3U8Async(GetPrivateM3U8Request getPrivateM3U8Request, CosXmlResultListener cosXmlResultListener) {
        schedule(getPrivateM3U8Request, new GetPrivateM3U8Result(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXmlBaseService
    protected String getRequestHost(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return (!(cosXmlRequest instanceof GetServiceRequest) || TextUtils.isEmpty(this.getServiceRequestDomain)) ? super.getRequestHost(cosXmlRequest) : this.getServiceRequestDomain;
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetSearchImageResult getSearchImage(GetSearchImageRequest getSearchImageRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetSearchImageResult) execute(getSearchImageRequest, new GetSearchImageResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getSearchImageAsync(GetSearchImageRequest getSearchImageRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getSearchImageRequest, new GetSearchImageResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetServiceResult getService(GetServiceRequest getServiceRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetServiceResult) execute(getServiceRequest, new GetServiceResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getServiceAsync(GetServiceRequest getServiceRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getServiceRequest, new GetServiceResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetSnapshotResult getSnapshot(GetSnapshotRequest getSnapshotRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetSnapshotResult) execute(getSnapshotRequest, new GetSnapshotResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getSnapshotAsync(GetSnapshotRequest getSnapshotRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getSnapshotRequest, new GetSnapshotResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetWorkflowDetailResult getWorkflowDetail(GetWorkflowDetailRequest getWorkflowDetailRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetWorkflowDetailResult) execute(getWorkflowDetailRequest, new GetWorkflowDetailResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void getWorkflowDetailAsync(GetWorkflowDetailRequest getWorkflowDetailRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getWorkflowDetailRequest, new GetWorkflowDetailResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectResult goodsMatting(GoodsMattingRequest goodsMattingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(goodsMattingRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void goodsMattingAsync(GoodsMattingRequest goodsMattingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(goodsMattingRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public HeadBucketResult headBucket(HeadBucketRequest headBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (HeadBucketResult) execute(headBucketRequest, new HeadBucketResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void headBucketAsync(HeadBucketRequest headBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(headBucketRequest, new HeadBucketResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public GetObjectResult imageRepair(ImageRepairRequest imageRepairRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(imageRepairRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void imageRepairAsync(ImageRepairRequest imageRepairRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(imageRepairRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public ListBucketInventoryResult listBucketInventory(ListBucketInventoryRequest listBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException {
        return (ListBucketInventoryResult) execute(listBucketInventoryRequest, new ListBucketInventoryResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void listBucketInventoryAsync(ListBucketInventoryRequest listBucketInventoryRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(listBucketInventoryRequest, new ListBucketInventoryResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public ListBucketVersionsResult listBucketVersions(ListBucketVersionsRequest listBucketVersionsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (ListBucketVersionsResult) execute(listBucketVersionsRequest, new ListBucketVersionsResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void listBucketVersionsAsync(ListBucketVersionsRequest listBucketVersionsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(listBucketVersionsRequest, new ListBucketVersionsResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public LivenessRecognitionResult livenessRecognition(LivenessRecognitionRequest livenessRecognitionRequest) throws CosXmlClientException, CosXmlServiceException {
        return (LivenessRecognitionResult) execute(livenessRecognitionRequest, new LivenessRecognitionResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void livenessRecognitionAsync(LivenessRecognitionRequest livenessRecognitionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(livenessRecognitionRequest, new LivenessRecognitionResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public OptionObjectResult optionObject(OptionObjectRequest optionObjectRequest) throws CosXmlClientException, CosXmlServiceException {
        return (OptionObjectResult) execute(optionObjectRequest, new OptionObjectResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void optionObjectAsync(OptionObjectRequest optionObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(optionObjectRequest, new OptionObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PreviewDocumentResult previewDocument(PreviewDocumentRequest previewDocumentRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PreviewDocumentResult) execute(previewDocumentRequest, new PreviewDocumentResult(previewDocumentRequest.getDownloadPath()));
    }

    @Override // com.tencent.cos.xml.CosXml
    public void previewDocumentAsync(PreviewDocumentRequest previewDocumentRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(previewDocumentRequest, new PreviewDocumentResult(previewDocumentRequest.getDownloadPath()), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PreviewDocumentInHtmlResult previewDocumentInHtml(PreviewDocumentInHtmlRequest previewDocumentInHtmlRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PreviewDocumentInHtmlResult) execute(previewDocumentInHtmlRequest, new PreviewDocumentInHtmlResult(previewDocumentInHtmlRequest.getDownloadPath()));
    }

    @Override // com.tencent.cos.xml.CosXml
    public void previewDocumentInHtmlAsync(PreviewDocumentInHtmlRequest previewDocumentInHtmlRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(previewDocumentInHtmlRequest, new PreviewDocumentInHtmlResult(previewDocumentInHtmlRequest.getDownloadPath()), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public byte[] previewDocumentInHtmlBytes(String str, String str2) throws CosXmlClientException, CosXmlServiceException {
        PreviewDocumentInHtmlBytesResult previewDocumentInHtmlBytesResult = (PreviewDocumentInHtmlBytesResult) execute(new PreviewDocumentInHtmlBytesRequest(str, str2), new PreviewDocumentInHtmlBytesResult());
        return previewDocumentInHtmlBytesResult != null ? previewDocumentInHtmlBytesResult.getData() : new byte[0];
    }

    @Override // com.tencent.cos.xml.CosXml
    public PreviewDocumentInHtmlLinkResult previewDocumentInHtmlLink(PreviewDocumentInHtmlLinkRequest previewDocumentInHtmlLinkRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PreviewDocumentInHtmlLinkResult) execute(previewDocumentInHtmlLinkRequest, new PreviewDocumentInHtmlLinkResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void previewDocumentInHtmlLinkAsync(PreviewDocumentInHtmlLinkRequest previewDocumentInHtmlLinkRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(previewDocumentInHtmlLinkRequest, new PreviewDocumentInHtmlLinkResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketResult putBucket(PutBucketRequest putBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketResult) execute(putBucketRequest, new PutBucketResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketACLResult putBucketACL(PutBucketACLRequest putBucketACLRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketACLResult) execute(putBucketACLRequest, new PutBucketACLResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketACLAsync(PutBucketACLRequest putBucketACLRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketACLRequest, new PutBucketACLResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketAccelerateResult putBucketAccelerate(PutBucketAccelerateRequest putBucketAccelerateRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketAccelerateResult) execute(putBucketAccelerateRequest, new PutBucketAccelerateResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketAccelerateAsync(PutBucketAccelerateRequest putBucketAccelerateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketAccelerateRequest, new PutBucketAccelerateResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketAsync(PutBucketRequest putBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketRequest, new PutBucketResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketCORSResult putBucketCORS(PutBucketCORSRequest putBucketCORSRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketCORSResult) execute(putBucketCORSRequest, new PutBucketCORSResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketCORSAsync(PutBucketCORSRequest putBucketCORSRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketCORSRequest, new PutBucketCORSResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketDomainResult putBucketDomain(PutBucketDomainRequest putBucketDomainRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketDomainResult) execute(putBucketDomainRequest, new PutBucketDomainResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketDomainAsync(PutBucketDomainRequest putBucketDomainRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketDomainRequest, new PutBucketDomainResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketIntelligentTieringResult putBucketIntelligentTiering(PutBucketIntelligentTieringRequest putBucketIntelligentTieringRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketIntelligentTieringResult) execute(putBucketIntelligentTieringRequest, new PutBucketIntelligentTieringResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketIntelligentTieringAsync(PutBucketIntelligentTieringRequest putBucketIntelligentTieringRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketIntelligentTieringRequest, new PutBucketIntelligentTieringResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketInventoryResult putBucketInventory(PutBucketInventoryRequest putBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketInventoryResult) execute(putBucketInventoryRequest, new PutBucketInventoryResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketInventoryAsync(PutBucketInventoryRequest putBucketInventoryRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketInventoryRequest, new PutBucketInventoryResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketLifecycleResult putBucketLifecycle(PutBucketLifecycleRequest putBucketLifecycleRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketLifecycleResult) execute(putBucketLifecycleRequest, new PutBucketLifecycleResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketLifecycleAsync(PutBucketLifecycleRequest putBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketLifecycleRequest, new PutBucketLifecycleResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketLoggingResult putBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketLoggingResult) execute(putBucketLoggingRequest, new PutBucketLoggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketLoggingAsync(PutBucketLoggingRequest putBucketLoggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketLoggingRequest, new PutBucketLoggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketPolicyResult putBucketPolicy(PutBucketPolicyRequest putBucketPolicyRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketPolicyResult) execute(putBucketPolicyRequest, new PutBucketPolicyResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketPolicyAsync(PutBucketPolicyRequest putBucketPolicyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketPolicyRequest, new PutBucketPolicyResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketRefererResult putBucketReferer(PutBucketRefererRequest putBucketRefererRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketRefererResult) execute(putBucketRefererRequest, new PutBucketRefererResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketRefererAsync(PutBucketRefererRequest putBucketRefererRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketRefererRequest, new PutBucketRefererResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketReplicationResult putBucketReplication(PutBucketReplicationRequest putBucketReplicationRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketReplicationResult) execute(putBucketReplicationRequest, new PutBucketReplicationResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketReplicationAsync(PutBucketReplicationRequest putBucketReplicationRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketReplicationRequest, new PutBucketReplicationResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketTaggingResult putBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketTaggingResult) execute(putBucketTaggingRequest, new PutBucketTaggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketTaggingAsync(PutBucketTaggingRequest putBucketTaggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketTaggingRequest, new PutBucketTaggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketVersionAsync(PutBucketVersioningRequest putBucketVersioningRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketVersioningRequest, new PutBucketVersioningResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketVersioningResult putBucketVersioning(PutBucketVersioningRequest putBucketVersioningRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketVersioningResult) execute(putBucketVersioningRequest, new PutBucketVersioningResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutBucketWebsiteResult putBucketWebsite(PutBucketWebsiteRequest putBucketWebsiteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketWebsiteResult) execute(putBucketWebsiteRequest, new PutBucketWebsiteResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putBucketWebsiteAsync(PutBucketWebsiteRequest putBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketWebsiteRequest, new PutBucketWebsiteResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutObjectACLResult putObjectACL(PutObjectACLRequest putObjectACLRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutObjectACLResult) execute(putObjectACLRequest, new PutObjectACLResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putObjectACLAsync(PutObjectACLRequest putObjectACLRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putObjectACLRequest, new PutObjectACLResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public PutObjectTaggingResult putObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutObjectTaggingResult) execute(putObjectTaggingRequest, new PutObjectTaggingResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void putObjectTaggingAsync(PutObjectTaggingRequest putObjectTaggingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putObjectTaggingRequest, new PutObjectTaggingResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public RecognitionQRcodeResult recognitionQRcode(RecognitionQRcodeRequest recognitionQRcodeRequest) throws CosXmlClientException, CosXmlServiceException {
        return (RecognitionQRcodeResult) execute(recognitionQRcodeRequest, new RecognitionQRcodeResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void recognitionQRcodeAsync(RecognitionQRcodeRequest recognitionQRcodeRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(recognitionQRcodeRequest, new RecognitionQRcodeResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public RecognizeLogoResult recognizeLogo(RecognizeLogoRequest recognizeLogoRequest) throws CosXmlClientException, CosXmlServiceException {
        return (RecognizeLogoResult) execute(recognizeLogoRequest, new RecognizeLogoResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void recognizeLogoAsync(RecognizeLogoRequest recognizeLogoRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(recognizeLogoRequest, new RecognizeLogoResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public RestoreResult restoreObject(RestoreRequest restoreRequest) throws CosXmlClientException, CosXmlServiceException {
        return (RestoreResult) execute(restoreRequest, new RestoreResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void restoreObjectAsync(RestoreRequest restoreRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(restoreRequest, new RestoreResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXml
    public SelectObjectContentResult selectObjectContent(SelectObjectContentRequest selectObjectContentRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SelectObjectContentResult) execute(selectObjectContentRequest, new SelectObjectContentResult());
    }

    @Override // com.tencent.cos.xml.CosXml
    public void selectObjectContentAsync(SelectObjectContentRequest selectObjectContentRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(selectObjectContentRequest, new SelectObjectContentResult(), cosXmlResultListener);
    }

    public void setServiceDomain(String str) {
        this.getServiceRequestDomain = str;
    }

    @Override // com.tencent.cos.xml.CosXmlBaseService
    protected String signerTypeCompat(String str, CosXmlRequest cosXmlRequest) {
        return ((cosXmlRequest instanceof GetDescribeMediaBucketsRequest) && ProtectedSandApp.s("㑕\u0001").equals(str)) ? ProtectedSandApp.s("㑖\u0001") : str;
    }

    @Override // com.tencent.cos.xml.CosXml
    @Deprecated
    public boolean updateObjectMeta(String str, String str2, COSMetaData cOSMetaData) throws CosXmlClientException, CosXmlServiceException {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, new CopyObjectRequest.CopySourceStruct(this.config.getAppid(), str, this.config.getRegion(), str2));
        copyObjectRequest.setCopyMetaDataDirective(MetaDataDirective.REPLACED);
        for (String str3 : cOSMetaData.keySet()) {
            copyObjectRequest.setXCOSMeta(str3, cOSMetaData.get(str3));
        }
        copyObject(copyObjectRequest);
        return true;
    }

    @Override // com.tencent.cos.xml.CosXml
    @Deprecated
    public void updateObjectMetaAsync(String str, String str2, COSMetaData cOSMetaData, final CosXmlBooleanListener cosXmlBooleanListener) {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, new CopyObjectRequest.CopySourceStruct(this.config.getAppid(), str, this.config.getRegion(), str2));
        copyObjectRequest.setCopyMetaDataDirective(MetaDataDirective.REPLACED);
        for (String str3 : cOSMetaData.keySet()) {
            copyObjectRequest.setXCOSMeta(str3, cOSMetaData.get(str3));
        }
        copyObjectAsync(copyObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.CosXmlService.4
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                cosXmlBooleanListener.onFail(cosXmlClientException, cosXmlServiceException);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                cosXmlBooleanListener.onSuccess(true);
            }
        });
    }

    @Override // com.tencent.cos.xml.CosXml
    public boolean updateObjectMetaData(String str, String str2, COSMetaData cOSMetaData) throws CosXmlClientException, CosXmlServiceException {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, new CopyObjectRequest.CopySourceStruct(str, this.config.getRegion(), str2));
        copyObjectRequest.setCopyMetaDataDirective(MetaDataDirective.REPLACED);
        for (String str3 : cOSMetaData.keySet()) {
            copyObjectRequest.setXCOSMeta(str3, cOSMetaData.get(str3));
        }
        copyObject(copyObjectRequest);
        return true;
    }

    @Override // com.tencent.cos.xml.CosXml
    public void updateObjectMetaDataAsync(String str, String str2, COSMetaData cOSMetaData, final CosXmlBooleanListener cosXmlBooleanListener) {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, new CopyObjectRequest.CopySourceStruct(str, this.config.getRegion(), str2));
        copyObjectRequest.setCopyMetaDataDirective(MetaDataDirective.REPLACED);
        for (String str3 : cOSMetaData.keySet()) {
            copyObjectRequest.setXCOSMeta(str3, cOSMetaData.get(str3));
        }
        copyObjectAsync(copyObjectRequest, new CosXmlResultListener() { // from class: com.tencent.cos.xml.CosXmlService.5
            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onFail(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
                cosXmlBooleanListener.onFail(cosXmlClientException, cosXmlServiceException);
            }

            @Override // com.tencent.cos.xml.listener.CosXmlResultListener
            public void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult) {
                cosXmlBooleanListener.onSuccess(true);
            }
        });
    }

    public CosXmlService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudSigner qCloudSigner) {
        super(context, cosXmlServiceConfig, qCloudSigner);
    }

    public CosXmlService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudSelfSigner qCloudSelfSigner) {
        super(context, cosXmlServiceConfig, qCloudSelfSigner);
    }

    public CosXmlService(Context context, CosXmlServiceConfig cosXmlServiceConfig) {
        super(context, cosXmlServiceConfig);
    }

    @Override // com.tencent.cos.xml.CosXml
    public byte[] previewDocumentInHtmlBytes(PreviewDocumentInHtmlBytesRequest previewDocumentInHtmlBytesRequest) throws CosXmlClientException, CosXmlServiceException {
        PreviewDocumentInHtmlBytesResult previewDocumentInHtmlBytesResult = (PreviewDocumentInHtmlBytesResult) execute(previewDocumentInHtmlBytesRequest, new PreviewDocumentInHtmlBytesResult());
        return previewDocumentInHtmlBytesResult != null ? previewDocumentInHtmlBytesResult.getData() : new byte[0];
    }
}
