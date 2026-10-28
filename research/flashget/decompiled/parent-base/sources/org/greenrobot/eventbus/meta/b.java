package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.n;

/* compiled from: SimpleSubscriberInfo.java */
/* loaded from: classes6.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final e[] f86863d;

    public b(Class cls, boolean z4, e[] eVarArr) {
        super(cls, null, z4);
        this.f86863d = eVarArr;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public synchronized n[] a() {
        n[] nVarArr;
        int length = this.f86863d.length;
        nVarArr = new n[length];
        for (int i4 = 0; i4 < length; i4++) {
            e eVar = this.f86863d[i4];
            nVarArr[i4] = g(eVar.f86864a, eVar.f86866c, eVar.f86865b, eVar.f86867d, eVar.f86868e);
        }
        return nVarArr;
    }
}
