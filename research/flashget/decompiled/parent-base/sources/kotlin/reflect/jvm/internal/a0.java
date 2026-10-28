package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.r;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\"B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0013R,\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/a0;", "D", "E", "V", "Lkotlin/reflect/r;", "Lkotlin/reflect/jvm/internal/b0;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "L", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "d0", "invoke", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/a0$a;", "p", "Lkotlin/b0;", "_getter", "Ljava/lang/reflect/Member;", "q", "delegateSource", "B0", "()Lkotlin/reflect/jvm/internal/a0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class a0<D, E, V> extends b0<V> implements kotlin.reflect.r<D, E, V> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<a<D, E, V>> _getter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<Member> delegateSource;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/a0$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/b0$c;", "Lkotlin/reflect/r$b;", "Lkotlin/reflect/jvm/internal/a0;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/a0;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/a0;", "w0", "()Lkotlin/reflect/jvm/internal/a0;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<D, E, V> extends b0.c<V> implements r.b<D, E, V> {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a0<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l a0<D, E, ? extends V> a0Var) {
            kotlin.jvm.internal.l0.p(a0Var, ProtectedSandApp.s("晷\u0001"));
            this.property = a0Var;
        }

        @Override // ld.p
        public V invoke(D receiver1, E receiver2) {
            return this.property.L(receiver1, receiver2);
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
        public a0<D, E, V> w0() {
            return this.property;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Lkotlin/reflect/jvm/internal/a0$a;", "a", "()Lkotlin/reflect/jvm/internal/a0$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<a<D, E, ? extends V>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<D, E, V> f75546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(a0<D, E, ? extends V> a0Var) {
            super(0);
            this.f75546b = a0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<D, E, V> invoke() {
            return new a<>(this.f75546b);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<Member> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<D, E, V> f75547b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a0<D, E, ? extends V> a0Var) {
            super(0);
            this.f75547b = a0Var;
        }

        @fg.m
        public final Member a() {
            return this.f75547b.u0();
        }

        @Override // ld.a
        public Member invoke() {
            return this.f75547b.u0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@fg.l r rVar, @fg.l String str, @fg.l String str2) {
        super(rVar, str, str2, kotlin.jvm.internal.q.NO_RECEIVER);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("暆\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("暇\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("暈\u0001"));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this._getter = kotlin.c0.b(f0Var, new b(this));
        this.delegateSource = kotlin.c0.b(f0Var, new c(this));
    }

    @Override // kotlin.reflect.jvm.internal.b0
    @fg.l
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> y0() {
        return this._getter.getValue();
    }

    @Override // kotlin.reflect.r
    public V L(D receiver1, E receiver2) {
        return y0().call(receiver1, receiver2);
    }

    @Override // kotlin.reflect.r
    @fg.m
    public Object d0(D receiver1, E receiver2) {
        return w0(this.delegateSource.getValue(), receiver1, receiver2);
    }

    @Override // ld.p
    public V invoke(D receiver1, E receiver2) {
        return L(receiver1, receiver2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@fg.l r rVar, @fg.l u0 u0Var) {
        super(rVar, u0Var);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("暆\u0001"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("暉\u0001"));
        kotlin.f0 f0Var = kotlin.f0.PUBLICATION;
        this._getter = kotlin.c0.b(f0Var, new b(this));
        this.delegateSource = kotlin.c0.b(f0Var, new c(this));
    }
}
