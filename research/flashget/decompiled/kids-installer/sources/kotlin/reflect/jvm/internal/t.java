package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001dJ'\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0002\u0010\nRF\u0010\u0010\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \r*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/t;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/y;", "Lkotlin/reflect/m;", "receiver1", "receiver2", "value", "Lkotlin/m2;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/t$a;", "kotlin.jvm.PlatformType", "C", "Lkotlin/reflect/jvm/internal/g0$b;", "_setter", "O0", "()Lkotlin/reflect/jvm/internal/t$a;", "setter", "Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class t<D, E, V> extends y<D, E, V> implements KMutableProperty2<D, E, V> {

    /* renamed from: C, reason: from kotlin metadata */
    @d5.d
    private final g0.b<a<D, E, V>> _setter;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u00042\u0006\u0010\b\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/t$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/z$d;", "Lkotlin/reflect/m$b;", "receiver1", "receiver2", "value", "Lkotlin/m2;", "J0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/t;", "v", "Lkotlin/reflect/jvm/internal/t;", "I0", "()Lkotlin/reflect/jvm/internal/t;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/t;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a<D, E, V> extends z.d<V> implements KMutableProperty2.b<D, E, V> {

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final t<D, E, V> property;

        public a(@d5.d t<D, E, V> tVar) {
            kotlin.jvm.internal.l0.p(tVar, ProtectedSandApp.s("誂"));
            this.property = tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.q
        public /* bridge */ /* synthetic */ m2 G(Object obj, Object obj2, Object obj3) {
            J0(obj, obj2, obj3);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        public z G0() {
            return this.property;
        }

        @d5.d
        public t<D, E, V> I0() {
            return this.property;
        }

        public void J0(D receiver1, E receiver2, V value) {
            this.property.E(receiver1, receiver2, value);
        }

        @Override // kotlin.reflect.KProperty.a
        public KProperty s0() {
            return this.property;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u0004*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"D", "E", "V", "Lkotlin/reflect/jvm/internal/t$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/t$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a<D, E, V>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ t<D, E, V> f26805p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t<D, E, V> tVar) {
            super(0);
            this.f26805p = tVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<D, E, V> n() {
            return new a<>(this.f26805p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@d5.d p pVar, @d5.d String str, @d5.d String str2) {
        super(pVar, str, str2);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("誋"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("誌"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("認"));
        g0.b<a<D, E, V>> b6 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誎"));
        this._setter = b6;
    }

    @Override // kotlin.reflect.KMutableProperty2
    public void E(D receiver1, E receiver2, V value) {
        h().C(receiver1, receiver2, value);
    }

    @Override // kotlin.reflect.KMutableProperty2, kotlin.reflect.KMutableProperty
    @d5.d
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> h() {
        a<D, E, V> n5 = this._setter.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("誒"));
        return n5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@d5.d p pVar, @d5.d u0 u0Var) {
        super(pVar, u0Var);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("誏"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("誐"));
        g0.b<a<D, E, V>> b6 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誑"));
        this._setter = b6;
    }
}
