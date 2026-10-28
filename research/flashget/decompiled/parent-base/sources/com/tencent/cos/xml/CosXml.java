package com.tencent.cos.xml;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlBooleanListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
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
import com.tencent.cos.xml.model.ci.GetDescribeMediaBucketsRequest;
import com.tencent.cos.xml.model.ci.GetDescribeMediaBucketsResult;
import com.tencent.cos.xml.model.ci.GetMediaInfoRequest;
import com.tencent.cos.xml.model.ci.GetMediaInfoResult;
import com.tencent.cos.xml.model.ci.GetSnapshotRequest;
import com.tencent.cos.xml.model.ci.GetSnapshotResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlBytesRequest;
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
import com.tencent.cos.xml.model.object.DeleteMultiObjectRequest;
import com.tencent.cos.xml.model.object.DeleteMultiObjectResult;
import com.tencent.cos.xml.model.object.DeleteObjectTaggingRequest;
import com.tencent.cos.xml.model.object.DeleteObjectTaggingResult;
import com.tencent.cos.xml.model.object.GetObjectACLRequest;
import com.tencent.cos.xml.model.object.GetObjectACLResult;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.GetObjectTaggingRequest;
import com.tencent.cos.xml.model.object.GetObjectTaggingResult;
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

/* loaded from: classes6.dex */
public interface CosXml extends SimpleCosXml {
    EmptyResponseResult addImageSearch(AddImageSearchRequest addImageSearchRequest) throws CosXmlClientException, CosXmlServiceException;

    void addImageSearchAsync(AddImageSearchRequest addImageSearchRequest, CosXmlResultListener cosXmlResultListener);

