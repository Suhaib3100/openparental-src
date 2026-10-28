package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f27262a;

    /* compiled from: InputContentInfoCompat.java */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final Uri f27264a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final ClipDescription f27265b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private final Uri f27266c;

        b(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
            this.f27264a = uri;
            this.f27265b = clipDescription;
            this.f27266c = uri2;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @o0
        public ClipDescription a() {
            return this.f27265b;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @q0
        public Object b() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @o0
        public Uri c() {
            return this.f27264a;
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void d() {
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void e() {
        }

        @Override // androidx.core.view.inputmethod.g.c
        @q0
        public Uri g() {
            return this.f27266c;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    private interface c {
        @o0
        ClipDescription a();

        @q0
        Object b();

        @o0
        Uri c();

        void d();

        void e();

        @q0
        Uri g();
    }

    public g(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f27262a = new a(uri, clipDescription, uri2);
        } else {
            this.f27262a = new b(uri, clipDescription, uri2);
        }
    }

    @q0
    public static g g(@q0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new g(new a(obj));
        }
        return null;
    }

    @o0
    public Uri a() {
        return this.f27262a.c();
    }

    @o0
    public ClipDescription b() {
        return this.f27262a.a();
    }

    @q0
    public Uri c() {
        return this.f27262a.g();
    }

    public void d() {
        this.f27262a.e();
    }

    public void e() {
        this.f27262a.d();
    }

    @q0
    public Object f() {
        return this.f27262a.b();
    }

    /* compiled from: InputContentInfoCompat.java */
    @x0(25)
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        final InputContentInfo f27263a;

        a(@o0 Object obj) {
            this.f27263a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @o0
        public ClipDescription a() {
            return this.f27263a.getDescription();
        }

        @Override // androidx.core.view.inputmethod.g.c
        @o0
        public Object b() {
            return this.f27263a;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @o0
        public Uri c() {
            return this.f27263a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void d() {
            this.f27263a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void e() {
            this.f27263a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.g.c
        @q0
        public Uri g() {
            return this.f27263a.getLinkUri();
        }

        a(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
            this.f27263a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private g(@o0 c cVar) {
        this.f27262a = cVar;
    }
}
