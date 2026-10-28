package com.google.firebase.analytics;

import androidx.annotation.q0;
import com.google.firebase.analytics.FirebaseAnalytics;
import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/analytics/b;", "", "<init>", "()V", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$b;", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "a", "()Ljava/util/Map;", "adPersonalization", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "b", "()Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "f", "(Lcom/google/firebase/analytics/FirebaseAnalytics$a;)V", "adStorage", "c", "g", "adUserData", "d", "h", "analyticsStorage", "e", "i", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m
    private FirebaseAnalytics.a f58359a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private FirebaseAnalytics.a f58360b;

    /* renamed from: c, reason: collision with root package name */
    @m
    private FirebaseAnalytics.a f58361c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private FirebaseAnalytics.a f58362d;

    @l
    public final Map<FirebaseAnalytics.b, FirebaseAnalytics.a> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.a aVar = this.f58359a;
        if (aVar != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_STORAGE, aVar);
        }
        FirebaseAnalytics.a aVar2 = this.f58360b;
        if (aVar2 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, aVar2);
        }
        FirebaseAnalytics.a aVar3 = this.f58361c;
        if (aVar3 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_USER_DATA, aVar3);
        }
        FirebaseAnalytics.a aVar4 = this.f58362d;
        if (aVar4 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, aVar4);
        }
        return linkedHashMap;
    }

    @q0
    /* renamed from: b, reason: from getter */
    public final FirebaseAnalytics.a getF58362d() {
        return this.f58362d;
    }

    @q0
    /* renamed from: c, reason: from getter */
    public final FirebaseAnalytics.a getF58359a() {
        return this.f58359a;
    }

    @q0
    /* renamed from: d, reason: from getter */
    public final FirebaseAnalytics.a getF58361c() {
        return this.f58361c;
    }

    @q0
    /* renamed from: e, reason: from getter */
    public final FirebaseAnalytics.a getF58360b() {
        return this.f58360b;
    }

    public final void f(@m FirebaseAnalytics.a aVar) {
        this.f58362d = aVar;
    }

    public final void g(@m FirebaseAnalytics.a aVar) {
        this.f58359a = aVar;
    }

    public final void h(@m FirebaseAnalytics.a aVar) {
        this.f58361c = aVar;
    }

    public final void i(@m FirebaseAnalytics.a aVar) {
        this.f58360b = aVar;
    }
}
