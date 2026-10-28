package com.google.firebase.crashlytics;

import androidx.annotation.o0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CustomKeysAndValues.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    final Map<String, String> f15514a;

    /* compiled from: CustomKeysAndValues.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, String> f15515a = new HashMap();

        @o0
        public h b() {
            return new h(this);
        }

        @o0
        public a c(@o0 String str, boolean z5) {
            this.f15515a.put(str, Boolean.toString(z5));
            return this;
        }

        @o0
        public a d(@o0 String str, double d6) {
            this.f15515a.put(str, Double.toString(d6));
            return this;
        }

        @o0
        public a e(@o0 String str, float f6) {
            this.f15515a.put(str, Float.toString(f6));
            return this;
        }

        @o0
        public a f(@o0 String str, int i5) {
            this.f15515a.put(str, Integer.toString(i5));
            return this;
        }

        @o0
        public a g(@o0 String str, long j5) {
            this.f15515a.put(str, Long.toString(j5));
            return this;
        }

        @o0
        public a h(@o0 String str, @o0 String str2) {
            this.f15515a.put(str, str2);
            return this;
        }
    }

    h(@o0 a aVar) {
        this.f15514a = aVar.f15515a;
    }
}
