package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.util.List;
import java.util.Objects;

/* compiled from: ContentCaptureSessionCompat.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19794c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19795d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* renamed from: a, reason: collision with root package name */
    private final Object f19796a;

    /* renamed from: b, reason: collision with root package name */
    private final View f19797b;

    /* compiled from: ContentCaptureSessionCompat.java */
    @x0(23)
    private static class a {
        private a() {
        }

        @u
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    @x0(29)
    private static class b {
        private b() {
        }

        @u
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j4) {
            return contentCaptureSession.newAutofillId(autofillId, j4);
        }

        @u
        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @u
        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j4) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j4);
        }

        @u
        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @u
        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @u
        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    @x0(34)
    private static class c {
        private c() {
        }

        @u
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @x0(29)
    private d(@o0 ContentCaptureSession contentCaptureSession, @o0 View view) {
        this.f19796a = contentCaptureSession;
        this.f19797b = view;
    }

    @o0
    @x0(29)
    public static d g(@o0 ContentCaptureSession contentCaptureSession, @o0 View view) {
        return new d(contentCaptureSession, view);
    }

    @q0
    public AutofillId a(long j4) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a5 = androidx.compose.ui.platform.coreshims.c.a(this.f19796a);
        androidx.compose.ui.platform.coreshims.b a6 = e.a(this.f19797b);
        Objects.requireNonNull(a6);
        return b.a(a5, a6.a(), j4);
    }

    @q0
    public f b(@o0 AutofillId autofillId, long j4) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.g(b.c(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), autofillId, j4));
        }
        return null;
    }

    public void c(@o0 AutofillId autofillId, @q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), autofillId, charSequence);
        }
    }

    public void d(@o0 List<ViewStructure> list) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            c.a(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), list);
            return;
        }
        if (i4 >= 29) {
            ViewStructure b5 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), this.f19797b);
            a.a(b5).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), b5);
            for (int i5 = 0; i5 < list.size(); i5++) {
                b.d(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), list.get(i5));
            }
            ViewStructure b6 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), this.f19797b);
            a.a(b6).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), b6);
        }
    }

    public void e(@o0 long[] jArr) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            ContentCaptureSession a5 = androidx.compose.ui.platform.coreshims.c.a(this.f19796a);
            androidx.compose.ui.platform.coreshims.b a6 = e.a(this.f19797b);
            Objects.requireNonNull(a6);
            b.f(a5, a6.a(), jArr);
            return;
        }
        if (i4 >= 29) {
            ViewStructure b5 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), this.f19797b);
            a.a(b5).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), b5);
            ContentCaptureSession a7 = androidx.compose.ui.platform.coreshims.c.a(this.f19796a);
            androidx.compose.ui.platform.coreshims.b a8 = e.a(this.f19797b);
            Objects.requireNonNull(a8);
            b.f(a7, a8.a(), jArr);
            ViewStructure b6 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), this.f19797b);
            a.a(b6).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f19796a), b6);
        }
    }

    @o0
    @x0(29)
    public ContentCaptureSession f() {
        return androidx.compose.ui.platform.coreshims.c.a(this.f19796a);
    }
}
