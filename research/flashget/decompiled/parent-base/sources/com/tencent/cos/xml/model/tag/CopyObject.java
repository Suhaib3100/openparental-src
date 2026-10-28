package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class CopyObject {
    public String eTag;
    public String lastModified;

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䨆\u0001"));
        sb.append(this.eTag);
        sb.append(ProtectedSandApp.s("䨇\u0001"));
        return c.a(sb, this.lastModified, ProtectedSandApp.s("䨈\u0001"));
    }
}
