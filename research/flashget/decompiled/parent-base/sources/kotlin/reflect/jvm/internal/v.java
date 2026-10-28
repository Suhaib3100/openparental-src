package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.m;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/v;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/a0;", "Lkotlin/reflect/m;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "value", "Lkotlin/k2;", "P", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/v$a;", "r", "Lkotlin/b0;", "_setter", "C0", "()Lkotlin/reflect/jvm/internal/v$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v<D, E, V> extends a0<D, E, V> implements kotlin.reflect.m<D, E, V> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a<D, E, V>> _setter;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/v$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/b0$d;", "Lkotlin/reflect/m$b;", "Lkotlin/reflect/jvm/internal/v;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/v;)V", "receiver1", "receiver2", "value", "Lkotlin/k2;", "x0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "k", "Lkotlin/reflect/jvm/internal/v;", "w0", "()Lkotlin/reflect/jvm/internal/v;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<D, E, V> extends b0.d<V> implements m.b<D, E, V> {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final v<D, E, V> property;

        public a(@fg.l v<D, E, V> vVar) {
            kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("芎\u0001"));
            this.property = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(Object obj, Object obj2, Object obj3) {
            x0(obj, obj2, obj3);
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
        public v<D, E, V> w0() {
            return this.property;
        }

        public void x0(D receiver1, E receiver2, V value) {
            this.property.P(receiver1, receiver2, value);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Lkotlin/reflect/jvm/internal/v$a;", "a", "()Lkotlin/reflect/jvm/internal/v$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a<D, E, V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v<D, E, V> f78826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v<D, E, V> vVar) {
            super(0);
            this.f78826b = vVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<D, E, V> invoke() {
            return new a<>(this.f78826b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@fg.l r rVar, @fg.l String str, @fg.l String str2) {
        super(rVar, str, str2);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芏\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("芐\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("芑\u0001"));
        this._setter = kotlin.c0.b(kotlin.f0.PUBLICATION, new b(this));
    }

    @Override // kotlin.reflect.m, kotlin.reflect.j
    @fg.l
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> getSetter() {
        return this._setter.getValue();
    }

    @Override // kotlin.reflect.m
    public void P(D receiver1, E receiver2, V value) {
        getSetter().call(receiver1, receiver2, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@fg.l r rVar, @fg.l u0 u0Var) {
        super(rVar, u0Var);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芏\u0001"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("芒\u0001"));
        this._setter = kotlin.c0.b(kotlin.f0.PUBLICATION, new b(this));
    }
}
