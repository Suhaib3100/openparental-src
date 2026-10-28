package com.airbnb.lottie.model;

import androidx.annotation.c1;
import androidx.annotation.j;
import androidx.annotation.q0;
import androidx.compose.animation.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f39086c = new e(ProtectedSandApp.s("Œ"));

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f39087a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private f f39088b;

    public e(String... strArr) {
        this.f39087a = Arrays.asList(strArr);
    }

    private boolean b() {
        return ((String) androidx.appcompat.view.menu.d.a(this.f39087a, 1)).equals(ProtectedSandApp.s("œ"));
    }

    private boolean f(String str) {
        return ProtectedSandApp.s("Ŕ").equals(str);
    }

    @c1({c1.a.LIBRARY})
    @j
    public e a(String str) {
        e eVar = new e(this);
        eVar.f39087a.add(str);
        return eVar;
    }

    @c1({c1.a.LIBRARY})
    public boolean c(String str, int i4) {
        if (i4 >= this.f39087a.size()) {
            return false;
        }
        boolean z4 = i4 == this.f39087a.size() - 1;
        String str2 = this.f39087a.get(i4);
        if (!str2.equals(ProtectedSandApp.s("œ"))) {
            return (z4 || (i4 == this.f39087a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(ProtectedSandApp.s("ŕ")));
        }
        if (!z4 && this.f39087a.get(i4 + 1).equals(str)) {
            return i4 == this.f39087a.size() + (-2) || (i4 == this.f39087a.size() + (-3) && b());
        }
        if (z4) {
            return true;
        }
        int i5 = i4 + 1;
        if (i5 < this.f39087a.size() - 1) {
            return false;
        }
        return this.f39087a.get(i5).equals(str);
    }

    @q0
    @c1({c1.a.LIBRARY})
    public f d() {
        return this.f39088b;
    }

    @c1({c1.a.LIBRARY})
    public int e(String str, int i4) {
        if (ProtectedSandApp.s("Ŕ").equals(str)) {
            return 0;
        }
        if (this.f39087a.get(i4).equals(ProtectedSandApp.s("œ"))) {
            return (i4 != this.f39087a.size() - 1 && this.f39087a.get(i4 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f39087a.equals(eVar.f39087a)) {
            return false;
        }
        f fVar = this.f39088b;
        f fVar2 = eVar.f39088b;
        return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
    }

    public String g() {
        return this.f39087a.toString();
    }

    @c1({c1.a.LIBRARY})
    public boolean h(String str, int i4) {
        if (ProtectedSandApp.s("Ŕ").equals(str)) {
            return true;
        }
        if (i4 >= this.f39087a.size()) {
            return false;
        }
        return this.f39087a.get(i4).equals(str) || this.f39087a.get(i4).equals(ProtectedSandApp.s("œ")) || this.f39087a.get(i4).equals(ProtectedSandApp.s("ŕ"));
    }

    public int hashCode() {
        int hashCode = this.f39087a.hashCode() * 31;
        f fVar = this.f39088b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    @c1({c1.a.LIBRARY})
    public boolean i(String str, int i4) {
        return ProtectedSandApp.s("Ŕ").equals(str) || i4 < this.f39087a.size() - 1 || this.f39087a.get(i4).equals(ProtectedSandApp.s("œ"));
    }

    @c1({c1.a.LIBRARY})
    public e j(f fVar) {
        e eVar = new e(this);
        eVar.f39088b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ŗ"));
        sb.append(this.f39087a);
        sb.append(ProtectedSandApp.s("ŗ"));
        return l.a(sb, this.f39088b != null, '}');
    }

    private e(e eVar) {
        this.f39087a = new ArrayList(eVar.f39087a);
        this.f39088b = eVar.f39088b;
    }
}
