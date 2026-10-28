package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Objects;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new z0();

    /* renamed from: e, reason: collision with root package name */
    public static final int f59920e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f59921f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59922g = 2;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    Bundle f59923b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f59924c;

    /* renamed from: d, reason: collision with root package name */
    private d f59925d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f59926a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, String> f59927b;

        public b(@androidx.annotation.o0 String str) {
            Bundle bundle = new Bundle();
            this.f59926a = bundle;
            this.f59927b = new androidx.collection.a();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("Ŧ\u0001"), str));
            }
            bundle.putString(ProtectedSandApp.s("ť\u0001"), str);
        }

        @androidx.annotation.o0
        public b a(@androidx.annotation.o0 String str, @androidx.annotation.q0 String str2) {
            this.f59927b.put(str, str2);
            return this;
        }

        @androidx.annotation.o0
        public RemoteMessage b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f59927b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f59926a);
            this.f59926a.remove(ProtectedSandApp.s("ŧ\u0001"));
            return new RemoteMessage(bundle);
        }

        @androidx.annotation.o0
        public b c() {
            this.f59927b.clear();
            return this;
        }

        @androidx.annotation.q0
        public String d() {
            return this.f59926a.getString(ProtectedSandApp.s("Ũ\u0001"));
        }

        @androidx.annotation.o0
        public Map<String, String> e() {
            return this.f59927b;
        }

        @androidx.annotation.o0
        public String f() {
            return this.f59926a.getString(ProtectedSandApp.s("ũ\u0001"), "");
        }

        @androidx.annotation.q0
        public String g() {
            return this.f59926a.getString(ProtectedSandApp.s("Ū\u0001"));
        }

        @androidx.annotation.g0(from = 0, to = 86400)
        public int h() {
            return Integer.parseInt(this.f59926a.getString(ProtectedSandApp.s("ū\u0001"), ProtectedSandApp.s("Ŭ\u0001")));
        }

        @androidx.annotation.o0
        public b i(@androidx.annotation.q0 String str) {
            this.f59926a.putString(ProtectedSandApp.s("Ũ\u0001"), str);
            return this;
        }

        @androidx.annotation.o0
        public b j(@androidx.annotation.o0 Map<String, String> map) {
            this.f59927b.clear();
            this.f59927b.putAll(map);
            return this;
        }

        @androidx.annotation.o0
        public b k(@androidx.annotation.o0 String str) {
            this.f59926a.putString(ProtectedSandApp.s("ũ\u0001"), str);
            return this;
        }

        @androidx.annotation.o0
        public b l(@androidx.annotation.q0 String str) {
            this.f59926a.putString(ProtectedSandApp.s("Ū\u0001"), str);
            return this;
        }

        @ShowFirstParty
        @androidx.annotation.o0
        public b m(byte[] bArr) {
            this.f59926a.putByteArray(ProtectedSandApp.s("ŭ\u0001"), bArr);
            return this;
        }

        @androidx.annotation.o0
        public b n(@androidx.annotation.g0(from = 0, to = 86400) int i4) {
            this.f59926a.putString(ProtectedSandApp.s("ū\u0001"), String.valueOf(i4));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f59928a;

        /* renamed from: b, reason: collision with root package name */
        private final String f59929b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f59930c;

        /* renamed from: d, reason: collision with root package name */
        private final String f59931d;

        /* renamed from: e, reason: collision with root package name */
        private final String f59932e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f59933f;

        /* renamed from: g, reason: collision with root package name */
        private final String f59934g;

        /* renamed from: h, reason: collision with root package name */
        private final String f59935h;

        /* renamed from: i, reason: collision with root package name */
        private final String f59936i;

        /* renamed from: j, reason: collision with root package name */
        private final String f59937j;

        /* renamed from: k, reason: collision with root package name */
        private final String f59938k;

        /* renamed from: l, reason: collision with root package name */
        private final String f59939l;

        /* renamed from: m, reason: collision with root package name */
        private final String f59940m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f59941n;

        /* renamed from: o, reason: collision with root package name */
        private final String f59942o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f59943p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f59944q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f59945r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f59946s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f59947t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f59948u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f59949v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f59950w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f59951x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f59952y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f59953z;

        private static String[] p(q0 q0Var, String str) {
            Object[] g4 = q0Var.g(str);
            if (g4 == null) {
                return null;
            }
            String[] strArr = new String[g4.length];
            for (int i4 = 0; i4 < g4.length; i4++) {
                strArr[i4] = String.valueOf(g4[i4]);
            }
            return strArr;
        }

        @androidx.annotation.q0
        public Integer A() {
            return this.f59944q;
        }

        @androidx.annotation.q0
        public String a() {
            return this.f59931d;
        }

        @androidx.annotation.q0
        public String[] b() {
            return this.f59933f;
        }

        @androidx.annotation.q0
        public String c() {
            return this.f59932e;
        }

        @androidx.annotation.q0
        public String d() {
            return this.f59940m;
        }

        @androidx.annotation.q0
        public String e() {
            return this.f59939l;
        }

        @androidx.annotation.q0
        public String f() {
            return this.f59938k;
        }

        public boolean g() {
            return this.f59952y;
        }

        public boolean h() {
            return this.f59950w;
        }

        public boolean i() {
            return this.f59951x;
        }

        @androidx.annotation.q0
        public Long j() {
            return this.f59947t;
        }

        @androidx.annotation.q0
        public String k() {
            return this.f59934g;
        }

        @androidx.annotation.q0
        public Uri l() {
            String str = this.f59935h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @androidx.annotation.q0
        public int[] m() {
            return this.f59946s;
        }

        @androidx.annotation.q0
        public Uri n() {
            return this.f59941n;
        }

        public boolean o() {
            return this.f59949v;
        }

        @androidx.annotation.q0
        public Integer q() {
            return this.f59945r;
        }

        @androidx.annotation.q0
        public Integer r() {
            return this.f59943p;
        }

        @androidx.annotation.q0
        public String s() {
            return this.f59936i;
        }

        public boolean t() {
            return this.f59948u;
        }

        @androidx.annotation.q0
        public String u() {
            return this.f59937j;
        }

        @androidx.annotation.q0
        public String v() {
            return this.f59942o;
        }

        @androidx.annotation.q0
        public String w() {
            return this.f59928a;
        }

        @androidx.annotation.q0
        public String[] x() {
            return this.f59930c;
        }

        @androidx.annotation.q0
        public String y() {
            return this.f59929b;
        }

        @androidx.annotation.q0
        public long[] z() {
            return this.f59953z;
        }

        private d(q0 q0Var) {
            String s4 = ProtectedSandApp.s("Ů\u0001");
            this.f59928a = q0Var.p(s4);
            this.f59929b = q0Var.h(s4);
            this.f59930c = p(q0Var, s4);
            String s5 = ProtectedSandApp.s("ů\u0001");
            this.f59931d = q0Var.p(s5);
            this.f59932e = q0Var.h(s5);
            this.f59933f = p(q0Var, s5);
            this.f59934g = q0Var.p(ProtectedSandApp.s("Ű\u0001"));
            this.f59936i = q0Var.o();
            this.f59937j = q0Var.p(ProtectedSandApp.s("ű\u0001"));
            this.f59938k = q0Var.p(ProtectedSandApp.s("Ų\u0001"));
            this.f59939l = q0Var.p(ProtectedSandApp.s("ų\u0001"));
            this.f59940m = q0Var.p(ProtectedSandApp.s("Ŵ\u0001"));
            this.f59941n = q0Var.f();
            this.f59935h = q0Var.p(ProtectedSandApp.s("ŵ\u0001"));
            this.f59942o = q0Var.p(ProtectedSandApp.s("Ŷ\u0001"));
            this.f59943p = q0Var.b(ProtectedSandApp.s("ŷ\u0001"));
            this.f59944q = q0Var.b(ProtectedSandApp.s("Ÿ\u0001"));
            this.f59945r = q0Var.b(ProtectedSandApp.s("Ź\u0001"));
            this.f59948u = q0Var.a(ProtectedSandApp.s("ź\u0001"));
            this.f59949v = q0Var.a(ProtectedSandApp.s("Ż\u0001"));
            this.f59950w = q0Var.a(ProtectedSandApp.s("ż\u0001"));
            this.f59951x = q0Var.a(ProtectedSandApp.s("Ž\u0001"));
            this.f59952y = q0Var.a(ProtectedSandApp.s("ž\u0001"));
            this.f59947t = q0Var.j(ProtectedSandApp.s("ſ\u0001"));
            this.f59946s = q0Var.e();
            this.f59953z = q0Var.q();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f59923b = bundle;
    }

    private int b(String str) {
        if (ProtectedSandApp.s("ƀ\u0001").equals(str)) {
            return 1;
        }
        return ProtectedSandApp.s("Ɓ\u0001").equals(str) ? 2 : 0;
    }

    @androidx.annotation.q0
    public d c() {
        if (this.f59925d == null && q0.v(this.f59923b)) {
            this.f59925d = new d(new q0(this.f59923b));
        }
        return this.f59925d;
    }

    void f(Intent intent) {
        intent.putExtras(this.f59923b);
    }

    @androidx.annotation.q0
    public String getCollapseKey() {
        return this.f59923b.getString(ProtectedSandApp.s("Ƃ\u0001"));
    }

    @androidx.annotation.o0
    public Map<String, String> getData() {
        if (this.f59924c == null) {
            this.f59924c = f.d.a(this.f59923b);
        }
        return this.f59924c;
    }

    @androidx.annotation.q0
    public String getFrom() {
        return this.f59923b.getString(ProtectedSandApp.s("ƃ\u0001"));
    }

    @androidx.annotation.q0
    public String getMessageId() {
        String string = this.f59923b.getString(ProtectedSandApp.s("Ƅ\u0001"));
        return string == null ? this.f59923b.getString(ProtectedSandApp.s("ƅ\u0001")) : string;
    }

    @androidx.annotation.q0
    public String getMessageType() {
        return this.f59923b.getString(ProtectedSandApp.s("Ɔ\u0001"));
    }

    public int getOriginalPriority() {
        String string = this.f59923b.getString(ProtectedSandApp.s("Ƈ\u0001"));
        if (string == null) {
            string = this.f59923b.getString(ProtectedSandApp.s("ƈ\u0001"));
        }
        return b(string);
    }

    public int getPriority() {
        String string = this.f59923b.getString(ProtectedSandApp.s("Ɖ\u0001"));
        if (string == null) {
            if (ProtectedSandApp.s("Ƌ\u0001").equals(this.f59923b.getString(ProtectedSandApp.s("Ɗ\u0001")))) {
                return 2;
            }
            string = this.f59923b.getString(ProtectedSandApp.s("ƈ\u0001"));
        }
        return b(string);
    }

    @androidx.annotation.q0
    @ShowFirstParty
    public byte[] getRawData() {
        return this.f59923b.getByteArray(ProtectedSandApp.s("ƌ\u0001"));
    }

    @androidx.annotation.q0
    public String getSenderId() {
        return this.f59923b.getString(ProtectedSandApp.s("ƍ\u0001"));
    }

    public long getSentTime() {
        Object obj = this.f59923b.get(ProtectedSandApp.s("Ǝ\u0001"));
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
    @Deprecated
    public String getTo() {
        return this.f59923b.getString(ProtectedSandApp.s("Ə\u0001"));
    }

    public int getTtl() {
        Object obj = this.f59923b.get(ProtectedSandApp.s("Ɛ\u0001"));
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

    @KeepForSdk
    public Intent h() {
        Intent intent = new Intent();
        intent.putExtras(this.f59923b);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.o0 Parcel parcel, int i4) {
        z0.c(this, parcel, i4);
    }
}
