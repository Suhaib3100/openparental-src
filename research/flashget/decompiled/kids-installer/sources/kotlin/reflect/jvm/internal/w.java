package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010 J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0005R.\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u000b*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\n0\t8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/w;", "V", "Lkotlin/reflect/p;", "Lkotlin/reflect/jvm/internal/z;", "get", "()Ljava/lang/Object;", "", "p0", "n", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/w$a;", "kotlin.jvm.PlatformType", "A", "Lkotlin/reflect/jvm/internal/g0$b;", "_getter", "Lkotlin/b0;", "B", "Lkotlin/b0;", "delegateValue", "N0", "()Lkotlin/reflect/jvm/internal/w$a;", "getter", "Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class w<V> extends z<V> implements KProperty0<V> {

    /* renamed from: A, reason: from kotlin metadata */
    @d5.d
    private final g0.b<a<V>> _getter;

    /* renamed from: B, reason: from kotlin metadata */
    @d5.d
    private final Lazy<Object> delegateValue;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/w$a;", "R", "Lkotlin/reflect/jvm/internal/z$c;", "Lkotlin/reflect/p$b;", "n", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/w;", "v", "Lkotlin/reflect/jvm/internal/w;", "I0", "()Lkotlin/reflect/jvm/internal/w;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/w;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a<R> extends z.c<R> implements KProperty0.b<R> {

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final w<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d w<? extends R> wVar) {
            kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("誳"));
            this.property = wVar;
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        public z G0() {
            return this.property;
        }

        @d5.d
        public w<R> I0() {
            return this.property;
        }

        @Override // q3.a
        public R n() {
            return this.property.get();
        }

        @Override // kotlin.reflect.KProperty.a
        public KProperty s0() {
            return this.property;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/w$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/w$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a<? extends V>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ w<V> f26833p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(w<? extends V> wVar) {
            super(0);
            this.f26833p = wVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<V> n() {
            return new a<>(this.f26833p);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "", "n", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements q3.a<Object> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ w<V> f26834p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(w<? extends V> wVar) {
            super(0);
            this.f26834p = wVar;
        }

        @Override // q3.a
        @d5.e
        public final Object n() {
            w<V> wVar = this.f26834p;
            return wVar.I0(wVar.G0(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@d5.d p pVar, @d5.d u0 u0Var) {
        super(pVar, u0Var);
        Lazy<Object> b6;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詥"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("試"));
        g0.b<a<V>> b7 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("詧"));
        this._getter = b7;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(this));
        this.delegateValue = b6;
    }

    @Override // kotlin.reflect.KProperty
    @d5.d
    /* renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<V> e() {
        a<V> n5 = this._getter.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("詨"));
        return n5;
    }

    @Override // kotlin.reflect.KProperty0
    public V get() {
        return K0().C(new Object[0]);
    }

    @Override // q3.a
    public V n() {
        return get();
    }

    @Override // kotlin.reflect.KProperty0
    @d5.e
    public Object p0() {
        return this.delegateValue.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@d5.d p pVar, @d5.d String str, @d5.d String str2, @d5.e Object obj) {
        super(pVar, str, str2, obj);
        Lazy<Object> b6;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詡"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("詢"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("詣"));
        g0.b<a<V>> b7 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("詤"));
        this._getter = b7;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(this));
        this.delegateValue = b6;
    }
}
