package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.w;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f26576a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26577b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26578c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f26579d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26580e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26581f;

    public g(@o0 String str, @o0 String str2, @o0 String str3, @o0 List<List<byte[]>> list) {
        str.getClass();
        this.f26576a = str;
        str2.getClass();
        this.f26577b = str2;
        str3.getClass();
        this.f26578c = str3;
        list.getClass();
        this.f26579d = list;
        this.f26580e = 0;
        this.f26581f = a(str, str2, str3);
    }

    private String a(@o0 String str, @o0 String str2, @o0 String str3) {
        return f.a(str, "-", str2, "-", str3);
    }

    @q0
    public List<List<byte[]>> b() {
        return this.f26579d;
    }

    @androidx.annotation.e
    public int c() {
        return this.f26580e;
    }

    @c1({c1.a.LIBRARY})
    @o0
    String d() {
        return this.f26581f;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f26581f;
    }

    @o0
    public String f() {
        return this.f26576a;
    }

    @o0
    public String g() {
        return this.f26577b;
    }

    @o0
    public String h() {
        return this.f26578c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f26576a + ", mProviderPackage: " + this.f26577b + ", mQuery: " + this.f26578c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f26579d.size(); i4++) {
            sb.append(" [");
            List<byte[]> list = this.f26579d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f26580e);
        return sb.toString();
    }

    public g(@o0 String str, @o0 String str2, @o0 String str3, @androidx.annotation.e int i4) {
        str.getClass();
        this.f26576a = str;
        str2.getClass();
        this.f26577b = str2;
        str3.getClass();
        this.f26578c = str3;
        this.f26579d = null;
        w.a(i4 != 0);
        this.f26580e = i4;
        this.f26581f = a(str, str2, str3);
    }
}
