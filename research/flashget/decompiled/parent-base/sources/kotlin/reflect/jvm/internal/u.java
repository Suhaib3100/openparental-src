package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.l;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/u;", "T", "V", "Lkotlin/reflect/jvm/internal/z;", "Lkotlin/reflect/l;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "Lkotlin/k2;", "G", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/u$a;", "r", "Lkotlin/b0;", "_setter", "C0", "()Lkotlin/reflect/jvm/internal/u$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class u<T, V> extends z<T, V> implements kotlin.reflect.l<T, V> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a<T, V>> _setter;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/u$a;", "T", "V", "Lkotlin/reflect/jvm/internal/b0$d;", "Lkotlin/reflect/l$b;", "Lkotlin/reflect/jvm/internal/u;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/u;)V", "receiver", "value", "Lkotlin/k2;", "x0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "Lkotlin/reflect/jvm/internal/u;", "w0", "()Lkotlin/reflect/jvm/internal/u;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, V> extends b0.d<V> implements l.b<T, V> {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final u<T, V> property;

        public a(@fg.l u<T, V> uVar) {
            kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("芅\u0001"));
            this.property = uVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(Object obj, Object obj2) {
            x0(obj, obj2);
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
        public u<T, V> w0() {
            return this.property;
        }

        public void x0(T receiver, V value) {
            this.property.G(receiver, value);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/u$a;", "a", "()Lkotlin/reflect/jvm/internal/u$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a<T, V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<T, V> f78823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u<T, V> uVar) {
            super(0);
            this.f78823b = uVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<T, V> invoke() {
            return new a<>(this.f78823b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@fg.l r rVar, @fg.l String str, @fg.l String str2, @fg.m Object obj) {
        super(rVar, str, str2, obj);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芊\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("芋\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("芌\u0001"));
        this._setter = kotlin.c0.b(kotlin.f0.PUBLICATION, new b(this));
    }

    @Override // kotlin.reflect.l, kotlin.reflect.j
    @fg.l
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public a<T, V> getSetter() {
        return this._setter.getValue();
    }

    @Override // kotlin.reflect.l
    public void G(T receiver, V value) {
        getSetter().call(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@fg.l r rVar, @fg.l u0 u0Var) {
        super(rVar, u0Var);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芊\u0001"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("芍\u0001"));
        this._setter = kotlin.c0.b(kotlin.f0.PUBLICATION, new b(this));
    }
}
