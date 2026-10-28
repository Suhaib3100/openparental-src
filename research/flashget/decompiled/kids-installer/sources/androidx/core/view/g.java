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
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5525b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5526c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5527d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5528e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5529f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5530g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5531h = 1;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final InterfaceC0057g f5532a;

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.x0(31)
    private static final class a {
        private a() {
        }

        @androidx.annotation.u
        @androidx.annotation.o0
        public static Pair<ContentInfo, ContentInfo> a(@androidx.annotation.o0 ContentInfo contentInfo, @androidx.annotation.o0 final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> h5 = g.h(clip, new androidx.core.util.r() { // from class: androidx.core.view.f
                    @Override // androidx.core.util.r
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return h5.first == null ? Pair.create(null, contentInfo) : h5.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) h5.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) h5.second).build());
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
        void a(int i5);

        void b(@androidx.annotation.q0 Uri uri);

        @androidx.annotation.o0
        g build();

        void c(int i5);

        void d(@androidx.annotation.o0 ClipData clipData);

        void setExtras(@androidx.annotation.q0 Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.x0(31)
    /* loaded from: classes3.dex */
    private static final class f implements InterfaceC0057g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final ContentInfo f5540a;

        f(@androidx.annotation.o0 ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f5540a = contentInfo;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.q0
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f5540a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        public int k() {
            int source;
            source = this.f5540a.getSource();
            return source;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.q0
        public Uri l() {
            Uri linkUri;
            linkUri = this.f5540a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.o0
        public ClipData m() {
            ClipData clip;
            clip = this.f5540a.getClip();
            return clip;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        public int n() {
            int flags;
            flags = this.f5540a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.o0
        public ContentInfo o() {
            return this.f5540a;
        }

        @androidx.annotation.o0
        public String toString() {
            return "ContentInfoCompat{" + this.f5540a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.g$g, reason: collision with other inner class name */
    private interface InterfaceC0057g {
        @androidx.annotation.q0
        Bundle getExtras();

        int k();

        @androidx.annotation.q0
        Uri l();

        @androidx.annotation.o0
        ClipData m();

        int n();

        @androidx.annotation.q0
        ContentInfo o();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes3.dex */
    private static final class h implements InterfaceC0057g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final ClipData f5541a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5542b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5543c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private final Uri f5544d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private final Bundle f5545e;

        h(e eVar) {
            ClipData clipData = eVar.f5535a;
            clipData.getClass();
            this.f5541a = clipData;
            this.f5542b = androidx.core.util.q.g(eVar.f5536b, 0, 5, "source");
            this.f5543c = androidx.core.util.q.k(eVar.f5537c, 1);
            this.f5544d = eVar.f5538d;
            this.f5545e = eVar.f5539e;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.q0
        public Bundle getExtras() {
            return this.f5545e;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        public int k() {
            return this.f5542b;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.q0
        public Uri l() {
            return this.f5544d;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.o0
        public ClipData m() {
            return this.f5541a;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        public int n() {
            return this.f5543c;
        }

        @Override // androidx.core.view.g.InterfaceC0057g
        @androidx.annotation.q0
        public ContentInfo o() {
            return null;
        }

        @androidx.annotation.o0
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f5541a.getDescription());
            sb.append(", source=");
            sb.append(g.k(this.f5542b));
            sb.append(", flags=");
            sb.append(g.b(this.f5543c));
            if (this.f5544d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f5544d.toString().length() + ")";
            }
            sb.append(str);
            return androidx.concurrent.futures.a.a(sb, this.f5545e != null ? ", hasExtras" : "", "}");
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

    g(@androidx.annotation.o0 InterfaceC0057g interfaceC0057g) {
        this.f5532a = interfaceC0057g;
    }

    @androidx.annotation.o0
    static ClipData a(@androidx.annotation.o0 ClipDescription clipDescription, @androidx.annotation.o0 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i5 = 1; i5 < list.size(); i5++) {
            clipData.addItem(list.get(i5));
        }
        return clipData;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    static String b(int i5) {
        return (i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5);
    }

    @androidx.annotation.o0
    static Pair<ClipData, ClipData> h(@androidx.annotation.o0 ClipData clipData, @androidx.annotation.o0 androidx.core.util.r<ClipData.Item> rVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i5 = 0; i5 < clipData.getItemCount(); i5++) {
            ClipData.Item itemAt = clipData.getItemAt(i5);
            if (rVar.test(itemAt)) {
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
    static String k(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? String.valueOf(i5) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(31)
    public static g m(@androidx.annotation.o0 ContentInfo contentInfo) {
        return new g(new f(contentInfo));
    }

    @androidx.annotation.o0
    public ClipData c() {
        return this.f5532a.m();
    }

    @androidx.annotation.q0
    public Bundle d() {
        return this.f5532a.getExtras();
    }

    public int e() {
        return this.f5532a.n();
    }

    @androidx.annotation.q0
    public Uri f() {
        return this.f5532a.l();
    }

    public int g() {
        return this.f5532a.k();
    }

    @androidx.annotation.o0
    public Pair<g, g> j(@androidx.annotation.o0 androidx.core.util.r<ClipData.Item> rVar) {
        ClipData m5 = this.f5532a.m();
        if (m5.getItemCount() == 1) {
            boolean test = rVar.test(m5.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> h5 = h(m5, rVar);
        return h5.first == null ? Pair.create(null, this) : h5.second == null ? Pair.create(this, null) : Pair.create(new b(this).b((ClipData) h5.first).a(), new b(this).b((ClipData) h5.second).a());
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(31)
    public ContentInfo l() {
        ContentInfo o5 = this.f5532a.o();
        Objects.requireNonNull(o5);
        return o5;
    }

    @androidx.annotation.o0
    public String toString() {
        return this.f5532a.toString();
    }

    /* compiled from: ContentInfoCompat.java */
    @androidx.annotation.x0(31)
    /* loaded from: classes3.dex */
    private static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final ContentInfo.Builder f5534a;

        c(@androidx.annotation.o0 ClipData clipData, int i5) {
            this.f5534a = new ContentInfo.Builder(clipData, i5);
        }

        @Override // androidx.core.view.g.d
        public void a(int i5) {
            this.f5534a.setSource(i5);
        }

        @Override // androidx.core.view.g.d
        public void b(@androidx.annotation.q0 Uri uri) {
            this.f5534a.setLinkUri(uri);
        }

        @Override // androidx.core.view.g.d
        @androidx.annotation.o0
        public g build() {
            ContentInfo build;
            build = this.f5534a.build();
            return new g(new f(build));
        }

        @Override // androidx.core.view.g.d
        public void c(int i5) {
            this.f5534a.setFlags(i5);
        }

        @Override // androidx.core.view.g.d
        public void d(@androidx.annotation.o0 ClipData clipData) {
            this.f5534a.setClip(clipData);
        }

        @Override // androidx.core.view.g.d
        public void setExtras(@androidx.annotation.q0 Bundle bundle) {
            this.f5534a.setExtras(bundle);
        }

        c(@androidx.annotation.o0 g gVar) {
            this.f5534a = new ContentInfo.Builder(gVar.l());
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes3.dex */
    private static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        ClipData f5535a;

        /* renamed from: b, reason: collision with root package name */
        int f5536b;

        /* renamed from: c, reason: collision with root package name */
        int f5537c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        Uri f5538d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        Bundle f5539e;

        e(@androidx.annotation.o0 ClipData clipData, int i5) {
            this.f5535a = clipData;
            this.f5536b = i5;
        }

        @Override // androidx.core.view.g.d
        public void a(int i5) {
            this.f5536b = i5;
        }

        @Override // androidx.core.view.g.d
        public void b(@androidx.annotation.q0 Uri uri) {
            this.f5538d = uri;
        }

        @Override // androidx.core.view.g.d
        @androidx.annotation.o0
        public g build() {
            return new g(new h(this));
        }

        @Override // androidx.core.view.g.d
        public void c(int i5) {
            this.f5537c = i5;
        }

        @Override // androidx.core.view.g.d
        public void d(@androidx.annotation.o0 ClipData clipData) {
            this.f5535a = clipData;
        }

        @Override // androidx.core.view.g.d
        public void setExtras(@androidx.annotation.q0 Bundle bundle) {
            this.f5539e = bundle;
        }

        e(@androidx.annotation.o0 g gVar) {
            this.f5535a = gVar.c();
            this.f5536b = gVar.g();
            this.f5537c = gVar.e();
            this.f5538d = gVar.f();
            this.f5539e = gVar.d();
        }
    }

    /* compiled from: ContentInfoCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final d f5533a;

        public b(@androidx.annotation.o0 g gVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f5533a = new c(gVar);
            } else {
                this.f5533a = new e(gVar);
            }
        }

        @androidx.annotation.o0
        public g a() {
            return this.f5533a.build();
        }

        @androidx.annotation.o0
        public b b(@androidx.annotation.o0 ClipData clipData) {
            this.f5533a.d(clipData);
            return this;
        }

        @androidx.annotation.o0
        public b c(@androidx.annotation.q0 Bundle bundle) {
            this.f5533a.setExtras(bundle);
            return this;
        }

        @androidx.annotation.o0
        public b d(int i5) {
            this.f5533a.c(i5);
            return this;
        }

        @androidx.annotation.o0
        public b e(@androidx.annotation.q0 Uri uri) {
            this.f5533a.b(uri);
            return this;
        }

        @androidx.annotation.o0
        public b f(int i5) {
            this.f5533a.a(i5);
            return this;
        }

        public b(@androidx.annotation.o0 ClipData clipData, int i5) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f5533a = new c(clipData, i5);
            } else {
                this.f5533a = new e(clipData, i5);
            }
        }
    }
}
