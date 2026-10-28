package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.q;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f5013a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5014b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5015c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f5016d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5017e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5018f;

    public f(@o0 String str, @o0 String str2, @o0 String str3, @o0 List<List<byte[]>> list) {
        str.getClass();
        this.f5013a = str;
        str2.getClass();
        this.f5014b = str2;
        str3.getClass();
        this.f5015c = str3;
        list.getClass();
        this.f5016d = list;
        this.f5017e = 0;
        this.f5018f = a(str, str2, str3);
    }

    private String a(@o0 String str, @o0 String str2, @o0 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @q0
    public List<List<byte[]>> b() {
        return this.f5016d;
    }

    @androidx.annotation.e
    public int c() {
        return this.f5017e;
    }

    @c1({c1.a.LIBRARY})
    @o0
    String d() {
        return this.f5018f;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f5018f;
    }

    @o0
    public String f() {
        return this.f5013a;
    }

    @o0
    public String g() {
        return this.f5014b;
    }

    @o0
    public String h() {
        return this.f5015c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5013a + ", mProviderPackage: " + this.f5014b + ", mQuery: " + this.f5015c + ", mCertificates:");
        for (int i5 = 0; i5 < this.f5016d.size(); i5++) {
            sb.append(" [");
            List<byte[]> list = this.f5016d.get(i5);
            for (int i6 = 0; i6 < list.size(); i6++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i6), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f5017e);
        return sb.toString();
    }

    public f(@o0 String str, @o0 String str2, @o0 String str3, @androidx.annotation.e int i5) {
        str.getClass();
        this.f5013a = str;
        str2.getClass();
        this.f5014b = str2;
        str3.getClass();
        this.f5015c = str3;
        this.f5016d = null;
        q.a(i5 != 0);
        this.f5017e = i5;
        this.f5018f = a(str, str2, str3);
    }
}
