package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: HeartBeatResult.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class s {
    public static s a(String str, List<String> list) {
        return new a(str, list);
    }

    public abstract List<String> b();

    public abstract String c();
}
