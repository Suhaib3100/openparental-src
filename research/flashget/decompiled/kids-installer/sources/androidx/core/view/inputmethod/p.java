package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final c f5580a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes3.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final Uri f5582a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final ClipDescription f5583b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private final Uri f5584c;

        b(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
            this.f5582a = uri;
            this.f5583b = clipDescription;
            this.f5584c = uri2;
        }

        @Override // androidx.core.view.inputmethod.p.c
        @o0
        public ClipDescription a() {
            return this.f5583b;
        }

        @Override // androidx.core.view.inputmethod.p.c
        @o0
        public Uri b() {
            return this.f5582a;
        }

        @Override // androidx.core.view.inputmethod.p.c
        public void c() {
        }

        @Override // androidx.core.view.inputmethod.p.c
        @q0
        public Object d() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.p.c
        public void e() {
        }

        @Override // androidx.core.view.inputmethod.p.c
        @q0
        public Uri l() {
            return this.f5584c;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    private interface c {
        @o0
        ClipDescription a();

        @o0
        Uri b();

        void c();

        @q0
        Object d();

        void e();

        @q0
        Uri l();
    }

    public p(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f5580a = new a(uri, clipDescription, uri2);
        } else {
            this.f5580a = new b(uri, clipDescription, uri2);
        }
    }

    @q0
    public static p g(@q0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new p(new a(obj));
        }
        return null;
    }

    @o0
    public Uri a() {
        return this.f5580a.b();
    }

    @o0
    public ClipDescription b() {
        return this.f5580a.a();
    }

    @q0
    public Uri c() {
        return this.f5580a.l();
    }

    public void d() {
        this.f5580a.e();
    }

    public void e() {
        this.f5580a.c();
    }

    @q0
    public Object f() {
        return this.f5580a.d();
    }

    /* compiled from: InputContentInfoCompat.java */
    @x0(25)
    /* loaded from: classes3.dex */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        final InputContentInfo f5581a;

        a(@o0 Object obj) {
            this.f5581a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.p.c
        @o0
        public ClipDescription a() {
            ClipDescription description;
            description = this.f5581a.getDescription();
            return description;
        }

        @Override // androidx.core.view.inputmethod.p.c
        @o0
        public Uri b() {
            Uri contentUri;
            contentUri = this.f5581a.getContentUri();
            return contentUri;
        }

        @Override // androidx.core.view.inputmethod.p.c
        public void c() {
            this.f5581a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.p.c
        @o0
        public Object d() {
            return this.f5581a;
        }

        @Override // androidx.core.view.inputmethod.p.c
        public void e() {
            this.f5581a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.p.c
        @q0
        public Uri l() {
            Uri linkUri;
            linkUri = this.f5581a.getLinkUri();
            return linkUri;
        }

        a(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
            this.f5581a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private p(@o0 c cVar) {
        this.f5580a = cVar;
    }
}
