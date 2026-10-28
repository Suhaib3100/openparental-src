package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes3.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    final Set f15316a;

    /* renamed from: b, reason: collision with root package name */
    private final a.b f15317b;

    /* renamed from: c, reason: collision with root package name */
    private final AppMeasurementSdk f15318c;

    /* renamed from: d, reason: collision with root package name */
    private final d f15319d;

    public e(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f15317b = bVar;
        this.f15318c = appMeasurementSdk;
        d dVar = new d(this);
        this.f15319d = dVar;
        appMeasurementSdk.registerOnMeasurementEventListener(dVar);
        this.f15316a = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0010 A[SYNTHETIC] */
    @Override // com.google.firebase.analytics.connector.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Set r10) {
        /*
            r9 = this;
            java.util.Set r0 = r9.f15316a
            r0.clear()
            java.util.Set r0 = r9.f15316a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L10:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1.size()
            r4 = 50
            if (r3 < r4) goto L26
            goto La0
        L26:
            int r3 = com.google.firebase.analytics.connector.internal.c.f15314g
            r3 = 95
            r4 = 0
            if (r2 != 0) goto L2f
        L2d:
            r5 = r4
            goto L62
        L2f:
            int r5 = r2.length()
            if (r5 != 0) goto L36
            goto L2d
        L36:
            int r5 = r2.codePointAt(r4)
            boolean r6 = java.lang.Character.isLetter(r5)
            if (r6 != 0) goto L44
            if (r5 == r3) goto L43
            goto L2d
        L43:
            r5 = r3
        L44:
            int r6 = r2.length()
            int r5 = java.lang.Character.charCount(r5)
        L4c:
            if (r5 >= r6) goto L61
            int r7 = r2.codePointAt(r5)
            if (r7 == r3) goto L5b
            boolean r8 = java.lang.Character.isLetterOrDigit(r7)
            if (r8 != 0) goto L5b
            goto L2d
        L5b:
            int r7 = java.lang.Character.charCount(r7)
            int r5 = r5 + r7
            goto L4c
        L61:
            r5 = 1
        L62:
            if (r5 == 0) goto L10
            int r5 = r2.length()
            if (r5 == 0) goto L10
            int r4 = r2.codePointAt(r4)
            boolean r5 = java.lang.Character.isLetter(r4)
            if (r5 == 0) goto L10
            int r5 = r2.length()
            int r4 = java.lang.Character.charCount(r4)
        L7c:
            if (r4 >= r5) goto L90
            int r6 = r2.codePointAt(r4)
            if (r6 == r3) goto L8a
            boolean r7 = java.lang.Character.isLetterOrDigit(r6)
            if (r7 == 0) goto L10
        L8a:
            int r6 = java.lang.Character.charCount(r6)
            int r4 = r4 + r6
            goto L7c
        L90:
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzhc.zzb(r2)
            if (r3 != 0) goto L97
            goto L98
        L97:
            r2 = r3
        L98:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r1.add(r2)
            goto L10
        La0:
            r0.addAll(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.e.a(java.util.Set):void");
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b zza() {
        return this.f15317b;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void zzc() {
        this.f15316a.clear();
    }
}
