package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f4541a;

    /* renamed from: b, reason: collision with root package name */
    private final LocusId f4542b;

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
            String id;
            id = locusId.getId();
            return id;
        }
    }

    public k(@o0 String str) {
        this.f4541a = (String) androidx.core.util.q.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4542b = a.a(str);
        } else {
            this.f4542b = null;
        }
    }

    @o0
    private String b() {
        return this.f4541a.length() + "_chars";
    }

    @o0
    @x0(29)
    public static k d(@o0 LocusId locusId) {
        String id;
        androidx.core.util.q.m(locusId, "locusId cannot be null");
        id = locusId.getId();
        return new k((String) androidx.core.util.q.q(id, "id cannot be empty"));
    }

    @o0
    public String a() {
        return this.f4541a;
    }

    @o0
    @x0(29)
    public LocusId c() {
        return this.f4542b;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        String str = this.f4541a;
        return str == null ? kVar.f4541a == null : str.equals(kVar.f4541a);
    }

    public int hashCode() {
        String str = this.f4541a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @o0
    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder("LocusIdCompat["), b(), "]");
    }
}
