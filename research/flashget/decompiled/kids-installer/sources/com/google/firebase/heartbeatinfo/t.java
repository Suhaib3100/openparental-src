package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

/* compiled from: SdkHeartBeatResult.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class t implements Comparable<t> {
    public static t h(String str, long j5) {
        return new b(str, j5);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(t tVar) {
        return j() < tVar.j() ? -1 : 1;
    }

    public abstract long j();

    public abstract String l();
}
