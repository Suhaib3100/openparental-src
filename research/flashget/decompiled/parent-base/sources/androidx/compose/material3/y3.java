package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b \u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/material3/y3;", "Landroidx/compose/material3/x3;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "monthMillis", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "b", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "dateMillis", "", "forContentDescription", "c", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "d", "", "Ljava/util/Map;", "formatterCache", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class y3 implements x3 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String yearSelectionSkeleton;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String selectedDateSkeleton;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String selectedDateDescriptionSkeleton;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, Object> formatterCache = new LinkedHashMap();

    public y3(@fg.l String str, @fg.l String str2, @fg.l String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    @Override // androidx.compose.material3.x3
    @fg.m
    public String b(@fg.m Long monthMillis, @fg.l Locale locale) {
        if (monthMillis == null) {
            return null;
        }
        return i2.b(monthMillis.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.x3
    @fg.m
    public String c(@fg.m Long dateMillis, @fg.l Locale locale, boolean forContentDescription) {
        if (dateMillis == null) {
            return null;
        }
        return i2.b(dateMillis.longValue(), forContentDescription ? this.selectedDateDescriptionSkeleton : this.selectedDateSkeleton, locale, this.formatterCache);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) other;
        return kotlin.jvm.internal.l0.g(this.yearSelectionSkeleton, y3Var.yearSelectionSkeleton) && kotlin.jvm.internal.l0.g(this.selectedDateSkeleton, y3Var.selectedDateSkeleton) && kotlin.jvm.internal.l0.g(this.selectedDateDescriptionSkeleton, y3Var.selectedDateDescriptionSkeleton);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    public int hashCode() {
        return this.selectedDateDescriptionSkeleton.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.selectedDateSkeleton, this.yearSelectionSkeleton.hashCode() * 31, 31);
    }
}
