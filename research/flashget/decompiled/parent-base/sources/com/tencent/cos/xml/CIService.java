package com.tencent.cos.xml;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.EmptyResponseResult;
import com.tencent.cos.xml.model.ci.DeleteBucketDPStateRequest;
import com.tencent.cos.xml.model.ci.DeleteBucketDPStateResult;
import com.tencent.cos.xml.model.ci.DescribeDocProcessBucketsRequest;
import com.tencent.cos.xml.model.ci.DescribeDocProcessBucketsResult;
import com.tencent.cos.xml.model.ci.PutBucketDPStateRequest;
import com.tencent.cos.xml.model.ci.PutBucketDPStateResult;
import com.tencent.cos.xml.model.ci.QRCodeUploadRequest;
import com.tencent.cos.xml.model.ci.QRCodeUploadResult;
import com.tencent.cos.xml.model.ci.SensitiveContentRecognitionRequest;
import com.tencent.cos.xml.model.ci.SensitiveContentRecognitionResult;
import com.tencent.cos.xml.model.ci.ai.CloseAIBucketRequest;
import com.tencent.cos.xml.model.ci.ai.CloseAIBucketResult;
import com.tencent.cos.xml.model.ci.ai.CloseAsrBucketRequest;
import com.tencent.cos.xml.model.ci.ai.CloseAsrBucketResult;
import com.tencent.cos.xml.model.ci.ai.CreateWordsGeneralizeJobRequest;
import com.tencent.cos.xml.model.ci.ai.CreateWordsGeneralizeJobResult;
import com.tencent.cos.xml.model.ci.ai.DescribeAiQueuesRequest;
import com.tencent.cos.xml.model.ci.ai.DescribeAiQueuesResult;
import com.tencent.cos.xml.model.ci.ai.DescribeWordsGeneralizeJobRequest;
import com.tencent.cos.xml.model.ci.ai.DescribeWordsGeneralizeJobResult;
import com.tencent.cos.xml.model.ci.ai.GetAIBucketRequest;
import com.tencent.cos.xml.model.ci.ai.GetAIBucketResult;
import com.tencent.cos.xml.model.ci.ai.GetAIQueueRequest;
import com.tencent.cos.xml.model.ci.ai.GetAIQueueResult;
import com.tencent.cos.xml.model.ci.ai.ImageSearchBucketRequest;
import com.tencent.cos.xml.model.ci.ai.OpenAsrBucketRequest;
import com.tencent.cos.xml.model.ci.ai.OpenAsrBucketResult;
import com.tencent.cos.xml.model.ci.ai.OpenBucketAiRequest;
import com.tencent.cos.xml.model.ci.ai.OpenBucketAiResult;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionRequest;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResult;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionTempleteResult;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyRequest;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResult;
import com.tencent.cos.xml.model.ci.ai.PostSoundHoundRequest;
import com.tencent.cos.xml.model.ci.ai.PostSoundHoundResult;
import com.tencent.cos.xml.model.ci.ai.PostSpeechRecognitionTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.PostSpeechRecognitionTempleteResult;
import com.tencent.cos.xml.model.ci.ai.PostTranslationRequest;
import com.tencent.cos.xml.model.ci.ai.PostTranslationResult;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecRequest;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResult;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetTempleteResult;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisRequest;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResult;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisTempleteResult;
import com.tencent.cos.xml.model.ci.ai.UpdateAIQueueRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResult;
import com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResult;
import com.tencent.cos.xml.model.ci.ai.UpdateNoiseReductionTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateNoiseReductionTempleteResult;
import com.tencent.cos.xml.model.ci.ai.UpdateSpeechRecognitionTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateSpeechRecognitionTempleteResult;
import com.tencent.cos.xml.model.ci.ai.UpdateVideoTargetTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateVideoTargetTempleteResult;
import com.tencent.cos.xml.model.ci.ai.UpdateVoiceSeparateTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateVoiceSeparateTempleteResult;
import com.tencent.cos.xml.model.ci.ai.UpdateVoiceSynthesisTempleteRequest;
import com.tencent.cos.xml.model.ci.ai.UpdateVoiceSynthesisTempleteResult;
import com.tencent.cos.xml.model.ci.ai.VocalScoreRequest;
import com.tencent.cos.xml.model.ci.ai.VocalScoreResult;
import com.tencent.cos.xml.model.ci.asr.CreateSpeechJobsRequest;
import com.tencent.cos.xml.model.ci.asr.CreateSpeechJobsResult;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechBucketsRequest;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechBucketsResult;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechJobRequest;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechJobResult;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechJobsRequest;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechJobsResult;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechQueuesRequest;
import com.tencent.cos.xml.model.ci.asr.DescribeSpeechQueuesResult;
import com.tencent.cos.xml.model.ci.audit.AddAuditTextlibKeywordRequest;
import com.tencent.cos.xml.model.ci.audit.AddAuditTextlibKeywordResult;
import com.tencent.cos.xml.model.ci.audit.CancelLiveVideoAuditRequest;
import com.tencent.cos.xml.model.ci.audit.CancelLiveVideoAuditResult;
import com.tencent.cos.xml.model.ci.audit.CreateAuditTextlibRequest;
import com.tencent.cos.xml.model.ci.audit.CreateAuditTextlibResult;
import com.tencent.cos.xml.model.ci.audit.CreateStrategyRequest;
import com.tencent.cos.xml.model.ci.audit.CreateStrategyResult;
import com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordRequest;
import com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResult;
import com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibRequest;
import com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibResult;
import com.tencent.cos.xml.model.ci.audit.GetAudioAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetAudioAuditResult;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibKeywordListRequest;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibKeywordListResult;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListRequest;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResult;
import com.tencent.cos.xml.model.ci.audit.GetDocumentAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetDocumentAuditResult;
import com.tencent.cos.xml.model.ci.audit.GetImageAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetImageAuditResult;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResult;
import com.tencent.cos.xml.model.ci.audit.GetStrategyDetailRequest;
import com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResult;
import com.tencent.cos.xml.model.ci.audit.GetStrategyListRequest;
import com.tencent.cos.xml.model.ci.audit.GetStrategyListResult;
import com.tencent.cos.xml.model.ci.audit.GetTextAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetVideoAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetVideoAuditResult;
import com.tencent.cos.xml.model.ci.audit.GetWebPageAuditRequest;
import com.tencent.cos.xml.model.ci.audit.GetWebPageAuditResult;
import com.tencent.cos.xml.model.ci.audit.PostAudioAuditRequest;
import com.tencent.cos.xml.model.ci.audit.PostAuditResult;
import com.tencent.cos.xml.model.ci.audit.PostDocumentAuditRequest;
import com.tencent.cos.xml.model.ci.audit.PostImageAuditReportRequest;
import com.tencent.cos.xml.model.ci.audit.PostImageAuditReportResult;
import com.tencent.cos.xml.model.ci.audit.PostImagesAuditRequest;
import com.tencent.cos.xml.model.ci.audit.PostImagesAuditResult;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditRequest;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResult;
import com.tencent.cos.xml.model.ci.audit.PostTextAuditReportRequest;
import com.tencent.cos.xml.model.ci.audit.PostTextAuditReportResult;
import com.tencent.cos.xml.model.ci.audit.PostTextAuditRequest;
import com.tencent.cos.xml.model.ci.audit.PostVideoAuditRequest;
import com.tencent.cos.xml.model.ci.audit.PostWebPageAuditRequest;
import com.tencent.cos.xml.model.ci.audit.TextAuditResult;
import com.tencent.cos.xml.model.ci.audit.UpdateAuditTextlibRequest;
import com.tencent.cos.xml.model.ci.audit.UpdateAuditTextlibResult;
import com.tencent.cos.xml.model.ci.audit.UpdateStrategyRequest;
import com.tencent.cos.xml.model.ci.audit.UpdateStrategyResult;
import com.tencent.cos.xml.model.ci.media.GetWorkflowListRequest;
import com.tencent.cos.xml.model.ci.media.GetWorkflowListResult;
import com.tencent.cos.xml.model.ci.media.SearchMediaQueueRequest;
import com.tencent.cos.xml.model.ci.media.SearchMediaQueueResult;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResult;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobRequest;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResult;
import com.tencent.cos.xml.model.ci.media.TemplateAnimationRequest;
import com.tencent.cos.xml.model.ci.media.TemplateAnimationResult;
import com.tencent.cos.xml.model.ci.media.TemplateConcatRequest;
import com.tencent.cos.xml.model.ci.media.TemplateConcatResult;
import com.tencent.cos.xml.model.ci.media.TemplatePicProcessRequest;
import com.tencent.cos.xml.model.ci.media.TemplatePicProcessResult;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCoverRequest;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResult;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshotRequest;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshotResult;
import com.tencent.cos.xml.model.ci.media.TemplateTranscodeRequest;
import com.tencent.cos.xml.model.ci.media.TemplateTranscodeResult;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontageRequest;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResult;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateRequest;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResult;
import com.tencent.cos.xml.model.ci.media.TemplateWatermarkRequest;
import com.tencent.cos.xml.model.ci.media.TemplateWatermarkResult;
import com.tencent.cos.xml.model.ci.media.TriggerWorkflowRequest;
import com.tencent.cos.xml.model.ci.media.TriggerWorkflowResult;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueueRequest;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResult;
import com.tencent.cos.xml.model.ci.metainsight.CreateDatasetBindingRequest;
import com.tencent.cos.xml.model.ci.metainsight.CreateDatasetBindingResult;
import com.tencent.cos.xml.model.ci.metainsight.CreateDatasetRequest;
import com.tencent.cos.xml.model.ci.metainsight.CreateDatasetResult;
import com.tencent.cos.xml.model.ci.metainsight.CreateFileMetaIndexRequest;
import com.tencent.cos.xml.model.ci.metainsight.CreateFileMetaIndexResult;
import com.tencent.cos.xml.model.ci.metainsight.DatasetFaceSearchRequest;
import com.tencent.cos.xml.model.ci.metainsight.DatasetFaceSearchResult;
import com.tencent.cos.xml.model.ci.metainsight.DatasetSimpleQueryRequest;
import com.tencent.cos.xml.model.ci.metainsight.DatasetSimpleQueryResult;
import com.tencent.cos.xml.model.ci.metainsight.DeleteDatasetBindingRequest;
import com.tencent.cos.xml.model.ci.metainsight.DeleteDatasetBindingResult;
import com.tencent.cos.xml.model.ci.metainsight.DeleteDatasetRequest;
import com.tencent.cos.xml.model.ci.metainsight.DeleteDatasetResult;
import com.tencent.cos.xml.model.ci.metainsight.DeleteFileMetaIndexRequest;
import com.tencent.cos.xml.model.ci.metainsight.DeleteFileMetaIndexResult;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetBindingRequest;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetBindingResult;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetBindingsRequest;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetBindingsResult;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetRequest;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetResult;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetsRequest;
import com.tencent.cos.xml.model.ci.metainsight.DescribeDatasetsResult;
import com.tencent.cos.xml.model.ci.metainsight.DescribeFileMetaIndexRequest;
import com.tencent.cos.xml.model.ci.metainsight.DescribeFileMetaIndexResult;
import com.tencent.cos.xml.model.ci.metainsight.SearchImageRequest;
import com.tencent.cos.xml.model.ci.metainsight.SearchImageResult;
import com.tencent.cos.xml.model.ci.metainsight.UpdateDatasetRequest;
import com.tencent.cos.xml.model.ci.metainsight.UpdateDatasetResult;
import com.tencent.cos.xml.model.ci.metainsight.UpdateFileMetaIndexRequest;
import com.tencent.cos.xml.model.ci.metainsight.UpdateFileMetaIndexResult;
import com.tencent.qcloud.core.auth.COSXmlSigner;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.SignerFactory;

