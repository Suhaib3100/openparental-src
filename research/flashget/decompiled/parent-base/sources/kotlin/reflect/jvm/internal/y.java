package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.p;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0011R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/y;", "V", "Lkotlin/reflect/p;", "Lkotlin/reflect/jvm/internal/b0;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/y$a;", "p", "Lkotlin/b0;", "_getter", "q", "delegateValue", "B0", "()Lkotlin/reflect/jvm/internal/y$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class y<V> extends b0<V> implements kotlin.reflect.p<V> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a<V>> _getter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<Object> delegateValue;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/y$a;", "R", "Lkotlin/reflect/jvm/internal/b0$c;", "Lkotlin/reflect/p$b;", "Lkotlin/reflect/jvm/internal/y;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/y;)V", "invoke", "()Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/y;", "w0", "()Lkotlin/reflect/jvm/internal/y;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<R> extends b0.c<R> implements p.b<R> {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final y<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l y<? extends R> yVar) {
            kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("芴\u0001"));
            this.property = yVar;
        }

        @Override // ld.a
        public R invoke() {
            return this.property.get();
        }

        @Override // kotlin.reflect.o.a
        public kotlin.reflect.o l() {
            return this.property;
        }

        @Override // kotlin.reflect.jvm.internal.b0.a
        public b0 u0() {
            return this.property;
        }

        @fg.l
        public y<R> w0() {
            return this.property;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/y$a;", "a", "()Lkotlin/reflect/jvm/internal/y$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a<? extends V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y<V> f78858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y<? extends V> yVar) {
            super(0);
            this.f78858b = yVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<V> invoke() {
            return new a<>(this.f78858b);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y<V> f78859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(y<? extends V> yVar) {
            super(0);
            this.f78859b = yVar;
        }

        @Override // ld.a
        @fg.m
        public final Object invoke() {
            y<V> yVar = this.f78859b;
            return yVar.w0(yVar.u0(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@fg.l r rVar, @fg.l u0 u0Var) {
        super(rVar, u0Var);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("艽\u0001"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("芀\u0001"));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this._getter = kotlin.c0.b(f0Var, new b(this));
        this.delegateValue = kotlin.c0.b(f0Var, new c(this));
    }

    @Override // kotlin.reflect.jvm.internal.b0
    @fg.l
    /* renamed from: B0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<V> y0() {
        return this._getter.getValue();
    }

    @Override // kotlin.reflect.p
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.reflect.p
    @fg.m
    public Object getDelegate() {
        return this.delegateValue.getValue();
    }

    @Override // ld.a
    public V invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@fg.l r rVar, @fg.l String str, @fg.l String str2, @fg.m Object obj) {
        super(rVar, str, str2, obj);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("艽\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("艾\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("艿\u0001"));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this._getter = kotlin.c0.b(f0Var, new b(this));
        this.delegateValue = kotlin.c0.b(f0Var, new c(this));
    }
}
