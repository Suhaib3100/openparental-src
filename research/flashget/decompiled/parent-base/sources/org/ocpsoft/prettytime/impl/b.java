package org.ocpsoft.prettytime.impl;

import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.LocaleAware;
import org.ocpsoft.prettytime.TimeFormat;

/* compiled from: ResourcesTimeFormat.java */
/* loaded from: classes9.dex */
public class b extends org.ocpsoft.prettytime.format.a implements TimeFormat, LocaleAware<b> {

    /* renamed from: r, reason: collision with root package name */
    private final ResourcesTimeUnit f87928r;

    /* renamed from: s, reason: collision with root package name */
    private TimeFormat f87929s;

    /* renamed from: t, reason: collision with root package name */
    private String f87930t;

    public b(ResourcesTimeUnit resourcesTimeUnit) {
        this.f87928r = resourcesTimeUnit;
    }

    @Override // org.ocpsoft.prettytime.format.a, org.ocpsoft.prettytime.TimeFormat
    public String a(Duration duration, String str) {
        TimeFormat timeFormat = this.f87929s;
        return timeFormat == null ? super.a(duration, str) : timeFormat.a(duration, str);
    }

    @Override // org.ocpsoft.prettytime.format.a, org.ocpsoft.prettytime.TimeFormat
    public String b(Duration duration) {
        TimeFormat timeFormat = this.f87929s;
        return timeFormat == null ? super.b(duration) : timeFormat.b(duration);
    }

    @Override // org.ocpsoft.prettytime.format.a, org.ocpsoft.prettytime.TimeFormat
    public String c(Duration duration, String str) {
        TimeFormat timeFormat = this.f87929s;
        return timeFormat == null ? a(duration, str) : timeFormat.c(duration, str);
    }

    @Override // org.ocpsoft.prettytime.format.a, org.ocpsoft.prettytime.TimeFormat
    public String d(Duration duration) {
        TimeFormat timeFormat = this.f87929s;
        return timeFormat == null ? super.d(duration) : timeFormat.d(duration);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // org.ocpsoft.prettytime.LocaleAware
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.ocpsoft.prettytime.impl.b setLocale(java.util.Locale r3) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.impl.b.setLocale(java.util.Locale):org.ocpsoft.prettytime.impl.b");
    }

    public b(ResourcesTimeUnit resourcesTimeUnit, String str) {
        this.f87928r = resourcesTimeUnit;
        this.f87930t = str;
    }
}
