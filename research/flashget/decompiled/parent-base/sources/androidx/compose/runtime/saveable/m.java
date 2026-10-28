package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import ld.p;

/* compiled from: Saver.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a~\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\b2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\f\"\u0004\b\u0000\u0010\u000f¢\u0006\u0004\b\u0010\u0010\u0011\"\"\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/n;", "Lkotlin/r0;", "name", "value", "Lkotlin/u;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/l;", "a", "(Lld/p;Lld/l;)Landroidx/compose/runtime/saveable/l;", "T", "b", "()Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/runtime/saveable/l;", "AutoSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final l<Object, Object> f17011a = new c(a.f17012b, b.f17013b);

    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "", "it", "a", "(Landroidx/compose/runtime/saveable/n;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements p<n, Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17012b = new a(2);

        a() {
            super(2);
        }

        @fg.m
        public final Object a(@fg.l n nVar, @fg.m Object obj) {
            return obj;
        }

        @Override // ld.p
        public Object invoke(n nVar, Object obj) {
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.l<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f17013b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        public final Object invoke(@fg.l Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* compiled from: Saver.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/runtime/saveable/m$c", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/runtime/saveable/n;", "value", "a", "(Landroidx/compose/runtime/saveable/n;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c<Original, Saveable> implements l<Original, Saveable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<n, Original, Saveable> f17014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Saveable, Original> f17015b;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super n, ? super Original, ? extends Saveable> pVar, ld.l<? super Saveable, ? extends Original> lVar) {
            this.f17014a = pVar;
            this.f17015b = lVar;
        }

        @Override // androidx.compose.runtime.saveable.l
        @fg.m
        public Saveable a(@fg.l n nVar, Original original) {
            return this.f17014a.invoke(nVar, original);
        }

        @Override // androidx.compose.runtime.saveable.l
        @fg.m
        public Original b(@fg.l Saveable value) {
            return this.f17015b.invoke(value);
        }
    }

    @fg.l
    public static final <Original, Saveable> l<Original, Saveable> a(@fg.l p<? super n, ? super Original, ? extends Saveable> pVar, @fg.l ld.l<? super Saveable, ? extends Original> lVar) {
        return new c(pVar, lVar);
    }

    @fg.l
    public static final <T> l<T, Object> b() {
        l<T, Object> lVar = (l<T, Object>) f17011a;
        l0.n(lVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return lVar;
    }
}