    AIBodyRecognitionResult aiBodyRecognition(AIBodyRecognitionRequest aIBodyRecognitionRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiBodyRecognitionAsync(AIBodyRecognitionRequest aIBodyRecognitionRequest, CosXmlResultListener cosXmlResultListener);

    AIDetectCarResult aiDetectCar(AIDetectCarRequest aIDetectCarRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiDetectCarAsync(AIDetectCarRequest aIDetectCarRequest, CosXmlResultListener cosXmlResultListener);

    AIDetectFaceResult aiDetectFace(AIDetectFaceRequest aIDetectFaceRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiDetectFaceAsync(AIDetectFaceRequest aIDetectFaceRequest, CosXmlResultListener cosXmlResultListener);

    AIDetectPetResult aiDetectPet(AIDetectPetRequest aIDetectPetRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiDetectPetAsync(AIDetectPetRequest aIDetectPetRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult aiEnhanceImage(AIEnhanceImageRequest aIEnhanceImageRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiEnhanceImageAsync(AIEnhanceImageRequest aIEnhanceImageRequest, CosXmlResultListener cosXmlResultListener);

    AIFaceEffectResult aiFaceEffect(AIFaceEffectRequest aIFaceEffectRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiFaceEffectAsync(AIFaceEffectRequest aIFaceEffectRequest, CosXmlResultListener cosXmlResultListener);

    AIGameRecResult aiGameRec(AIGameRecRequest aIGameRecRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiGameRecAsync(AIGameRecRequest aIGameRecRequest, CosXmlResultListener cosXmlResultListener);

    AIIDCardOCRResult aiIDCardOCR(AIIDCardOCRRequest aIIDCardOCRRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiIDCardOCRAsync(AIIDCardOCRRequest aIIDCardOCRRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult aiImageColoring(AIImageColoringRequest aIImageColoringRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiImageColoringAsync(AIImageColoringRequest aIImageColoringRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult aiImageCrop(AIImageCropRequest aIImageCropRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiImageCropAsync(AIImageCropRequest aIImageCropRequest, CosXmlResultListener cosXmlResultListener);

    AILicenseRecResult aiLicenseRec(AILicenseRecRequest aILicenseRecRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiLicenseRecAsync(AILicenseRecRequest aILicenseRecRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult aiSuperResolution(AISuperResolutionRequest aISuperResolutionRequest) throws CosXmlClientException, CosXmlServiceException;

    void aiSuperResolutionAsync(AISuperResolutionRequest aISuperResolutionRequest, CosXmlResultListener cosXmlResultListener);

    AppendObjectResult appendObject(AppendObjectRequest appendObjectRequest) throws CosXmlClientException, CosXmlServiceException;

    void appendObjectAsync(AppendObjectRequest appendObjectRequest, CosXmlResultListener cosXmlResultListener);

    AssessQualityResult assessQuality(AssessQualityRequest assessQualityRequest) throws CosXmlClientException, CosXmlServiceException;

    void assessQualityAsync(AssessQualityRequest assessQualityRequest, CosXmlResultListener cosXmlResultListener);

    AutoTranslationBlockResult autoTranslationBlock(AutoTranslationBlockRequest autoTranslationBlockRequest) throws CosXmlClientException, CosXmlServiceException;

    void autoTranslationBlockAsync(AutoTranslationBlockRequest autoTranslationBlockRequest, CosXmlResultListener cosXmlResultListener);

    COSOCRResult cOSOCR(COSOCRRequest cOSOCRRequest) throws CosXmlClientException, CosXmlServiceException;

    void cOSOCRAsync(COSOCRRequest cOSOCRRequest, CosXmlResultListener cosXmlResultListener);

    CreateCRcodeResult createCRcode(CreateCRcodeRequest createCRcodeRequest) throws CosXmlClientException, CosXmlServiceException;

    void createCRcodeAsync(CreateCRcodeRequest createCRcodeRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketResult deleteBucket(DeleteBucketRequest deleteBucketRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketAsync(DeleteBucketRequest deleteBucketRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketCORSResult deleteBucketCORS(DeleteBucketCORSRequest deleteBucketCORSRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketCORSAsync(DeleteBucketCORSRequest deleteBucketCORSRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketDomainResult deleteBucketDomain(DeleteBucketDomainRequest deleteBucketDomainRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketDomainAsync(DeleteBucketDomainRequest deleteBucketDomainRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketInventoryResult deleteBucketInventory(DeleteBucketInventoryRequest deleteBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketInventoryAsync(DeleteBucketInventoryRequest deleteBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketLifecycleResult deleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketLifecycleAsync(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketPolicyResult deleteBucketPolicy(DeleteBucketPolicyRequest deleteBucketPolicyRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketPolicyAsync(DeleteBucketPolicyRequest deleteBucketPolicyRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketReplicationResult deleteBucketReplication(DeleteBucketReplicationRequest deleteBucketReplicationRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketReplicationAsync(DeleteBucketReplicationRequest deleteBucketReplicationRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketTaggingResult deleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketTaggingAsync(DeleteBucketTaggingRequest deleteBucketTaggingRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketWebsiteResult deleteBucketWebsite(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteBucketWebsiteAsync(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener);

    EmptyResponseResult deleteImageSearch(DeleteImageSearchRequest deleteImageSearchRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteImageSearchAsync(DeleteImageSearchRequest deleteImageSearchRequest, CosXmlResultListener cosXmlResultListener);

    DeleteMultiObjectResult deleteMultiObject(DeleteMultiObjectRequest deleteMultiObjectRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteMultiObjectAsync(DeleteMultiObjectRequest deleteMultiObjectRequest, CosXmlResultListener cosXmlResultListener);

    boolean deleteObject(String str, String str2) throws CosXmlClientException, CosXmlServiceException;

    void deleteObjectAsync(String str, String str2, CosXmlBooleanListener cosXmlBooleanListener);

    DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void deleteObjectTaggingAsync(DeleteObjectTaggingRequest deleteObjectTaggingRequest, CosXmlResultListener cosXmlResultListener);

    DetectLabelResult detectLabel(DetectLabelRequest detectLabelRequest) throws CosXmlClientException, CosXmlServiceException;

    void detectLabelAsync(DetectLabelRequest detectLabelRequest, CosXmlResultListener cosXmlResultListener);

    boolean doesBucketExist(String str) throws CosXmlClientException, CosXmlServiceException;

    void doesBucketExistAsync(String str, CosXmlBooleanListener cosXmlBooleanListener);

    boolean doesObjectExist(String str, String str2) throws CosXmlClientException, CosXmlServiceException;

    void doesObjectExistAsync(String str, String str2, CosXmlBooleanListener cosXmlBooleanListener);

    GetActionSequenceResult getActionSequence(GetActionSequenceRequest getActionSequenceRequest) throws CosXmlClientException, CosXmlServiceException;

    void getActionSequenceAsync(GetActionSequenceRequest getActionSequenceRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketResult getBucket(GetBucketRequest getBucketRequest) throws CosXmlClientException, CosXmlServiceException;

    GetBucketACLResult getBucketACL(GetBucketACLRequest getBucketACLRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketACLAsync(GetBucketACLRequest getBucketACLRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketAccelerateResult getBucketAccelerate(GetBucketAccelerateRequest getBucketAccelerateRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketAccelerateAsync(GetBucketAccelerateRequest getBucketAccelerateRequest, CosXmlResultListener cosXmlResultListener);

    void getBucketAsync(GetBucketRequest getBucketRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketCORSResult getBucketCORS(GetBucketCORSRequest getBucketCORSRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketCORSAsync(GetBucketCORSRequest getBucketCORSRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketDomainResult getBucketDomain(GetBucketDomainRequest getBucketDomainRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketDomainAsync(GetBucketDomainRequest getBucketDomainRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketIntelligentTieringResult getBucketIntelligentTiering(GetBucketIntelligentTieringRequest getBucketIntelligentTieringRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketIntelligentTieringAsync(GetBucketIntelligentTieringRequest getBucketIntelligentTieringRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketInventoryResult getBucketInventory(GetBucketInventoryRequest getBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketInventoryAsync(GetBucketInventoryRequest getBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketLifecycleResult getBucketLifecycle(GetBucketLifecycleRequest getBucketLifecycleRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketLifecycleAsync(GetBucketLifecycleRequest getBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketLocationResult getBucketLocation(GetBucketLocationRequest getBucketLocationRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketLocationAsync(GetBucketLocationRequest getBucketLocationRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketLoggingResult getBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketLoggingAsync(GetBucketLoggingRequest getBucketLoggingRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketObjectVersionsResult getBucketObjectVersions(GetBucketObjectVersionsRequest getBucketObjectVersionsRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketObjectVersionsAsync(GetBucketObjectVersionsRequest getBucketObjectVersionsRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketPolicyResult getBucketPolicy(GetBucketPolicyRequest getBucketPolicyRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketPolicyAsync(GetBucketPolicyRequest getBucketPolicyRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketRefererResult getBucketReferer(GetBucketRefererRequest getBucketRefererRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketRefererAsync(GetBucketRefererRequest getBucketRefererRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketReplicationResult getBucketReplication(GetBucketReplicationRequest getBucketReplicationRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketReplicationAsync(GetBucketReplicationRequest getBucketReplicationRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketTaggingResult getBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketTaggingAsync(GetBucketTaggingRequest getBucketTaggingRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketVersioningResult getBucketVersioning(GetBucketVersioningRequest getBucketVersioningRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketVersioningAsync(GetBucketVersioningRequest getBucketVersioningRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketWebsiteResult getBucketWebsite(GetBucketWebsiteRequest getBucketWebsiteRequest) throws CosXmlClientException, CosXmlServiceException;

    void getBucketWebsiteAsync(GetBucketWebsiteRequest getBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener);

    GetDescribeMediaBucketsResult getDescribeMediaBuckets(GetDescribeMediaBucketsRequest getDescribeMediaBucketsRequest) throws CosXmlClientException, CosXmlServiceException;

    void getDescribeMediaBucketsAsync(GetDescribeMediaBucketsRequest getDescribeMediaBucketsRequest, CosXmlResultListener cosXmlResultListener);

    GetLiveCodeResult getLiveCode(GetLiveCodeRequest getLiveCodeRequest) throws CosXmlClientException, CosXmlServiceException;

    void getLiveCodeAsync(GetLiveCodeRequest getLiveCodeRequest, CosXmlResultListener cosXmlResultListener);

    GetMediaInfoResult getMediaInfo(GetMediaInfoRequest getMediaInfoRequest) throws CosXmlClientException, CosXmlServiceException;

    void getMediaInfoAsync(GetMediaInfoRequest getMediaInfoRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectACLResult getObjectACL(GetObjectACLRequest getObjectACLRequest) throws CosXmlClientException, CosXmlServiceException;

    void getObjectACLAsync(GetObjectACLRequest getObjectACLRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void getObjectTaggingAsync(GetObjectTaggingRequest getObjectTaggingRequest, CosXmlResultListener cosXmlResultListener);

    GetPrivateM3U8Result getPrivateM3U8(GetPrivateM3U8Request getPrivateM3U8Request) throws CosXmlClientException, CosXmlServiceException;

    void getPrivateM3U8Async(GetPrivateM3U8Request getPrivateM3U8Request, CosXmlResultListener cosXmlResultListener);

    GetSearchImageResult getSearchImage(GetSearchImageRequest getSearchImageRequest) throws CosXmlClientException, CosXmlServiceException;

    void getSearchImageAsync(GetSearchImageRequest getSearchImageRequest, CosXmlResultListener cosXmlResultListener);

    GetServiceResult getService(GetServiceRequest getServiceRequest) throws CosXmlClientException, CosXmlServiceException;

    void getServiceAsync(GetServiceRequest getServiceRequest, CosXmlResultListener cosXmlResultListener);

    GetSnapshotResult getSnapshot(GetSnapshotRequest getSnapshotRequest) throws CosXmlClientException, CosXmlServiceException;

    void getSnapshotAsync(GetSnapshotRequest getSnapshotRequest, CosXmlResultListener cosXmlResultListener);

    GetWorkflowDetailResult getWorkflowDetail(GetWorkflowDetailRequest getWorkflowDetailRequest) throws CosXmlClientException, CosXmlServiceException;

    void getWorkflowDetailAsync(GetWorkflowDetailRequest getWorkflowDetailRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult goodsMatting(GoodsMattingRequest goodsMattingRequest) throws CosXmlClientException, CosXmlServiceException;

    void goodsMattingAsync(GoodsMattingRequest goodsMattingRequest, CosXmlResultListener cosXmlResultListener);

    HeadBucketResult headBucket(HeadBucketRequest headBucketRequest) throws CosXmlClientException, CosXmlServiceException;

    void headBucketAsync(HeadBucketRequest headBucketRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult imageRepair(ImageRepairRequest imageRepairRequest) throws CosXmlClientException, CosXmlServiceException;

    void imageRepairAsync(ImageRepairRequest imageRepairRequest, CosXmlResultListener cosXmlResultListener);

    ListBucketInventoryResult listBucketInventory(ListBucketInventoryRequest listBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException;

    void listBucketInventoryAsync(ListBucketInventoryRequest listBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    ListBucketVersionsResult listBucketVersions(ListBucketVersionsRequest listBucketVersionsRequest) throws CosXmlClientException, CosXmlServiceException;

    void listBucketVersionsAsync(ListBucketVersionsRequest listBucketVersionsRequest, CosXmlResultListener cosXmlResultListener);

    LivenessRecognitionResult livenessRecognition(LivenessRecognitionRequest livenessRecognitionRequest) throws CosXmlClientException, CosXmlServiceException;

    void livenessRecognitionAsync(LivenessRecognitionRequest livenessRecognitionRequest, CosXmlResultListener cosXmlResultListener);

    OptionObjectResult optionObject(OptionObjectRequest optionObjectRequest) throws CosXmlClientException, CosXmlServiceException;

    void optionObjectAsync(OptionObjectRequest optionObjectRequest, CosXmlResultListener cosXmlResultListener);

    PreviewDocumentResult previewDocument(PreviewDocumentRequest previewDocumentRequest) throws CosXmlClientException, CosXmlServiceException;

    void previewDocumentAsync(PreviewDocumentRequest previewDocumentRequest, CosXmlResultListener cosXmlResultListener);

    PreviewDocumentInHtmlResult previewDocumentInHtml(PreviewDocumentInHtmlRequest previewDocumentInHtmlRequest) throws CosXmlClientException, CosXmlServiceException;

    void previewDocumentInHtmlAsync(PreviewDocumentInHtmlRequest previewDocumentInHtmlRequest, CosXmlResultListener cosXmlResultListener);

    byte[] previewDocumentInHtmlBytes(PreviewDocumentInHtmlBytesRequest previewDocumentInHtmlBytesRequest) throws CosXmlClientException, CosXmlServiceException;

    byte[] previewDocumentInHtmlBytes(String str, String str2) throws CosXmlClientException, CosXmlServiceException;

    PreviewDocumentInHtmlLinkResult previewDocumentInHtmlLink(PreviewDocumentInHtmlLinkRequest previewDocumentInHtmlLinkRequest) throws CosXmlClientException, CosXmlServiceException;

    void previewDocumentInHtmlLinkAsync(PreviewDocumentInHtmlLinkRequest previewDocumentInHtmlLinkRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketResult putBucket(PutBucketRequest putBucketRequest) throws CosXmlClientException, CosXmlServiceException;

    PutBucketACLResult putBucketACL(PutBucketACLRequest putBucketACLRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketACLAsync(PutBucketACLRequest putBucketACLRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketAccelerateResult putBucketAccelerate(PutBucketAccelerateRequest putBucketAccelerateRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketAccelerateAsync(PutBucketAccelerateRequest putBucketAccelerateRequest, CosXmlResultListener cosXmlResultListener);

    void putBucketAsync(PutBucketRequest putBucketRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketCORSResult putBucketCORS(PutBucketCORSRequest putBucketCORSRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketCORSAsync(PutBucketCORSRequest putBucketCORSRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketDomainResult putBucketDomain(PutBucketDomainRequest putBucketDomainRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketDomainAsync(PutBucketDomainRequest putBucketDomainRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketIntelligentTieringResult putBucketIntelligentTiering(PutBucketIntelligentTieringRequest putBucketIntelligentTieringRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketIntelligentTieringAsync(PutBucketIntelligentTieringRequest putBucketIntelligentTieringRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketInventoryResult putBucketInventory(PutBucketInventoryRequest putBucketInventoryRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketInventoryAsync(PutBucketInventoryRequest putBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketLifecycleResult putBucketLifecycle(PutBucketLifecycleRequest putBucketLifecycleRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketLifecycleAsync(PutBucketLifecycleRequest putBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketLoggingResult putBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketLoggingAsync(PutBucketLoggingRequest putBucketLoggingRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketPolicyResult putBucketPolicy(PutBucketPolicyRequest putBucketPolicyRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketPolicyAsync(PutBucketPolicyRequest putBucketPolicyRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketRefererResult putBucketReferer(PutBucketRefererRequest putBucketRefererRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketRefererAsync(PutBucketRefererRequest putBucketRefererRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketReplicationResult putBucketReplication(PutBucketReplicationRequest putBucketReplicationRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketReplicationAsync(PutBucketReplicationRequest putBucketReplicationRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketTaggingResult putBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketTaggingAsync(PutBucketTaggingRequest putBucketTaggingRequest, CosXmlResultListener cosXmlResultListener);

    void putBucketVersionAsync(PutBucketVersioningRequest putBucketVersioningRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketVersioningResult putBucketVersioning(PutBucketVersioningRequest putBucketVersioningRequest) throws CosXmlClientException, CosXmlServiceException;

    PutBucketWebsiteResult putBucketWebsite(PutBucketWebsiteRequest putBucketWebsiteRequest) throws CosXmlClientException, CosXmlServiceException;

    void putBucketWebsiteAsync(PutBucketWebsiteRequest putBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener);

    PutObjectACLResult putObjectACL(PutObjectACLRequest putObjectACLRequest) throws CosXmlClientException, CosXmlServiceException;

    void putObjectACLAsync(PutObjectACLRequest putObjectACLRequest, CosXmlResultListener cosXmlResultListener);

    PutObjectTaggingResult putObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest) throws CosXmlClientException, CosXmlServiceException;

    void putObjectTaggingAsync(PutObjectTaggingRequest putObjectTaggingRequest, CosXmlResultListener cosXmlResultListener);

    RecognitionQRcodeResult recognitionQRcode(RecognitionQRcodeRequest recognitionQRcodeRequest) throws CosXmlClientException, CosXmlServiceException;

    void recognitionQRcodeAsync(RecognitionQRcodeRequest recognitionQRcodeRequest, CosXmlResultListener cosXmlResultListener);

    RecognizeLogoResult recognizeLogo(RecognizeLogoRequest recognizeLogoRequest) throws CosXmlClientException, CosXmlServiceException;

    void recognizeLogoAsync(RecognizeLogoRequest recognizeLogoRequest, CosXmlResultListener cosXmlResultListener);

    RestoreResult restoreObject(RestoreRequest restoreRequest) throws CosXmlClientException, CosXmlServiceException;

    void restoreObjectAsync(RestoreRequest restoreRequest, CosXmlResultListener cosXmlResultListener);

    SelectObjectContentResult selectObjectContent(SelectObjectContentRequest selectObjectContentRequest) throws CosXmlClientException, CosXmlServiceException;

    void selectObjectContentAsync(SelectObjectContentRequest selectObjectContentRequest, CosXmlResultListener cosXmlResultListener);

    @Deprecated
    boolean updateObjectMeta(String str, String str2, COSMetaData cOSMetaData) throws CosXmlClientException, CosXmlServiceException;

    @Deprecated
    void updateObjectMetaAsync(String str, String str2, COSMetaData cOSMetaData, CosXmlBooleanListener cosXmlBooleanListener);

    boolean updateObjectMetaData(String str, String str2, COSMetaData cOSMetaData) throws CosXmlClientException, CosXmlServiceException;

    void updateObjectMetaDataAsync(String str, String str2, COSMetaData cOSMetaData, CosXmlBooleanListener cosXmlBooleanListener);
}
