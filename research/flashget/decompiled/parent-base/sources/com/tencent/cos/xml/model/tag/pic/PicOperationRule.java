package com.tencent.cos.xml.model.tag.pic;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosTrackService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PicOperationRule {
    private static final String TAG = ProtectedSandApp.s("什\u0001");
    private String bucket;
    private String fileId;
    private String rule;

    public PicOperationRule(String str) {
        this.fileId = this.fileId;
        this.rule = str;
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.bucket)) {
                jSONObject.put(ProtectedSandApp.s("亽\u0001"), this.bucket);
            }
            if (!TextUtils.isEmpty(this.fileId)) {
                jSONObject.put(ProtectedSandApp.s("亾\u0001"), this.fileId);
            }
            jSONObject.put(ProtectedSandApp.s("亿\u0001"), this.rule);
        } catch (JSONException e4) {
            CosTrackService.getInstance().reportError(ProtectedSandApp.s("什\u0001"), e4);
            e4.printStackTrace();
        }
        return jSONObject;
    }

    public PicOperationRule(String str, String str2) {
        this.fileId = str;
        this.rule = str2;
    }

    public PicOperationRule(String str, String str2, String str3) {
        this.bucket = str;
        this.fileId = str2;
        this.rule = str3;
    }
}
