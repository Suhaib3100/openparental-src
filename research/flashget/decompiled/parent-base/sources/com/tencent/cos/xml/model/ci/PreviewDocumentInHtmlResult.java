package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.model.object.GetObjectResult;

/* loaded from: classes7.dex */
public class PreviewDocumentInHtmlResult extends GetObjectResult {
    private final String previewFilePath;

    public PreviewDocumentInHtmlResult(String str) {
        this.previewFilePath = str;
    }

    public String getPreviewFilePath() {
        return this.previewFilePath;
    }
}
