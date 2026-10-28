package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Objects;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new t0();

    /* renamed from: r, reason: collision with root package name */
    public static final int f17045r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17046s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17047t = 2;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    Bundle f17048o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f17049p;

    /* renamed from: q, reason: collision with root package name */
    private d f17050q;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f17051a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, String> f17052b;

        public b(@androidx.annotation.o0 String str) {
            Bundle bundle = new Bundle();
            this.f17051a = bundle;
            this.f17052b = new androidx.collection.a();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("ᛲ"), str));
            }
            bundle.putString(ProtectedSandApp.s("ᛱ"), str);
        }

        @androidx.annotation.o0
        public b a(@androidx.annotation.o0 String str, @androidx.annotation.q0 String str2) {
            this.f17052b.put(str, str2);
            return this;
        }

        @androidx.annotation.o0
        public RemoteMessage b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f17052b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f17051a);
            this.f17051a.remove(ProtectedSandApp.s("ᛳ"));
            return new RemoteMessage(bundle);
        }

        @androidx.annotation.o0
        public b c() {
            this.f17052b.clear();
            return this;
        }

        @androidx.annotation.q0
        public String d() {
            return this.f17051a.getString(ProtectedSandApp.s("ᛴ"));
        }

        @androidx.annotation.o0
        public Map<String, String> e() {
            return this.f17052b;
        }

        @androidx.annotation.o0
        public String f() {
            return this.f17051a.getString(ProtectedSandApp.s("ᛵ"), "");
        }

        @androidx.annotation.q0
        public String g() {
            return this.f17051a.getString(ProtectedSandApp.s("ᛶ"));
        }

        @androidx.annotation.g0(from = 0, to = 86400)
        public int h() {
            return Integer.parseInt(this.f17051a.getString(ProtectedSandApp.s("ᛷ"), ProtectedSandApp.s("ᛸ")));
        }

        @androidx.annotation.o0
        public b i(@androidx.annotation.q0 String str) {
            this.f17051a.putString(ProtectedSandApp.s("\u16f9"), str);
            return this;
        }

        @androidx.annotation.o0
        public b j(@androidx.annotation.o0 Map<String, String> map) {
            this.f17052b.clear();
            this.f17052b.putAll(map);
            return this;
        }

        @androidx.annotation.o0
        public b k(@androidx.annotation.o0 String str) {
            this.f17051a.putString(ProtectedSandApp.s("\u16fa"), str);
            return this;
        }

        @androidx.annotation.o0
        public b l(@androidx.annotation.q0 String str) {
            this.f17051a.putString(ProtectedSandApp.s("\u16fb"), str);
            return this;
        }

        @ShowFirstParty
        @androidx.annotation.o0
        public b m(byte[] bArr) {
            this.f17051a.putByteArray(ProtectedSandApp.s("\u16fc"), bArr);
            return this;
        }

        @androidx.annotation.o0
        public b n(@androidx.annotation.g0(from = 0, to = 86400) int i5) {
            this.f17051a.putString(ProtectedSandApp.s("\u16fd"), String.valueOf(i5));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f17053a;

        /* renamed from: b, reason: collision with root package name */
        private final String f17054b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f17055c;

        /* renamed from: d, reason: collision with root package name */
        private final String f17056d;

        /* renamed from: e, reason: collision with root package name */
        private final String f17057e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f17058f;

        /* renamed from: g, reason: collision with root package name */
        private final String f17059g;

        /* renamed from: h, reason: collision with root package name */
        private final String f17060h;

        /* renamed from: i, reason: collision with root package name */
        private final String f17061i;

        /* renamed from: j, reason: collision with root package name */
        private final String f17062j;

        /* renamed from: k, reason: collision with root package name */
        private final String f17063k;

        /* renamed from: l, reason: collision with root package name */
        private final String f17064l;

        /* renamed from: m, reason: collision with root package name */
        private final String f17065m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f17066n;

        /* renamed from: o, reason: collision with root package name */
        private final String f17067o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f17068p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f17069q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f17070r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f17071s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f17072t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f17073u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f17074v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f17075w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f17076x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f17077y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f17078z;

        private static String[] p(l0 l0Var, String str) {
            Object[] g5 = l0Var.g(str);
            if (g5 == null) {
                return null;
            }
            String[] strArr = new String[g5.length];
            for (int i5 = 0; i5 < g5.length; i5++) {
                strArr[i5] = String.valueOf(g5[i5]);
            }
            return strArr;
        }

        @androidx.annotation.q0
        public Integer A() {
            return this.f17069q;
        }

        @androidx.annotation.q0
        public String a() {
            return this.f17056d;
        }

        @androidx.annotation.q0
        public String[] b() {
            return this.f17058f;
        }

        @androidx.annotation.q0
        public String c() {
            return this.f17057e;
        }

        @androidx.annotation.q0
        public String d() {
            return this.f17065m;
        }

        @androidx.annotation.q0
        public String e() {
            return this.f17064l;
        }

        @androidx.annotation.q0
        public String f() {
            return this.f17063k;
        }

        public boolean g() {
            return this.f17077y;
        }

        public boolean h() {
            return this.f17075w;
        }

        public boolean i() {
            return this.f17076x;
        }

        @androidx.annotation.q0
        public Long j() {
            return this.f17072t;
        }

        @androidx.annotation.q0
        public String k() {
            return this.f17059g;
        }

        @androidx.annotation.q0
        public Uri l() {
            String str = this.f17060h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @androidx.annotation.q0
        public int[] m() {
            return this.f17071s;
        }

        @androidx.annotation.q0
        public Uri n() {
            return this.f17066n;
        }

        public boolean o() {
            return this.f17074v;
        }

        @androidx.annotation.q0
        public Integer q() {
            return this.f17070r;
        }

        @androidx.annotation.q0
        public Integer r() {
            return this.f17068p;
        }

        @androidx.annotation.q0
        public String s() {
            return this.f17061i;
        }

        public boolean t() {
            return this.f17073u;
        }

        @androidx.annotation.q0
        public String u() {
            return this.f17062j;
        }

        @androidx.annotation.q0
        public String v() {
            return this.f17067o;
        }

        @androidx.annotation.q0
        public String w() {
            return this.f17053a;
        }

        @androidx.annotation.q0
        public String[] x() {
            return this.f17055c;
        }

        @androidx.annotation.q0
        public String y() {
            return this.f17054b;
        }

        @androidx.annotation.q0
        public long[] z() {
            return this.f17078z;
        }

        private d(l0 l0Var) {
            String s5 = ProtectedSandApp.s("\u16fe");
            this.f17053a = l0Var.p(s5);
            this.f17054b = l0Var.h(s5);
            this.f17055c = p(l0Var, s5);
            String s6 = ProtectedSandApp.s("\u16ff");
            this.f17056d = l0Var.p(s6);
            this.f17057e = l0Var.h(s6);
            this.f17058f = p(l0Var, s6);
            this.f17059g = l0Var.p(ProtectedSandApp.s("ᜀ"));
            this.f17061i = l0Var.o();
            this.f17062j = l0Var.p(ProtectedSandApp.s("ᜁ"));
            this.f17063k = l0Var.p(ProtectedSandApp.s("ᜂ"));
            this.f17064l = l0Var.p(ProtectedSandApp.s("ᜃ"));
            this.f17065m = l0Var.p(ProtectedSandApp.s("ᜄ"));
            this.f17066n = l0Var.f();
            this.f17060h = l0Var.p(ProtectedSandApp.s("ᜅ"));
            this.f17067o = l0Var.p(ProtectedSandApp.s("ᜆ"));
            this.f17068p = l0Var.b(ProtectedSandApp.s("ᜇ"));
            this.f17069q = l0Var.b(ProtectedSandApp.s("ᜈ"));
            this.f17070r = l0Var.b(ProtectedSandApp.s("ᜉ"));
            this.f17073u = l0Var.a(ProtectedSandApp.s("ᜊ"));
            this.f17074v = l0Var.a(ProtectedSandApp.s("ᜋ"));
            this.f17075w = l0Var.a(ProtectedSandApp.s("ᜌ"));
            this.f17076x = l0Var.a(ProtectedSandApp.s("ᜍ"));
            this.f17077y = l0Var.a(ProtectedSandApp.s("ᜎ"));
            this.f17072t = l0Var.j(ProtectedSandApp.s("ᜏ"));
            this.f17071s = l0Var.e();
            this.f17078z = l0Var.q();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f17048o = bundle;
    }

    private int b(String str) {
        if (ProtectedSandApp.s("⫩").equals(str)) {
            return 1;
        }
        return ProtectedSandApp.s("⫪").equals(str) ? 2 : 0;
    }

    @androidx.annotation.q0
    public d g() {
        if (this.f17050q == null && l0.v(this.f17048o)) {
            this.f17050q = new d(new l0(this.f17048o));
        }
        return this.f17050q;
    }

    @androidx.annotation.q0
    public String getCollapseKey() {
        return this.f17048o.getString(ProtectedSandApp.s("⫫"));
    }

    @androidx.annotation.o0
    public Map<String, String> getData() {
        if (this.f17049p == null) {
            this.f17049p = e.d.a(this.f17048o);
        }
        return this.f17049p;
    }

    @androidx.annotation.q0
    public String getFrom() {
        return this.f17048o.getString(ProtectedSandApp.s("⫬"));
    }

    @androidx.annotation.q0
    public String getMessageId() {
        String string = this.f17048o.getString(ProtectedSandApp.s("⫭"));
        return string == null ? this.f17048o.getString(ProtectedSandApp.s("⫮")) : string;
    }

    @androidx.annotation.q0
    public String getMessageType() {
        return this.f17048o.getString(ProtectedSandApp.s("⫯"));
    }

    public int getOriginalPriority() {
        String string = this.f17048o.getString(ProtectedSandApp.s("⫰"));
        if (string == null) {
            string = this.f17048o.getString(ProtectedSandApp.s("⫱"));
        }
        return b(string);
    }

    public int getPriority() {
        String string = this.f17048o.getString(ProtectedSandApp.s("⫲"));
        if (string == null) {
            if (ProtectedSandApp.s("⫴").equals(this.f17048o.getString(ProtectedSandApp.s("⫳")))) {
                return 2;
            }
            string = this.f17048o.getString(ProtectedSandApp.s("⫵"));
        }
        return b(string);
    }

    @androidx.annotation.q0
    @ShowFirstParty
    public byte[] getRawData() {
        return this.f17048o.getByteArray(ProtectedSandApp.s("⫶"));
    }

    @androidx.annotation.q0
    public String getSenderId() {
        return this.f17048o.getString(ProtectedSandApp.s("⫷"));
    }

    public long getSentTime() {
        Object obj = this.f17048o.get(ProtectedSandApp.s("⫸"));
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Objects.toString(obj);
            return 0L;
        }
    }

    @androidx.annotation.q0
    public String getTo() {
        return this.f17048o.getString(ProtectedSandApp.s("⫹"));
    }

    public int getTtl() {
        Object obj = this.f17048o.get(ProtectedSandApp.s("⫺"));
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Objects.toString(obj);
            return 0;
        }
    }

    void r(Intent intent) {
        intent.putExtras(this.f17048o);
    }

    @KeepForSdk
    public Intent t() {
        Intent intent = new Intent();
        intent.putExtras(this.f17048o);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i5) {
        t0.c(this, parcel, i5);
    }
}
