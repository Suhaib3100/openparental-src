package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class COSMetaData {
    private Map<String, String> metaData = new HashMap();

    public String get(String str) {
        return this.metaData.get(str);
    }

    public Set<String> keySet() {
        return this.metaData.keySet();
    }

    public void put(String str, String str2) {
        String s4 = ProtectedSandApp.s("䧭\u0001");
        if (!str.startsWith(s4)) {
            str = s4.concat(str);
        }
        this.metaData.put(str, str2);
    }
}
