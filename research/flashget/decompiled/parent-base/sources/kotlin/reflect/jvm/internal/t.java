package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.k;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/t;", "V", "Lkotlin/reflect/jvm/internal/y;", "Lkotlin/reflect/k;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "value", "Lkotlin/k2;", "set", "(Ljava/lang/Object;)V", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/t$a;", "r", "Lkotlin/b0;", "_setter", "C0", "()Lkotlin/reflect/jvm/internal/t$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class t<V> extends y<V> implements kotlin.reflect.k<V> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a<V>> _setter;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/t$a;", "R", "Lkotlin/reflect/jvm/internal/b0$d;", "Lkotlin/reflect/k$b;", "Lkotlin/reflect/jvm/internal/t;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/t;)V", "value", "Lkotlin/k2;", "x0", "(Ljava/lang/Object;)V", "k", "Lkotlin/reflect/jvm/internal/t;", "w0", "()Lkotlin/reflect/jvm/internal/t;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<R> extends b0.d<R> implements k.b<R> {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final t<R> property;

        public a(@fg.l t<R> tVar) {
            kotlin.jvm.internal.l0.p(tVar, ProtectedSandApp.s("艼\u0001"));
            this.property = tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            x0(obj);
            return k2.f75408a;
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
        public t<R> w0() {
            return this.property;
        }

        public void x0(R value) {
            this.property.set(value);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/t$a;", "a", "()Lkotlin/reflect/jvm/internal/t$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a<V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t<V> f78820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t<V> tVar) {
            super(0);
            this.f78820b = tVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<V> invoke() {
            return new a<>(this.f78820b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@fg.l r rVar, @fg.l u0 u0Var) {
        super(rVar, u0Var);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芁\u0001"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("芄\u0001"));
        this._setter = kotlin.c0.b(kotlin.f0.PUBLICATION, new b(this));
    }

    @Override // kotlin.reflect.k, kotlin.reflect.j
    @fg.l
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public a<V> getSetter() {
        return this._setter.getValue();
    }

    @Override // kotlin.reflect.k
    public void set(V value) {
        getSetter().call(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@fg.l r rVar, @fg.l String str, @fg.l String str2, @fg.m Object obj) {
        super(rVar, str, str2, obj);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芁\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("节\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("芃\u0001"));
        this._setter = kotlin.c0.b(kotlin.f0.PUBLICATION, new b(this));
    }
}