/* loaded from: classes6.dex */
public class CIService extends CosXmlService {
    public static final String SIGNERTYPE_CISIGNER = ProtectedSandApp.s("㑗\u0001");

    private static class CISigner extends COSXmlSigner {
        private CISigner() {
        }

        @Override // com.tencent.qcloud.core.auth.COSXmlSigner
        protected String getSessionTokenKey() {
            return ProtectedSandApp.s("㐾\u0001");
        }
    }

    public CIService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudCredentialProvider qCloudCredentialProvider) {
        super(context, cosXmlServiceConfig, qCloudCredentialProvider);
        String s4 = ProtectedSandApp.s("㑗\u0001");
        this.signerType = s4;
        SignerFactory.registerSigner(s4, new CISigner());
    }

    public AddAuditTextlibKeywordResult addAuditTextlibKeyword(AddAuditTextlibKeywordRequest addAuditTextlibKeywordRequest) throws CosXmlClientException, CosXmlServiceException {
        return (AddAuditTextlibKeywordResult) execute(addAuditTextlibKeywordRequest, new AddAuditTextlibKeywordResult());
    }

    public void addAuditTextlibKeywordAsync(AddAuditTextlibKeywordRequest addAuditTextlibKeywordRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(addAuditTextlibKeywordRequest, new AddAuditTextlibKeywordResult(), cosXmlResultListener);
    }

    public CancelLiveVideoAuditResult cancelLiveVideoAudit(CancelLiveVideoAuditRequest cancelLiveVideoAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CancelLiveVideoAuditResult) execute(cancelLiveVideoAuditRequest, new CancelLiveVideoAuditResult());
    }

    public void cancelLiveVideoAuditAsync(CancelLiveVideoAuditRequest cancelLiveVideoAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(cancelLiveVideoAuditRequest, new CancelLiveVideoAuditResult(), cosXmlResultListener);
    }

    public CloseAIBucketResult closeAIBucket(CloseAIBucketRequest closeAIBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CloseAIBucketResult) execute(closeAIBucketRequest, new CloseAIBucketResult());
    }

    public void closeAIBucketAsync(CloseAIBucketRequest closeAIBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(closeAIBucketRequest, new CloseAIBucketResult(), cosXmlResultListener);
    }

    public CloseAsrBucketResult closeAsrBucket(CloseAsrBucketRequest closeAsrBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CloseAsrBucketResult) execute(closeAsrBucketRequest, new CloseAsrBucketResult());
    }

    public void closeAsrBucketAsync(CloseAsrBucketRequest closeAsrBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(closeAsrBucketRequest, new CloseAsrBucketResult(), cosXmlResultListener);
    }

    public CreateStrategyResult createAuditStrategy(CreateStrategyRequest createStrategyRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateStrategyResult) execute(createStrategyRequest, new CreateStrategyResult());
    }

    public void createAuditStrategyAsync(CreateStrategyRequest createStrategyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createStrategyRequest, new CreateStrategyResult(), cosXmlResultListener);
    }

    public CreateAuditTextlibResult createAuditTextlib(CreateAuditTextlibRequest createAuditTextlibRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateAuditTextlibResult) execute(createAuditTextlibRequest, new CreateAuditTextlibResult());
    }

    public void createAuditTextlibAsync(CreateAuditTextlibRequest createAuditTextlibRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createAuditTextlibRequest, new CreateAuditTextlibResult(), cosXmlResultListener);
    }

    public CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateDatasetResult) execute(createDatasetRequest, new CreateDatasetResult());
    }

    public void createDatasetAsync(CreateDatasetRequest createDatasetRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createDatasetRequest, new CreateDatasetResult(), cosXmlResultListener);
    }

    public CreateDatasetBindingResult createDatasetBinding(CreateDatasetBindingRequest createDatasetBindingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateDatasetBindingResult) execute(createDatasetBindingRequest, new CreateDatasetBindingResult());
    }

    public void createDatasetBindingAsync(CreateDatasetBindingRequest createDatasetBindingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createDatasetBindingRequest, new CreateDatasetBindingResult(), cosXmlResultListener);
    }

    public CreateFileMetaIndexResult createFileMetaIndex(CreateFileMetaIndexRequest createFileMetaIndexRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateFileMetaIndexResult) execute(createFileMetaIndexRequest, new CreateFileMetaIndexResult());
    }

    public void createFileMetaIndexAsync(CreateFileMetaIndexRequest createFileMetaIndexRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createFileMetaIndexRequest, new CreateFileMetaIndexResult(), cosXmlResultListener);
    }

    public CreateSpeechJobsResult createSpeechJobs(CreateSpeechJobsRequest createSpeechJobsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateSpeechJobsResult) execute(createSpeechJobsRequest, new CreateSpeechJobsResult());
    }

    public void createSpeechJobsAsync(CreateSpeechJobsRequest createSpeechJobsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createSpeechJobsRequest, new CreateSpeechJobsResult(), cosXmlResultListener);
    }

    public CreateWordsGeneralizeJobResult createWordsGeneralizeJob(CreateWordsGeneralizeJobRequest createWordsGeneralizeJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (CreateWordsGeneralizeJobResult) execute(createWordsGeneralizeJobRequest, new CreateWordsGeneralizeJobResult());
    }

    public void createWordsGeneralizeJobAsync(CreateWordsGeneralizeJobRequest createWordsGeneralizeJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(createWordsGeneralizeJobRequest, new CreateWordsGeneralizeJobResult(), cosXmlResultListener);
    }

    public DatasetFaceSearchResult datasetFaceSearch(DatasetFaceSearchRequest datasetFaceSearchRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DatasetFaceSearchResult) execute(datasetFaceSearchRequest, new DatasetFaceSearchResult());
    }

    public void datasetFaceSearchAsync(DatasetFaceSearchRequest datasetFaceSearchRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(datasetFaceSearchRequest, new DatasetFaceSearchResult(), cosXmlResultListener);
    }

    public DatasetSimpleQueryResult datasetSimpleQuery(DatasetSimpleQueryRequest datasetSimpleQueryRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DatasetSimpleQueryResult) execute(datasetSimpleQueryRequest, new DatasetSimpleQueryResult());
    }

    public void datasetSimpleQueryAsync(DatasetSimpleQueryRequest datasetSimpleQueryRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(datasetSimpleQueryRequest, new DatasetSimpleQueryResult(), cosXmlResultListener);
    }

    public DeleteAuditTextlibResult deleteAuditTextlib(DeleteAuditTextlibRequest deleteAuditTextlibRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteAuditTextlibResult) execute(deleteAuditTextlibRequest, new DeleteAuditTextlibResult());
    }

    public void deleteAuditTextlibAsync(DeleteAuditTextlibRequest deleteAuditTextlibRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteAuditTextlibRequest, new DeleteAuditTextlibResult(), cosXmlResultListener);
    }

    public DeleteAuditTextlibKeywordResult deleteAuditTextlibKeyword(DeleteAuditTextlibKeywordRequest deleteAuditTextlibKeywordRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteAuditTextlibKeywordResult) execute(deleteAuditTextlibKeywordRequest, new DeleteAuditTextlibKeywordResult());
    }

    public void deleteAuditTextlibKeywordAsync(DeleteAuditTextlibKeywordRequest deleteAuditTextlibKeywordRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteAuditTextlibKeywordRequest, new DeleteAuditTextlibKeywordResult(), cosXmlResultListener);
    }

    public DeleteBucketDPStateResult deleteBucketDocumentPreviewState(DeleteBucketDPStateRequest deleteBucketDPStateRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteBucketDPStateResult) execute(deleteBucketDPStateRequest, new DeleteBucketDPStateResult());
    }

    public void deleteBucketDocumentPreviewStateAsync(DeleteBucketDPStateRequest deleteBucketDPStateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteBucketDPStateRequest, new DeleteBucketDPStateResult(), cosXmlResultListener);
    }

    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteDatasetResult) execute(deleteDatasetRequest, new DeleteDatasetResult());
    }

    public void deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteDatasetRequest, new DeleteDatasetResult(), cosXmlResultListener);
    }

    public DeleteDatasetBindingResult deleteDatasetBinding(DeleteDatasetBindingRequest deleteDatasetBindingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteDatasetBindingResult) execute(deleteDatasetBindingRequest, new DeleteDatasetBindingResult());
    }

    public void deleteDatasetBindingAsync(DeleteDatasetBindingRequest deleteDatasetBindingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteDatasetBindingRequest, new DeleteDatasetBindingResult(), cosXmlResultListener);
    }

    public DeleteFileMetaIndexResult deleteFileMetaIndex(DeleteFileMetaIndexRequest deleteFileMetaIndexRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DeleteFileMetaIndexResult) execute(deleteFileMetaIndexRequest, new DeleteFileMetaIndexResult());
    }

    public void deleteFileMetaIndexAsync(DeleteFileMetaIndexRequest deleteFileMetaIndexRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(deleteFileMetaIndexRequest, new DeleteFileMetaIndexResult(), cosXmlResultListener);
    }

    public DescribeAiQueuesResult describeAiQueues(DescribeAiQueuesRequest describeAiQueuesRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeAiQueuesResult) execute(describeAiQueuesRequest, new DescribeAiQueuesResult());
    }

    public void describeAiQueuesAsync(DescribeAiQueuesRequest describeAiQueuesRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeAiQueuesRequest, new DescribeAiQueuesResult(), cosXmlResultListener);
    }

    public DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeDatasetResult) execute(describeDatasetRequest, new DescribeDatasetResult());
    }

    public void describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeDatasetRequest, new DescribeDatasetResult(), cosXmlResultListener);
    }

    public DescribeDatasetBindingResult describeDatasetBinding(DescribeDatasetBindingRequest describeDatasetBindingRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeDatasetBindingResult) execute(describeDatasetBindingRequest, new DescribeDatasetBindingResult());
    }

    public void describeDatasetBindingAsync(DescribeDatasetBindingRequest describeDatasetBindingRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeDatasetBindingRequest, new DescribeDatasetBindingResult(), cosXmlResultListener);
    }

    public DescribeDatasetBindingsResult describeDatasetBindings(DescribeDatasetBindingsRequest describeDatasetBindingsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeDatasetBindingsResult) execute(describeDatasetBindingsRequest, new DescribeDatasetBindingsResult());
    }

    public void describeDatasetBindingsAsync(DescribeDatasetBindingsRequest describeDatasetBindingsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeDatasetBindingsRequest, new DescribeDatasetBindingsResult(), cosXmlResultListener);
    }

    public DescribeDatasetsResult describeDatasets(DescribeDatasetsRequest describeDatasetsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeDatasetsResult) execute(describeDatasetsRequest, new DescribeDatasetsResult());
    }

    public void describeDatasetsAsync(DescribeDatasetsRequest describeDatasetsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeDatasetsRequest, new DescribeDatasetsResult(), cosXmlResultListener);
    }

    public DescribeDocProcessBucketsResult describeDocProcessBuckets(DescribeDocProcessBucketsRequest describeDocProcessBucketsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeDocProcessBucketsResult) execute(describeDocProcessBucketsRequest, new DescribeDocProcessBucketsResult());
    }

    public void describeDocProcessBucketsAsync(DescribeDocProcessBucketsRequest describeDocProcessBucketsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeDocProcessBucketsRequest, new DescribeDocProcessBucketsResult(), cosXmlResultListener);
    }

    public DescribeFileMetaIndexResult describeFileMetaIndex(DescribeFileMetaIndexRequest describeFileMetaIndexRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeFileMetaIndexResult) execute(describeFileMetaIndexRequest, new DescribeFileMetaIndexResult());
    }

    public void describeFileMetaIndexAsync(DescribeFileMetaIndexRequest describeFileMetaIndexRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeFileMetaIndexRequest, new DescribeFileMetaIndexResult(), cosXmlResultListener);
    }

    public DescribeSpeechBucketsResult describeSpeechBuckets(DescribeSpeechBucketsRequest describeSpeechBucketsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeSpeechBucketsResult) execute(describeSpeechBucketsRequest, new DescribeSpeechBucketsResult());
    }

    public void describeSpeechBucketsAsync(DescribeSpeechBucketsRequest describeSpeechBucketsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeSpeechBucketsRequest, new DescribeSpeechBucketsResult(), cosXmlResultListener);
    }

    public DescribeSpeechJobResult describeSpeechJob(DescribeSpeechJobRequest describeSpeechJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeSpeechJobResult) execute(describeSpeechJobRequest, new DescribeSpeechJobResult());
    }

    public void describeSpeechJobAsync(DescribeSpeechJobRequest describeSpeechJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeSpeechJobRequest, new DescribeSpeechJobResult(), cosXmlResultListener);
    }

    public DescribeSpeechJobsResult describeSpeechJobs(DescribeSpeechJobsRequest describeSpeechJobsRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeSpeechJobsResult) execute(describeSpeechJobsRequest, new DescribeSpeechJobsResult());
    }

    public void describeSpeechJobsAsync(DescribeSpeechJobsRequest describeSpeechJobsRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeSpeechJobsRequest, new DescribeSpeechJobsResult(), cosXmlResultListener);
    }

    public DescribeSpeechQueuesResult describeSpeechQueues(DescribeSpeechQueuesRequest describeSpeechQueuesRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeSpeechQueuesResult) execute(describeSpeechQueuesRequest, new DescribeSpeechQueuesResult());
    }

    public void describeSpeechQueuesAsync(DescribeSpeechQueuesRequest describeSpeechQueuesRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeSpeechQueuesRequest, new DescribeSpeechQueuesResult(), cosXmlResultListener);
    }

    public DescribeWordsGeneralizeJobResult describeWordsGeneralizeJob(DescribeWordsGeneralizeJobRequest describeWordsGeneralizeJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (DescribeWordsGeneralizeJobResult) execute(describeWordsGeneralizeJobRequest, new DescribeWordsGeneralizeJobResult());
    }

    public void describeWordsGeneralizeJobAsync(DescribeWordsGeneralizeJobRequest describeWordsGeneralizeJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(describeWordsGeneralizeJobRequest, new DescribeWordsGeneralizeJobResult(), cosXmlResultListener);
    }

    public GetAIBucketResult getAIBucket(GetAIBucketRequest getAIBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetAIBucketResult) execute(getAIBucketRequest, new GetAIBucketResult());
    }

    public void getAIBucketAsync(GetAIBucketRequest getAIBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getAIBucketRequest, new GetAIBucketResult(), cosXmlResultListener);
    }

    public GetAIQueueResult getAIQueue(GetAIQueueRequest getAIQueueRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetAIQueueResult) execute(getAIQueueRequest, new GetAIQueueResult());
    }

    public void getAIQueueAsync(GetAIQueueRequest getAIQueueRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getAIQueueRequest, new GetAIQueueResult(), cosXmlResultListener);
    }

    public GetAudioAuditResult getAudioAudit(GetAudioAuditRequest getAudioAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetAudioAuditResult) execute(getAudioAuditRequest, new GetAudioAuditResult());
    }

    public void getAudioAuditAsync(GetAudioAuditRequest getAudioAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getAudioAuditRequest, new GetAudioAuditResult(), cosXmlResultListener);
    }

    public GetStrategyDetailResult getAuditStrategyDetail(GetStrategyDetailRequest getStrategyDetailRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetStrategyDetailResult) execute(getStrategyDetailRequest, new GetStrategyDetailResult());
    }

    public void getAuditStrategyDetailAsync(GetStrategyDetailRequest getStrategyDetailRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getStrategyDetailRequest, new GetStrategyDetailResult(), cosXmlResultListener);
    }

    public GetStrategyListResult getAuditStrategyList(GetStrategyListRequest getStrategyListRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetStrategyListResult) execute(getStrategyListRequest, new GetStrategyListResult());
    }

    public void getAuditStrategyListAsync(GetStrategyListRequest getStrategyListRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getStrategyListRequest, new GetStrategyListResult(), cosXmlResultListener);
    }

    public GetAuditTextlibKeywordListResult getAuditTextlibKeywordList(GetAuditTextlibKeywordListRequest getAuditTextlibKeywordListRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetAuditTextlibKeywordListResult) execute(getAuditTextlibKeywordListRequest, new GetAuditTextlibKeywordListResult());
    }

    public void getAuditTextlibKeywordListAsync(GetAuditTextlibKeywordListRequest getAuditTextlibKeywordListRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getAuditTextlibKeywordListRequest, new GetAuditTextlibKeywordListResult(), cosXmlResultListener);
    }

    public GetAuditTextlibListResult getAuditTextlibList(GetAuditTextlibListRequest getAuditTextlibListRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetAuditTextlibListResult) execute(getAuditTextlibListRequest, new GetAuditTextlibListResult());
    }

    public void getAuditTextlibListAsync(GetAuditTextlibListRequest getAuditTextlibListRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getAuditTextlibListRequest, new GetAuditTextlibListResult(), cosXmlResultListener);
    }

    public GetDocumentAuditResult getDocumentAudit(GetDocumentAuditRequest getDocumentAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetDocumentAuditResult) execute(getDocumentAuditRequest, new GetDocumentAuditResult());
    }

    public void getDocumentAuditAsync(GetDocumentAuditRequest getDocumentAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getDocumentAuditRequest, new GetDocumentAuditResult(), cosXmlResultListener);
    }

    public GetImageAuditResult getImageAudit(GetImageAuditRequest getImageAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetImageAuditResult) execute(getImageAuditRequest, new GetImageAuditResult());
    }

    public void getImageAuditAsync(GetImageAuditRequest getImageAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getImageAuditRequest, new GetImageAuditResult(), cosXmlResultListener);
    }

    public GetLiveVideoAuditResult getLiveVideoAudit(GetLiveVideoAuditRequest getLiveVideoAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetLiveVideoAuditResult) execute(getLiveVideoAuditRequest, new GetLiveVideoAuditResult());
    }

    public void getLiveVideoAuditAsync(GetLiveVideoAuditRequest getLiveVideoAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getLiveVideoAuditRequest, new GetLiveVideoAuditResult(), cosXmlResultListener);
    }

    public TextAuditResult getTextAudit(GetTextAuditRequest getTextAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TextAuditResult) execute(getTextAuditRequest, new TextAuditResult());
    }

    public void getTextAuditAsync(GetTextAuditRequest getTextAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getTextAuditRequest, new TextAuditResult(), cosXmlResultListener);
    }

    public GetVideoAuditResult getVideoAudit(GetVideoAuditRequest getVideoAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetVideoAuditResult) execute(getVideoAuditRequest, new GetVideoAuditResult());
    }

    public void getVideoAuditAsync(GetVideoAuditRequest getVideoAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getVideoAuditRequest, new GetVideoAuditResult(), cosXmlResultListener);
    }

    public GetWebPageAuditResult getWebPageAudit(GetWebPageAuditRequest getWebPageAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetWebPageAuditResult) execute(getWebPageAuditRequest, new GetWebPageAuditResult());
    }

    public void getWebPageAuditAsync(GetWebPageAuditRequest getWebPageAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getWebPageAuditRequest, new GetWebPageAuditResult(), cosXmlResultListener);
    }

    public GetWorkflowListResult getWorkflowList(GetWorkflowListRequest getWorkflowListRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetWorkflowListResult) execute(getWorkflowListRequest, new GetWorkflowListResult());
    }

    public void getWorkflowListAsync(GetWorkflowListRequest getWorkflowListRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getWorkflowListRequest, new GetWorkflowListResult(), cosXmlResultListener);
    }

    public EmptyResponseResult imageSearchBucket(ImageSearchBucketRequest imageSearchBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (EmptyResponseResult) execute(imageSearchBucketRequest, new EmptyResponseResult());
    }

    public void imageSearchBucketAsync(ImageSearchBucketRequest imageSearchBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(imageSearchBucketRequest, new EmptyResponseResult(), cosXmlResultListener);
    }

    public OpenAsrBucketResult openAsrBucket(OpenAsrBucketRequest openAsrBucketRequest) throws CosXmlClientException, CosXmlServiceException {
        return (OpenAsrBucketResult) execute(openAsrBucketRequest, new OpenAsrBucketResult());
    }

    public void openAsrBucketAsync(OpenAsrBucketRequest openAsrBucketRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(openAsrBucketRequest, new OpenAsrBucketResult(), cosXmlResultListener);
    }

    public OpenBucketAiResult openBucketAi(OpenBucketAiRequest openBucketAiRequest) throws CosXmlClientException, CosXmlServiceException {
        return (OpenBucketAiResult) execute(openBucketAiRequest, new OpenBucketAiResult());
    }

    public void openBucketAiAsync(OpenBucketAiRequest openBucketAiRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(openBucketAiRequest, new OpenBucketAiResult(), cosXmlResultListener);
    }

    public PostAuditResult postAudioAudit(PostAudioAuditRequest postAudioAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostAuditResult) execute(postAudioAuditRequest, new PostAuditResult());
    }

    public void postAudioAuditAsync(PostAudioAuditRequest postAudioAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postAudioAuditRequest, new PostAuditResult(), cosXmlResultListener);
    }

    public PostAuditResult postDocumentAudit(PostDocumentAuditRequest postDocumentAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostAuditResult) execute(postDocumentAuditRequest, new PostAuditResult());
    }

    public void postDocumentAuditAsync(PostDocumentAuditRequest postDocumentAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postDocumentAuditRequest, new PostAuditResult(), cosXmlResultListener);
    }

    public PostImageAuditReportResult postImageAuditReport(PostImageAuditReportRequest postImageAuditReportRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostImageAuditReportResult) execute(postImageAuditReportRequest, new PostImageAuditReportResult());
    }

    public void postImageAuditReportAsync(PostImageAuditReportRequest postImageAuditReportRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postImageAuditReportRequest, new PostImageAuditReportResult(), cosXmlResultListener);
    }

    public PostImagesAuditResult postImagesAudit(PostImagesAuditRequest postImagesAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostImagesAuditResult) execute(postImagesAuditRequest, new PostImagesAuditResult());
    }

    public void postImagesAuditAsync(PostImagesAuditRequest postImagesAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postImagesAuditRequest, new PostImagesAuditResult(), cosXmlResultListener);
    }

    public PostLiveVideoAuditResult postLiveVideoAudit(PostLiveVideoAuditRequest postLiveVideoAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostLiveVideoAuditResult) execute(postLiveVideoAuditRequest, new PostLiveVideoAuditResult());
    }

    public void postLiveVideoAuditAsync(PostLiveVideoAuditRequest postLiveVideoAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postLiveVideoAuditRequest, new PostLiveVideoAuditResult(), cosXmlResultListener);
    }

    public PostNoiseReductionResult postNoiseReduction(PostNoiseReductionRequest postNoiseReductionRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostNoiseReductionResult) execute(postNoiseReductionRequest, new PostNoiseReductionResult());
    }

    public void postNoiseReductionAsync(PostNoiseReductionRequest postNoiseReductionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postNoiseReductionRequest, new PostNoiseReductionResult(), cosXmlResultListener);
    }

    public PostNoiseReductionTempleteResult postNoiseReductionTemplete(PostNoiseReductionTempleteRequest postNoiseReductionTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostNoiseReductionTempleteResult) execute(postNoiseReductionTempleteRequest, new PostNoiseReductionTempleteResult());
    }

    public void postNoiseReductionTempleteAsync(PostNoiseReductionTempleteRequest postNoiseReductionTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postNoiseReductionTempleteRequest, new PostNoiseReductionTempleteResult(), cosXmlResultListener);
    }

    public PostSegmentVideoBodyResult postSegmentVideoBody(PostSegmentVideoBodyRequest postSegmentVideoBodyRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostSegmentVideoBodyResult) execute(postSegmentVideoBodyRequest, new PostSegmentVideoBodyResult());
    }

    public void postSegmentVideoBodyAsync(PostSegmentVideoBodyRequest postSegmentVideoBodyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postSegmentVideoBodyRequest, new PostSegmentVideoBodyResult(), cosXmlResultListener);
    }

    public PostSoundHoundResult postSoundHound(PostSoundHoundRequest postSoundHoundRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostSoundHoundResult) execute(postSoundHoundRequest, new PostSoundHoundResult());
    }

    public void postSoundHoundAsync(PostSoundHoundRequest postSoundHoundRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postSoundHoundRequest, new PostSoundHoundResult(), cosXmlResultListener);
    }

    public PostSpeechRecognitionTempleteResult postSpeechRecognitionTemplete(PostSpeechRecognitionTempleteRequest postSpeechRecognitionTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostSpeechRecognitionTempleteResult) execute(postSpeechRecognitionTempleteRequest, new PostSpeechRecognitionTempleteResult());
    }

    public void postSpeechRecognitionTempleteAsync(PostSpeechRecognitionTempleteRequest postSpeechRecognitionTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postSpeechRecognitionTempleteRequest, new PostSpeechRecognitionTempleteResult(), cosXmlResultListener);
    }

    public TextAuditResult postTextAudit(PostTextAuditRequest postTextAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TextAuditResult) execute(postTextAuditRequest, new TextAuditResult());
    }

    public void postTextAuditAsync(PostTextAuditRequest postTextAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postTextAuditRequest, new TextAuditResult(), cosXmlResultListener);
    }

    public PostTextAuditReportResult postTextAuditReport(PostTextAuditReportRequest postTextAuditReportRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostTextAuditReportResult) execute(postTextAuditReportRequest, new PostTextAuditReportResult());
    }

    public void postTextAuditReportAsync(PostTextAuditReportRequest postTextAuditReportRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postTextAuditReportRequest, new PostTextAuditReportResult(), cosXmlResultListener);
    }

    public PostTranslationResult postTranslation(PostTranslationRequest postTranslationRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostTranslationResult) execute(postTranslationRequest, new PostTranslationResult());
    }

    public void postTranslationAsync(PostTranslationRequest postTranslationRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postTranslationRequest, new PostTranslationResult(), cosXmlResultListener);
    }

    public PostAuditResult postVideoAudit(PostVideoAuditRequest postVideoAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostAuditResult) execute(postVideoAuditRequest, new PostAuditResult());
    }

    public void postVideoAuditAsync(PostVideoAuditRequest postVideoAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postVideoAuditRequest, new PostAuditResult(), cosXmlResultListener);
    }

    public PostVideoTargetRecResult postVideoTargetRec(PostVideoTargetRecRequest postVideoTargetRecRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostVideoTargetRecResult) execute(postVideoTargetRecRequest, new PostVideoTargetRecResult());
    }

    public void postVideoTargetRecAsync(PostVideoTargetRecRequest postVideoTargetRecRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postVideoTargetRecRequest, new PostVideoTargetRecResult(), cosXmlResultListener);
    }

    public PostVideoTargetTempleteResult postVideoTargetTemplete(PostVideoTargetTempleteRequest postVideoTargetTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostVideoTargetTempleteResult) execute(postVideoTargetTempleteRequest, new PostVideoTargetTempleteResult());
    }

    public void postVideoTargetTempleteAsync(PostVideoTargetTempleteRequest postVideoTargetTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postVideoTargetTempleteRequest, new PostVideoTargetTempleteResult(), cosXmlResultListener);
    }

    public PostVoiceSynthesisResult postVoiceSynthesis(PostVoiceSynthesisRequest postVoiceSynthesisRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostVoiceSynthesisResult) execute(postVoiceSynthesisRequest, new PostVoiceSynthesisResult());
    }

    public void postVoiceSynthesisAsync(PostVoiceSynthesisRequest postVoiceSynthesisRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postVoiceSynthesisRequest, new PostVoiceSynthesisResult(), cosXmlResultListener);
    }

    public PostVoiceSynthesisTempleteResult postVoiceSynthesisTemplete(PostVoiceSynthesisTempleteRequest postVoiceSynthesisTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostVoiceSynthesisTempleteResult) execute(postVoiceSynthesisTempleteRequest, new PostVoiceSynthesisTempleteResult());
    }

    public void postVoiceSynthesisTempleteAsync(PostVoiceSynthesisTempleteRequest postVoiceSynthesisTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postVoiceSynthesisTempleteRequest, new PostVoiceSynthesisTempleteResult(), cosXmlResultListener);
    }

    public PostAuditResult postWebPageAudit(PostWebPageAuditRequest postWebPageAuditRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PostAuditResult) execute(postWebPageAuditRequest, new PostAuditResult());
    }

    public void postWebPageAuditAsync(PostWebPageAuditRequest postWebPageAuditRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(postWebPageAuditRequest, new PostAuditResult(), cosXmlResultListener);
    }

    public PutBucketDPStateResult putBucketDocumentPreviewState(PutBucketDPStateRequest putBucketDPStateRequest) throws CosXmlClientException, CosXmlServiceException {
        return (PutBucketDPStateResult) execute(putBucketDPStateRequest, new PutBucketDPStateResult());
    }

    public void putBucketDocumentPreviewStateAsync(PutBucketDPStateRequest putBucketDPStateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketDPStateRequest, new PutBucketDPStateResult(), cosXmlResultListener);
    }

    public QRCodeUploadResult qrCodeUpload(QRCodeUploadRequest qRCodeUploadRequest) throws CosXmlClientException, CosXmlServiceException {
        return (QRCodeUploadResult) execute(qRCodeUploadRequest, new QRCodeUploadResult());
    }

    public void qrCodeUploadAsync(QRCodeUploadRequest qRCodeUploadRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(qRCodeUploadRequest, new QRCodeUploadResult(), cosXmlResultListener);
    }

    public SearchImageResult searchImage(SearchImageRequest searchImageRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SearchImageResult) execute(searchImageRequest, new SearchImageResult());
    }

    public void searchImageAsync(SearchImageRequest searchImageRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(searchImageRequest, new SearchImageResult(), cosXmlResultListener);
    }

    public SearchMediaQueueResult searchMediaQueue(SearchMediaQueueRequest searchMediaQueueRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SearchMediaQueueResult) execute(searchMediaQueueRequest, new SearchMediaQueueResult());
    }

    public void searchMediaQueueAsync(SearchMediaQueueRequest searchMediaQueueRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(searchMediaQueueRequest, new SearchMediaQueueResult(), cosXmlResultListener);
    }

    public SensitiveContentRecognitionResult sensitiveContentRecognition(SensitiveContentRecognitionRequest sensitiveContentRecognitionRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SensitiveContentRecognitionResult) execute(sensitiveContentRecognitionRequest, new SensitiveContentRecognitionResult());
    }

    public void sensitiveContentRecognitionAsync(SensitiveContentRecognitionRequest sensitiveContentRecognitionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(sensitiveContentRecognitionRequest, new SensitiveContentRecognitionResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.CosXmlService, com.tencent.cos.xml.CosXmlBaseService
    protected String signerTypeCompat(String str, CosXmlRequest cosXmlRequest) {
        return (((cosXmlRequest instanceof SensitiveContentRecognitionRequest) || (cosXmlRequest instanceof QRCodeUploadRequest)) && ProtectedSandApp.s("㑗\u0001").equals(str)) ? ProtectedSandApp.s("㑘\u0001") : str;
    }

    public SubmitAnimationJobResult submitAnimationJob(SubmitAnimationJobRequest submitAnimationJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitAnimationJobResult) execute(submitAnimationJobRequest, new SubmitAnimationJobResult());
    }

    public void submitAnimationJobAsync(SubmitAnimationJobRequest submitAnimationJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitAnimationJobRequest, new SubmitAnimationJobResult(), cosXmlResultListener);
    }

    public SubmitConcatJobResult submitConcatJob(SubmitConcatJobRequest submitConcatJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitConcatJobResult) execute(submitConcatJobRequest, new SubmitConcatJobResult());
    }

    public void submitConcatJobAsync(SubmitConcatJobRequest submitConcatJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitConcatJobRequest, new SubmitConcatJobResult(), cosXmlResultListener);
    }

    public SubmitDigitalWatermarkJobResult submitDigitalWatermarkJob(SubmitDigitalWatermarkJobRequest submitDigitalWatermarkJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitDigitalWatermarkJobResult) execute(submitDigitalWatermarkJobRequest, new SubmitDigitalWatermarkJobResult());
    }

    public void submitDigitalWatermarkJobAsync(SubmitDigitalWatermarkJobRequest submitDigitalWatermarkJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitDigitalWatermarkJobRequest, new SubmitDigitalWatermarkJobResult(), cosXmlResultListener);
    }

    public SubmitExtractDigitalWatermarkJobResult submitExtractDigitalWatermarkJob(SubmitExtractDigitalWatermarkJobRequest submitExtractDigitalWatermarkJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitExtractDigitalWatermarkJobResult) execute(submitExtractDigitalWatermarkJobRequest, new SubmitExtractDigitalWatermarkJobResult());
    }

    public void submitExtractDigitalWatermarkJobAsync(SubmitExtractDigitalWatermarkJobRequest submitExtractDigitalWatermarkJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitExtractDigitalWatermarkJobRequest, new SubmitExtractDigitalWatermarkJobResult(), cosXmlResultListener);
    }

    public SubmitMediaInfoJobResult submitMediaInfoJob(SubmitMediaInfoJobRequest submitMediaInfoJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitMediaInfoJobResult) execute(submitMediaInfoJobRequest, new SubmitMediaInfoJobResult());
    }

    public void submitMediaInfoJobAsync(SubmitMediaInfoJobRequest submitMediaInfoJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitMediaInfoJobRequest, new SubmitMediaInfoJobResult(), cosXmlResultListener);
    }

    public SubmitMediaSegmentJobResult submitMediaSegmentJob(SubmitMediaSegmentJobRequest submitMediaSegmentJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitMediaSegmentJobResult) execute(submitMediaSegmentJobRequest, new SubmitMediaSegmentJobResult());
    }

    public void submitMediaSegmentJobAsync(SubmitMediaSegmentJobRequest submitMediaSegmentJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitMediaSegmentJobRequest, new SubmitMediaSegmentJobResult(), cosXmlResultListener);
    }

    public SubmitPicProcessJobResult submitPicProcessJob(SubmitPicProcessJobRequest submitPicProcessJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitPicProcessJobResult) execute(submitPicProcessJobRequest, new SubmitPicProcessJobResult());
    }

    public void submitPicProcessJobAsync(SubmitPicProcessJobRequest submitPicProcessJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitPicProcessJobRequest, new SubmitPicProcessJobResult(), cosXmlResultListener);
    }

    public SubmitSmartCoverJobResult submitSmartCoverJob(SubmitSmartCoverJobRequest submitSmartCoverJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitSmartCoverJobResult) execute(submitSmartCoverJobRequest, new SubmitSmartCoverJobResult());
    }

    public void submitSmartCoverJobAsync(SubmitSmartCoverJobRequest submitSmartCoverJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitSmartCoverJobRequest, new SubmitSmartCoverJobResult(), cosXmlResultListener);
    }

    public SubmitSnapshotJobResult submitSnapshotJob(SubmitSnapshotJobRequest submitSnapshotJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitSnapshotJobResult) execute(submitSnapshotJobRequest, new SubmitSnapshotJobResult());
    }

    public void submitSnapshotJobAsync(SubmitSnapshotJobRequest submitSnapshotJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitSnapshotJobRequest, new SubmitSnapshotJobResult(), cosXmlResultListener);
    }

    public SubmitTranscodeJobResult submitTranscodeJob(SubmitTranscodeJobRequest submitTranscodeJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitTranscodeJobResult) execute(submitTranscodeJobRequest, new SubmitTranscodeJobResult());
    }

    public void submitTranscodeJobAsync(SubmitTranscodeJobRequest submitTranscodeJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitTranscodeJobRequest, new SubmitTranscodeJobResult(), cosXmlResultListener);
    }

    public SubmitVideoMontageJobResult submitVideoMontageJob(SubmitVideoMontageJobRequest submitVideoMontageJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitVideoMontageJobResult) execute(submitVideoMontageJobRequest, new SubmitVideoMontageJobResult());
    }

    public void submitVideoMontageJobAsync(SubmitVideoMontageJobRequest submitVideoMontageJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitVideoMontageJobRequest, new SubmitVideoMontageJobResult(), cosXmlResultListener);
    }

    public SubmitVideoTagJobResult submitVideoTagJob(SubmitVideoTagJobRequest submitVideoTagJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitVideoTagJobResult) execute(submitVideoTagJobRequest, new SubmitVideoTagJobResult());
    }

    public void submitVideoTagJobAsync(SubmitVideoTagJobRequest submitVideoTagJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitVideoTagJobRequest, new SubmitVideoTagJobResult(), cosXmlResultListener);
    }

    public SubmitVoiceSeparateJobResult submitVoiceSeparateJob(SubmitVoiceSeparateJobRequest submitVoiceSeparateJobRequest) throws CosXmlClientException, CosXmlServiceException {
        return (SubmitVoiceSeparateJobResult) execute(submitVoiceSeparateJobRequest, new SubmitVoiceSeparateJobResult());
    }

    public void submitVoiceSeparateJobAsync(SubmitVoiceSeparateJobRequest submitVoiceSeparateJobRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(submitVoiceSeparateJobRequest, new SubmitVoiceSeparateJobResult(), cosXmlResultListener);
    }

    public TemplateAnimationResult templateAnimation(TemplateAnimationRequest templateAnimationRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateAnimationResult) execute(templateAnimationRequest, new TemplateAnimationResult());
    }

    public void templateAnimationAsync(TemplateAnimationRequest templateAnimationRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateAnimationRequest, new TemplateAnimationResult(), cosXmlResultListener);
    }

    public TemplateConcatResult templateConcat(TemplateConcatRequest templateConcatRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateConcatResult) execute(templateConcatRequest, new TemplateConcatResult());
    }

    public void templateConcatAsync(TemplateConcatRequest templateConcatRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateConcatRequest, new TemplateConcatResult(), cosXmlResultListener);
    }

    public TemplatePicProcessResult templatePicProcess(TemplatePicProcessRequest templatePicProcessRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplatePicProcessResult) execute(templatePicProcessRequest, new TemplatePicProcessResult());
    }

    public void templatePicProcessAsync(TemplatePicProcessRequest templatePicProcessRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templatePicProcessRequest, new TemplatePicProcessResult(), cosXmlResultListener);
    }

    public TemplateSmartCoverResult templateSmartCover(TemplateSmartCoverRequest templateSmartCoverRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateSmartCoverResult) execute(templateSmartCoverRequest, new TemplateSmartCoverResult());
    }

    public void templateSmartCoverAsync(TemplateSmartCoverRequest templateSmartCoverRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateSmartCoverRequest, new TemplateSmartCoverResult(), cosXmlResultListener);
    }

    public TemplateSnapshotResult templateSnapshot(TemplateSnapshotRequest templateSnapshotRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateSnapshotResult) execute(templateSnapshotRequest, new TemplateSnapshotResult());
    }

    public void templateSnapshotAsync(TemplateSnapshotRequest templateSnapshotRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateSnapshotRequest, new TemplateSnapshotResult(), cosXmlResultListener);
    }

    public TemplateTranscodeResult templateTranscode(TemplateTranscodeRequest templateTranscodeRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateTranscodeResult) execute(templateTranscodeRequest, new TemplateTranscodeResult());
    }

    public void templateTranscodeAsync(TemplateTranscodeRequest templateTranscodeRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateTranscodeRequest, new TemplateTranscodeResult(), cosXmlResultListener);
    }

    public TemplateVideoMontageResult templateVideoMontage(TemplateVideoMontageRequest templateVideoMontageRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateVideoMontageResult) execute(templateVideoMontageRequest, new TemplateVideoMontageResult());
    }

    public void templateVideoMontageAsync(TemplateVideoMontageRequest templateVideoMontageRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateVideoMontageRequest, new TemplateVideoMontageResult(), cosXmlResultListener);
    }

    public TemplateVoiceSeparateResult templateVoiceSeparate(TemplateVoiceSeparateRequest templateVoiceSeparateRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateVoiceSeparateResult) execute(templateVoiceSeparateRequest, new TemplateVoiceSeparateResult());
    }

    public void templateVoiceSeparateAsync(TemplateVoiceSeparateRequest templateVoiceSeparateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateVoiceSeparateRequest, new TemplateVoiceSeparateResult(), cosXmlResultListener);
    }

    public TemplateWatermarkResult templateWatermark(TemplateWatermarkRequest templateWatermarkRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TemplateWatermarkResult) execute(templateWatermarkRequest, new TemplateWatermarkResult());
    }

    public void templateWatermarkAsync(TemplateWatermarkRequest templateWatermarkRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(templateWatermarkRequest, new TemplateWatermarkResult(), cosXmlResultListener);
    }

    public TriggerWorkflowResult triggerWorkflow(TriggerWorkflowRequest triggerWorkflowRequest) throws CosXmlClientException, CosXmlServiceException {
        return (TriggerWorkflowResult) execute(triggerWorkflowRequest, new TriggerWorkflowResult());
    }

    public void triggerWorkflowAsync(TriggerWorkflowRequest triggerWorkflowRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(triggerWorkflowRequest, new TriggerWorkflowResult(), cosXmlResultListener);
    }

    public UpdateAIQueueResult updateAIQueue(UpdateAIQueueRequest updateAIQueueRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateAIQueueResult) execute(updateAIQueueRequest, new UpdateAIQueueResult());
    }

    public void updateAIQueueAsync(UpdateAIQueueRequest updateAIQueueRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateAIQueueRequest, new UpdateAIQueueResult(), cosXmlResultListener);
    }

    public UpdateAsrQueueResult updateAsrQueue(UpdateAsrQueueRequest updateAsrQueueRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateAsrQueueResult) execute(updateAsrQueueRequest, new UpdateAsrQueueResult());
    }

    public void updateAsrQueueAsync(UpdateAsrQueueRequest updateAsrQueueRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateAsrQueueRequest, new UpdateAsrQueueResult(), cosXmlResultListener);
    }

    public UpdateStrategyResult updateAuditStrategy(UpdateStrategyRequest updateStrategyRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateStrategyResult) execute(updateStrategyRequest, new UpdateStrategyResult());
    }

    public void updateAuditStrategyAsync(UpdateStrategyRequest updateStrategyRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateStrategyRequest, new UpdateStrategyResult(), cosXmlResultListener);
    }

    public UpdateAuditTextlibResult updateAuditTextlib(UpdateAuditTextlibRequest updateAuditTextlibRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateAuditTextlibResult) execute(updateAuditTextlibRequest, new UpdateAuditTextlibResult());
    }

    public void updateAuditTextlibAsync(UpdateAuditTextlibRequest updateAuditTextlibRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateAuditTextlibRequest, new UpdateAuditTextlibResult(), cosXmlResultListener);
    }

    public UpdateDatasetResult updateDataset(UpdateDatasetRequest updateDatasetRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateDatasetResult) execute(updateDatasetRequest, new UpdateDatasetResult());
    }

    public void updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateDatasetRequest, new UpdateDatasetResult(), cosXmlResultListener);
    }

    public UpdateFileMetaIndexResult updateFileMetaIndex(UpdateFileMetaIndexRequest updateFileMetaIndexRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateFileMetaIndexResult) execute(updateFileMetaIndexRequest, new UpdateFileMetaIndexResult());
    }

    public void updateFileMetaIndexAsync(UpdateFileMetaIndexRequest updateFileMetaIndexRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateFileMetaIndexRequest, new UpdateFileMetaIndexResult(), cosXmlResultListener);
    }

    public UpdateMediaQueueResult updateMediaQueue(UpdateMediaQueueRequest updateMediaQueueRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateMediaQueueResult) execute(updateMediaQueueRequest, new UpdateMediaQueueResult());
    }

    public void updateMediaQueueAsync(UpdateMediaQueueRequest updateMediaQueueRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateMediaQueueRequest, new UpdateMediaQueueResult(), cosXmlResultListener);
    }

    public UpdateNoiseReductionTempleteResult updateNoiseReductionTemplete(UpdateNoiseReductionTempleteRequest updateNoiseReductionTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateNoiseReductionTempleteResult) execute(updateNoiseReductionTempleteRequest, new UpdateNoiseReductionTempleteResult());
    }

    public void updateNoiseReductionTempleteAsync(UpdateNoiseReductionTempleteRequest updateNoiseReductionTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateNoiseReductionTempleteRequest, new UpdateNoiseReductionTempleteResult(), cosXmlResultListener);
    }

    public UpdateSpeechRecognitionTempleteResult updateSpeechRecognitionTemplete(UpdateSpeechRecognitionTempleteRequest updateSpeechRecognitionTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateSpeechRecognitionTempleteResult) execute(updateSpeechRecognitionTempleteRequest, new UpdateSpeechRecognitionTempleteResult());
    }

    public void updateSpeechRecognitionTempleteAsync(UpdateSpeechRecognitionTempleteRequest updateSpeechRecognitionTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateSpeechRecognitionTempleteRequest, new UpdateSpeechRecognitionTempleteResult(), cosXmlResultListener);
    }

    public UpdateVideoTargetTempleteResult updateVideoTargetTemplete(UpdateVideoTargetTempleteRequest updateVideoTargetTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateVideoTargetTempleteResult) execute(updateVideoTargetTempleteRequest, new UpdateVideoTargetTempleteResult());
    }

    public void updateVideoTargetTempleteAsync(UpdateVideoTargetTempleteRequest updateVideoTargetTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateVideoTargetTempleteRequest, new UpdateVideoTargetTempleteResult(), cosXmlResultListener);
    }

    public UpdateVoiceSeparateTempleteResult updateVoiceSeparateTemplete(UpdateVoiceSeparateTempleteRequest updateVoiceSeparateTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateVoiceSeparateTempleteResult) execute(updateVoiceSeparateTempleteRequest, new UpdateVoiceSeparateTempleteResult());
    }

    public void updateVoiceSeparateTempleteAsync(UpdateVoiceSeparateTempleteRequest updateVoiceSeparateTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateVoiceSeparateTempleteRequest, new UpdateVoiceSeparateTempleteResult(), cosXmlResultListener);
    }

    public UpdateVoiceSynthesisTempleteResult updateVoiceSynthesisTemplete(UpdateVoiceSynthesisTempleteRequest updateVoiceSynthesisTempleteRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UpdateVoiceSynthesisTempleteResult) execute(updateVoiceSynthesisTempleteRequest, new UpdateVoiceSynthesisTempleteResult());
    }

    public void updateVoiceSynthesisTempleteAsync(UpdateVoiceSynthesisTempleteRequest updateVoiceSynthesisTempleteRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(updateVoiceSynthesisTempleteRequest, new UpdateVoiceSynthesisTempleteResult(), cosXmlResultListener);
    }

    public VocalScoreResult vocalScore(VocalScoreRequest vocalScoreRequest) throws CosXmlClientException, CosXmlServiceException {
        return (VocalScoreResult) execute(vocalScoreRequest, new VocalScoreResult());
    }

    public void vocalScoreAsync(VocalScoreRequest vocalScoreRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(vocalScoreRequest, new VocalScoreResult(), cosXmlResultListener);
    }
}
