package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f27105b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f27106c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f27107d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f27108e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f27109f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f27110g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f27111h = 1;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final g f27112a;

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.x0(31)
    private static final class a {
        private a() {
        }

        @androidx.annotation.o0
        public static Pair<ContentInfo, ContentInfo> a(@androidx.annotation.o0 ContentInfo contentInfo, @androidx.annotation.o0 final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> h4 = e.h(clip, new androidx.core.util.c0() { // from class: androidx.core.view.d
                    @Override // androidx.core.util.c0
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return h4.first == null ? Pair.create(null, contentInfo) : h4.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) h4.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) h4.second).build());
            }
            boolean test = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = test ? contentInfo : null;
            if (test) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    private interface d {
        @androidx.annotation.o0
        e a();

        void b(int i4);

        void c(@androidx.annotation.q0 Uri uri);

        void d(@androidx.annotation.o0 ClipData clipData);

        void setExtras(@androidx.annotation.q0 Bundle bundle);

        void setFlags(int i4);
    }

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.x0(31)
    private static final class f implements g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final ContentInfo f27120a;

        f(@androidx.annotation.o0 ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f27120a = androidx.core.view.c.a(contentInfo);
        }

        @Override // androidx.core.view.e.g
        public int f() {
            int source;
            source = this.f27120a.getSource();
            return source;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.q0
        public Uri g() {
            Uri linkUri;
            linkUri = this.f27120a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.q0
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f27120a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.e.g
        public int getFlags() {
            int flags;
            flags = this.f27120a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.o0
        public ContentInfo h() {
            return this.f27120a;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.o0
        public ClipData j() {
            ClipData clip;
            clip = this.f27120a.getClip();
            return clip;
        }

        @androidx.annotation.o0
        public String toString() {
            return "ContentInfoCompat{" + this.f27120a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    private interface g {
        int f();

        @androidx.annotation.q0
        Uri g();

        @androidx.annotation.q0
        Bundle getExtras();

        int getFlags();

        @androidx.annotation.q0
        ContentInfo h();

        @androidx.annotation.o0
        ClipData j();
    }

    /* compiled from: ContentInfoCompat.java */
    private static final class h implements g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final ClipData f27121a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27122b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27123c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private final Uri f27124d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private final Bundle f27125e;

        h(C0440e c0440e) {
            ClipData clipData = c0440e.f27115a;
            clipData.getClass();
            this.f27121a = clipData;
            this.f27122b = androidx.core.util.w.g(c0440e.f27116b, 0, 5, "source");
            this.f27123c = androidx.core.util.w.k(c0440e.f27117c, 1);
            this.f27124d = c0440e.f27118d;
            this.f27125e = c0440e.f27119e;
        }

        @Override // androidx.core.view.e.g
        public int f() {
            return this.f27122b;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.q0
        public Uri g() {
            return this.f27124d;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.q0
        public Bundle getExtras() {
            return this.f27125e;
        }

        @Override // androidx.core.view.e.g
        public int getFlags() {
            return this.f27123c;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.q0
        public ContentInfo h() {
            return null;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.o0
        public ClipData j() {
            return this.f27121a;
        }

        @androidx.annotation.o0
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f27121a.getDescription());
            sb.append(", source=");
            sb.append(e.k(this.f27122b));
            sb.append(", flags=");
            sb.append(e.b(this.f27123c));
            if (this.f27124d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f27124d.toString().length() + ")";
            }
            sb.append(str);
            return android.support.v4.media.c.a(sb, this.f27125e != null ? ", hasExtras" : "", "}");
        }
    }

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    e(@androidx.annotation.o0 g gVar) {
        this.f27112a = gVar;
    }

    @androidx.annotation.o0
    static ClipData a(@androidx.annotation.o0 ClipDescription clipDescription, @androidx.annotation.o0 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i4 = 1; i4 < list.size(); i4++) {
            clipData.addItem(list.get(i4));
        }
        return clipData;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    static String b(int i4) {
        return (i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4);
    }

    @androidx.annotation.o0
    static Pair<ClipData, ClipData> h(@androidx.annotation.o0 ClipData clipData, @androidx.annotation.o0 androidx.core.util.c0<ClipData.Item> c0Var) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
            ClipData.Item itemAt = clipData.getItemAt(i4);
            if (c0Var.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(31)
    public static Pair<ContentInfo, ContentInfo> i(@androidx.annotation.o0 ContentInfo contentInfo, @androidx.annotation.o0 Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    static String k(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? String.valueOf(i4) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(31)
    public static e m(@androidx.annotation.o0 ContentInfo contentInfo) {
        return new e(new f(contentInfo));
    }

    @androidx.annotation.o0
    public ClipData c() {
        return this.f27112a.j();
    }

    @androidx.annotation.q0
    public Bundle d() {
        return this.f27112a.getExtras();
    }

    public int e() {
        return this.f27112a.getFlags();
    }

    @androidx.annotation.q0
    public Uri f() {
        return this.f27112a.g();
    }

    public int g() {
        return this.f27112a.f();
    }

    @androidx.annotation.o0
    public Pair<e, e> j(@androidx.annotation.o0 androidx.core.util.c0<ClipData.Item> c0Var) {
        ClipData j4 = this.f27112a.j();
        if (j4.getItemCount() == 1) {
            boolean test = c0Var.test(j4.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> h4 = h(j4, c0Var);
        return h4.first == null ? Pair.create(null, this) : h4.second == null ? Pair.create(this, null) : Pair.create(new b(this).b((ClipData) h4.first).a(), new b(this).b((ClipData) h4.second).a());
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(31)
    public ContentInfo l() {
        ContentInfo h4 = this.f27112a.h();
        Objects.requireNonNull(h4);
        return androidx.core.view.c.a(h4);
    }

    @androidx.annotation.o0
    public String toString() {
        return this.f27112a.toString();
    }

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.x0(31)
    private static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final ContentInfo.Builder f27114a;

        c(@androidx.annotation.o0 ClipData clipData, int i4) {
            this.f27114a = n.a(clipData, i4);
        }

        @Override // androidx.core.view.e.d
        @androidx.annotation.o0
        public e a() {
            ContentInfo build;
            build = this.f27114a.build();
            return new e(new f(build));
        }

        @Override // androidx.core.view.e.d
        public void b(int i4) {
            this.f27114a.setSource(i4);
        }

        @Override // androidx.core.view.e.d
        public void c(@androidx.annotation.q0 Uri uri) {
            this.f27114a.setLinkUri(uri);
        }

        @Override // androidx.core.view.e.d
        public void d(@androidx.annotation.o0 ClipData clipData) {
            this.f27114a.setClip(clipData);
        }

        @Override // androidx.core.view.e.d
        public void setExtras(@androidx.annotation.q0 Bundle bundle) {
            this.f27114a.setExtras(bundle);
        }

        @Override // androidx.core.view.e.d
        public void setFlags(int i4) {
            this.f27114a.setFlags(i4);
        }

        c(@androidx.annotation.o0 e eVar) {
            m.a();
            this.f27114a = l.a(eVar.l());
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.e$e, reason: collision with other inner class name */
    private static final class C0440e implements d {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        ClipData f27115a;

        /* renamed from: b, reason: collision with root package name */
        int f27116b;

        /* renamed from: c, reason: collision with root package name */
        int f27117c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        Uri f27118d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        Bundle f27119e;

        C0440e(@androidx.annotation.o0 ClipData clipData, int i4) {
            this.f27115a = clipData;
            this.f27116b = i4;
        }

        @Override // androidx.core.view.e.d
        @androidx.annotation.o0
        public e a() {
            return new e(new h(this));
        }

        @Override // androidx.core.view.e.d
        public void b(int i4) {
            this.f27116b = i4;
        }

        @Override // androidx.core.view.e.d
        public void c(@androidx.annotation.q0 Uri uri) {
            this.f27118d = uri;
        }

        @Override // androidx.core.view.e.d
        public void d(@androidx.annotation.o0 ClipData clipData) {
            this.f27115a = clipData;
        }

        @Override // androidx.core.view.e.d
        public void setExtras(@androidx.annotation.q0 Bundle bundle) {
            this.f27119e = bundle;
        }

        @Override // androidx.core.view.e.d
        public void setFlags(int i4) {
            this.f27117c = i4;
        }

        C0440e(@androidx.annotation.o0 e eVar) {
            this.f27115a = eVar.c();
            this.f27116b = eVar.g();
            this.f27117c = eVar.e();
            this.f27118d = eVar.f();
            this.f27119e = eVar.d();
        }
    }

    /* compiled from: ContentInfoCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final d f27113a;

        public b(@androidx.annotation.o0 e eVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f27113a = new c(eVar);
            } else {
                this.f27113a = new C0440e(eVar);
            }
        }

        @androidx.annotation.o0
        public e a() {
            return this.f27113a.a();
        }

        @androidx.annotation.o0
        public b b(@androidx.annotation.o0 ClipData clipData) {
            this.f27113a.d(clipData);
            return this;
        }

        @androidx.annotation.o0
        public b c(@androidx.annotation.q0 Bundle bundle) {
            this.f27113a.setExtras(bundle);
            return this;
        }

        @androidx.annotation.o0
        public b d(int i4) {
            this.f27113a.setFlags(i4);
            return this;
        }

        @androidx.annotation.o0
        public b e(@androidx.annotation.q0 Uri uri) {
            this.f27113a.c(uri);
            return this;
        }

        @androidx.annotation.o0
        public b f(int i4) {
            this.f27113a.b(i4);
            return this;
        }

        public b(@androidx.annotation.o0 ClipData clipData, int i4) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f27113a = new c(clipData, i4);
            } else {
                this.f27113a = new C0440e(clipData, i4);
            }
        }
    }
}
