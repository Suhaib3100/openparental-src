package androidx.core.os;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Handler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lkotlin/k2;", "action", "Ljava/lang/Runnable;", "c", "(Landroid/os/Handler;JLjava/lang/Object;Lld/a;)Ljava/lang/Runnable;", "uptimeMillis", "a", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* compiled from: Handler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f26525b;

        public a(ld.a<k2> aVar) {
            this.f26525b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26525b.invoke();
        }
    }

    /* compiled from: Handler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f26526b;

        public b(ld.a<k2> aVar) {
            this.f26526b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26526b.invoke();
        }
    }

    @fg.l
    public static final Runnable a(@fg.l Handler handler, long j4, @fg.m Object obj, @fg.l ld.a<k2> aVar) {
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j4);
        return aVar2;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j4, Object obj, ld.a aVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            obj = null;
        }
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j4);
        return aVar2;
    }

    @fg.l
    public static final Runnable c(@fg.l Handler handler, long j4, @fg.m Object obj, @fg.l ld.a<k2> aVar) {
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j4);
        } else {
            k.d(handler, bVar, obj, j4);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j4, Object obj, ld.a aVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            obj = null;
        }
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j4);
        } else {
            k.d(handler, bVar, obj, j4);
        }
        return bVar;
    }
}
