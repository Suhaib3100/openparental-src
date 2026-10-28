package com.google.zxing.client.result;

/* compiled from: ParsedResult.java */
/* loaded from: classes6.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private final r f62745a;

    protected q(r rVar) {
        this.f62745a = rVar;
    }

    public static void c(String str, StringBuilder sb) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    public static void d(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                c(str, sb);
            }
        }
    }

    public abstract String a();

    public final r b() {
        return this.f62745a;
    }

    public final String toString() {
        return a();
    }
}
