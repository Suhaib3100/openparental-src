package org.apache.commons.io;

import java.io.Serializable;

/* compiled from: IOCase.java */
/* loaded from: classes4.dex */
public final class l implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final l f85545d = new l("Sensitive", true);

    /* renamed from: e, reason: collision with root package name */
    public static final l f85546e = new l("Insensitive", false);

    /* renamed from: f, reason: collision with root package name */
    public static final l f85547f = new l("System", !j.z());

    /* renamed from: g, reason: collision with root package name */
    private static final long f85548g = -6343169151696340687L;

    /* renamed from: b, reason: collision with root package name */
    private final String f85549b;

    /* renamed from: c, reason: collision with root package name */
    private final transient boolean f85550c;

    private l(String str, boolean z4) {
        this.f85549b = str;
        this.f85550c = z4;
    }

    public static l g(String str) {
        l lVar = f85545d;
        if (lVar.f85549b.equals(str)) {
            return lVar;
        }
        l lVar2 = f85546e;
        if (lVar2.f85549b.equals(str)) {
            return lVar2;
        }
        l lVar3 = f85547f;
        if (lVar3.f85549b.equals(str)) {
            return lVar3;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Invalid IOCase name: ", str));
    }

    private Object j() {
        return g(this.f85549b);
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f85550c ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public boolean b(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f85550c, str.length() - length, str2, 0, length);
    }

    public boolean c(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f85550c ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public int d(String str, int i4, String str2) {
        int length = str.length() - str2.length();
        if (length < i4) {
            return -1;
        }
        while (i4 <= length) {
            if (e(str, i4, str2)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public boolean e(String str, int i4, String str2) {
        return str.regionMatches(!this.f85550c, i4, str2, 0, str2.length());
    }

    public boolean f(String str, String str2) {
        return str.regionMatches(!this.f85550c, 0, str2, 0, str2.length());
    }

    public String h() {
        return this.f85549b;
    }

    public boolean i() {
        return this.f85550c;
    }

    public String toString() {
        return this.f85549b;
    }
}
