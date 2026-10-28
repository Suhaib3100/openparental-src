package androidx.core.os;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: Handler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lkotlin/m2;", "action", "Ljava/lang/Runnable;", "c", "uptimeMillis", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class k {

    /* compiled from: Handler.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a<m2> f4976o;

        public a(q3.a<m2> aVar) {
            this.f4976o = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4976o.n();
        }
    }

    /* compiled from: Handler.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a<m2> f4977o;

        public b(q3.a<m2> aVar) {
            this.f4977o = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4977o.n();
        }
    }

    @d5.d
    public static final Runnable a(@d5.d Handler handler, long j5, @d5.e Object obj, @d5.d q3.a<m2> action) {
        l0.p(handler, "<this>");
        l0.p(action, "action");
        a aVar = new a(action);
        handler.postAtTime(aVar, obj, j5);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j5, Object obj, q3.a action, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            obj = null;
        }
        l0.p(handler, "<this>");
        l0.p(action, "action");
        a aVar = new a(action);
        handler.postAtTime(aVar, obj, j5);
        return aVar;
    }

    @d5.d
    public static final Runnable c(@d5.d Handler handler, long j5, @d5.e Object obj, @d5.d q3.a<m2> action) {
        l0.p(handler, "<this>");
        l0.p(action, "action");
        b bVar = new b(action);
        if (obj == null) {
            handler.postDelayed(bVar, j5);
        } else {
            i.d(handler, bVar, obj, j5);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j5, Object obj, q3.a action, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            obj = null;
        }
        l0.p(handler, "<this>");
        l0.p(action, "action");
        b bVar = new b(action);
        if (obj == null) {
            handler.postDelayed(bVar, j5);
        } else {
            i.d(handler, bVar, obj, j5);
        }
        return bVar;
    }
}
