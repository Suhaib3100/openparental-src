package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/s;", "T", "V", "Lkotlin/reflect/jvm/internal/x;", "Lkotlin/reflect/l;", "receiver", "value", "Lkotlin/m2;", "c0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/s$a;", "kotlin.jvm.PlatformType", "C", "Lkotlin/reflect/jvm/internal/g0$b;", "_setter", "O0", "()Lkotlin/reflect/jvm/internal/s$a;", "setter", "Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class s<T, V> extends x<T, V> implements KMutableProperty1<T, V> {

    /* renamed from: C, reason: from kotlin metadata */
    @d5.d
    private final g0.b<a<T, V>> _setter;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/s$a;", "T", "V", "Lkotlin/reflect/jvm/internal/z$d;", "Lkotlin/reflect/l$b;", "receiver", "value", "Lkotlin/m2;", "J0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/s;", "v", "Lkotlin/reflect/jvm/internal/s;", "I0", "()Lkotlin/reflect/jvm/internal/s;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/s;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a<T, V> extends z.d<V> implements KMutableProperty1.b<T, V> {

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final s<T, V> property;

        public a(@d5.d s<T, V> sVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("話"));
            this.property = sVar;
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        public z G0() {
            return this.property;
        }

        @d5.d
        public s<T, V> I0() {
            return this.property;
        }

        public void J0(T receiver, V value) {
            this.property.c0(receiver, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.p
        public /* bridge */ /* synthetic */ m2 g0(Object obj, Object obj2) {
            J0(obj, obj2);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.KProperty.a
        public KProperty s0() {
            return this.property;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/s$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/s$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a<T, V>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ s<T, V> f26803p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s<T, V> sVar) {
            super(0);
            this.f26803p = sVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<T, V> n() {
            return new a<>(this.f26803p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@d5.d p pVar, @d5.d String str, @d5.d String str2, @d5.e Object obj) {
        super(pVar, str, str2, obj);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詺"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("詻"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("詼"));
        g0.b<a<T, V>> b6 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詽"));
        this._setter = b6;
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    @d5.d
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a<T, V> h() {
        a<T, V> n5 = this._setter.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("誁"));
        return n5;
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void c0(T receiver, V value) {
        h().C(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@d5.d p pVar, @d5.d u0 u0Var) {
        super(pVar, u0Var);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詾"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("詿"));
        g0.b<a<T, V>> b6 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誀"));
        this._setter = b6;
    }
}
