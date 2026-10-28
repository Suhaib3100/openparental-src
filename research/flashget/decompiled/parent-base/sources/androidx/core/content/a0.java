package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25970a;

    /* renamed from: b, reason: collision with root package name */
    private final LocusId f25971b;

    /* compiled from: LocusIdCompat.java */
    @x0(29)
    private static class a {
        private a() {
        }

        @o0
        static LocusId a(@o0 String str) {
            return new LocusId(str);
        }

        @o0
        static String b(@o0 LocusId locusId) {
            return locusId.getId();
        }
    }

    public a0(@o0 String str) {
        this.f25970a = (String) androidx.core.util.w.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f25971b = a.a(str);
        } else {
            this.f25971b = null;
        }
    }

    @o0
    private String b() {
        return this.f25970a.length() + "_chars";
    }

    @o0
    @x0(29)
    public static a0 d(@o0 LocusId locusId) {
        androidx.core.util.w.m(locusId, "locusId cannot be null");
        return new a0((String) androidx.core.util.w.q(a.b(locusId), "id cannot be empty"));
    }

    @o0
    public String a() {
        return this.f25970a;
    }

    @o0
    @x0(29)
    public LocusId c() {
        return this.f25971b;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        String str = this.f25970a;
        return str == null ? a0Var.f25970a == null : str.equals(a0Var.f25970a);
    }

    public int hashCode() {
        String str = this.f25970a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @o0
    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder("LocusIdCompat["), b(), "]");
    }
}
