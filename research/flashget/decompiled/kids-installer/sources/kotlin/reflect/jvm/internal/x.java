package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001$B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB+\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010#J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u0007R:\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \r*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f0\f0\u000b8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lkotlin/reflect/jvm/internal/x;", "T", "V", "Lkotlin/reflect/q;", "Lkotlin/reflect/jvm/internal/z;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "D", "N", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/x$a;", "kotlin.jvm.PlatformType", "A", "Lkotlin/reflect/jvm/internal/g0$b;", "_getter", "Lkotlin/b0;", "Ljava/lang/reflect/Member;", "B", "Lkotlin/b0;", "delegateSource", "N0", "()Lkotlin/reflect/jvm/internal/x$a;", "getter", "Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class x<T, V> extends z<V> implements KProperty1<T, V> {

    /* renamed from: A, reason: from kotlin metadata */
    @d5.d
    private final g0.b<a<T, V>> _getter;

    /* renamed from: B, reason: from kotlin metadata */
    @d5.d
    private final Lazy<Member> delegateSource;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/x$a;", "T", "V", "Lkotlin/reflect/jvm/internal/z$c;", "Lkotlin/reflect/q$b;", "receiver", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/x;", "v", "Lkotlin/reflect/jvm/internal/x;", "I0", "()Lkotlin/reflect/jvm/internal/x;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/x;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a<T, V> extends z.c<V> implements KProperty1.b<T, V> {

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final x<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d x<T, ? extends V> xVar) {
            kotlin.jvm.internal.l0.p(xVar, ProtectedSandApp.s("誴"));
            this.property = xVar;
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        public z G0() {
            return this.property;
        }

        @d5.d
        public x<T, V> I0() {
            return this.property;
        }

        @Override // q3.l
        public V N(T receiver) {
            return this.property.get(receiver);
        }

        @Override // kotlin.reflect.KProperty.a
        public KProperty s0() {
            return this.property;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/x$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/x$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a<T, ? extends V>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ x<T, V> f26836p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(x<T, ? extends V> xVar) {
            super(0);
            this.f26836p = xVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<T, V> n() {
            return new a<>(this.f26836p);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements q3.a<Member> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ x<T, V> f26837p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(x<T, ? extends V> xVar) {
            super(0);
            this.f26837p = xVar;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Member n() {
            return this.f26837p.G0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@d5.d p pVar, @d5.d String str, @d5.d String str2, @d5.e Object obj) {
        super(pVar, str, str2, obj);
        Lazy<Member> b6;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("該"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("詳"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("詴"));
        g0.b<a<T, V>> b7 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("詵"));
        this._getter = b7;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(this));
        this.delegateSource = b6;
    }

    @Override // kotlin.reflect.KProperty1
    @d5.e
    public Object D(T receiver) {
        return I0(this.delegateSource.getValue(), receiver, null);
    }

    @Override // q3.l
    public V N(T receiver) {
        return get(receiver);
    }

    @Override // kotlin.reflect.KProperty
    @d5.d
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public a<T, V> e() {
        a<T, V> n5 = this._getter.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("詹"));
        return n5;
    }

    @Override // kotlin.reflect.KProperty1
    public V get(T receiver) {
        return e().C(receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@d5.d p pVar, @d5.d u0 u0Var) {
        super(pVar, u0Var);
        Lazy<Member> b6;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詶"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("詷"));
        g0.b<a<T, V>> b7 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("詸"));
        this._getter = b7;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(this));
        this.delegateSource = b6;
    }
}
