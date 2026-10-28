package com.google.firebase.encoders.proto;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.encoders.proto.d;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f16609a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f16610b = d.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0216a implements d {
        private final int A0;
        private final d.a B0;

        C0216a(int i5, d.a aVar) {
            this.A0 = i5;
            this.B0 = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.A0 == dVar.tag() && this.B0.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.A0) + (this.B0.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.d
        public d.a intEncoding() {
            return this.B0;
        }

        @Override // com.google.firebase.encoders.proto.d
        public int tag() {
            return this.A0;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return ProtectedSandApp.s("⩶") + this.A0 + ProtectedSandApp.s("⩷") + this.B0 + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0216a(this.f16609a, this.f16610b);
    }

    public a c(d.a aVar) {
        this.f16610b = aVar;
        return this;
    }

    public a d(int i5) {
        this.f16609a = i5;
        return this;
    }
}
