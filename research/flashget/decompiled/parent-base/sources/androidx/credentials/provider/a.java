package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.os.Build;
import android.service.credentials.Action;
import androidx.annotation.c1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Action.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0003\t\r\u000fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/credentials/provider/a;", "", "", "title", "Landroid/app/PendingIntent;", "pendingIntent", "subtitle", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;)V", "a", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "b", "Landroid/app/PendingIntent;", "c", "()Landroid/app/PendingIntent;", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f27979f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PendingIntent pendingIntent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CharSequence subtitle;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f27978e = "Action";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f27980g = "Action";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f27981h = "androidx.credentials.provider.action.HINT_ACTION_TITLE";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final String f27982i = "androidx.credentials.provider.action.HINT_ACTION_SUBTEXT";

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final String f27983j = "androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/a$a;", "", "<init>", "()V", "Landroid/service/credentials/Action;", "action", "Landroidx/credentials/provider/a;", "a", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/a;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    /* renamed from: androidx.credentials.provider.a$a, reason: collision with other inner class name */
    private static final class C0451a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final C0451a f27987a = new C0451a();

        private C0451a() {
        }

        @fg.m
        @kd.n
        public static final a a(@fg.l Action action) {
            kotlin.jvm.internal.l0.p(action, "action");
            Slice slice = action.getSlice();
            kotlin.jvm.internal.l0.o(slice, "action.slice");
            return a.INSTANCE.b(slice);
        }
    }

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/credentials/provider/a$b;", "", "", "title", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "subtitle", "b", "(Ljava/lang/CharSequence;)Landroidx/credentials/provider/a$b;", "Landroidx/credentials/provider/a;", "a", "()Landroidx/credentials/provider/a;", "Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CharSequence title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final PendingIntent pendingIntent;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private CharSequence subtitle;

        public b(@fg.l CharSequence title, @fg.l PendingIntent pendingIntent) {
            kotlin.jvm.internal.l0.p(title, "title");
            kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
            this.title = title;
            this.pendingIntent = pendingIntent;
        }

        @fg.l
        public final a a() {
            return new a(this.title, this.pendingIntent, this.subtitle);
        }

        @fg.l
        public final b b(@fg.m CharSequence subtitle) {
            this.subtitle = subtitle;
            return this;
        }
    }

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/credentials/provider/a$c;", "", "<init>", "()V", "Landroidx/credentials/provider/a;", "action", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/a;)Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/a;", "Landroid/service/credentials/Action;", "a", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/a;", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "", "SLICE_SPEC_REVISION", "I", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1855#2,2:206\n*S KotlinDebug\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n*L\n167#1:206,2\n*E\n"})
    /* renamed from: androidx.credentials.provider.a$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        public final a a(@fg.l Action action) {
            kotlin.jvm.internal.l0.p(action, "action");
            if (Build.VERSION.SDK_INT >= 34) {
                return C0451a.a(action);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final a b(@fg.l Slice slice) {
            List items;
            boolean hasHint;
            boolean hasHint2;
            boolean hasHint3;
            kotlin.jvm.internal.l0.p(slice, "slice");
            items = slice.getItems();
            kotlin.jvm.internal.l0.o(items, "slice.items");
            Iterator it = items.iterator();
            CharSequence charSequence = "";
            PendingIntent pendingIntent = null;
            CharSequence charSequence2 = null;
            while (it.hasNext()) {
                SliceItem a5 = f.a(it.next());
                hasHint = a5.hasHint("androidx.credentials.provider.action.HINT_ACTION_TITLE");
                if (hasHint) {
                    charSequence = a5.getText();
                    kotlin.jvm.internal.l0.o(charSequence, "it.text");
                } else {
                    hasHint2 = a5.hasHint("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT");
                    if (hasHint2) {
                        charSequence2 = a5.getText();
                    } else {
                        hasHint3 = a5.hasHint("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT");
                        if (hasHint3) {
                            pendingIntent = a5.getAction();
                        }
                    }
                }
            }
            try {
                kotlin.jvm.internal.l0.m(pendingIntent);
                return new a(charSequence, pendingIntent, charSequence2);
            } catch (Exception e4) {
                e4.getMessage();
                return null;
            }
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final Slice c(@fg.l a action) {
            Slice.Builder addText;
            Slice.Builder addText2;
            Slice.Builder addHints;
            Slice build;
            Slice build2;
            kotlin.jvm.internal.l0.p(action, "action");
            CharSequence title = action.getTitle();
            CharSequence subtitle = action.getSubtitle();
            PendingIntent pendingIntent = action.getPendingIntent();
            e.a();
            addText = c.a(Uri.EMPTY, n.a("Action", 0)).addText(title, null, kotlin.collections.w.k("androidx.credentials.provider.action.HINT_ACTION_TITLE"));
            addText2 = addText.addText(subtitle, null, kotlin.collections.w.k("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT"));
            addHints = d.a(addText2).addHints(Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT"));
            build = addHints.build();
            addText2.addAction(pendingIntent, build, null);
            build2 = addText2.build();
            kotlin.jvm.internal.l0.o(build2, "sliceBuilder.build()");
            return build2;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public a(@fg.l CharSequence title, @fg.l PendingIntent pendingIntent, @fg.m CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        this.title = title;
        this.pendingIntent = pendingIntent;
        this.subtitle = charSequence;
        if (title.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    @fg.m
    @kd.n
    public static final a a(@fg.l Action action) {
        return INSTANCE.a(action);
    }

    @SuppressLint({"WrongConstant"})
    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final a b(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final Slice f(@fg.l a aVar) {
        return INSTANCE.c(aVar);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    public /* synthetic */ a(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, int i4, kotlin.jvm.internal.w wVar) {
        this(charSequence, pendingIntent, (i4 & 4) != 0 ? null : charSequence2);
    }
}
