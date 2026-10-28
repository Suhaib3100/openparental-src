package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes5.dex */
public class d0 {

    /* compiled from: LazyJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23327a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23327a = iArr;
        }
    }

    @d5.d
    public static final <T> Lazy<T> a(@d5.e Object obj, @d5.d q3.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("㻶"));
        return new SynchronizedLazyImpl(aVar, obj);
    }

    @d5.d
    public static <T> Lazy<T> b(@d5.d LazyThreadSafetyMode lazyThreadSafetyMode, @d5.d q3.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(lazyThreadSafetyMode, ProtectedSandApp.s("㻷"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("㻸"));
        int i5 = a.f23327a[lazyThreadSafetyMode.ordinal()];
        if (i5 == 1) {
            return new SynchronizedLazyImpl(aVar, null, 2, null);
        }
        if (i5 == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i5 == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @d5.d
    public static <T> Lazy<T> c(@d5.d q3.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("㻹"));
        return new SynchronizedLazyImpl(aVar, null, 2, null);
    }
}
