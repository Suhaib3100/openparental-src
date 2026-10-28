package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name */
    private static final String f60343h = ProtectedSandApp.s("̘\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f60344i = ProtectedSandApp.s("̗\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f60345j = ProtectedSandApp.s("̙\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f60346k = ProtectedSandApp.s("̚\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final String f60347l = ProtectedSandApp.s("̛\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final String f60348m = ProtectedSandApp.s("̜\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f60349n = ProtectedSandApp.s("̝\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final String f60350a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60351b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60352c;

    /* renamed from: d, reason: collision with root package name */
    private final String f60353d;

    /* renamed from: e, reason: collision with root package name */
    private final String f60354e;

    /* renamed from: f, reason: collision with root package name */
    private final String f60355f;

    /* renamed from: g, reason: collision with root package name */
    private final String f60356g;

    /* compiled from: FirebaseOptions.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f60357a;

        /* renamed from: b, reason: collision with root package name */
        private String f60358b;

        /* renamed from: c, reason: collision with root package name */
        private String f60359c;

        /* renamed from: d, reason: collision with root package name */
        private String f60360d;

        /* renamed from: e, reason: collision with root package name */
        private String f60361e;

        /* renamed from: f, reason: collision with root package name */
        private String f60362f;

        /* renamed from: g, reason: collision with root package name */
        private String f60363g;

        public b() {
        }

        @o0
        public p a() {
            return new p(this.f60358b, this.f60357a, this.f60359c, this.f60360d, this.f60361e, this.f60362f, this.f60363g);
        }

        @o0
        public b b(@o0 String str) {
            this.f60357a = Preconditions.checkNotEmpty(str, ProtectedSandApp.s("̔\u0001"));
            return this;
        }

        @o0
        public b c(@o0 String str) {
            this.f60358b = Preconditions.checkNotEmpty(str, ProtectedSandApp.s("̕\u0001"));
            return this;
        }

        @o0
        public b d(@q0 String str) {
            this.f60359c = str;
            return this;
        }

        @o0
        @KeepForSdk
        public b e(@q0 String str) {
            this.f60360d = str;
            return this;
        }

        @o0
        public b f(@q0 String str) {
            this.f60361e = str;
            return this;
        }

        @o0
        public b g(@q0 String str) {
            this.f60363g = str;
            return this;
        }

        @o0
        public b h(@q0 String str) {
            this.f60362f = str;
            return this;
        }

        public b(@o0 p pVar) {
            this.f60358b = pVar.f60351b;
            this.f60357a = pVar.f60350a;
            this.f60359c = pVar.f60352c;
            this.f60360d = pVar.f60353d;
            this.f60361e = pVar.f60354e;
            this.f60362f = pVar.f60355f;
            this.f60363g = pVar.f60356g;
        }
    }

    @q0
    public static p h(@o0 Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(ProtectedSandApp.s("̗\u0001"));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new p(string, stringResourceValueReader.getString(ProtectedSandApp.s("̘\u0001")), stringResourceValueReader.getString(ProtectedSandApp.s("̙\u0001")), stringResourceValueReader.getString(ProtectedSandApp.s("̚\u0001")), stringResourceValueReader.getString(ProtectedSandApp.s("̛\u0001")), stringResourceValueReader.getString(ProtectedSandApp.s("̜\u0001")), stringResourceValueReader.getString(ProtectedSandApp.s("̝\u0001")));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equal(this.f60351b, pVar.f60351b) && Objects.equal(this.f60350a, pVar.f60350a) && Objects.equal(this.f60352c, pVar.f60352c) && Objects.equal(this.f60353d, pVar.f60353d) && Objects.equal(this.f60354e, pVar.f60354e) && Objects.equal(this.f60355f, pVar.f60355f) && Objects.equal(this.f60356g, pVar.f60356g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f60351b, this.f60350a, this.f60352c, this.f60353d, this.f60354e, this.f60355f, this.f60356g);
    }

    @o0
    public String i() {
        return this.f60350a;
    }

    @o0
    public String j() {
        return this.f60351b;
    }

    @q0
    public String k() {
        return this.f60352c;
    }

    @q0
    @KeepForSdk
    public String l() {
        return this.f60353d;
    }

    @q0
    public String m() {
        return this.f60354e;
    }

    @q0
    public String n() {
        return this.f60356g;
    }

    @q0
    public String o() {
        return this.f60355f;
    }

    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("̞\u0001"), this.f60351b).add(ProtectedSandApp.s("̟\u0001"), this.f60350a).add(ProtectedSandApp.s("̠\u0001"), this.f60352c).add(ProtectedSandApp.s("̡\u0001"), this.f60354e).add(ProtectedSandApp.s("̢\u0001"), this.f60355f).add(ProtectedSandApp.s("̣\u0001"), this.f60356g).toString();
    }

    private p(@o0 String str, @o0 String str2, @q0 String str3, @q0 String str4, @q0 String str5, @q0 String str6, @q0 String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), ProtectedSandApp.s("̖\u0001"));
        this.f60351b = str;
        this.f60350a = str2;
        this.f60352c = str3;
        this.f60353d = str4;
        this.f60354e = str5;
        this.f60355f = str6;
        this.f60356g = str7;
    }
}
