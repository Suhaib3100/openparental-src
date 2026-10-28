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

/* compiled from: AuthenticationAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000e2\u00020\u0001:\u0003\b\f\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/o;", "", "", "title", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "a", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "b", "Landroid/app/PendingIntent;", "c", "()Landroid/app/PendingIntent;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAuthenticationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    private static final int f28089e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PendingIntent pendingIntent;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f28088d = "AuthenticationAction";

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f28090f = "AuthenticationAction";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f28091g = "androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f28092h = "androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: AuthenticationAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/o$a;", "", "<init>", "()V", "Landroid/service/credentials/Action;", "authenticationAction", "Landroidx/credentials/provider/o;", "a", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/o;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28095a = new a();

        private a() {
        }

        @fg.m
        @kd.n
        public static final o a(@fg.l Action authenticationAction) {
            kotlin.jvm.internal.l0.p(authenticationAction, "authenticationAction");
            Slice slice = authenticationAction.getSlice();
            kotlin.jvm.internal.l0.o(slice, "authenticationAction.slice");
            return o.INSTANCE.b(slice);
        }
    }

    /* compiled from: AuthenticationAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/credentials/provider/o$b;", "", "", "title", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "Landroidx/credentials/provider/o;", "a", "()Landroidx/credentials/provider/o;", "Ljava/lang/CharSequence;", "b", "Landroid/app/PendingIntent;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CharSequence title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final PendingIntent pendingIntent;

        public b(@fg.l CharSequence title, @fg.l PendingIntent pendingIntent) {
            kotlin.jvm.internal.l0.p(title, "title");
            kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
            this.title = title;
            this.pendingIntent = pendingIntent;
        }

        @fg.l
        public final o a() {
            return new o(this.title, this.pendingIntent);
        }
    }

    /* compiled from: AuthenticationAction.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/credentials/provider/o$c;", "", "<init>", "()V", "Landroidx/credentials/provider/o;", "authenticationAction", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/o;)Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/o;", "Landroid/service/credentials/Action;", "a", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/o;", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_HINT_TITLE", "", "SLICE_SPEC_REVISION", "I", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAuthenticationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1855#2,2:180\n*S KotlinDebug\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction$Companion\n*L\n141#1:180,2\n*E\n"})
    /* renamed from: androidx.credentials.provider.o$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        @androidx.annotation.x0(34)
        public final o a(@fg.l Action authenticationAction) {
            kotlin.jvm.internal.l0.p(authenticationAction, "authenticationAction");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.a(authenticationAction);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final o b(@fg.l Slice slice) {
            List items;
            boolean hasHint;
            boolean hasHint2;
            kotlin.jvm.internal.l0.p(slice, "slice");
            items = slice.getItems();
            kotlin.jvm.internal.l0.o(items, "slice.items");
            Iterator it = items.iterator();
            CharSequence charSequence = null;
            PendingIntent pendingIntent = null;
            while (it.hasNext()) {
                SliceItem a5 = f.a(it.next());
                hasHint = a5.hasHint("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT");
                if (hasHint) {
                    pendingIntent = a5.getAction();
                } else {
                    hasHint2 = a5.hasHint("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE");
                    if (hasHint2) {
                        charSequence = a5.getText();
                    }
                }
            }
            try {
                kotlin.jvm.internal.l0.m(charSequence);
                kotlin.jvm.internal.l0.m(pendingIntent);
                return new o(charSequence, pendingIntent);
            } catch (Exception e4) {
                e4.getMessage();
                return null;
            }
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final Slice c(@fg.l o authenticationAction) {
            Slice.Builder addHints;
            Slice build;
            Slice.Builder addAction;
            Slice build2;
            kotlin.jvm.internal.l0.p(authenticationAction, "authenticationAction");
            CharSequence title = authenticationAction.getTitle();
            PendingIntent pendingIntent = authenticationAction.getPendingIntent();
            e.a();
            Slice.Builder a5 = c.a(Uri.EMPTY, n.a("AuthenticationAction", 0));
            addHints = d.a(a5).addHints(Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT"));
            build = addHints.build();
            addAction = a5.addAction(pendingIntent, build, null);
            addAction.addText(title, null, kotlin.collections.w.k("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE"));
            build2 = a5.build();
            kotlin.jvm.internal.l0.o(build2, "sliceBuilder.build()");
            return build2;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public o(@fg.l CharSequence title, @fg.l PendingIntent pendingIntent) {
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        this.title = title;
        this.pendingIntent = pendingIntent;
        if (title.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    @fg.m
    @kd.n
    @androidx.annotation.x0(34)
    public static final o a(@fg.l Action action) {
        return INSTANCE.a(action);
    }

    @SuppressLint({"WrongConstant"})
    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final o b(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final Slice e(@fg.l o oVar) {
        return INSTANCE.c(oVar);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }
}
