package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.os.Build;
import android.service.credentials.RemoteEntry;
import androidx.annotation.c1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RemoteEntry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0003\u0006\n\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/credentials/provider/g2;", "", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Landroid/app/PendingIntent;)V", "a", "Landroid/app/PendingIntent;", "c", "()Landroid/app/PendingIntent;", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g2 {

    /* renamed from: f, reason: collision with root package name */
    private static final int f28083f = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PendingIntent pendingIntent;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f28080c = "RemoteEntry";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f28081d = "androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT";

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f28082e = "RemoteEntry";

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: RemoteEntry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/g2$a;", "", "<init>", "()V", "Landroid/service/credentials/RemoteEntry;", "remoteEntry", "Landroidx/credentials/provider/g2;", "a", "(Landroid/service/credentials/RemoteEntry;)Landroidx/credentials/provider/g2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28085a = new a();

        private a() {
        }

        @fg.m
        @kd.n
        public static final g2 a(@fg.l RemoteEntry remoteEntry) {
            kotlin.jvm.internal.l0.p(remoteEntry, "remoteEntry");
            Slice slice = remoteEntry.getSlice();
            kotlin.jvm.internal.l0.o(slice, "remoteEntry.slice");
            return g2.INSTANCE.b(slice);
        }
    }

    /* compiled from: RemoteEntry.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/credentials/provider/g2$b;", "", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Landroid/app/PendingIntent;)V", "Landroidx/credentials/provider/g2;", "a", "()Landroidx/credentials/provider/g2;", "Landroid/app/PendingIntent;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final PendingIntent pendingIntent;

        public b(@fg.l PendingIntent pendingIntent) {
            kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
            this.pendingIntent = pendingIntent;
        }

        @fg.l
        public final g2 a() {
            return new g2(this.pendingIntent);
        }
    }

    /* compiled from: RemoteEntry.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/credentials/provider/g2$c;", "", "<init>", "()V", "Landroidx/credentials/provider/g2;", "remoteEntry", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/g2;)Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/g2;", "Landroid/service/credentials/RemoteEntry;", "a", "(Landroid/service/credentials/RemoteEntry;)Landroidx/credentials/provider/g2;", "", "REVISION_ID", "I", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRemoteEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteEntry.kt\nandroidx/credentials/provider/RemoteEntry$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1855#2,2:152\n*S KotlinDebug\n*F\n+ 1 RemoteEntry.kt\nandroidx/credentials/provider/RemoteEntry$Companion\n*L\n118#1:152,2\n*E\n"})
    /* renamed from: androidx.credentials.provider.g2$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        public final g2 a(@fg.l RemoteEntry remoteEntry) {
            kotlin.jvm.internal.l0.p(remoteEntry, "remoteEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.a(remoteEntry);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final g2 b(@fg.l Slice slice) {
            List items;
            boolean hasHint;
            kotlin.jvm.internal.l0.p(slice, "slice");
            items = slice.getItems();
            kotlin.jvm.internal.l0.o(items, "slice.items");
            Iterator it = items.iterator();
            PendingIntent pendingIntent = null;
            while (it.hasNext()) {
                SliceItem a5 = f.a(it.next());
                hasHint = a5.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT");
                if (hasHint) {
                    pendingIntent = a5.getAction();
                }
            }
            try {
                kotlin.jvm.internal.l0.m(pendingIntent);
                return new g2(pendingIntent);
            } catch (Exception e4) {
                e4.getMessage();
                return null;
            }
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(28)
        public final Slice c(@fg.l g2 remoteEntry) {
            Slice.Builder addHints;
            Slice build;
            Slice build2;
            kotlin.jvm.internal.l0.p(remoteEntry, "remoteEntry");
            PendingIntent pendingIntent = remoteEntry.getPendingIntent();
            e.a();
            Slice.Builder a5 = c.a(Uri.EMPTY, n.a("RemoteEntry", 1));
            addHints = d.a(a5).addHints(Collections.singletonList("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT"));
            build = addHints.build();
            a5.addAction(pendingIntent, build, null);
            build2 = a5.build();
            kotlin.jvm.internal.l0.o(build2, "sliceBuilder.build()");
            return build2;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public g2(@fg.l PendingIntent pendingIntent) {
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        this.pendingIntent = pendingIntent;
    }

    @fg.m
    @kd.n
    public static final g2 a(@fg.l RemoteEntry remoteEntry) {
        return INSTANCE.a(remoteEntry);
    }

    @SuppressLint({"WrongConstant"})
    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final g2 b(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.x0(28)
    public static final Slice d(@fg.l g2 g2Var) {
        return INSTANCE.c(g2Var);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }
}
