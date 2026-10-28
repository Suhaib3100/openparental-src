package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/b0;", "c", "(Lld/a;)Lkotlin/b0;", "Lkotlin/f0;", "mode", "b", "(Lkotlin/f0;Lld/a;)Lkotlin/b0;", "", "lock", "a", "(Ljava/lang/Object;Lld/a;)Lkotlin/b0;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes7.dex */
public class d0 {

    /* compiled from: LazyJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75086a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75086a = iArr;
        }
    }

    @fg.l
    public static final <T> b0<T> a(@fg.m Object obj, @fg.l ld.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("悍\u0001"));
        return new j1(aVar, obj);
    }

    @fg.l
    public static <T> b0<T> b(@fg.l f0 f0Var, @fg.l ld.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(f0Var, ProtectedSandApp.s("悎\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("悍\u0001"));
        int i4 = a.f75086a[f0Var.ordinal()];
        int i5 = 2;
        if (i4 == 1) {
            kotlin.jvm.internal.w wVar = null;
            return new j1(aVar, wVar, i5, wVar);
        }
        if (i4 == 2) {
            return new b1(aVar);
        }
        if (i4 == 3) {
            return new l2(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public static <T> b0<T> c(@fg.l ld.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("悍\u0001"));
        kotlin.jvm.internal.w wVar = null;
        return new j1(aVar, wVar, 2, wVar);
    }
}
