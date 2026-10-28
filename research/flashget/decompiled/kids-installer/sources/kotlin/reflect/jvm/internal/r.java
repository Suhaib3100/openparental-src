package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B+\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lkotlin/reflect/jvm/internal/r;", "V", "Lkotlin/reflect/jvm/internal/w;", "Lkotlin/reflect/k;", "value", "Lkotlin/m2;", "set", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/r$a;", "kotlin.jvm.PlatformType", "C", "Lkotlin/reflect/jvm/internal/g0$b;", "_setter", "O0", "()Lkotlin/reflect/jvm/internal/r$a;", "setter", "Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class r<V> extends w<V> implements KMutableProperty0<V> {

    /* renamed from: C, reason: from kotlin metadata */
    @d5.d
    private final g0.b<a<V>> _setter;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/r$a;", "R", "Lkotlin/reflect/jvm/internal/z$d;", "Lkotlin/reflect/k$b;", "value", "Lkotlin/m2;", "J0", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/r;", "v", "Lkotlin/reflect/jvm/internal/r;", "I0", "()Lkotlin/reflect/jvm/internal/r;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/r;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a<R> extends z.d<R> implements KMutableProperty0.b<R> {

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final r<R> property;

        public a(@d5.d r<R> rVar) {
            kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("詏"));
            this.property = rVar;
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        public z G0() {
            return this.property;
        }

        @d5.d
        public r<R> I0() {
            return this.property;
        }

        public void J0(R value) {
            this.property.set(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Object obj) {
            J0(obj);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.KProperty.a
        public KProperty s0() {
            return this.property;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/r$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/r$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a<V>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ r<V> f26801p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r<V> rVar) {
            super(0);
            this.f26801p = rVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<V> n() {
            return new a<>(this.f26801p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@d5.d p pVar, @d5.d u0 u0Var) {
        super(pVar, u0Var);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詭"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("詮"));
        g0.b<a<V>> b6 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詯"));
        this._setter = b6;
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    @d5.d
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a<V> h() {
        a<V> n5 = this._setter.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("詰"));
        return n5;
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(V value) {
        h().C(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@d5.d p pVar, @d5.d String str, @d5.d String str2, @d5.e Object obj) {
        super(pVar, str, str2, obj);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詩"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("詪"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("詫"));
        g0.b<a<V>> b6 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詬"));
        this._setter = b6;
    }
}
