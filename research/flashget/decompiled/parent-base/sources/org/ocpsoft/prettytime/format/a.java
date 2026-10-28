package org.ocpsoft.prettytime.format;

import android.support.v4.media.b;
import androidx.room.l0;
import java.util.regex.Pattern;
import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeFormat;

/* compiled from: SimpleTimeFormat.java */
/* loaded from: classes9.dex */
public class a implements TimeFormat {

    /* renamed from: a, reason: collision with root package name */
    private String f87803a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f87804b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f87805c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f87806d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f87807e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f87808f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f87809g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f87810h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f87811i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f87812j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f87813k = "";

    /* renamed from: l, reason: collision with root package name */
    private int f87814l = 50;

    /* renamed from: p, reason: collision with root package name */
    public static final String f87801p = "%u";

    /* renamed from: m, reason: collision with root package name */
    private static final String f87798m = "-";

    /* renamed from: n, reason: collision with root package name */
    public static final String f87799n = "%s";

    /* renamed from: o, reason: collision with root package name */
    public static final String f87800o = "%n";

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f87802q = Pattern.compile("\\s{2,}");

    private String e(String str, String str2, long j4) {
        return i(j4).replace("%s", str).replace("%n", String.valueOf(j4)).replace("%u", str2);
    }

    private String f(Duration duration, boolean z4) {
        return e(l(duration), g(duration, z4), k(duration, z4));
    }

    private String j(Duration duration) {
        return (!duration.b() || this.f87806d == null || this.f87805c.length() <= 0) ? (!duration.e() || this.f87808f == null || this.f87807e.length() <= 0) ? this.f87804b : this.f87808f : this.f87806d;
    }

    private String l(Duration duration) {
        return duration.f() < 0 ? "-" : "";
    }

    private String m(Duration duration) {
        String str;
        String str2;
        return (!duration.b() || (str2 = this.f87805c) == null || str2.length() <= 0) ? (!duration.e() || (str = this.f87807e) == null || str.length() <= 0) ? this.f87803a : this.f87807e : this.f87805c;
    }

    @Override // org.ocpsoft.prettytime.TimeFormat
    public String a(Duration duration, String str) {
        StringBuilder sb = new StringBuilder();
        if (duration.e()) {
            l0.a(sb, this.f87812j, " ", str, " ");
            sb.append(this.f87813k);
        } else {
            l0.a(sb, this.f87810h, " ", str, " ");
            sb.append(this.f87811i);
        }
        return f87802q.matcher(sb).replaceAll(" ").trim();
    }

    @Override // org.ocpsoft.prettytime.TimeFormat
    public String b(Duration duration) {
        return f(duration, true);
    }

    @Override // org.ocpsoft.prettytime.TimeFormat
    public String c(Duration duration, String str) {
        return a(duration, str);
    }

    @Override // org.ocpsoft.prettytime.TimeFormat
    public String d(Duration duration) {
        return f(duration, false);
    }

    protected String g(Duration duration, boolean z4) {
        return (Math.abs(k(duration, z4)) == 0 || Math.abs(k(duration, z4)) > 1) ? j(duration) : m(duration);
    }

    public String h() {
        return this.f87809g;
    }

    protected String i(long j4) {
        return this.f87809g;
    }

    protected long k(Duration duration, boolean z4) {
        return Math.abs(z4 ? duration.d(this.f87814l) : duration.f());
    }

    public a n(String str) {
        this.f87806d = str;
        return this;
    }

    public a o(String str) {
        this.f87810h = str.trim();
        return this;
    }

    public a p(String str) {
        this.f87805c = str;
        return this;
    }

    public a q(String str) {
        this.f87811i = str.trim();
        return this;
    }

    public a r(String str) {
        this.f87808f = str;
        return this;
    }

    public a s(String str) {
        this.f87812j = str.trim();
        return this;
    }

    public a t(String str) {
        this.f87807e = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimpleTimeFormat [pattern=");
        sb.append(this.f87809g);
        sb.append(", futurePrefix=");
        sb.append(this.f87810h);
        sb.append(", futureSuffix=");
        sb.append(this.f87811i);
        sb.append(", pastPrefix=");
        sb.append(this.f87812j);
        sb.append(", pastSuffix=");
        sb.append(this.f87813k);
        sb.append(", roundingTolerance=");
        return b.a(sb, this.f87814l, "]");
    }

    public a u(String str) {
        this.f87813k = str.trim();
        return this;
    }

    public a v(String str) {
        this.f87809g = str;
        return this;
    }

    public a w(String str) {
        this.f87804b = str;
        return this;
    }

    public a x(int i4) {
        this.f87814l = i4;
        return this;
    }

    public a y(String str) {
        this.f87803a = str;
        return this;
    }
}
