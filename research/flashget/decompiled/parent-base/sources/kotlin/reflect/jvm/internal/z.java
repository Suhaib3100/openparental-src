package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.q;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001!B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0013R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/z;", "T", "V", "Lkotlin/reflect/q;", "Lkotlin/reflect/jvm/internal/b0;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "invoke", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/z$a;", "p", "Lkotlin/b0;", "_getter", "Ljava/lang/reflect/Member;", "q", "delegateSource", "B0", "()Lkotlin/reflect/jvm/internal/z$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class z<T, V> extends b0<V> implements kotlin.reflect.q<T, V> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a<T, V>> _getter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<Member> delegateSource;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/z$a;", "T", "V", "Lkotlin/reflect/jvm/internal/b0$c;", "Lkotlin/reflect/q$b;", "Lkotlin/reflect/jvm/internal/z;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/z;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/z;", "w0", "()Lkotlin/reflect/jvm/internal/z;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, V> extends b0.c<V> implements q.b<T, V> {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final z<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l z<T, ? extends V> zVar) {
            kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("芵\u0001"));
            this.property = zVar;
        }

        @Override // ld.l
        public V invoke(T receiver) {
            return this.property.get(receiver);
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
        public z<T, V> w0() {
            return this.property;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/z$a;", "a", "()Lkotlin/reflect/jvm/internal/z$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a<T, ? extends V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z<T, V> f78863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z<T, ? extends V> zVar) {
            super(0);
            this.f78863b = zVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<T, V> invoke() {
            return new a<>(this.f78863b);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Member> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z<T, V> f78864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(z<T, ? extends V> zVar) {
            super(0);
            this.f78864b = zVar;
        }

        @fg.m
        public final Member a() {
            return this.f78864b.u0();
        }

        @Override // ld.a
        public Member invoke() {
            return this.f78864b.u0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@fg.l r rVar, @fg.l String str, @fg.l String str2, @fg.m Object obj) {
        super(rVar, str, str2, obj);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芆\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("芇\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("芈\u0001"));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this._getter = kotlin.c0.b(f0Var, new b(this));
        this.delegateSource = kotlin.c0.b(f0Var, new c(this));
    }

    @Override // kotlin.reflect.jvm.internal.b0
    @fg.l
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public a<T, V> y0() {
        return this._getter.getValue();
    }

    @Override // kotlin.reflect.q
    @fg.m
    public Object g(T receiver) {
        return w0(this.delegateSource.getValue(), receiver, null);
    }

    @Override // kotlin.reflect.q
    public V get(T receiver) {
        return y0().call(receiver);
    }

    @Override // ld.l
    public V invoke(T receiver) {
        return get(receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@fg.l r rVar, @fg.l u0 u0Var) {
        super(rVar, u0Var);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("芆\u0001"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("芉\u0001"));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this._getter = kotlin.c0.b(f0Var, new b(this));
        this.delegateSource = kotlin.c0.b(f0Var, new c(this));
    }
}
