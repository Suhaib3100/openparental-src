package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.ListBucketVersions;
import com.tencent.cos.xml.transfer.XmlParser;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@Deprecated
/* loaded from: classes6.dex */
public class ListBucketVersionsResult extends CosXmlResult {
    public ListBucketVersions listBucketVersions = new ListBucketVersions();

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        ListBucketVersions listBucketVersions = this.listBucketVersions;
        return listBucketVersions != null ? listBucketVersions.toString() : super.printResult();
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    protected void xmlParser(HttpResponse httpResponse) throws XmlPullParserException, IOException {
        XmlParser.parseListBucketVersions(httpResponse.byteStream(), this.listBucketVersions);
    }
}
