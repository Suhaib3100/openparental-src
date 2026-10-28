package com.tencent.cos.xml.model.tag.pic;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosTrackService;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PicOperations {
    private static final String TAG = ProtectedSandApp.s("仄\u0001");
    private boolean isPicInfo;
    private List<PicOperationRule> rules;

    public PicOperations(boolean z4, List<PicOperationRule> list) {
        this.isPicInfo = z4;
        this.rules = list;
    }

    public String toJsonStr() {
        List<PicOperationRule> list = this.rules;
        String s4 = ProtectedSandApp.s("仁\u0001");
        if (list != null && !list.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ProtectedSandApp.s("仂\u0001"), this.isPicInfo ? 1 : 0);
                JSONArray jSONArray = new JSONArray();
                Iterator<PicOperationRule> it = this.rules.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJsonObject());
                }
                jSONObject.put(ProtectedSandApp.s("仃\u0001"), jSONArray);
                return jSONObject.toString();
            } catch (JSONException e4) {
                CosTrackService.getInstance().reportError(ProtectedSandApp.s("仄\u0001"), e4);
                e4.printStackTrace();
            }
        }
        return s4;
    }
}
