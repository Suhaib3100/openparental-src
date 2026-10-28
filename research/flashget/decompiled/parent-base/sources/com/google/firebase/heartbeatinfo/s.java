package com.google.firebase.heartbeatinfo;

/* compiled from: SdkHeartBeatResult.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class s implements Comparable<s> {
    public static s b(String str, long j4) {
        return new b(str, j4);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(s sVar) {
        return c() < sVar.c() ? -1 : 1;
    }

    public abstract long c();

    public abstract String d();
}
