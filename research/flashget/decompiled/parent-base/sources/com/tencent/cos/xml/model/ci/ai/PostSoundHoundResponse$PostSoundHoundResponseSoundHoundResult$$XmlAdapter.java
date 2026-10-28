package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSoundHoundResponse$PostSoundHoundResponseSoundHoundResult$$XmlAdapter extends IXmlAdapter<PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult> {
    private HashMap<String, ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult>> childElementBinders;

    public PostSoundHoundResponse$PostSoundHoundResponseSoundHoundResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㶇\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseSoundHoundResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult postSoundHoundResponseSoundHoundResult, String str) throws IOException, XmlPullParserException {
                if (postSoundHoundResponseSoundHoundResult.songList == null) {
                    postSoundHoundResponseSoundHoundResult.songList = new ArrayList();
                }
                postSoundHoundResponseSoundHoundResult.songList.add((PostSoundHoundResponse.PostSoundHoundResponseSongList) QCloudXml.fromXml(xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseSongList.class, ProtectedSandApp.s("㶆\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult postSoundHoundResponseSoundHoundResult = new PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSoundHoundResponseSoundHoundResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶈\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSoundHoundResponseSoundHoundResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSoundHoundResponseSoundHoundResult;
    }
}
