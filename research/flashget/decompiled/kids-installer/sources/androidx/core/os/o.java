package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
@x0(24)
/* loaded from: classes3.dex */
final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f4986a;

    o(Object obj) {
        this.f4986a = (LocaleList) obj;
    }

    @Override // androidx.core.os.n
    public int a(Locale locale) {
        return this.f4986a.indexOf(locale);
    }

    @Override // androidx.core.os.n
    public String b() {
        return this.f4986a.toLanguageTags();
    }

    @Override // androidx.core.os.n
    public Object c() {
        return this.f4986a;
    }

    @Override // androidx.core.os.n
    @q0
    public Locale d(@o0 String[] strArr) {
        return this.f4986a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f4986a.equals(((n) obj).c());
    }

    @Override // androidx.core.os.n
    public Locale get(int i5) {
        return this.f4986a.get(i5);
    }

    public int hashCode() {
        return this.f4986a.hashCode();
    }

    @Override // androidx.core.os.n
    public boolean isEmpty() {
        return this.f4986a.isEmpty();
    }

    @Override // androidx.core.os.n
    public int size() {
        return this.f4986a.size();
    }

    public String toString() {
        return this.f4986a.toString();
    }
}
