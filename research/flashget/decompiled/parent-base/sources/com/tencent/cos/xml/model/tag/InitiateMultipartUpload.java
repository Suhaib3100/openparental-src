package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class InitiateMultipartUpload {
    public String bucket;
    public String key;
    public String uploadId;

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䨹\u0001"));
        sb.append(this.bucket);
        sb.append(ProtectedSandApp.s("䨺\u0001"));
        sb.append(this.key);
        sb.append(ProtectedSandApp.s("䨻\u0001"));
        return c.a(sb, this.uploadId, ProtectedSandApp.s("䨼\u0001"));
    }
}
