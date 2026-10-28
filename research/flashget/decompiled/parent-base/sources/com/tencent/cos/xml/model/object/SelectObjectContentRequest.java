package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.listener.SelectObjectContentListener;
import com.tencent.cos.xml.model.tag.eventstreaming.InputSerialization;
import com.tencent.cos.xml.model.tag.eventstreaming.OutputSerialization;
import com.tencent.cos.xml.model.tag.eventstreaming.RequestProgress;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectRequest;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SelectObjectContentRequest extends ObjectRequest {
    public static final String EXPRESSION_TYPE_SQL = ProtectedSandApp.s("䦫\u0001");
    private String expression;
    private String expressionType;
    private InputSerialization inputSerialization;
    private OutputSerialization outputSerialization;
    private RequestProgress requestProgress;
    private SelectObjectContentListener selectObjectContentProgressListener;
    private String selectResponseFilePath;

    public SelectObjectContentRequest(String str, String str2, String str3, String str4, RequestProgress requestProgress, InputSerialization inputSerialization, OutputSerialization outputSerialization) {
        super(str, str2);
        this.expression = str4;
        this.expressionType = str3;
        this.requestProgress = requestProgress;
        this.inputSerialization = inputSerialization;
        this.outputSerialization = outputSerialization;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦬\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䦭\u0001"), null);
        this.queryParameters.put(ProtectedSandApp.s("䦮\u0001"), ProtectedSandApp.s("䦯\u0001"));
        return this.queryParameters;
    }

    public SelectObjectContentListener getSelectObjectContentProgressListener() {
        return this.selectObjectContentProgressListener;
    }

    public String getSelectResponseFilePath() {
        return this.selectResponseFilePath;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setSelectObjectContentProgressListener(SelectObjectContentListener selectObjectContentListener) {
        this.selectObjectContentProgressListener = selectObjectContentListener;
    }

    public void setSelectResponseFilePath(String str) {
        this.selectResponseFilePath = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("䦰\u0001"), XmlBuilder.buildSelectRequest(new SelectRequest(this.expressionType, this.expression, this.requestProgress, this.inputSerialization, this.outputSerialization)));
    }

    public SelectObjectContentRequest(String str, String str2, String str3, boolean z4, InputSerialization inputSerialization, OutputSerialization outputSerialization) {
        this(str, str2, ProtectedSandApp.s("䦫\u0001"), str3, new RequestProgress(Boolean.valueOf(z4)), inputSerialization, outputSerialization);
    }
}
