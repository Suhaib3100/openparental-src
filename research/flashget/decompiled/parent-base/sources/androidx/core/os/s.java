package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.x0;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
@x0(24)
/* loaded from: classes3.dex */
final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f26554a;

    s(Object obj) {
        this.f26554a = (LocaleList) obj;
    }

    @Override // androidx.core.os.r
    public int a(Locale locale) {
        return this.f26554a.indexOf(locale);
    }

    @Override // androidx.core.os.r
    public String b() {
        return this.f26554a.toLanguageTags();
    }

    @Override // androidx.core.os.r
    public Object c() {
        return this.f26554a;
    }

    @Override // androidx.core.os.r
    @androidx.annotation.q0
    public Locale d(@androidx.annotation.o0 String[] strArr) {
        return this.f26554a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f26554a.equals(((r) obj).c());
    }

    @Override // androidx.core.os.r
    public Locale get(int i4) {
        return this.f26554a.get(i4);
    }

    public int hashCode() {
        return this.f26554a.hashCode();
    }

    @Override // androidx.core.os.r
    public boolean isEmpty() {
        return this.f26554a.isEmpty();
    }

    @Override // androidx.core.os.r
    public int size() {
        return this.f26554a.size();
    }

    public String toString() {
        return this.f26554a.toString();
    }
}
