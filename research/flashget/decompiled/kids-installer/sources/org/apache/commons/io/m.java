package org.apache.commons.io;

import java.io.Serializable;

/* compiled from: IOCase.java */
/* loaded from: classes5.dex */
public final class m implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final m f32035q = new m("Sensitive", true);

    /* renamed from: r, reason: collision with root package name */
    public static final m f32036r = new m("Insensitive", false);

    /* renamed from: s, reason: collision with root package name */
    public static final m f32037s = new m("System", !k.z());

    /* renamed from: t, reason: collision with root package name */
    private static final long f32038t = -6343169151696340687L;

    /* renamed from: o, reason: collision with root package name */
    private final String f32039o;

    /* renamed from: p, reason: collision with root package name */
    private final transient boolean f32040p;

    private m(String str, boolean z5) {
        this.f32039o = str;
        this.f32040p = z5;
    }

    public static m g(String str) {
        m mVar = f32035q;
        if (mVar.f32039o.equals(str)) {
            return mVar;
        }
        m mVar2 = f32036r;
        if (mVar2.f32039o.equals(str)) {
            return mVar2;
        }
        m mVar3 = f32037s;
        if (mVar3.f32039o.equals(str)) {
            return mVar3;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a("Invalid IOCase name: ", str));
    }

    private Object j() {
        return g(this.f32039o);
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f32040p ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public boolean b(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f32040p, str.length() - length, str2, 0, length);
    }

    public boolean c(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f32040p ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public int d(String str, int i5, String str2) {
        int length = str.length() - str2.length();
        if (length < i5) {
            return -1;
        }
        while (i5 <= length) {
            if (e(str, i5, str2)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public boolean e(String str, int i5, String str2) {
        return str.regionMatches(!this.f32040p, i5, str2, 0, str2.length());
    }

    public boolean f(String str, String str2) {
        return str.regionMatches(!this.f32040p, 0, str2, 0, str2.length());
    }

    public String h() {
        return this.f32039o;
    }

    public boolean i() {
        return this.f32040p;
    }

    public String toString() {
        return this.f32039o;
    }
}
